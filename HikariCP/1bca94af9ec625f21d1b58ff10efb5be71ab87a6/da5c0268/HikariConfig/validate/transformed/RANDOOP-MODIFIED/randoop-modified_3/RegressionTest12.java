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
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.transactionIsolation = (byte) 10;
        java.lang.String str10 = hikariConfig1.getJdbcUrl();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.leakDetectionThreshold = (-1L);
        long long14 = hikariConfig1.maxLifetime;
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long17 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1141";
        int int20 = hikariConfig1.getMinimumPoolSize();
        int int21 = hikariConfig1.getTransactionIsolation();
        java.lang.String str22 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-15351" + "'", str22, "HikariPool-15351");
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        long long7 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setIdleTimeout(32L);
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.poolName = "HikariPool-4443";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-45" + "'", str11, "HikariPool-45");
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
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
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str22 = hikariConfig1.getJdbcUrl();
        long long23 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaximumPoolSize(1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.dataSourceClassName = "HikariPool-117";
        java.lang.String str12 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setAutoCommit(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3259");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3259 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.transactionIsolation = (byte) 10;
        java.lang.String str10 = hikariConfig1.getJdbcUrl();
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("");
        int int14 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionInitSql("HikariPool-3939");
        boolean boolean17 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        long long8 = hikariConfig1.acquireRetryDelay;
        int int9 = hikariConfig1.maxPoolSize;
        long long10 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setInitializationFailFast(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
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
        boolean boolean13 = hikariConfig1.isAutoCommit();
        int int14 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.isReadOnly = true;
        java.lang.String str19 = hikariConfig1.getPoolName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-15373" + "'", str19, "HikariPool-15373");
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
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
        hikariConfig1.connectionTestQuery = "HikariPool-45";
        boolean boolean24 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str25 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-4061");
        hikariConfig1.idleTimeout = 60L;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-45" + "'", str25, "HikariPool-45");
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.getMinimumPoolSize();
        long long10 = hikariConfig1.leakDetectionThreshold;
        long long11 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        long long17 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
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
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig1.setDataSourceProperties(properties21);
        java.lang.String str24 = hikariConfig1.connectionTestQuery;
        int int25 = hikariConfig1.transactionIsolation;
        long long26 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1800000L + "'", long26 == 1800000L);
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-15177");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-15177 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4625");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4625 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.acquireRetryDelay;
        long long8 = hikariConfig1.leakDetectionThreshold;
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-273";
        int int12 = hikariConfig1.getTransactionIsolation();
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        hikariConfig1.connectionTimeout = '#';
        java.lang.String str16 = hikariConfig1.poolName;
        java.lang.String str17 = hikariConfig1.getJdbcUrl();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-273" + "'", str13, "HikariPool-273");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-15389" + "'", str16, "HikariPool-15389");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
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
        int int17 = hikariConfig1.maxPoolSize;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.connectionTestQuery = "HikariPool-1090";
        java.lang.String str22 = hikariConfig1.transactionIsolationName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
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
        hikariConfig1.setMaxLifetime(32L);
        int int16 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isReadOnly = true;
        java.lang.String str21 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setConnectionTestQuery("HikariPool-9726");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45" + "'", str16, "HikariPool-45");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
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
        hikariConfig1.minPoolSize = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-2408");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-2408' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
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
        boolean boolean21 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionInitSql("HikariPool-3618");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean6 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isAutoCommit = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = (byte) 10;
        hikariConfig1.acquireIncrement = 0;
        int int15 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.maxPoolSize = (byte) -1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
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
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.dataSource = dataSource16;
        hikariConfig1.connectionTimeout = (short) 10;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str22 = hikariConfig1.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
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
        hikariConfig1.setTransactionIsolation("HikariPool-555");
        boolean boolean22 = hikariConfig1.isReadOnly;
        boolean boolean23 = hikariConfig1.isAutoCommit();
        hikariConfig1.acquireRetryDelay = (-1);
        java.lang.String str26 = hikariConfig1.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setReadOnly(false);
        int int10 = hikariConfig1.getTransactionIsolation();
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.setConnectionTimeout((long) 358);
        hikariConfig1.isAutoCommit = true;
        boolean boolean11 = hikariConfig1.isReadOnly();
        hikariConfig1.catalog = "HikariPool-191";
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.dataSourceClassName = "hi!";
        long long21 = hikariConfig17.acquireRetryDelay;
        hikariConfig17.setJdbcUrl("HikariPool-143");
        hikariConfig17.setJdbcUrl("HikariPool-406");
        long long26 = hikariConfig17.getMaxLifetime();
        boolean boolean27 = hikariConfig17.isInitializationFailFast;
        hikariConfig1.addDataSourceProperty("HikariPool-8441", (java.lang.Object) boolean27);
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) "HikariPool-8388");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.transactionIsolation = (short) -1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        int int7 = hikariConfig1.minPoolSize;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        long long11 = hikariConfig9.maxLifetime;
        java.util.Properties properties12 = hikariConfig9.getDataSourceProperties();
        hikariConfig9.isIsolateInternalQueries = false;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        long long18 = hikariConfig16.maxLifetime;
        java.util.Properties properties19 = hikariConfig16.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig9.setDataSourceProperties(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig1.dataSourceProperties = properties19;
        java.lang.String str24 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setAcquireRetries((int) (short) 1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setJdbcUrl("HikariPool-300");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-335");
        hikariConfig1.setLeakDetectionThreshold(600000L);
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 600000L + "'", long14 == 600000L);
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIdleTimeout(0L);
        int int7 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-559");
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.isIsolateInternalQueries = true;
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
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
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str16 = hikariConfig1.catalog;
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        java.lang.String str18 = hikariConfig1.jdbcUrl;
        boolean boolean19 = hikariConfig1.isRegisterMbeans;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-117" + "'", str17, "HikariPool-117");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = (short) 100;
        hikariConfig1.acquireIncrement = 97;
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        long long12 = hikariConfig1.acquireRetryDelay;
        java.lang.Class<?> wildcardClass13 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.connectionInitSql = "hi!";
        hikariConfig10.acquireIncrement = (byte) 100;
        hikariConfig10.setMinimumPoolSize((int) (short) 0);
        hikariConfig10.connectionTestQuery = "";
        hikariConfig10.jdbcUrl = "HikariPool-45";
        hikariConfig10.isReadOnly = false;
        hikariConfig10.setPoolName("");
        java.lang.String str26 = hikariConfig10.getConnectionTestQuery();
        java.util.Properties properties27 = hikariConfig10.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig1.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties27);
        int int34 = hikariConfig33.minPoolSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
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
        hikariConfig1.setMaxLifetime((long) (byte) 0);
        hikariConfig1.idleTimeout = (short) -1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
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
        hikariConfig1.leakDetectionThreshold = (-1L);
        int int21 = hikariConfig1.acquireIncrement;
        java.lang.Class<?> wildcardClass22 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
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
        hikariConfig1.acquireIncrement = 100;
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        java.lang.String str19 = hikariConfig1.getCatalog();
        java.util.Properties properties20 = hikariConfig1.dataSourceProperties;
        java.lang.String str21 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setMaxLifetime((long) ' ');
        java.lang.String str24 = hikariConfig1.getConnectionInitSql();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        int int8 = hikariConfig1.getAcquireRetries();
        hikariConfig1.idleTimeout = (short) 100;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-716");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-716 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        int int11 = hikariConfig1.minPoolSize;
        hikariConfig1.setJdbcUrl("HikariPool-195");
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        long long16 = hikariConfig15.getAcquireRetryDelay();
        hikariConfig15.connectionInitSql = "hi!";
        hikariConfig15.acquireIncrement = (byte) 100;
        hikariConfig15.setMinimumPoolSize((int) (short) 0);
        hikariConfig15.connectionTestQuery = "";
        hikariConfig15.jdbcUrl = "HikariPool-45";
        hikariConfig15.isReadOnly = false;
        hikariConfig15.setPoolName("");
        java.lang.String str31 = hikariConfig15.getConnectionTestQuery();
        java.util.Properties properties32 = hikariConfig15.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        javax.sql.DataSource dataSource37 = null;
        hikariConfig1.setDataSource(dataSource37);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.poolName;
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig15.minPoolSize = (byte) 100;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-15471" + "'", str11, "HikariPool-15471");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-291";
        long long9 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.transactionIsolation = 10;
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str14 = hikariConfig13.jdbcUrl;
        java.lang.Class<?> wildcardClass15 = hikariConfig13.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        hikariConfig1.connectionTestQuery = "HikariPool-164";
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isAutoCommit = false;
        int int17 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        long long13 = hikariConfig12.getAcquireRetryDelay();
        hikariConfig12.idleTimeout = (-1);
        hikariConfig12.setMaximumPoolSize((int) 'a');
        java.lang.String str18 = hikariConfig12.catalog;
        boolean boolean19 = hikariConfig12.isJdbc4ConnectionTest();
        boolean boolean20 = hikariConfig12.isInitializationFailFast();
        boolean boolean21 = hikariConfig12.isInitializationFailFast();
        java.lang.String str22 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig12.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig1.dataSourceProperties = properties23;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        long long30 = hikariConfig29.getAcquireRetryDelay();
        hikariConfig29.idleTimeout = (-1);
        hikariConfig29.setMaximumPoolSize((int) 'a');
        long long35 = hikariConfig29.getLeakDetectionThreshold();
        java.lang.String str36 = hikariConfig29.jdbcUrl;
        int int37 = hikariConfig29.acquireRetries;
        hikariConfig29.idleTimeout = 1;
        hikariConfig29.setMaximumPoolSize((int) '4');
        hikariConfig29.setInitializationFailFast(false);
        hikariConfig29.setLeakDetectionThreshold(2147483647L);
        int int46 = hikariConfig29.acquireRetries;
        hikariConfig26.addDataSourceProperty("HikariPool-1416", (java.lang.Object) hikariConfig29);
        hikariConfig29.minPoolSize = 0;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
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
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
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
        hikariConfig1.jdbcUrl = "HikariPool-10931";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = (byte) 10;
        hikariConfig1.acquireIncrement = 0;
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        hikariConfig1.isIsolateInternalQueries = true;
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource19 = hikariConfig1.dataSource;
        hikariConfig1.setRegisterMbeans(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
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
        hikariConfig8.acquireRetryDelay = 358;
        long long13 = hikariConfig8.idleTimeout;
        hikariConfig8.isInitializationFailFast = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
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
        hikariConfig1.setDataSourceClassName("HikariPool-6474");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
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
        java.lang.Class<?> wildcardClass69 = properties64.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-15507" + "'", str32, "HikariPool-15507");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        boolean boolean5 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setConnectionTimeout((long) 358);
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.idleTimeout = 5000L;
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionInitSql("HikariPool-1834");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        java.lang.String str12 = hikariConfig1.jdbcUrl;
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        long long9 = hikariConfig1.idleTimeout;
        hikariConfig1.setAcquireIncrement(35);
        java.lang.String str12 = hikariConfig1.poolName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-15521" + "'", str12, "HikariPool-15521");
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
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
        boolean boolean13 = hikariConfig1.isAutoCommit();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2923");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2923 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
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
        hikariConfig1.setAcquireRetries(60);
        boolean boolean22 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-15529" + "'", str9, "HikariPool-15529");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        hikariConfig1.connectionTestQuery = "HikariPool-152";
        hikariConfig1.setPoolName("HikariPool-291");
        hikariConfig1.minPoolSize = 35;
        java.lang.String str14 = hikariConfig1.getPoolName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-291" + "'", str14, "HikariPool-291");
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        int int4 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setJdbcUrl("HikariPool-1258");
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbcUrl("");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
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
        java.lang.String str29 = hikariConfig1.connectionTestQuery;
        boolean boolean30 = hikariConfig1.isAutoCommit();
        hikariConfig1.setReadOnly(true);
        boolean boolean33 = hikariConfig1.isReadOnly;
        java.util.Properties properties34 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(properties34);
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        boolean boolean5 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-7257";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        int int8 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetries(60);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6968");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6968 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setTransactionIsolation("HikariPool-77");
        java.util.Properties properties6 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setPoolName("HikariPool-300");
        hikariConfig7.idleTimeout = (byte) -1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
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
        long long56 = hikariConfig28.acquireRetryDelay;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 2147483647L + "'", long38 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 2147483647L + "'", long44 == 2147483647L);
        org.junit.Assert.assertNull(iConnectionCustomizer45);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 52L + "'", long56 == 52L);
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        java.lang.String str8 = hikariConfig1.jdbcUrl;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
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
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.lang.String str16 = hikariConfig15.getDataSourceClassName();
        int int17 = hikariConfig15.getAcquireRetries();
        hikariConfig15.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig15.setDataSource(dataSource20);
        java.lang.String str22 = hikariConfig15.getConnectionTestQuery();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.connectionInitSql = "hi!";
        hikariConfig24.acquireIncrement = (byte) 100;
        hikariConfig24.setMinimumPoolSize((int) (short) 0);
        hikariConfig24.connectionTestQuery = "";
        hikariConfig24.jdbcUrl = "HikariPool-45";
        hikariConfig24.isReadOnly = false;
        hikariConfig24.setPoolName("");
        java.lang.String str40 = hikariConfig24.getConnectionTestQuery();
        java.util.Properties properties41 = hikariConfig24.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig15.setDataSourceProperties(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties41);
        java.util.Properties properties45 = hikariConfig44.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties45);
        hikariConfig1.setInitializationFailFast(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
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
        int int20 = hikariConfig14.getTransactionIsolation();
        java.lang.String str21 = hikariConfig14.getPoolName();
        hikariConfig14.minPoolSize = (-1);
        java.util.Properties properties24 = hikariConfig14.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.setCatalog("HikariPool-132");
        java.lang.String str28 = hikariConfig25.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-15553" + "'", str21, "HikariPool-15553");
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-132" + "'", str28, "HikariPool-132");
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionTestQuery = "HikariPool-475";
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.dataSourceClassName = "HikariPool-268";
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean17 = hikariConfig1.isAutoCommit;
        hikariConfig1.maxLifetime = 10L;
        boolean boolean20 = hikariConfig1.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setInitializationFailFast(false);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.maxPoolSize = (byte) 0;
        java.util.Properties properties19 = hikariConfig16.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig11.dataSourceProperties = properties19;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties19);
        java.util.Properties properties25 = hikariConfig24.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties25);
        boolean boolean27 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        hikariConfig1.jdbcUrl = "HikariPool-84";
        hikariConfig1.poolName = "HikariPool-693";
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        java.lang.String str18 = hikariConfig17.getDataSourceClassName();
        hikariConfig17.setTransactionIsolation("hi!");
        hikariConfig17.acquireRetryDelay = '4';
        hikariConfig17.setConnectionTimeout((long) (short) 0);
        hikariConfig17.setConnectionTestQuery("HikariPool-45");
        hikariConfig17.setTransactionIsolation("HikariPool-114");
        hikariConfig17.setDataSourceClassName("HikariPool-77");
        javax.sql.DataSource dataSource31 = null;
        hikariConfig17.setDataSource(dataSource31);
        hikariConfig17.poolName = "HikariPool-335";
        int int35 = hikariConfig17.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-672", (java.lang.Object) int35);
        long long37 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 52L + "'", long37 == 52L);
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
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
        java.lang.String str22 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setUseInstrumentation(false);
        int int25 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        boolean boolean7 = hikariConfig1.isAutoCommit();
        hikariConfig1.jdbcUrl = "HikariPool-266";
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setConnectionTimeout((long) (byte) 100);
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.setAcquireRetryDelay((long) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-291";
        long long9 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        hikariConfig1.setDataSourceClassName("HikariPool-581");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        hikariConfig1.acquireIncrement = 358;
        boolean boolean18 = hikariConfig1.isInitializationFailFast;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
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
        int int16 = hikariConfig1.minPoolSize;
        boolean boolean17 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
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
        hikariConfig14.setJdbcUrl("HikariPool-908");
        hikariConfig14.isIsolateInternalQueries = true;
        java.lang.String str23 = hikariConfig14.getDataSourceClassName();
        long long24 = hikariConfig14.getMaxLifetime();
        hikariConfig14.dataSourceClassName = "HikariPool-8817";
        hikariConfig14.setConnectionCustomizerClassName("HikariPool-9334");
        int int29 = hikariConfig14.minPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isReadOnly;
        long long7 = hikariConfig1.leakDetectionThreshold;
        long long8 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
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
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        java.lang.String str15 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str16 = hikariConfig1.connectionTestQuery;
        hikariConfig1.jdbcUrl = "HikariPool-1073";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
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
        java.lang.String str27 = hikariConfig1.connectionInitSql;
        java.util.Properties properties28 = hikariConfig1.dataSourceProperties;
        java.lang.String str29 = hikariConfig1.connectionTestQuery;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
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
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.connectionInitSql = "hi!";
        hikariConfig17.acquireIncrement = (byte) 100;
        hikariConfig17.setMinimumPoolSize((int) (short) 0);
        java.lang.String str25 = hikariConfig17.dataSourceClassName;
        long long26 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.idleTimeout = (byte) -1;
        java.util.Properties properties29 = hikariConfig17.dataSourceProperties;
        hikariConfig14.setDataSourceProperties(properties29);
        java.lang.String str31 = hikariConfig14.transactionIsolationName;
        java.lang.String str32 = hikariConfig14.connectionCustomizerClassName;
        javax.sql.DataSource dataSource33 = hikariConfig14.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-15612" + "'", str15, "HikariPool-15612");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNull(str25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(dataSource33);
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
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
        hikariConfig1.setDataSourceClassName("HikariPool-1840");
        java.lang.String str21 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
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
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionTestQuery("HikariPool-110");
        int int18 = hikariConfig1.getTransactionIsolation();
        long long19 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
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
        int int29 = hikariConfig1.acquireIncrement;
        java.lang.String str30 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.acquireRetries = '4';
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
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
        boolean boolean19 = hikariConfig1.isAutoCommit();
        long long20 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setMaximumPoolSize((int) '#');
        int int23 = hikariConfig1.transactionIsolation;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
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
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        long long19 = hikariConfig1.connectionTimeout;
        boolean boolean20 = hikariConfig1.isReadOnly;
        int int21 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
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
        hikariConfig1.setConnectionInitSql("HikariPool-195");
        long long22 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setIdleTimeout(97L);
        java.lang.String str25 = hikariConfig1.jdbcUrl;
        java.lang.String str26 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        boolean boolean29 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        boolean boolean4 = hikariConfig1.isAutoCommit;
        hikariConfig1.setDataSourceClassName("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        java.lang.Class<?> wildcardClass10 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
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
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.idleTimeout = (-1);
        java.util.Properties properties23 = hikariConfig19.getDataSourceProperties();
        long long24 = hikariConfig19.maxLifetime;
        hikariConfig19.setLeakDetectionThreshold(750L);
        int int27 = hikariConfig19.getMinimumPoolSize();
        java.lang.String str28 = hikariConfig19.getDataSourceClassName();
        hikariConfig19.setLeakDetectionThreshold(2147483647L);
        java.lang.String str31 = hikariConfig19.getDataSourceClassName();
        java.util.Properties properties32 = hikariConfig19.getDataSourceProperties();
        hikariConfig5.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(properties23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        java.lang.String str11 = hikariConfig1.getJdbcUrl();
        hikariConfig1.catalog = "HikariPool-87";
        java.lang.String str14 = hikariConfig1.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-8314");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-8314' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-87" + "'", str14, "HikariPool-87");
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
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
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.transactionIsolation = 0;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.maxLifetime;
        hikariConfig1.dataSourceClassName = "HikariPool-114";
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        java.lang.String str13 = hikariConfig1.jdbcUrl;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
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
        hikariConfig10.setConnectionInitSql("HikariPool-1619");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12490");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12490 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str17 = hikariConfig16.transactionIsolationName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig16.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
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
        hikariConfig1.setCatalog("HikariPool-15015");
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-15686" + "'", str9, "HikariPool-15686");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
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
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.connectionInitSql = "HikariPool-186";
        int int24 = hikariConfig1.maxPoolSize;
        long long25 = hikariConfig1.getMaxLifetime();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        int int4 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setJdbcUrl("HikariPool-1258");
        hikariConfig1.isRegisterMbeans = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
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
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        java.lang.String str16 = hikariConfig15.getDataSourceClassName();
        int int17 = hikariConfig15.getAcquireRetries();
        hikariConfig15.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig15.setDataSource(dataSource20);
        java.lang.String str22 = hikariConfig15.getConnectionTestQuery();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.connectionInitSql = "hi!";
        hikariConfig24.acquireIncrement = (byte) 100;
        hikariConfig24.setMinimumPoolSize((int) (short) 0);
        hikariConfig24.connectionTestQuery = "";
        hikariConfig24.jdbcUrl = "HikariPool-45";
        hikariConfig24.isReadOnly = false;
        hikariConfig24.setPoolName("");
        java.lang.String str40 = hikariConfig24.getConnectionTestQuery();
        java.util.Properties properties41 = hikariConfig24.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig15.setDataSourceProperties(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties41);
        java.util.Properties properties45 = hikariConfig44.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties45);
        java.lang.String str48 = hikariConfig47.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        long long9 = hikariConfig1.idleTimeout;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.transactionIsolationName = "HikariPool-1041";
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.acquireIncrement = '#';
        hikariConfig5.setAutoCommit(true);
        hikariConfig5.setRegisterMbeans(false);
        long long12 = hikariConfig5.maxLifetime;
        org.junit.Assert.assertNotNull(properties4);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setMaxLifetime((-1L));
        hikariConfig1.isReadOnly = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.isAutoCommit = false;
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.catalog = "";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
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
        hikariConfig1.transactionIsolation = 35;
        hikariConfig1.setPoolName("HikariPool-932");
        int int18 = hikariConfig1.getMinimumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-77");
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.maxLifetime = 52L;
        hikariConfig1.setMinimumPoolSize(3);
        long long15 = hikariConfig1.getMaxLifetime();
        int int16 = hikariConfig1.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.lang.String str4 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setJdbcUrl("HikariPool-1644");
        int int7 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
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
        hikariConfig1.setInitializationFailFast(true);
        long long15 = hikariConfig1.leakDetectionThreshold;
        int int16 = hikariConfig1.acquireRetries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
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
        boolean boolean13 = hikariConfig1.isAutoCommit;
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean16 = hikariConfig1.isAutoCommit();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig19.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource22 = hikariConfig19.getDataSource();
        hikariConfig19.connectionTestQuery = "HikariPool-55";
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean27 = hikariConfig26.isInitializationFailFast();
        hikariConfig26.setInitializationFailFast(false);
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        java.lang.String str32 = hikariConfig31.getDataSourceClassName();
        hikariConfig31.setTransactionIsolation("hi!");
        hikariConfig31.acquireRetryDelay = '4';
        hikariConfig31.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties39 = hikariConfig31.getDataSourceProperties();
        hikariConfig26.setDataSourceProperties(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig19.setDataSourceProperties(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig43.connectionTimeout = 32;
        hikariConfig1.addDataSourceProperty("HikariPool-3596", (java.lang.Object) 32);
        int int47 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60 + "'", int47 == 60);
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
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
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
        boolean boolean21 = hikariConfig1.isInitializationFailFast;
        boolean boolean22 = hikariConfig1.isAutoCommit;
        java.lang.String str23 = hikariConfig1.connectionInitSql;
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str26 = hikariConfig1.poolName;
        int int27 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-15748" + "'", str26, "HikariPool-15748");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.acquireIncrement = 97;
        long long13 = hikariConfig1.maxLifetime;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig10.connectionCustomizer;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        int int5 = hikariConfig1.transactionIsolation;
        hikariConfig1.minPoolSize = (short) 10;
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        int int10 = hikariConfig1.minPoolSize;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str13 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.setConnectionTimeout(1800000L);
        hikariConfig1.maxPoolSize = 0;
        int int14 = hikariConfig1.acquireRetries;
        hikariConfig1.connectionInitSql = "HikariPool-536";
        int int17 = hikariConfig1.minPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
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
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        long long15 = hikariConfig1.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer16;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
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
        hikariConfig14.setJdbcUrl("HikariPool-908");
        long long21 = hikariConfig14.leakDetectionThreshold;
        hikariConfig14.setPoolName("HikariPool-753");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
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
        hikariConfig1.acquireIncrement = 100;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.dataSource = dataSource16;
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-109");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-537");
        hikariConfig1.maxLifetime = ' ';
        boolean boolean18 = hikariConfig1.isReadOnly;
        hikariConfig1.setDataSourceClassName("HikariPool-5587");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12984");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12984 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setLeakDetectionThreshold(358L);
        boolean boolean16 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
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
        hikariConfig1.setMaximumPoolSize(52);
        int int17 = hikariConfig1.acquireIncrement;
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.idleTimeout = 3L;
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.catalog = "HikariPool-2890";
        java.lang.String str12 = hikariConfig1.catalog;
        int int13 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-2890" + "'", str12, "HikariPool-2890");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.poolName = "HikariPool-127";
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        long long13 = hikariConfig1.acquireRetryDelay;
        long long14 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.util.Properties properties5 = hikariConfig1.dataSourceProperties;
        java.lang.String str6 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("HikariPool-11093");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        com.zaxxer.hikari.HikariConfig.ACQUIRE_RETRY_DELAY = ' ';
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolation = (byte) 10;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer8;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig10.connectionCustomizer;
        hikariConfig10.setReadOnly(false);
        java.util.Properties properties15 = hikariConfig10.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties15);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
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
        hikariConfig10.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
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
        hikariConfig1.setMaximumPoolSize(358);
        hikariConfig1.setMaxLifetime((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.acquireIncrement = (short) 1;
        hikariConfig1.isIsolateInternalQueries = false;
        java.lang.String str13 = hikariConfig1.poolName;
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        boolean boolean15 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2434");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-15800" + "'", str13, "HikariPool-15800");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.acquireRetryDelay;
        int int8 = hikariConfig1.acquireIncrement;
        int int9 = hikariConfig1.getAcquireIncrement();
        boolean boolean10 = hikariConfig1.isAutoCommit();
        hikariConfig1.dataSourceClassName = "HikariPool-147";
        int int13 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
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
        hikariConfig1.setConnectionInitSql("HikariPool-409");
        hikariConfig1.transactionIsolation = 100;
        javax.sql.DataSource dataSource61 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-15809" + "'", str40, "HikariPool-15809");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNull(dataSource61);
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        long long9 = hikariConfig1.getIdleTimeout();
        hikariConfig1.catalog = "HikariPool-1315";
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        java.lang.String str5 = hikariConfig1.catalog;
        boolean boolean6 = hikariConfig1.isRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isAutoCommit = false;
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
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
        long long14 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
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
        java.lang.String str21 = hikariConfig1.transactionIsolationName;
        long long22 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-15821" + "'", str9, "HikariPool-15821");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-15821" + "'", str13, "HikariPool-15821");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-55" + "'", str18, "HikariPool-55");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-55" + "'", str21, "HikariPool-55");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
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
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.dataSource = dataSource16;
        hikariConfig1.setReadOnly(true);
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        int int21 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        long long8 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-2210");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-2210' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        long long12 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.getMinimumPoolSize();
        long long10 = hikariConfig1.leakDetectionThreshold;
        long long11 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        long long16 = hikariConfig1.leakDetectionThreshold;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.dataSource = dataSource17;
        hikariConfig1.maxPoolSize = (short) -1;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.isReadOnly = true;
        int int13 = hikariConfig1.maxPoolSize;
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean16 = hikariConfig1.isAutoCommit();
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        long long18 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
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
        hikariConfig15.catalog = "HikariPool-459";
        int int20 = hikariConfig15.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
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
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        boolean boolean22 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.dataSourceClassName = "hi!";
        java.util.Properties properties25 = hikariConfig21.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties25);
        hikariConfig1.poolName = "HikariPool-617";
        int int29 = hikariConfig1.acquireRetries;
        java.lang.String str30 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-15843" + "'", str17, "HikariPool-15843");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
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
        boolean boolean21 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean22 = hikariConfig1.isRegisterMbeans;
        int int23 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-15855" + "'", str9, "HikariPool-15855");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-15855" + "'", str13, "HikariPool-15855");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
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
        hikariConfig1.isReadOnly = false;
        java.lang.String str22 = hikariConfig1.getJdbcUrl();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.idleTimeout = (-1);
        java.util.Properties properties28 = hikariConfig24.getDataSourceProperties();
        long long29 = hikariConfig24.maxLifetime;
        hikariConfig24.setConnectionInitSql("");
        int int32 = hikariConfig24.acquireRetries;
        hikariConfig24.leakDetectionThreshold = (-1);
        hikariConfig24.leakDetectionThreshold = (short) -1;
        javax.sql.DataSource dataSource37 = hikariConfig24.dataSource;
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        long long40 = hikariConfig39.getAcquireRetryDelay();
        hikariConfig39.connectionInitSql = "hi!";
        hikariConfig39.acquireIncrement = (byte) 100;
        int int45 = hikariConfig39.minPoolSize;
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        long long48 = hikariConfig47.getAcquireRetryDelay();
        hikariConfig47.connectionInitSql = "hi!";
        hikariConfig47.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig47.transactionIsolation = (byte) 0;
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        long long57 = hikariConfig56.getAcquireRetryDelay();
        hikariConfig56.idleTimeout = (-1);
        java.util.Properties properties60 = hikariConfig56.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig47.setDataSourceProperties(properties60);
        hikariConfig39.setDataSourceProperties(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig24.dataSourceProperties = properties60;
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig1.dataSourceProperties = properties60;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig72 = new com.zaxxer.hikari.HikariConfig(properties60);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNotNull(properties28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 32L + "'", long48 == 32L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 32L + "'", long57 == 32L);
        org.junit.Assert.assertNotNull(properties60);
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
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
        hikariConfig15.idleTimeout = 35;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        hikariConfig19.setInitializationFailFast(false);
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.lang.String str25 = hikariConfig24.getDataSourceClassName();
        hikariConfig24.setTransactionIsolation("hi!");
        hikariConfig24.acquireRetryDelay = '4';
        hikariConfig24.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties32 = hikariConfig24.getDataSourceProperties();
        hikariConfig19.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        int int35 = hikariConfig34.minPoolSize;
        boolean boolean36 = hikariConfig34.isReadOnly;
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig38.maxPoolSize = (byte) 0;
        java.util.Properties properties41 = hikariConfig38.dataSourceProperties;
        hikariConfig34.dataSourceProperties = properties41;
        hikariConfig15.setDataSourceProperties(properties41);
        hikariConfig15.isRegisterMbeans = true;
        boolean boolean46 = hikariConfig15.isReadOnly();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
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
        int int15 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        int int17 = hikariConfig1.getMaximumPoolSize();
        boolean boolean18 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setTransactionIsolation("HikariPool-77");
        hikariConfig1.setMinimumPoolSize(1);
        hikariConfig1.dataSourceClassName = "HikariPool-71";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        int int4 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.minPoolSize = '#';
        boolean boolean7 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setTransactionIsolation("HikariPool-281");
        int int11 = hikariConfig1.transactionIsolation;
        hikariConfig1.setIdleTimeout((long) 52);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        long long15 = hikariConfig1.getAcquireRetryDelay();
        long long16 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.jdbcUrl = "HikariPool-281";
        hikariConfig10.idleTimeout = (short) 0;
        int int15 = hikariConfig10.maxPoolSize;
        hikariConfig10.isRegisterMbeans = true;
        java.lang.String str18 = hikariConfig10.getConnectionTestQuery();
        hikariConfig10.connectionTestQuery = "HikariPool-1091";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.acquireRetries = 'a';
        hikariConfig1.isIsolateInternalQueries = false;
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireIncrement(358);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(iConnectionCustomizer17);
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean3 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setMinimumPoolSize(97);
        boolean boolean13 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
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
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.jdbcUrl = "HikariPool-180";
        boolean boolean23 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.setCatalog("HikariPool-8778");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-15916" + "'", str17, "HikariPool-15916");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
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
        hikariConfig1.transactionIsolation = 'a';
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
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
        java.lang.String str29 = hikariConfig1.connectionTestQuery;
        boolean boolean30 = hikariConfig1.isAutoCommit();
        hikariConfig1.setReadOnly(true);
        hikariConfig1.jdbcUrl = "HikariPool-340";
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
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
        int int19 = hikariConfig1.transactionIsolation;
        hikariConfig1.setConnectionInitSql("HikariPool-746");
        hikariConfig1.acquireRetries = (short) 100;
        long long24 = hikariConfig1.connectionTimeout;
        hikariConfig1.setAcquireRetryDelay((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-291";
        long long9 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.transactionIsolation = 10;
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
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
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setLeakDetectionThreshold(358L);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.dataSource = dataSource18;
        long long20 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
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
        hikariConfig1.minPoolSize = (short) 10;
        boolean boolean20 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        long long10 = hikariConfig1.acquireRetryDelay;
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        long long14 = hikariConfig1.acquireRetryDelay;
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
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
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionTestQuery("HikariPool-110");
        int int18 = hikariConfig1.getTransactionIsolation();
        java.lang.String str19 = hikariConfig1.catalog;
        hikariConfig1.setIdleTimeout((long) 1);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        long long7 = hikariConfig1.getConnectionTimeout();
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetryDelay((long) 52);
        java.lang.String str11 = hikariConfig1.jdbcUrl;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1000";
        hikariConfig1.isReadOnly = true;
        hikariConfig1.acquireRetryDelay = 100;
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
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
        long long18 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.acquireRetryDelay = (byte) -1;
        hikariConfig1.acquireRetryDelay = 750L;
        boolean boolean23 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2147483647L + "'", long15 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
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
        java.lang.String str16 = hikariConfig1.catalog;
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.isInitializationFailFast = true;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-15950" + "'", str9, "HikariPool-15950");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
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
        hikariConfig16.isReadOnly = true;
        int int21 = hikariConfig16.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
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
        int int16 = hikariConfig1.getMaximumPoolSize();
        boolean boolean17 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-15966" + "'", str9, "HikariPool-15966");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        int int11 = hikariConfig1.minPoolSize;
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.minPoolSize = 32;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.getMinimumPoolSize();
        long long10 = hikariConfig1.leakDetectionThreshold;
        long long11 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        long long16 = hikariConfig1.leakDetectionThreshold;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.dataSource = dataSource17;
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
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
        boolean boolean19 = hikariConfig1.isIsolateInternalQueries();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig1.connectionCustomizer;
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-172" + "'", str21, "HikariPool-172");
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str14 = hikariConfig13.getJdbcUrl();
        int int15 = hikariConfig13.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.getMaxLifetime();
        boolean boolean10 = hikariConfig1.isReadOnly;
        long long11 = hikariConfig1.maxLifetime;
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean14 = hikariConfig1.isReadOnly;
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        java.lang.String str16 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.idleTimeout = 3L;
        hikariConfig1.isAutoCommit = true;
        boolean boolean11 = hikariConfig1.isReadOnly;
        int int12 = hikariConfig1.transactionIsolation;
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-439";
        javax.sql.DataSource dataSource17 = hikariConfig1.dataSource;
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
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
        hikariConfig16.setAutoCommit(true);
        hikariConfig16.setCatalog("HikariPool-783");
        javax.sql.DataSource dataSource21 = null;
        hikariConfig16.setDataSource(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        int int7 = hikariConfig1.transactionIsolation;
        java.lang.Class<?> wildcardClass8 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
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
        java.lang.String str19 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-16007" + "'", str18, "HikariPool-16007");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-16007" + "'", str19, "HikariPool-16007");
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaximumPoolSize(0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
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
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.jdbcUrl = "HikariPool-105";
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.dataSourceClassName = "HikariPool-268";
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.catalog = "HikariPool-139";
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean18 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        hikariConfig1.jdbcUrl = "HikariPool-84";
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.maxLifetime = (byte) 0;
        int int17 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getAcquireIncrement();
        boolean boolean12 = hikariConfig10.isAutoCommit;
        hikariConfig10.setAcquireIncrement(358);
        long long15 = hikariConfig10.leakDetectionThreshold;
        java.lang.String str16 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setConnectionCustomizerClassName("HikariPool-501");
        hikariConfig10.setTransactionIsolation("HikariPool-548");
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        long long24 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig23.connectionInitSql = "hi!";
        hikariConfig23.acquireIncrement = (byte) 100;
        hikariConfig23.setMinimumPoolSize((int) (short) 0);
        hikariConfig23.connectionTestQuery = "";
        hikariConfig23.jdbcUrl = "HikariPool-45";
        hikariConfig23.dataSourceClassName = "hi!";
        hikariConfig23.setIdleTimeout((long) (short) 100);
        java.lang.String str39 = hikariConfig23.jdbcUrl;
        int int40 = hikariConfig23.acquireRetries;
        hikariConfig23.connectionInitSql = "HikariPool-209";
        java.lang.String str43 = hikariConfig23.getConnectionCustomizerClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig10.addDataSourceProperty("HikariPool-794", (java.lang.Object) str43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HikariPool-45" + "'", str39, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.isReadOnly = false;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionCustomizerClassName = "";
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
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
        hikariConfig1.setReadOnly(false);
        hikariConfig1.connectionTimeout = (-1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
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
        java.lang.String str29 = hikariConfig1.connectionTestQuery;
        boolean boolean30 = hikariConfig1.isAutoCommit();
        long long31 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-15516");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-15516 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
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
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setMaxLifetime(1800000L);
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
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
        boolean boolean19 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries;
        int int21 = hikariConfig1.maxPoolSize;
        hikariConfig1.poolName = "HikariPool-2999";
        hikariConfig1.minPoolSize = (byte) 1;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setAutoCommit(true);
        int int7 = hikariConfig1.transactionIsolation;
        hikariConfig1.connectionInitSql = "HikariPool-7421";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.isJdbc4connectionTest = false;
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
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
        hikariConfig23.leakDetectionThreshold = ' ';
        long long26 = hikariConfig23.getMaxLifetime();
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        long long29 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.idleTimeout = (-1);
        java.util.Properties properties32 = hikariConfig28.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig23.setDataSourceProperties(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        javax.sql.DataSource dataSource38 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(dataSource38);
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        long long7 = hikariConfig1.connectionTimeout;
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.acquireIncrement = 1;
        int int13 = hikariConfig1.getMinimumPoolSize();
        long long14 = hikariConfig1.connectionTimeout;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireRetries(100);
        int int6 = hikariConfig1.maxPoolSize;
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-55");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long15 = hikariConfig14.getAcquireRetryDelay();
        hikariConfig14.connectionInitSql = "hi!";
        hikariConfig14.acquireIncrement = (byte) 100;
        hikariConfig14.setMinimumPoolSize((int) (short) 0);
        java.lang.String str22 = hikariConfig14.dataSourceClassName;
        long long23 = hikariConfig14.getAcquireRetryDelay();
        hikariConfig14.connectionTimeout = (byte) 10;
        hikariConfig14.leakDetectionThreshold = 1L;
        java.lang.String str28 = hikariConfig14.connectionCustomizerClassName;
        java.lang.String str29 = hikariConfig14.getConnectionTestQuery();
        hikariConfig14.setUseInstrumentation(false);
        java.lang.String str32 = hikariConfig14.getPoolName();
        javax.sql.DataSource dataSource33 = null;
        hikariConfig14.setDataSource(dataSource33);
        hikariConfig1.addDataSourceProperty("HikariPool-4071", (java.lang.Object) hikariConfig14);
        int int36 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-16078" + "'", str32, "HikariPool-16078");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.transactionIsolation = 60;
        hikariConfig1.acquireIncrement = '4';
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.minPoolSize = (short) 0;
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
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
        javax.sql.DataSource dataSource19 = hikariConfig14.getDataSource();
        java.lang.Class<?> wildcardClass20 = hikariConfig14.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str9 = hikariConfig1.poolName;
        hikariConfig1.maxLifetime = '#';
        hikariConfig1.setAcquireRetryDelay(3L);
        hikariConfig1.acquireIncrement = 10;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16091" + "'", str9, "HikariPool-16091");
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.leakDetectionThreshold = 0L;
        boolean boolean13 = hikariConfig10.isAutoCommit;
        boolean boolean14 = hikariConfig10.isIsolateInternalQueries();
        hikariConfig10.setRegisterMbeans(true);
        hikariConfig10.leakDetectionThreshold = 3;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
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
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer21;
        hikariConfig1.connectionTestQuery = "HikariPool-1779";
        int int25 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
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
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        int int17 = hikariConfig1.maxPoolSize;
        long long18 = hikariConfig1.maxLifetime;
        hikariConfig1.maxLifetime = 358;
        int int21 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setReadOnly(false);
        long long8 = hikariConfig1.getIdleTimeout();
        long long9 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionTestQuery("HikariPool-8275");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setTransactionIsolation("HikariPool-627");
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
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
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig19.maxPoolSize = 0;
        hikariConfig19.idleTimeout = 1800000L;
        hikariConfig19.setDataSourceClassName("HikariPool-139");
        javax.sql.DataSource dataSource26 = hikariConfig19.getDataSource();
        boolean boolean27 = hikariConfig19.isAutoCommit();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolation = (byte) 10;
        long long8 = hikariConfig1.acquireRetryDelay;
        long long9 = hikariConfig1.idleTimeout;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        long long4 = hikariConfig1.acquireRetryDelay;
        int int5 = hikariConfig1.transactionIsolation;
        java.util.Properties properties6 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
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
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig18.isInitializationFailFast = true;
        javax.sql.DataSource dataSource21 = hikariConfig18.dataSource;
        hikariConfig18.connectionTestQuery = "HikariPool-1844";
        java.lang.String str24 = hikariConfig18.poolName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig18.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(dataSource21);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-16127" + "'", str24, "HikariPool-16127");
        org.junit.Assert.assertNull(iConnectionCustomizer25);
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
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
        boolean boolean21 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.acquireIncrement = 1;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer24;
        hikariConfig1.acquireIncrement = 'a';
        boolean boolean28 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean29 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16133" + "'", str9, "HikariPool-16133");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-16133" + "'", str13, "HikariPool-16133");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig7.setConnectionCustomizerClassName("HikariPool-97");
        boolean boolean10 = hikariConfig7.isIsolateInternalQueries;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig7.dataSource = dataSource11;
        hikariConfig7.maxPoolSize = (-1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
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
        hikariConfig1.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        hikariConfig1.poolName = "HikariPool-211";
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str19 = hikariConfig1.catalog;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setIsolateInternalQueries(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-7201");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-7201 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
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
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAcquireIncrement((int) '#');
        hikariConfig1.setAcquireRetryDelay(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-727");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-727' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
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
        hikariConfig1.setPoolName("HikariPool-551");
        hikariConfig1.connectionTestQuery = "HikariPool-1025";
        java.lang.String str21 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-694");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.poolName = "HikariPool-127";
        hikariConfig1.isInitializationFailFast = true;
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        hikariConfig1.idleTimeout = 60L;
        hikariConfig1.setLeakDetectionThreshold(35L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
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
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig44.setCatalog("HikariPool-349");
        hikariConfig44.connectionInitSql = "HikariPool-757";
        hikariConfig44.setConnectionCustomizerClassName("HikariPool-2963");
        hikariConfig44.setConnectionCustomizerClassName("HikariPool-2184");
        long long53 = hikariConfig44.idleTimeout;
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
// flaky:         org.junit.Assert.assertTrue("'" + long53 + "' != '" + 1800000L + "'", long53 == 1800000L);
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        hikariConfig1.minPoolSize = 1;
        java.lang.String str7 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNotNull(properties4);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-16164" + "'", str7, "HikariPool-16164");
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig14.setJdbcUrl("HikariPool-184");
        boolean boolean17 = hikariConfig14.isInitializationFailFast;
        hikariConfig14.setConnectionTestQuery("HikariPool-141");
        hikariConfig14.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
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
        int int16 = hikariConfig14.minPoolSize;
        java.lang.String str17 = hikariConfig14.poolName;
        hikariConfig14.setReadOnly(false);
        int int20 = hikariConfig14.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-16171" + "'", str17, "HikariPool-16171");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2480");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2480 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
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
        hikariConfig1.setLeakDetectionThreshold((long) (short) 0);
        hikariConfig1.setIdleTimeout((long) (-1));
        boolean boolean18 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16173" + "'", str9, "HikariPool-16173");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
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
        int int19 = hikariConfig1.getTransactionIsolation();
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean21 = hikariConfig1.isAutoCommit;
        hikariConfig1.catalog = "HikariPool-745";
        hikariConfig1.setTransactionIsolation("HikariPool-343");
        javax.sql.DataSource dataSource26 = null;
        hikariConfig1.dataSource = dataSource26;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.minPoolSize = (short) -1;
        hikariConfig1.isRegisterMbeans = false;
        long long8 = hikariConfig1.maxLifetime;
        hikariConfig1.minPoolSize = (byte) 1;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        hikariConfig1.setMaximumPoolSize(10);
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        long long14 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig13.idleTimeout = (-1);
        java.util.Properties properties17 = hikariConfig13.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig1.dataSourceProperties = properties17;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
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
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str16 = hikariConfig1.catalog;
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-775");
        hikariConfig1.setInitializationFailFast(false);
        long long22 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-117" + "'", str17, "HikariPool-117");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.jdbcUrl = "HikariPool-281";
        hikariConfig10.idleTimeout = (short) 0;
        hikariConfig10.setRegisterMbeans(true);
        hikariConfig10.isAutoCommit = true;
        java.util.Properties properties19 = hikariConfig10.dataSourceProperties;
        hikariConfig10.setLeakDetectionThreshold(0L);
        hikariConfig10.setInitializationFailFast(false);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig10.setDataSource(dataSource24);
        long long26 = hikariConfig10.getConnectionTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties19);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4906");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4906 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
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
        hikariConfig1.maxLifetime = 3;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbcUrl("");
        long long14 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = 60;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1756");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
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
        hikariConfig1.isInitializationFailFast = false;
        long long19 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        java.util.Properties properties6 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        int int10 = hikariConfig1.maxPoolSize;
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isRegisterMbeans = false;
        int int16 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        int int10 = hikariConfig1.maxPoolSize;
        hikariConfig1.maxLifetime = (short) -1;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
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
        java.lang.String str29 = hikariConfig1.connectionTestQuery;
        boolean boolean30 = hikariConfig1.isAutoCommit();
        hikariConfig1.setReadOnly(true);
        javax.sql.DataSource dataSource33 = null;
        hikariConfig1.setDataSource(dataSource33);
        java.lang.String str35 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(true);
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        long long41 = hikariConfig40.getAcquireRetryDelay();
        hikariConfig40.idleTimeout = (-1);
        hikariConfig40.setMaximumPoolSize((int) 'a');
        java.lang.String str46 = hikariConfig40.catalog;
        boolean boolean47 = hikariConfig40.isJdbc4ConnectionTest();
        boolean boolean48 = hikariConfig40.isIsolateInternalQueries;
        javax.sql.DataSource dataSource49 = null;
        hikariConfig40.setDataSource(dataSource49);
        hikariConfig40.acquireIncrement = (short) 100;
        hikariConfig40.setCatalog("HikariPool-886");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-321", (java.lang.Object) "HikariPool-886");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.isIsolateInternalQueries = false;
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        hikariConfig1.isReadOnly = false;
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
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
        long long21 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.idleTimeout = (-1);
        hikariConfig24.setMaximumPoolSize((int) 'a');
        java.lang.String str30 = hikariConfig24.catalog;
        boolean boolean31 = hikariConfig24.isJdbc4ConnectionTest();
        hikariConfig24.setMinimumPoolSize(0);
        hikariConfig24.setUseInstrumentation(true);
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        long long38 = hikariConfig37.getAcquireRetryDelay();
        hikariConfig37.idleTimeout = (-1);
        java.util.Properties properties41 = hikariConfig37.getDataSourceProperties();
        long long42 = hikariConfig37.maxLifetime;
        hikariConfig37.setLeakDetectionThreshold(750L);
        int int45 = hikariConfig37.getMinimumPoolSize();
        hikariConfig37.acquireRetries = 'a';
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        long long50 = hikariConfig49.getAcquireRetryDelay();
        hikariConfig49.connectionInitSql = "hi!";
        hikariConfig49.acquireIncrement = (byte) 100;
        hikariConfig49.setMinimumPoolSize((int) (short) 0);
        java.lang.String str57 = hikariConfig49.dataSourceClassName;
        long long58 = hikariConfig49.getAcquireRetryDelay();
        hikariConfig49.idleTimeout = (byte) -1;
        java.util.Properties properties61 = hikariConfig49.dataSourceProperties;
        hikariConfig37.dataSourceProperties = properties61;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties61);
        hikariConfig24.dataSourceProperties = properties61;
        hikariConfig1.addDataSourceProperty("HikariPool-206", (java.lang.Object) hikariConfig24);
        long long66 = hikariConfig24.idleTimeout;
        boolean boolean67 = hikariConfig24.isRegisterMbeans;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16228" + "'", str9, "HikariPool-16228");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-16228" + "'", str13, "HikariPool-16228");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNotNull(properties41);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 32L + "'", long50 == 32L);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 32L + "'", long58 == 32L);
        org.junit.Assert.assertNotNull(properties61);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + (-1L) + "'", long66 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.jdbcUrl = "HikariPool-45";
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.leakDetectionThreshold = (short) -1;
        int int17 = hikariConfig1.transactionIsolation;
        boolean boolean18 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-14562");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-14562 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-6888");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-6888 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setRegisterMbeans(false);
        int int7 = hikariConfig1.minPoolSize;
        java.lang.String str8 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-16241" + "'", str8, "HikariPool-16241");
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
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
        long long18 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
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
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setPoolName("HikariPool-32");
        hikariConfig1.catalog = "HikariPool-927";
        long long24 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        javax.sql.DataSource dataSource8 = hikariConfig1.getDataSource();
        hikariConfig1.minPoolSize = 0;
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
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
        boolean boolean34 = hikariConfig1.isIsolateInternalQueries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = hikariConfig1.connectionCustomizer;
        int int36 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-45" + "'", str11, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setMaxLifetime(100L);
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.setPoolName("HikariPool-764");
        hikariConfig1.dataSourceClassName = "HikariPool-997";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
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
        java.util.Properties properties31 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
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
        boolean boolean20 = hikariConfig14.isRegisterMbeans;
        boolean boolean21 = hikariConfig14.isAutoCommit();
        java.lang.String str22 = hikariConfig14.jdbcUrl;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
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
        boolean boolean17 = hikariConfig1.isReadOnly;
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setJdbcUrl("HikariPool-300");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-335");
        hikariConfig1.setLeakDetectionThreshold(600000L);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        long long16 = hikariConfig15.getAcquireRetryDelay();
        hikariConfig15.connectionInitSql = "hi!";
        hikariConfig15.acquireIncrement = (byte) 100;
        hikariConfig15.setMinimumPoolSize((int) (short) 0);
        hikariConfig15.connectionTestQuery = "";
        hikariConfig15.jdbcUrl = "HikariPool-45";
        hikariConfig15.isReadOnly = false;
        hikariConfig15.setPoolName("");
        java.lang.String str31 = hikariConfig15.getConnectionTestQuery();
        java.util.Properties properties32 = hikariConfig15.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties32;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig36.setRegisterMbeans(false);
        java.lang.String str39 = hikariConfig36.getConnectionInitSql();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionInitSql = "HikariPool-139";
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        long long9 = hikariConfig1.acquireRetryDelay;
        long long10 = hikariConfig1.getMaxLifetime();
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.isReadOnly = true;
        long long14 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-291";
        long long9 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.connectionInitSql = "hi!";
        hikariConfig16.acquireIncrement = (byte) 100;
        hikariConfig16.setMinimumPoolSize((int) (short) 0);
        hikariConfig16.connectionTestQuery = "";
        hikariConfig16.jdbcUrl = "HikariPool-45";
        boolean boolean28 = hikariConfig16.isRegisterMbeans;
        hikariConfig16.isIsolateInternalQueries = true;
        hikariConfig16.idleTimeout = 100;
        java.lang.String str33 = hikariConfig16.connectionTestQuery;
        int int34 = hikariConfig16.getTransactionIsolation();
        boolean boolean35 = hikariConfig16.isIsolateInternalQueries;
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        long long38 = hikariConfig37.getAcquireRetryDelay();
        hikariConfig37.connectionInitSql = "hi!";
        hikariConfig37.acquireIncrement = (byte) 100;
        hikariConfig37.setMinimumPoolSize((int) (short) 0);
        java.lang.String str45 = hikariConfig37.dataSourceClassName;
        long long46 = hikariConfig37.getAcquireRetryDelay();
        hikariConfig37.setConnectionTestQuery("HikariPool-114");
        long long49 = hikariConfig37.getMaxLifetime();
        boolean boolean50 = hikariConfig37.isIsolateInternalQueries();
        hikariConfig37.acquireRetries = 0;
        java.util.Properties properties53 = hikariConfig37.dataSourceProperties;
        hikariConfig16.setDataSourceProperties(properties53);
        hikariConfig1.dataSourceProperties = properties53;
        hikariConfig1.setConnectionTestQuery("");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 32L + "'", long46 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 100L + "'", long49 == 100L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(properties53);
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.acquireIncrement = '#';
        java.lang.String str8 = hikariConfig5.getDataSourceClassName();
        hikariConfig5.setAutoCommit(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig5.connectionCustomizer;
        hikariConfig5.setIdleTimeout(1800000L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setTransactionIsolation("HikariPool-281");
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setMaxLifetime((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
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
        boolean boolean27 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        long long31 = hikariConfig30.getAcquireRetryDelay();
        hikariConfig30.connectionInitSql = "hi!";
        hikariConfig30.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource36 = null;
        hikariConfig30.dataSource = dataSource36;
        javax.sql.DataSource dataSource38 = hikariConfig30.dataSource;
        int int39 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setMaxLifetime((long) 100);
        hikariConfig30.transactionIsolationName = "HikariPool-55";
        hikariConfig1.addDataSourceProperty("HikariPool-426", (java.lang.Object) hikariConfig30);
        long long45 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-16298" + "'", str17, "HikariPool-16298");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.jdbcUrl;
        java.lang.String str9 = hikariConfig1.jdbcUrl;
        long long10 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.isInitializationFailFast = false;
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.transactionIsolation = (short) 100;
        hikariConfig1.leakDetectionThreshold = 60L;
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.minPoolSize = (short) 100;
        hikariConfig1.catalog = "HikariPool-349";
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        int int13 = hikariConfig1.transactionIsolation;
        boolean boolean14 = hikariConfig1.isAutoCommit;
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
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
        long long21 = hikariConfig1.getAcquireRetryDelay();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
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
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionTimeout = '#';
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-908");
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.minPoolSize = 'a';
        hikariConfig1.acquireIncrement = (byte) 10;
        hikariConfig1.isReadOnly = true;
        hikariConfig1.setConnectionTestQuery("HikariPool-588");
        boolean boolean17 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean20 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.acquireIncrement = 35;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
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
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.acquireIncrement = (byte) 0;
        hikariConfig1.dataSourceClassName = "HikariPool-117";
        hikariConfig1.transactionIsolationName = "HikariPool-644";
        boolean boolean28 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean3 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str4 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setDataSourceClassName("HikariPool-291");
        long long7 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.acquireRetries = 97;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        long long12 = hikariConfig1.idleTimeout;
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-291" + "'", str13, "HikariPool-291");
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-829");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-829 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        hikariConfig1.setConnectionTestQuery("");
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        boolean boolean14 = hikariConfig1.isAutoCommit();
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setConnectionInitSql("HikariPool-2706");
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        hikariConfig1.transactionIsolationName = "HikariPool-2261";
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-16346" + "'", str11, "HikariPool-16346");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
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
        java.lang.String str17 = hikariConfig1.poolName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-16349" + "'", str17, "HikariPool-16349");
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int7 = hikariConfig6.acquireIncrement;
        int int8 = hikariConfig6.acquireIncrement;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
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
        hikariConfig1.connectionInitSql = "HikariPool-172";
        int int21 = hikariConfig1.getAcquireIncrement();
        java.lang.String str22 = hikariConfig1.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16363" + "'", str9, "HikariPool-16363");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-16363" + "'", str13, "HikariPool-16363");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-172" + "'", str22, "HikariPool-172");
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        int int9 = hikariConfig1.getAcquireRetries();
        hikariConfig1.maxLifetime = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.maxLifetime = (-1L);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) '4');
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        java.lang.String str4 = hikariConfig1.poolName;
        hikariConfig1.maxPoolSize = '#';
        hikariConfig1.minPoolSize = (byte) 100;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-16369" + "'", str4, "HikariPool-16369");
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-908");
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.dataSource = dataSource19;
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
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
        hikariConfig1.maxLifetime = 32L;
        boolean boolean18 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        int int10 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        long long13 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
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
        hikariConfig1.setAcquireRetries(3);
        boolean boolean20 = hikariConfig1.isReadOnly();
        boolean boolean21 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-16377" + "'", str17, "HikariPool-16377");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        long long5 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setReadOnly(false);
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionInitSql("HikariPool-121");
        long long11 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("");
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolationName = "HikariPool-613";
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.lang.Class<?> wildcardClass9 = hikariConfig1.getClass();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
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
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        int int13 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
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
        hikariConfig1.setRegisterMbeans(true);
        long long16 = hikariConfig1.maxLifetime;
        hikariConfig1.jdbcUrl = "HikariPool-360";
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer27 = hikariConfig1.connectionCustomizer;
        long long28 = hikariConfig1.getAcquireRetryDelay();
        int int29 = hikariConfig1.acquireIncrement;
        int int30 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isReadOnly = true;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(iConnectionCustomizer27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setMaximumPoolSize((int) '4');
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
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
        hikariConfig1.catalog = "HikariPool-16";
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.dataSource = dataSource20;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        long long4 = hikariConfig1.getIdleTimeout();
        int int5 = hikariConfig1.getAcquireIncrement();
        int int6 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
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
        boolean boolean34 = hikariConfig1.isIsolateInternalQueries;
        long long35 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer36 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-45" + "'", str11, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertNull(iConnectionCustomizer36);
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
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
        long long19 = hikariConfig14.getIdleTimeout();
        int int20 = hikariConfig14.getMaximumPoolSize();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        java.lang.String str23 = hikariConfig22.getDataSourceClassName();
        int int24 = hikariConfig22.getAcquireRetries();
        int int25 = hikariConfig22.getAcquireIncrement();
        java.lang.String str26 = hikariConfig22.getConnectionCustomizerClassName();
        java.lang.String str27 = hikariConfig22.transactionIsolationName;
        java.util.Properties properties28 = hikariConfig22.getDataSourceProperties();
        hikariConfig14.dataSourceProperties = properties28;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer30 = hikariConfig14.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(iConnectionCustomizer30);
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
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
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig1.getCatalog();
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.isIsolateInternalQueries = false;
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setAcquireRetryDelay((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2060");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2060 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (byte) -1;
        hikariConfig1.setAcquireRetries(32);
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig1.connectionCustomizer;
        boolean boolean17 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setConnectionInitSql("HikariPool-2697");
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.dataSource = dataSource22;
        java.lang.String str24 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
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
        java.util.Properties properties36 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties36);
        java.util.Properties properties41 = hikariConfig40.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
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
        int int13 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 0L;
        hikariConfig1.minPoolSize = 100;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
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
        hikariConfig16.connectionInitSql = "HikariPool-613";
        hikariConfig16.isAutoCommit = true;
        hikariConfig16.acquireRetryDelay = 35;
        hikariConfig16.setConnectionTimeout(358L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig16.setDriverClassName("HikariPool-8940");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-8940' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.dataSourceClassName = "HikariPool-876";
        hikariConfig1.acquireIncrement = 100;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.dataSourceClassName = "hi!";
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig1.addDataSourceProperty("HikariPool-186", (java.lang.Object) false);
        int int21 = hikariConfig1.acquireRetries;
        hikariConfig1.setMinimumPoolSize(10);
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties26 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
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
        hikariConfig1.setAcquireRetries((int) '4');
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str23 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
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
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.isReadOnly = true;
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16441" + "'", str9, "HikariPool-16441");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-16441" + "'", str13, "HikariPool-16441");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        int int5 = hikariConfig1.acquireIncrement;
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        int int8 = hikariConfig1.getAcquireIncrement();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
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
        hikariConfig1.connectionInitSql = "HikariPool-77";
        int int22 = hikariConfig1.getTransactionIsolation();
        long long23 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16444" + "'", str9, "HikariPool-16444");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-16444" + "'", str13, "HikariPool-16444");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 52L + "'", long23 == 52L);
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
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
        int int19 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setDataSourceClassName("HikariPool-2100");
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
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
        hikariConfig10.setAcquireIncrement(3);
        long long17 = hikariConfig10.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
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
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45" + "'", str16, "HikariPool-45");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45" + "'", str17, "HikariPool-45");
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean5 = hikariConfig1.isReadOnly();
        hikariConfig1.setAutoCommit(true);
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        java.lang.String str9 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        int int9 = hikariConfig1.getTransactionIsolation();
        int int10 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-102");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-102 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
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
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.idleTimeout = (-1);
        java.util.Properties properties23 = hikariConfig19.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.util.Properties properties27 = hikariConfig26.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties27;
        long long29 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.dataSourceClassName = "HikariPool-607";
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
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
        java.lang.String str19 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-195" + "'", str19, "HikariPool-195");
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.leakDetectionThreshold = 0L;
        boolean boolean13 = hikariConfig10.isAutoCommit;
        boolean boolean14 = hikariConfig10.isIsolateInternalQueries();
        java.util.Properties properties15 = hikariConfig10.getDataSourceProperties();
        boolean boolean16 = hikariConfig10.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
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
        hikariConfig16.setAutoCommit(true);
        hikariConfig16.minPoolSize = '#';
        hikariConfig16.setLeakDetectionThreshold((long) 60);
        java.lang.Object obj24 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig16.addDataSourceProperty("", obj24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
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
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionTestQuery("HikariPool-110");
        int int18 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setCatalog("HikariPool-199");
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setAutoCommit(true);
        long long25 = hikariConfig1.maxLifetime;
        hikariConfig1.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
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
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer27 = null;
        hikariConfig26.connectionCustomizer = iConnectionCustomizer27;
        hikariConfig26.isIsolateInternalQueries = true;
        java.lang.String str31 = hikariConfig26.catalog;
        long long32 = hikariConfig26.idleTimeout;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1800000L + "'", long32 == 1800000L);
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "HikariPool-6";
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.maxPoolSize = (-1);
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
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
        int int20 = hikariConfig14.getTransactionIsolation();
        java.lang.String str21 = hikariConfig14.getPoolName();
        hikariConfig14.minPoolSize = (-1);
        java.util.Properties properties24 = hikariConfig14.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.setCatalog("HikariPool-132");
        hikariConfig25.transactionIsolationName = "HikariPool-3699";
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-16535" + "'", str21, "HikariPool-16535");
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean10 = hikariConfig1.isReadOnly;
        hikariConfig1.isRegisterMbeans = true;
        long long13 = hikariConfig1.getMaxLifetime();
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        long long21 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.idleTimeout = (-1);
        hikariConfig20.setMaximumPoolSize((int) 'a');
        long long26 = hikariConfig20.getLeakDetectionThreshold();
        java.lang.String str27 = hikariConfig20.catalog;
        hikariConfig20.setIsolateInternalQueries(false);
        hikariConfig1.addDataSourceProperty("HikariPool-908", (java.lang.Object) false);
        javax.sql.DataSource dataSource31 = hikariConfig1.getDataSource();
        javax.sql.DataSource dataSource32 = null;
        hikariConfig1.setDataSource(dataSource32);
        hikariConfig1.acquireRetryDelay = 1800000L;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.connectionTestQuery = "";
        java.lang.Class<?> wildcardClass40 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16540" + "'", str9, "HikariPool-16540");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setJdbcUrl("HikariPool-300");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-335");
        hikariConfig1.setLeakDetectionThreshold(600000L);
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        long long16 = hikariConfig15.getAcquireRetryDelay();
        hikariConfig15.connectionInitSql = "hi!";
        hikariConfig15.acquireIncrement = (byte) 100;
        hikariConfig15.setMinimumPoolSize((int) (short) 0);
        hikariConfig15.connectionTestQuery = "";
        hikariConfig15.jdbcUrl = "HikariPool-45";
        hikariConfig15.isReadOnly = false;
        hikariConfig15.setPoolName("");
        java.lang.String str31 = hikariConfig15.getConnectionTestQuery();
        java.util.Properties properties32 = hikariConfig15.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties32;
        hikariConfig1.setAcquireIncrement(3);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer36 = hikariConfig1.connectionCustomizer;
        long long37 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(iConnectionCustomizer36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1800000L + "'", long37 == 1800000L);
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
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
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        long long19 = hikariConfig1.connectionTimeout;
        hikariConfig1.setDataSourceClassName("HikariPool-1489");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        long long7 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.acquireIncrement = 10;
        hikariConfig1.dataSourceClassName = "HikariPool-2021";
        hikariConfig1.setPoolName("HikariPool-15015");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4170");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4170 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIdleTimeout(0L);
        int int7 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionTestQuery("HikariPool-3005");
        javax.sql.DataSource dataSource10 = hikariConfig1.dataSource;
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
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
        hikariConfig1.setAutoCommit(true);
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isReadOnly();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
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
        long long14 = hikariConfig1.connectionTimeout;
        hikariConfig1.setAutoCommit(true);
        int int17 = hikariConfig1.maxPoolSize;
        hikariConfig1.minPoolSize = 3;
        java.lang.String str20 = hikariConfig1.connectionTestQuery;
        hikariConfig1.isRegisterMbeans = false;
        long long23 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.minPoolSize = 0;
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setLeakDetectionThreshold(5000L);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-299");
        boolean boolean15 = hikariConfig1.isReadOnly;
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaxLifetime((long) (short) -1);
        hikariConfig1.setCatalog("HikariPool-7292");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        boolean boolean5 = hikariConfig1.isInitializationFailFast();
        boolean boolean6 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13034");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13034 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
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
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.connectionInitSql = "hi!";
        hikariConfig19.setTransactionIsolation("hi!");
        hikariConfig19.dataSourceClassName = "HikariPool-291";
        long long27 = hikariConfig19.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = null;
        hikariConfig19.connectionCustomizer = iConnectionCustomizer28;
        java.util.Properties properties30 = hikariConfig19.dataSourceProperties;
        javax.sql.DataSource dataSource31 = null;
        hikariConfig19.setDataSource(dataSource31);
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        long long35 = hikariConfig34.getAcquireRetryDelay();
        hikariConfig34.connectionInitSql = "hi!";
        hikariConfig34.acquireIncrement = (byte) 100;
        hikariConfig34.setMinimumPoolSize((int) (short) 0);
        hikariConfig34.connectionTestQuery = "";
        hikariConfig34.jdbcUrl = "HikariPool-45";
        boolean boolean46 = hikariConfig34.isRegisterMbeans;
        hikariConfig34.isIsolateInternalQueries = true;
        hikariConfig34.idleTimeout = 100;
        java.lang.String str51 = hikariConfig34.connectionTestQuery;
        int int52 = hikariConfig34.getTransactionIsolation();
        boolean boolean53 = hikariConfig34.isIsolateInternalQueries;
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        long long56 = hikariConfig55.getAcquireRetryDelay();
        hikariConfig55.connectionInitSql = "hi!";
        hikariConfig55.acquireIncrement = (byte) 100;
        hikariConfig55.setMinimumPoolSize((int) (short) 0);
        java.lang.String str63 = hikariConfig55.dataSourceClassName;
        long long64 = hikariConfig55.getAcquireRetryDelay();
        hikariConfig55.setConnectionTestQuery("HikariPool-114");
        long long67 = hikariConfig55.getMaxLifetime();
        boolean boolean68 = hikariConfig55.isIsolateInternalQueries();
        hikariConfig55.acquireRetries = 0;
        java.util.Properties properties71 = hikariConfig55.dataSourceProperties;
        hikariConfig34.setDataSourceProperties(properties71);
        hikariConfig19.dataSourceProperties = properties71;
        hikariConfig1.setDataSourceProperties(properties71);
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties71);
        boolean boolean76 = hikariConfig75.isReadOnly();
        hikariConfig75.leakDetectionThreshold = 35L;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 32L + "'", long56 == 32L);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 32L + "'", long64 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 100L + "'", long67 == 100L);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(properties71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
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
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long19 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.connectionInitSql = "hi!";
        hikariConfig18.acquireIncrement = (byte) 100;
        hikariConfig18.setMinimumPoolSize((int) (short) 0);
        java.lang.String str26 = hikariConfig18.dataSourceClassName;
        long long27 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.connectionTimeout = (byte) 10;
        hikariConfig18.isReadOnly = false;
        hikariConfig18.acquireRetryDelay = 5000L;
        hikariConfig18.jdbcUrl = "HikariPool-997";
        hikariConfig14.addDataSourceProperty("HikariPool-975", (java.lang.Object) hikariConfig18);
        long long37 = hikariConfig18.maxLifetime;
        java.lang.String str38 = hikariConfig18.connectionTestQuery;
        int int39 = hikariConfig18.getMaximumPoolSize();
        java.lang.String str40 = hikariConfig18.getConnectionInitSql();
        java.lang.String str41 = hikariConfig18.catalog;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-16580" + "'", str15, "HikariPool-16580");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.getMinimumPoolSize();
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionTestQuery = "HikariPool-2930";
        hikariConfig1.setTransactionIsolation("HikariPool-622");
        hikariConfig1.setJdbcUrl("HikariPool-116");
        long long18 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.poolName = "HikariPool-1119";
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
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
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.transactionIsolation = 100;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
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
        int int18 = hikariConfig1.acquireIncrement;
        java.lang.String str19 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setTransactionIsolation("HikariPool-109");
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setJdbcUrl("HikariPool-746");
        hikariConfig1.setMaximumPoolSize(32);
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        java.lang.String str16 = hikariConfig1.jdbcUrl;
        boolean boolean17 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-746" + "'", str16, "HikariPool-746");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
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
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setIdleTimeout((long) (-1));
        int int21 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
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
        int int21 = hikariConfig20.getAcquireIncrement();
        java.lang.String str22 = hikariConfig20.getJdbcUrl();
        hikariConfig20.leakDetectionThreshold = 32L;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setConnectionTestQuery("HikariPool-109");
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
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
        hikariConfig1.connectionTestQuery = "HikariPool-320";
        long long17 = hikariConfig1.connectionTimeout;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.acquireRetryDelay = (byte) 100;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.maxLifetime = 3;
        hikariConfig1.maxPoolSize = 1;
        java.lang.String str11 = hikariConfig1.getPoolName();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long15 = hikariConfig14.getAcquireRetryDelay();
        hikariConfig14.idleTimeout = (-1);
        java.util.Properties properties18 = hikariConfig14.getDataSourceProperties();
        long long19 = hikariConfig14.maxLifetime;
        hikariConfig14.setLeakDetectionThreshold(750L);
        int int22 = hikariConfig14.getMinimumPoolSize();
        hikariConfig14.connectionTestQuery = "HikariPool-77";
        hikariConfig14.leakDetectionThreshold = '4';
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        long long29 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.idleTimeout = (-1);
        java.util.Properties properties32 = hikariConfig28.getDataSourceProperties();
        long long33 = hikariConfig28.maxLifetime;
        hikariConfig28.setConnectionInitSql("");
        int int36 = hikariConfig28.acquireRetries;
        hikariConfig28.leakDetectionThreshold = (-1);
        java.util.Properties properties39 = hikariConfig28.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig14.setDataSourceProperties(properties39);
        hikariConfig1.addDataSourceProperty("HikariPool-4481", (java.lang.Object) hikariConfig14);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig14.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-16613" + "'", str11, "HikariPool-16613");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(properties39);
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        hikariConfig1.poolName = "HikariPool-127";
        hikariConfig1.setConnectionTestQuery("HikariPool-559");
        hikariConfig1.setMinimumPoolSize((int) ' ');
        hikariConfig1.isIsolateInternalQueries = true;
        int int27 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionTestQuery("HikariPool-5530");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2147483647L + "'", long17 == 2147483647L);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
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
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setDataSourceClassName("HikariPool-196");
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isIsolateInternalQueries();
        long long20 = hikariConfig18.getConnectionTimeout();
        javax.sql.DataSource dataSource21 = null;
        hikariConfig18.setDataSource(dataSource21);
        hikariConfig18.setMaxLifetime(100L);
        hikariConfig1.addDataSourceProperty("HikariPool-160", (java.lang.Object) hikariConfig18);
        hikariConfig18.acquireRetries = 3;
        javax.sql.DataSource dataSource28 = null;
        hikariConfig18.dataSource = dataSource28;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.dataSourceClassName = "HikariPool-268";
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setAutoCommit(true);
        int int19 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.isReadOnly = false;
        hikariConfig1.isAutoCommit = true;
        java.lang.Class<?> wildcardClass24 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
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
        hikariConfig1.connectionInitSql = "HikariPool-77";
        int int22 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold((long) 97);
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16622" + "'", str9, "HikariPool-16622");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-16622" + "'", str13, "HikariPool-16622");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.acquireIncrement = '#';
        int int8 = hikariConfig5.acquireIncrement;
        boolean boolean9 = hikariConfig5.isReadOnly;
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
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
        hikariConfig1.setMaximumPoolSize(358);
        hikariConfig1.jdbcUrl = "HikariPool-15019";
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setIsolateInternalQueries(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer6;
        int int8 = hikariConfig1.transactionIsolation;
        int int9 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
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
        java.lang.String str15 = hikariConfig1.connectionTestQuery;
        boolean boolean16 = hikariConfig1.isAutoCommit();
        int int17 = hikariConfig1.transactionIsolation;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer19;
        hikariConfig1.acquireRetries = 32;
        boolean boolean23 = hikariConfig1.isInitializationFailFast;
        int int24 = hikariConfig1.maxPoolSize;
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
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
        hikariConfig1.setCatalog("HikariPool-45");
        hikariConfig1.setTransactionIsolation("HikariPool-2223");
        long long17 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.isReadOnly = true;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
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
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
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
        boolean boolean21 = hikariConfig20.isIsolateInternalQueries;
        java.lang.String str22 = hikariConfig20.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.maxLifetime;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        hikariConfig1.transactionIsolationName = "HikariPool-1124";
        java.lang.String str15 = hikariConfig1.poolName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig1.connectionCustomizer;
        long long17 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-16657" + "'", str15, "HikariPool-16657");
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-15603");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-15603 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        long long14 = hikariConfig13.getAcquireRetryDelay();
        hikariConfig13.connectionInitSql = "hi!";
        hikariConfig13.setTransactionIsolation("hi!");
        hikariConfig13.isInitializationFailFast = true;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.connectionInitSql = "hi!";
        hikariConfig22.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig22.transactionIsolation = (byte) 0;
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        long long32 = hikariConfig31.getAcquireRetryDelay();
        hikariConfig31.idleTimeout = (-1);
        java.util.Properties properties35 = hikariConfig31.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig22.setDataSourceProperties(properties35);
        hikariConfig13.setDataSourceProperties(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig1.dataSourceProperties = properties35;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties35);
        java.lang.String str44 = hikariConfig43.poolName;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16676" + "'", str9, "HikariPool-16676");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertNotNull(properties35);
// flaky:         org.junit.Assert.assertEquals("'" + str44 + "' != '" + "HikariPool-16684" + "'", str44, "HikariPool-16684");
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.transactionIsolation = (byte) 10;
        java.lang.String str10 = hikariConfig1.getJdbcUrl();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-569";
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.idleTimeout = 3L;
        hikariConfig1.isAutoCommit = true;
        boolean boolean11 = hikariConfig1.isReadOnly;
        boolean boolean12 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        hikariConfig1.minPoolSize = 1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
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
        boolean boolean20 = hikariConfig1.isReadOnly;
        java.lang.String str21 = hikariConfig1.getPoolName();
        hikariConfig1.connectionTestQuery = "HikariPool-266";
        hikariConfig1.acquireIncrement = '4';
        hikariConfig1.connectionCustomizerClassName = "HikariPool-40";
        int int28 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setTransactionIsolation("");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-16696" + "'", str17, "HikariPool-16696");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-16695" + "'", str21, "HikariPool-16695");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.jdbcUrl = "HikariPool-394";
        hikariConfig1.transactionIsolation = (short) 0;
        hikariConfig1.setCatalog("HikariPool-180");
        hikariConfig1.transactionIsolationName = "HikariPool-2053";
        javax.sql.DataSource dataSource18 = hikariConfig1.dataSource;
        long long19 = hikariConfig1.getIdleTimeout();
        boolean boolean20 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
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
        boolean boolean31 = hikariConfig1.isIsolateInternalQueries;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.connectionTestQuery = "HikariPool-45";
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setConnectionTimeout((long) (short) 100);
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        int int18 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.jdbcUrl;
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.leakDetectionThreshold = (byte) 0;
        java.lang.String str12 = hikariConfig1.jdbcUrl;
        long long13 = hikariConfig1.acquireRetryDelay;
        int int14 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
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
        hikariConfig1.setConnectionInitSql("HikariPool-195");
        int int22 = hikariConfig1.acquireIncrement;
        long long23 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties24 = hikariConfig1.dataSourceProperties;
        javax.sql.DataSource dataSource25 = hikariConfig1.dataSource;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(dataSource25);
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        long long5 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.connectionTestQuery = "HikariPool-1797";
        hikariConfig1.setCatalog("HikariPool-12442");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        java.lang.String str5 = hikariConfig1.getCatalog();
        long long6 = hikariConfig1.getMaxLifetime();
        hikariConfig1.connectionTestQuery = "HikariPool-8537";
        int int9 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
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
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-16731" + "'", str17, "HikariPool-16731");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.maxLifetime = (-1L);
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.acquireRetryDelay = '#';
        hikariConfig1.setConnectionTestQuery("HikariPool-630");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
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
        hikariConfig1.minPoolSize = (byte) -1;
        boolean boolean19 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
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
        boolean boolean20 = hikariConfig5.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13300");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13300 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5454");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5454 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
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
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.isReadOnly = true;
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        java.lang.String str18 = hikariConfig1.getCatalog();
        hikariConfig1.transactionIsolationName = "HikariPool-61";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-358";
        int int23 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
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
        java.lang.String str26 = hikariConfig25.getJdbcUrl();
        hikariConfig25.connectionCustomizerClassName = "HikariPool-18";
        java.lang.String str29 = hikariConfig25.dataSourceClassName;
        int int30 = hikariConfig25.getMinimumPoolSize();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
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
        hikariConfig10.dataSourceClassName = "HikariPool-28";
        java.lang.String str17 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.connectionTimeout = 60;
        java.lang.String str20 = hikariConfig10.poolName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-28" + "'", str17, "HikariPool-28");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-16757" + "'", str20, "HikariPool-16757");
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.leakDetectionThreshold = 0L;
        boolean boolean13 = hikariConfig10.isAutoCommit;
        java.util.Properties properties14 = hikariConfig10.dataSourceProperties;
        hikariConfig10.setReadOnly(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13959");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13959 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        long long21 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.idleTimeout = (-1);
        hikariConfig20.setMaximumPoolSize((int) 'a');
        java.lang.String str26 = hikariConfig20.catalog;
        boolean boolean27 = hikariConfig20.isJdbc4ConnectionTest();
        boolean boolean28 = hikariConfig20.isInitializationFailFast();
        boolean boolean29 = hikariConfig20.isInitializationFailFast();
        java.lang.String str30 = hikariConfig20.getConnectionCustomizerClassName();
        java.util.Properties properties31 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        hikariConfig10.dataSourceProperties = properties31;
        java.lang.String str34 = hikariConfig10.dataSourceClassName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
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
        hikariConfig1.minPoolSize = (byte) 10;
        int int23 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isReadOnly = true;
        java.lang.String str21 = hikariConfig1.getJdbcUrl();
        boolean boolean22 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45" + "'", str16, "HikariPool-45");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
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
        hikariConfig1.minPoolSize = (short) 10;
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        int int17 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
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
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        int int17 = hikariConfig1.maxPoolSize;
        long long18 = hikariConfig1.maxLifetime;
        hikariConfig1.maxLifetime = 358;
        java.lang.String str21 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setCatalog("HikariPool-41");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        java.lang.String str7 = hikariConfig1.getJdbcUrl();
        hikariConfig1.isReadOnly = false;
        java.lang.String str10 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        hikariConfig1.connectionTestQuery = "HikariPool-152";
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        long long12 = hikariConfig11.getAcquireRetryDelay();
        hikariConfig11.idleTimeout = (-1);
        hikariConfig11.setMaximumPoolSize((int) 'a');
        java.lang.String str17 = hikariConfig11.catalog;
        boolean boolean18 = hikariConfig11.isJdbc4ConnectionTest();
        hikariConfig11.setMaximumPoolSize(0);
        hikariConfig11.transactionIsolation = (short) 100;
        java.util.Properties properties23 = hikariConfig11.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        int int27 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3143");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3143 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
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
        boolean boolean16 = hikariConfig1.isAutoCommit;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.dataSource = dataSource17;
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        long long21 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.idleTimeout = (-1);
        java.util.Properties properties24 = hikariConfig20.getDataSourceProperties();
        long long25 = hikariConfig20.maxLifetime;
        hikariConfig20.setLeakDetectionThreshold(750L);
        int int28 = hikariConfig20.getMinimumPoolSize();
        hikariConfig20.acquireRetries = 'a';
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        long long33 = hikariConfig32.getAcquireRetryDelay();
        hikariConfig32.connectionInitSql = "hi!";
        hikariConfig32.acquireIncrement = (byte) 100;
        hikariConfig32.setMinimumPoolSize((int) (short) 0);
        java.lang.String str40 = hikariConfig32.dataSourceClassName;
        long long41 = hikariConfig32.getAcquireRetryDelay();
        hikariConfig32.idleTimeout = (byte) -1;
        java.util.Properties properties44 = hikariConfig32.dataSourceProperties;
        hikariConfig20.dataSourceProperties = properties44;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig1.dataSourceProperties = properties44;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties44);
        long long51 = hikariConfig50.getIdleTimeout();
        int int52 = hikariConfig50.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNotNull(properties24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
        org.junit.Assert.assertNotNull(properties44);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1800000L + "'", long51 == 1800000L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
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
        hikariConfig16.connectionInitSql = "HikariPool-613";
        hikariConfig16.isAutoCommit = true;
        hikariConfig16.maxLifetime = 0L;
        int int23 = hikariConfig16.transactionIsolation;
        hikariConfig16.transactionIsolationName = "HikariPool-105";
        hikariConfig16.setMaximumPoolSize(60);
        boolean boolean28 = hikariConfig16.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
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
        long long14 = hikariConfig1.connectionTimeout;
        java.lang.String str15 = hikariConfig1.connectionTestQuery;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.idleTimeout = (-1);
        hikariConfig17.setMaximumPoolSize((int) 'a');
        java.lang.String str23 = hikariConfig17.connectionTestQuery;
        java.lang.String str24 = hikariConfig17.getConnectionTestQuery();
        int int25 = hikariConfig17.acquireIncrement;
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.lang.String str28 = hikariConfig27.getDataSourceClassName();
        hikariConfig27.setTransactionIsolation("hi!");
        hikariConfig27.acquireRetryDelay = '4';
        hikariConfig27.setConnectionTimeout((long) (short) 0);
        hikariConfig27.setConnectionTestQuery("HikariPool-45");
        java.lang.String str37 = hikariConfig27.getConnectionTestQuery();
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        long long40 = hikariConfig39.getAcquireRetryDelay();
        hikariConfig39.connectionInitSql = "hi!";
        hikariConfig39.acquireIncrement = (byte) 100;
        hikariConfig39.setMinimumPoolSize((int) (short) 0);
        hikariConfig39.connectionTestQuery = "";
        hikariConfig39.jdbcUrl = "HikariPool-45";
        hikariConfig39.isReadOnly = false;
        hikariConfig39.setPoolName("");
        java.lang.String str55 = hikariConfig39.getConnectionTestQuery();
        java.util.Properties properties56 = hikariConfig39.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig27.setDataSourceProperties(properties56);
        hikariConfig17.dataSourceProperties = properties56;
        hikariConfig1.dataSourceProperties = properties56;
        long long62 = hikariConfig1.maxLifetime;
        hikariConfig1.transactionIsolation = 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-45" + "'", str37, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(properties56);
// flaky:         org.junit.Assert.assertTrue("'" + long62 + "' != '" + 100L + "'", long62 == 100L);
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-77");
        boolean boolean10 = hikariConfig1.isRegisterMbeans;
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str12 = hikariConfig1.connectionTestQuery;
        hikariConfig1.isIsolateInternalQueries = true;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-77" + "'", str12, "HikariPool-77");
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        int int10 = hikariConfig1.getMaximumPoolSize();
        long long11 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        long long13 = hikariConfig1.leakDetectionThreshold;
        long long14 = hikariConfig1.idleTimeout;
        long long15 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
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
        hikariConfig1.dataSourceClassName = "HikariPool-267";
        int int18 = hikariConfig1.getMinimumPoolSize();
        boolean boolean19 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
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
        hikariConfig1.setCatalog("HikariPool-45");
        boolean boolean15 = hikariConfig1.isReadOnly();
        hikariConfig1.transactionIsolationName = "HikariPool-9508";
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIdleTimeout(0L);
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setIsolateInternalQueries(true);
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig1.setConnectionInitSql("HikariPool-258");
        hikariConfig1.poolName = "";
        hikariConfig1.connectionTestQuery = "HikariPool-223";
        int int13 = hikariConfig1.getAcquireRetries();
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1053");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1053 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
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
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties64);
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties64);
        com.zaxxer.hikari.HikariConfig hikariConfig72 = new com.zaxxer.hikari.HikariConfig(properties64);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-16833" + "'", str32, "HikariPool-16833");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 32L + "'", long61 == 32L);
        org.junit.Assert.assertNotNull(properties64);
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
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
        int int16 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.dataSource = dataSource17;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2308");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2308 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.leakDetectionThreshold = 0L;
        hikariConfig1.jdbcUrl = "HikariPool-258";
        long long11 = hikariConfig1.getMaxLifetime();
        boolean boolean12 = hikariConfig1.isReadOnly();
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
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
        hikariConfig1.setDataSourceClassName("HikariPool-1423");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
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
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long19 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.connectionInitSql = "hi!";
        hikariConfig18.acquireIncrement = (byte) 100;
        hikariConfig18.setMinimumPoolSize((int) (short) 0);
        java.lang.String str26 = hikariConfig18.dataSourceClassName;
        long long27 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.connectionTimeout = (byte) 10;
        hikariConfig18.isReadOnly = false;
        hikariConfig18.acquireRetryDelay = 5000L;
        hikariConfig18.jdbcUrl = "HikariPool-997";
        hikariConfig14.addDataSourceProperty("HikariPool-975", (java.lang.Object) hikariConfig18);
        java.lang.String str37 = hikariConfig14.getConnectionCustomizerClassName();
        hikariConfig14.isRegisterMbeans = false;
        hikariConfig14.setJdbc4ConnectionTest(false);
        hikariConfig14.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-16854" + "'", str15, "HikariPool-16854");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
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
        hikariConfig1.catalog = "HikariPool-564";
        java.lang.String str22 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16857" + "'", str9, "HikariPool-16857");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3629");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3629 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
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
        boolean boolean16 = hikariConfig1.isAutoCommit();
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        long long18 = hikariConfig1.idleTimeout;
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str21 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.acquireRetries;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-567");
        hikariConfig1.setMaxLifetime(358L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-10466");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-10466 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
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
        java.lang.String str14 = hikariConfig1.getPoolName();
        hikariConfig1.setTransactionIsolation("HikariPool-131");
        hikariConfig1.dataSourceClassName = "HikariPool-184";
        boolean boolean19 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-16875" + "'", str14, "HikariPool-16875");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        java.lang.String str5 = hikariConfig1.getCatalog();
        java.lang.String str6 = hikariConfig1.catalog;
        java.lang.String str7 = hikariConfig1.connectionInitSql;
        hikariConfig1.acquireRetries = 60;
        hikariConfig1.transactionIsolation = (short) 1;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        int int5 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.catalog = "HikariPool-820";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
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
        hikariConfig1.setConnectionInitSql("HikariPool-195");
        long long22 = hikariConfig1.acquireRetryDelay;
        long long23 = hikariConfig1.getMaxLifetime();
        boolean boolean24 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
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
        boolean boolean16 = hikariConfig1.isAutoCommit;
        javax.sql.DataSource dataSource17 = hikariConfig1.dataSource;
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.dataSource = dataSource18;
        java.lang.String str20 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
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
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean19 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.connectionInitSql = "HikariPool-1936";
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long15 = hikariConfig14.getAcquireRetryDelay();
        hikariConfig14.idleTimeout = (-1);
        hikariConfig14.setMaximumPoolSize((int) 'a');
        java.lang.String str20 = hikariConfig14.catalog;
        hikariConfig14.connectionTimeout = ' ';
        java.lang.String str23 = hikariConfig14.getConnectionTestQuery();
        java.util.Properties properties24 = hikariConfig14.dataSourceProperties;
        hikariConfig14.minPoolSize = 'a';
        hikariConfig14.setAcquireRetryDelay((long) 10);
        hikariConfig14.catalog = "HikariPool-209";
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isInitializationFailFast();
        hikariConfig32.dataSourceClassName = "hi!";
        hikariConfig32.setRegisterMbeans(false);
        javax.sql.DataSource dataSource38 = hikariConfig32.getDataSource();
        java.util.Properties properties39 = hikariConfig32.getDataSourceProperties();
        hikariConfig14.dataSourceProperties = properties39;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig1.addDataSourceProperty("HikariPool-3897", (java.lang.Object) properties39);
        int int43 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
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
        int int29 = hikariConfig1.acquireIncrement;
        long long30 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
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
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        boolean boolean14 = hikariConfig1.isReadOnly();
        int int15 = hikariConfig1.minPoolSize;
        long long16 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 10);
        hikariConfig1.setConnectionTestQuery("HikariPool-5790");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
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
        boolean boolean21 = hikariConfig1.isJdbc4connectionTest;
        long long22 = hikariConfig1.acquireRetryDelay;
        boolean boolean23 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str26 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.acquireIncrement = (-1);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-16919" + "'", str9, "HikariPool-16919");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-16919" + "'", str13, "HikariPool-16919");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
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
        int int17 = hikariConfig16.minPoolSize;
        boolean boolean18 = hikariConfig16.isReadOnly;
        javax.sql.DataSource dataSource19 = hikariConfig16.getDataSource();
        int int20 = hikariConfig16.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
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
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        java.lang.String str23 = hikariConfig1.poolName;
        hikariConfig1.transactionIsolationName = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-16927" + "'", str23, "HikariPool-16927");
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.jdbcUrl = "HikariPool-281";
        hikariConfig10.idleTimeout = (short) 0;
        boolean boolean15 = hikariConfig10.isInitializationFailFast;
        hikariConfig10.dataSourceClassName = "HikariPool-359";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig10.setDriverClassName("HikariPool-13372");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-13372' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        long long4 = hikariConfig1.getIdleTimeout();
        int int5 = hikariConfig1.getAcquireIncrement();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.leakDetectionThreshold = (byte) 1;
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setJdbcUrl("HikariPool-806");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
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
        boolean boolean16 = hikariConfig1.isAutoCommit();
        hikariConfig1.transactionIsolationName = "HikariPool-212";
        long long19 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        long long8 = hikariConfig1.maxLifetime;
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionInitSql = "HikariPool-108";
        hikariConfig1.leakDetectionThreshold = 60;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig10.connectionCustomizer = iConnectionCustomizer17;
        hikariConfig10.maxLifetime = 3L;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setMaxLifetime(1L);
        long long14 = hikariConfig1.maxLifetime;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-1639");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1639' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-77");
        boolean boolean10 = hikariConfig1.isReadOnly();
        hikariConfig1.leakDetectionThreshold = (byte) -1;
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        long long15 = hikariConfig1.idleTimeout;
        int int16 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource17 = hikariConfig1.dataSource;
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        java.lang.String str4 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setCatalog("HikariPool-134");
        boolean boolean7 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setLeakDetectionThreshold(52L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        javax.sql.DataSource dataSource17 = hikariConfig16.dataSource;
        hikariConfig16.setTransactionIsolation("HikariPool-140");
        hikariConfig16.setJdbc4ConnectionTest(false);
        hikariConfig16.connectionTestQuery = "HikariPool-3794";
        hikariConfig16.minPoolSize = 358;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-11148");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-11148 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
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
        hikariConfig1.setDataSourceClassName("HikariPool-556");
        hikariConfig1.transactionIsolationName = "HikariPool-4622";
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
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.transactionIsolation = '4';
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
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
        hikariConfig1.jdbcUrl = "HikariPool-1184";
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.poolName = "HikariPool-6";
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setReadOnly(false);
        int int17 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.maxPoolSize = 32;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.connectionTimeout = (byte) -1;
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.catalog = "HikariPool-2051";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
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
        hikariConfig16.connectionInitSql = "HikariPool-613";
        hikariConfig16.isAutoCommit = true;
        hikariConfig16.connectionInitSql = "HikariPool-4186";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setIsolateInternalQueries(false);
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.idleTimeout = 97;
        int int15 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2980");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2980 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
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
        long long29 = hikariConfig1.connectionTimeout;
        javax.sql.DataSource dataSource30 = null;
        hikariConfig1.setDataSource(dataSource30);
        hikariConfig1.setConnectionTestQuery("HikariPool-997");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-5587");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-5587' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.connectionTimeout = ' ';
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
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
        long long14 = hikariConfig1.getConnectionTimeout();
        long long15 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.dataSourceClassName = "HikariPool-486";
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.idleTimeout = (-1);
        hikariConfig19.setMaximumPoolSize((int) 'a');
        java.lang.String str25 = hikariConfig19.catalog;
        boolean boolean26 = hikariConfig19.isJdbc4ConnectionTest();
        hikariConfig19.setMinimumPoolSize(0);
        hikariConfig19.setTransactionIsolation("HikariPool-276");
        java.util.Properties properties31 = hikariConfig19.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties31;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties31);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties31);
        javax.sql.DataSource dataSource35 = hikariConfig34.dataSource;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNull(dataSource35);
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean10 = hikariConfig1.isAutoCommit;
        java.lang.Class<?> wildcardClass11 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-16027");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-16027 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setIdleTimeout(10L);
        boolean boolean11 = hikariConfig1.isAutoCommit();
        int int12 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.connectionTimeout = (byte) 1;
        java.lang.String str15 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-16989" + "'", str15, "HikariPool-16989");
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
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
        long long18 = hikariConfig10.getIdleTimeout();
        java.lang.String str19 = hikariConfig10.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
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
        boolean boolean25 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionInitSql = "HikariPool-91";
        boolean boolean28 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        hikariConfig1.poolName = "HikariPool-127";
        hikariConfig1.setConnectionTestQuery("HikariPool-559");
        boolean boolean23 = hikariConfig1.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig1.connectionCustomizer;
        int int25 = hikariConfig1.transactionIsolation;
        hikariConfig1.jdbcUrl = "HikariPool-8275";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2147483647L + "'", long17 == 2147483647L);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        int int12 = hikariConfig1.transactionIsolation;
        hikariConfig1.setMaxLifetime((long) (short) 10);
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        int int16 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.transactionIsolation = 60;
        int int20 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
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
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("HikariPool-2444");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
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
        long long23 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.connectionTestQuery = "HikariPool-254";
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
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
        long long21 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.isAutoCommit = true;
        java.lang.String str26 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
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
        hikariConfig16.jdbcUrl = "HikariPool-45";
        int int22 = hikariConfig16.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
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
        long long15 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
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
        boolean boolean17 = hikariConfig1.isAutoCommit();
        java.lang.String str18 = hikariConfig1.dataSourceClassName;
        long long19 = hikariConfig1.idleTimeout;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.connectionInitSql = "hi!";
        hikariConfig22.acquireIncrement = (byte) 100;
        hikariConfig22.setMinimumPoolSize((int) (short) 0);
        java.lang.String str30 = hikariConfig22.dataSourceClassName;
        long long31 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.idleTimeout = (byte) -1;
        java.util.Properties properties34 = hikariConfig22.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties34);
        long long37 = hikariConfig36.leakDetectionThreshold;
        java.lang.String str38 = hikariConfig36.getConnectionTestQuery();
        hikariConfig36.catalog = "HikariPool-459";
        int int41 = hikariConfig36.transactionIsolation;
        hikariConfig36.setDataSourceClassName("HikariPool-944");
        hikariConfig1.addDataSourceProperty("HikariPool-4288", (java.lang.Object) "HikariPool-944");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-495" + "'", str14, "HikariPool-495");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
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
        hikariConfig1.setAcquireRetries(60);
        java.lang.String str18 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean19 = hikariConfig1.isAutoCommit;
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
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
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.dataSourceClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer18;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
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
        boolean boolean20 = hikariConfig1.isReadOnly;
        hikariConfig1.transactionIsolation = 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer23;
        hikariConfig1.connectionInitSql = "";
        hikariConfig1.acquireRetries = '#';
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-17023" + "'", str17, "HikariPool-17023");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        long long9 = hikariConfig1.connectionTimeout;
        hikariConfig1.leakDetectionThreshold = 1;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        long long10 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.connectionInitSql = "HikariPool-1065";
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        java.lang.String str4 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionInitSql("HikariPool-520");
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-17031" + "'", str4, "HikariPool-17031");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.minPoolSize = 'a';
        hikariConfig1.acquireIncrement = (byte) 10;
        hikariConfig1.isReadOnly = true;
        int int15 = hikariConfig1.minPoolSize;
        java.lang.String str16 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionInitSql("HikariPool-425");
        boolean boolean19 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        int int9 = hikariConfig1.acquireRetries;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setTransactionIsolation("HikariPool-3259");
        hikariConfig1.isReadOnly = false;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.util.Properties properties15 = hikariConfig14.getDataSourceProperties();
        java.lang.String str16 = hikariConfig14.catalog;
        long long17 = hikariConfig14.maxLifetime;
        java.lang.String str18 = hikariConfig14.getConnectionInitSql();
        java.lang.String str19 = hikariConfig14.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setIdleTimeout(10L);
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        int int12 = hikariConfig1.minPoolSize;
        boolean boolean13 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
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
        hikariConfig5.isRegisterMbeans = false;
        hikariConfig5.acquireIncrement = 52;
        java.lang.Class<?> wildcardClass23 = hikariConfig5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-10300");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-10300 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
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
        long long13 = hikariConfig1.maxLifetime;
        hikariConfig1.isIsolateInternalQueries = true;
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        int int17 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isAutoCommit = false;
        int int20 = hikariConfig1.maxPoolSize;
        hikariConfig1.connectionCustomizerClassName = "";
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
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
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-451");
        hikariConfig1.setConnectionInitSql("HikariPool-94");
        hikariConfig1.setAcquireRetryDelay(35L);
        hikariConfig1.acquireIncrement = (short) 10;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
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
        long long17 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.isIsolateInternalQueries = true;
        int int21 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        int int10 = hikariConfig1.maxPoolSize;
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        int int14 = hikariConfig1.getMaximumPoolSize();
        long long15 = hikariConfig1.connectionTimeout;
        hikariConfig1.idleTimeout = 35L;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.dataSourceClassName = "HikariPool-11513";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
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
        boolean boolean21 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean22 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str25 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-17080" + "'", str9, "HikariPool-17080");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-17080" + "'", str13, "HikariPool-17080");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1569");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1569 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        long long7 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.maxLifetime = ' ';
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setMaxLifetime((long) 358);
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig15.setMinimumPoolSize(1);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        java.lang.String str21 = hikariConfig19.jdbcUrl;
        java.lang.String str22 = hikariConfig19.poolName;
        java.util.Properties properties23 = hikariConfig19.dataSourceProperties;
        hikariConfig15.dataSourceProperties = properties23;
        javax.sql.DataSource dataSource25 = hikariConfig15.getDataSource();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-17088" + "'", str22, "HikariPool-17088");
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(dataSource25);
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
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
        hikariConfig1.minPoolSize = (short) 10;
        boolean boolean20 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.transactionIsolation = (byte) 10;
        hikariConfig1.setPoolName("HikariPool-713");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setIsolateInternalQueries(true);
        java.lang.String str10 = hikariConfig1.getPoolName();
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.isIsolateInternalQueries = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-17091" + "'", str10, "HikariPool-17091");
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
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
        boolean boolean16 = hikariConfig1.isAutoCommit;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.dataSource = dataSource17;
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        long long21 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.idleTimeout = (-1);
        java.util.Properties properties24 = hikariConfig20.getDataSourceProperties();
        long long25 = hikariConfig20.maxLifetime;
        hikariConfig20.setLeakDetectionThreshold(750L);
        int int28 = hikariConfig20.getMinimumPoolSize();
        hikariConfig20.acquireRetries = 'a';
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        long long33 = hikariConfig32.getAcquireRetryDelay();
        hikariConfig32.connectionInitSql = "hi!";
        hikariConfig32.acquireIncrement = (byte) 100;
        hikariConfig32.setMinimumPoolSize((int) (short) 0);
        java.lang.String str40 = hikariConfig32.dataSourceClassName;
        long long41 = hikariConfig32.getAcquireRetryDelay();
        hikariConfig32.idleTimeout = (byte) -1;
        java.util.Properties properties44 = hikariConfig32.dataSourceProperties;
        hikariConfig20.dataSourceProperties = properties44;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig1.dataSourceProperties = properties44;
        java.lang.String str48 = hikariConfig1.dataSourceClassName;
        javax.sql.DataSource dataSource49 = hikariConfig1.getDataSource();
        int int50 = hikariConfig1.minPoolSize;
        long long51 = hikariConfig1.getMaxLifetime();
        int int52 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNotNull(properties24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "HikariPool-117" + "'", str48, "HikariPool-117");
        org.junit.Assert.assertNull(dataSource49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
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
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        java.lang.String str18 = hikariConfig17.getDataSourceClassName();
        hikariConfig17.setTransactionIsolation("hi!");
        hikariConfig17.acquireRetryDelay = '4';
        hikariConfig17.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties25 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.leakDetectionThreshold = 0L;
        boolean boolean29 = hikariConfig26.isAutoCommit;
        java.util.Properties properties30 = hikariConfig26.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig1.dataSourceProperties = properties30;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig33.setMaximumPoolSize(358);
        int int36 = hikariConfig33.acquireRetries;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setIdleTimeout(10L);
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.acquireIncrement = (byte) 1;
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        long long16 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.isReadOnly = false;
        java.lang.String str5 = hikariConfig1.poolName;
        hikariConfig1.setIdleTimeout((long) 3);
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-17108" + "'", str5, "HikariPool-17108");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        int int10 = hikariConfig1.transactionIsolation;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionInitSql = "HikariPool-132";
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        long long15 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.acquireRetries = 10;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
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
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.isReadOnly = true;
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
        long long20 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIsolateInternalQueries(true);
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.connectionInitSql = "HikariPool-87";
        hikariConfig1.setMaxLifetime(100L);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.connectionInitSql = "HikariPool-2630";
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.leakDetectionThreshold = 97;
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.transactionIsolation = (byte) 10;
        java.lang.String str10 = hikariConfig1.getJdbcUrl();
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMaxLifetime(52L);
        int int15 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str16 = hikariConfig1.getJdbcUrl();
        long long17 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
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
        boolean boolean20 = hikariConfig1.isReadOnly();
        java.util.Properties properties21 = null;
        hikariConfig1.dataSourceProperties = properties21;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
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
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-17128" + "'", str9, "HikariPool-17128");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNull(dataSource22);
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        long long4 = hikariConfig1.getIdleTimeout();
        int int5 = hikariConfig1.getAcquireIncrement();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.leakDetectionThreshold = (byte) 1;
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.transactionIsolation = 358;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long15 = hikariConfig14.getAcquireRetryDelay();
        hikariConfig14.idleTimeout = (-1);
        java.util.Properties properties18 = hikariConfig14.getDataSourceProperties();
        long long19 = hikariConfig14.maxLifetime;
        hikariConfig14.setConnectionInitSql("");
        int int22 = hikariConfig14.acquireRetries;
        hikariConfig14.leakDetectionThreshold = (-1);
        java.util.Properties properties25 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig1.setDataSourceProperties(properties25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.connectionTimeout = ' ';
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8562");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8562 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
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
        hikariConfig1.setLeakDetectionThreshold(750L);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-17145" + "'", str9, "HikariPool-17145");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(true);
        long long8 = hikariConfig1.connectionTimeout;
        long long9 = hikariConfig1.idleTimeout;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        int int12 = hikariConfig1.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
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
        boolean boolean18 = hikariConfig1.isAutoCommit();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.dataSourceClassName = "HikariPool-402";
        java.lang.String str23 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-402" + "'", str23, "HikariPool-402");
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireRetries(100);
        int int6 = hikariConfig1.maxPoolSize;
        int int7 = hikariConfig1.getTransactionIsolation();
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setJdbcUrl("HikariPool-14644");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
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
        java.lang.String str15 = hikariConfig1.connectionTestQuery;
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setAcquireRetries((int) (short) 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
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
        long long14 = hikariConfig1.idleTimeout;
        int int15 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
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
        hikariConfig16.isReadOnly = true;
        hikariConfig16.isRegisterMbeans = true;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig16.connectionCustomizer = iConnectionCustomizer23;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
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
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties37);
        int int46 = hikariConfig45.transactionIsolation;
        hikariConfig45.jdbcUrl = "HikariPool-3";
        long long49 = hikariConfig45.acquireRetryDelay;
        java.lang.String str50 = hikariConfig45.getConnectionCustomizerClassName();
        hikariConfig45.leakDetectionThreshold = 52;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 32L + "'", long49 == 32L);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireRetries(100);
        int int6 = hikariConfig1.maxPoolSize;
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.acquireRetryDelay = 60;
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
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
        long long16 = hikariConfig15.idleTimeout;
        hikariConfig15.isJdbc4connectionTest = true;
        long long19 = hikariConfig15.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        java.lang.String str5 = hikariConfig1.getPoolName();
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean7 = hikariConfig1.isReadOnly;
        hikariConfig1.jdbcUrl = "HikariPool-1951";
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-17182" + "'", str5, "HikariPool-17182");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
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
        int int17 = hikariConfig1.maxPoolSize;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.connectionInitSql = "HikariPool-847";
        hikariConfig1.isJdbc4connectionTest = true;
        long long26 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        long long30 = hikariConfig29.getAcquireRetryDelay();
        hikariConfig29.connectionInitSql = "hi!";
        hikariConfig29.acquireIncrement = (byte) 100;
        hikariConfig29.setMinimumPoolSize((int) (short) 0);
        hikariConfig29.connectionTestQuery = "";
        hikariConfig29.jdbcUrl = "HikariPool-45";
        hikariConfig29.dataSourceClassName = "hi!";
        hikariConfig29.setIdleTimeout((long) (short) 100);
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        java.lang.String str47 = hikariConfig46.getDataSourceClassName();
        hikariConfig46.setTransactionIsolation("hi!");
        hikariConfig46.acquireRetryDelay = '4';
        hikariConfig46.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties54 = hikariConfig46.getDataSourceProperties();
        hikariConfig46.setAcquireRetries((int) (short) 1);
        java.util.Properties properties57 = hikariConfig46.getDataSourceProperties();
        hikariConfig29.dataSourceProperties = properties57;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties57);
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties57);
        hikariConfig60.acquireIncrement = 1;
        hikariConfig60.setCatalog("HikariPool-245");
        int int65 = hikariConfig60.minPoolSize;
        hikariConfig60.setIsolateInternalQueries(false);
        boolean boolean68 = hikariConfig60.isAutoCommit;
        hikariConfig1.addDataSourceProperty("HikariPool-488", (java.lang.Object) boolean68);
        hikariConfig1.setPoolName("HikariPool-15012");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
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
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str18 = hikariConfig1.getPoolName();
        hikariConfig1.maxLifetime = (-1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-17192" + "'", str18, "HikariPool-17192");
    }
}
