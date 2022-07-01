import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test06001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06001");
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
        int int41 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource42 = null;
        hikariConfig0.dataSource = dataSource42;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(dataSource30);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
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
        long long18 = hikariConfig0.getIdleTimeout();
        long long19 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-16");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        long long11 = hikariConfig0.acquireRetryDelay;
        java.lang.String str12 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(5000L);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer15;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
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
        boolean boolean23 = hikariConfig0.isInitializationFailFast();
        java.lang.Class<?> wildcardClass24 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMaximumPoolSize((int) (byte) 0);
        hikariConfig0.setIdleTimeout((long) (byte) 100);
        hikariConfig0.setConnectionTimeout(100L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-2418");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-2418' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.transactionIsolationName = "HikariPool-66";
        hikariConfig0.setReadOnly(false);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.connectionTimeout;
        java.util.Properties properties8 = hikariConfig0.dataSourceProperties;
        hikariConfig0.maxLifetime = 0;
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        long long12 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.isRegisterMbeans = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
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
        hikariConfig0.setLeakDetectionThreshold(3L);
        hikariConfig0.setMinimumPoolSize(60);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        long long6 = hikariConfig0.maxLifetime;
        hikariConfig0.catalog = "HikariPool-2094";
        hikariConfig0.setCatalog("HikariPool-1045");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
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
        hikariConfig0.connectionTimeout = (byte) 10;
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.maxPoolSize = 52;
        hikariConfig0.isIsolateInternalQueries = false;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-15678" + "'", str3, "HikariPool-15678");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-48" + "'", str27, "HikariPool-48");
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        boolean boolean12 = hikariConfig0.isReadOnly();
        java.lang.String str13 = hikariConfig0.getPoolName();
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setAcquireRetries((int) (short) 10);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-15682" + "'", str13, "HikariPool-15682");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
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
        hikariConfig0.connectionTestQuery = "HikariPool-955";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-346");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-346 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-29");
        hikariConfig0.leakDetectionThreshold = 32;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.lang.String str5 = hikariConfig0.poolName;
        long long6 = hikariConfig0.getMaxLifetime();
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setMinimumPoolSize((int) 'a');
        int int13 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-15703" + "'", str5, "HikariPool-15703");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-16");
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.isJdbc4connectionTest = false;
        java.lang.String str12 = hikariConfig0.getCatalog();
        hikariConfig0.transactionIsolationName = "HikariPool-13764";
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
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
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.minPoolSize = (short) 10;
        hikariConfig0.setIdleTimeout((long) 10);
        boolean boolean22 = hikariConfig0.isReadOnly();
        hikariConfig0.isInitializationFailFast = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
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
        hikariConfig0.setReadOnly(true);
        hikariConfig0.acquireRetries = 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig0.isAutoCommit();
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.poolName = "HikariPool-11169";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.acquireRetries;
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireRetries((int) (byte) 0);
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
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
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig0.connectionCustomizer;
        java.lang.String str17 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setCatalog("HikariPool-208");
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-161";
        int int24 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setConnectionTestQuery("HikariPool-322");
        hikariConfig0.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str20 = hikariConfig19.getConnectionInitSql();
        long long21 = hikariConfig19.getLeakDetectionThreshold();
        int int22 = hikariConfig19.getMaximumPoolSize();
        long long23 = hikariConfig19.getConnectionTimeout();
        java.util.Properties properties24 = hikariConfig19.getDataSourceProperties();
        java.lang.String str25 = hikariConfig19.getConnectionInitSql();
        hikariConfig19.setPoolName("HikariPool-208");
        hikariConfig0.addDataSourceProperty("HikariPool-6718", (java.lang.Object) hikariConfig19);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        java.lang.String str3 = hikariConfig0.getPoolName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.maxPoolSize;
        long long6 = hikariConfig0.maxLifetime;
        int int7 = hikariConfig0.minPoolSize;
        hikariConfig0.setAutoCommit(true);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-15728" + "'", str3, "HikariPool-15728");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        long long13 = hikariConfig0.connectionTimeout;
        hikariConfig0.transactionIsolation = (short) 0;
        long long16 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-208" + "'", str12, "HikariPool-208");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-604");
        java.lang.String str4 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setCatalog("HikariPool-193");
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
        long long25 = hikariConfig12.getIdleTimeout();
        hikariConfig12.connectionTestQuery = "HikariPool-47";
        java.util.Properties properties28 = null;
        hikariConfig12.dataSourceProperties = properties28;
        long long30 = hikariConfig12.getIdleTimeout();
        hikariConfig12.setMinimumPoolSize(10);
        hikariConfig0.addDataSourceProperty("HikariPool-7534", (java.lang.Object) hikariConfig12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = 35;
        java.util.Properties properties12 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setTransactionIsolation("HikariPool-155");
        java.lang.String str16 = hikariConfig13.getJdbcUrl();
        hikariConfig13.setIdleTimeout(750L);
        boolean boolean19 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.maxPoolSize = 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.jdbcUrl = "HikariPool-29";
        hikariConfig0.setAutoCommit(false);
        java.lang.String str14 = hikariConfig0.dataSourceClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
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
        hikariConfig0.setUseInstrumentation(false);
        int int21 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setMaximumPoolSize((int) (short) 0);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-15060");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-15060 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.setJdbcUrl("HikariPool-38");
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
        hikariConfig0.connectionTimeout = 10L;
        javax.sql.DataSource dataSource28 = null;
        hikariConfig0.dataSource = dataSource28;
        hikariConfig0.transactionIsolationName = "HikariPool-1698";
        hikariConfig0.setAutoCommit(false);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str36 = hikariConfig35.getConnectionInitSql();
        long long37 = hikariConfig35.getLeakDetectionThreshold();
        hikariConfig35.leakDetectionThreshold = (-1);
        long long40 = hikariConfig35.acquireRetryDelay;
        hikariConfig35.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig35.transactionIsolation = 'a';
        hikariConfig35.setIdleTimeout(750L);
        hikariConfig35.setJdbcUrl("HikariPool-234");
        int int49 = hikariConfig35.maxPoolSize;
        hikariConfig35.isReadOnly = false;
        long long52 = hikariConfig35.leakDetectionThreshold;
        hikariConfig0.addDataSourceProperty("HikariPool-5832", (java.lang.Object) long52);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 60 + "'", int49 == 60);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
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
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str16 = hikariConfig0.connectionCustomizerClassName;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setMaxLifetime((long) (short) 10);
        java.lang.String str20 = hikariConfig17.getPoolName();
        hikariConfig17.jdbcUrl = "";
        hikariConfig17.setMaxLifetime(0L);
        hikariConfig17.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig27.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource31 = hikariConfig30.getDataSource();
        hikariConfig30.setConnectionTestQuery("");
        hikariConfig30.setInitializationFailFast(false);
        long long36 = hikariConfig30.getConnectionTimeout();
        java.util.Properties properties37 = hikariConfig30.dataSourceProperties;
        hikariConfig27.dataSourceProperties = properties37;
        hikariConfig17.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        long long41 = hikariConfig40.acquireRetryDelay;
        java.util.Properties properties42 = hikariConfig40.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties42);
        hikariConfig0.transactionIsolation = 35;
        boolean boolean46 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setAcquireRetries(10);
        hikariConfig0.setLeakDetectionThreshold((long) 97);
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setPoolName("HikariPool-484");
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-15753" + "'", str20, "HikariPool-15753");
        org.junit.Assert.assertNull(dataSource31);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertNotNull(properties37);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
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
        long long17 = hikariConfig0.maxLifetime;
        hikariConfig0.transactionIsolationName = "";
        hikariConfig0.setCatalog("HikariPool-7272");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        java.lang.String str2 = hikariConfig0.poolName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str8 = hikariConfig7.getConnectionInitSql();
        long long9 = hikariConfig7.getLeakDetectionThreshold();
        hikariConfig7.leakDetectionThreshold = (-1);
        long long12 = hikariConfig7.acquireRetryDelay;
        long long13 = hikariConfig7.getIdleTimeout();
        hikariConfig7.acquireIncrement = '4';
        javax.sql.DataSource dataSource16 = hikariConfig7.getDataSource();
        hikariConfig7.acquireRetries = 35;
        java.util.Properties properties19 = hikariConfig7.dataSourceProperties;
        hikariConfig7.isJdbc4connectionTest = false;
        boolean boolean22 = hikariConfig7.isIsolateInternalQueries;
        java.util.Properties properties23 = hikariConfig7.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-15758" + "'", str2, "HikariPool-15758");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        hikariConfig0.maxPoolSize = (short) 100;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries;
        int int10 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        hikariConfig0.isRegisterMbeans = false;
        int int10 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str11 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setTransactionIsolation("");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.connectionInitSql = "HikariPool-9156";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
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
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.transactionIsolationName;
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.dataSourceClassName = "HikariPool-25";
        hikariConfig0.maxPoolSize = 3;
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.acquireIncrement = (short) 100;
        int int14 = hikariConfig0.acquireIncrement;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
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
        boolean boolean16 = hikariConfig0.isReadOnly();
        int int17 = hikariConfig0.getTransactionIsolation();
        java.lang.String str18 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-38" + "'", str18, "HikariPool-38");
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
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
        hikariConfig0.minPoolSize = (-1);
        hikariConfig0.acquireRetryDelay = 2147483647L;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        java.lang.String str13 = hikariConfig10.getPoolName();
        hikariConfig10.jdbcUrl = "";
        hikariConfig10.setMaxLifetime(0L);
        hikariConfig10.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig20.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.setInitializationFailFast(false);
        long long29 = hikariConfig23.getConnectionTimeout();
        java.util.Properties properties30 = hikariConfig23.dataSourceProperties;
        hikariConfig20.dataSourceProperties = properties30;
        hikariConfig10.setDataSourceProperties(properties30);
        hikariConfig0.setDataSourceProperties(properties30);
        java.lang.String str34 = hikariConfig0.getDataSourceClassName();
        int int35 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-15787" + "'", str13, "HikariPool-15787");
        org.junit.Assert.assertNull(dataSource24);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
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
        hikariConfig0.connectionTimeout = (byte) 10;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig18.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig18.connectionCustomizer;
        hikariConfig18.setDataSourceClassName("HikariPool-47");
        hikariConfig18.setDataSourceClassName("HikariPool-18");
        long long26 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.isInitializationFailFast = true;
        javax.sql.DataSource dataSource29 = null;
        hikariConfig18.setDataSource(dataSource29);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str32 = hikariConfig31.getConnectionInitSql();
        hikariConfig31.setMaxLifetime(35L);
        hikariConfig31.setAutoCommit(false);
        hikariConfig31.transactionIsolationName = "hi!";
        hikariConfig31.connectionTestQuery = "HikariPool-184";
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource42 = hikariConfig41.getDataSource();
        hikariConfig41.setConnectionTestQuery("");
        hikariConfig41.connectionCustomizerClassName = "";
        hikariConfig41.setConnectionCustomizerClassName("hi!");
        java.lang.String str49 = hikariConfig41.getCatalog();
        boolean boolean50 = hikariConfig41.isRegisterMbeans;
        hikariConfig41.setAcquireRetries(0);
        hikariConfig41.setMaximumPoolSize((int) '#');
        hikariConfig41.setTransactionIsolation("hi!");
        hikariConfig41.setConnectionInitSql("hi!");
        hikariConfig41.setCatalog("HikariPool-38");
        hikariConfig41.isIsolateInternalQueries = false;
        hikariConfig41.acquireIncrement = 'a';
        java.util.Properties properties65 = hikariConfig41.getDataSourceProperties();
        hikariConfig31.setDataSourceProperties(properties65);
        hikariConfig18.setDataSourceProperties(properties65);
        hikariConfig0.dataSourceProperties = properties65;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(properties65);
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean8 = hikariConfig0.isAutoCommit();
        int int9 = hikariConfig0.acquireIncrement;
        hikariConfig0.maxLifetime = '4';
        java.lang.String str12 = hikariConfig0.connectionInitSql;
        hikariConfig0.acquireIncrement = 'a';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
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
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource21 = hikariConfig20.getDataSource();
        hikariConfig20.setConnectionTestQuery("");
        hikariConfig20.connectionCustomizerClassName = "";
        hikariConfig20.setConnectionCustomizerClassName("hi!");
        java.lang.String str28 = hikariConfig20.getCatalog();
        java.util.Properties properties29 = hikariConfig20.dataSourceProperties;
        hikariConfig20.acquireRetryDelay = 35;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource33 = hikariConfig32.getDataSource();
        hikariConfig32.setConnectionTestQuery("");
        hikariConfig32.connectionCustomizerClassName = "";
        hikariConfig32.setConnectionCustomizerClassName("hi!");
        java.lang.String str40 = hikariConfig32.getCatalog();
        boolean boolean41 = hikariConfig32.isRegisterMbeans;
        hikariConfig32.setAcquireRetries(0);
        long long44 = hikariConfig32.getMaxLifetime();
        hikariConfig32.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource48 = hikariConfig47.getDataSource();
        hikariConfig47.setConnectionTestQuery("");
        hikariConfig47.setInitializationFailFast(false);
        hikariConfig47.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource56 = hikariConfig55.getDataSource();
        hikariConfig55.setConnectionTestQuery("");
        hikariConfig55.connectionCustomizerClassName = "";
        hikariConfig55.setConnectionCustomizerClassName("hi!");
        java.lang.String str63 = hikariConfig55.getCatalog();
        java.util.Properties properties64 = hikariConfig55.dataSourceProperties;
        hikariConfig47.dataSourceProperties = properties64;
        hikariConfig32.setDataSourceProperties(properties64);
        hikariConfig20.setDataSourceProperties(properties64);
        hikariConfig20.transactionIsolationName = "HikariPool-97";
        java.lang.String str70 = hikariConfig20.poolName;
        hikariConfig20.setConnectionCustomizerClassName("HikariPool-361");
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource74 = hikariConfig73.getDataSource();
        hikariConfig73.setConnectionTestQuery("");
        hikariConfig73.setInitializationFailFast(false);
        hikariConfig73.catalog = "";
        javax.sql.DataSource dataSource81 = null;
        hikariConfig73.dataSource = dataSource81;
        javax.sql.DataSource dataSource83 = null;
        hikariConfig73.dataSource = dataSource83;
        int int85 = hikariConfig73.maxPoolSize;
        long long86 = hikariConfig73.getIdleTimeout();
        javax.sql.DataSource dataSource87 = hikariConfig73.dataSource;
        hikariConfig73.setDataSourceClassName("HikariPool-122");
        java.util.Properties properties90 = hikariConfig73.dataSourceProperties;
        hikariConfig20.setDataSourceProperties(properties90);
        hikariConfig0.dataSourceProperties = properties90;
        long long93 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.transactionIsolation = (byte) 0;
        javax.sql.DataSource dataSource96 = null;
        hikariConfig0.dataSource = dataSource96;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 32L + "'", long44 == 32L);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertNull(dataSource56);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(properties64);
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "HikariPool-15804" + "'", str70, "HikariPool-15804");
        org.junit.Assert.assertNull(dataSource74);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 60 + "'", int85 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-1L) + "'", long86 == (-1L));
        org.junit.Assert.assertNull(dataSource87);
        org.junit.Assert.assertNotNull(properties90);
// flaky:         org.junit.Assert.assertTrue("'" + long93 + "' != '" + 32L + "'", long93 == 32L);
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.transactionIsolationName = "HikariPool-66";
        hikariConfig0.setReadOnly(false);
        hikariConfig0.acquireRetryDelay = (-1);
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str17 = hikariConfig0.dataSourceClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
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
        hikariConfig0.leakDetectionThreshold = 10;
        hikariConfig0.setAutoCommit(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
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
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource26 = hikariConfig25.getDataSource();
        hikariConfig25.setConnectionTestQuery("");
        java.lang.String str29 = hikariConfig25.catalog;
        java.util.Properties properties30 = hikariConfig25.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties30;
        hikariConfig0.setMaximumPoolSize(97);
        boolean boolean34 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean35 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean36 = hikariConfig0.isReadOnly();
        hikariConfig0.transactionIsolationName = "HikariPool-2701";
        boolean boolean39 = hikariConfig0.isReadOnly();
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
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.setPoolName("HikariPool-184");
        hikariConfig0.transactionIsolation = 0;
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("HikariPool-613");
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.setDataSource(dataSource17);
        hikariConfig0.setJdbcUrl("HikariPool-427");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        java.util.Properties properties10 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setInitializationFailFast(false);
        int int14 = hikariConfig11.maxPoolSize;
        hikariConfig11.setConnectionTestQuery("HikariPool-790");
        int int17 = hikariConfig11.getMinimumPoolSize();
        java.lang.String str18 = hikariConfig11.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
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
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig0.connectionCustomizer;
        java.lang.String str17 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setCatalog("HikariPool-208");
        boolean boolean20 = hikariConfig0.isReadOnly;
        long long21 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
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
        java.lang.String str14 = hikariConfig0.dataSourceClassName;
        java.lang.String str15 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
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
        long long24 = hikariConfig0.leakDetectionThreshold;
        boolean boolean25 = hikariConfig0.isReadOnly;
        java.lang.String str26 = hikariConfig0.getDataSourceClassName();
        int int27 = hikariConfig0.minPoolSize;
        hikariConfig0.isJdbc4connectionTest = false;
        java.lang.String str30 = hikariConfig0.poolName;
        long long31 = hikariConfig0.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource33 = hikariConfig32.getDataSource();
        hikariConfig32.setConnectionTestQuery("");
        hikariConfig32.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer38 = hikariConfig32.connectionCustomizer;
        hikariConfig32.acquireRetries = (byte) 100;
        hikariConfig32.leakDetectionThreshold = 0L;
        int int43 = hikariConfig32.transactionIsolation;
        boolean boolean44 = hikariConfig32.isAutoCommit();
        java.util.Properties properties45 = hikariConfig32.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties45;
        javax.sql.DataSource dataSource47 = null;
        hikariConfig0.dataSource = dataSource47;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-15829" + "'", str3, "HikariPool-15829");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-15829" + "'", str30, "HikariPool-15829");
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(iConnectionCustomizer38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
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
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        java.lang.String str15 = hikariConfig0.getPoolName();
        hikariConfig0.catalog = "HikariPool-152";
        int int18 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setCatalog("HikariPool-453");
        hikariConfig0.setTransactionIsolation("HikariPool-217");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-15835" + "'", str15, "HikariPool-15835");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = 35;
        java.util.Properties properties12 = hikariConfig0.dataSourceProperties;
        hikariConfig0.isJdbc4connectionTest = false;
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries;
        java.util.Properties properties16 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setMinimumPoolSize(35);
        java.lang.String str20 = hikariConfig17.getConnectionCustomizerClassName();
        long long21 = hikariConfig17.getIdleTimeout();
        hikariConfig17.setReadOnly(true);
        hikariConfig17.maxLifetime = (-1L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.transactionIsolationName = "hi!";
        java.lang.String str8 = hikariConfig0.connectionCustomizerClassName;
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        java.lang.String str10 = hikariConfig0.jdbcUrl;
        hikariConfig0.connectionTimeout = 5000L;
        long long13 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setCatalog("HikariPool-135");
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig0.connectionTestQuery;
        hikariConfig0.isRegisterMbeans = true;
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.leakDetectionThreshold = 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int5 = hikariConfig0.acquireRetries;
        java.lang.String str6 = hikariConfig0.catalog;
        hikariConfig0.setDataSourceClassName("HikariPool-73");
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.maxPoolSize = 35;
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        int int8 = hikariConfig0.getAcquireRetries();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        long long10 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str12 = hikariConfig0.catalog;
        hikariConfig0.setConnectionInitSql("HikariPool-603");
        long long15 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setJdbcUrl("HikariPool-131");
        long long18 = hikariConfig0.connectionTimeout;
        long long19 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.connectionTimeout;
        hikariConfig0.setMaxLifetime((long) 1);
        hikariConfig0.setMinimumPoolSize((int) '4');
        long long10 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.poolName = "HikariPool-73";
        long long11 = hikariConfig0.connectionTimeout;
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) 97);
        hikariConfig0.setRegisterMbeans(false);
        long long17 = hikariConfig0.maxLifetime;
        hikariConfig0.idleTimeout = 35L;
        hikariConfig0.setConnectionTestQuery("HikariPool-4621");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        hikariConfig0.acquireIncrement = (short) 100;
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.idleTimeout = (short) -1;
        hikariConfig0.setReadOnly(true);
        hikariConfig0.maxPoolSize = 35;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
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
        long long25 = hikariConfig0.leakDetectionThreshold;
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
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-145");
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
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
        hikariConfig0.setTransactionIsolation("HikariPool-1959");
        hikariConfig0.setConnectionInitSql("HikariPool-5652");
        java.util.Properties properties23 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDataSourceProperties(properties23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
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
        java.lang.String str31 = hikariConfig0.getCatalog();
        hikariConfig0.maxLifetime = 5000L;
        boolean boolean34 = hikariConfig0.isAutoCommit();
        java.lang.String str35 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
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
        int int28 = hikariConfig0.acquireRetries;
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
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
        int int15 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay(97L);
        hikariConfig0.isAutoCommit = true;
        int int20 = hikariConfig0.acquireRetries;
        java.lang.String str21 = hikariConfig0.jdbcUrl;
        hikariConfig0.connectionInitSql = "HikariPool-1155";
        hikariConfig0.connectionTimeout = 3L;
        hikariConfig0.maxPoolSize = '#';
        hikariConfig0.idleTimeout = 97;
        hikariConfig0.setPoolName("HikariPool-584");
        hikariConfig0.acquireIncrement = ' ';
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-130");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-130 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
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
        javax.sql.DataSource dataSource31 = null;
        hikariConfig0.dataSource = dataSource31;
        java.lang.String str33 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setDataSourceClassName("HikariPool-8912");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-86");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-15894" + "'", str3, "HikariPool-15894");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.acquireRetries = (short) 0;
        java.lang.String str9 = hikariConfig0.connectionInitSql;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
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
        hikariConfig0.catalog = "HikariPool-65";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer15;
        javax.sql.DataSource dataSource17 = hikariConfig0.dataSource;
        boolean boolean18 = hikariConfig0.isReadOnly;
        hikariConfig0.setIdleTimeout((long) 0);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
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
        hikariConfig0.leakDetectionThreshold = ' ';
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
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "HikariPool-15900" + "'", str50, "HikariPool-15900");
        org.junit.Assert.assertNull(dataSource53);
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(true);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str7 = hikariConfig0.transactionIsolationName;
        long long8 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
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
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource26 = hikariConfig25.getDataSource();
        hikariConfig25.setConnectionTestQuery("");
        java.lang.String str29 = hikariConfig25.catalog;
        java.util.Properties properties30 = hikariConfig25.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties30;
        hikariConfig0.setMaximumPoolSize(97);
        boolean boolean34 = hikariConfig0.isReadOnly();
        long long35 = hikariConfig0.getIdleTimeout();
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
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
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
        long long20 = hikariConfig0.getIdleTimeout();
        long long21 = hikariConfig0.maxLifetime;
        hikariConfig0.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
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
        hikariConfig0.catalog = "HikariPool-65";
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str16 = hikariConfig0.transactionIsolationName;
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.isReadOnly = true;
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        hikariConfig0.isReadOnly = true;
        hikariConfig0.setRegisterMbeans(false);
        long long18 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.minPoolSize = 32;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.minPoolSize = (byte) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
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
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.isReadOnly = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        int int4 = hikariConfig0.getTransactionIsolation();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        java.lang.String str6 = hikariConfig0.connectionCustomizerClassName;
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        int int8 = hikariConfig0.getAcquireIncrement();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig3.setMaxLifetime((long) (short) 10);
        java.lang.String str6 = hikariConfig3.getPoolName();
        hikariConfig3.jdbcUrl = "";
        hikariConfig3.setMaxLifetime(0L);
        hikariConfig3.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.setInitializationFailFast(false);
        long long22 = hikariConfig16.getConnectionTimeout();
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig13.dataSourceProperties = properties23;
        hikariConfig3.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        hikariConfig0.connectionTestQuery = "HikariPool-7846";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-15931" + "'", str6, "HikariPool-15931");
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
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
        java.util.Properties properties24 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.acquireRetryDelay = (-1L);
        boolean boolean27 = hikariConfig0.isReadOnly;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-15835");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-16");
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.acquireIncrement = 100;
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        int int13 = hikariConfig0.acquireIncrement;
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str12 = hikariConfig0.catalog;
        hikariConfig0.setConnectionInitSql("HikariPool-603");
        long long15 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setJdbcUrl("HikariPool-131");
        long long18 = hikariConfig0.connectionTimeout;
        boolean boolean19 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setPoolName("HikariPool-1887");
        hikariConfig0.acquireRetryDelay = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
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
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
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
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int31 = hikariConfig0.getAcquireIncrement();
        java.lang.String str32 = hikariConfig0.jdbcUrl;
        long long33 = hikariConfig0.getAcquireRetryDelay();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-15945" + "'", str3, "HikariPool-15945");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        hikariConfig0.setIsolateInternalQueries(true);
        int int9 = hikariConfig0.transactionIsolation;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-13942");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.poolName = "HikariPool-73";
        java.lang.String str11 = hikariConfig0.poolName;
        hikariConfig0.setCatalog("HikariPool-1289");
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        java.lang.String str15 = hikariConfig0.jdbcUrl;
        hikariConfig0.setMinimumPoolSize(10);
        java.lang.String str18 = hikariConfig0.poolName;
        java.lang.String str19 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-73" + "'", str11, "HikariPool-73");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-73" + "'", str18, "HikariPool-73");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.maxPoolSize = 35;
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        int int8 = hikariConfig0.getAcquireRetries();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.acquireRetryDelay = 52L;
        java.lang.String str12 = hikariConfig0.connectionTestQuery;
        long long13 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.setAcquireRetryDelay((long) 100);
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.util.Properties properties6 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setUseInstrumentation(false);
        int int9 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
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
        int int30 = hikariConfig0.getTransactionIsolation();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        hikariConfig0.connectionTimeout = 'a';
        hikariConfig0.minPoolSize = (byte) -1;
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.idleTimeout = 1;
        javax.sql.DataSource dataSource17 = hikariConfig0.dataSource;
        javax.sql.DataSource dataSource18 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        java.util.Properties properties13 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setPoolName("HikariPool-239");
        int int17 = hikariConfig14.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
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
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.connectionInitSql = "hi!";
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
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        int int10 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) 10);
        long long13 = hikariConfig0.getMaxLifetime();
        int int14 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.getCatalog();
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        int int11 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
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
        long long18 = hikariConfig0.maxLifetime;
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        hikariConfig0.acquireIncrement = 97;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
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
        java.lang.String str37 = hikariConfig0.jdbcUrl;
        java.lang.String str38 = hikariConfig0.getConnectionCustomizerClassName();
        int int39 = hikariConfig0.getTransactionIsolation();
        java.lang.String str40 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) 'a');
        hikariConfig0.setLeakDetectionThreshold(97L);
        hikariConfig0.isInitializationFailFast = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-15985" + "'", str40, "HikariPool-15985");
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-1314");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1314' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setMinimumPoolSize(60);
        hikariConfig0.connectionTimeout = 5000L;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        long long12 = hikariConfig10.getLeakDetectionThreshold();
        int int13 = hikariConfig10.getMaximumPoolSize();
        long long14 = hikariConfig10.leakDetectionThreshold;
        hikariConfig10.catalog = "HikariPool-62";
        boolean boolean17 = hikariConfig10.isJdbc4connectionTest;
        int int18 = hikariConfig10.acquireRetries;
        hikariConfig10.poolName = "HikariPool-428";
        long long21 = hikariConfig10.getConnectionTimeout();
        hikariConfig0.addDataSourceProperty("HikariPool-221", (java.lang.Object) long21);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = hikariConfig0.connectionCustomizer;
        boolean boolean24 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig0.connectionCustomizer;
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        java.lang.String str9 = hikariConfig0.poolName;
        long long10 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-15990" + "'", str6, "HikariPool-15990");
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-15990" + "'", str9, "HikariPool-15990");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
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
        int int56 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setJdbcUrl("HikariPool-353");
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str60 = hikariConfig59.getConnectionInitSql();
        long long61 = hikariConfig59.getLeakDetectionThreshold();
        int int62 = hikariConfig59.getMaximumPoolSize();
        java.util.Properties properties63 = hikariConfig59.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties63);
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
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "HikariPool-15996" + "'", str50, "HikariPool-15996");
        org.junit.Assert.assertNull(dataSource53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 60 + "'", int62 == 60);
        org.junit.Assert.assertNotNull(properties63);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setDataSourceClassName("HikariPool-38");
        hikariConfig0.setConnectionTestQuery("");
        java.lang.Class<?> wildcardClass13 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
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
        hikariConfig26.transactionIsolation = (byte) 100;
        java.lang.String str29 = hikariConfig26.connectionTestQuery;
        boolean boolean30 = hikariConfig26.isIsolateInternalQueries;
        hikariConfig26.setAutoCommit(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
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
        hikariConfig26.transactionIsolation = (byte) 100;
        java.lang.String str29 = hikariConfig26.connectionTestQuery;
        hikariConfig26.transactionIsolation = ' ';
        hikariConfig26.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
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
        boolean boolean17 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setPoolName("HikariPool-13803");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
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
        java.lang.String str28 = hikariConfig26.poolName;
        java.lang.String str29 = hikariConfig26.catalog;
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
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-16019" + "'", str28, "HikariPool-16019");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.dataSourceClassName = "HikariPool-25";
        hikariConfig0.maxPoolSize = 3;
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.acquireIncrement = (short) 100;
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        long long10 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        java.lang.String str12 = hikariConfig0.catalog;
        int int13 = hikariConfig0.getAcquireIncrement();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-16022" + "'", str3, "HikariPool-16022");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.connectionTimeout = 0L;
        hikariConfig0.leakDetectionThreshold = 750L;
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.isJdbc4connectionTest = true;
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
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
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        hikariConfig0.jdbcUrl = "HikariPool-1303";
        hikariConfig0.setAcquireRetries(52);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
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
        java.lang.String str27 = hikariConfig0.dataSourceClassName;
        hikariConfig0.maxLifetime = 3;
        java.lang.String str30 = hikariConfig0.getDataSourceClassName();
        boolean boolean31 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.acquireRetryDelay = (short) 0;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-16032" + "'", str3, "HikariPool-16032");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.poolName = "HikariPool-55";
        int int15 = hikariConfig0.transactionIsolation;
        java.lang.String str16 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = (short) 10;
        int int11 = hikariConfig0.getAcquireIncrement();
        int int12 = hikariConfig0.minPoolSize;
        boolean boolean13 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
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
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.acquireRetryDelay = (short) 0;
        java.lang.String str8 = hikariConfig0.connectionCustomizerClassName;
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        boolean boolean10 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.transactionIsolation = (byte) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
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
        int int13 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.leakDetectionThreshold = 0L;
        long long16 = hikariConfig0.getConnectionTimeout();
        boolean boolean17 = hikariConfig0.isAutoCommit();
        boolean boolean18 = hikariConfig0.isJdbc4connectionTest;
        long long19 = hikariConfig0.idleTimeout;
        long long20 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.setIdleTimeout(100L);
        long long10 = hikariConfig0.idleTimeout;
        hikariConfig0.dataSourceClassName = "HikariPool-16";
        java.lang.String str13 = hikariConfig0.poolName;
        hikariConfig0.setConnectionTestQuery("HikariPool-303");
        java.lang.String str16 = hikariConfig0.getCatalog();
        hikariConfig0.setPoolName("HikariPool-11583");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-16049" + "'", str13, "HikariPool-16049");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.poolName = "HikariPool-219";
        hikariConfig0.poolName = "HikariPool-849";
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.acquireRetries;
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.acquireRetryDelay = 100;
        hikariConfig0.poolName = "HikariPool-152";
        int int14 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.dataSourceClassName = "HikariPool-149";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-11549");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-11549 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        boolean boolean8 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.isJdbc4connectionTest = false;
        java.lang.String str11 = hikariConfig0.connectionTestQuery;
        java.lang.String str12 = hikariConfig0.connectionInitSql;
        long long13 = hikariConfig0.getMaxLifetime();
        java.lang.String str14 = hikariConfig0.connectionInitSql;
        java.lang.String str15 = hikariConfig0.poolName;
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-16057" + "'", str15, "HikariPool-16057");
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
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
        hikariConfig0.acquireRetryDelay = 32L;
        hikariConfig0.isAutoCommit = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        boolean boolean8 = hikariConfig0.isInitializationFailFast;
        long long9 = hikariConfig0.connectionTimeout;
        hikariConfig0.maxPoolSize = (short) 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.acquireRetryDelay = 'a';
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setInitializationFailFast(false);
        java.util.Properties properties16 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.leakDetectionThreshold = 100L;
        hikariConfig0.isRegisterMbeans = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
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
        java.lang.String str66 = hikariConfig0.getConnectionInitSql();
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
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
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
        hikariConfig0.setCatalog("HikariPool-110");
        long long22 = hikariConfig0.connectionTimeout;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.connectionTestQuery = "HikariPool-833";
        java.lang.String str27 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setDataSourceClassName("HikariPool-1141");
        int int30 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-833" + "'", str27, "HikariPool-833");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
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
        long long18 = hikariConfig0.leakDetectionThreshold;
        long long19 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setLeakDetectionThreshold(0L);
        long long22 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
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
        java.lang.String str20 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str8 = hikariConfig0.jdbcUrl;
        boolean boolean9 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
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
        hikariConfig0.poolName = "HikariPool-819";
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig0.connectionCustomizer;
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        hikariConfig0.setAcquireRetryDelay(750L);
        hikariConfig0.setAcquireRetryDelay(750L);
        hikariConfig0.setIdleTimeout(2147483647L);
        boolean boolean11 = hikariConfig0.isRegisterMbeans;
        int int12 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
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
        java.lang.String str26 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.maxLifetime = (short) -1;
        int int29 = hikariConfig0.getMinimumPoolSize();
        boolean boolean30 = hikariConfig0.isAutoCommit();
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
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.connectionTimeout = 52;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-18" + "'", str8, "HikariPool-18");
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
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
        long long11 = hikariConfig0.connectionTimeout;
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.isRegisterMbeans = false;
        java.util.Properties properties15 = hikariConfig0.dataSourceProperties;
        java.lang.String str16 = hikariConfig0.jdbcUrl;
        hikariConfig0.leakDetectionThreshold = 1;
        java.lang.String str19 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
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
        hikariConfig0.setDataSourceClassName("HikariPool-1153");
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        int int16 = hikariConfig0.transactionIsolation;
        hikariConfig0.dataSourceClassName = "HikariPool-781";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTimeout(2147483647L);
        hikariConfig0.setJdbcUrl("HikariPool-2886");
        hikariConfig0.acquireRetries = (byte) -1;
        int int15 = hikariConfig0.maxPoolSize;
        hikariConfig0.setConnectionTestQuery("HikariPool-14851");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.isAutoCommit = true;
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        long long15 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionCustomizerClassName("");
        int int20 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer12;
        hikariConfig0.idleTimeout = '#';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        hikariConfig0.isInitializationFailFast = true;
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        long long11 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6482");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6482 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        int int4 = hikariConfig0.getTransactionIsolation();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.acquireRetryDelay = 1;
        hikariConfig0.setJdbcUrl("HikariPool-110");
        boolean boolean10 = hikariConfig0.isInitializationFailFast;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig0.connectionCustomizer;
        java.lang.String str12 = hikariConfig0.getPoolName();
        long long13 = hikariConfig0.idleTimeout;
        hikariConfig0.setJdbc4ConnectionTest(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-110");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-16100" + "'", str12, "HikariPool-16100");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        hikariConfig0.transactionIsolation = (short) -1;
        java.lang.String str11 = hikariConfig0.jdbcUrl;
        hikariConfig0.catalog = "HikariPool-9020";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        int int8 = hikariConfig0.maxPoolSize;
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        java.lang.String str10 = hikariConfig0.catalog;
        hikariConfig0.setDataSourceClassName("HikariPool-11169");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
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
        hikariConfig0.setAcquireRetries(60);
        long long22 = hikariConfig0.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        int int33 = hikariConfig23.minPoolSize;
        long long34 = hikariConfig23.connectionTimeout;
        hikariConfig23.setUseInstrumentation(false);
        hikariConfig23.setMaximumPoolSize((int) ' ');
        long long39 = hikariConfig23.connectionTimeout;
        java.util.Properties properties40 = hikariConfig23.dataSourceProperties;
        hikariConfig0.setDataSourceProperties(properties40);
        java.lang.String str42 = hikariConfig0.dataSourceClassName;
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
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        int int10 = hikariConfig0.getAcquireRetries();
        boolean boolean11 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
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
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig46.setAcquireRetryDelay(100L);
        java.lang.String str49 = hikariConfig46.getCatalog();
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
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.connectionTimeout = 100L;
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.setJdbcUrl("HikariPool-127");
        java.lang.String str17 = hikariConfig0.getConnectionInitSql();
        java.lang.String str18 = hikariConfig0.poolName;
        hikariConfig0.transactionIsolationName = "HikariPool-1769";
        hikariConfig0.dataSourceClassName = "HikariPool-3932";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-16128" + "'", str18, "HikariPool-16128");
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
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
        boolean boolean42 = hikariConfig0.isAutoCommit();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
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
        long long26 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setCatalog("");
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str30 = hikariConfig29.getConnectionInitSql();
        hikariConfig29.acquireIncrement = 0;
        hikariConfig29.maxLifetime = 100;
        boolean boolean35 = hikariConfig29.isAutoCommit();
        hikariConfig29.isRegisterMbeans = true;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource39 = hikariConfig38.getDataSource();
        hikariConfig38.setConnectionTestQuery("");
        hikariConfig38.connectionCustomizerClassName = "";
        hikariConfig38.setConnectionCustomizerClassName("hi!");
        java.lang.String str46 = hikariConfig38.getCatalog();
        boolean boolean47 = hikariConfig38.isRegisterMbeans;
        long long48 = hikariConfig38.connectionTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource50 = hikariConfig49.getDataSource();
        hikariConfig49.setConnectionTestQuery("");
        hikariConfig49.connectionCustomizerClassName = "";
        hikariConfig49.setConnectionCustomizerClassName("hi!");
        java.lang.String str57 = hikariConfig49.getCatalog();
        java.util.Properties properties58 = hikariConfig49.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str61 = hikariConfig60.getConnectionInitSql();
        long long62 = hikariConfig60.getLeakDetectionThreshold();
        hikariConfig60.leakDetectionThreshold = (-1);
        long long65 = hikariConfig60.acquireRetryDelay;
        boolean boolean66 = hikariConfig60.isRegisterMbeans;
        hikariConfig49.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean66);
        java.util.Properties properties68 = hikariConfig49.getDataSourceProperties();
        hikariConfig49.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties71 = hikariConfig49.getDataSourceProperties();
        hikariConfig38.setDataSourceProperties(properties71);
        hikariConfig29.dataSourceProperties = properties71;
        hikariConfig0.setDataSourceProperties(properties71);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(dataSource39);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 32L + "'", long48 == 32L);
        org.junit.Assert.assertNull(dataSource50);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long65 + "' != '" + 100L + "'", long65 == 100L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(properties68);
        org.junit.Assert.assertNotNull(properties71);
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        long long5 = hikariConfig0.getIdleTimeout();
        java.lang.String str6 = hikariConfig0.dataSourceClassName;
        hikariConfig0.minPoolSize = (byte) 0;
        hikariConfig0.connectionTestQuery = "HikariPool-829";
        hikariConfig0.setIdleTimeout((long) 97);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
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
        int int31 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
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
        hikariConfig0.setReadOnly(false);
        hikariConfig0.acquireRetries = ' ';
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
        java.lang.String str20 = hikariConfig0.poolName;
        hikariConfig0.connectionTestQuery = "HikariPool-5668";
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-16156" + "'", str20, "HikariPool-16156");
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5527");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5527 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
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
        java.lang.String str17 = hikariConfig0.connectionCustomizerClassName;
        long long18 = hikariConfig0.connectionTimeout;
        hikariConfig0.acquireRetries = (byte) 1;
        long long21 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.transactionIsolationName = "hi!";
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("HikariPool-103");
        hikariConfig0.minPoolSize = 100;
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str16 = hikariConfig0.transactionIsolationName;
        java.lang.String str17 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.setPoolName("HikariPool-184");
        hikariConfig0.transactionIsolation = 0;
        hikariConfig0.catalog = "HikariPool-132";
        long long15 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.catalog = "HikariPool-2609";
        boolean boolean18 = hikariConfig0.isInitializationFailFast;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class '' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
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
        int int23 = hikariConfig0.getTransactionIsolation();
        long long24 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.acquireRetries = 60;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
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
        hikariConfig0.minPoolSize = (byte) 1;
        long long26 = hikariConfig0.maxLifetime;
        long long27 = hikariConfig0.getConnectionTimeout();
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
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
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
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-16169" + "'", str14, "HikariPool-16169");
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
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
        hikariConfig0.setIdleTimeout((long) 97);
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setMaxLifetime((long) (short) -1);
        hikariConfig0.connectionTestQuery = "HikariPool-2470";
        int int14 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.catalog = "HikariPool-4680";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
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
        int int23 = hikariConfig0.getTransactionIsolation();
        java.util.Properties properties24 = hikariConfig0.getDataSourceProperties();
        int int25 = hikariConfig0.maxPoolSize;
        java.lang.String str26 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-16178" + "'", str26, "HikariPool-16178");
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-38");
        java.lang.String str9 = hikariConfig0.getCatalog();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setPoolName("HikariPool-203");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
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
        int int45 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) (short) 1);
        javax.sql.DataSource dataSource48 = null;
        hikariConfig0.setDataSource(dataSource48);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setDataSourceClassName("HikariPool-234");
        boolean boolean7 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        int int19 = hikariConfig15.getTransactionIsolation();
        boolean boolean20 = hikariConfig15.isRegisterMbeans();
        hikariConfig15.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig15.setDataSource(dataSource23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str26 = hikariConfig25.getConnectionInitSql();
        long long27 = hikariConfig25.getLeakDetectionThreshold();
        int int28 = hikariConfig25.getMaximumPoolSize();
        long long29 = hikariConfig25.leakDetectionThreshold;
        hikariConfig25.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource34 = hikariConfig33.getDataSource();
        hikariConfig33.setConnectionTestQuery("");
        hikariConfig33.connectionCustomizerClassName = "";
        long long39 = hikariConfig33.getAcquireRetryDelay();
        hikariConfig33.setDataSourceClassName("HikariPool-66");
        hikariConfig33.setInitializationFailFast(false);
        hikariConfig25.addDataSourceProperty("HikariPool-62", (java.lang.Object) hikariConfig33);
        java.util.Properties properties45 = hikariConfig33.dataSourceProperties;
        java.util.Properties properties46 = hikariConfig33.getDataSourceProperties();
        hikariConfig15.setDataSourceProperties(properties46);
        hikariConfig0.dataSourceProperties = properties46;
        long long49 = hikariConfig0.getLeakDetectionThreshold();
        long long50 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(dataSource34);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-1L) + "'", long49 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
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
        hikariConfig7.poolName = "HikariPool-110";
        int int26 = hikariConfig7.maxPoolSize;
        hikariConfig7.acquireIncrement = (short) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
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
        hikariConfig0.setMaximumPoolSize((int) (byte) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        hikariConfig0.connectionTimeout = 'a';
        long long12 = hikariConfig0.getMaxLifetime();
        java.lang.String str13 = hikariConfig0.getCatalog();
        int int14 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setLeakDetectionThreshold(10L);
        hikariConfig0.setAcquireRetries((int) (short) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
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
        hikariConfig7.setLeakDetectionThreshold((long) 10);
        hikariConfig7.setRegisterMbeans(true);
        hikariConfig7.setConnectionInitSql("HikariPool-2627");
        int int30 = hikariConfig7.getAcquireRetries();
        hikariConfig7.setMaxLifetime(100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
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
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        hikariConfig0.setUseInstrumentation(false);
        java.lang.Class<?> wildcardClass19 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
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
        long long25 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.jdbcUrl = "HikariPool-14210";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getCatalog();
        java.lang.String str8 = hikariConfig0.connectionInitSql;
        hikariConfig0.acquireIncrement = (byte) 0;
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.isJdbc4connectionTest = true;
        long long15 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-16221" + "'", str6, "HikariPool-16221");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.Class<?> wildcardClass6 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
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
        hikariConfig0.isReadOnly = false;
        hikariConfig0.connectionTimeout = 35L;
        boolean boolean46 = hikariConfig0.isJdbc4ConnectionTest();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.dataSource = dataSource6;
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        int int7 = hikariConfig0.acquireIncrement;
        int int8 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
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
        hikariConfig0.setConnectionInitSql("HikariPool-2067");
        hikariConfig0.setAcquireRetries(60);
        int int25 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
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
        hikariConfig0.catalog = "HikariPool-65";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer15;
        javax.sql.DataSource dataSource17 = hikariConfig0.dataSource;
        boolean boolean18 = hikariConfig0.isReadOnly;
        long long19 = hikariConfig0.acquireRetryDelay;
        long long20 = hikariConfig0.getIdleTimeout();
        long long21 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.connectionTestQuery = "HikariPool-62";
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionTestQuery("HikariPool-2633");
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.connectionCustomizerClassName = "";
        hikariConfig16.setConnectionCustomizerClassName("hi!");
        java.lang.String str24 = hikariConfig16.getCatalog();
        boolean boolean25 = hikariConfig16.isRegisterMbeans;
        hikariConfig16.setAcquireRetries(0);
        long long28 = hikariConfig16.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig29.setMaxLifetime((long) (short) 10);
        java.lang.String str32 = hikariConfig29.getPoolName();
        hikariConfig29.jdbcUrl = "";
        hikariConfig29.setMaxLifetime(0L);
        hikariConfig29.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig39.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource43 = hikariConfig42.getDataSource();
        hikariConfig42.setConnectionTestQuery("");
        hikariConfig42.setInitializationFailFast(false);
        long long48 = hikariConfig42.getConnectionTimeout();
        java.util.Properties properties49 = hikariConfig42.dataSourceProperties;
        hikariConfig39.dataSourceProperties = properties49;
        hikariConfig29.setDataSourceProperties(properties49);
        java.lang.String str52 = hikariConfig29.getJdbcUrl();
        javax.sql.DataSource dataSource53 = hikariConfig29.dataSource;
        java.util.Properties properties54 = hikariConfig29.dataSourceProperties;
        hikariConfig16.dataSourceProperties = properties54;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties54);
        hikariConfig0.dataSourceProperties = properties54;
        hikariConfig0.isIsolateInternalQueries = false;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-16259" + "'", str32, "HikariPool-16259");
        org.junit.Assert.assertNull(dataSource43);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 32L + "'", long48 == 32L);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(dataSource53);
        org.junit.Assert.assertNotNull(properties54);
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement((int) ' ');
        hikariConfig0.leakDetectionThreshold = 2147483647L;
        hikariConfig0.setMaxLifetime(750L);
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        int int13 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setIdleTimeout((long) (short) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2147483647L + "'", long12 == 2147483647L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
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
        java.lang.String str13 = hikariConfig0.getPoolName();
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        java.lang.String str15 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-16267" + "'", str13, "HikariPool-16267");
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-4162");
        hikariConfig0.setPoolName("HikariPool-2090");
        hikariConfig0.connectionCustomizerClassName = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
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
        hikariConfig0.setMinimumPoolSize(0);
        int int21 = hikariConfig0.transactionIsolation;
        java.lang.String str22 = hikariConfig0.dataSourceClassName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setUseInstrumentation(false);
        long long8 = hikariConfig0.idleTimeout;
        java.lang.String str9 = hikariConfig0.catalog;
        hikariConfig0.acquireIncrement = (short) 0;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setCatalog("");
        java.lang.String str13 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean16 = hikariConfig0.isAutoCommit;
        long long17 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
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
        java.util.Properties properties16 = hikariConfig0.dataSourceProperties;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.setDataSource(dataSource17);
        hikariConfig0.isIsolateInternalQueries = false;
        int int21 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
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
        int int41 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.transactionIsolation = 0;
        hikariConfig0.acquireRetries = 0;
        long long46 = hikariConfig0.acquireRetryDelay;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
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
        hikariConfig21.isReadOnly = true;
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
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1661");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1661 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
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
        boolean boolean23 = hikariConfig0.isAutoCommit;
        long long24 = hikariConfig0.getMaxLifetime();
        int int25 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        int int10 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.minPoolSize = 35;
        long long13 = hikariConfig0.getIdleTimeout();
        int int14 = hikariConfig0.minPoolSize;
        long long15 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold(10L);
        java.lang.String str6 = hikariConfig0.connectionTestQuery;
        hikariConfig0.transactionIsolationName = "";
        hikariConfig0.jdbcUrl = "HikariPool-332";
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str14 = hikariConfig0.poolName;
        int int15 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig0.jdbcUrl;
        long long17 = hikariConfig0.getIdleTimeout();
        java.lang.String str18 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-16294" + "'", str14, "HikariPool-16294");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-332" + "'", str16, "HikariPool-332");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig0.connectionCustomizer;
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        hikariConfig0.acquireIncrement = '#';
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-47" + "'", str13, "HikariPool-47");
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource4 = hikariConfig3.getDataSource();
        hikariConfig3.setConnectionTestQuery("");
        hikariConfig3.setInitializationFailFast(false);
        long long9 = hikariConfig3.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig3.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties10;
        java.lang.String str12 = hikariConfig0.connectionInitSql;
        java.lang.String str13 = hikariConfig0.poolName;
        java.lang.String str14 = hikariConfig0.getCatalog();
        hikariConfig0.isIsolateInternalQueries = true;
        long long17 = hikariConfig0.connectionTimeout;
        long long18 = hikariConfig0.connectionTimeout;
        hikariConfig0.setCatalog("HikariPool-14839");
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-16298" + "'", str13, "HikariPool-16298");
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
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
        hikariConfig0.leakDetectionThreshold = 3;
        boolean boolean24 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12858");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12858 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
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
        hikariConfig0.setReadOnly(false);
        java.lang.String str15 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setReadOnly(true);
        hikariConfig0.connectionCustomizerClassName = "";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        int int10 = hikariConfig0.getMaximumPoolSize();
        boolean boolean11 = hikariConfig0.isRegisterMbeans;
        java.lang.String str12 = hikariConfig0.catalog;
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str14 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.minPoolSize = (byte) 100;
        boolean boolean7 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-536";
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
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
        hikariConfig0.setCatalog("HikariPool-110");
        long long22 = hikariConfig0.connectionTimeout;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.connectionTestQuery = "HikariPool-833";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer27 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer27;
        hikariConfig0.setMaxLifetime(0L);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer31);
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.minPoolSize = 100;
        java.lang.String str11 = hikariConfig0.getDataSourceClassName();
        boolean boolean12 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.transactionIsolationName = "HikariPool-533";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer15;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
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
        java.lang.String str36 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setPoolName("HikariPool-29");
        hikariConfig0.jdbcUrl = "HikariPool-327";
        hikariConfig0.leakDetectionThreshold = 32;
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(dataSource26);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str8 = hikariConfig0.connectionCustomizerClassName;
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.transactionIsolation = 97;
        hikariConfig0.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        long long17 = hikariConfig15.getLeakDetectionThreshold();
        int int18 = hikariConfig15.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig15.connectionCustomizer;
        hikariConfig15.jdbcUrl = "HikariPool-1031";
        hikariConfig0.addDataSourceProperty("HikariPool-97", (java.lang.Object) hikariConfig15);
        hikariConfig15.isJdbc4connectionTest = true;
        hikariConfig15.setTransactionIsolation("HikariPool-1289");
        hikariConfig15.idleTimeout = 97;
        hikariConfig15.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        hikariConfig0.setJdbcUrl("HikariPool-47");
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        long long14 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str15 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireIncrement(32);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
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
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireRetries((int) 'a');
        hikariConfig0.connectionCustomizerClassName = "HikariPool-251";
        long long13 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.transactionIsolationName = "HikariPool-414";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        hikariConfig0.poolName = "HikariPool-989";
        long long13 = hikariConfig0.acquireRetryDelay;
        java.util.Properties properties14 = hikariConfig0.dataSourceProperties;
        java.lang.String str15 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionInitSql("HikariPool-6022");
        hikariConfig0.isIsolateInternalQueries = true;
        java.lang.String str20 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
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
        javax.sql.DataSource dataSource27 = null;
        hikariConfig0.setDataSource(dataSource27);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
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
        hikariConfig7.setDataSourceClassName("HikariPool-1698");
        hikariConfig7.acquireRetryDelay = 'a';
        int int26 = hikariConfig7.transactionIsolation;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
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
        int int20 = hikariConfig0.maxPoolSize;
        hikariConfig0.setConnectionTestQuery("HikariPool-66");
        hikariConfig0.maxPoolSize = 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
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
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str35 = hikariConfig34.getConnectionInitSql();
        long long36 = hikariConfig34.getLeakDetectionThreshold();
        hikariConfig34.leakDetectionThreshold = (-1);
        long long39 = hikariConfig34.acquireRetryDelay;
        boolean boolean40 = hikariConfig34.isRegisterMbeans;
        hikariConfig23.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean40);
        hikariConfig23.setPoolName("HikariPool-16");
        hikariConfig0.addDataSourceProperty("HikariPool-122", (java.lang.Object) hikariConfig23);
        long long45 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 32L + "'", long45 == 32L);
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
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
        hikariConfig0.setDataSourceClassName("HikariPool-253");
        long long26 = hikariConfig0.connectionTimeout;
        hikariConfig0.setRegisterMbeans(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetryDelay((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
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
        hikariConfig0.setConnectionInitSql("HikariPool-891");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.acquireIncrement = '4';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
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
        java.util.Properties properties24 = hikariConfig0.getDataSourceProperties();
        java.lang.Class<?> wildcardClass25 = properties24.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.transactionIsolation = (byte) 10;
        int int15 = hikariConfig0.acquireIncrement;
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        java.lang.String str17 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
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
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 10);
        hikariConfig0.acquireIncrement = (byte) 100;
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.connectionInitSql = "";
        hikariConfig0.setJdbcUrl("");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.minPoolSize = (short) 10;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-242";
        hikariConfig0.acquireRetryDelay = 100;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
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
        int int26 = hikariConfig0.transactionIsolation;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer27 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer27;
        hikariConfig0.setPoolName("HikariPool-14224");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setPoolName("");
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setCatalog("HikariPool-193");
        hikariConfig0.isInitializationFailFast = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        int int7 = hikariConfig0.acquireIncrement;
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
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
        hikariConfig0.setJdbcUrl("HikariPool-156");
        hikariConfig0.setCatalog("HikariPool-344");
        hikariConfig0.setPoolName("HikariPool-8063");
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
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
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
        hikariConfig0.setIdleTimeout((long) 32);
        java.lang.String str14 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
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
        hikariConfig26.transactionIsolation = (byte) 100;
        hikariConfig26.setAutoCommit(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        hikariConfig0.acquireRetryDelay = 'a';
        hikariConfig0.acquireRetries = ' ';
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-15504");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.setPoolName("HikariPool-184");
        hikariConfig0.transactionIsolation = 0;
        hikariConfig0.catalog = "HikariPool-132";
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setMaxLifetime((long) (short) 10);
        java.lang.String str16 = hikariConfig13.getPoolName();
        hikariConfig13.jdbcUrl = "";
        hikariConfig13.setMaxLifetime(0L);
        hikariConfig13.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig23.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource27 = hikariConfig26.getDataSource();
        hikariConfig26.setConnectionTestQuery("");
        hikariConfig26.setInitializationFailFast(false);
        long long32 = hikariConfig26.getConnectionTimeout();
        java.util.Properties properties33 = hikariConfig26.dataSourceProperties;
        hikariConfig23.dataSourceProperties = properties33;
        hikariConfig13.setDataSourceProperties(properties33);
        java.lang.String str36 = hikariConfig13.getJdbcUrl();
        javax.sql.DataSource dataSource37 = hikariConfig13.dataSource;
        java.util.Properties properties38 = hikariConfig13.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties38;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties38);
        javax.sql.DataSource dataSource41 = null;
        hikariConfig40.setDataSource(dataSource41);
        hikariConfig40.setConnectionCustomizerClassName("HikariPool-3644");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-16410" + "'", str16, "HikariPool-16410");
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertNotNull(properties38);
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
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
        int int43 = hikariConfig0.getAcquireRetries();
        java.lang.String str44 = hikariConfig0.getConnectionInitSql();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
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
        hikariConfig23.setPoolName("HikariPool-161");
        java.lang.String str26 = hikariConfig23.connectionInitSql;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-16418" + "'", str3, "HikariPool-16418");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
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
        hikariConfig0.isJdbc4connectionTest = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer18;
        hikariConfig0.setMinimumPoolSize(100);
        int int22 = hikariConfig0.minPoolSize;
        javax.sql.DataSource dataSource23 = null;
        hikariConfig0.setDataSource(dataSource23);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.transactionIsolationName = "HikariPool-66";
        hikariConfig0.setReadOnly(false);
        hikariConfig0.jdbcUrl = "HikariPool-90";
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean16 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.jdbcUrl = "HikariPool-48";
        hikariConfig0.leakDetectionThreshold = ' ';
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean17 = hikariConfig0.isInitializationFailFast;
        int int18 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
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
        hikariConfig0.isIsolateInternalQueries = true;
        java.lang.String str22 = hikariConfig0.dataSourceClassName;
        hikariConfig0.dataSourceClassName = "";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-16");
        boolean boolean7 = hikariConfig0.isReadOnly();
        int int8 = hikariConfig0.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig0.connectionCustomizer;
        long long10 = hikariConfig0.idleTimeout;
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.setCatalog("HikariPool-1158");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isInitializationFailFast = true;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setConnectionInitSql("HikariPool-838");
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        long long13 = hikariConfig0.getMaxLifetime();
        hikariConfig0.transactionIsolation = (byte) 10;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
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
        long long16 = hikariConfig0.getAcquireRetryDelay();
        int int17 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.idleTimeout = 97;
        javax.sql.DataSource dataSource21 = hikariConfig0.dataSource;
        hikariConfig0.connectionInitSql = "HikariPool-15455";
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-18" + "'", str18, "HikariPool-18");
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
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
        int int16 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
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
        boolean boolean15 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMaxLifetime(60L);
        hikariConfig0.setLeakDetectionThreshold(97L);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-4221";
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-9244");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-9244 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        boolean boolean10 = hikariConfig0.isJdbc4connectionTest;
        int int11 = hikariConfig0.maxPoolSize;
        java.lang.String str12 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.minPoolSize = (byte) 100;
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        long long8 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setDataSourceClassName("HikariPool-11418");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
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
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        int int16 = hikariConfig0.getAcquireIncrement();
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.acquireRetryDelay = (short) 10;
        java.lang.String str20 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
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
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.connectionTestQuery = "HikariPool-318";
        long long18 = hikariConfig0.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-1386");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1386' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = 35;
        java.util.Properties properties12 = hikariConfig0.dataSourceProperties;
        hikariConfig0.isJdbc4connectionTest = false;
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries;
        java.util.Properties properties16 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setMinimumPoolSize(35);
        java.lang.String str20 = hikariConfig17.getConnectionCustomizerClassName();
        long long21 = hikariConfig17.getIdleTimeout();
        hikariConfig17.setReadOnly(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = null;
        hikariConfig17.connectionCustomizer = iConnectionCustomizer24;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
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
        hikariConfig0.isReadOnly = false;
        hikariConfig0.poolName = "";
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str21 = hikariConfig20.getConnectionInitSql();
        hikariConfig20.acquireIncrement = 0;
        hikariConfig20.connectionTimeout = 10;
        boolean boolean26 = hikariConfig20.isIsolateInternalQueries();
        hikariConfig20.acquireRetries = 0;
        hikariConfig20.connectionInitSql = "HikariPool-84";
        hikariConfig20.setTransactionIsolation("HikariPool-853");
        boolean boolean33 = hikariConfig20.isAutoCommit();
        hikariConfig0.addDataSourceProperty("HikariPool-181", (java.lang.Object) hikariConfig20);
        int int35 = hikariConfig20.getAcquireIncrement();
        long long36 = hikariConfig20.leakDetectionThreshold;
        boolean boolean37 = hikariConfig20.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
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
        long long19 = hikariConfig0.getIdleTimeout();
        long long20 = hikariConfig0.maxLifetime;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource22 = hikariConfig21.getDataSource();
        hikariConfig21.setConnectionTestQuery("");
        hikariConfig21.connectionCustomizerClassName = "";
        hikariConfig21.setConnectionCustomizerClassName("hi!");
        java.lang.String str29 = hikariConfig21.getCatalog();
        java.util.Properties properties30 = hikariConfig21.dataSourceProperties;
        int int31 = hikariConfig21.minPoolSize;
        long long32 = hikariConfig21.getMaxLifetime();
        hikariConfig21.maxLifetime = 10L;
        hikariConfig21.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig21.isAutoCommit = false;
        java.util.Properties properties39 = hikariConfig21.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties39;
        int int41 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(dataSource18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
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
        java.lang.String str20 = hikariConfig0.connectionTestQuery;
        java.lang.String str21 = hikariConfig0.jdbcUrl;
        int int22 = hikariConfig0.acquireRetries;
        boolean boolean23 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setConnectionInitSql("HikariPool-600");
        long long26 = hikariConfig0.connectionTimeout;
        hikariConfig0.transactionIsolationName = "HikariPool-14770";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setTransactionIsolation("HikariPool-1141");
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
        boolean boolean11 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-16");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-4178");
        hikariConfig0.setJdbcUrl("HikariPool-2086");
        hikariConfig0.setMaximumPoolSize((int) (byte) 10);
        int int18 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.catalog = "HikariPool-978";
        int int11 = hikariConfig0.getAcquireIncrement();
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer14;
        hikariConfig0.isInitializationFailFast = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
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
        int int17 = hikariConfig0.transactionIsolation;
        hikariConfig0.acquireRetries = 100;
        int int20 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAutoCommit(true);
        boolean boolean23 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.maxPoolSize = 35;
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setIdleTimeout((long) 35);
        hikariConfig0.isRegisterMbeans = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        int int10 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-627");
        hikariConfig0.acquireRetries = 1;
        hikariConfig0.setMaxLifetime((long) (byte) 10);
        hikariConfig0.transactionIsolation = (byte) 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
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
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str23 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
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
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.dataSourceClassName = "HikariPool-1698";
        long long34 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.catalog = "HikariPool-347";
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-16490" + "'", str3, "HikariPool-16490");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-48" + "'", str27, "HikariPool-48");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        long long5 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str6 = hikariConfig0.transactionIsolationName;
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.setPoolName("HikariPool-2523");
        boolean boolean11 = hikariConfig0.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer22;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-47" + "'", str15, "HikariPool-47");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.acquireRetryDelay = 100;
        hikariConfig0.poolName = "HikariPool-152";
        int int14 = hikariConfig0.getMinimumPoolSize();
        long long15 = hikariConfig0.getMaxLifetime();
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig0.connectionCustomizer;
        boolean boolean20 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str7 = hikariConfig0.connectionInitSql;
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.connectionInitSql = "hi!";
        boolean boolean11 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setDataSourceClassName("HikariPool-1225");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 10);
        java.lang.String str16 = hikariConfig0.transactionIsolationName;
        int int17 = hikariConfig0.acquireIncrement;
        java.lang.String str18 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
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
        java.lang.String str16 = hikariConfig0.dataSourceClassName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer17;
        boolean boolean19 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setAcquireRetries(97);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.connectionCustomizerClassName = "";
        hikariConfig12.setConnectionCustomizerClassName("hi!");
        java.lang.String str20 = hikariConfig12.getCatalog();
        boolean boolean21 = hikariConfig12.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        boolean boolean32 = hikariConfig23.isRegisterMbeans;
        hikariConfig23.setAcquireRetries(0);
        hikariConfig23.setMaximumPoolSize((int) '#');
        hikariConfig12.addDataSourceProperty("HikariPool-47", (java.lang.Object) '#');
        hikariConfig12.setConnectionTestQuery("HikariPool-47");
        java.lang.String str40 = hikariConfig12.connectionInitSql;
        hikariConfig12.isReadOnly = false;
        hikariConfig12.setIsolateInternalQueries(true);
        hikariConfig0.addDataSourceProperty("HikariPool-299", (java.lang.Object) true);
        hikariConfig0.setJdbcUrl("HikariPool-3508");
        java.lang.String str48 = hikariConfig0.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-3508");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
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
        hikariConfig0.isJdbc4connectionTest = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer18;
        int int20 = hikariConfig0.getAcquireRetries();
        java.lang.String str21 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.connectionTimeout;
        java.util.Properties properties8 = hikariConfig0.dataSourceProperties;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries;
        int int10 = hikariConfig0.maxPoolSize;
        int int11 = hikariConfig0.getMinimumPoolSize();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.dataSource = dataSource12;
        hikariConfig0.setTransactionIsolation("HikariPool-3202");
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
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
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str16 = hikariConfig0.connectionCustomizerClassName;
        long long17 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireRetries(3);
        hikariConfig0.setMinimumPoolSize(0);
        hikariConfig0.setPoolName("HikariPool-470");
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
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
        hikariConfig0.setReadOnly(false);
        hikariConfig0.acquireRetries = ' ';
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
        java.lang.String str20 = hikariConfig0.poolName;
        hikariConfig0.connectionTestQuery = "HikariPool-5668";
        int int23 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-16521" + "'", str20, "HikariPool-16521");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        long long7 = hikariConfig0.maxLifetime;
        long long8 = hikariConfig0.leakDetectionThreshold;
        long long9 = hikariConfig0.getMaxLifetime();
        int int10 = hikariConfig0.acquireRetries;
        hikariConfig0.dataSourceClassName = "HikariPool-1031";
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.dataSource = dataSource13;
        hikariConfig0.idleTimeout = 0L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
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
        hikariConfig0.isJdbc4connectionTest = false;
        int int18 = hikariConfig0.getAcquireRetries();
        long long19 = hikariConfig0.leakDetectionThreshold;
        boolean boolean20 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str21 = hikariConfig0.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-5406");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-5406' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
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
        hikariConfig7.setDataSourceClassName("HikariPool-1698");
        java.lang.String str24 = hikariConfig7.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.leakDetectionThreshold = 60L;
        hikariConfig0.setDataSourceClassName("HikariPool-1688");
        hikariConfig0.setMaxLifetime(5000L);
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        int int15 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        java.util.Properties properties11 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.jdbcUrl = "HikariPool-498";
        boolean boolean15 = hikariConfig12.isJdbc4ConnectionTest();
        hikariConfig12.setDataSourceClassName("HikariPool-1789");
        java.lang.String str18 = hikariConfig12.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        boolean boolean9 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.acquireRetryDelay = (short) 10;
        hikariConfig0.jdbcUrl = "HikariPool-1820";
        long long14 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer8;
        long long10 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.isReadOnly = true;
        hikariConfig0.setLeakDetectionThreshold((long) 1);
        int int15 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
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
        hikariConfig0.acquireIncrement = 'a';
        int int24 = hikariConfig0.minPoolSize;
        long long25 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setAcquireRetries((int) '4');
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-352");
        java.lang.String str13 = hikariConfig0.poolName;
        hikariConfig0.isReadOnly = false;
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-47" + "'", str13, "HikariPool-47");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        java.lang.String str9 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.maxLifetime = (-1);
        java.lang.String str12 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-16546" + "'", str12, "HikariPool-16546");
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        long long10 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setReadOnly(false);
        int int9 = hikariConfig0.transactionIsolation;
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
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
        hikariConfig0.connectionTestQuery = "HikariPool-596";
        hikariConfig0.minPoolSize = 0;
        hikariConfig0.isAutoCommit = true;
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
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        int int8 = hikariConfig0.maxPoolSize;
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        java.lang.String str10 = hikariConfig0.catalog;
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        hikariConfig0.transactionIsolation = 'a';
        hikariConfig0.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer13;
        hikariConfig0.isRegisterMbeans = false;
        long long17 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setJdbcUrl("HikariPool-173");
        java.lang.Class<?> wildcardClass7 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.transactionIsolation = 0;
        java.lang.String str9 = hikariConfig0.getPoolName();
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16563" + "'", str9, "HikariPool-16563");
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.poolName = "";
        int int11 = hikariConfig0.minPoolSize;
        hikariConfig0.setMinimumPoolSize(32);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
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
        hikariConfig0.transactionIsolation = 0;
        hikariConfig0.setRegisterMbeans(false);
        long long24 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
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
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties31);
        hikariConfig33.isInitializationFailFast = false;
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
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setCatalog("HikariPool-193");
        hikariConfig0.setIdleTimeout((long) 60);
        hikariConfig0.dataSourceClassName = "HikariPool-1025";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        hikariConfig0.idleTimeout = 52L;
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setMaxLifetime((long) 35);
        hikariConfig0.setCatalog("HikariPool-2475");
        hikariConfig0.transactionIsolationName = "HikariPool-331";
        java.lang.String str15 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-16576" + "'", str15, "HikariPool-16576");
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTimeout(2147483647L);
        boolean boolean11 = hikariConfig0.isReadOnly();
        hikariConfig0.acquireRetryDelay = 97;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-479");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-479 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-73");
        hikariConfig0.jdbcUrl = "HikariPool-132";
        java.lang.String str13 = hikariConfig0.connectionTestQuery;
        int int14 = hikariConfig0.transactionIsolation;
        hikariConfig0.setConnectionTimeout((long) 100);
        boolean boolean17 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setReadOnly(false);
        int int9 = hikariConfig0.transactionIsolation;
        int int10 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int13 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        boolean boolean4 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.acquireRetryDelay = 750L;
        java.lang.String str8 = hikariConfig0.jdbcUrl;
        hikariConfig0.setTransactionIsolation("HikariPool-35");
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.jdbcUrl = "HikariPool-16";
        hikariConfig0.connectionInitSql = "HikariPool-38";
        hikariConfig0.isReadOnly = true;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.setDataSource(dataSource17);
        hikariConfig0.setMaximumPoolSize(60);
        hikariConfig0.setAcquireRetryDelay((long) (short) 100);
        java.lang.String str23 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str9 = hikariConfig0.transactionIsolationName;
        java.lang.String str10 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
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
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.transactionIsolationName = "HikariPool-66";
        hikariConfig0.setReadOnly(false);
        boolean boolean13 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig0.connectionCustomizer;
        hikariConfig0.leakDetectionThreshold = 3;
        boolean boolean20 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        int int6 = hikariConfig0.acquireIncrement;
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.isInitializationFailFast = true;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-16602" + "'", str3, "HikariPool-16602");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
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
        javax.sql.DataSource dataSource35 = hikariConfig0.getDataSource();
        hikariConfig0.setIdleTimeout(3L);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(dataSource35);
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMinimumPoolSize((int) 'a');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-661");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-661 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-516");
        long long20 = hikariConfig0.acquireRetryDelay;
        long long21 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str7 = hikariConfig0.connectionInitSql;
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.connectionInitSql = "hi!";
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setPoolName("HikariPool-3592");
        hikariConfig0.setDataSourceClassName("HikariPool-6434");
        hikariConfig0.minPoolSize = (short) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        int int4 = hikariConfig0.getTransactionIsolation();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionTestQuery("HikariPool-12921");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
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
        hikariConfig0.connectionCustomizerClassName = "HikariPool-2712";
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        hikariConfig0.setTransactionIsolation("HikariPool-122");
        int int11 = hikariConfig0.minPoolSize;
        boolean boolean12 = hikariConfig0.isRegisterMbeans;
        java.util.Properties properties13 = hikariConfig0.dataSourceProperties;
        long long14 = hikariConfig0.maxLifetime;
        hikariConfig0.maxLifetime = 35L;
        long long17 = hikariConfig0.idleTimeout;
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setDataSourceClassName("HikariPool-2091");
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.acquireRetryDelay = (short) 1;
        java.lang.String str9 = hikariConfig0.connectionTestQuery;
        java.lang.String str10 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
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
        hikariConfig0.minPoolSize = (-1);
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str20 = hikariConfig0.getPoolName();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource23 = hikariConfig22.getDataSource();
        hikariConfig22.setConnectionTestQuery("");
        java.lang.String str26 = hikariConfig22.catalog;
        boolean boolean27 = hikariConfig22.isRegisterMbeans;
        hikariConfig22.setJdbcUrl("HikariPool-703");
        hikariConfig0.addDataSourceProperty("HikariPool-2941", (java.lang.Object) "HikariPool-703");
        hikariConfig0.catalog = "HikariPool-3435";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-16626" + "'", str20, "HikariPool-16626");
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
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
        hikariConfig0.setCatalog("HikariPool-110");
        long long22 = hikariConfig0.connectionTimeout;
        boolean boolean23 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long15 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
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
        boolean boolean26 = hikariConfig0.isReadOnly;
        hikariConfig0.acquireRetries = 60;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-16635" + "'", str3, "HikariPool-16635");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.connectionTimeout = '#';
        hikariConfig0.setConnectionTestQuery("HikariPool-930");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
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
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setAcquireRetries((int) (short) 0);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setMaxLifetime((long) '4');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource8 = hikariConfig7.getDataSource();
        hikariConfig7.setConnectionTestQuery("");
        hikariConfig7.connectionCustomizerClassName = "";
        hikariConfig7.setConnectionCustomizerClassName("hi!");
        java.lang.String str15 = hikariConfig7.getCatalog();
        java.util.Properties properties16 = hikariConfig7.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str19 = hikariConfig18.getConnectionInitSql();
        long long20 = hikariConfig18.getLeakDetectionThreshold();
        hikariConfig18.leakDetectionThreshold = (-1);
        long long23 = hikariConfig18.acquireRetryDelay;
        boolean boolean24 = hikariConfig18.isRegisterMbeans;
        hikariConfig7.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean24);
        hikariConfig7.setAcquireRetries((int) '#');
        long long28 = hikariConfig7.getIdleTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig29.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource33 = hikariConfig32.getDataSource();
        hikariConfig32.setConnectionTestQuery("");
        hikariConfig32.setInitializationFailFast(false);
        long long38 = hikariConfig32.getConnectionTimeout();
        java.util.Properties properties39 = hikariConfig32.dataSourceProperties;
        hikariConfig29.dataSourceProperties = properties39;
        hikariConfig29.maxLifetime = 750L;
        java.util.Properties properties43 = hikariConfig29.dataSourceProperties;
        hikariConfig7.dataSourceProperties = properties43;
        hikariConfig0.setDataSourceProperties(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties43);
        long long47 = hikariConfig46.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNull(dataSource33);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(properties43);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
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
        hikariConfig26.acquireIncrement = (byte) 1;
        boolean boolean30 = hikariConfig26.isIsolateInternalQueries();
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
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setRegisterMbeans(true);
        long long8 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = 35;
        java.util.Properties properties12 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setPoolName("HikariPool-15617");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer8;
        long long10 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.isReadOnly = true;
        hikariConfig0.setLeakDetectionThreshold((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        int int4 = hikariConfig0.getTransactionIsolation();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.acquireRetryDelay = 1;
        hikariConfig0.setJdbcUrl("HikariPool-110");
        int int10 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.acquireRetryDelay = 2147483647L;
        hikariConfig0.catalog = "HikariPool-329";
        hikariConfig0.transactionIsolationName = "HikariPool-1772";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
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
        boolean boolean19 = hikariConfig0.isInitializationFailFast;
        boolean boolean20 = hikariConfig0.isIsolateInternalQueries;
        long long21 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.acquireIncrement = (short) 0;
        boolean boolean24 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.transactionIsolationName = "HikariPool-66";
        hikariConfig0.setReadOnly(false);
        hikariConfig0.acquireRetryDelay = (-1);
        hikariConfig0.minPoolSize = 0;
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
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
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.setDataSource(dataSource16);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setMaxLifetime((long) '4');
        int int6 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.acquireIncrement = '4';
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.addDataSourceProperty("HikariPool-1711", (java.lang.Object) "HikariPool-5116");
        hikariConfig0.connectionTestQuery = "HikariPool-1943";
        hikariConfig0.isInitializationFailFast = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
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
        boolean boolean33 = hikariConfig0.isReadOnly;
        java.lang.String str34 = hikariConfig0.getPoolName();
        hikariConfig0.setInitializationFailFast(true);
        long long37 = hikariConfig0.idleTimeout;
        hikariConfig0.setMaxLifetime(1L);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-16683" + "'", str34, "HikariPool-16683");
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
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
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.isAutoCommit = false;
        long long32 = hikariConfig0.connectionTimeout;
        hikariConfig0.acquireRetryDelay = 3L;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer35;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str17 = hikariConfig16.getConnectionInitSql();
        long long18 = hikariConfig16.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig16.connectionCustomizer = iConnectionCustomizer19;
        boolean boolean21 = hikariConfig16.isIsolateInternalQueries();
        hikariConfig16.poolName = "HikariPool-47";
        java.lang.String str24 = hikariConfig16.transactionIsolationName;
        hikariConfig16.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties27 = hikariConfig16.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties27;
        hikariConfig0.isAutoCommit = false;
        java.lang.String str31 = hikariConfig0.connectionTestQuery;
        hikariConfig0.isIsolateInternalQueries = false;
        java.lang.String str34 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-16687" + "'", str15, "HikariPool-16687");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setCatalog("HikariPool-135");
        hikariConfig0.setMinimumPoolSize((int) '#');
        hikariConfig0.catalog = "HikariPool-823";
        hikariConfig0.acquireRetries = (byte) -1;
        java.lang.String str17 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setAcquireRetries(0);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
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
        hikariConfig0.isJdbc4connectionTest = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer18;
        hikariConfig0.isReadOnly = true;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer22;
        java.lang.String str24 = hikariConfig0.poolName;
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-16691" + "'", str24, "HikariPool-16691");
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        hikariConfig0.acquireRetryDelay = 3L;
        hikariConfig0.poolName = "HikariPool-66";
        hikariConfig0.setCatalog("HikariPool-48");
        boolean boolean11 = hikariConfig0.isAutoCommit();
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.minPoolSize = (byte) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-14215");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-14215 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.connectionTimeout = 0L;
        hikariConfig0.setMaxLifetime((long) 3);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        hikariConfig0.setJdbcUrl("HikariPool-47");
        boolean boolean13 = hikariConfig0.isAutoCommit;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.dataSourceClassName = "HikariPool-107";
        int int18 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.maxPoolSize = (byte) 1;
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str12 = hikariConfig0.connectionInitSql;
        boolean boolean13 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.setIdleTimeout((long) 'a');
        java.lang.String str18 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        hikariConfig0.maxLifetime = (short) 10;
        java.lang.String str18 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-534");
        int int10 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
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
        hikariConfig0.setPoolName("HikariPool-183");
        hikariConfig0.dataSourceClassName = "HikariPool-10412";
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.leakDetectionThreshold = 5000L;
        long long5 = hikariConfig0.idleTimeout;
        hikariConfig0.idleTimeout = 1;
        long long8 = hikariConfig0.getConnectionTimeout();
        int int9 = hikariConfig0.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        java.lang.String str5 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setCatalog("HikariPool-179");
        hikariConfig0.maxPoolSize = 97;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-2001");
        java.lang.String str18 = hikariConfig0.dataSourceClassName;
        java.lang.String str19 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-2001" + "'", str18, "HikariPool-2001");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-3" + "'", str19, "HikariPool-3");
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.jdbcUrl = "";
        boolean boolean12 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.acquireRetries = 0;
        boolean boolean15 = hikariConfig0.isReadOnly;
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
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
        javax.sql.DataSource dataSource19 = hikariConfig0.dataSource;
        int int20 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean14 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.jdbcUrl = "HikariPool-491";
        hikariConfig0.connectionTimeout = 35L;
        hikariConfig0.acquireRetryDelay = 0L;
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
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
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        hikariConfig0.connectionInitSql = "HikariPool-1836";
        java.lang.String str23 = hikariConfig0.jdbcUrl;
        hikariConfig0.isRegisterMbeans = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
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
        hikariConfig0.connectionTimeout = 10L;
        hikariConfig0.isInitializationFailFast = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.isReadOnly = true;
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        hikariConfig0.connectionInitSql = "HikariPool-189";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement((int) ' ');
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        long long9 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        boolean boolean11 = hikariConfig0.isReadOnly;
        hikariConfig0.connectionTimeout = 0L;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig14.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource18 = hikariConfig17.getDataSource();
        hikariConfig17.setConnectionTestQuery("");
        hikariConfig17.setInitializationFailFast(false);
        long long23 = hikariConfig17.getConnectionTimeout();
        java.util.Properties properties24 = hikariConfig17.dataSourceProperties;
        hikariConfig14.dataSourceProperties = properties24;
        hikariConfig0.setDataSourceProperties(properties24);
        java.lang.String str27 = hikariConfig0.poolName;
        java.lang.String str28 = hikariConfig0.dataSourceClassName;
        hikariConfig0.connectionInitSql = "HikariPool-10523";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource18);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties24);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-16749" + "'", str27, "HikariPool-16749");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        hikariConfig0.connectionTimeout = 3;
        java.lang.String str10 = hikariConfig0.getCatalog();
        boolean boolean11 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.maxPoolSize = 35;
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        int int6 = hikariConfig0.minPoolSize;
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        int int8 = hikariConfig0.getAcquireRetries();
        java.lang.String str9 = hikariConfig0.getCatalog();
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
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
        java.lang.String str20 = hikariConfig0.catalog;
        hikariConfig0.setDataSourceClassName("HikariPool-898");
        hikariConfig0.connectionCustomizerClassName = "HikariPool-401";
        hikariConfig0.setTransactionIsolation("HikariPool-7613");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        hikariConfig0.acquireRetryDelay = 3L;
        hikariConfig0.poolName = "HikariPool-66";
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        long long13 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        hikariConfig0.isReadOnly = true;
        hikariConfig0.idleTimeout = ' ';
        java.lang.String str11 = hikariConfig0.getPoolName();
        hikariConfig0.connectionInitSql = "HikariPool-11099";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-16772" + "'", str11, "HikariPool-16772");
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
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
        java.lang.String str13 = hikariConfig0.connectionTestQuery;
        java.util.Properties properties14 = hikariConfig0.dataSourceProperties;
        int int15 = hikariConfig0.getMinimumPoolSize();
        java.util.Properties properties16 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        java.lang.String str9 = hikariConfig0.poolName;
        hikariConfig0.setCatalog("HikariPool-409");
        hikariConfig0.transactionIsolation = 97;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16779" + "'", str9, "HikariPool-16779");
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
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
        javax.sql.DataSource dataSource17 = hikariConfig0.dataSource;
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries;
        long long19 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.maxLifetime = (-1L);
        long long22 = hikariConfig0.idleTimeout;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-3770";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        boolean boolean5 = hikariConfig0.isAutoCommit;
        hikariConfig0.setJdbcUrl("HikariPool-29");
        int int8 = hikariConfig0.transactionIsolation;
        hikariConfig0.catalog = "HikariPool-489";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-29");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
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
        hikariConfig0.setAcquireIncrement(1);
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.isReadOnly = false;
        java.lang.String str46 = hikariConfig0.catalog;
        hikariConfig0.connectionInitSql = "HikariPool-15442";
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
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setMaxLifetime((long) (short) -1);
        int int12 = hikariConfig0.getMinimumPoolSize();
        long long13 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionInitSql("HikariPool-499");
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setDataSourceClassName("HikariPool-38");
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str13 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.isReadOnly = true;
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        hikariConfig0.isReadOnly = true;
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setCatalog("HikariPool-713");
        boolean boolean20 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str3 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.maxLifetime = 1L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setUseInstrumentation(false);
        long long8 = hikariConfig0.idleTimeout;
        javax.sql.DataSource dataSource9 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
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
        long long15 = hikariConfig0.getIdleTimeout();
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
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
        long long18 = hikariConfig0.maxLifetime;
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        java.util.Properties properties21 = hikariConfig0.getDataSourceProperties();
        boolean boolean22 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.jdbcUrl = "HikariPool-16";
        hikariConfig0.connectionInitSql = "HikariPool-38";
        hikariConfig0.isReadOnly = true;
        int int17 = hikariConfig0.maxPoolSize;
        hikariConfig0.setJdbcUrl("HikariPool-435");
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        boolean boolean5 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-435");
        hikariConfig0.isReadOnly = false;
        long long10 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13247");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13247 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        int int7 = hikariConfig0.transactionIsolation;
        hikariConfig0.connectionInitSql = "HikariPool-2740";
        long long10 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-16829" + "'", str6, "HikariPool-16829");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        hikariConfig0.setTransactionIsolation("HikariPool-122");
        int int11 = hikariConfig0.minPoolSize;
        java.lang.String str12 = hikariConfig0.dataSourceClassName;
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.catalog = "";
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-66" + "'", str12, "HikariPool-66");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4201");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4201 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
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
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str16 = hikariConfig0.connectionCustomizerClassName;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setMaxLifetime((long) (short) 10);
        java.lang.String str20 = hikariConfig17.getPoolName();
        hikariConfig17.jdbcUrl = "";
        hikariConfig17.setMaxLifetime(0L);
        hikariConfig17.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig27.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource31 = hikariConfig30.getDataSource();
        hikariConfig30.setConnectionTestQuery("");
        hikariConfig30.setInitializationFailFast(false);
        long long36 = hikariConfig30.getConnectionTimeout();
        java.util.Properties properties37 = hikariConfig30.dataSourceProperties;
        hikariConfig27.dataSourceProperties = properties37;
        hikariConfig17.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        long long41 = hikariConfig40.acquireRetryDelay;
        java.util.Properties properties42 = hikariConfig40.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties42);
        hikariConfig0.transactionIsolation = 35;
        boolean boolean46 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setAcquireRetries(10);
        boolean boolean49 = hikariConfig0.isReadOnly;
        boolean boolean50 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-16843" + "'", str20, "HikariPool-16843");
        org.junit.Assert.assertNull(dataSource31);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertNotNull(properties37);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
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
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.setIdleTimeout((-1L));
        boolean boolean41 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.transactionIsolationName = "HikariPool-3594";
        hikariConfig0.isAutoCommit = false;
        long long46 = hikariConfig0.getAcquireRetryDelay();
        long long47 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 100L + "'", long46 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
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
        int int20 = hikariConfig0.maxPoolSize;
        javax.sql.DataSource dataSource21 = hikariConfig0.dataSource;
        java.lang.String str22 = hikariConfig0.connectionInitSql;
        java.lang.String str23 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionInitSql("HikariPool-16691");
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        int int9 = hikariConfig0.maxPoolSize;
        hikariConfig0.connectionInitSql = "HikariPool-12510";
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.setIdleTimeout((long) 1);
        java.lang.String str14 = hikariConfig0.getPoolName();
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-16854" + "'", str14, "HikariPool-16854");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isJdbc4connectionTest;
        int int6 = hikariConfig0.acquireIncrement;
        hikariConfig0.leakDetectionThreshold = 0L;
        int int9 = hikariConfig0.getMinimumPoolSize();
        int int10 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = 100L;
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.transactionIsolation = 0;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig8.setMaxLifetime((long) (short) 10);
        hikariConfig8.setConnectionTimeout(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource18 = hikariConfig17.getDataSource();
        hikariConfig17.setConnectionTestQuery("");
        hikariConfig17.setInitializationFailFast(false);
        long long23 = hikariConfig17.getConnectionTimeout();
        java.util.Properties properties24 = hikariConfig17.dataSourceProperties;
        hikariConfig13.setDataSourceProperties(properties24);
        hikariConfig8.setDataSourceProperties(properties24);
        hikariConfig0.dataSourceProperties = properties24;
        hikariConfig0.setAcquireIncrement((int) '4');
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str31 = hikariConfig30.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer32 = hikariConfig30.connectionCustomizer;
        hikariConfig30.setConnectionTestQuery("HikariPool-141");
        hikariConfig30.jdbcUrl = "HikariPool-208";
        java.lang.String str37 = hikariConfig30.getConnectionTestQuery();
        hikariConfig30.dataSourceClassName = "HikariPool-55";
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource41 = hikariConfig40.getDataSource();
        hikariConfig40.setConnectionTestQuery("");
        hikariConfig40.setInitializationFailFast(false);
        hikariConfig40.catalog = "";
        int int48 = hikariConfig40.getMaximumPoolSize();
        hikariConfig40.leakDetectionThreshold = (short) 10;
        hikariConfig40.isJdbc4connectionTest = true;
        boolean boolean53 = hikariConfig40.isReadOnly();
        hikariConfig40.transactionIsolation = '#';
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource58 = hikariConfig57.getDataSource();
        hikariConfig57.setConnectionTestQuery("");
        hikariConfig57.setInitializationFailFast(false);
        hikariConfig57.catalog = "";
        javax.sql.DataSource dataSource65 = null;
        hikariConfig57.dataSource = dataSource65;
        javax.sql.DataSource dataSource67 = null;
        hikariConfig57.dataSource = dataSource67;
        hikariConfig40.addDataSourceProperty("HikariPool-361", (java.lang.Object) hikariConfig57);
        java.util.Properties properties70 = hikariConfig57.getDataSourceProperties();
        hikariConfig30.setDataSourceProperties(properties70);
        com.zaxxer.hikari.HikariConfig hikariConfig72 = new com.zaxxer.hikari.HikariConfig(properties70);
        hikariConfig0.dataSourceProperties = properties70;
        hikariConfig0.acquireRetryDelay = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(dataSource18);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(iConnectionCustomizer32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-141" + "'", str37, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 60 + "'", int48 == 60);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(dataSource58);
        org.junit.Assert.assertNotNull(properties70);
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.dataSourceClassName = "HikariPool-55";
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str9 = hikariConfig8.getConnectionInitSql();
        long long10 = hikariConfig8.getLeakDetectionThreshold();
        hikariConfig8.leakDetectionThreshold = (-1);
        long long13 = hikariConfig8.acquireRetryDelay;
        hikariConfig8.setLeakDetectionThreshold((long) (byte) -1);
        java.util.Properties properties16 = hikariConfig8.getDataSourceProperties();
        long long17 = hikariConfig8.maxLifetime;
        hikariConfig0.addDataSourceProperty("HikariPool-152", (java.lang.Object) long17);
        hikariConfig0.acquireRetries = ' ';
        java.lang.String str21 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(properties16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-16868" + "'", str21, "HikariPool-16868");
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.getMaximumPoolSize();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        long long10 = hikariConfig0.connectionTimeout;
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
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
        hikariConfig0.catalog = "HikariPool-65";
        hikariConfig0.connectionCustomizerClassName = "HikariPool-1061";
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.connectionTestQuery = "HikariPool-331";
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.connectionTestQuery = "HikariPool-1019";
        hikariConfig0.setIdleTimeout((long) (byte) 1);
        int int15 = hikariConfig0.getTransactionIsolation();
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        boolean boolean17 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
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
        int int24 = hikariConfig0.maxPoolSize;
        boolean boolean25 = hikariConfig0.isAutoCommit;
        java.lang.String str26 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-16");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-4178");
        hikariConfig0.isReadOnly = false;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
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
        hikariConfig0.setAcquireRetries(100);
        java.lang.String str26 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-16877" + "'", str26, "HikariPool-16877");
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.setPoolName("HikariPool-4834");
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(dataSource1);
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
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
        javax.sql.DataSource dataSource31 = null;
        hikariConfig0.dataSource = dataSource31;
        hikariConfig0.setAcquireRetryDelay((long) 0);
        long long35 = hikariConfig0.leakDetectionThreshold;
        long long36 = hikariConfig0.connectionTimeout;
        boolean boolean37 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
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
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.dataSource = dataSource16;
        java.lang.String str18 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-196" + "'", str18, "HikariPool-196");
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
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
        hikariConfig0.leakDetectionThreshold = (short) 1;
        hikariConfig0.setConnectionTestQuery("HikariPool-3809");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-16891" + "'", str3, "HikariPool-16891");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
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
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean16 = hikariConfig0.isReadOnly();
        hikariConfig0.setCatalog("HikariPool-332");
        long long19 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str20 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-66" + "'", str20, "HikariPool-66");
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isInitializationFailFast = true;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setConnectionInitSql("HikariPool-838");
        hikariConfig0.setConnectionTestQuery("HikariPool-2636");
        hikariConfig0.connectionTimeout = (byte) 1;
        hikariConfig0.setConnectionInitSql("HikariPool-2224");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
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
        hikariConfig0.connectionInitSql = "HikariPool-593";
        hikariConfig0.setCatalog("HikariPool-890");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = hikariConfig0.connectionCustomizer;
        java.lang.String str32 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-890" + "'", str32, "HikariPool-890");
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.maxPoolSize;
        java.lang.String str7 = hikariConfig0.poolName;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str9 = hikariConfig8.getConnectionInitSql();
        long long10 = hikariConfig8.getLeakDetectionThreshold();
        hikariConfig8.leakDetectionThreshold = (-1);
        int int13 = hikariConfig8.acquireIncrement;
        hikariConfig8.setInitializationFailFast(true);
        int int16 = hikariConfig8.maxPoolSize;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str18 = hikariConfig17.getConnectionInitSql();
        long long19 = hikariConfig17.getLeakDetectionThreshold();
        hikariConfig17.leakDetectionThreshold = (-1);
        long long22 = hikariConfig17.acquireRetryDelay;
        long long23 = hikariConfig17.getIdleTimeout();
        hikariConfig17.acquireIncrement = '4';
        javax.sql.DataSource dataSource26 = hikariConfig17.getDataSource();
        hikariConfig17.acquireRetries = 35;
        java.util.Properties properties29 = hikariConfig17.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig8.setDataSourceProperties(properties29);
        hikariConfig0.dataSourceProperties = properties29;
        boolean boolean33 = hikariConfig0.isAutoCommit();
        long long34 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-16904" + "'", str7, "HikariPool-16904");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3L + "'", long34 == 3L);
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        hikariConfig0.setConnectionTestQuery("HikariPool-18");
        hikariConfig0.setConnectionInitSql("HikariPool-711");
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(dataSource1);
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.transactionIsolationName = "hi!";
        hikariConfig0.isRegisterMbeans = true;
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.transactionIsolation = 3;
        hikariConfig0.isRegisterMbeans = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig0.connectionCustomizer;
        boolean boolean15 = hikariConfig0.isReadOnly();
        hikariConfig0.transactionIsolationName = "HikariPool-398";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
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
        boolean boolean27 = hikariConfig0.isReadOnly;
        hikariConfig0.setConnectionTestQuery("HikariPool-187");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-16911" + "'", str3, "HikariPool-16911");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
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
        long long19 = hikariConfig0.maxLifetime;
        java.lang.String str20 = hikariConfig0.transactionIsolationName;
        boolean boolean21 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-295");
        java.lang.String str11 = hikariConfig0.getPoolName();
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-16922" + "'", str11, "HikariPool-16922");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        long long8 = hikariConfig0.getIdleTimeout();
        java.lang.String str9 = hikariConfig0.catalog;
        java.lang.String str10 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        int int12 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setTransactionIsolation("HikariPool-402");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        long long11 = hikariConfig0.acquireRetryDelay;
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1052");
        java.lang.String str12 = hikariConfig0.getPoolName();
        hikariConfig0.acquireRetryDelay = 97;
        hikariConfig0.connectionTestQuery = "HikariPool-1689";
        boolean boolean17 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-16927" + "'", str12, "HikariPool-16927");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.connectionCustomizerClassName = "";
        hikariConfig16.setConnectionCustomizerClassName("hi!");
        java.lang.String str24 = hikariConfig16.getCatalog();
        boolean boolean25 = hikariConfig16.isRegisterMbeans;
        hikariConfig16.setAcquireRetries(0);
        long long28 = hikariConfig16.getMaxLifetime();
        hikariConfig16.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource32 = hikariConfig31.getDataSource();
        hikariConfig31.setConnectionTestQuery("");
        hikariConfig31.setInitializationFailFast(false);
        hikariConfig31.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource40 = hikariConfig39.getDataSource();
        hikariConfig39.setConnectionTestQuery("");
        hikariConfig39.connectionCustomizerClassName = "";
        hikariConfig39.setConnectionCustomizerClassName("hi!");
        java.lang.String str47 = hikariConfig39.getCatalog();
        java.util.Properties properties48 = hikariConfig39.dataSourceProperties;
        hikariConfig31.dataSourceProperties = properties48;
        hikariConfig16.setDataSourceProperties(properties48);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer51 = null;
        hikariConfig16.connectionCustomizer = iConnectionCustomizer51;
        long long53 = hikariConfig16.getIdleTimeout();
        hikariConfig16.setIdleTimeout(32L);
        int int56 = hikariConfig16.transactionIsolation;
        hikariConfig16.acquireIncrement = 97;
        hikariConfig16.setUseInstrumentation(false);
        hikariConfig0.addDataSourceProperty("HikariPool-216", (java.lang.Object) hikariConfig16);
        javax.sql.DataSource dataSource62 = hikariConfig16.getDataSource();
        int int63 = hikariConfig16.getMaximumPoolSize();
        hikariConfig16.isIsolateInternalQueries = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(properties48);
// flaky:         org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(dataSource62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 60 + "'", int63 == 60);
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
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
        hikariConfig0.acquireRetries = (short) 100;
        boolean boolean24 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.lang.String str8 = hikariConfig0.connectionInitSql;
        long long9 = hikariConfig0.leakDetectionThreshold;
        int int10 = hikariConfig0.acquireIncrement;
        hikariConfig0.poolName = "HikariPool-173";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
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
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.maxLifetime = (short) 0;
        boolean boolean16 = hikariConfig0.isAutoCommit;
        int int17 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setLeakDetectionThreshold((long) 3);
        hikariConfig0.catalog = "HikariPool-10324";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
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
        hikariConfig0.setAcquireRetries((int) ' ');
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.minPoolSize = 100;
        java.lang.String str11 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.transactionIsolation = (-1);
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setAcquireRetryDelay((long) '#');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-4162");
        hikariConfig0.transactionIsolation = 1;
        long long12 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
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
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str40 = hikariConfig39.getConnectionInitSql();
        hikariConfig39.setMaxLifetime(35L);
        long long43 = hikariConfig39.leakDetectionThreshold;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource46 = hikariConfig45.getDataSource();
        hikariConfig45.idleTimeout = 3;
        hikariConfig45.setLeakDetectionThreshold(52L);
        int int51 = hikariConfig45.minPoolSize;
        hikariConfig45.setIdleTimeout((long) 10);
        hikariConfig45.setConnectionTimeout((long) (short) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str57 = hikariConfig56.getConnectionInitSql();
        long long58 = hikariConfig56.getLeakDetectionThreshold();
        hikariConfig56.leakDetectionThreshold = (byte) 0;
        hikariConfig56.acquireRetryDelay = 3L;
        hikariConfig56.poolName = "HikariPool-66";
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource66 = hikariConfig65.getDataSource();
        hikariConfig65.setConnectionTestQuery("");
        hikariConfig65.connectionCustomizerClassName = "";
        hikariConfig65.setConnectionCustomizerClassName("hi!");
        java.lang.String str73 = hikariConfig65.getCatalog();
        boolean boolean74 = hikariConfig65.isRegisterMbeans;
        hikariConfig65.setAcquireRetries(0);
        hikariConfig65.setMaximumPoolSize((int) '#');
        hikariConfig65.setTransactionIsolation("hi!");
        boolean boolean81 = hikariConfig65.isInitializationFailFast();
        java.lang.String str82 = hikariConfig65.connectionInitSql;
        hikariConfig65.maxPoolSize = 0;
        java.util.Properties properties85 = hikariConfig65.getDataSourceProperties();
        hikariConfig56.setDataSourceProperties(properties85);
        com.zaxxer.hikari.HikariConfig hikariConfig87 = new com.zaxxer.hikari.HikariConfig(properties85);
        hikariConfig45.dataSourceProperties = properties85;
        hikariConfig39.addDataSourceProperty("HikariPool-110", (java.lang.Object) properties85);
        hikariConfig0.setDataSourceProperties(properties85);
        hikariConfig0.setInitializationFailFast(false);
        long long93 = hikariConfig0.connectionTimeout;
        java.lang.String str94 = hikariConfig0.connectionTestQuery;
        javax.sql.DataSource dataSource95 = null;
        hikariConfig0.setDataSource(dataSource95);
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
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertNull(dataSource66);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(properties85);
// flaky:         org.junit.Assert.assertTrue("'" + long93 + "' != '" + 32L + "'", long93 == 32L);
        org.junit.Assert.assertNull(str94);
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
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
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean16 = hikariConfig0.isReadOnly();
        hikariConfig0.setCatalog("HikariPool-332");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer19;
        long long21 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource22 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNull(dataSource22);
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean8 = hikariConfig0.isAutoCommit();
        int int9 = hikariConfig0.acquireIncrement;
        hikariConfig0.isIsolateInternalQueries = true;
        int int12 = hikariConfig0.acquireRetries;
        hikariConfig0.setConnectionInitSql("HikariPool-2394");
        hikariConfig0.minPoolSize = (byte) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.isIsolateInternalQueries = true;
        long long11 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int5 = hikariConfig0.acquireRetries;
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setCatalog("HikariPool-1513");
        hikariConfig0.setMaxLifetime(97L);
        hikariConfig0.minPoolSize = 100;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
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
        long long25 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.poolName = "HikariPool-474";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
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
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        long long15 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setCatalog("HikariPool-8451");
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
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
        java.util.Properties properties20 = hikariConfig0.getDataSourceProperties();
        boolean boolean21 = hikariConfig0.isRegisterMbeans();
        int int22 = hikariConfig0.getAcquireRetries();
        hikariConfig0.dataSourceClassName = "HikariPool-1898";
        hikariConfig0.setCatalog("HikariPool-3600");
        hikariConfig0.setAcquireIncrement(100);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
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
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        boolean boolean33 = hikariConfig0.isAutoCommit();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
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
        hikariConfig0.setReadOnly(false);
        hikariConfig0.acquireRetries = ' ';
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
        java.lang.String str20 = hikariConfig0.poolName;
        hikariConfig0.connectionTestQuery = "HikariPool-5668";
        boolean boolean23 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-16992" + "'", str20, "HikariPool-16992");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        hikariConfig0.isRegisterMbeans = false;
        int int10 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str11 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
        java.lang.String str14 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-16995" + "'", str14, "HikariPool-16995");
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
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
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-16996" + "'", str17, "HikariPool-16996");
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        long long10 = hikariConfig0.leakDetectionThreshold;
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaximumPoolSize(97);
        hikariConfig0.acquireRetryDelay = 750L;
        hikariConfig0.setPoolName("HikariPool-3977");
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.setDataSource(dataSource18);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-16997" + "'", str3, "HikariPool-16997");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.transactionIsolationName = "hi!";
        java.lang.String str8 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setInitializationFailFast(true);
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
        java.util.Properties properties28 = hikariConfig11.dataSourceProperties;
        hikariConfig0.setDataSourceProperties(properties28);
        long long30 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.setRegisterMbeans(true);
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setCatalog("HikariPool-3076");
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetryDelay = 0;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean7 = hikariConfig0.isAutoCommit();
        hikariConfig0.setJdbcUrl("HikariPool-2651");
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.idleTimeout = 32;
        java.lang.String str11 = hikariConfig0.poolName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-17013" + "'", str11, "HikariPool-17013");
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
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
        hikariConfig0.maxLifetime = 0;
        boolean boolean13 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        hikariConfig0.maxPoolSize = (short) 100;
        hikariConfig0.catalog = "HikariPool-103";
        long long11 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.transactionIsolationName = "HikariPool-1707";
        hikariConfig0.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.transactionIsolationName = "hi!";
        java.lang.String str8 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setAcquireRetries(10);
        java.lang.String str11 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-17017" + "'", str11, "HikariPool-17017");
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
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
        javax.sql.DataSource dataSource40 = null;
        hikariConfig0.setDataSource(dataSource40);
        hikariConfig0.minPoolSize = 97;
        hikariConfig0.isInitializationFailFast = true;
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
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
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
        hikariConfig0.connectionTimeout = 32;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-17024" + "'", str11, "HikariPool-17024");
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
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
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
        java.lang.String str31 = hikariConfig0.dataSourceClassName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer32 = hikariConfig0.connectionCustomizer;
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
        org.junit.Assert.assertNull(iConnectionCustomizer32);
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.setRegisterMbeans(true);
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setCatalog("HikariPool-3076");
        hikariConfig0.acquireIncrement = (byte) 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = 35;
        java.util.Properties properties12 = hikariConfig0.dataSourceProperties;
        hikariConfig0.isJdbc4connectionTest = false;
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean16 = hikariConfig0.isReadOnly();
        int int17 = hikariConfig0.getAcquireRetries();
        long long18 = hikariConfig0.acquireRetryDelay;
        int int19 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.transactionIsolation = (byte) 100;
        boolean boolean22 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig0.connectionCustomizer;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer15;
        hikariConfig0.setIdleTimeout((long) (short) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-73");
        hikariConfig0.jdbcUrl = "HikariPool-132";
        java.lang.String str13 = hikariConfig0.connectionTestQuery;
        int int14 = hikariConfig0.transactionIsolation;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.dataSource = dataSource15;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
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
        hikariConfig0.dataSourceClassName = "HikariPool-1950";
        javax.sql.DataSource dataSource19 = null;
        hikariConfig0.dataSource = dataSource19;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setCatalog("HikariPool-135");
        hikariConfig0.setMinimumPoolSize((int) '#');
        hikariConfig0.isIsolateInternalQueries = true;
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        long long16 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.minPoolSize;
        hikariConfig0.leakDetectionThreshold = 1L;
        java.lang.String str4 = hikariConfig0.getPoolName();
        long long5 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.poolName = "HikariPool-8137";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-17050" + "'", str4, "HikariPool-17050");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setMaxLifetime((long) '4');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.leakDetectionThreshold = 0;
        long long9 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str10 = hikariConfig0.poolName;
        hikariConfig0.connectionInitSql = "HikariPool-4111";
        boolean boolean13 = hikariConfig0.isReadOnly;
        hikariConfig0.setConnectionInitSql("HikariPool-186");
        hikariConfig0.setTransactionIsolation("HikariPool-3200");
        boolean boolean18 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-17052" + "'", str10, "HikariPool-17052");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setUseInstrumentation(false);
        int int9 = hikariConfig0.getMaximumPoolSize();
        boolean boolean10 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str12 = hikariConfig0.getPoolName();
        hikariConfig0.idleTimeout = 35;
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        long long16 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-17053" + "'", str12, "HikariPool-17053");
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
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
        hikariConfig0.maxLifetime = (byte) 100;
        hikariConfig0.setConnectionTestQuery("HikariPool-838");
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        int int18 = hikariConfig0.acquireRetries;
        hikariConfig0.setConnectionTestQuery("HikariPool-344");
        long long21 = hikariConfig0.leakDetectionThreshold;
        boolean boolean22 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-838" + "'", str17, "HikariPool-838");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
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
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.isJdbc4connectionTest = true;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetryDelay((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setMaxLifetime((long) '4');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.leakDetectionThreshold = 0;
        long long9 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str10 = hikariConfig0.poolName;
        hikariConfig0.connectionInitSql = "HikariPool-4111";
        boolean boolean13 = hikariConfig0.isReadOnly;
        int int14 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-17057" + "'", str10, "HikariPool-17057");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.setIdleTimeout(100L);
        long long10 = hikariConfig0.idleTimeout;
        hikariConfig0.dataSourceClassName = "HikariPool-16";
        hikariConfig0.connectionTestQuery = "HikariPool-318";
        hikariConfig0.minPoolSize = (byte) 1;
        hikariConfig0.idleTimeout = (byte) 100;
        long long19 = hikariConfig0.getAcquireRetryDelay();
        long long20 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setPoolName("HikariPool-2748");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        boolean boolean8 = hikariConfig0.isReadOnly();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.maxLifetime = 97;
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
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
        java.lang.String str14 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
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
        hikariConfig0.transactionIsolationName = "HikariPool-4012";
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5098");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5098 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.transactionIsolationName = "hi!";
        java.lang.String str8 = hikariConfig0.connectionCustomizerClassName;
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        java.lang.String str10 = hikariConfig0.jdbcUrl;
        java.util.Properties properties11 = hikariConfig0.dataSourceProperties;
        hikariConfig0.connectionInitSql = "HikariPool-10703";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
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
        hikariConfig0.connectionTimeout = '#';
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        boolean boolean18 = hikariConfig0.isReadOnly();
        java.lang.String str19 = hikariConfig0.getJdbcUrl();
        boolean boolean20 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.maxPoolSize = (short) 1;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
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
        int int20 = hikariConfig0.maxPoolSize;
        java.util.Properties properties21 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setRegisterMbeans(true);
        long long24 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource25 = hikariConfig0.getDataSource();
        boolean boolean26 = hikariConfig0.isReadOnly;
        java.util.Properties properties27 = hikariConfig0.dataSourceProperties;
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setHikariPool-47");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setMaxLifetime(3L);
        hikariConfig0.setRegisterMbeans(true);
        int int9 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.setIdleTimeout((long) 3);
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setCatalog("HikariPool-625");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setMaxLifetime((long) '4');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.leakDetectionThreshold = 0;
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.isReadOnly = true;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.dataSource = dataSource12;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.setIdleTimeout(100L);
        long long10 = hikariConfig0.idleTimeout;
        hikariConfig0.leakDetectionThreshold = (byte) -1;
        hikariConfig0.isJdbc4connectionTest = false;
        java.util.Properties properties15 = hikariConfig0.dataSourceProperties;
        hikariConfig0.acquireRetries = 10;
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.isInitializationFailFast = false;
        long long22 = hikariConfig0.maxLifetime;
        hikariConfig0.idleTimeout = 97L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(properties15);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        long long10 = hikariConfig0.idleTimeout;
        hikariConfig0.setMinimumPoolSize(60);
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.setIdleTimeout(100L);
        long long10 = hikariConfig0.idleTimeout;
        hikariConfig0.dataSourceClassName = "HikariPool-16";
        hikariConfig0.connectionTestQuery = "HikariPool-318";
        int int15 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
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
        int int15 = hikariConfig0.acquireRetries;
        int int16 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        boolean boolean5 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-435");
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.catalog = "HikariPool-533";
        hikariConfig0.setTransactionIsolation("HikariPool-1337");
        java.lang.String str13 = hikariConfig0.transactionIsolationName;
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-1337" + "'", str13, "HikariPool-1337");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
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
        hikariConfig0.isReadOnly = false;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-3187";
        boolean boolean23 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setPoolName("HikariPool-149");
        java.lang.String str10 = hikariConfig0.poolName;
        hikariConfig0.setConnectionInitSql("HikariPool-963");
        hikariConfig0.isAutoCommit = false;
        int int15 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-149" + "'", str10, "HikariPool-149");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
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
        long long21 = hikariConfig8.acquireRetryDelay;
        int int22 = hikariConfig8.getMaximumPoolSize();
        java.lang.String str23 = hikariConfig8.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
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
        long long25 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.catalog = "HikariPool-149";
        int int15 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setRegisterMbeans(true);
        long long8 = hikariConfig0.acquireRetryDelay;
        java.lang.String str9 = hikariConfig0.connectionInitSql;
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-1791";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setAcquireRetryDelay((long) 97);
        java.lang.String str16 = hikariConfig13.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean11 = hikariConfig0.isRegisterMbeans;
        long long12 = hikariConfig0.idleTimeout;
        long long13 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean14 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.transactionIsolation = (byte) -1;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
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
        int int21 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
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
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource28 = hikariConfig0.getDataSource();
        javax.sql.DataSource dataSource29 = null;
        hikariConfig0.dataSource = dataSource29;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(dataSource28);
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setTransactionIsolation("");
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        java.lang.String str12 = hikariConfig0.getConnectionInitSql();
        boolean boolean13 = hikariConfig0.isReadOnly;
        hikariConfig0.setDataSourceClassName("HikariPool-141");
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        boolean boolean5 = hikariConfig0.isAutoCommit;
        java.lang.String str6 = hikariConfig0.jdbcUrl;
        long long7 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireRetryDelay((long) 60);
        java.lang.String str10 = hikariConfig0.getCatalog();
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean12 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.connectionTimeout;
        hikariConfig0.transactionIsolation = (short) 1;
        java.lang.String str10 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
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
        int int20 = hikariConfig0.maxPoolSize;
        hikariConfig0.setMaxLifetime((long) 100);
        hikariConfig0.connectionInitSql = "HikariPool-989";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        int int10 = hikariConfig0.getMaximumPoolSize();
        boolean boolean11 = hikariConfig0.isAutoCommit;
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionInitSql("HikariPool-3596");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.acquireIncrement = '4';
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean7 = hikariConfig0.isReadOnly;
        hikariConfig0.setLeakDetectionThreshold((long) (short) -1);
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        int int11 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
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
        hikariConfig0.setTransactionIsolation("HikariPool-102");
        java.lang.String str16 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-17153" + "'", str16, "HikariPool-17153");
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setDataSourceClassName("HikariPool-686");
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
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
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str33 = hikariConfig32.getConnectionInitSql();
        long long34 = hikariConfig32.getLeakDetectionThreshold();
        hikariConfig32.maxPoolSize = 35;
        java.lang.String str37 = hikariConfig32.getConnectionTestQuery();
        int int38 = hikariConfig32.minPoolSize;
        hikariConfig32.setMinimumPoolSize((int) (byte) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer41 = hikariConfig32.connectionCustomizer;
        java.util.Properties properties42 = hikariConfig32.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties42;
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer41);
        org.junit.Assert.assertNotNull(properties42);
    }
}
