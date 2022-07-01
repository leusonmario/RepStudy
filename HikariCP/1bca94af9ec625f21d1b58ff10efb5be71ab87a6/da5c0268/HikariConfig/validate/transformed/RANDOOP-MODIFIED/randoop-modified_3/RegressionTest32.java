import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        long long17 = hikariConfig1.maxLifetime;
        hikariConfig1.acquireIncrement = (byte) 10;
        java.lang.String str20 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setIsolateInternalQueries(false);
        long long23 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setInitializationFailFast(false);
        int int26 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setJdbcUrl("");
        long long29 = hikariConfig1.getIdleTimeout();
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-44751" + "'", str9, "HikariPool-44751");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1800000L + "'", long29 == 1800000L);
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        hikariConfig1.setAcquireIncrement((int) (short) 10);
        hikariConfig1.isReadOnly = false;
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.transactionIsolation = (byte) 0;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.idleTimeout = (-1);
        java.util.Properties properties14 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig1.setDataSourceProperties(properties14);
        hikariConfig1.setJdbcUrl("HikariPool-300");
        hikariConfig1.idleTimeout = 5000L;
        java.lang.String str23 = hikariConfig1.poolName;
        hikariConfig1.setCatalog("HikariPool-475");
        java.lang.String str26 = hikariConfig1.getPoolName();
        java.lang.String str27 = hikariConfig1.poolName;
        long long28 = hikariConfig1.idleTimeout;
        hikariConfig1.setAutoCommit(false);
        int int31 = hikariConfig1.maxPoolSize;
        int int32 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-44753" + "'", str23, "HikariPool-44753");
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-44753" + "'", str26, "HikariPool-44753");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-44753" + "'", str27, "HikariPool-44753");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 5000L + "'", long28 == 5000L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.lang.String str4 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long9 = hikariConfig8.getAcquireRetryDelay();
        hikariConfig8.idleTimeout = (-1);
        hikariConfig8.setMaximumPoolSize((int) 'a');
        long long14 = hikariConfig8.getLeakDetectionThreshold();
        java.lang.String str15 = hikariConfig8.catalog;
        long long16 = hikariConfig8.getMaxLifetime();
        boolean boolean17 = hikariConfig8.isReadOnly;
        long long18 = hikariConfig8.getIdleTimeout();
        java.util.Properties properties19 = hikariConfig8.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties19;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties19);
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.connectionInitSql = "hi!";
        hikariConfig25.acquireIncrement = (byte) 100;
        hikariConfig25.setMinimumPoolSize((int) (short) 0);
        hikariConfig25.setJdbcUrl("hi!");
        long long35 = hikariConfig25.getLeakDetectionThreshold();
        hikariConfig25.setIdleTimeout((long) (byte) 1);
        long long38 = hikariConfig25.getMaxLifetime();
        hikariConfig25.idleTimeout = 358;
        hikariConfig25.setIsolateInternalQueries(false);
        hikariConfig25.transactionIsolation = 0;
        hikariConfig22.addDataSourceProperty("HikariPool-751", (java.lang.Object) hikariConfig25);
        java.util.Properties properties46 = hikariConfig22.getDataSourceProperties();
        java.lang.String str47 = hikariConfig22.connectionTestQuery;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(properties19);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str9 = hikariConfig1.poolName;
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6");
        int int14 = hikariConfig1.acquireRetries;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        hikariConfig1.connectionTimeout = 1800000L;
        hikariConfig1.setDataSourceClassName("HikariPool-16367");
        hikariConfig1.setMinimumPoolSize(60);
        java.lang.String str23 = hikariConfig1.getPoolName();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-44763" + "'", str9, "HikariPool-44763");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-44763" + "'", str23, "HikariPool-44763");
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.minPoolSize = (byte) 10;
        long long18 = hikariConfig1.getIdleTimeout();
        boolean boolean19 = hikariConfig1.isInitializationFailFast;
        long long20 = hikariConfig1.connectionTimeout;
        hikariConfig1.jdbcUrl = "HikariPool-126";
        java.lang.String str23 = hikariConfig1.jdbcUrl;
        hikariConfig1.setTransactionIsolation("HikariPool-38828");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-126" + "'", str23, "HikariPool-126");
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        int int11 = hikariConfig1.minPoolSize;
        hikariConfig1.catalog = "HikariPool-609";
        hikariConfig1.setIdleTimeout(600000L);
        hikariConfig1.setReadOnly(false);
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setConnectionInitSql("HikariPool-8006");
        java.lang.String str21 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.connectionTestQuery = "";
        long long8 = hikariConfig1.acquireRetryDelay;
        long long9 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.maxPoolSize = 358;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-44768" + "'", str5, "HikariPool-44768");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.transactionIsolation = 358;
        hikariConfig1.isReadOnly = true;
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-310";
        hikariConfig1.setMaxLifetime(52L);
        hikariConfig1.connectionTestQuery = "HikariPool-801";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer24;
        long long26 = hikariConfig1.getAcquireRetryDelay();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-11533");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-11533' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = (byte) 10;
        hikariConfig1.isReadOnly = false;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setConnectionTestQuery("HikariPool-134");
        hikariConfig1.setReadOnly(false);
        hikariConfig1.isIsolateInternalQueries = true;
        boolean boolean22 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str23 = hikariConfig1.poolName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-44770" + "'", str23, "HikariPool-44770");
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        long long16 = hikariConfig15.getAcquireRetryDelay();
        hikariConfig15.idleTimeout = (-1);
        java.lang.String str19 = hikariConfig15.dataSourceClassName;
        hikariConfig15.connectionCustomizerClassName = "HikariPool-426";
        hikariConfig1.addDataSourceProperty("HikariPool-418", (java.lang.Object) hikariConfig15);
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.idleTimeout = (-1);
        hikariConfig24.setMaximumPoolSize((int) 'a');
        java.lang.String str30 = hikariConfig24.catalog;
        boolean boolean31 = hikariConfig24.isJdbc4ConnectionTest();
        hikariConfig24.setMinimumPoolSize(0);
        hikariConfig24.setTransactionIsolation("HikariPool-276");
        java.util.Properties properties36 = hikariConfig24.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties36;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = (byte) 10;
        hikariConfig1.isReadOnly = false;
        hikariConfig1.acquireRetryDelay = 5000L;
        java.lang.String str17 = hikariConfig1.getPoolName();
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.transactionIsolation = 358;
        hikariConfig1.setPoolName("HikariPool-124");
        hikariConfig1.connectionTimeout = 52L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-44774" + "'", str17, "HikariPool-44774");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        long long17 = hikariConfig1.getIdleTimeout();
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str19 = hikariConfig1.jdbcUrl;
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        long long21 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-44775" + "'", str9, "HikariPool-44775");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.isJdbc4connectionTest = false;
        int int13 = hikariConfig1.transactionIsolation;
        hikariConfig1.jdbcUrl = "HikariPool-117";
        hikariConfig1.maxPoolSize = (byte) 10;
        hikariConfig1.setIsolateInternalQueries(true);
        int int20 = hikariConfig1.minPoolSize;
        long long21 = hikariConfig1.getConnectionTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-22372");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-22372 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setReadOnly(true);
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setTransactionIsolation("hi!");
        hikariConfig10.acquireRetryDelay = '4';
        hikariConfig10.setConnectionTimeout((long) (short) 0);
        hikariConfig10.setConnectionTestQuery("HikariPool-45");
        long long20 = hikariConfig10.connectionTimeout;
        hikariConfig10.setPoolName("HikariPool-55");
        hikariConfig10.dataSourceClassName = "HikariPool-77";
        java.lang.String str25 = hikariConfig10.getConnectionTestQuery();
        hikariConfig10.setAutoCommit(false);
        java.util.Properties properties28 = hikariConfig10.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties28;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig30.setAutoCommit(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483647L + "'", long20 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-45" + "'", str25, "HikariPool-45");
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.acquireRetries = 'a';
        hikariConfig1.transactionIsolationName = "HikariPool-907";
        hikariConfig1.setIdleTimeout((long) 0);
        hikariConfig1.setIsolateInternalQueries(true);
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.setDataSource(dataSource19);
        java.lang.String str21 = hikariConfig1.getConnectionInitSql();
        long long22 = hikariConfig1.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 750L + "'", long22 == 750L);
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        hikariConfig1.dataSourceClassName = "HikariPool-172";
        hikariConfig1.setTransactionIsolation("HikariPool-55");
        hikariConfig1.setJdbcUrl("HikariPool-349");
        hikariConfig1.isInitializationFailFast = true;
        java.util.Properties properties21 = hikariConfig1.getDataSourceProperties();
        int int22 = hikariConfig1.getAcquireRetries();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.dataSource = dataSource23;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.transactionIsolation = 358;
        hikariConfig1.isReadOnly = true;
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-310";
        hikariConfig1.setMaxLifetime(52L);
        hikariConfig1.connectionTestQuery = "HikariPool-801";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer24;
        boolean boolean26 = hikariConfig1.isInitializationFailFast;
        java.lang.String str27 = hikariConfig1.transactionIsolationName;
        boolean boolean28 = hikariConfig1.isInitializationFailFast;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str6 = hikariConfig1.transactionIsolationName;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        boolean boolean8 = hikariConfig1.isInitializationFailFast;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaxLifetime((long) 100);
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.leakDetectionThreshold = 'a';
        int int17 = hikariConfig1.minPoolSize;
        java.lang.String str18 = hikariConfig1.getPoolName();
        hikariConfig1.setPoolName("HikariPool-249");
        java.lang.String str21 = hikariConfig1.getPoolName();
        boolean boolean22 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.connectionTimeout = 60;
        int int25 = hikariConfig1.acquireIncrement;
        int int26 = hikariConfig1.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-44790" + "'", str18, "HikariPool-44790");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-249" + "'", str21, "HikariPool-249");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        long long10 = hikariConfig9.getAcquireRetryDelay();
        hikariConfig9.connectionInitSql = "hi!";
        hikariConfig9.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig9.transactionIsolation = (byte) 0;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long19 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.idleTimeout = (-1);
        java.util.Properties properties22 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig9.setDataSourceProperties(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int29 = hikariConfig28.getMinimumPoolSize();
        boolean boolean30 = hikariConfig28.isIsolateInternalQueries();
        javax.sql.DataSource dataSource31 = null;
        hikariConfig28.setDataSource(dataSource31);
        hikariConfig28.leakDetectionThreshold = 0L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        hikariConfig1.dataSourceClassName = "HikariPool-211";
        int int14 = hikariConfig1.acquireRetries;
        long long15 = hikariConfig1.getConnectionTimeout();
        boolean boolean16 = hikariConfig1.isRegisterMbeans;
        java.lang.String str17 = hikariConfig1.getPoolName();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-12790";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-44798" + "'", str17, "HikariPool-44798");
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        int int12 = hikariConfig1.transactionIsolation;
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.idleTimeout = (-1);
        java.util.Properties properties20 = hikariConfig16.getDataSourceProperties();
        long long21 = hikariConfig16.maxLifetime;
        hikariConfig16.setLeakDetectionThreshold(750L);
        int int24 = hikariConfig16.getMinimumPoolSize();
        java.lang.String str25 = hikariConfig16.getDataSourceClassName();
        java.lang.String str26 = hikariConfig16.dataSourceClassName;
        hikariConfig16.setPoolName("HikariPool-952");
        hikariConfig16.setMaxLifetime((long) 358);
        java.util.Properties properties31 = hikariConfig16.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties31;
        hikariConfig1.maxLifetime = '#';
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        hikariConfig1.setMinimumPoolSize(100);
        hikariConfig1.setIdleTimeout((long) (-1));
        long long15 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.connectionInitSql = "hi!";
        hikariConfig17.acquireIncrement = (byte) 100;
        int int23 = hikariConfig17.minPoolSize;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.connectionInitSql = "hi!";
        hikariConfig25.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig25.transactionIsolation = (byte) 0;
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        long long35 = hikariConfig34.getAcquireRetryDelay();
        hikariConfig34.idleTimeout = (-1);
        java.util.Properties properties38 = hikariConfig34.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig25.setDataSourceProperties(properties38);
        hikariConfig17.setDataSourceProperties(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig1.dataSourceProperties = properties38;
        int int47 = hikariConfig1.acquireIncrement;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = (byte) 10;
        hikariConfig1.isReadOnly = false;
        hikariConfig1.acquireRetryDelay = 5000L;
        hikariConfig1.jdbcUrl = "HikariPool-997";
        int int19 = hikariConfig1.minPoolSize;
        int int20 = hikariConfig1.getAcquireRetries();
        long long21 = hikariConfig1.getLeakDetectionThreshold();
        long long22 = hikariConfig1.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setPoolName("HikariPool-541");
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        int int17 = hikariConfig1.transactionIsolation;
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        boolean boolean19 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setTransactionIsolation("HikariPool-20347");
        int int22 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isAutoCommit = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionInitSql = "HikariPool-519";
        int int9 = hikariConfig1.getAcquireIncrement();
        long long10 = hikariConfig1.acquireRetryDelay;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.minPoolSize = (byte) 10;
        long long18 = hikariConfig1.getIdleTimeout();
        boolean boolean19 = hikariConfig1.isInitializationFailFast;
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        long long21 = hikariConfig1.maxLifetime;
        hikariConfig1.isRegisterMbeans = true;
        long long24 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties25 = hikariConfig1.getDataSourceProperties();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        boolean boolean16 = hikariConfig1.isAutoCommit;
        hikariConfig1.setConnectionTestQuery("HikariPool-25480");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaxLifetime((long) 100);
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.leakDetectionThreshold = 'a';
        hikariConfig1.isIsolateInternalQueries = false;
        int int19 = hikariConfig1.minPoolSize;
        boolean boolean20 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-553";
        java.lang.String str23 = hikariConfig1.getConnectionTestQuery();
        long long24 = hikariConfig1.getMaxLifetime();
        long long25 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-291";
        long long9 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.acquireRetryDelay = ' ';
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.maxPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        hikariConfig1.connectionTestQuery = "HikariPool-182";
        hikariConfig1.setPoolName("HikariPool-322");
        boolean boolean17 = hikariConfig1.isAutoCommit;
        long long18 = hikariConfig1.getConnectionTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionTestQuery = "HikariPool-780";
        long long18 = hikariConfig1.getIdleTimeout();
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-126";
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.dataSource = dataSource23;
        hikariConfig1.minPoolSize = 10;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.connectionInitSql = "HikariPool-195";
        hikariConfig1.setConnectionInitSql("HikariPool-109");
        int int20 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-45");
        boolean boolean23 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-44821" + "'", str9, "HikariPool-44821");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-44821" + "'", str13, "HikariPool-44821");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        java.lang.String str4 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionTestQuery("HikariPool-833");
        hikariConfig1.connectionTestQuery = "HikariPool-305";
        hikariConfig1.isReadOnly = false;
        hikariConfig1.jdbcUrl = "HikariPool-757";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-44822" + "'", str4, "HikariPool-44822");
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setIdleTimeout(10L);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionTestQuery("HikariPool-19794");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.minPoolSize = 'a';
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-127" + "'", str11, "HikariPool-127");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        hikariConfig1.setConnectionTestQuery("HikariPool-271");
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setPoolName("HikariPool-928");
        int int19 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        long long21 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.leakDetectionThreshold = 10;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-44825" + "'", str9, "HikariPool-44825");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(dataSource20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionTimeout = (byte) -1;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.dataSource = dataSource14;
        hikariConfig1.setAcquireRetryDelay((long) (short) 0);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.dataSource = dataSource18;
        boolean boolean20 = hikariConfig1.isInitializationFailFast();
        long long21 = hikariConfig1.getAcquireRetryDelay();
        long long22 = hikariConfig1.connectionTimeout;
        boolean boolean23 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(32L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (byte) -1;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setTransactionIsolation("HikariPool-188");
        boolean boolean17 = hikariConfig14.isAutoCommit;
        java.util.Properties properties18 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        java.lang.String str20 = hikariConfig19.connectionTestQuery;
        hikariConfig19.setTransactionIsolation("HikariPool-17975");
        long long23 = hikariConfig19.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3L + "'", long23 == 3L);
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        hikariConfig1.connectionTestQuery = "HikariPool-167";
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.acquireRetryDelay = ' ';
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.idleTimeout = (-1);
        hikariConfig19.setMaximumPoolSize((int) 'a');
        java.lang.String str25 = hikariConfig19.catalog;
        boolean boolean26 = hikariConfig19.isJdbc4ConnectionTest();
        hikariConfig19.setMinimumPoolSize(0);
        int int29 = hikariConfig19.getMaximumPoolSize();
        java.lang.String str30 = hikariConfig19.getConnectionCustomizerClassName();
        java.lang.String str31 = hikariConfig19.transactionIsolationName;
        hikariConfig19.setAcquireRetryDelay(0L);
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        long long36 = hikariConfig35.getAcquireRetryDelay();
        hikariConfig35.idleTimeout = (-1);
        java.util.Properties properties39 = hikariConfig35.getDataSourceProperties();
        long long40 = hikariConfig35.maxLifetime;
        hikariConfig35.setConnectionInitSql("");
        int int43 = hikariConfig35.acquireRetries;
        java.lang.String str44 = hikariConfig35.getCatalog();
        java.util.Properties properties45 = hikariConfig35.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig19.dataSourceProperties = properties45;
        hikariConfig15.setDataSourceProperties(properties45);
        java.lang.String str49 = hikariConfig15.getCatalog();
        hikariConfig15.connectionTestQuery = "HikariPool-1892";
        boolean boolean52 = hikariConfig15.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertNotNull(properties39);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.transactionIsolation = (byte) 0;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        int int10 = hikariConfig1.minPoolSize;
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        java.lang.String str12 = hikariConfig1.poolName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(properties11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-44841" + "'", str12, "HikariPool-44841");
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-114";
        int int8 = hikariConfig1.acquireIncrement;
        hikariConfig1.isReadOnly = false;
        hikariConfig1.leakDetectionThreshold = (-1L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1229");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1229 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.isIsolateInternalQueries = true;
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isReadOnly;
        long long19 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.setIsolateInternalQueries(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.isAutoCommit = false;
        long long21 = hikariConfig1.getIdleTimeout();
        int int22 = hikariConfig1.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(0);
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.acquireRetries = 97;
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.maxPoolSize = 'a';
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str20 = hikariConfig1.dataSourceClassName;
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setJdbc4ConnectionTest(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        long long7 = hikariConfig1.connectionTimeout;
        hikariConfig1.jdbcUrl = "HikariPool-335";
        hikariConfig1.acquireRetries = (short) 10;
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        long long13 = hikariConfig1.idleTimeout;
        hikariConfig1.catalog = "HikariPool-13024";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        java.lang.String str11 = hikariConfig1.poolName;
        boolean boolean12 = hikariConfig1.isAutoCommit;
        long long13 = hikariConfig1.idleTimeout;
        hikariConfig1.setTransactionIsolation("HikariPool-8824");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-44859" + "'", str11, "HikariPool-44859");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str9 = hikariConfig1.poolName;
        hikariConfig1.setReadOnly(true);
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setMinimumPoolSize(1);
        hikariConfig1.jdbcUrl = "";
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-44862" + "'", str9, "HikariPool-44862");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.transactionIsolation = (byte) -1;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.catalog = "HikariPool-481";
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setIsolateInternalQueries(true);
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        hikariConfig1.acquireIncrement = 32;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        hikariConfig1.connectionInitSql = "HikariPool-4571";
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setMaxLifetime(100L);
        int int8 = hikariConfig1.getAcquireRetries();
        hikariConfig1.dataSourceClassName = "HikariPool-140";
        hikariConfig1.connectionTimeout = 100;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setAcquireRetryDelay((long) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        long long7 = hikariConfig6.getAcquireRetryDelay();
        hikariConfig6.connectionInitSql = "hi!";
        hikariConfig6.acquireIncrement = (byte) 100;
        hikariConfig6.setMinimumPoolSize((int) (short) 0);
        java.lang.String str14 = hikariConfig6.dataSourceClassName;
        long long15 = hikariConfig6.getAcquireRetryDelay();
        hikariConfig6.idleTimeout = (byte) -1;
        java.util.Properties properties18 = hikariConfig6.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties18;
        boolean boolean20 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.acquireRetries = '4';
        boolean boolean25 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setAcquireIncrement(358);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.connectionTestQuery = "HikariPool-45";
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolation = 0;
        int int16 = hikariConfig1.getAcquireRetries();
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        boolean boolean18 = hikariConfig1.isAutoCommit();
        hikariConfig1.isReadOnly = false;
        java.lang.String str21 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.getTransactionIsolation();
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.maxLifetime = 'a';
        hikariConfig1.setConnectionInitSql("HikariPool-29123");
        hikariConfig1.setDataSourceClassName("HikariPool-13845");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        hikariConfig1.setTransactionIsolation("HikariPool-114");
        hikariConfig1.setDataSourceClassName("HikariPool-77");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        hikariConfig1.poolName = "HikariPool-335";
        int int19 = hikariConfig1.getMinimumPoolSize();
        boolean boolean20 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
        java.lang.String str22 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-77" + "'", str21, "HikariPool-77");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-45" + "'", str22, "HikariPool-45");
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setCatalog("HikariPool-1090");
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isInitializationFailFast = false;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.poolName = "HikariPool-127";
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        hikariConfig1.transactionIsolation = 0;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        java.lang.String str17 = hikariConfig16.getDataSourceClassName();
        int int18 = hikariConfig16.getAcquireRetries();
        hikariConfig16.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig16.setDataSource(dataSource21);
        hikariConfig16.transactionIsolation = (byte) 10;
        int int25 = hikariConfig16.acquireIncrement;
        hikariConfig16.acquireRetryDelay = 100;
        java.util.Properties properties28 = hikariConfig16.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties28);
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.transactionIsolation = 'a';
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getMinimumPoolSize();
        java.lang.String str12 = hikariConfig10.connectionTestQuery;
        java.lang.String str13 = hikariConfig10.getDataSourceClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        java.lang.String str7 = hikariConfig1.getJdbcUrl();
        hikariConfig1.isReadOnly = false;
        int int10 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        hikariConfig1.idleTimeout = ' ';
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test16064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16064");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        java.lang.String str6 = hikariConfig1.jdbcUrl;
        hikariConfig1.maxPoolSize = 358;
        hikariConfig1.poolName = "HikariPool-268";
        hikariConfig1.connectionInitSql = "HikariPool-214";
        hikariConfig1.maxPoolSize = (short) 1;
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test16065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16065");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.connectionTimeout = ' ';
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        hikariConfig1.minPoolSize = 'a';
        hikariConfig1.setAcquireRetryDelay((long) 10);
        hikariConfig1.catalog = "HikariPool-209";
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setConnectionTimeout(750L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16066");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.transactionIsolation = 60;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.lang.String str10 = hikariConfig9.getDataSourceClassName();
        hikariConfig9.setTransactionIsolation("hi!");
        hikariConfig9.acquireRetryDelay = '4';
        hikariConfig9.setConnectionCustomizerClassName("");
        java.lang.String str17 = hikariConfig9.getPoolName();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) str17);
        java.lang.String str19 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setInitializationFailFast(false);
        long long22 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-26400";
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-44889" + "'", str17, "HikariPool-44889");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test16067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16067");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        hikariConfig1.setAutoCommit(false);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-317");
        hikariConfig1.catalog = "HikariPool-2330";
        int int12 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test16068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16068");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long9 = hikariConfig8.getAcquireRetryDelay();
        hikariConfig8.connectionInitSql = "hi!";
        hikariConfig8.acquireIncrement = (byte) 100;
        int int14 = hikariConfig8.minPoolSize;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.connectionInitSql = "hi!";
        hikariConfig16.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig16.transactionIsolation = (byte) 0;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.idleTimeout = (-1);
        java.util.Properties properties29 = hikariConfig25.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig16.setDataSourceProperties(properties29);
        hikariConfig8.setDataSourceProperties(properties29);
        hikariConfig1.setDataSourceProperties(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties29);
        long long38 = hikariConfig37.getAcquireRetryDelay();
        int int39 = hikariConfig37.getMaximumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNotNull(properties29);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
    }

    @Test
    public void test16069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16069");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.isRegisterMbeans = true;
        int int13 = hikariConfig1.minPoolSize;
        hikariConfig1.leakDetectionThreshold = 3;
        hikariConfig1.minPoolSize = 100;
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean20 = hikariConfig1.isJdbc4ConnectionTest();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test16070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16070");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.connectionInitSql = "HikariPool-609";
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.jdbcUrl = "HikariPool-30768";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test16071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16071");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(0);
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.acquireRetries = 97;
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.maxPoolSize = 'a';
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.minPoolSize = (byte) 0;
        hikariConfig1.dataSourceClassName = "HikariPool-536";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test16072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16072");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        int int11 = hikariConfig1.minPoolSize;
        hikariConfig1.catalog = "HikariPool-847";
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.dataSourceClassName = "hi!";
        java.util.Properties properties20 = hikariConfig16.dataSourceProperties;
        java.lang.String str21 = hikariConfig16.getCatalog();
        long long22 = hikariConfig16.acquireRetryDelay;
        hikariConfig16.isJdbc4connectionTest = false;
        java.util.Properties properties25 = hikariConfig16.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties25;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test16073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16073");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = (byte) 10;
        hikariConfig1.leakDetectionThreshold = 1L;
        java.lang.String str15 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str18 = hikariConfig1.jdbcUrl;
        java.lang.String str19 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setJdbcUrl("HikariPool-1912");
        hikariConfig1.setCatalog("HikariPool-2858");
        boolean boolean24 = hikariConfig1.isInitializationFailFast();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test16074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16074");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str19 = hikariConfig18.getDataSourceClassName();
        hikariConfig18.setTransactionIsolation("hi!");
        hikariConfig18.acquireRetryDelay = '4';
        hikariConfig18.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties26 = hikariConfig18.getDataSourceProperties();
        hikariConfig18.setAcquireRetries((int) (short) 1);
        java.util.Properties properties29 = hikariConfig18.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties29;
        hikariConfig1.isInitializationFailFast = false;
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        long long35 = hikariConfig34.getAcquireRetryDelay();
        hikariConfig34.idleTimeout = (-1);
        hikariConfig34.setMaximumPoolSize((int) 'a');
        java.lang.String str40 = hikariConfig34.catalog;
        boolean boolean41 = hikariConfig34.isJdbc4ConnectionTest();
        hikariConfig34.setMinimumPoolSize(0);
        hikariConfig34.setUseInstrumentation(true);
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        long long48 = hikariConfig47.getAcquireRetryDelay();
        hikariConfig47.idleTimeout = (-1);
        java.util.Properties properties51 = hikariConfig47.getDataSourceProperties();
        long long52 = hikariConfig47.maxLifetime;
        hikariConfig47.setLeakDetectionThreshold(750L);
        int int55 = hikariConfig47.getMinimumPoolSize();
        hikariConfig47.acquireRetries = 'a';
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        long long60 = hikariConfig59.getAcquireRetryDelay();
        hikariConfig59.connectionInitSql = "hi!";
        hikariConfig59.acquireIncrement = (byte) 100;
        hikariConfig59.setMinimumPoolSize((int) (short) 0);
        java.lang.String str67 = hikariConfig59.dataSourceClassName;
        long long68 = hikariConfig59.getAcquireRetryDelay();
        hikariConfig59.idleTimeout = (byte) -1;
        java.util.Properties properties71 = hikariConfig59.dataSourceProperties;
        hikariConfig47.dataSourceProperties = properties71;
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties71);
        hikariConfig34.dataSourceProperties = properties71;
        hikariConfig1.setDataSourceProperties(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig76 = new com.zaxxer.hikari.HikariConfig(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig77 = new com.zaxxer.hikari.HikariConfig(properties71);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig77.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(properties29);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 32L + "'", long48 == 32L);
        org.junit.Assert.assertNotNull(properties51);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + 97L + "'", long52 == 97L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + 32L + "'", long60 == 32L);
        org.junit.Assert.assertNull(str67);
// flaky:         org.junit.Assert.assertTrue("'" + long68 + "' != '" + 32L + "'", long68 == 32L);
        org.junit.Assert.assertNotNull(properties71);
    }

    @Test
    public void test16075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16075");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.isIsolateInternalQueries = false;
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        long long10 = hikariConfig8.maxLifetime;
        java.util.Properties properties11 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig1.setDataSourceProperties(properties11);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        long long15 = hikariConfig1.connectionTimeout;
        int int16 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test16076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16076");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        int int12 = hikariConfig1.transactionIsolation;
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        int int14 = hikariConfig1.getAcquireRetries();
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isIsolateInternalQueries = false;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.connectionInitSql = "hi!";
        hikariConfig19.acquireIncrement = (byte) 100;
        hikariConfig19.setMinimumPoolSize((int) (short) 0);
        hikariConfig19.connectionTestQuery = "";
        hikariConfig19.jdbcUrl = "HikariPool-45";
        hikariConfig19.isReadOnly = false;
        boolean boolean33 = hikariConfig19.isInitializationFailFast;
        hikariConfig19.isInitializationFailFast = true;
        hikariConfig19.jdbcUrl = "HikariPool-833";
        hikariConfig19.setDataSourceClassName("HikariPool-180");
        long long40 = hikariConfig19.getMaxLifetime();
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig42.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource45 = hikariConfig42.getDataSource();
        hikariConfig42.connectionTestQuery = "HikariPool-55";
        hikariConfig42.connectionTestQuery = "hi!";
        java.lang.String str50 = hikariConfig42.poolName;
        hikariConfig42.setReadOnly(true);
        boolean boolean53 = hikariConfig42.isIsolateInternalQueries();
        hikariConfig42.transactionIsolationName = "HikariPool-97";
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        long long58 = hikariConfig57.getAcquireRetryDelay();
        hikariConfig57.connectionInitSql = "hi!";
        hikariConfig57.acquireIncrement = (byte) 100;
        hikariConfig57.setMinimumPoolSize((int) (short) 0);
        hikariConfig57.connectionTestQuery = "";
        hikariConfig57.jdbcUrl = "HikariPool-45";
        boolean boolean69 = hikariConfig57.isRegisterMbeans;
        hikariConfig57.isIsolateInternalQueries = true;
        hikariConfig57.idleTimeout = 100;
        java.lang.String str74 = hikariConfig57.connectionTestQuery;
        hikariConfig57.maxPoolSize = (short) -1;
        java.util.Properties properties77 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig78 = new com.zaxxer.hikari.HikariConfig(properties77);
        long long79 = hikariConfig78.getAcquireRetryDelay();
        hikariConfig78.idleTimeout = (-1);
        java.util.Properties properties82 = hikariConfig78.getDataSourceProperties();
        hikariConfig57.dataSourceProperties = properties82;
        com.zaxxer.hikari.HikariConfig hikariConfig84 = new com.zaxxer.hikari.HikariConfig(properties82);
        hikariConfig42.dataSourceProperties = properties82;
        hikariConfig19.setDataSourceProperties(properties82);
        com.zaxxer.hikari.HikariConfig hikariConfig87 = new com.zaxxer.hikari.HikariConfig(properties82);
        com.zaxxer.hikari.HikariConfig hikariConfig88 = new com.zaxxer.hikari.HikariConfig(properties82);
        com.zaxxer.hikari.HikariConfig hikariConfig89 = new com.zaxxer.hikari.HikariConfig(properties82);
        hikariConfig1.dataSourceProperties = properties82;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertNull(dataSource45);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "HikariPool-44927" + "'", str50, "HikariPool-44927");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long58 + "' != '" + 32L + "'", long58 == 32L);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
// flaky:         org.junit.Assert.assertTrue("'" + long79 + "' != '" + 32L + "'", long79 == 32L);
        org.junit.Assert.assertNotNull(properties82);
    }

    @Test
    public void test16077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16077");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setRegisterMbeans(false);
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test16078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16078");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.connectionTimeout = 358;
        long long16 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.leakDetectionThreshold = 3L;
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        long long22 = hikariConfig21.getAcquireRetryDelay();
        hikariConfig21.connectionInitSql = "hi!";
        int int25 = hikariConfig21.transactionIsolation;
        long long26 = hikariConfig21.maxLifetime;
        hikariConfig1.addDataSourceProperty("HikariPool-88", (java.lang.Object) hikariConfig21);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 358L + "'", long16 == 358L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
    }

    @Test
    public void test16079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16079");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setIdleTimeout(2147483647L);
        boolean boolean13 = hikariConfig1.isReadOnly();
        hikariConfig1.setMinimumPoolSize(60);
        hikariConfig1.setTransactionIsolation("HikariPool-1025");
        hikariConfig1.setAutoCommit(false);
        javax.sql.DataSource dataSource20 = hikariConfig1.dataSource;
        boolean boolean21 = hikariConfig1.isIsolateInternalQueries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16080");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.maxLifetime;
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setIsolateInternalQueries(true);
        long long15 = hikariConfig1.acquireRetryDelay;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test16081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16081");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2610");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2610 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16082");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("HikariPool-2436");
        long long8 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.idleTimeout = (-1);
        hikariConfig10.setMaximumPoolSize((int) 'a');
        long long16 = hikariConfig10.getLeakDetectionThreshold();
        java.lang.String str17 = hikariConfig10.jdbcUrl;
        int int18 = hikariConfig10.acquireRetries;
        java.lang.String str19 = hikariConfig10.getConnectionTestQuery();
        int int20 = hikariConfig10.getAcquireRetries();
        java.util.Properties properties21 = hikariConfig10.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test16083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16083");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.setConnectionTimeout((long) 358);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.dataSource = dataSource9;
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.acquireIncrement = 0;
        hikariConfig1.poolName = "HikariPool-134";
        hikariConfig1.maxPoolSize = ' ';
        int int18 = hikariConfig1.acquireRetries;
        java.util.Properties properties19 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig21.setTransactionIsolation("HikariPool-21795");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test16084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16084");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.setConnectionTimeout((long) 358);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.dataSource = dataSource9;
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.isIsolateInternalQueries = false;
        long long17 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test16085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16085");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str13 = hikariConfig1.getPoolName();
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.maxLifetime = (byte) 0;
        hikariConfig1.setPoolName("HikariPool-1157");
        int int20 = hikariConfig1.getAcquireRetries();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.maxLifetime = 1L;
        hikariConfig1.acquireIncrement = 0;
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        long long32 = hikariConfig31.getAcquireRetryDelay();
        hikariConfig31.connectionInitSql = "hi!";
        hikariConfig31.setTransactionIsolation("hi!");
        hikariConfig31.isInitializationFailFast = true;
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        long long41 = hikariConfig40.getAcquireRetryDelay();
        hikariConfig40.connectionInitSql = "hi!";
        hikariConfig40.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig40.transactionIsolation = (byte) 0;
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        long long50 = hikariConfig49.getAcquireRetryDelay();
        hikariConfig49.idleTimeout = (-1);
        java.util.Properties properties53 = hikariConfig49.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties53);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties53);
        hikariConfig40.setDataSourceProperties(properties53);
        hikariConfig31.setDataSourceProperties(properties53);
        hikariConfig31.setRegisterMbeans(true);
        java.lang.String str61 = hikariConfig31.getDataSourceClassName();
        hikariConfig31.isInitializationFailFast = false;
        boolean boolean64 = hikariConfig31.isIsolateInternalQueries();
        hikariConfig1.addDataSourceProperty("HikariPool-22854", (java.lang.Object) hikariConfig31);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-44947" + "'", str9, "HikariPool-44947");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-44947" + "'", str13, "HikariPool-44947");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 32L + "'", long50 == 32L);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test16086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16086");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        hikariConfig1.setTransactionIsolation("HikariPool-114");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.maxPoolSize = 0;
        hikariConfig1.maxPoolSize = 60;
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test16087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16087");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionInitSql = "HikariPool-139";
        hikariConfig1.catalog = "HikariPool-426";
        java.lang.String str10 = hikariConfig1.getJdbcUrl();
        hikariConfig1.isReadOnly = false;
        hikariConfig1.setAcquireIncrement(52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16088");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.minPoolSize = (byte) 10;
        hikariConfig1.connectionTestQuery = "HikariPool-69";
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setLeakDetectionThreshold(0L);
        java.lang.String str21 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-44956" + "'", str9, "HikariPool-44956");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-55" + "'", str21, "HikariPool-55");
    }

    @Test
    public void test16089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16089");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.maxLifetime;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.acquireIncrement = ' ';
        long long15 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.connectionInitSql = "hi!";
        hikariConfig17.setTransactionIsolation("hi!");
        hikariConfig17.isInitializationFailFast = true;
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        long long27 = hikariConfig26.getAcquireRetryDelay();
        hikariConfig26.connectionInitSql = "hi!";
        hikariConfig26.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig26.transactionIsolation = (byte) 0;
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        long long36 = hikariConfig35.getAcquireRetryDelay();
        hikariConfig35.idleTimeout = (-1);
        java.util.Properties properties39 = hikariConfig35.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig26.setDataSourceProperties(properties39);
        hikariConfig17.setDataSourceProperties(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties39);
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        java.lang.String str48 = hikariConfig47.getDataSourceClassName();
        hikariConfig47.setTransactionIsolation("hi!");
        hikariConfig47.acquireRetryDelay = '4';
        hikariConfig47.setConnectionTimeout((long) (short) 0);
        hikariConfig47.setConnectionTestQuery("HikariPool-45");
        long long57 = hikariConfig47.connectionTimeout;
        hikariConfig47.setMaxLifetime(1L);
        java.lang.String str60 = hikariConfig47.getJdbcUrl();
        hikariConfig47.setUseInstrumentation(true);
        hikariConfig47.setConnectionInitSql("HikariPool-195");
        hikariConfig47.connectionTimeout = 3L;
        java.util.Properties properties67 = hikariConfig47.getDataSourceProperties();
        hikariConfig45.dataSourceProperties = properties67;
        hikariConfig1.dataSourceProperties = properties67;
        hikariConfig1.acquireIncrement = 3;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 2147483647L + "'", long57 == 2147483647L);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(properties67);
    }

    @Test
    public void test16090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16090");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        long long7 = hikariConfig5.maxLifetime;
        java.util.Properties properties8 = hikariConfig5.getDataSourceProperties();
        java.lang.String str9 = hikariConfig5.getCatalog();
        hikariConfig5.connectionTestQuery = "HikariPool-84";
        hikariConfig5.transactionIsolation = (short) 100;
        int int14 = hikariConfig5.getTransactionIsolation();
        hikariConfig1.addDataSourceProperty("HikariPool-134", (java.lang.Object) hikariConfig5);
        hikariConfig5.catalog = "hi!";
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        hikariConfig5.dataSourceClassName = "HikariPool-150";
        java.util.Properties properties22 = hikariConfig5.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        long long27 = hikariConfig26.getAcquireRetryDelay();
        hikariConfig26.connectionInitSql = "hi!";
        hikariConfig26.acquireIncrement = (byte) 100;
        hikariConfig26.setMinimumPoolSize((int) (short) 0);
        java.lang.String str34 = hikariConfig26.dataSourceClassName;
        int int35 = hikariConfig26.getMinimumPoolSize();
        int int36 = hikariConfig26.getMaximumPoolSize();
        int int37 = hikariConfig26.getAcquireIncrement();
        java.util.Properties properties38 = hikariConfig26.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig24.setDataSourceProperties(properties38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(properties22);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(properties38);
    }

    @Test
    public void test16091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16091");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setPoolName("HikariPool-541");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer16;
        java.lang.String str18 = hikariConfig1.dataSourceClassName;
        int int19 = hikariConfig1.acquireRetries;
        boolean boolean20 = hikariConfig1.isAutoCommit();
        hikariConfig1.acquireRetryDelay = 'a';
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test16092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16092");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.acquireIncrement = '#';
        java.lang.String str8 = hikariConfig5.getDataSourceClassName();
        hikariConfig5.setAutoCommit(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig5.connectionCustomizer;
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setConnectionInitSql("");
        java.util.Properties properties16 = hikariConfig13.dataSourceProperties;
        hikariConfig5.setDataSourceProperties(properties16);
        hikariConfig5.maxPoolSize = (byte) -1;
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test16093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16093");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaxLifetime((long) 100);
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.leakDetectionThreshold = 'a';
        hikariConfig1.isIsolateInternalQueries = false;
        int int19 = hikariConfig1.minPoolSize;
        hikariConfig1.setConnectionTimeout(358L);
        java.lang.String str22 = hikariConfig1.transactionIsolationName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-55" + "'", str22, "HikariPool-55");
    }

    @Test
    public void test16094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16094");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setIdleTimeout(2147483647L);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test16095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16095");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.lang.String str7 = hikariConfig6.getDataSourceClassName();
        hikariConfig6.setTransactionIsolation("hi!");
        hikariConfig6.acquireRetryDelay = '4';
        hikariConfig6.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties14 = hikariConfig6.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.util.Properties properties17 = hikariConfig16.getDataSourceProperties();
        int int18 = hikariConfig16.acquireIncrement;
        hikariConfig16.setAcquireIncrement(60);
        java.lang.String str21 = hikariConfig16.transactionIsolationName;
        hikariConfig16.transactionIsolationName = "HikariPool-6401";
        javax.sql.DataSource dataSource24 = null;
        hikariConfig16.dataSource = dataSource24;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16096");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        int int12 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) 97);
        int int15 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-144");
        hikariConfig1.connectionTimeout = 60L;
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        java.lang.String str22 = hikariConfig21.getDataSourceClassName();
        int int23 = hikariConfig21.getAcquireRetries();
        hikariConfig21.connectionTimeout = 100;
        boolean boolean26 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.idleTimeout = 3L;
        hikariConfig21.isAutoCommit = true;
        boolean boolean31 = hikariConfig21.isReadOnly;
        int int32 = hikariConfig21.transactionIsolation;
        hikariConfig21.setIsolateInternalQueries(false);
        hikariConfig21.connectionCustomizerClassName = "HikariPool-439";
        java.util.Properties properties37 = hikariConfig21.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties37);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-44985" + "'", str9, "HikariPool-44985");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(properties37);
    }

    @Test
    public void test16097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16097");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        int int10 = hikariConfig1.acquireRetries;
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        long long13 = hikariConfig1.getConnectionTimeout();
        int int14 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setDataSourceClassName("HikariPool-27130");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test16098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16098");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = (byte) 10;
        hikariConfig1.isReadOnly = false;
        hikariConfig1.acquireRetryDelay = 5000L;
        hikariConfig1.setTransactionIsolation("HikariPool-486");
        int int19 = hikariConfig1.getAcquireRetries();
        hikariConfig1.poolName = "";
        java.lang.String str22 = hikariConfig1.getJdbcUrl();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16099");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.transactionIsolationName = "HikariPool-172";
        hikariConfig1.setReadOnly(true);
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionTestQuery("HikariPool-334");
        hikariConfig1.isRegisterMbeans = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16100");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getAcquireRetries();
        java.lang.String str12 = hikariConfig10.connectionInitSql;
        hikariConfig10.jdbcUrl = "";
        java.lang.String str15 = hikariConfig10.getCatalog();
        hikariConfig10.setUseInstrumentation(true);
        hikariConfig10.maxLifetime = 5000L;
        hikariConfig10.setLeakDetectionThreshold((long) 3);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16101");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean3 = hikariConfig1.isAutoCommit();
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.transactionIsolation = (short) -1;
        boolean boolean7 = hikariConfig1.isIsolateInternalQueries();
        int int8 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test16102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16102");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getAcquireIncrement();
        hikariConfig10.minPoolSize = 0;
        hikariConfig10.isAutoCommit = true;
        hikariConfig10.idleTimeout = '4';
        boolean boolean18 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.jdbcUrl = "HikariPool-290";
        java.lang.String str21 = hikariConfig10.poolName;
        hikariConfig10.connectionTimeout = (byte) -1;
        int int24 = hikariConfig10.getAcquireRetries();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-44995" + "'", str21, "HikariPool-44995");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test16103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16103");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.isInitializationFailFast = false;
        int int12 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        long long15 = hikariConfig1.idleTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test16104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16104");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.leakDetectionThreshold = 0L;
        java.lang.String str13 = hikariConfig10.catalog;
        long long14 = hikariConfig10.getIdleTimeout();
        hikariConfig10.setConnectionInitSql("HikariPool-1157");
        hikariConfig10.minPoolSize = (short) 0;
        int int19 = hikariConfig10.getMinimumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test16105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16105");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2994");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2994 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16106");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout(2147483647L);
        hikariConfig1.minPoolSize = 0;
        int int10 = hikariConfig1.getMinimumPoolSize();
        boolean boolean11 = hikariConfig1.isReadOnly();
        hikariConfig1.acquireIncrement = 60;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16107");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        long long8 = hikariConfig7.getAcquireRetryDelay();
        hikariConfig7.connectionInitSql = "hi!";
        hikariConfig7.acquireIncrement = (byte) 100;
        hikariConfig7.setMinimumPoolSize((int) (short) 0);
        hikariConfig7.connectionTestQuery = "";
        long long17 = hikariConfig7.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig7.connectionCustomizer = iConnectionCustomizer18;
        java.lang.String str20 = hikariConfig7.getDataSourceClassName();
        hikariConfig7.connectionTestQuery = "";
        java.util.Properties properties23 = hikariConfig7.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig5.setDataSourceProperties(properties23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test16108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16108");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        long long17 = hikariConfig1.maxLifetime;
        hikariConfig1.acquireIncrement = (byte) 10;
        boolean boolean20 = hikariConfig1.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45008" + "'", str9, "HikariPool-45008");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16109");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.lang.String str7 = hikariConfig6.getDataSourceClassName();
        hikariConfig6.setTransactionIsolation("hi!");
        hikariConfig6.acquireRetryDelay = '4';
        hikariConfig6.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties14 = hikariConfig6.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.util.Properties properties17 = hikariConfig16.getDataSourceProperties();
        int int18 = hikariConfig16.acquireIncrement;
        hikariConfig16.setAcquireIncrement(60);
        java.lang.String str21 = hikariConfig16.transactionIsolationName;
        hikariConfig16.maxPoolSize = (short) 10;
        boolean boolean24 = hikariConfig16.isIsolateInternalQueries;
        hikariConfig16.catalog = "HikariPool-10205";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test16110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16110");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.isReadOnly = false;
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.jdbcUrl = "HikariPool-833";
        hikariConfig1.setDataSourceClassName("HikariPool-180");
        long long22 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource27 = hikariConfig24.getDataSource();
        hikariConfig24.connectionTestQuery = "HikariPool-55";
        hikariConfig24.connectionTestQuery = "hi!";
        java.lang.String str32 = hikariConfig24.poolName;
        hikariConfig24.setReadOnly(true);
        boolean boolean35 = hikariConfig24.isIsolateInternalQueries();
        hikariConfig24.transactionIsolationName = "HikariPool-97";
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        long long40 = hikariConfig39.getAcquireRetryDelay();
        hikariConfig39.connectionInitSql = "hi!";
        hikariConfig39.acquireIncrement = (byte) 100;
        hikariConfig39.setMinimumPoolSize((int) (short) 0);
        hikariConfig39.connectionTestQuery = "";
        hikariConfig39.jdbcUrl = "HikariPool-45";
        boolean boolean51 = hikariConfig39.isRegisterMbeans;
        hikariConfig39.isIsolateInternalQueries = true;
        hikariConfig39.idleTimeout = 100;
        java.lang.String str56 = hikariConfig39.connectionTestQuery;
        hikariConfig39.maxPoolSize = (short) -1;
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        long long61 = hikariConfig60.getAcquireRetryDelay();
        hikariConfig60.idleTimeout = (-1);
        java.util.Properties properties64 = hikariConfig60.getDataSourceProperties();
        hikariConfig39.dataSourceProperties = properties64;
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig24.dataSourceProperties = properties64;
        hikariConfig1.setDataSourceProperties(properties64);
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties64);
        long long70 = hikariConfig69.connectionTimeout;
        boolean boolean71 = hikariConfig69.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-45014" + "'", str32, "HikariPool-45014");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 32L + "'", long61 == 32L);
        org.junit.Assert.assertNotNull(properties64);
// flaky:         org.junit.Assert.assertTrue("'" + long70 + "' != '" + 3L + "'", long70 == 3L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test16111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16111");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.connectionTimeout = '4';
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAcquireIncrement((int) ' ');
        hikariConfig1.setConnectionInitSql("HikariPool-12472");
        hikariConfig1.maxPoolSize = (byte) 0;
        hikariConfig1.jdbcUrl = "HikariPool-14200";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test16112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16112");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setMaxLifetime(100L);
        hikariConfig1.isIsolateInternalQueries = true;
        int int10 = hikariConfig1.getMaximumPoolSize();
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test16113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16113");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-25135");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-25135 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16114");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        long long11 = hikariConfig1.connectionTimeout;
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        java.lang.String str13 = hikariConfig1.catalog;
        int int14 = hikariConfig1.getAcquireRetries();
        hikariConfig1.acquireRetries = 0;
        int int17 = hikariConfig1.maxPoolSize;
        java.lang.String str18 = hikariConfig1.poolName;
        boolean boolean19 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties20 = hikariConfig1.dataSourceProperties;
        long long21 = hikariConfig1.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-45022" + "'", str18, "HikariPool-45022");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test16115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16115");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        int int9 = hikariConfig1.minPoolSize;
        hikariConfig1.setCatalog("HikariPool-160");
        boolean boolean12 = hikariConfig1.isReadOnly;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setMaximumPoolSize((int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16116");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.poolName = "HikariPool-12952";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test16117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16117");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionTestQuery("HikariPool-114");
        long long13 = hikariConfig1.getMaxLifetime();
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.acquireRetries = 0;
        int int17 = hikariConfig1.transactionIsolation;
        boolean boolean18 = hikariConfig1.isAutoCommit();
        java.lang.String str19 = hikariConfig1.getDataSourceClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16118");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test16119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16119");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.maxLifetime = 3;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.idleTimeout = (-1);
        hikariConfig10.setMaximumPoolSize((int) 'a');
        long long16 = hikariConfig10.getLeakDetectionThreshold();
        java.lang.String str17 = hikariConfig10.catalog;
        long long18 = hikariConfig10.getMaxLifetime();
        boolean boolean19 = hikariConfig10.isReadOnly;
        long long20 = hikariConfig10.getIdleTimeout();
        java.util.Properties properties21 = hikariConfig10.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties21;
        int int23 = hikariConfig1.maxPoolSize;
        boolean boolean24 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test16120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16120");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig14.setDriverClassName("HikariPool-43724");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-43724' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test16121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16121");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        java.util.Properties properties5 = hikariConfig1.dataSourceProperties;
        java.lang.String str6 = hikariConfig1.getCatalog();
        long long7 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setConnectionTestQuery("HikariPool-1202");
        int int12 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test16122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16122");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setCatalog("HikariPool-104");
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        int int14 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionTestQuery("HikariPool-8632");
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test16123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16123");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        hikariConfig1.dataSourceClassName = "HikariPool-172";
        hikariConfig1.setTransactionIsolation("HikariPool-55");
        hikariConfig1.setJdbcUrl("HikariPool-349");
        long long19 = hikariConfig1.acquireRetryDelay;
        int int20 = hikariConfig1.transactionIsolation;
        hikariConfig1.isJdbc4connectionTest = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test16124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16124");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        hikariConfig1.jdbcUrl = "HikariPool-84";
        hikariConfig1.setAcquireRetries(0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-42167");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-42167' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test16125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16125");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-33");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-33 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16126");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-18477");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-18477 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16127");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.poolName = "HikariPool-127";
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        hikariConfig1.transactionIsolation = 0;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        java.lang.String str17 = hikariConfig16.getDataSourceClassName();
        int int18 = hikariConfig16.getAcquireRetries();
        hikariConfig16.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig16.setDataSource(dataSource21);
        hikariConfig16.transactionIsolation = (byte) 10;
        int int25 = hikariConfig16.acquireIncrement;
        hikariConfig16.acquireRetryDelay = 100;
        java.util.Properties properties28 = hikariConfig16.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties28);
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setReadOnly(true);
        hikariConfig1.isAutoCommit = false;
        java.lang.String str38 = hikariConfig1.connectionInitSql;
        int int39 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test16128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16128");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.maxLifetime = 3;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.idleTimeout = (-1);
        hikariConfig10.setMaximumPoolSize((int) 'a');
        long long16 = hikariConfig10.getLeakDetectionThreshold();
        java.lang.String str17 = hikariConfig10.catalog;
        long long18 = hikariConfig10.getMaxLifetime();
        boolean boolean19 = hikariConfig10.isReadOnly;
        long long20 = hikariConfig10.getIdleTimeout();
        java.util.Properties properties21 = hikariConfig10.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties21;
        hikariConfig1.acquireIncrement = '4';
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test16129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16129");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.transactionIsolation = (byte) -1;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        boolean boolean14 = hikariConfig1.isReadOnly();
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireRetries(0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer18;
        hikariConfig1.connectionTestQuery = "HikariPool-761";
        hikariConfig1.transactionIsolation = (short) 0;
        int int24 = hikariConfig1.getAcquireIncrement();
        java.lang.String str25 = hikariConfig1.getDataSourceClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test16130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16130");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        long long14 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig13.connectionInitSql = "hi!";
        hikariConfig13.acquireIncrement = (byte) 100;
        hikariConfig13.setMinimumPoolSize((int) (short) 0);
        hikariConfig13.connectionTestQuery = "";
        hikariConfig13.jdbcUrl = "HikariPool-45";
        hikariConfig13.isReadOnly = false;
        hikariConfig13.setPoolName("");
        java.lang.String str29 = hikariConfig13.getConnectionTestQuery();
        java.util.Properties properties30 = hikariConfig13.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig1.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties30);
        int int35 = hikariConfig34.transactionIsolation;
        long long36 = hikariConfig34.idleTimeout;
        hikariConfig34.setIdleTimeout((long) (byte) -1);
        long long39 = hikariConfig34.getLeakDetectionThreshold();
        long long40 = hikariConfig34.acquireRetryDelay;
        hikariConfig34.setConnectionTestQuery("HikariPool-27792");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-45" + "'", str11, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1800000L + "'", long36 == 1800000L);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
    }

    @Test
    public void test16131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16131");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig1.setDataSourceClassName("HikariPool-383");
        long long17 = hikariConfig1.getIdleTimeout();
        java.lang.String str18 = hikariConfig1.connectionCustomizerClassName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-11164");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-11164' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16132");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.connectionInitSql = "HikariPool-195";
        hikariConfig1.setConnectionInitSql("HikariPool-109");
        int int20 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-45");
        boolean boolean23 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.maxPoolSize = '#';
        hikariConfig1.setIsolateInternalQueries(true);
        boolean boolean28 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45061" + "'", str9, "HikariPool-45061");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45061" + "'", str13, "HikariPool-45061");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test16133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16133");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        int int9 = hikariConfig1.getMaximumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test16134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16134");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-69");
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.acquireIncrement = (short) -1;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(false);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        java.lang.String str20 = hikariConfig19.getDataSourceClassName();
        hikariConfig19.setTransactionIsolation("hi!");
        hikariConfig19.acquireRetryDelay = '4';
        hikariConfig19.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties27 = hikariConfig19.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig29.setAutoCommit(true);
        hikariConfig29.minPoolSize = '#';
        java.util.Properties properties34 = hikariConfig29.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties34;
        boolean boolean36 = hikariConfig1.isAutoCommit;
        int int37 = hikariConfig1.getAcquireRetries();
        int int38 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60 + "'", int38 == 60);
    }

    @Test
    public void test16135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16135");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        hikariConfig1.isIsolateInternalQueries = true;
        boolean boolean14 = hikariConfig1.isAutoCommit();
        int int15 = hikariConfig1.acquireIncrement;
        boolean boolean16 = hikariConfig1.isReadOnly;
        hikariConfig1.setAcquireIncrement((int) (short) 10);
        java.lang.String str19 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test16136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16136");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        long long7 = hikariConfig1.getConnectionTimeout();
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isAutoCommit = false;
        int int11 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig14.setAcquireRetries(0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test16137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16137");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean16 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test16138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16138");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.idleTimeout = 100;
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
        boolean boolean19 = hikariConfig1.isReadOnly();
        hikariConfig1.setJdbcUrl("HikariPool-1096");
        java.lang.String str22 = hikariConfig1.dataSourceClassName;
        java.lang.String str23 = hikariConfig1.getPoolName();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setLeakDetectionThreshold(60L);
        int int28 = hikariConfig1.maxPoolSize;
        hikariConfig1.setIsolateInternalQueries(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-45072" + "'", str23, "HikariPool-45072");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
    }

    @Test
    public void test16139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16139");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.jdbcUrl;
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.idleTimeout = 1;
        hikariConfig1.setMaximumPoolSize((int) '4');
        int int14 = hikariConfig1.transactionIsolation;
        hikariConfig1.isIsolateInternalQueries = false;
        int int17 = hikariConfig1.acquireIncrement;
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
        int int19 = hikariConfig1.minPoolSize;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-43833");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test16140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16140");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaxLifetime(32L);
        int int15 = hikariConfig1.acquireIncrement;
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMinimumPoolSize(0);
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        long long24 = hikariConfig22.maxLifetime;
        java.util.Properties properties25 = hikariConfig22.getDataSourceProperties();
        hikariConfig22.isIsolateInternalQueries = false;
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        boolean boolean30 = hikariConfig29.isInitializationFailFast();
        long long31 = hikariConfig29.maxLifetime;
        java.util.Properties properties32 = hikariConfig29.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig22.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig35.setJdbcUrl("HikariPool-184");
        boolean boolean38 = hikariConfig35.isInitializationFailFast;
        hikariConfig1.addDataSourceProperty("HikariPool-16218", (java.lang.Object) boolean38);
        java.lang.String str40 = hikariConfig1.poolName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-45075" + "'", str40, "HikariPool-45075");
    }

    @Test
    public void test16141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16141");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setAcquireIncrement((int) '4');
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16142");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.connectionInitSql;
        int int4 = hikariConfig1.transactionIsolation;
        hikariConfig1.catalog = "HikariPool-602";
        hikariConfig1.connectionInitSql = "HikariPool-14180";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test16143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16143");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setUseInstrumentation(false);
        long long10 = hikariConfig1.leakDetectionThreshold;
        int int11 = hikariConfig1.acquireIncrement;
        hikariConfig1.idleTimeout = 60L;
        hikariConfig1.maxLifetime = 3L;
        hikariConfig1.jdbcUrl = "HikariPool-520";
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(false);
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.lang.String str26 = hikariConfig25.getDataSourceClassName();
        hikariConfig25.setTransactionIsolation("hi!");
        hikariConfig25.acquireRetryDelay = '4';
        hikariConfig25.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties33 = hikariConfig25.getDataSourceProperties();
        hikariConfig20.setDataSourceProperties(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig35.leakDetectionThreshold = ' ';
        long long38 = hikariConfig35.getMaxLifetime();
        java.lang.String str39 = hikariConfig35.getCatalog();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        java.lang.String str42 = hikariConfig41.getDataSourceClassName();
        hikariConfig41.setTransactionIsolation("hi!");
        hikariConfig41.acquireRetryDelay = '4';
        hikariConfig41.setConnectionTimeout((long) (short) 0);
        hikariConfig41.setConnectionTestQuery("HikariPool-45");
        long long51 = hikariConfig41.connectionTimeout;
        hikariConfig41.setMaxLifetime(1L);
        java.lang.String str54 = hikariConfig41.getJdbcUrl();
        hikariConfig41.setUseInstrumentation(true);
        hikariConfig41.setConnectionInitSql("HikariPool-195");
        hikariConfig41.connectionTimeout = 3L;
        java.util.Properties properties61 = hikariConfig41.getDataSourceProperties();
        hikariConfig35.setDataSourceProperties(properties61);
        hikariConfig1.addDataSourceProperty("HikariPool-9334", (java.lang.Object) properties61);
        hikariConfig1.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties33);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 2147483647L + "'", long51 == 2147483647L);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(properties61);
    }

    @Test
    public void test16144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16144");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setTransactionIsolation("HikariPool-77");
        hikariConfig1.connectionCustomizerClassName = "";
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.maxLifetime = 10L;
        boolean boolean12 = hikariConfig1.isAutoCommit;
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        int int14 = hikariConfig1.acquireRetries;
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test16145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16145");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig6.maxPoolSize = (byte) 0;
        java.util.Properties properties9 = hikariConfig6.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig1.dataSourceProperties = properties9;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        java.lang.String str15 = hikariConfig14.getDataSourceClassName();
        int int16 = hikariConfig14.getAcquireRetries();
        hikariConfig14.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig14.setDataSource(dataSource19);
        hikariConfig14.poolName = "HikariPool-127";
        long long23 = hikariConfig14.getIdleTimeout();
        java.lang.String str24 = hikariConfig14.getConnectionTestQuery();
        java.lang.String str25 = hikariConfig14.connectionInitSql;
        hikariConfig14.transactionIsolation = 0;
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        java.lang.String str30 = hikariConfig29.getDataSourceClassName();
        int int31 = hikariConfig29.getAcquireRetries();
        hikariConfig29.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource34 = null;
        hikariConfig29.setDataSource(dataSource34);
        hikariConfig29.transactionIsolation = (byte) 10;
        int int38 = hikariConfig29.acquireIncrement;
        hikariConfig29.acquireRetryDelay = 100;
        java.util.Properties properties41 = hikariConfig29.dataSourceProperties;
        hikariConfig14.setDataSourceProperties(properties41);
        hikariConfig1.dataSourceProperties = properties41;
        hikariConfig1.connectionTimeout = 0;
        hikariConfig1.setDataSourceClassName("HikariPool-1168");
        hikariConfig1.isIsolateInternalQueries = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test16146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16146");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("HikariPool-486");
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16147");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        long long7 = hikariConfig6.getAcquireRetryDelay();
        hikariConfig6.connectionInitSql = "hi!";
        hikariConfig6.acquireIncrement = (byte) 100;
        hikariConfig6.setMinimumPoolSize((int) (short) 0);
        java.lang.String str14 = hikariConfig6.dataSourceClassName;
        long long15 = hikariConfig6.getAcquireRetryDelay();
        hikariConfig6.idleTimeout = (byte) -1;
        java.util.Properties properties18 = hikariConfig6.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties18;
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig1.dataSource = dataSource24;
        java.lang.String str26 = hikariConfig1.getConnectionCustomizerClassName();
        long long27 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        long long30 = hikariConfig29.getAcquireRetryDelay();
        hikariConfig29.idleTimeout = (-1);
        java.util.Properties properties33 = hikariConfig29.getDataSourceProperties();
        long long34 = hikariConfig29.maxLifetime;
        hikariConfig29.setConnectionInitSql("");
        int int37 = hikariConfig29.acquireRetries;
        hikariConfig29.leakDetectionThreshold = (-1);
        hikariConfig29.leakDetectionThreshold = (short) -1;
        javax.sql.DataSource dataSource42 = hikariConfig29.dataSource;
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        long long45 = hikariConfig44.getAcquireRetryDelay();
        hikariConfig44.connectionInitSql = "hi!";
        hikariConfig44.acquireIncrement = (byte) 100;
        int int50 = hikariConfig44.minPoolSize;
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        long long53 = hikariConfig52.getAcquireRetryDelay();
        hikariConfig52.connectionInitSql = "hi!";
        hikariConfig52.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig52.transactionIsolation = (byte) 0;
        java.util.Properties properties60 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties60);
        long long62 = hikariConfig61.getAcquireRetryDelay();
        hikariConfig61.idleTimeout = (-1);
        java.util.Properties properties65 = hikariConfig61.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties65);
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties65);
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties65);
        hikariConfig52.setDataSourceProperties(properties65);
        hikariConfig44.setDataSourceProperties(properties65);
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties65);
        hikariConfig29.dataSourceProperties = properties65;
        hikariConfig1.setDataSourceProperties(properties65);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertNotNull(properties33);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNull(dataSource42);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 32L + "'", long45 == 32L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long53 + "' != '" + 32L + "'", long53 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long62 + "' != '" + 32L + "'", long62 == 32L);
        org.junit.Assert.assertNotNull(properties65);
    }

    @Test
    public void test16148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16148");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.leakDetectionThreshold = 0L;
        hikariConfig1.jdbcUrl = "HikariPool-258";
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.connectionInitSql = "HikariPool-133";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
    }

    @Test
    public void test16149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16149");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long15 = hikariConfig14.getAcquireRetryDelay();
        hikariConfig14.connectionInitSql = "hi!";
        hikariConfig14.acquireIncrement = (byte) 100;
        hikariConfig14.setMinimumPoolSize((int) (short) 0);
        hikariConfig14.connectionTestQuery = "";
        long long24 = hikariConfig14.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = null;
        hikariConfig14.connectionCustomizer = iConnectionCustomizer25;
        java.lang.String str27 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.transactionIsolationName = "HikariPool-55";
        java.lang.String str30 = hikariConfig14.dataSourceClassName;
        hikariConfig14.setJdbcUrl("HikariPool-160");
        hikariConfig14.setConnectionInitSql("HikariPool-333");
        boolean boolean35 = hikariConfig14.isReadOnly;
        hikariConfig1.addDataSourceProperty("HikariPool-2126", (java.lang.Object) boolean35);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test16150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16150");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionTestQuery("HikariPool-114");
        long long13 = hikariConfig1.getMaxLifetime();
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setIdleTimeout((long) 358);
        hikariConfig1.acquireIncrement = 1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test16151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16151");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.isReadOnly = false;
        hikariConfig1.setPoolName("");
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.connectionInitSql = "HikariPool-548";
        java.lang.String str22 = hikariConfig1.connectionInitSql;
        long long23 = hikariConfig1.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-548" + "'", str22, "HikariPool-548");
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3L + "'", long23 == 3L);
    }

    @Test
    public void test16152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16152");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.poolName = "hi!";
        int int13 = hikariConfig10.acquireIncrement;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.idleTimeout = (-1);
        hikariConfig16.setMaximumPoolSize((int) 'a');
        java.lang.String str22 = hikariConfig16.catalog;
        boolean boolean23 = hikariConfig16.isJdbc4ConnectionTest();
        hikariConfig16.setMinimumPoolSize(0);
        int int26 = hikariConfig16.getMaximumPoolSize();
        hikariConfig16.acquireRetries = 97;
        boolean boolean29 = hikariConfig16.isInitializationFailFast;
        hikariConfig16.maxPoolSize = 'a';
        java.util.Properties properties32 = hikariConfig16.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        long long34 = hikariConfig33.getAcquireRetryDelay();
        hikariConfig10.addDataSourceProperty("HikariPool-516", (java.lang.Object) hikariConfig33);
        java.lang.String str36 = hikariConfig10.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test16153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16153");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        boolean boolean5 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setConnectionTimeout((long) 358);
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.acquireIncrement = 60;
        long long11 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test16154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16154");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        int int12 = hikariConfig1.transactionIsolation;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setAcquireIncrement((int) 'a');
        int int16 = hikariConfig1.maxPoolSize;
        hikariConfig1.setConnectionTestQuery("HikariPool-258");
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        java.lang.String str21 = hikariConfig20.getDataSourceClassName();
        int int22 = hikariConfig20.getAcquireRetries();
        hikariConfig20.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig20.setDataSource(dataSource25);
        java.lang.String str27 = hikariConfig20.getConnectionTestQuery();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        long long30 = hikariConfig29.getAcquireRetryDelay();
        hikariConfig29.connectionInitSql = "hi!";
        hikariConfig29.acquireIncrement = (byte) 100;
        hikariConfig29.setMinimumPoolSize((int) (short) 0);
        hikariConfig29.connectionTestQuery = "";
        hikariConfig29.jdbcUrl = "HikariPool-45";
        hikariConfig29.isReadOnly = false;
        hikariConfig29.setPoolName("");
        java.lang.String str45 = hikariConfig29.getConnectionTestQuery();
        java.util.Properties properties46 = hikariConfig29.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig20.setDataSourceProperties(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties46);
        hikariConfig1.dataSourceProperties = properties46;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties46);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties46);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNull(str27);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(properties46);
    }

    @Test
    public void test16155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16155");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.transactionIsolation = (byte) -1;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        boolean boolean14 = hikariConfig1.isReadOnly();
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAcquireIncrement(97);
        boolean boolean18 = hikariConfig1.isInitializationFailFast;
        long long19 = hikariConfig1.getConnectionTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
    }

    @Test
    public void test16156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16156");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.lang.String str7 = hikariConfig6.getDataSourceClassName();
        hikariConfig6.setTransactionIsolation("hi!");
        hikariConfig6.acquireRetryDelay = '4';
        hikariConfig6.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties14 = hikariConfig6.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.util.Properties properties17 = hikariConfig16.getDataSourceProperties();
        boolean boolean18 = hikariConfig16.isJdbc4connectionTest;
        int int19 = hikariConfig16.acquireRetries;
        javax.sql.DataSource dataSource20 = hikariConfig16.dataSource;
        hikariConfig16.transactionIsolation = 1;
        long long23 = hikariConfig16.idleTimeout;
        int int24 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(dataSource20);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1800000L + "'", long23 == 1800000L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test16157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16157");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.jdbcUrl = "HikariPool-278";
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.connectionInitSql = "hi!";
        hikariConfig16.acquireIncrement = (byte) 100;
        hikariConfig16.setJdbcUrl("");
        hikariConfig16.setConnectionTimeout((long) 100);
        long long26 = hikariConfig16.connectionTimeout;
        java.lang.String str27 = hikariConfig16.dataSourceClassName;
        java.lang.String str28 = hikariConfig16.catalog;
        int int29 = hikariConfig16.getAcquireRetries();
        hikariConfig16.acquireRetries = 0;
        int int32 = hikariConfig16.maxPoolSize;
        java.lang.String str33 = hikariConfig16.poolName;
        boolean boolean34 = hikariConfig16.isInitializationFailFast;
        java.util.Properties properties35 = hikariConfig16.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties35;
        java.util.Properties properties37 = hikariConfig1.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-10318");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-10318' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-45131" + "'", str33, "HikariPool-45131");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties37);
    }

    @Test
    public void test16158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16158");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = (byte) 10;
        hikariConfig1.isReadOnly = false;
        hikariConfig1.acquireRetryDelay = 5000L;
        java.lang.String str17 = hikariConfig1.getPoolName();
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.transactionIsolation = 358;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.poolName = "HikariPool-127";
        hikariConfig1.connectionTestQuery = "HikariPool-1203";
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setDataSourceClassName("HikariPool-840");
        java.lang.String str31 = hikariConfig1.connectionCustomizerClassName;
        long long32 = hikariConfig1.maxLifetime;
        boolean boolean33 = hikariConfig1.isInitializationFailFast();
        java.lang.String str34 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaxLifetime((long) (byte) 0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45132" + "'", str17, "HikariPool-45132");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-1203" + "'", str34, "HikariPool-1203");
    }

    @Test
    public void test16159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16159");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        hikariConfig1.setIsolateInternalQueries(false);
        int int11 = hikariConfig1.transactionIsolation;
        long long12 = hikariConfig1.leakDetectionThreshold;
        boolean boolean13 = hikariConfig1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-12399");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-12399' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16160");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.minPoolSize = 35;
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test16161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16161");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.leakDetectionThreshold = 0L;
        hikariConfig10.jdbcUrl = "HikariPool-279";
        javax.sql.DataSource dataSource15 = null;
        hikariConfig10.setDataSource(dataSource15);
        long long17 = hikariConfig10.leakDetectionThreshold;
        hikariConfig10.catalog = "HikariPool-176";
        hikariConfig10.connectionTestQuery = "";
        long long22 = hikariConfig10.getIdleTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test16162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16162");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.jdbcUrl;
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.idleTimeout = 1;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        java.lang.String str13 = hikariConfig1.getJdbcUrl();
        long long14 = hikariConfig1.getMaxLifetime();
        java.lang.String str15 = hikariConfig1.jdbcUrl;
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16163");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        int int12 = hikariConfig1.transactionIsolation;
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-481";
        hikariConfig1.setTransactionIsolation("HikariPool-355");
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.connectionTimeout = (byte) 1;
        hikariConfig1.setIdleTimeout(100L);
        long long23 = hikariConfig1.getLeakDetectionThreshold();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test16164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16164");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.setPoolName("HikariPool-167");
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        int int16 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.jdbcUrl = "HikariPool-580";
        java.lang.String str19 = hikariConfig1.getCatalog();
        java.lang.String str20 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45144" + "'", str9, "HikariPool-45144");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16165");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.acquireRetries = 0;
        java.lang.String str8 = hikariConfig1.poolName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.jdbcUrl = "HikariPool-1047";
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setCatalog("HikariPool-17978");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-45145" + "'", str8, "HikariPool-45145");
        org.junit.Assert.assertNull(iConnectionCustomizer9);
    }

    @Test
    public void test16166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16166");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.jdbcUrl = "HikariPool-281";
        java.lang.String str13 = hikariConfig10.jdbcUrl;
        hikariConfig10.isInitializationFailFast = true;
        hikariConfig10.setInitializationFailFast(true);
        hikariConfig10.isInitializationFailFast = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-281" + "'", str13, "HikariPool-281");
    }

    @Test
    public void test16167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16167");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.setPoolName("HikariPool-167");
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        int int16 = hikariConfig1.getMinimumPoolSize();
        int int17 = hikariConfig1.getMaximumPoolSize();
        boolean boolean18 = hikariConfig1.isAutoCommit;
        hikariConfig1.idleTimeout = 1;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45149" + "'", str9, "HikariPool-45149");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test16168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16168");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str9 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.leakDetectionThreshold = (byte) 10;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45150" + "'", str9, "HikariPool-45150");
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test16169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16169");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        int int9 = hikariConfig1.acquireRetries;
        long long10 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.catalog = "HikariPool-73";
        hikariConfig1.setIdleTimeout(1800000L);
        hikariConfig1.acquireRetryDelay = (short) -1;
        hikariConfig1.setConnectionInitSql("HikariPool-41872");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test16170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16170");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setIdleTimeout(52L);
        int int17 = hikariConfig1.maxPoolSize;
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test16171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16171");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        int int10 = hikariConfig1.maxPoolSize;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str13 = hikariConfig1.poolName;
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str16 = hikariConfig1.getCatalog();
        hikariConfig1.poolName = "HikariPool-636";
        hikariConfig1.setUseInstrumentation(false);
        long long21 = hikariConfig1.acquireRetryDelay;
        java.lang.Class<?> wildcardClass22 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45153" + "'", str13, "HikariPool-45153");
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test16172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16172");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        java.lang.String str5 = hikariConfig1.getJdbcUrl();
        hikariConfig1.idleTimeout = (-1L);
        hikariConfig1.setConnectionTimeout((long) 0);
        hikariConfig1.transactionIsolationName = "";
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.dataSource = dataSource12;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test16173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16173");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        int int8 = hikariConfig1.maxPoolSize;
        hikariConfig1.setPoolName("HikariPool-349");
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        int int12 = hikariConfig1.getAcquireIncrement();
        boolean boolean13 = hikariConfig1.isAutoCommit;
        hikariConfig1.acquireRetryDelay = 2147483647L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16174");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.isReadOnly = false;
        hikariConfig1.setPoolName("");
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties18 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.connectionTestQuery = "HikariPool-2073";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test16175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16175");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        boolean boolean10 = hikariConfig1.isReadOnly();
        hikariConfig1.setTransactionIsolation("HikariPool-809");
        hikariConfig1.acquireRetryDelay = 0L;
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
        java.lang.String str16 = hikariConfig1.connectionTestQuery;
        java.lang.String str17 = hikariConfig1.getPoolName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-809" + "'", str15, "HikariPool-809");
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45157" + "'", str17, "HikariPool-45157");
    }

    @Test
    public void test16176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16176");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = (short) 100;
        hikariConfig1.acquireIncrement = 97;
        long long10 = hikariConfig1.getMaxLifetime();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test16177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16177");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1173";
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.idleTimeout = (byte) 10;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test16178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16178");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.connectionTestQuery = "HikariPool-45";
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolation = 0;
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str18 = hikariConfig1.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16179");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str9 = hikariConfig1.catalog;
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setMaximumPoolSize((int) '#');
        hikariConfig1.setConnectionInitSql("HikariPool-429");
        long long15 = hikariConfig1.acquireRetryDelay;
        int int16 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test16180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16180");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-21646");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-21646 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16181");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setPoolName("HikariPool-541");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer16;
        boolean boolean18 = hikariConfig1.isReadOnly();
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.catalog = "HikariPool-14863";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16182");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("");
        long long16 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setAutoCommit(false);
        boolean boolean21 = hikariConfig1.isReadOnly;
        long long22 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45166" + "'", str9, "HikariPool-45166");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45166" + "'", str13, "HikariPool-45166");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test16183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16183");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.maxLifetime;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str11 = hikariConfig1.catalog;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16184");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.idleTimeout = (-1);
        java.util.Properties properties21 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) properties21);
        hikariConfig1.maxPoolSize = 3;
        boolean boolean25 = hikariConfig1.isAutoCommit();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setAutoCommit(true);
        java.lang.String str30 = hikariConfig1.getCatalog();
        boolean boolean31 = hikariConfig1.isRegisterMbeans;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test16185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16185");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str9 = hikariConfig1.poolName;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45171" + "'", str9, "HikariPool-45171");
    }

    @Test
    public void test16186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16186");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaxLifetime((long) 100);
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.setIsolateInternalQueries(false);
        boolean boolean17 = hikariConfig1.isIsolateInternalQueries();
        int int18 = hikariConfig1.getAcquireRetries();
        hikariConfig1.isReadOnly = true;
        hikariConfig1.setConnectionTimeout(0L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test16187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16187");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        hikariConfig1.setTransactionIsolation("HikariPool-114");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        java.lang.String str16 = hikariConfig1.catalog;
        hikariConfig1.maxLifetime = 0L;
        java.lang.String str19 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16188");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.poolName = "HikariPool-495";
        int int14 = hikariConfig1.getAcquireRetries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test16189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16189");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        boolean boolean17 = hikariConfig1.isReadOnly;
        hikariConfig1.transactionIsolation = 97;
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        java.lang.String str21 = hikariConfig1.getConnectionInitSql();
        long long22 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45179" + "'", str9, "HikariPool-45179");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
    }

    @Test
    public void test16190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16190");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str14 = hikariConfig13.getDataSourceClassName();
        hikariConfig13.setTransactionIsolation("hi!");
        hikariConfig13.acquireRetryDelay = '4';
        hikariConfig13.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties21 = hikariConfig13.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long26 = hikariConfig25.getMaxLifetime();
        int int27 = hikariConfig25.getMinimumPoolSize();
        hikariConfig25.setPoolName("HikariPool-4093");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test16191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16191");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-19264");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-19264 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16192");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        long long8 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setConnectionTestQuery("HikariPool-3788");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test16193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16193");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.transactionIsolation = (byte) 10;
        int int10 = hikariConfig1.acquireIncrement;
        hikariConfig1.acquireIncrement = (byte) 10;
        hikariConfig1.transactionIsolationName = "HikariPool-109";
        hikariConfig1.dataSourceClassName = "HikariPool-45";
        hikariConfig1.acquireRetryDelay = (short) 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test16194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16194");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.minPoolSize = (byte) 10;
        boolean boolean18 = hikariConfig1.isInitializationFailFast;
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.dataSource = dataSource19;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16195");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.minPoolSize = (byte) 10;
        hikariConfig1.dataSourceClassName = "";
        long long17 = hikariConfig1.getAcquireRetryDelay();
        int int18 = hikariConfig1.transactionIsolation;
        hikariConfig1.setIdleTimeout((long) 3);
        boolean boolean21 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
        long long23 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45190" + "'", str9, "HikariPool-45190");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(dataSource22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3L + "'", long23 == 3L);
    }

    @Test
    public void test16196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16196");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str13 = hikariConfig1.getPoolName();
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.maxLifetime = (byte) 0;
        boolean boolean18 = hikariConfig1.isReadOnly;
        int int19 = hikariConfig1.maxPoolSize;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-40570";
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45191" + "'", str9, "HikariPool-45191");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45191" + "'", str13, "HikariPool-45191");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test16197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16197");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (short) 0;
        hikariConfig1.isIsolateInternalQueries = false;
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        hikariConfig1.poolName = "HikariPool-23153";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test16198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16198");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        long long5 = hikariConfig1.acquireRetryDelay;
        long long6 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16199");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setPoolName("HikariPool-753");
        hikariConfig0.catalog = "HikariPool-431";
        hikariConfig0.setMaximumPoolSize(60);
    }

    @Test
    public void test16200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16200");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.maxLifetime;
        hikariConfig1.dataSourceClassName = "HikariPool-114";
        hikariConfig1.setMaximumPoolSize(0);
        java.lang.String str14 = hikariConfig1.getPoolName();
        boolean boolean15 = hikariConfig1.isIsolateInternalQueries;
        java.lang.Class<?> wildcardClass16 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-45195" + "'", str14, "HikariPool-45195");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16201");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        int int5 = hikariConfig1.acquireIncrement;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer6;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test16202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16202");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.maxLifetime = (short) 10;
        int int9 = hikariConfig1.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        boolean boolean11 = hikariConfig1.isAutoCommit;
        boolean boolean12 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16203");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        int int12 = hikariConfig1.getMaximumPoolSize();
        long long13 = hikariConfig1.maxLifetime;
        long long14 = hikariConfig1.connectionTimeout;
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.minPoolSize = 100;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test16204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16204");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        int int9 = hikariConfig1.getTransactionIsolation();
        int int10 = hikariConfig1.minPoolSize;
        boolean boolean11 = hikariConfig1.isReadOnly();
        javax.sql.DataSource dataSource12 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test16205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16205");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        int int12 = hikariConfig1.transactionIsolation;
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.connectionInitSql = "hi!";
        hikariConfig16.acquireIncrement = (byte) 100;
        hikariConfig16.setMinimumPoolSize((int) (short) 0);
        java.lang.String str24 = hikariConfig16.dataSourceClassName;
        long long25 = hikariConfig16.getAcquireRetryDelay();
        boolean boolean26 = hikariConfig16.isRegisterMbeans;
        int int27 = hikariConfig16.transactionIsolation;
        java.util.Properties properties28 = hikariConfig16.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig1.setDataSourceProperties(properties28);
        long long31 = hikariConfig1.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer32 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer32;
        boolean boolean34 = hikariConfig1.isAutoCommit();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test16206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16206");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13854");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13854 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16207");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        long long17 = hikariConfig1.connectionTimeout;
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
        hikariConfig1.leakDetectionThreshold = 10;
        hikariConfig1.leakDetectionThreshold = (byte) 1;
        boolean boolean23 = hikariConfig1.isJdbc4ConnectionTest();
        long long24 = hikariConfig1.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test16208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16208");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        java.lang.String str6 = hikariConfig1.jdbcUrl;
        hikariConfig1.maxPoolSize = 358;
        hikariConfig1.poolName = "HikariPool-268";
        hikariConfig1.connectionInitSql = "HikariPool-214";
        int int13 = hikariConfig1.acquireIncrement;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        int int15 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test16209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16209");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.poolName = "HikariPool-127";
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        long long12 = hikariConfig1.idleTimeout;
        hikariConfig1.transactionIsolation = (short) 10;
        java.lang.String str15 = hikariConfig1.jdbcUrl;
        hikariConfig1.setIdleTimeout(5000L);
        hikariConfig1.connectionTestQuery = "HikariPool-14953";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16210");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        java.lang.String str5 = hikariConfig1.catalog;
        hikariConfig1.acquireRetries = '4';
        java.lang.String str8 = hikariConfig1.poolName;
        hikariConfig1.minPoolSize = 100;
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-45215" + "'", str8, "HikariPool-45215");
    }

    @Test
    public void test16211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16211");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.transactionIsolationName;
        java.util.Properties properties3 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties3);
        long long5 = hikariConfig4.getAcquireRetryDelay();
        hikariConfig4.connectionInitSql = "hi!";
        hikariConfig4.acquireIncrement = (byte) 100;
        hikariConfig4.setMinimumPoolSize((int) (short) 0);
        hikariConfig4.connectionTestQuery = "";
        hikariConfig4.jdbcUrl = "HikariPool-45";
        hikariConfig4.dataSourceClassName = "hi!";
        hikariConfig4.setIdleTimeout((long) (short) 100);
        java.lang.String str20 = hikariConfig4.jdbcUrl;
        hikariConfig0.addDataSourceProperty("HikariPool-300", (java.lang.Object) str20);
        hikariConfig0.transactionIsolation = (byte) 10;
        java.lang.String str24 = hikariConfig0.getCatalog();
        boolean boolean25 = hikariConfig0.isReadOnly();
        boolean boolean26 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-45" + "'", str20, "HikariPool-45");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test16212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16212");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        long long7 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.maxLifetime = ' ';
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.acquireIncrement = (byte) -1;
        long long13 = hikariConfig1.idleTimeout;
        hikariConfig1.setTransactionIsolation("HikariPool-921");
        hikariConfig1.setTransactionIsolation("HikariPool-1069");
        hikariConfig1.setConnectionTimeout((long) (byte) 100);
        int int20 = hikariConfig1.acquireRetries;
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test16213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16213");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout(2147483647L);
        hikariConfig1.setReadOnly(false);
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean13 = hikariConfig1.isReadOnly();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16214");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setMaxLifetime(100L);
        int int8 = hikariConfig1.getAcquireRetries();
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        int int12 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        long long15 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
    }

    @Test
    public void test16215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16215");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        java.lang.String str5 = hikariConfig1.getCatalog();
        java.lang.String str6 = hikariConfig1.catalog;
        hikariConfig1.setPoolName("HikariPool-109");
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.connectionTestQuery = "HikariPool-28503";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
    }

    @Test
    public void test16216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16216");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3154");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3154 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16217");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-55");
        hikariConfig1.dataSourceClassName = "HikariPool-77";
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        int int17 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource18 = hikariConfig1.dataSource;
        hikariConfig1.setConnectionTestQuery("HikariPool-379");
        int int21 = hikariConfig1.minPoolSize;
        int int22 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setLeakDetectionThreshold(358L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
    }

    @Test
    public void test16218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16218");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-55");
        hikariConfig1.dataSourceClassName = "HikariPool-77";
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str17 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        hikariConfig1.setTransactionIsolation("HikariPool-211");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer22;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.connectionInitSql = "hi!";
        hikariConfig25.acquireIncrement = (byte) 100;
        hikariConfig25.setMinimumPoolSize((int) (short) 0);
        java.lang.String str33 = hikariConfig25.dataSourceClassName;
        long long34 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.idleTimeout = (byte) -1;
        java.util.Properties properties37 = hikariConfig25.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        java.lang.String str39 = hikariConfig38.getPoolName();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        long long42 = hikariConfig41.getAcquireRetryDelay();
        hikariConfig41.connectionInitSql = "hi!";
        hikariConfig41.acquireIncrement = (byte) 100;
        hikariConfig41.setMinimumPoolSize((int) (short) 0);
        java.lang.String str49 = hikariConfig41.dataSourceClassName;
        long long50 = hikariConfig41.getAcquireRetryDelay();
        hikariConfig41.idleTimeout = (byte) -1;
        java.util.Properties properties53 = hikariConfig41.dataSourceProperties;
        hikariConfig38.setDataSourceProperties(properties53);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties53);
        hikariConfig1.dataSourceProperties = properties53;
        boolean boolean57 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45" + "'", str16, "HikariPool-45");
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNull(str33);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertNotNull(properties37);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HikariPool-45233" + "'", str39, "HikariPool-45233");
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertNull(str49);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 32L + "'", long50 == 32L);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test16219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16219");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.poolName = "HikariPool-6";
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        long long16 = hikariConfig15.getAcquireRetryDelay();
        hikariConfig15.idleTimeout = (-1);
        java.util.Properties properties19 = hikariConfig15.getDataSourceProperties();
        long long20 = hikariConfig15.maxLifetime;
        hikariConfig15.setConnectionInitSql("");
        java.lang.Class<?> wildcardClass23 = hikariConfig15.getClass();
        hikariConfig1.addDataSourceProperty("HikariPool-927", (java.lang.Object) hikariConfig15);
        java.lang.String str25 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setTransactionIsolation("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNotNull(properties19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test16220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16220");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.lang.String str4 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long9 = hikariConfig8.getAcquireRetryDelay();
        hikariConfig8.idleTimeout = (-1);
        hikariConfig8.setMaximumPoolSize((int) 'a');
        long long14 = hikariConfig8.getLeakDetectionThreshold();
        java.lang.String str15 = hikariConfig8.catalog;
        long long16 = hikariConfig8.getMaxLifetime();
        boolean boolean17 = hikariConfig8.isReadOnly;
        long long18 = hikariConfig8.getIdleTimeout();
        java.util.Properties properties19 = hikariConfig8.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties19;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties19);
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.connectionInitSql = "hi!";
        hikariConfig25.acquireIncrement = (byte) 100;
        hikariConfig25.setMinimumPoolSize((int) (short) 0);
        hikariConfig25.setJdbcUrl("hi!");
        long long35 = hikariConfig25.getLeakDetectionThreshold();
        hikariConfig25.setIdleTimeout((long) (byte) 1);
        long long38 = hikariConfig25.getMaxLifetime();
        hikariConfig25.idleTimeout = 358;
        hikariConfig25.setIsolateInternalQueries(false);
        hikariConfig25.transactionIsolation = 0;
        hikariConfig22.addDataSourceProperty("HikariPool-751", (java.lang.Object) hikariConfig25);
        hikariConfig25.setCatalog("HikariPool-20990");
        hikariConfig25.setLeakDetectionThreshold((long) (byte) -1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(properties19);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
    }

    @Test
    public void test16221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16221");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setTransactionIsolation("HikariPool-77");
        hikariConfig1.connectionCustomizerClassName = "";
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.maxLifetime = 10L;
        boolean boolean12 = hikariConfig1.isAutoCommit;
        hikariConfig1.leakDetectionThreshold = 0L;
        boolean boolean15 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16222");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.idleTimeout = (byte) 10;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16223");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        hikariConfig1.setTransactionIsolation("HikariPool-300");
        long long15 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.acquireIncrement = 358;
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        hikariConfig1.transactionIsolationName = "HikariPool-516";
        hikariConfig1.acquireRetries = (byte) 10;
        long long24 = hikariConfig1.idleTimeout;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-6071";
        javax.sql.DataSource dataSource27 = hikariConfig1.getDataSource();
        hikariConfig1.isIsolateInternalQueries = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2147483647L + "'", long15 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNull(dataSource27);
    }

    @Test
    public void test16224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16224");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        long long7 = hikariConfig5.maxLifetime;
        java.util.Properties properties8 = hikariConfig5.getDataSourceProperties();
        java.lang.String str9 = hikariConfig5.getCatalog();
        hikariConfig5.connectionTestQuery = "HikariPool-84";
        hikariConfig5.transactionIsolation = (short) 100;
        int int14 = hikariConfig5.getTransactionIsolation();
        hikariConfig1.addDataSourceProperty("HikariPool-134", (java.lang.Object) hikariConfig5);
        long long16 = hikariConfig5.idleTimeout;
        hikariConfig5.connectionTestQuery = "HikariPool-108";
        boolean boolean19 = hikariConfig5.isJdbc4connectionTest;
        long long20 = hikariConfig5.getAcquireRetryDelay();
        hikariConfig5.idleTimeout = 0;
        hikariConfig5.setPoolName("HikariPool-14417");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test16225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16225");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.acquireIncrement = 97;
        hikariConfig1.connectionInitSql = "HikariPool-172";
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-172" + "'", str15, "HikariPool-172");
    }

    @Test
    public void test16226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16226");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        long long5 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setJdbcUrl("HikariPool-143");
        hikariConfig1.setJdbcUrl("HikariPool-406");
        java.lang.String str10 = hikariConfig1.dataSourceClassName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-2051");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-2051' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test16227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16227");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.connectionTestQuery = "HikariPool-45";
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolation = 0;
        hikariConfig1.setReadOnly(true);
        long long18 = hikariConfig1.idleTimeout;
        int int19 = hikariConfig1.getMaximumPoolSize();
        int int20 = hikariConfig1.getMinimumPoolSize();
        int int21 = hikariConfig1.acquireRetries;
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long24 = hikariConfig1.getMaxLifetime();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
    }

    @Test
    public void test16228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16228");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        long long7 = hikariConfig6.getAcquireRetryDelay();
        hikariConfig6.connectionInitSql = "hi!";
        hikariConfig6.acquireIncrement = (byte) 100;
        hikariConfig6.setMinimumPoolSize((int) (short) 0);
        java.lang.String str14 = hikariConfig6.dataSourceClassName;
        long long15 = hikariConfig6.getAcquireRetryDelay();
        hikariConfig6.idleTimeout = (byte) -1;
        java.util.Properties properties18 = hikariConfig6.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties18;
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        int int24 = hikariConfig1.maxPoolSize;
        java.lang.String str25 = hikariConfig1.catalog;
        hikariConfig1.isJdbc4connectionTest = true;
        boolean boolean28 = hikariConfig1.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test16229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16229");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        int int10 = hikariConfig1.maxPoolSize;
        hikariConfig1.setReadOnly(true);
        int int13 = hikariConfig1.transactionIsolation;
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        int int15 = hikariConfig1.maxPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test16230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16230");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.acquireIncrement = (short) 1;
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        int int13 = hikariConfig1.transactionIsolation;
        int int14 = hikariConfig1.getAcquireIncrement();
        int int15 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.poolName = "";
        boolean boolean18 = hikariConfig1.isReadOnly;
        java.lang.String str19 = hikariConfig1.transactionIsolationName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16231");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        java.lang.String str4 = hikariConfig1.poolName;
        int int5 = hikariConfig1.acquireIncrement;
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        int int7 = hikariConfig1.getAcquireIncrement();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str9 = hikariConfig1.jdbcUrl;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-45268" + "'", str4, "HikariPool-45268");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16232");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        long long7 = hikariConfig1.getConnectionTimeout();
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.isRegisterMbeans = false;
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        int int15 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test16233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16233");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.acquireRetryDelay;
        int int8 = hikariConfig1.acquireIncrement;
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.connectionTimeout = 600000L;
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.isAutoCommit = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test16234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16234");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean6 = hikariConfig1.isAutoCommit;
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.String str11 = hikariConfig1.connectionInitSql;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16235");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.acquireRetryDelay = (byte) 10;
        java.lang.String str16 = hikariConfig1.connectionInitSql;
        long long17 = hikariConfig1.maxLifetime;
        hikariConfig1.maxPoolSize = '4';
        hikariConfig1.isAutoCommit = true;
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.lang.String str24 = hikariConfig23.getDataSourceClassName();
        hikariConfig23.setTransactionIsolation("hi!");
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        long long29 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.connectionInitSql = "hi!";
        hikariConfig28.acquireIncrement = (byte) 100;
        hikariConfig28.setMinimumPoolSize((int) (short) 0);
        java.lang.String str36 = hikariConfig28.dataSourceClassName;
        long long37 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.idleTimeout = (byte) -1;
        java.util.Properties properties40 = hikariConfig28.dataSourceProperties;
        hikariConfig23.dataSourceProperties = properties40;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig1.dataSourceProperties = properties40;
        hikariConfig1.setMaxLifetime((long) 10);
        boolean boolean49 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str50 = hikariConfig1.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test16236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16236");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getAcquireIncrement();
        hikariConfig10.minPoolSize = 0;
        hikariConfig10.isAutoCommit = true;
        hikariConfig10.idleTimeout = '4';
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        java.lang.String str20 = hikariConfig19.getDataSourceClassName();
        hikariConfig19.setTransactionIsolation("hi!");
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.connectionInitSql = "hi!";
        hikariConfig24.acquireIncrement = (byte) 100;
        hikariConfig24.setMinimumPoolSize((int) (short) 0);
        java.lang.String str32 = hikariConfig24.dataSourceClassName;
        long long33 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.idleTimeout = (byte) -1;
        java.util.Properties properties36 = hikariConfig24.dataSourceProperties;
        hikariConfig19.dataSourceProperties = properties36;
        hikariConfig19.setConnectionInitSql("hi!");
        hikariConfig19.setAcquireIncrement((int) (byte) 100);
        int int42 = hikariConfig19.maxPoolSize;
        java.lang.String str43 = hikariConfig19.catalog;
        hikariConfig19.isJdbc4connectionTest = true;
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        java.lang.String str49 = hikariConfig48.getDataSourceClassName();
        int int50 = hikariConfig48.getAcquireRetries();
        hikariConfig48.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource53 = null;
        hikariConfig48.setDataSource(dataSource53);
        hikariConfig48.transactionIsolation = (byte) 10;
        java.lang.String str57 = hikariConfig48.getJdbcUrl();
        boolean boolean58 = hikariConfig48.isAutoCommit();
        hikariConfig48.leakDetectionThreshold = (-1L);
        long long61 = hikariConfig48.maxLifetime;
        hikariConfig48.setJdbc4ConnectionTest(false);
        hikariConfig19.addDataSourceProperty("HikariPool-1173", (java.lang.Object) hikariConfig48);
        java.util.Properties properties65 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties65);
        boolean boolean67 = hikariConfig66.isInitializationFailFast();
        long long68 = hikariConfig66.maxLifetime;
        java.util.Properties properties69 = hikariConfig66.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties69);
        hikariConfig19.setDataSourceProperties(properties69);
        hikariConfig10.setDataSourceProperties(properties69);
        java.util.Properties properties73 = hikariConfig10.dataSourceProperties;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNull(str32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 97L + "'", long61 == 97L);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long68 + "' != '" + 97L + "'", long68 == 97L);
        org.junit.Assert.assertNotNull(properties69);
        org.junit.Assert.assertNotNull(properties73);
    }

    @Test
    public void test16237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16237");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        long long7 = hikariConfig6.getAcquireRetryDelay();
        hikariConfig6.connectionInitSql = "hi!";
        hikariConfig6.acquireIncrement = (byte) 100;
        hikariConfig6.setMinimumPoolSize((int) (short) 0);
        java.lang.String str14 = hikariConfig6.dataSourceClassName;
        long long15 = hikariConfig6.getAcquireRetryDelay();
        hikariConfig6.idleTimeout = (byte) -1;
        java.util.Properties properties18 = hikariConfig6.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties18;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.maxPoolSize = (byte) 0;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test16238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16238");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.catalog = "HikariPool-84";
        hikariConfig1.isRegisterMbeans = true;
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45288" + "'", str9, "HikariPool-45288");
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test16239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16239");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        int int9 = hikariConfig1.acquireIncrement;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test16240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16240");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setCatalog("HikariPool-104");
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long16 = hikariConfig15.getLeakDetectionThreshold();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test16241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16241");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        java.lang.String str5 = hikariConfig1.catalog;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-63";
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test16242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16242");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        int int9 = hikariConfig1.acquireIncrement;
        hikariConfig1.setConnectionInitSql("HikariPool-1264");
        int int12 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.jdbcUrl = "HikariPool-8868";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test16243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16243");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbcUrl("HikariPool-160");
        long long20 = hikariConfig1.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
    }

    @Test
    public void test16244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16244");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1756");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1756 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16245");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.connectionInitSql = "HikariPool-195";
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        boolean boolean19 = hikariConfig1.isReadOnly;
        java.lang.String str20 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45299" + "'", str9, "HikariPool-45299");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45299" + "'", str13, "HikariPool-45299");
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-55" + "'", str20, "HikariPool-55");
    }

    @Test
    public void test16246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16246");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.acquireIncrement = '#';
        int int8 = hikariConfig5.maxPoolSize;
        java.lang.String str9 = hikariConfig5.connectionInitSql;
        int int10 = hikariConfig5.getAcquireIncrement();
        hikariConfig5.acquireRetryDelay = 35L;
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test16247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16247");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionTestQuery = "";
        boolean boolean16 = hikariConfig1.isAutoCommit;
        hikariConfig1.dataSourceClassName = "HikariPool-3005";
        boolean boolean19 = hikariConfig1.isAutoCommit();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16248");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        hikariConfig1.idleTimeout = 100L;
        hikariConfig1.acquireRetryDelay = (-1);
        int int15 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str16 = hikariConfig1.catalog;
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        java.lang.String str18 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test16249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16249");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        int int12 = hikariConfig1.getMaximumPoolSize();
        long long13 = hikariConfig1.maxLifetime;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.poolName = "HikariPool-1090";
        hikariConfig1.setIdleTimeout(358L);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.dataSource = dataSource20;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.idleTimeout = (-1);
        hikariConfig24.setMaximumPoolSize((int) 'a');
        java.lang.String str30 = hikariConfig24.catalog;
        boolean boolean31 = hikariConfig24.isJdbc4ConnectionTest();
        boolean boolean32 = hikariConfig24.isInitializationFailFast();
        boolean boolean33 = hikariConfig24.isInitializationFailFast();
        java.lang.String str34 = hikariConfig24.getConnectionCustomizerClassName();
        java.util.Properties properties35 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig36.setJdbc4ConnectionTest(true);
        boolean boolean39 = hikariConfig36.isReadOnly;
        java.lang.String str40 = hikariConfig36.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("HikariPool-5399", (java.lang.Object) hikariConfig36);
        long long42 = hikariConfig36.idleTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1800000L + "'", long42 == 1800000L);
    }

    @Test
    public void test16250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16250");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.maxLifetime = (-1L);
        hikariConfig1.isReadOnly = true;
        hikariConfig1.setDataSourceClassName("HikariPool-1096");
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16251");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.isIsolateInternalQueries = true;
        boolean boolean16 = hikariConfig1.isIsolateInternalQueries();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        boolean boolean22 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.dataSource = dataSource23;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test16252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16252");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isIsolateInternalQueries();
        long long14 = hikariConfig12.getConnectionTimeout();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.connectionInitSql = "hi!";
        hikariConfig16.acquireIncrement = (byte) 100;
        hikariConfig16.setMinimumPoolSize((int) (short) 0);
        java.lang.String str24 = hikariConfig16.dataSourceClassName;
        long long25 = hikariConfig16.getAcquireRetryDelay();
        boolean boolean26 = hikariConfig16.isRegisterMbeans;
        int int27 = hikariConfig16.transactionIsolation;
        java.util.Properties properties28 = hikariConfig16.dataSourceProperties;
        hikariConfig12.setDataSourceProperties(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig1.addDataSourceProperty("HikariPool-196", (java.lang.Object) hikariConfig30);
        hikariConfig30.setUseInstrumentation(false);
        hikariConfig30.leakDetectionThreshold = (short) 10;
        java.lang.String str36 = hikariConfig30.getJdbcUrl();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test16253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16253");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.isJdbc4connectionTest = false;
        int int13 = hikariConfig1.transactionIsolation;
        hikariConfig1.jdbcUrl = "HikariPool-117";
        hikariConfig1.maxPoolSize = (byte) 10;
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.isJdbc4connectionTest = false;
        long long21 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.acquireRetryDelay = 0L;
        boolean boolean24 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean25 = hikariConfig1.isIsolateInternalQueries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test16254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16254");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        hikariConfig1.setConnectionTestQuery("HikariPool-271");
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        boolean boolean17 = hikariConfig1.isRegisterMbeans;
        java.lang.String str18 = hikariConfig1.getCatalog();
        hikariConfig1.setAutoCommit(false);
        java.lang.String str21 = hikariConfig1.catalog;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45315" + "'", str9, "HikariPool-45315");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16255");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4038");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4038 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16256");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        int int12 = hikariConfig1.transactionIsolation;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.minPoolSize;
        boolean boolean16 = hikariConfig14.isRegisterMbeans();
        hikariConfig14.setMaxLifetime(0L);
        hikariConfig14.setIdleTimeout((long) (byte) 1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16257");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.minPoolSize = (byte) 10;
        long long18 = hikariConfig1.getIdleTimeout();
        boolean boolean19 = hikariConfig1.isInitializationFailFast;
        java.lang.String str20 = hikariConfig1.getJdbcUrl();
        hikariConfig1.minPoolSize = 32;
        hikariConfig1.setJdbc4ConnectionTest(true);
        boolean boolean25 = hikariConfig1.isIsolateInternalQueries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-45" + "'", str20, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test16258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16258");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.acquireRetryDelay = 750L;
        hikariConfig1.setConnectionTimeout(358L);
        long long14 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setPoolName("HikariPool-1061");
        boolean boolean17 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 750L + "'", long14 == 750L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16259");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxPoolSize = (byte) 100;
        hikariConfig1.poolName = "HikariPool-1203";
        boolean boolean12 = hikariConfig1.isReadOnly();
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16260");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.isJdbc4connectionTest = false;
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setReadOnly(true);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16261");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.transactionIsolation = (byte) -1;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay(97L);
        hikariConfig1.setIdleTimeout((long) 358);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test16262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16262");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.jdbcUrl = "HikariPool-55";
        java.lang.String str18 = hikariConfig1.getCatalog();
        long long19 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str20 = hikariConfig1.connectionTestQuery;
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
        int int22 = hikariConfig1.acquireRetries;
        long long23 = hikariConfig1.connectionTimeout;
        hikariConfig1.catalog = "HikariPool-39907";
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45327" + "'", str9, "HikariPool-45327");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45327" + "'", str13, "HikariPool-45327");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3L + "'", long23 == 3L);
    }

    @Test
    public void test16263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16263");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str19 = hikariConfig1.jdbcUrl;
        java.lang.String str20 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16264");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.idleTimeout = (-1);
        java.util.Properties properties21 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setConnectionInitSql("HikariPool-270");
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        java.lang.String str29 = hikariConfig28.getDataSourceClassName();
        hikariConfig28.setTransactionIsolation("hi!");
        hikariConfig28.acquireRetryDelay = '4';
        hikariConfig28.setConnectionTimeout((long) (short) 0);
        hikariConfig28.setConnectionTestQuery("HikariPool-45");
        long long38 = hikariConfig28.connectionTimeout;
        hikariConfig28.setPoolName("HikariPool-55");
        hikariConfig28.setIdleTimeout((long) (short) 10);
        long long43 = hikariConfig28.leakDetectionThreshold;
        long long44 = hikariConfig28.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer45 = hikariConfig28.connectionCustomizer;
        hikariConfig28.poolName = "HikariPool-127";
        hikariConfig28.setConnectionTestQuery("HikariPool-559");
        hikariConfig28.acquireRetries = (-1);
        java.lang.String str52 = hikariConfig28.getConnectionInitSql();
        hikariConfig23.addDataSourceProperty("HikariPool-473", (java.lang.Object) hikariConfig28);
        hikariConfig28.setIdleTimeout((long) '#');
        long long56 = hikariConfig28.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 2147483647L + "'", long38 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 2147483647L + "'", long44 == 2147483647L);
        org.junit.Assert.assertNull(iConnectionCustomizer45);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 2147483647L + "'", long56 == 2147483647L);
    }

    @Test
    public void test16265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16265");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.acquireRetryDelay;
        long long8 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.jdbcUrl = "HikariPool-250";
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str13 = hikariConfig1.getPoolName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        int int16 = hikariConfig1.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45339" + "'", str13, "HikariPool-45339");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test16266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16266");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        java.lang.String str9 = hikariConfig1.poolName;
        hikariConfig1.setAcquireRetryDelay(60L);
        boolean boolean12 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45340" + "'", str9, "HikariPool-45340");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test16267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16267");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.poolName = "HikariPool-127";
        hikariConfig1.isRegisterMbeans = true;
        int int12 = hikariConfig1.getTransactionIsolation();
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.transactionIsolation = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-1272");
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16268");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        int int12 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) 97);
        hikariConfig1.setUseInstrumentation(true);
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        int int19 = hikariConfig1.transactionIsolation;
        long long20 = hikariConfig1.connectionTimeout;
        hikariConfig1.setIdleTimeout(35L);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45342" + "'", str9, "HikariPool-45342");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test16269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16269");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionTimeout = (byte) -1;
        long long14 = hikariConfig1.maxLifetime;
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.isAutoCommit = true;
        java.lang.String str18 = hikariConfig1.getCatalog();
        boolean boolean19 = hikariConfig1.isReadOnly;
        hikariConfig1.isAutoCommit = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16270");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        int int9 = hikariConfig1.minPoolSize;
        hikariConfig1.setCatalog("HikariPool-160");
        boolean boolean12 = hikariConfig1.isReadOnly;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.setMaximumPoolSize(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-45346" + "'", str15, "HikariPool-45346");
    }

    @Test
    public void test16271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16271");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.dataSourceClassName = "hi!";
        long long15 = hikariConfig1.leakDetectionThreshold;
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        int int18 = hikariConfig1.getMaximumPoolSize();
        boolean boolean19 = hikariConfig1.isRegisterMbeans;
        long long20 = hikariConfig1.connectionTimeout;
        java.util.Properties properties21 = hikariConfig1.dataSourceProperties;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test16272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16272");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setReadOnly(false);
        java.lang.String str8 = hikariConfig1.getCatalog();
        hikariConfig1.poolName = "HikariPool-124";
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries();
        long long12 = hikariConfig1.getAcquireRetryDelay();
        int int13 = hikariConfig1.transactionIsolation;
        hikariConfig1.transactionIsolation = 10;
        long long16 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test16273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16273");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.leakDetectionThreshold = (short) -1;
        int int14 = hikariConfig1.minPoolSize;
        hikariConfig1.setTransactionIsolation("HikariPool-10175");
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str19 = hikariConfig18.getDataSourceClassName();
        int int20 = hikariConfig18.getAcquireRetries();
        hikariConfig18.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig18.setDataSource(dataSource23);
        java.lang.String str25 = hikariConfig18.getConnectionTestQuery();
        int int26 = hikariConfig18.minPoolSize;
        java.util.Properties properties27 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig1.dataSourceProperties = properties27;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test16274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16274");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str15 = hikariConfig1.connectionTestQuery;
        java.lang.String str16 = hikariConfig1.getCatalog();
        hikariConfig1.setIdleTimeout((long) (short) -1);
        hikariConfig1.setMaxLifetime((long) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16275");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        java.lang.String str9 = hikariConfig1.connectionTestQuery;
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-2604";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16276");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        hikariConfig1.acquireIncrement = (-1);
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        int int18 = hikariConfig1.getAcquireRetries();
        java.lang.String str19 = hikariConfig1.getDataSourceClassName();
        int int20 = hikariConfig1.acquireRetries;
        hikariConfig1.setJdbc4ConnectionTest(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test16277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16277");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.setPoolName("HikariPool-167");
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        int int16 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.idleTimeout = (byte) 1;
        java.lang.String str19 = hikariConfig1.jdbcUrl;
        hikariConfig1.setInitializationFailFast(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45358" + "'", str9, "HikariPool-45358");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(iConnectionCustomizer22);
    }

    @Test
    public void test16278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16278");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setIdleTimeout((long) 358);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16279");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setCatalog("HikariPool-1601");
        hikariConfig1.connectionTimeout = 358;
        hikariConfig1.jdbcUrl = "HikariPool-44258";
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test16280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16280");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-19876");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-19876 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16281");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.leakDetectionThreshold = 0L;
        hikariConfig10.jdbcUrl = "HikariPool-279";
        long long15 = hikariConfig10.maxLifetime;
        hikariConfig10.connectionInitSql = "HikariPool-955";
        hikariConfig10.acquireRetryDelay = 97;
        hikariConfig10.transactionIsolationName = "HikariPool-42491";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test16282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16282");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1541");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1541 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16283");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.lang.String str7 = hikariConfig6.getDataSourceClassName();
        hikariConfig6.setTransactionIsolation("hi!");
        hikariConfig6.acquireRetryDelay = '4';
        hikariConfig6.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties14 = hikariConfig6.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig16.leakDetectionThreshold = ' ';
        boolean boolean19 = hikariConfig16.isJdbc4connectionTest;
        hikariConfig16.dataSourceClassName = "HikariPool-2731";
        boolean boolean22 = hikariConfig16.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16284");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.getIdleTimeout();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        java.lang.String str12 = hikariConfig1.getCatalog();
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAutoCommit(true);
        long long16 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.minPoolSize = 3;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test16285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16285");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.minPoolSize = (byte) 10;
        hikariConfig1.dataSourceClassName = "";
        long long17 = hikariConfig1.getAcquireRetryDelay();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setDataSourceClassName("HikariPool-263");
        hikariConfig1.minPoolSize = (byte) 0;
        hikariConfig1.setIdleTimeout((long) 'a');
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45370" + "'", str9, "HikariPool-45370");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
    }

    @Test
    public void test16286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16286");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.transactionIsolation = (byte) 10;
        int int10 = hikariConfig1.acquireIncrement;
        hikariConfig1.acquireRetryDelay = 100;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setCatalog("HikariPool-3998");
        hikariConfig1.setConnectionTestQuery("HikariPool-2816");
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16287");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionTestQuery("HikariPool-72");
        java.lang.String str21 = hikariConfig1.connectionInitSql;
        long long22 = hikariConfig1.getIdleTimeout();
        int int23 = hikariConfig1.minPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test16288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16288");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.setConnectionInitSql("HikariPool-258");
        hikariConfig1.poolName = "";
        hikariConfig1.setAcquireRetryDelay((long) (byte) 1);
        java.lang.String str13 = hikariConfig1.poolName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-1502");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1502' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16289");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        hikariConfig1.idleTimeout = 100L;
        hikariConfig1.acquireRetryDelay = (-1);
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        long long21 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.connectionInitSql = "hi!";
        hikariConfig20.acquireIncrement = (byte) 100;
        hikariConfig20.setMinimumPoolSize((int) (short) 0);
        java.lang.String str28 = hikariConfig20.dataSourceClassName;
        long long29 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.connectionTimeout = (byte) 10;
        hikariConfig20.leakDetectionThreshold = 1L;
        java.lang.String str34 = hikariConfig20.connectionCustomizerClassName;
        hikariConfig20.setInitializationFailFast(false);
        hikariConfig20.maxPoolSize = 3;
        hikariConfig1.addDataSourceProperty("HikariPool-271", (java.lang.Object) hikariConfig20);
        hikariConfig20.setLeakDetectionThreshold((long) 1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNull(str28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test16290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16290");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource18 = hikariConfig1.dataSource;
        boolean boolean19 = hikariConfig1.isReadOnly;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.lang.String str24 = hikariConfig23.getDataSourceClassName();
        hikariConfig23.setTransactionIsolation("hi!");
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        long long29 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.connectionInitSql = "hi!";
        hikariConfig28.acquireIncrement = (byte) 100;
        hikariConfig28.setMinimumPoolSize((int) (short) 0);
        java.lang.String str36 = hikariConfig28.dataSourceClassName;
        long long37 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.idleTimeout = (byte) -1;
        java.util.Properties properties40 = hikariConfig28.dataSourceProperties;
        hikariConfig23.dataSourceProperties = properties40;
        hikariConfig1.dataSourceProperties = properties40;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties40);
        java.lang.String str45 = hikariConfig44.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test16291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16291");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (byte) -1;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setTransactionIsolation("HikariPool-188");
        hikariConfig14.setMinimumPoolSize(97);
        java.lang.String str19 = hikariConfig14.getConnectionInitSql();
        java.lang.String str20 = hikariConfig14.transactionIsolationName;
        boolean boolean21 = hikariConfig14.isIsolateInternalQueries();
        hikariConfig14.isRegisterMbeans = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-188" + "'", str20, "HikariPool-188");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16292");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        hikariConfig8.setInitializationFailFast(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str14 = hikariConfig13.getDataSourceClassName();
        hikariConfig13.setTransactionIsolation("hi!");
        hikariConfig13.acquireRetryDelay = '4';
        hikariConfig13.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties21 = hikariConfig13.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig1.setDataSourceProperties(properties21);
        hikariConfig1.maxPoolSize = (byte) 0;
        hikariConfig1.setJdbc4ConnectionTest(true);
        boolean boolean29 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setJdbcUrl("HikariPool-23");
        hikariConfig1.poolName = "HikariPool-21332";
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test16293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16293");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setReadOnly(true);
        long long10 = hikariConfig1.connectionTimeout;
        int int11 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource12 = hikariConfig1.dataSource;
        int int13 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test16294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16294");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        int int11 = hikariConfig1.acquireRetries;
        hikariConfig1.setDataSourceClassName("HikariPool-16");
        int int14 = hikariConfig1.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test16295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16295");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-42561");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-42561 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16296");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.maxLifetime;
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long13 = hikariConfig1.leakDetectionThreshold;
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        long long16 = hikariConfig1.maxLifetime;
        java.lang.String str17 = hikariConfig1.getJdbcUrl();
        long long18 = hikariConfig1.idleTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer19;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test16297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16297");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.isReadOnly = true;
        int int13 = hikariConfig1.transactionIsolation;
        hikariConfig1.maxLifetime = '4';
        long long16 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.dataSourceClassName = "HikariPool-39784";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test16298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16298");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        int int12 = hikariConfig1.transactionIsolation;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setAcquireIncrement((int) 'a');
        hikariConfig1.leakDetectionThreshold = (short) 1;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        long long19 = hikariConfig1.maxLifetime;
        boolean boolean20 = hikariConfig1.isRegisterMbeans;
        boolean boolean21 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean22 = hikariConfig1.isIsolateInternalQueries();
        int int23 = hikariConfig1.getAcquireRetries();
        java.lang.String str24 = hikariConfig1.getDataSourceClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test16299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16299");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.isJdbc4connectionTest = false;
        int int13 = hikariConfig1.transactionIsolation;
        hikariConfig1.jdbcUrl = "HikariPool-117";
        hikariConfig1.maxPoolSize = (byte) 10;
        hikariConfig1.setMaximumPoolSize((int) '#');
        java.lang.String str20 = hikariConfig1.poolName;
        long long21 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTestQuery = "HikariPool-5717";
        hikariConfig1.acquireRetries = 1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-45396" + "'", str20, "HikariPool-45396");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test16300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16300");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionTestQuery("hi!");
        int int14 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str15 = hikariConfig1.catalog;
        java.lang.String str16 = hikariConfig1.jdbcUrl;
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test16301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16301");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.dataSourceClassName = "hi!";
        long long15 = hikariConfig1.leakDetectionThreshold;
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str17 = hikariConfig1.catalog;
        java.lang.String str18 = hikariConfig1.getJdbcUrl();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-45" + "'", str18, "HikariPool-45");
    }

    @Test
    public void test16302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16302");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (byte) -1;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        java.lang.String str15 = hikariConfig14.getPoolName();
        hikariConfig14.connectionCustomizerClassName = "HikariPool-127";
        boolean boolean18 = hikariConfig14.isJdbc4ConnectionTest();
        boolean boolean19 = hikariConfig14.isAutoCommit();
        hikariConfig14.setMaxLifetime((long) 60);
        hikariConfig14.setJdbc4ConnectionTest(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-45400" + "'", str15, "HikariPool-45400");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16303");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (byte) -1;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long15 = hikariConfig14.getIdleTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig14.connectionCustomizer = iConnectionCustomizer16;
        hikariConfig14.setPoolName("HikariPool-200");
        long long20 = hikariConfig14.leakDetectionThreshold;
        java.lang.String str21 = hikariConfig14.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16304");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean14 = hikariConfig1.isReadOnly();
        hikariConfig1.acquireIncrement = (byte) 0;
        hikariConfig1.setConnectionInitSql("HikariPool-9962");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16305");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.transactionIsolationName = "HikariPool-105";
        boolean boolean12 = hikariConfig1.isAutoCommit;
        int int13 = hikariConfig1.maxPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16306");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.lang.String str4 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMinimumPoolSize(1);
        int int9 = hikariConfig1.getAcquireIncrement();
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.isReadOnly = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16307");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireRetryDelay((long) 52);
        hikariConfig1.isRegisterMbeans = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test16308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16308");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.setAcquireRetries((int) '#');
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        hikariConfig1.setJdbcUrl("HikariPool-37208");
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16309");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-33655");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-33655 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16310");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6570");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6570 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16311");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        long long17 = hikariConfig1.maxLifetime;
        hikariConfig1.maxPoolSize = 35;
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45411" + "'", str9, "HikariPool-45411");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16312");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        int int11 = hikariConfig1.minPoolSize;
        hikariConfig1.catalog = "HikariPool-847";
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16313");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        int int13 = hikariConfig1.acquireRetries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test16314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16314");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.leakDetectionThreshold = (short) -1;
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.connectionInitSql = "hi!";
        hikariConfig16.acquireIncrement = (byte) 100;
        int int22 = hikariConfig16.minPoolSize;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.connectionInitSql = "hi!";
        hikariConfig24.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig24.transactionIsolation = (byte) 0;
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        long long34 = hikariConfig33.getAcquireRetryDelay();
        hikariConfig33.idleTimeout = (-1);
        java.util.Properties properties37 = hikariConfig33.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig24.setDataSourceProperties(properties37);
        hikariConfig16.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig1.dataSourceProperties = properties37;
        java.lang.String str45 = hikariConfig1.jdbcUrl;
        long long46 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setIsolateInternalQueries(true);
        int int49 = hikariConfig1.acquireRetries;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-20498");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
    }

    @Test
    public void test16315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16315");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        hikariConfig1.connectionTestQuery = "HikariPool-167";
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setAcquireRetries((int) (short) 0);
        int int17 = hikariConfig1.maxPoolSize;
        hikariConfig1.catalog = "HikariPool-28955";
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test16316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16316");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.maxLifetime = (short) 10;
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionTestQuery("HikariPool-897");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-4288");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-4288' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test16317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16317");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.getMinimumPoolSize();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setJdbcUrl("HikariPool-77");
        hikariConfig1.setConnectionTestQuery("HikariPool-56");
        java.util.Properties properties15 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties15);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test16318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16318");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        int int10 = hikariConfig1.acquireRetries;
        hikariConfig1.setMinimumPoolSize((int) (short) 1);
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.poolName = "HikariPool-41";
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setLeakDetectionThreshold((long) 100);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16319");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig6.setAcquireRetryDelay((long) 1);
        java.lang.String str9 = hikariConfig6.getConnectionTestQuery();
        hikariConfig6.setJdbc4ConnectionTest(false);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        java.lang.String str16 = hikariConfig14.jdbcUrl;
        hikariConfig14.isInitializationFailFast = false;
        long long19 = hikariConfig14.maxLifetime;
        java.lang.String str20 = hikariConfig14.connectionInitSql;
        boolean boolean21 = hikariConfig14.isIsolateInternalQueries;
        hikariConfig14.setIdleTimeout((long) 358);
        hikariConfig14.acquireIncrement = 35;
        hikariConfig6.addDataSourceProperty("HikariPool-2282", (java.lang.Object) 35);
        long long27 = hikariConfig6.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
    }

    @Test
    public void test16320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16320");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.transactionIsolation = (short) 100;
        hikariConfig1.isJdbc4connectionTest = true;
        long long15 = hikariConfig1.getAcquireRetryDelay();
        long long16 = hikariConfig1.getAcquireRetryDelay();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test16321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16321");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str13 = hikariConfig1.getPoolName();
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.maxLifetime = (byte) 0;
        boolean boolean18 = hikariConfig1.isReadOnly;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-994";
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45438" + "'", str9, "HikariPool-45438");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45438" + "'", str13, "HikariPool-45438");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16322");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        hikariConfig1.setDataSourceClassName("HikariPool-425");
        hikariConfig1.catalog = "HikariPool-25";
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test16323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16323");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-15822");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-15822 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16324");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-55");
        long long14 = hikariConfig1.maxLifetime;
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setConnectionInitSql("HikariPool-400");
        int int20 = hikariConfig1.getTransactionIsolation();
        java.lang.String str21 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16325");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setUseInstrumentation(false);
        long long10 = hikariConfig1.leakDetectionThreshold;
        int int11 = hikariConfig1.acquireIncrement;
        hikariConfig1.idleTimeout = 60L;
        hikariConfig1.maxLifetime = 3L;
        hikariConfig1.jdbcUrl = "HikariPool-520";
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isInitializationFailFast();
        hikariConfig20.setInitializationFailFast(false);
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        java.lang.String str26 = hikariConfig25.getDataSourceClassName();
        hikariConfig25.setTransactionIsolation("hi!");
        hikariConfig25.acquireRetryDelay = '4';
        hikariConfig25.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties33 = hikariConfig25.getDataSourceProperties();
        hikariConfig20.setDataSourceProperties(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig35.leakDetectionThreshold = ' ';
        long long38 = hikariConfig35.getMaxLifetime();
        java.lang.String str39 = hikariConfig35.getCatalog();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        java.lang.String str42 = hikariConfig41.getDataSourceClassName();
        hikariConfig41.setTransactionIsolation("hi!");
        hikariConfig41.acquireRetryDelay = '4';
        hikariConfig41.setConnectionTimeout((long) (short) 0);
        hikariConfig41.setConnectionTestQuery("HikariPool-45");
        long long51 = hikariConfig41.connectionTimeout;
        hikariConfig41.setMaxLifetime(1L);
        java.lang.String str54 = hikariConfig41.getJdbcUrl();
        hikariConfig41.setUseInstrumentation(true);
        hikariConfig41.setConnectionInitSql("HikariPool-195");
        hikariConfig41.connectionTimeout = 3L;
        java.util.Properties properties61 = hikariConfig41.getDataSourceProperties();
        hikariConfig35.setDataSourceProperties(properties61);
        hikariConfig1.addDataSourceProperty("HikariPool-9334", (java.lang.Object) properties61);
        boolean boolean64 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setInitializationFailFast(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties33);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 97L + "'", long38 == 97L);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 2147483647L + "'", long51 == 2147483647L);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(properties61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test16326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16326");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.setConnectionInitSql("HikariPool-258");
        hikariConfig1.setAcquireRetryDelay((long) 52);
        hikariConfig1.acquireIncrement = 0;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test16327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16327");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.lang.String str4 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long9 = hikariConfig8.getAcquireRetryDelay();
        hikariConfig8.idleTimeout = (-1);
        hikariConfig8.setMaximumPoolSize((int) 'a');
        long long14 = hikariConfig8.getLeakDetectionThreshold();
        java.lang.String str15 = hikariConfig8.catalog;
        long long16 = hikariConfig8.getMaxLifetime();
        boolean boolean17 = hikariConfig8.isReadOnly;
        long long18 = hikariConfig8.getIdleTimeout();
        java.util.Properties properties19 = hikariConfig8.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties19;
        hikariConfig1.acquireRetries = (byte) 10;
        hikariConfig1.acquireRetryDelay = 'a';
        int int25 = hikariConfig1.transactionIsolation;
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        long long29 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.connectionInitSql = "hi!";
        hikariConfig28.acquireIncrement = (byte) 100;
        hikariConfig28.setMinimumPoolSize((int) (short) 0);
        java.lang.String str36 = hikariConfig28.dataSourceClassName;
        long long37 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.setConnectionTestQuery("HikariPool-114");
        long long40 = hikariConfig28.getMaxLifetime();
        boolean boolean41 = hikariConfig28.isIsolateInternalQueries();
        hikariConfig28.acquireRetries = 0;
        boolean boolean44 = hikariConfig28.isReadOnly();
        boolean boolean45 = hikariConfig28.isReadOnly;
        int int46 = hikariConfig28.getMaximumPoolSize();
        java.util.Properties properties47 = hikariConfig28.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-335", (java.lang.Object) properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig49.setCatalog("HikariPool-16927");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60 + "'", int46 == 60);
        org.junit.Assert.assertNotNull(properties47);
    }

    @Test
    public void test16328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16328");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        int int12 = hikariConfig1.getMaximumPoolSize();
        long long13 = hikariConfig1.maxLifetime;
        hikariConfig1.setDataSourceClassName("HikariPool-117");
        hikariConfig1.connectionCustomizerClassName = "HikariPool-268";
        java.lang.String str18 = hikariConfig1.jdbcUrl;
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.leakDetectionThreshold = 358;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16329");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        int int9 = hikariConfig1.minPoolSize;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        int int11 = hikariConfig1.acquireIncrement;
        long long12 = hikariConfig1.maxLifetime;
        hikariConfig1.maxPoolSize = 35;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test16330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16330");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.leakDetectionThreshold = 0L;
        hikariConfig10.setMaxLifetime((long) 60);
        hikariConfig10.isAutoCommit = true;
        java.util.Properties properties17 = hikariConfig10.dataSourceProperties;
        hikariConfig10.catalog = "HikariPool-33982";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test16331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16331");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str19 = hikariConfig18.getDataSourceClassName();
        hikariConfig18.setTransactionIsolation("hi!");
        hikariConfig18.acquireRetryDelay = '4';
        hikariConfig18.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties26 = hikariConfig18.getDataSourceProperties();
        hikariConfig18.setAcquireRetries((int) (short) 1);
        java.util.Properties properties29 = hikariConfig18.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties29;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig32.acquireIncrement = 1;
        boolean boolean35 = hikariConfig32.isAutoCommit;
        long long36 = hikariConfig32.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test16332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16332");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "HikariPool-6";
        hikariConfig1.minPoolSize = 10;
        java.lang.String str11 = hikariConfig1.jdbcUrl;
        hikariConfig1.acquireIncrement = 100;
        hikariConfig1.minPoolSize = 60;
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolation = (short) 0;
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test16333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16333");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        java.lang.String str13 = hikariConfig1.jdbcUrl;
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.lang.String str16 = hikariConfig15.getConnectionCustomizerClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16334");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.acquireRetries = 'a';
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        long long14 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig13.connectionInitSql = "hi!";
        hikariConfig13.acquireIncrement = (byte) 100;
        hikariConfig13.setMinimumPoolSize((int) (short) 0);
        java.lang.String str21 = hikariConfig13.dataSourceClassName;
        long long22 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig13.idleTimeout = (byte) -1;
        java.util.Properties properties25 = hikariConfig13.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties25;
        hikariConfig1.setAutoCommit(false);
        java.lang.String str29 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setConnectionCustomizerClassName("");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test16335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16335");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.maxPoolSize = (byte) 100;
        hikariConfig1.setDataSourceClassName("HikariPool-11602");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16336");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setUseInstrumentation(true);
        long long8 = hikariConfig1.getIdleTimeout();
        hikariConfig1.isIsolateInternalQueries = false;
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.dataSource = dataSource12;
        hikariConfig1.connectionTimeout = 52L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test16337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16337");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str13 = hikariConfig1.getPoolName();
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.maxLifetime = (byte) 0;
        hikariConfig1.setPoolName("HikariPool-1157");
        int int20 = hikariConfig1.getAcquireRetries();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.maxLifetime = 1L;
        hikariConfig1.acquireIncrement = 0;
        java.lang.String str29 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45470" + "'", str9, "HikariPool-45470");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45470" + "'", str13, "HikariPool-45470");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test16338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16338");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-55");
        hikariConfig1.dataSourceClassName = "HikariPool-77";
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setTransactionIsolation("HikariPool-1493");
        boolean boolean22 = hikariConfig1.isInitializationFailFast;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = hikariConfig1.connectionCustomizer;
        boolean boolean24 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test16339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16339");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-291";
        long long9 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.connectionInitSql = "HikariPool-22317";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test16340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16340");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.setLeakDetectionThreshold(2147483647L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig10.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test16341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16341");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.transactionIsolation = (byte) 0;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.idleTimeout = (-1);
        java.util.Properties properties14 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig1.setDataSourceProperties(properties14);
        hikariConfig1.setJdbcUrl("HikariPool-300");
        hikariConfig1.catalog = "HikariPool-908";
        hikariConfig1.setTransactionIsolation("HikariPool-1764");
        int int25 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isIsolateInternalQueries = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
    }

    @Test
    public void test16342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16342");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.isInitializationFailFast = true;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.connectionInitSql = "hi!";
        hikariConfig10.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig10.transactionIsolation = (byte) 0;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.idleTimeout = (-1);
        java.util.Properties properties23 = hikariConfig19.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig10.setDataSourceProperties(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        java.lang.String str32 = hikariConfig31.getDataSourceClassName();
        hikariConfig31.setTransactionIsolation("hi!");
        hikariConfig31.acquireRetryDelay = '4';
        hikariConfig31.setConnectionTimeout((long) (short) 0);
        hikariConfig31.setConnectionTestQuery("HikariPool-45");
        long long41 = hikariConfig31.connectionTimeout;
        hikariConfig31.setMaxLifetime(1L);
        java.lang.String str44 = hikariConfig31.getJdbcUrl();
        hikariConfig31.setUseInstrumentation(true);
        hikariConfig31.setConnectionInitSql("HikariPool-195");
        hikariConfig31.connectionTimeout = 3L;
        java.util.Properties properties51 = hikariConfig31.getDataSourceProperties();
        hikariConfig29.dataSourceProperties = properties51;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties51);
        java.lang.String str55 = hikariConfig54.transactionIsolationName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 2147483647L + "'", long41 == 2147483647L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test16343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16343");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "HikariPool-6";
        long long9 = hikariConfig1.idleTimeout;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig12.transactionIsolationName = "HikariPool-15576";
        hikariConfig12.setRegisterMbeans(true);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test16344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16344");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.dataSourceClassName = "HikariPool-876";
        hikariConfig1.acquireIncrement = 100;
        long long12 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setReadOnly(false);
        boolean boolean16 = hikariConfig1.isReadOnly();
        boolean boolean17 = hikariConfig1.isRegisterMbeans;
        int int18 = hikariConfig1.acquireRetries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test16345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16345");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = (byte) 10;
        hikariConfig1.isReadOnly = false;
        hikariConfig1.acquireRetryDelay = 5000L;
        java.lang.String str17 = hikariConfig1.getPoolName();
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setAcquireIncrement(97);
        hikariConfig1.connectionTestQuery = "HikariPool-832";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer25;
        int int27 = hikariConfig1.getMinimumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45504" + "'", str17, "HikariPool-45504");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test16346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16346");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setPoolName("HikariPool-116");
        hikariConfig1.connectionTestQuery = "HikariPool-2561";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test16347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16347");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setTransactionIsolation("HikariPool-281");
        int int11 = hikariConfig1.transactionIsolation;
        hikariConfig1.setConnectionInitSql("HikariPool-963");
        java.lang.String str14 = hikariConfig1.getCatalog();
        hikariConfig1.setDataSourceClassName("HikariPool-3966");
        hikariConfig1.leakDetectionThreshold = (byte) -1;
        int int19 = hikariConfig1.getMinimumPoolSize();
        boolean boolean20 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setInitializationFailFast(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test16348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16348");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.acquireRetries = 'a';
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        long long14 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig13.connectionInitSql = "hi!";
        hikariConfig13.acquireIncrement = (byte) 100;
        hikariConfig13.setMinimumPoolSize((int) (short) 0);
        java.lang.String str21 = hikariConfig13.dataSourceClassName;
        long long22 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig13.idleTimeout = (byte) -1;
        java.util.Properties properties25 = hikariConfig13.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties25;
        java.util.Properties properties27 = null;
        hikariConfig1.dataSourceProperties = properties27;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-521");
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.idleTimeout = 1;
        long long35 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 97L + "'", long35 == 97L);
    }

    @Test
    public void test16349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16349");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-1120");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        hikariConfig1.acquireRetryDelay = 60;
        java.lang.String str18 = hikariConfig1.getPoolName();
        hikariConfig1.setMinimumPoolSize(35);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-45509" + "'", str18, "HikariPool-45509");
    }

    @Test
    public void test16350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16350");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        long long4 = hikariConfig1.getIdleTimeout();
        int int5 = hikariConfig1.getAcquireIncrement();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.leakDetectionThreshold = (byte) 1;
        int int9 = hikariConfig1.getAcquireIncrement();
        long long10 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
    }

    @Test
    public void test16351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16351");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        int int12 = hikariConfig1.transactionIsolation;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setAcquireIncrement((int) 'a');
        hikariConfig1.setJdbcUrl("HikariPool-290");
        hikariConfig1.catalog = "HikariPool-34";
        hikariConfig1.setAcquireRetries(32);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-628");
        long long24 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setJdbc4ConnectionTest(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test16352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16352");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.transactionIsolation = (byte) 0;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.idleTimeout = (-1);
        java.util.Properties properties14 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig1.setDataSourceProperties(properties14);
        boolean boolean19 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.connectionTestQuery = "HikariPool-24592";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16353");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.acquireIncrement = (short) 100;
        hikariConfig1.isReadOnly = false;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.connectionInitSql = "hi!";
        hikariConfig17.acquireIncrement = (byte) 100;
        hikariConfig17.setMinimumPoolSize((int) (short) 0);
        hikariConfig17.connectionTestQuery = "";
        long long27 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.poolName = "HikariPool-495";
        java.lang.String str30 = hikariConfig17.getPoolName();
        hikariConfig17.setMinimumPoolSize(97);
        boolean boolean33 = hikariConfig17.isAutoCommit();
        java.lang.String str34 = hikariConfig17.getJdbcUrl();
        java.util.Properties properties35 = hikariConfig17.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties35);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3L + "'", long27 == 3L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-495" + "'", str30, "HikariPool-495");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test16354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16354");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean10 = hikariConfig1.isRegisterMbeans;
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        boolean boolean12 = hikariConfig1.isAutoCommit();
        long long13 = hikariConfig1.idleTimeout;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-4463");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-4463' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test16355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16355");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.transactionIsolation = (byte) 10;
        int int10 = hikariConfig1.acquireIncrement;
        hikariConfig1.connectionTestQuery = "HikariPool-273";
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str14 = hikariConfig1.jdbcUrl;
        int int15 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test16356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16356");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        int int11 = hikariConfig1.minPoolSize;
        hikariConfig1.catalog = "HikariPool-847";
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16357");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setConnectionTestQuery("HikariPool-117");
        hikariConfig1.transactionIsolationName = "HikariPool-555";
        hikariConfig1.maxLifetime = (short) 10;
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
        hikariConfig1.maxLifetime = 3;
        hikariConfig1.setConnectionTestQuery("HikariPool-7509");
        hikariConfig1.setCatalog("");
        java.lang.Class<?> wildcardClass25 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-117" + "'", str18, "HikariPool-117");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test16358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16358");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.acquireRetries = 'a';
        java.lang.String str12 = hikariConfig1.poolName;
        hikariConfig1.setMaxLifetime((long) 10);
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("HikariPool-28432");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-45532" + "'", str12, "HikariPool-45532");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test16359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16359");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-23468");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-23468 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16360");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setIdleTimeout(2147483647L);
        boolean boolean13 = hikariConfig1.isReadOnly();
        hikariConfig1.setMinimumPoolSize(60);
        hikariConfig1.setTransactionIsolation("HikariPool-1025");
        hikariConfig1.setAutoCommit(false);
        javax.sql.DataSource dataSource20 = hikariConfig1.dataSource;
        long long21 = hikariConfig1.connectionTimeout;
        hikariConfig1.leakDetectionThreshold = 1;
        javax.sql.DataSource dataSource24 = null;
        hikariConfig1.setDataSource(dataSource24);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
    }

    @Test
    public void test16361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16361");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAutoCommit(true);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long19 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.idleTimeout = (-1);
        hikariConfig18.setMaximumPoolSize((int) 'a');
        long long24 = hikariConfig18.acquireRetryDelay;
        long long25 = hikariConfig18.leakDetectionThreshold;
        javax.sql.DataSource dataSource26 = hikariConfig18.getDataSource();
        hikariConfig18.connectionTestQuery = "HikariPool-273";
        int int29 = hikariConfig18.getTransactionIsolation();
        hikariConfig1.addDataSourceProperty("HikariPool-2198", (java.lang.Object) int29);
        int int31 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str32 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setAcquireIncrement((int) '#');
        hikariConfig1.setAcquireRetries(97);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test16362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16362");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.lang.String str7 = hikariConfig6.getDataSourceClassName();
        hikariConfig6.setTransactionIsolation("hi!");
        hikariConfig6.acquireRetryDelay = '4';
        hikariConfig6.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties14 = hikariConfig6.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties14);
        int int16 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        hikariConfig1.acquireIncrement = 60;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test16363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16363");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaxLifetime((long) 100);
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.leakDetectionThreshold = 'a';
        int int17 = hikariConfig1.minPoolSize;
        java.lang.String str18 = hikariConfig1.getPoolName();
        hikariConfig1.setPoolName("HikariPool-249");
        java.lang.String str21 = hikariConfig1.getPoolName();
        boolean boolean22 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setIsolateInternalQueries(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-14811");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-14811' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-45551" + "'", str18, "HikariPool-45551");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-249" + "'", str21, "HikariPool-249");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16364");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean10 = hikariConfig1.isRegisterMbeans;
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        long long12 = hikariConfig1.acquireRetryDelay;
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16365");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionTimeout = (byte) -1;
        long long14 = hikariConfig1.maxLifetime;
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.isAutoCommit = true;
        java.lang.String str18 = hikariConfig1.getCatalog();
        boolean boolean19 = hikariConfig1.isReadOnly;
        hikariConfig1.isInitializationFailFast = false;
        int int22 = hikariConfig1.minPoolSize;
        boolean boolean23 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isIsolateInternalQueries = false;
        long long26 = hikariConfig1.leakDetectionThreshold;
        javax.sql.DataSource dataSource27 = null;
        hikariConfig1.setDataSource(dataSource27);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test16366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16366");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.jdbcUrl;
        java.lang.String str9 = hikariConfig1.jdbcUrl;
        hikariConfig1.dataSourceClassName = "HikariPool-14853";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16367");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16368");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.jdbcUrl = "HikariPool-55";
        java.lang.String str18 = hikariConfig1.transactionIsolationName;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-285";
        int int21 = hikariConfig1.acquireRetries;
        hikariConfig1.setReadOnly(true);
        hikariConfig1.acquireIncrement = 3;
        long long26 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45556" + "'", str9, "HikariPool-45556");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45556" + "'", str13, "HikariPool-45556");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-55" + "'", str18, "HikariPool-55");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
    }

    @Test
    public void test16369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16369");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        hikariConfig1.dataSourceClassName = "HikariPool-172";
        hikariConfig1.setTransactionIsolation("HikariPool-55");
        java.lang.String str17 = hikariConfig1.getJdbcUrl();
        int int18 = hikariConfig1.getMinimumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test16370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16370");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        java.lang.String str15 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.connectionTimeout = (byte) 10;
        long long18 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str19 = hikariConfig1.getDataSourceClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16371");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        int int12 = hikariConfig1.transactionIsolation;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setIdleTimeout(1800000L);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        java.lang.String str19 = hikariConfig1.connectionTestQuery;
        int int20 = hikariConfig1.getMinimumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test16372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16372");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setDataSourceClassName("HikariPool-1335");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
    }

    @Test
    public void test16373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16373");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.transactionIsolation = (byte) 10;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        hikariConfig1.acquireIncrement = (byte) 0;
        int int13 = hikariConfig1.minPoolSize;
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setLeakDetectionThreshold((long) 32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16374");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        java.lang.String str4 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionTestQuery("HikariPool-833");
        hikariConfig1.connectionTestQuery = "HikariPool-305";
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-45567" + "'", str4, "HikariPool-45567");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test16375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16375");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        java.lang.String str4 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setCatalog("HikariPool-134");
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.minPoolSize = (short) 100;
        long long13 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test16376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16376");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-55");
        hikariConfig1.dataSourceClassName = "HikariPool-77";
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str17 = hikariConfig1.connectionCustomizerClassName;
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        boolean boolean20 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isAutoCommit = true;
        int int23 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45" + "'", str16, "HikariPool-45");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test16377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16377");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setJdbcUrl("HikariPool-300");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-335");
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.dataSourceClassName = "HikariPool-609";
        int int17 = hikariConfig1.maxPoolSize;
        hikariConfig1.acquireRetries = 1;
        long long20 = hikariConfig1.acquireRetryDelay;
        java.lang.String str21 = hikariConfig1.getConnectionCustomizerClassName();
        int int22 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-335" + "'", str21, "HikariPool-335");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test16378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16378");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.transactionIsolation = (byte) 10;
        int int10 = hikariConfig1.acquireIncrement;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setMinimumPoolSize(100);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isIsolateInternalQueries();
        long long18 = hikariConfig16.getConnectionTimeout();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        long long21 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.connectionInitSql = "hi!";
        hikariConfig20.acquireIncrement = (byte) 100;
        hikariConfig20.setMinimumPoolSize((int) (short) 0);
        java.lang.String str28 = hikariConfig20.dataSourceClassName;
        long long29 = hikariConfig20.getAcquireRetryDelay();
        boolean boolean30 = hikariConfig20.isRegisterMbeans;
        int int31 = hikariConfig20.transactionIsolation;
        java.util.Properties properties32 = hikariConfig20.dataSourceProperties;
        hikariConfig16.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig1.dataSourceProperties = properties32;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties32);
        java.lang.String str37 = hikariConfig36.poolName;
        hikariConfig36.transactionIsolation = (byte) 10;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer40 = null;
        hikariConfig36.connectionCustomizer = iConnectionCustomizer40;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNull(str28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-45575" + "'", str37, "HikariPool-45575");
    }

    @Test
    public void test16379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16379");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setUseInstrumentation(false);
        long long10 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setConnectionTestQuery("HikariPool-300");
        boolean boolean13 = hikariConfig1.isAutoCommit;
        hikariConfig1.setMaximumPoolSize(35);
        boolean boolean16 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.connectionTimeout = 5000L;
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        boolean boolean20 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test16380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16380");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig1.connectionTestQuery;
        hikariConfig1.isInitializationFailFast = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16381");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        hikariConfig1.isIsolateInternalQueries = true;
        int int16 = hikariConfig1.getMaximumPoolSize();
        int int17 = hikariConfig1.maxPoolSize;
        hikariConfig1.setConnectionInitSql("HikariPool-6071");
        long long20 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
    }

    @Test
    public void test16382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16382");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (byte) -1;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.setTransactionIsolation("HikariPool-188");
        hikariConfig14.setMinimumPoolSize(97);
        java.lang.String str19 = hikariConfig14.getConnectionInitSql();
        java.lang.String str20 = hikariConfig14.transactionIsolationName;
        java.lang.String str21 = hikariConfig14.getConnectionCustomizerClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-188" + "'", str20, "HikariPool-188");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16383");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean3 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str4 = hikariConfig1.transactionIsolationName;
        hikariConfig1.transactionIsolation = (byte) 0;
        java.lang.String str7 = hikariConfig1.jdbcUrl;
        hikariConfig1.transactionIsolationName = "HikariPool-2223";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16384");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaxLifetime((long) 100);
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.leakDetectionThreshold = 'a';
        boolean boolean17 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.acquireIncrement = (byte) 100;
        java.lang.String str22 = hikariConfig1.connectionTestQuery;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16385");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.getMaxLifetime();
        boolean boolean10 = hikariConfig1.isReadOnly;
        long long11 = hikariConfig1.getIdleTimeout();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries;
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isInitializationFailFast = true;
        int int18 = hikariConfig1.getMinimumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test16386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16386");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        hikariConfig1.setAutoCommit(false);
        boolean boolean7 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-317");
        hikariConfig1.catalog = "HikariPool-2330";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-194";
        long long14 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test16387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16387");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        hikariConfig1.connectionTestQuery = "HikariPool-167";
        hikariConfig1.acquireRetryDelay = 97;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setInitializationFailFast(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16388");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        boolean boolean9 = hikariConfig1.isAutoCommit;
        int int10 = hikariConfig1.acquireRetries;
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        int int13 = hikariConfig1.getMaximumPoolSize();
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16389");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        hikariConfig1.dataSourceClassName = "HikariPool-211";
        hikariConfig1.transactionIsolationName = "HikariPool-487";
        hikariConfig1.setAcquireRetryDelay((long) 10);
        javax.sql.DataSource dataSource18 = hikariConfig1.dataSource;
        java.lang.String str19 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionInitSql("HikariPool-44523");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16390");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireIncrement = (byte) 100;
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.acquireRetries = (byte) 100;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setPoolName("HikariPool-21004");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-45597" + "'", str12, "HikariPool-45597");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16391");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-77");
        java.lang.String str10 = hikariConfig1.getPoolName();
        int int11 = hikariConfig1.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-45598" + "'", str10, "HikariPool-45598");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test16392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16392");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str13 = hikariConfig1.jdbcUrl;
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.String str16 = hikariConfig1.poolName;
        hikariConfig1.poolName = "HikariPool-11515";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45601" + "'", str16, "HikariPool-45601");
    }

    @Test
    public void test16393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16393");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (byte) -1;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = 0;
        int int16 = hikariConfig1.maxPoolSize;
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        int int18 = hikariConfig1.acquireRetries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test16394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16394");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean7 = hikariConfig6.isAutoCommit();
        int int8 = hikariConfig6.acquireIncrement;
        hikariConfig6.connectionCustomizerClassName = "HikariPool-330";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test16395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16395");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.getTransactionIsolation();
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16396");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        int int10 = hikariConfig1.acquireRetries;
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries();
        int int12 = hikariConfig1.getAcquireIncrement();
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean16 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.acquireIncrement = 3;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16397");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("HikariPool-480");
        int int14 = hikariConfig1.minPoolSize;
        int int15 = hikariConfig1.transactionIsolation;
        hikariConfig1.maxLifetime = 10;
        java.lang.String str18 = hikariConfig1.getJdbcUrl();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16398");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        long long7 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        long long9 = hikariConfig1.maxLifetime;
        int int10 = hikariConfig1.maxPoolSize;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        long long13 = hikariConfig12.getAcquireRetryDelay();
        hikariConfig12.idleTimeout = (-1);
        hikariConfig12.setMaximumPoolSize((int) 'a');
        java.lang.String str18 = hikariConfig12.catalog;
        hikariConfig12.connectionTimeout = ' ';
        java.lang.String str21 = hikariConfig12.getConnectionTestQuery();
        java.util.Properties properties22 = hikariConfig12.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties22;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.poolName = "HikariPool-17237";
        long long28 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test16399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16399");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.lang.String str4 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long9 = hikariConfig8.getAcquireRetryDelay();
        hikariConfig8.idleTimeout = (-1);
        hikariConfig8.setMaximumPoolSize((int) 'a');
        long long14 = hikariConfig8.getLeakDetectionThreshold();
        java.lang.String str15 = hikariConfig8.catalog;
        long long16 = hikariConfig8.getMaxLifetime();
        boolean boolean17 = hikariConfig8.isReadOnly;
        long long18 = hikariConfig8.getIdleTimeout();
        java.util.Properties properties19 = hikariConfig8.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties19;
        hikariConfig1.acquireRetries = (byte) 10;
        hikariConfig1.acquireRetryDelay = 'a';
        int int25 = hikariConfig1.transactionIsolation;
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        long long29 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.connectionInitSql = "hi!";
        hikariConfig28.acquireIncrement = (byte) 100;
        hikariConfig28.setMinimumPoolSize((int) (short) 0);
        java.lang.String str36 = hikariConfig28.dataSourceClassName;
        long long37 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.setConnectionTestQuery("HikariPool-114");
        long long40 = hikariConfig28.getMaxLifetime();
        boolean boolean41 = hikariConfig28.isIsolateInternalQueries();
        hikariConfig28.acquireRetries = 0;
        boolean boolean44 = hikariConfig28.isReadOnly();
        boolean boolean45 = hikariConfig28.isReadOnly;
        int int46 = hikariConfig28.getMaximumPoolSize();
        java.util.Properties properties47 = hikariConfig28.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-335", (java.lang.Object) properties47);
        boolean boolean49 = hikariConfig1.isIsolateInternalQueries;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60 + "'", int46 == 60);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test16400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16400");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setPoolName("HikariPool-541");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer16;
        boolean boolean18 = hikariConfig1.isReadOnly();
        hikariConfig1.acquireIncrement = (byte) 0;
        hikariConfig1.setLeakDetectionThreshold((long) '4');
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16401");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.isInitializationFailFast = false;
        java.util.Properties properties13 = hikariConfig10.getDataSourceProperties();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test16402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16402");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.connectionTestQuery = "HikariPool-45";
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolation = 0;
        hikariConfig1.setReadOnly(true);
        long long18 = hikariConfig1.idleTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setRegisterMbeans(false);
        int int22 = hikariConfig1.getAcquireRetries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test16403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16403");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setAcquireIncrement(3);
        hikariConfig1.isAutoCommit = false;
        java.lang.String str12 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        java.lang.String str14 = hikariConfig1.poolName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-45632" + "'", str12, "HikariPool-45632");
        org.junit.Assert.assertNull(dataSource13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-45632" + "'", str14, "HikariPool-45632");
    }

    @Test
    public void test16404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16404");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.isReadOnly = true;
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.poolName = "HikariPool-1194";
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str21 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.idleTimeout = 0;
        int int24 = hikariConfig1.minPoolSize;
        java.lang.String str25 = hikariConfig1.getConnectionCustomizerClassName();
        int int26 = hikariConfig1.minPoolSize;
        hikariConfig1.connectionInitSql = "HikariPool-33";
        long long29 = hikariConfig1.getMaxLifetime();
        java.lang.String str30 = hikariConfig1.getConnectionCustomizerClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test16405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16405");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        long long7 = hikariConfig1.connectionTimeout;
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setMinimumPoolSize(1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
    }

    @Test
    public void test16406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16406");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        int int12 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) 97);
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean17 = hikariConfig1.isReadOnly;
        long long18 = hikariConfig1.maxLifetime;
        hikariConfig1.connectionTestQuery = "HikariPool-10338";
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45635" + "'", str9, "HikariPool-45635");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test16407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16407");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.setMaximumPoolSize(0);
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16408");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAcquireRetries((int) (byte) 10);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.dataSourceClassName = "HikariPool-5192";
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test16409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16409");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.idleTimeout = (-1);
        java.util.Properties properties21 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) properties21);
        hikariConfig1.leakDetectionThreshold = (short) -1;
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        long long27 = hikariConfig26.getAcquireRetryDelay();
        hikariConfig26.connectionInitSql = "hi!";
        hikariConfig26.acquireIncrement = (byte) 100;
        hikariConfig26.setMinimumPoolSize((int) (short) 0);
        java.lang.String str34 = hikariConfig26.dataSourceClassName;
        long long35 = hikariConfig26.getAcquireRetryDelay();
        hikariConfig26.idleTimeout = (byte) -1;
        java.util.Properties properties38 = hikariConfig26.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        java.lang.String str40 = hikariConfig39.getPoolName();
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        long long43 = hikariConfig42.getAcquireRetryDelay();
        hikariConfig42.connectionInitSql = "hi!";
        hikariConfig42.acquireIncrement = (byte) 100;
        hikariConfig42.setMinimumPoolSize((int) (short) 0);
        java.lang.String str50 = hikariConfig42.dataSourceClassName;
        long long51 = hikariConfig42.getAcquireRetryDelay();
        hikariConfig42.idleTimeout = (byte) -1;
        java.util.Properties properties54 = hikariConfig42.dataSourceProperties;
        hikariConfig39.setDataSourceProperties(properties54);
        hikariConfig1.setDataSourceProperties(properties54);
        java.lang.String str57 = hikariConfig1.jdbcUrl;
        hikariConfig1.isIsolateInternalQueries = false;
        java.lang.String str60 = hikariConfig1.jdbcUrl;
        java.lang.String str61 = hikariConfig1.catalog;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-45641" + "'", str40, "HikariPool-45641");
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertNull(str50);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test16410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16410");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        java.lang.String str7 = hikariConfig1.getJdbcUrl();
        hikariConfig1.isReadOnly = false;
        int int10 = hikariConfig1.getTransactionIsolation();
        java.lang.String str11 = hikariConfig1.jdbcUrl;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16411");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        java.lang.String str4 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setCatalog("HikariPool-134");
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setPoolName("HikariPool-3403");
        long long13 = hikariConfig1.getIdleTimeout();
        int int14 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test16412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16412");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        long long11 = hikariConfig1.connectionTimeout;
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        java.lang.String str13 = hikariConfig1.catalog;
        int int14 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionInitSql("HikariPool-18652");
        long long17 = hikariConfig1.getLeakDetectionThreshold();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test16413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16413");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str19 = hikariConfig18.getDataSourceClassName();
        hikariConfig18.setTransactionIsolation("hi!");
        hikariConfig18.acquireRetryDelay = '4';
        hikariConfig18.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties26 = hikariConfig18.getDataSourceProperties();
        hikariConfig18.setAcquireRetries((int) (short) 1);
        java.util.Properties properties29 = hikariConfig18.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties29;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig32.isJdbc4connectionTest = true;
        java.lang.String str35 = hikariConfig32.transactionIsolationName;
        java.lang.String str36 = hikariConfig32.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test16414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16414");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.poolName = "HikariPool-495";
        java.lang.String str14 = hikariConfig1.getPoolName();
        hikariConfig1.setMinimumPoolSize(97);
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        java.lang.String str20 = hikariConfig1.getCatalog();
        hikariConfig1.dataSourceClassName = "HikariPool-33092";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-495" + "'", str14, "HikariPool-495");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16415");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setReadOnly(false);
        java.lang.String str8 = hikariConfig1.getCatalog();
        hikariConfig1.isInitializationFailFast = false;
        long long11 = hikariConfig1.idleTimeout;
        hikariConfig1.minPoolSize = (byte) 0;
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str15 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16416");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setIsolateInternalQueries(true);
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        long long11 = hikariConfig1.getMaxLifetime();
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16417");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        java.lang.String str6 = hikariConfig1.jdbcUrl;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setIdleTimeout((long) '4');
        int int11 = hikariConfig1.maxPoolSize;
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.acquireIncrement = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16418");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean11 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16419");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.poolName = "HikariPool-6";
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionInitSql("HikariPool-1251");
        hikariConfig1.transactionIsolation = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-14923");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-14923' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test16420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16420");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        boolean boolean9 = hikariConfig1.isReadOnly;
        boolean boolean10 = hikariConfig1.isReadOnly;
        hikariConfig1.setConnectionTimeout(600000L);
        long long13 = hikariConfig1.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test16421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16421");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        long long11 = hikariConfig1.acquireRetryDelay;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.dataSource = dataSource12;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test16422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16422");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionInitSql = "HikariPool-139";
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        long long9 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setJdbcUrl("HikariPool-28");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        hikariConfig1.setLeakDetectionThreshold(35L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test16423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16423");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = (short) 100;
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str10 = hikariConfig1.poolName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-45665" + "'", str10, "HikariPool-45665");
    }

    @Test
    public void test16424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16424");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        long long7 = hikariConfig6.getAcquireRetryDelay();
        hikariConfig6.connectionInitSql = "hi!";
        hikariConfig6.acquireIncrement = (byte) 100;
        hikariConfig6.setMinimumPoolSize((int) (short) 0);
        java.lang.String str14 = hikariConfig6.dataSourceClassName;
        long long15 = hikariConfig6.getAcquireRetryDelay();
        hikariConfig6.idleTimeout = (byte) -1;
        java.util.Properties properties18 = hikariConfig6.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties18;
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setConnectionTestQuery("HikariPool-273");
        boolean boolean23 = hikariConfig1.isReadOnly();
        hikariConfig1.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test16425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16425");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionTestQuery("HikariPool-114");
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.idleTimeout = '4';
        hikariConfig1.setMaximumPoolSize(52);
        java.lang.String str18 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16426");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.poolName;
        boolean boolean12 = hikariConfig1.isAutoCommit;
        hikariConfig1.setTransactionIsolation("HikariPool-2411");
        int int15 = hikariConfig1.transactionIsolation;
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.idleTimeout = 3L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-45669" + "'", str11, "HikariPool-45669");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16427");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.isReadOnly = false;
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.jdbcUrl = "HikariPool-833";
        hikariConfig1.setDataSourceClassName("HikariPool-180");
        long long22 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource27 = hikariConfig24.getDataSource();
        hikariConfig24.connectionTestQuery = "HikariPool-55";
        hikariConfig24.connectionTestQuery = "hi!";
        java.lang.String str32 = hikariConfig24.poolName;
        hikariConfig24.setReadOnly(true);
        boolean boolean35 = hikariConfig24.isIsolateInternalQueries();
        hikariConfig24.transactionIsolationName = "HikariPool-97";
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        long long40 = hikariConfig39.getAcquireRetryDelay();
        hikariConfig39.connectionInitSql = "hi!";
        hikariConfig39.acquireIncrement = (byte) 100;
        hikariConfig39.setMinimumPoolSize((int) (short) 0);
        hikariConfig39.connectionTestQuery = "";
        hikariConfig39.jdbcUrl = "HikariPool-45";
        boolean boolean51 = hikariConfig39.isRegisterMbeans;
        hikariConfig39.isIsolateInternalQueries = true;
        hikariConfig39.idleTimeout = 100;
        java.lang.String str56 = hikariConfig39.connectionTestQuery;
        hikariConfig39.maxPoolSize = (short) -1;
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        long long61 = hikariConfig60.getAcquireRetryDelay();
        hikariConfig60.idleTimeout = (-1);
        java.util.Properties properties64 = hikariConfig60.getDataSourceProperties();
        hikariConfig39.dataSourceProperties = properties64;
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig24.dataSourceProperties = properties64;
        hikariConfig1.setDataSourceProperties(properties64);
        hikariConfig1.idleTimeout = 10;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-45671" + "'", str32, "HikariPool-45671");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 32L + "'", long61 == 32L);
        org.junit.Assert.assertNotNull(properties64);
    }

    @Test
    public void test16428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16428");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.isReadOnly = false;
        hikariConfig1.setPoolName("");
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties18 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(false);
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.maxPoolSize = (byte) 0;
        java.util.Properties properties30 = hikariConfig27.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig22.dataSourceProperties = properties30;
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        java.lang.String str36 = hikariConfig35.getDataSourceClassName();
        int int37 = hikariConfig35.getAcquireRetries();
        hikariConfig35.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource40 = null;
        hikariConfig35.setDataSource(dataSource40);
        hikariConfig35.poolName = "HikariPool-127";
        long long44 = hikariConfig35.getIdleTimeout();
        java.lang.String str45 = hikariConfig35.getConnectionTestQuery();
        java.lang.String str46 = hikariConfig35.connectionInitSql;
        hikariConfig35.transactionIsolation = 0;
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        java.lang.String str51 = hikariConfig50.getDataSourceClassName();
        int int52 = hikariConfig50.getAcquireRetries();
        hikariConfig50.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource55 = null;
        hikariConfig50.setDataSource(dataSource55);
        hikariConfig50.transactionIsolation = (byte) 10;
        int int59 = hikariConfig50.acquireIncrement;
        hikariConfig50.acquireRetryDelay = 100;
        java.util.Properties properties62 = hikariConfig50.dataSourceProperties;
        hikariConfig35.setDataSourceProperties(properties62);
        hikariConfig22.dataSourceProperties = properties62;
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties62);
        hikariConfig20.dataSourceProperties = properties62;
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties62);
        javax.sql.DataSource dataSource68 = hikariConfig67.getDataSource();
        hikariConfig67.isIsolateInternalQueries = false;
        hikariConfig67.isJdbc4connectionTest = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer73 = null;
        hikariConfig67.connectionCustomizer = iConnectionCustomizer73;
        hikariConfig67.catalog = "HikariPool-4125";
        long long77 = hikariConfig67.getLeakDetectionThreshold();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1800000L + "'", long44 == 1800000L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertNull(dataSource68);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
    }

    @Test
    public void test16429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16429");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        hikariConfig1.setMinimumPoolSize(3);
        int int11 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test16430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16430");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.maxLifetime;
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long13 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setDataSourceClassName("HikariPool-27415");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test16431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16431");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.transactionIsolationName = "HikariPool-105";
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.leakDetectionThreshold = 0L;
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        java.lang.String str16 = hikariConfig1.poolName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45691" + "'", str16, "HikariPool-45691");
    }

    @Test
    public void test16432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16432");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str9 = hikariConfig1.poolName;
        hikariConfig1.setReadOnly(true);
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionInitSql = "";
        boolean boolean17 = hikariConfig1.isRegisterMbeans;
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        java.lang.String str19 = hikariConfig1.jdbcUrl;
        hikariConfig1.maxLifetime = 358;
        hikariConfig1.setAcquireIncrement((int) (byte) 100);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45692" + "'", str9, "HikariPool-45692");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16433");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean6 = hikariConfig5.isInitializationFailFast();
        long long7 = hikariConfig5.maxLifetime;
        java.util.Properties properties8 = hikariConfig5.getDataSourceProperties();
        java.lang.String str9 = hikariConfig5.getCatalog();
        hikariConfig5.connectionTestQuery = "HikariPool-84";
        hikariConfig5.transactionIsolation = (short) 100;
        int int14 = hikariConfig5.getTransactionIsolation();
        hikariConfig1.addDataSourceProperty("HikariPool-134", (java.lang.Object) hikariConfig5);
        hikariConfig5.catalog = "hi!";
        hikariConfig5.setConnectionCustomizerClassName("hi!");
        java.lang.String str20 = hikariConfig5.getJdbcUrl();
        hikariConfig5.setAutoCommit(false);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig5.dataSource = dataSource23;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig5.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(iConnectionCustomizer25);
    }

    @Test
    public void test16434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16434");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-38565");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-38565 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16435");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.maxLifetime;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        int int11 = hikariConfig1.acquireRetries;
        int int12 = hikariConfig1.getAcquireIncrement();
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        long long16 = hikariConfig1.getConnectionTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test16436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16436");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.idleTimeout = (byte) 10;
        hikariConfig1.setMaxLifetime((long) (short) 10);
        hikariConfig1.acquireRetries = 60;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16437");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.getMaxLifetime();
        boolean boolean10 = hikariConfig1.isReadOnly;
        long long11 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str15 = hikariConfig14.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16438");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.maxLifetime;
        boolean boolean12 = hikariConfig1.isAutoCommit;
        long long13 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionInitSql("HikariPool-819");
        hikariConfig1.setAutoCommit(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test16439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16439");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.leakDetectionThreshold = 0L;
        java.lang.String str13 = hikariConfig10.catalog;
        hikariConfig10.isReadOnly = true;
        int int16 = hikariConfig10.minPoolSize;
        java.lang.String str17 = hikariConfig10.catalog;
        hikariConfig10.isAutoCommit = true;
        hikariConfig10.minPoolSize = 10;
        hikariConfig10.minPoolSize = (byte) 10;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16440");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setTransactionIsolation("HikariPool-276");
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setAutoCommit(true);
        boolean boolean16 = hikariConfig1.isReadOnly();
        boolean boolean17 = hikariConfig1.isReadOnly();
        hikariConfig1.acquireRetries = (byte) 10;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16441");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionTimeout = (byte) -1;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.dataSource = dataSource14;
        hikariConfig1.setLeakDetectionThreshold((long) 'a');
        hikariConfig1.setAcquireRetries((int) (short) 0);
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-21661");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-21661' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test16442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16442");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        java.lang.String str4 = hikariConfig1.transactionIsolationName;
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.transactionIsolationName = "HikariPool-7258";
        java.lang.String str8 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test16443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16443");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-55");
        boolean boolean14 = hikariConfig1.isReadOnly;
        hikariConfig1.setConnectionTimeout(600000L);
        long long17 = hikariConfig1.connectionTimeout;
        hikariConfig1.isAutoCommit = false;
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
        hikariConfig1.setConnectionInitSql("HikariPool-2331");
        long long24 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 600000L + "'", long17 == 600000L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 52L + "'", long24 == 52L);
    }

    @Test
    public void test16444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16444");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.jdbcUrl;
        java.lang.String str9 = hikariConfig1.jdbcUrl;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.lang.String str12 = hikariConfig11.getDataSourceClassName();
        int int13 = hikariConfig11.getAcquireRetries();
        hikariConfig11.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig11.setDataSource(dataSource16);
        java.lang.String str18 = hikariConfig11.getConnectionTestQuery();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        long long21 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.connectionInitSql = "hi!";
        hikariConfig20.acquireIncrement = (byte) 100;
        hikariConfig20.setMinimumPoolSize((int) (short) 0);
        hikariConfig20.connectionTestQuery = "";
        hikariConfig20.jdbcUrl = "HikariPool-45";
        hikariConfig20.isReadOnly = false;
        hikariConfig20.setPoolName("");
        java.lang.String str36 = hikariConfig20.getConnectionTestQuery();
        java.util.Properties properties37 = hikariConfig20.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig11.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig1.dataSourceProperties = properties37;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig43.idleTimeout = (short) 100;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(properties37);
    }

    @Test
    public void test16445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16445");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        long long7 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.maxLifetime = ' ';
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.acquireIncrement = (byte) -1;
        long long13 = hikariConfig1.idleTimeout;
        hikariConfig1.transactionIsolationName = "HikariPool-77";
        hikariConfig1.isAutoCommit = false;
        boolean boolean18 = hikariConfig1.isReadOnly;
        javax.sql.DataSource dataSource19 = hikariConfig1.getDataSource();
        java.lang.String str20 = hikariConfig1.getJdbcUrl();
        java.lang.String str21 = hikariConfig1.getJdbcUrl();
        hikariConfig1.leakDetectionThreshold = 1;
        javax.sql.DataSource dataSource24 = hikariConfig1.getDataSource();
        int int25 = hikariConfig1.minPoolSize;
        boolean boolean26 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test16446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16446");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.acquireRetries = '#';
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        long long10 = hikariConfig1.idleTimeout;
        hikariConfig1.leakDetectionThreshold = (short) 0;
        hikariConfig1.maxPoolSize = (short) 1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test16447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16447");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(0);
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.acquireRetries = 97;
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.maxPoolSize = 'a';
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str20 = hikariConfig1.dataSourceClassName;
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "HikariPool-697";
        hikariConfig1.setMaximumPoolSize(358);
        int int26 = hikariConfig1.transactionIsolation;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test16448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16448");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        java.lang.String str4 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setCatalog("HikariPool-134");
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setPoolName("HikariPool-3403");
        hikariConfig1.setJdbcUrl("HikariPool-3299");
        java.lang.String str15 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-134" + "'", str15, "HikariPool-134");
    }

    @Test
    public void test16449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16449");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setTransactionIsolation("HikariPool-276");
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig16.leakDetectionThreshold = '#';
        hikariConfig16.setConnectionCustomizerClassName("HikariPool-1423");
        long long21 = hikariConfig16.getLeakDetectionThreshold();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
    }

    @Test
    public void test16450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16450");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setMaxLifetime(1L);
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setUseInstrumentation(true);
        long long17 = hikariConfig1.maxLifetime;
        int int18 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test16451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16451");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setAcquireIncrement(97);
        int int10 = hikariConfig1.transactionIsolation;
        hikariConfig1.isReadOnly = false;
        int int13 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setAcquireRetries(60);
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        int int19 = hikariConfig1.getMaximumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test16452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16452");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.poolName = "HikariPool-127";
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        long long12 = hikariConfig1.idleTimeout;
        hikariConfig1.transactionIsolation = (short) 10;
        int int15 = hikariConfig1.getMaximumPoolSize();
        int int16 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-14758");
        long long19 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
    }

    @Test
    public void test16453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16453");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        hikariConfig1.connectionTestQuery = "HikariPool-167";
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        int int14 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.isIsolateInternalQueries = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test16454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16454");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        int int9 = hikariConfig1.acquireRetries;
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isIsolateInternalQueries = false;
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setCatalog("");
        hikariConfig1.setDataSourceClassName("HikariPool-2861");
        int int20 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isReadOnly = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test16455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16455");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.acquireRetryDelay = (byte) 10;
        hikariConfig1.setMaxLifetime((long) 100);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16456");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        hikariConfig1.setConnectionTestQuery("");
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetryDelay((long) (short) 10);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setDataSourceClassName("HikariPool-2119");
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test16457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16457");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setMaxLifetime(1L);
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("HikariPool-195");
        hikariConfig1.connectionTimeout = 3L;
        java.lang.String str21 = hikariConfig1.getConnectionInitSql();
        boolean boolean22 = hikariConfig1.isReadOnly;
        int int23 = hikariConfig1.getMinimumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer24;
        java.lang.String str26 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-195" + "'", str21, "HikariPool-195");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-45" + "'", str26, "HikariPool-45");
    }

    @Test
    public void test16458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16458");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.maxLifetime = 2147483647L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
    }

    @Test
    public void test16459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16459");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.idleTimeout = 100;
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
        boolean boolean19 = hikariConfig1.isReadOnly();
        hikariConfig1.setJdbcUrl("HikariPool-1096");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer22;
        int int24 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test16460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16460");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionTestQuery("HikariPool-114");
        long long13 = hikariConfig1.getMaxLifetime();
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str15 = hikariConfig1.poolName;
        hikariConfig1.isReadOnly = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-45747" + "'", str15, "HikariPool-45747");
    }

    @Test
    public void test16461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16461");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.transactionIsolation = 358;
        hikariConfig1.isReadOnly = true;
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-310";
        hikariConfig1.setMaxLifetime(52L);
        hikariConfig1.connectionTestQuery = "HikariPool-801";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer24;
        boolean boolean26 = hikariConfig1.isInitializationFailFast;
        java.lang.String str27 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = hikariConfig1.connectionCustomizer;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(iConnectionCustomizer28);
    }

    @Test
    public void test16462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16462");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        int int12 = hikariConfig1.getMaximumPoolSize();
        long long13 = hikariConfig1.maxLifetime;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.poolName = "HikariPool-1090";
        hikariConfig1.leakDetectionThreshold = 1;
        boolean boolean20 = hikariConfig1.isReadOnly;
        long long21 = hikariConfig1.acquireRetryDelay;
        boolean boolean22 = hikariConfig1.isAutoCommit();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test16463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16463");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        boolean boolean13 = hikariConfig1.isReadOnly;
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        long long18 = hikariConfig1.getIdleTimeout();
        long long19 = hikariConfig1.maxLifetime;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-609";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 10);
        boolean boolean24 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45750" + "'", str9, "HikariPool-45750");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test16464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16464");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-30737");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-30737 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16465");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = (byte) 10;
        int int13 = hikariConfig1.acquireIncrement;
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test16466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16466");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.jdbcUrl = "HikariPool-394";
        boolean boolean12 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16467");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.isReadOnly = false;
        java.lang.String str15 = hikariConfig1.catalog;
        boolean boolean16 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setConnectionInitSql("HikariPool-516");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16468");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.acquireRetries = 'a';
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        long long14 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig13.connectionInitSql = "hi!";
        hikariConfig13.acquireIncrement = (byte) 100;
        hikariConfig13.setMinimumPoolSize((int) (short) 0);
        java.lang.String str21 = hikariConfig13.dataSourceClassName;
        long long22 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig13.idleTimeout = (byte) -1;
        java.util.Properties properties25 = hikariConfig13.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties25;
        hikariConfig1.setAutoCommit(false);
        java.lang.String str29 = hikariConfig1.connectionTestQuery;
        javax.sql.DataSource dataSource30 = null;
        hikariConfig1.dataSource = dataSource30;
        hikariConfig1.setDataSourceClassName("HikariPool-826");
        hikariConfig1.poolName = "HikariPool-19564";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test16469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16469");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setIdleTimeout((long) (short) 100);
        int int16 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test16470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16470");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (byte) -1;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long15 = hikariConfig14.getIdleTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig14.connectionCustomizer = iConnectionCustomizer16;
        java.lang.String str18 = hikariConfig14.getJdbcUrl();
        hikariConfig14.poolName = "";
        long long21 = hikariConfig14.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test16471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16471");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        java.lang.String str17 = hikariConfig1.jdbcUrl;
        boolean boolean18 = hikariConfig1.isReadOnly;
        javax.sql.DataSource dataSource19 = hikariConfig1.dataSource;
        hikariConfig1.isInitializationFailFast = false;
        java.lang.String str22 = hikariConfig1.getCatalog();
        hikariConfig1.acquireRetries = 100;
        java.lang.String str25 = hikariConfig1.dataSourceClassName;
        hikariConfig1.transactionIsolationName = "HikariPool-31027";
        int int28 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45" + "'", str17, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test16472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16472");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        java.lang.String str9 = hikariConfig1.poolName;
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        hikariConfig1.minPoolSize = (byte) 100;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-45763" + "'", str9, "HikariPool-45763");
    }

    @Test
    public void test16473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16473");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str13 = hikariConfig1.getCatalog();
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.addDataSourceProperty("HikariPool-189", (java.lang.Object) "HikariPool-271");
        hikariConfig1.setLeakDetectionThreshold((long) 358);
        hikariConfig1.dataSourceClassName = "HikariPool-255";
        hikariConfig1.acquireRetries = '4';
        boolean boolean25 = hikariConfig1.isIsolateInternalQueries();
        long long26 = hikariConfig1.maxLifetime;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.acquireRetries = 358;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
    }

    @Test
    public void test16474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16474");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-77");
        boolean boolean10 = hikariConfig1.isReadOnly();
        hikariConfig1.acquireRetryDelay = 3;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16475");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setJdbcUrl("HikariPool-3711");
        java.lang.Class<?> wildcardClass12 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test16476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16476");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.leakDetectionThreshold = 0L;
        hikariConfig10.jdbcUrl = "HikariPool-279";
        javax.sql.DataSource dataSource15 = null;
        hikariConfig10.setDataSource(dataSource15);
        java.util.Properties properties17 = hikariConfig10.getDataSourceProperties();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig10.dataSource = dataSource18;
        hikariConfig10.acquireRetryDelay = (byte) -1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test16477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16477");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-45400");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-45400 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16478");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-40889");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-40889 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16479");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.acquireRetries = 'a';
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.connectionTimeout = 0;
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        java.lang.String str16 = hikariConfig1.dataSourceClassName;
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setLeakDetectionThreshold((long) 0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16480");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str19 = hikariConfig18.getDataSourceClassName();
        hikariConfig18.setTransactionIsolation("hi!");
        hikariConfig18.acquireRetryDelay = '4';
        hikariConfig18.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties26 = hikariConfig18.getDataSourceProperties();
        hikariConfig18.setAcquireRetries((int) (short) 1);
        java.util.Properties properties29 = hikariConfig18.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties29;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig32.isJdbc4connectionTest = true;
        java.util.Properties properties35 = hikariConfig32.getDataSourceProperties();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test16481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16481");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean7 = hikariConfig1.isAutoCommit;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.dataSource = dataSource8;
        java.util.Properties properties10 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDataSourceProperties(properties10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test16482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16482");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        long long10 = hikariConfig9.getAcquireRetryDelay();
        hikariConfig9.connectionInitSql = "hi!";
        hikariConfig9.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig9.transactionIsolation = (byte) 0;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long19 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.idleTimeout = (-1);
        java.util.Properties properties22 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig9.setDataSourceProperties(properties22);
        hikariConfig1.setDataSourceProperties(properties22);
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int30 = hikariConfig1.transactionIsolation;
        hikariConfig1.setJdbcUrl("HikariPool-542");
        boolean boolean33 = hikariConfig1.isRegisterMbeans();
        int int34 = hikariConfig1.getMaximumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
    }

    @Test
    public void test16483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16483");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str13 = hikariConfig1.getCatalog();
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.addDataSourceProperty("HikariPool-189", (java.lang.Object) "HikariPool-271");
        hikariConfig1.setLeakDetectionThreshold((long) 358);
        hikariConfig1.dataSourceClassName = "HikariPool-255";
        hikariConfig1.acquireRetries = '4';
        boolean boolean25 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setDataSourceClassName("HikariPool-2994");
        hikariConfig1.minPoolSize = 60;
        hikariConfig1.idleTimeout = 3;
        int int32 = hikariConfig1.transactionIsolation;
        hikariConfig1.idleTimeout = 0;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test16484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16484");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.idleTimeout = (-1);
        java.util.Properties properties21 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.setMinimumPoolSize((int) (short) 1);
        hikariConfig23.minPoolSize = 1;
        int int28 = hikariConfig23.acquireRetries;
        int int29 = hikariConfig23.getMinimumPoolSize();
        long long30 = hikariConfig23.getLeakDetectionThreshold();
        hikariConfig23.transactionIsolationName = "HikariPool-83";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test16485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16485");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.poolName = "HikariPool-127";
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        hikariConfig1.transactionIsolation = 0;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        java.lang.String str17 = hikariConfig16.getDataSourceClassName();
        int int18 = hikariConfig16.getAcquireRetries();
        hikariConfig16.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig16.setDataSource(dataSource21);
        hikariConfig16.transactionIsolation = (byte) 10;
        int int25 = hikariConfig16.acquireIncrement;
        hikariConfig16.acquireRetryDelay = 100;
        java.util.Properties properties28 = hikariConfig16.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties28);
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test16486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16486");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        long long7 = hikariConfig6.getAcquireRetryDelay();
        hikariConfig6.connectionInitSql = "hi!";
        hikariConfig6.acquireIncrement = (byte) 100;
        hikariConfig6.setMinimumPoolSize((int) (short) 0);
        java.lang.String str14 = hikariConfig6.dataSourceClassName;
        long long15 = hikariConfig6.getAcquireRetryDelay();
        hikariConfig6.idleTimeout = (byte) -1;
        java.util.Properties properties18 = hikariConfig6.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties18;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig20.setAcquireRetries((int) (byte) 10);
        java.lang.String str23 = hikariConfig20.getCatalog();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test16487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16487");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-69");
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.acquireIncrement = (short) -1;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(false);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        java.lang.String str20 = hikariConfig19.getDataSourceClassName();
        hikariConfig19.setTransactionIsolation("hi!");
        hikariConfig19.acquireRetryDelay = '4';
        hikariConfig19.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties27 = hikariConfig19.getDataSourceProperties();
        hikariConfig14.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig29.setAutoCommit(true);
        hikariConfig29.minPoolSize = '#';
        java.util.Properties properties34 = hikariConfig29.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties34;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setIdleTimeout(3L);
        int int40 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test16488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16488");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.isInitializationFailFast = true;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.connectionInitSql = "hi!";
        hikariConfig10.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig10.transactionIsolation = (byte) 0;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.idleTimeout = (-1);
        java.util.Properties properties23 = hikariConfig19.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig10.setDataSourceProperties(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        hikariConfig1.setConnectionTimeout(0L);
        long long31 = hikariConfig1.leakDetectionThreshold;
        boolean boolean32 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str33 = hikariConfig1.transactionIsolationName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test16489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16489");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        hikariConfig1.dataSourceClassName = "HikariPool-211";
        hikariConfig1.maxPoolSize = (short) 100;
        int int16 = hikariConfig1.getMaximumPoolSize();
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.connectionInitSql = "hi!";
        hikariConfig19.acquireIncrement = (byte) 100;
        hikariConfig19.setMinimumPoolSize((int) (short) 0);
        java.lang.String str27 = hikariConfig19.dataSourceClassName;
        long long28 = hikariConfig19.getAcquireRetryDelay();
        boolean boolean29 = hikariConfig19.isRegisterMbeans;
        java.lang.String str30 = hikariConfig19.getConnectionInitSql();
        hikariConfig19.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig19.setReadOnly(false);
        java.util.Properties properties35 = hikariConfig19.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig1.setDataSourceProperties(properties35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNull(str27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test16490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16490");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.isJdbc4connectionTest = false;
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        long long12 = hikariConfig11.getAcquireRetryDelay();
        hikariConfig11.connectionInitSql = "hi!";
        hikariConfig11.acquireIncrement = (byte) 100;
        hikariConfig11.setMinimumPoolSize((int) (short) 0);
        hikariConfig11.connectionTestQuery = "";
        hikariConfig11.jdbcUrl = "HikariPool-45";
        hikariConfig11.isReadOnly = false;
        hikariConfig11.setPoolName("");
        java.lang.String str27 = hikariConfig11.getConnectionTestQuery();
        java.util.Properties properties28 = hikariConfig11.dataSourceProperties;
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        long long31 = hikariConfig30.getAcquireRetryDelay();
        hikariConfig30.connectionInitSql = "hi!";
        hikariConfig30.acquireIncrement = (byte) 100;
        hikariConfig30.setJdbcUrl("");
        hikariConfig30.setConnectionTimeout((long) 100);
        hikariConfig30.connectionTestQuery = "HikariPool-167";
        java.lang.String str42 = hikariConfig30.getConnectionInitSql();
        java.util.Properties properties43 = hikariConfig30.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties43;
        hikariConfig1.dataSourceProperties = properties43;
        hikariConfig1.poolName = "HikariPool-371";
        java.lang.String str48 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isReadOnly = false;
        hikariConfig1.isRegisterMbeans = true;
        javax.sql.DataSource dataSource53 = null;
        hikariConfig1.dataSource = dataSource53;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(properties28);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test16491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16491");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.isRegisterMbeans = false;
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        long long9 = hikariConfig8.getAcquireRetryDelay();
        hikariConfig8.connectionInitSql = "hi!";
        hikariConfig8.acquireIncrement = (byte) 100;
        hikariConfig8.setMinimumPoolSize((int) (short) 0);
        hikariConfig8.connectionTestQuery = "";
        hikariConfig8.jdbcUrl = "HikariPool-45";
        hikariConfig8.isReadOnly = false;
        hikariConfig8.setPoolName("");
        java.lang.String str24 = hikariConfig8.getConnectionTestQuery();
        java.util.Properties properties25 = hikariConfig8.dataSourceProperties;
        int int26 = hikariConfig8.transactionIsolation;
        hikariConfig8.setConnectionInitSql("HikariPool-746");
        hikariConfig1.addDataSourceProperty("HikariPool-1663", (java.lang.Object) hikariConfig8);
        hikariConfig1.maxPoolSize = 0;
        java.lang.String str32 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean33 = hikariConfig1.isInitializationFailFast();
        long long34 = hikariConfig1.connectionTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-2425");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3L + "'", long34 == 3L);
    }

    @Test
    public void test16492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16492");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-291";
        long long9 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setTransactionIsolation("HikariPool-285");
        boolean boolean17 = hikariConfig1.isReadOnly();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-291" + "'", str12, "HikariPool-291");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16493");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1098");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1098 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16494");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (byte) -1;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long16 = hikariConfig15.leakDetectionThreshold;
        java.lang.String str17 = hikariConfig15.getConnectionTestQuery();
        hikariConfig15.setInitializationFailFast(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16495");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-55");
        hikariConfig1.setIdleTimeout((long) (short) 10);
        long long16 = hikariConfig1.leakDetectionThreshold;
        long long17 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbcUrl("HikariPool-1041");
        int int20 = hikariConfig1.transactionIsolation;
        long long21 = hikariConfig1.getConnectionTimeout();
        boolean boolean22 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setLeakDetectionThreshold(5000L);
        boolean boolean25 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2147483647L + "'", long17 == 2147483647L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2147483647L + "'", long21 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test16496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16496");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean10 = hikariConfig1.isReadOnly;
        int int11 = hikariConfig1.getTransactionIsolation();
        boolean boolean12 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test16497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16497");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.util.Properties properties9 = hikariConfig8.getDataSourceProperties();
        java.lang.String str10 = hikariConfig8.getCatalog();
        hikariConfig8.dataSourceClassName = "";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16498");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        long long9 = hikariConfig1.getIdleTimeout();
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setAutoCommit(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16499");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setIdleTimeout(10L);
        long long11 = hikariConfig1.acquireRetryDelay;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        hikariConfig1.leakDetectionThreshold = 0;
        boolean boolean15 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str16 = hikariConfig1.catalog;
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-32897";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16500");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        long long9 = hikariConfig1.idleTimeout;
        hikariConfig1.setLeakDetectionThreshold(100L);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.maxPoolSize = (byte) 0;
        java.util.Properties properties16 = hikariConfig13.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig1.dataSourceProperties = properties16;
        hikariConfig1.poolName = "HikariPool-239";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-8821";
        java.lang.String str24 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str24);
    }
}
