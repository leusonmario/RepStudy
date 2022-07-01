import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test20501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20501");
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
        hikariConfig1.acquireRetryDelay = 600000L;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        hikariConfig1.setAutoCommit(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test20502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20502");
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
        hikariConfig1.setAcquireRetries((int) '4');
        int int24 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 52L + "'", long21 == 52L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test20503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20503");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        java.lang.String str7 = hikariConfig1.getPoolName();
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-54999" + "'", str7, "HikariPool-54999");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test20504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20504");
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
        hikariConfig1.isJdbc4connectionTest = true;
        javax.sql.DataSource dataSource24 = hikariConfig1.getDataSource();
        java.util.Properties properties25 = hikariConfig1.dataSourceProperties;
        hikariConfig1.connectionTestQuery = "HikariPool-2930";
        hikariConfig1.isJdbc4connectionTest = true;
        int int30 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test20505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20505");
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
        hikariConfig1.setIdleTimeout((long) ' ');
        boolean boolean17 = hikariConfig1.isIsolateInternalQueries;
        long long18 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2092");
        boolean boolean21 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test20506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20506");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        long long9 = hikariConfig1.maxLifetime;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        int int11 = hikariConfig1.acquireRetries;
        long long12 = hikariConfig1.getMaxLifetime();
        int int13 = hikariConfig1.getMinimumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test20507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20507");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setJdbcUrl("HikariPool-300");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-335");
        hikariConfig1.isAutoCommit = true;
        boolean boolean14 = hikariConfig1.isReadOnly();
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.setMaximumPoolSize(10);
        boolean boolean19 = hikariConfig1.isAutoCommit;
        hikariConfig1.acquireIncrement = (short) 10;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20508");
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
        hikariConfig17.catalog = "HikariPool-400";
        hikariConfig17.maxPoolSize = (byte) -1;
        boolean boolean22 = hikariConfig17.isIsolateInternalQueries;
        javax.sql.DataSource dataSource23 = null;
        hikariConfig17.dataSource = dataSource23;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20509");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str10 = hikariConfig1.poolName;
        hikariConfig1.isIsolateInternalQueries = false;
        int int13 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isReadOnly = true;
        hikariConfig1.setAutoCommit(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-55008" + "'", str10, "HikariPool-55008");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test20510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20510");
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
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setMinimumPoolSize(97);
        hikariConfig1.setAcquireRetries(358);
        hikariConfig1.setPoolName("HikariPool-4345");
        long long24 = hikariConfig1.connectionTimeout;
        long long25 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
    }

    @Test
    public void test20511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20511");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        boolean boolean9 = hikariConfig1.isReadOnly();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setLeakDetectionThreshold((long) 32);
        hikariConfig1.jdbcUrl = "HikariPool-13877";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test20512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20512");
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
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20513");
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
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test20514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20514");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.catalog;
        hikariConfig1.setIsolateInternalQueries(false);
        int int11 = hikariConfig1.transactionIsolation;
        hikariConfig1.isAutoCommit = false;
        long long14 = hikariConfig1.getConnectionTimeout();
        int int15 = hikariConfig1.maxPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test20515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20515");
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
        long long19 = hikariConfig16.getMaxLifetime();
        java.lang.String str20 = hikariConfig16.getCatalog();
        java.lang.String str21 = hikariConfig16.getCatalog();
        hikariConfig16.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20516");
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
        java.lang.String str48 = hikariConfig1.jdbcUrl;
        int int49 = hikariConfig1.acquireRetries;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.transactionIsolation = 100;
        hikariConfig1.maxLifetime = (short) -1;
        java.lang.String str56 = hikariConfig1.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer57 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer57;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNotNull(properties24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertNull(str40);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test20517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20517");
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
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean31 = hikariConfig1.isReadOnly();
        hikariConfig1.setAutoCommit(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer34 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolationName = "HikariPool-2795";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer34);
    }

    @Test
    public void test20518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20518");
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
        hikariConfig1.setReadOnly(true);
        java.lang.String str23 = hikariConfig1.connectionInitSql;
        long long24 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test20519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20519");
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
        hikariConfig1.setPoolName("HikariPool-908");
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        hikariConfig1.catalog = "HikariPool-28925";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20520");
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
        hikariConfig15.setIdleTimeout((long) 10);
        hikariConfig15.connectionTestQuery = "HikariPool-632";
        boolean boolean20 = hikariConfig15.isRegisterMbeans();
        long long21 = hikariConfig15.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test20521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20521");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("HikariPool-832");
        long long10 = hikariConfig1.maxLifetime;
        hikariConfig1.acquireIncrement = (byte) 0;
        hikariConfig1.setConnectionInitSql("HikariPool-237");
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1951";
        hikariConfig1.connectionTimeout = 52L;
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20522");
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
        long long33 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str34 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 750L + "'", long33 == 750L);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test20523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20523");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.connectionTimeout = 1L;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.jdbcUrl = "HikariPool-1893";
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test20524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20524");
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
        boolean boolean17 = hikariConfig1.isReadOnly();
        boolean boolean18 = hikariConfig1.isReadOnly;
        int int19 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setCatalog("HikariPool-15016");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test20525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20525");
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
        hikariConfig14.setTransactionIsolation("HikariPool-290");
        java.lang.String str17 = hikariConfig14.getConnectionCustomizerClassName();
        hikariConfig14.leakDetectionThreshold = (byte) 10;
        java.lang.String str20 = hikariConfig14.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20526");
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
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties18);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test20527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20527");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-55";
        int int14 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties15 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test20528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20528");
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
        hikariConfig1.connectionTimeout = 1L;
        hikariConfig1.setConnectionTestQuery("HikariPool-942");
        java.util.Properties properties50 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer51 = hikariConfig1.connectionCustomizer;
        java.lang.String str52 = hikariConfig1.transactionIsolationName;
        java.lang.String str53 = hikariConfig1.connectionCustomizerClassName;
        int int54 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(properties28);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertNull(iConnectionCustomizer51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test20529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20529");
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
        hikariConfig1.acquireIncrement = (byte) 1;
        hikariConfig1.minPoolSize = (byte) 10;
        int int24 = hikariConfig1.maxPoolSize;
        java.lang.String str25 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties26 = hikariConfig1.dataSourceProperties;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test20530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20530");
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
        hikariConfig1.setConnectionInitSql("HikariPool-72");
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.isAutoCommit = true;
        int int18 = hikariConfig1.acquireRetries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test20531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20531");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3172");
        int int13 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20532");
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
        hikariConfig10.setReadOnly(false);
        hikariConfig10.isRegisterMbeans = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-281" + "'", str13, "HikariPool-281");
    }

    @Test
    public void test20533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20533");
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
        hikariConfig14.idleTimeout = (-1L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test20534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20534");
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
        hikariConfig10.setMaximumPoolSize((int) 'a');
        hikariConfig10.setPoolName("HikariPool-18388");
        boolean boolean20 = hikariConfig10.isReadOnly;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test20535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20535");
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
        java.lang.String str21 = hikariConfig1.getPoolName();
        long long22 = hikariConfig1.getIdleTimeout();
        long long23 = hikariConfig1.connectionTimeout;
        int int24 = hikariConfig1.transactionIsolation;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-55079" + "'", str21, "HikariPool-55079");
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3L + "'", long23 == 3L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test20536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20536");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-22084");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-22084' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-55080" + "'", str10, "HikariPool-55080");
    }

    @Test
    public void test20537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20537");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        java.lang.String str14 = hikariConfig1.getCatalog();
        java.lang.String str15 = hikariConfig1.connectionTestQuery;
        boolean boolean16 = hikariConfig1.isReadOnly();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20538");
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
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setConnectionTestQuery("HikariPool-2341");
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.lang.String str28 = hikariConfig27.getDataSourceClassName();
        int int29 = hikariConfig27.getAcquireRetries();
        hikariConfig27.connectionTimeout = 100;
        boolean boolean32 = hikariConfig27.isInitializationFailFast();
        java.lang.String str33 = hikariConfig27.connectionTestQuery;
        hikariConfig27.setJdbcUrl("HikariPool-300");
        hikariConfig27.setConnectionCustomizerClassName("HikariPool-335");
        hikariConfig27.setLeakDetectionThreshold(600000L);
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        long long42 = hikariConfig41.getAcquireRetryDelay();
        hikariConfig41.connectionInitSql = "hi!";
        hikariConfig41.acquireIncrement = (byte) 100;
        hikariConfig41.setMinimumPoolSize((int) (short) 0);
        hikariConfig41.connectionTestQuery = "";
        hikariConfig41.jdbcUrl = "HikariPool-45";
        hikariConfig41.isReadOnly = false;
        hikariConfig41.setPoolName("");
        java.lang.String str57 = hikariConfig41.getConnectionTestQuery();
        java.util.Properties properties58 = hikariConfig41.dataSourceProperties;
        hikariConfig27.dataSourceProperties = properties58;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig1.addDataSourceProperty("HikariPool-36677", (java.lang.Object) properties58);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55082" + "'", str9, "HikariPool-55082");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(properties58);
    }

    @Test
    public void test20539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20539");
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
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionInitSql("HikariPool-140");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20540");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean6 = hikariConfig1.isAutoCommit;
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.connectionInitSql = "";
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test20541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20541");
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
        hikariConfig1.setConnectionInitSql("HikariPool-20");
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireIncrement((int) (byte) 10);
        hikariConfig1.maxPoolSize = 60;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-20" + "'", str17, "HikariPool-20");
    }

    @Test
    public void test20542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20542");
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
        int int19 = hikariConfig17.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig17.setDriverClassName("HikariPool-56");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-56' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test20543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20543");
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
        hikariConfig1.setIdleTimeout(2147483647L);
        hikariConfig1.catalog = "HikariPool-5237";
        hikariConfig1.setConnectionTestQuery("HikariPool-1449");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test20544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20544");
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
        hikariConfig1.catalog = "HikariPool-223";
        long long17 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test20545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20545");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        java.lang.String str6 = hikariConfig1.jdbcUrl;
        hikariConfig1.maxPoolSize = 358;
        hikariConfig1.poolName = "HikariPool-268";
        java.lang.String str11 = hikariConfig1.poolName;
        long long12 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-268" + "'", str11, "HikariPool-268");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test20546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20546");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-81");
        java.lang.String str21 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20547");
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
        java.util.Properties properties15 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setDataSourceClassName("HikariPool-14914");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test20548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20548");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = 358;
        java.lang.String str5 = hikariConfig1.getDataSourceClassName();
        int int6 = hikariConfig1.getMaximumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test20549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20549");
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
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.dataSource = dataSource23;
        javax.sql.DataSource dataSource25 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertNull(dataSource25);
    }

    @Test
    public void test20550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20550");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setAcquireIncrement((int) '4');
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        hikariConfig1.setIsolateInternalQueries(false);
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20551");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.lang.String str6 = hikariConfig5.transactionIsolationName;
        hikariConfig5.maxPoolSize = 60;
        java.util.Properties properties9 = hikariConfig5.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.connectionInitSql;
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20552");
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
        hikariConfig1.minPoolSize = (short) 0;
        boolean boolean19 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setJdbcUrl("HikariPool-833");
        java.lang.String str22 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setIsolateInternalQueries(false);
        java.util.Properties properties25 = hikariConfig1.getDataSourceProperties();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test20553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20553");
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
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.idleTimeout = 750L;
        hikariConfig1.acquireRetries = 60;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test20554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20554");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        int int5 = hikariConfig1.maxPoolSize;
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-48394";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test20555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20555");
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
        java.util.Properties properties19 = hikariConfig1.dataSourceProperties;
        hikariConfig1.connectionTimeout = 0;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test20556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20556");
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
        hikariConfig1.maxPoolSize = (short) -1;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.idleTimeout = (-1);
        java.util.Properties properties26 = hikariConfig22.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties26;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.lang.String str29 = hikariConfig28.getDataSourceClassName();
        hikariConfig28.minPoolSize = (short) 100;
        long long32 = hikariConfig28.maxLifetime;
        hikariConfig28.setAcquireRetries(1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str29);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 97L + "'", long32 == 97L);
    }

    @Test
    public void test20557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20557");
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
        hikariConfig1.jdbcUrl = "HikariPool-11010";
        long long27 = hikariConfig1.getConnectionTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3L + "'", long27 == 3L);
    }

    @Test
    public void test20558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20558");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        int int5 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        hikariConfig1.dataSourceClassName = "HikariPool-683";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-515");
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        java.lang.String str16 = hikariConfig1.jdbcUrl;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-683" + "'", str11, "HikariPool-683");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20559");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        long long7 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer8;
        int int10 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test20560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20560");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str9 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        int int11 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55122" + "'", str9, "HikariPool-55122");
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test20561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20561");
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
        int int37 = hikariConfig36.acquireIncrement;
        hikariConfig36.setMaximumPoolSize((int) (byte) 0);
        java.lang.String str40 = hikariConfig36.poolName;
        hikariConfig36.maxPoolSize = (short) 0;
        boolean boolean43 = hikariConfig36.isReadOnly();
        boolean boolean44 = hikariConfig36.isIsolateInternalQueries;
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-55127" + "'", str40, "HikariPool-55127");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test20562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20562");
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
        int int21 = hikariConfig1.minPoolSize;
        java.lang.String str22 = hikariConfig1.connectionInitSql;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.lang.String str25 = hikariConfig24.getDataSourceClassName();
        hikariConfig24.setTransactionIsolation("hi!");
        hikariConfig24.acquireRetryDelay = '4';
        hikariConfig24.setConnectionCustomizerClassName("");
        hikariConfig24.setAcquireRetries((int) (short) 100);
        javax.sql.DataSource dataSource34 = hikariConfig24.dataSource;
        hikariConfig24.dataSourceClassName = "HikariPool-211";
        int int37 = hikariConfig24.acquireRetries;
        hikariConfig24.isIsolateInternalQueries = false;
        java.lang.String str40 = hikariConfig24.catalog;
        hikariConfig24.dataSourceClassName = "HikariPool-1779";
        java.util.Properties properties43 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig1.setDataSourceProperties(properties43);
        boolean boolean46 = hikariConfig1.isJdbc4ConnectionTest();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test20563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20563");
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
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test20564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20564");
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
        hikariConfig14.minPoolSize = 97;
        hikariConfig14.poolName = "HikariPool-2239";
        hikariConfig14.acquireRetries = 'a';
        hikariConfig14.setTransactionIsolation("HikariPool-7749");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20565");
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
        hikariConfig1.connectionInitSql = "HikariPool-13752";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test20566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20566");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.acquireIncrement = (byte) 100;
        java.lang.String str7 = hikariConfig1.poolName;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3709");
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-55135" + "'", str7, "HikariPool-55135");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20567");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setTransactionIsolation("HikariPool-281");
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setAcquireIncrement((int) (short) 1);
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setAcquireRetryDelay((long) 10);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20568");
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
        int int19 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.dataSourceClassName = "HikariPool-739";
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.connectionTestQuery = "HikariPool-24655";
        boolean boolean26 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setPoolName("HikariPool-287");
        hikariConfig1.poolName = "HikariPool-42693";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45" + "'", str17, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test20569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20569");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12274");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12274 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20570");
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
        int int25 = hikariConfig1.getAcquireIncrement();
        java.lang.String str26 = hikariConfig1.connectionCustomizerClassName;
        int int27 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test20571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20571");
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
        hikariConfig14.dataSourceClassName = "HikariPool-16082";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-55142" + "'", str21, "HikariPool-55142");
    }

    @Test
    public void test20572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20572");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setTransactionIsolation("HikariPool-276");
        hikariConfig1.setMaximumPoolSize(0);
        int int15 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.isReadOnly = false;
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.dataSourceClassName = "HikariPool-40570";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test20573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20573");
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
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test20574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20574");
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
        hikariConfig1.setReadOnly(false);
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isReadOnly = true;
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        boolean boolean21 = hikariConfig1.isJdbc4ConnectionTest();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test20575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20575");
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
        long long37 = hikariConfig1.connectionTimeout;
        int int38 = hikariConfig1.acquireIncrement;
        hikariConfig1.dataSourceClassName = "HikariPool-49345";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 2147483647L + "'", long37 == 2147483647L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test20576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20576");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig16.setDriverClassName("HikariPool-39423");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-39423' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test20577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20577");
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
        java.lang.String str16 = hikariConfig1.poolName;
        int int17 = hikariConfig1.maxPoolSize;
        boolean boolean18 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 97L + "'", long7 == 97L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-55152" + "'", str16, "HikariPool-55152");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20578");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean7 = hikariConfig6.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig6.setConnectionTimeout((long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test20579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20579");
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
        hikariConfig1.setIdleTimeout((long) 35);
        int int29 = hikariConfig1.maxPoolSize;
        javax.sql.DataSource dataSource30 = hikariConfig1.dataSource;
        hikariConfig1.setCatalog("HikariPool-15357");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(dataSource30);
    }

    @Test
    public void test20580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20580");
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
        int int18 = hikariConfig10.transactionIsolation;
        hikariConfig10.jdbcUrl = "HikariPool-1532";
        hikariConfig10.connectionTestQuery = "HikariPool-52415";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test20581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20581");
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
        hikariConfig1.maxLifetime = ' ';
        java.lang.String str21 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55163" + "'", str9, "HikariPool-55163");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20582");
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
        java.lang.String str19 = hikariConfig1.getDataSourceClassName();
        long long20 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55164" + "'", str9, "HikariPool-55164");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
    }

    @Test
    public void test20583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20583");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-55";
        long long14 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setTransactionIsolation("HikariPool-160");
        int int17 = hikariConfig1.maxPoolSize;
        hikariConfig1.maxLifetime = 3;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test20584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20584");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer43 = hikariConfig42.connectionCustomizer;
        hikariConfig42.dataSourceClassName = "HikariPool-767";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer46 = hikariConfig42.connectionCustomizer;
        hikariConfig42.setAcquireRetries((int) ' ');
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
        org.junit.Assert.assertNull(iConnectionCustomizer43);
        org.junit.Assert.assertNull(iConnectionCustomizer46);
    }

    @Test
    public void test20585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20585");
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
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties28);
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
    public void test20586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20586");
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
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str16 = hikariConfig1.getPoolName();
        hikariConfig1.isRegisterMbeans = false;
        int int19 = hikariConfig1.acquireRetries;
        hikariConfig1.setDataSourceClassName("");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-55175" + "'", str16, "HikariPool-55175");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test20587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20587");
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
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        java.lang.String str18 = hikariConfig17.getDataSourceClassName();
        hikariConfig17.setTransactionIsolation("hi!");
        hikariConfig17.acquireRetryDelay = '4';
        hikariConfig17.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties25 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.jdbcUrl = "HikariPool-281";
        hikariConfig26.idleTimeout = (short) 0;
        int int31 = hikariConfig26.maxPoolSize;
        java.util.Properties properties32 = hikariConfig26.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties32);
        hikariConfig1.isReadOnly = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-55176" + "'", str15, "HikariPool-55176");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test20588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20588");
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
        java.util.Properties properties16 = hikariConfig10.dataSourceProperties;
        hikariConfig10.setTransactionIsolation("HikariPool-244");
        java.lang.String str19 = hikariConfig10.getCatalog();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        long long22 = hikariConfig21.getAcquireRetryDelay();
        hikariConfig21.connectionInitSql = "hi!";
        hikariConfig21.acquireIncrement = (byte) 100;
        hikariConfig21.setMinimumPoolSize((int) (short) 0);
        hikariConfig21.connectionTestQuery = "";
        hikariConfig21.jdbcUrl = "HikariPool-45";
        hikariConfig21.dataSourceClassName = "hi!";
        hikariConfig21.setIdleTimeout((long) (short) 100);
        hikariConfig21.setAcquireRetryDelay((long) (byte) 1);
        int int39 = hikariConfig21.getMaximumPoolSize();
        boolean boolean40 = hikariConfig21.isRegisterMbeans;
        javax.sql.DataSource dataSource41 = null;
        hikariConfig21.setDataSource(dataSource41);
        java.util.Properties properties43 = hikariConfig21.dataSourceProperties;
        hikariConfig10.dataSourceProperties = properties43;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties43);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test20589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20589");
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
        hikariConfig1.setJdbcUrl("HikariPool-400");
        long long20 = hikariConfig1.leakDetectionThreshold;
        int int21 = hikariConfig1.maxPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = hikariConfig1.connectionCustomizer;
        int int23 = hikariConfig1.maxPoolSize;
        hikariConfig1.idleTimeout = 35;
        hikariConfig1.setCatalog("HikariPool-288");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = hikariConfig1.connectionCustomizer;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer28);
    }

    @Test
    public void test20590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20590");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setReadOnly(false);
        java.lang.String str8 = hikariConfig1.getCatalog();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setCatalog("HikariPool-127");
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        hikariConfig1.transactionIsolation = (short) 10;
        hikariConfig1.isInitializationFailFast = false;
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20591");
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
        boolean boolean15 = hikariConfig1.isReadOnly();
        hikariConfig1.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource18 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-495" + "'", str14, "HikariPool-495");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test20592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20592");
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
        hikariConfig1.jdbcUrl = "";
        hikariConfig1.acquireRetries = 0;
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
    }

    @Test
    public void test20593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20593");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout(2147483647L);
        hikariConfig1.setReadOnly(false);
        java.lang.String str10 = hikariConfig1.poolName;
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.acquireRetries = ' ';
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.connectionInitSql = "hi!";
        hikariConfig17.acquireIncrement = (byte) 100;
        hikariConfig17.setMinimumPoolSize((int) (short) 0);
        java.lang.String str25 = hikariConfig17.dataSourceClassName;
        long long26 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.setConnectionTestQuery("HikariPool-114");
        long long29 = hikariConfig17.getMaxLifetime();
        boolean boolean30 = hikariConfig17.isIsolateInternalQueries();
        hikariConfig17.acquireRetries = 0;
        boolean boolean33 = hikariConfig17.isReadOnly();
        boolean boolean34 = hikariConfig17.isReadOnly;
        int int35 = hikariConfig17.getMaximumPoolSize();
        java.util.Properties properties36 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties36);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int39 = hikariConfig38.maxPoolSize;
        hikariConfig38.setCatalog("HikariPool-727");
        boolean boolean42 = hikariConfig38.isReadOnly();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-55187" + "'", str10, "HikariPool-55187");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(str25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test20594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20594");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.maxPoolSize = (byte) 0;
        java.util.Properties properties23 = hikariConfig20.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig1.setDataSourceProperties(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean29 = hikariConfig28.isReadOnly();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-55191" + "'", str17, "HikariPool-55191");
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test20595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20595");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean5 = hikariConfig1.isReadOnly();
        hikariConfig1.isAutoCommit = true;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        int int10 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test20596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20596");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (byte) -1;
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setAcquireIncrement((int) 'a');
        long long16 = hikariConfig1.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test20597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20597");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long19 = hikariConfig1.getMaxLifetime();
        int int20 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 3;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test20598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20598");
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
        java.lang.String str15 = hikariConfig10.connectionInitSql;
        hikariConfig10.catalog = "HikariPool-15800";
        java.util.Properties properties18 = hikariConfig10.dataSourceProperties;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test20599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20599");
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
        long long13 = hikariConfig1.getMaxLifetime();
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-9236";
        long long17 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str18 = hikariConfig1.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20600");
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
        hikariConfig1.setIdleTimeout((long) 'a');
        int int62 = hikariConfig1.minPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-55211" + "'", str40, "HikariPool-55211");
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertNull(str50);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test20601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20601");
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
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test20602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20602");
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
        java.util.Properties properties15 = hikariConfig1.dataSourceProperties;
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test20603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20603");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20604");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.acquireRetries = '#';
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isAutoCommit = true;
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        int int12 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.transactionIsolationName = "HikariPool-14671";
        hikariConfig1.setLeakDetectionThreshold((long) 358);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test20605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20605");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        hikariConfig1.maxPoolSize = (short) 10;
        java.lang.String str13 = hikariConfig1.getPoolName();
        int int14 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-55218" + "'", str13, "HikariPool-55218");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test20606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20606");
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
        java.lang.String str14 = hikariConfig1.catalog;
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        java.lang.String str20 = hikariConfig19.getDataSourceClassName();
        hikariConfig19.setTransactionIsolation("hi!");
        hikariConfig19.acquireRetryDelay = '4';
        hikariConfig19.setConnectionTimeout((long) (short) 0);
        boolean boolean27 = hikariConfig19.isRegisterMbeans();
        int int28 = hikariConfig19.acquireRetries;
        boolean boolean29 = hikariConfig19.isIsolateInternalQueries();
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig19);
        int int31 = hikariConfig19.acquireRetries;
        java.lang.String str32 = hikariConfig19.getDataSourceClassName();
        hikariConfig19.acquireRetryDelay = 358;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = hikariConfig19.connectionCustomizer;
        int int36 = hikariConfig19.minPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(iConnectionCustomizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
    }

    @Test
    public void test20607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20607");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries;
        int int7 = hikariConfig1.maxPoolSize;
        int int8 = hikariConfig1.acquireRetries;
        hikariConfig1.maxLifetime = (short) 10;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test20608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20608");
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
        int int21 = hikariConfig1.transactionIsolation;
        java.lang.String str22 = hikariConfig1.getConnectionCustomizerClassName();
        long long23 = hikariConfig1.getAcquireRetryDelay();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
    }

    @Test
    public void test20609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20609");
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
        int int16 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.dataSourceClassName = "HikariPool-182";
        hikariConfig1.setIdleTimeout((long) (short) 0);
        hikariConfig1.setJdbcUrl("HikariPool-35433");
        hikariConfig1.acquireRetries = (short) 100;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test20610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20610");
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
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties14);
        long long20 = hikariConfig19.getIdleTimeout();
        java.lang.String str21 = hikariConfig19.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20611");
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
        hikariConfig1.isAutoCommit = false;
        java.lang.String str25 = hikariConfig1.transactionIsolationName;
        boolean boolean26 = hikariConfig1.isJdbc4ConnectionTest();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test20612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20612");
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
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        long long15 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setDataSourceClassName("HikariPool-18604");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test20613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20613");
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
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.minPoolSize = 52;
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setMaxLifetime(1L);
        hikariConfig1.acquireRetries = 358;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test20614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20614");
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
        int int13 = hikariConfig10.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig10.connectionCustomizer = iConnectionCustomizer14;
        boolean boolean16 = hikariConfig10.isIsolateInternalQueries;
        hikariConfig10.setLeakDetectionThreshold(60L);
        hikariConfig10.setJdbcUrl("HikariPool-1779");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20615");
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
        hikariConfig1.jdbcUrl = "HikariPool-5237";
        hikariConfig1.setReadOnly(false);
        java.lang.String str25 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test20616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20616");
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
        hikariConfig1.transactionIsolation = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = hikariConfig1.connectionCustomizer;
        hikariConfig1.acquireIncrement = '4';
        boolean boolean34 = hikariConfig1.isIsolateInternalQueries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(iConnectionCustomizer31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test20617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20617");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-47540");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-47540 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20618");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-77");
        boolean boolean10 = hikariConfig1.isReadOnly;
        int int11 = hikariConfig1.getMinimumPoolSize();
        int int12 = hikariConfig1.minPoolSize;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test20619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20619");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        hikariConfig1.setMaxLifetime((long) 97);
        hikariConfig1.acquireRetries = 0;
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        long long16 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test20620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20620");
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
        java.lang.String str18 = hikariConfig10.getPoolName();
        hikariConfig10.setConnectionCustomizerClassName("HikariPool-499");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig10.setDriverClassName("HikariPool-13121");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-13121' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-55250" + "'", str18, "HikariPool-55250");
    }

    @Test
    public void test20621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20621");
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
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int17 = hikariConfig1.getTransactionIsolation();
        long long18 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test20622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20622");
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
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20623");
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
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
        java.lang.String str15 = hikariConfig1.connectionCustomizerClassName;
        long long16 = hikariConfig1.connectionTimeout;
        hikariConfig1.isJdbc4connectionTest = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test20624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20624");
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
        int int26 = hikariConfig25.getMinimumPoolSize();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test20625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20625");
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
        long long26 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test20626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20626");
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
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2884");
        boolean boolean23 = hikariConfig1.isReadOnly;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45" + "'", str17, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20627");
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
        long long17 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str18 = hikariConfig1.poolName;
        int int19 = hikariConfig1.getMaximumPoolSize();
        boolean boolean20 = hikariConfig1.isAutoCommit;
        java.lang.String str21 = hikariConfig1.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-8379");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-8379' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-55263" + "'", str18, "HikariPool-55263");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20628");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-81");
        java.lang.String str21 = hikariConfig1.getPoolName();
        hikariConfig1.setDataSourceClassName("HikariPool-132");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setPoolName("HikariPool-47877");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-55264" + "'", str21, "HikariPool-55264");
    }

    @Test
    public void test20629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20629");
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
        hikariConfig1.isReadOnly = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-55265" + "'", str17, "HikariPool-55265");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20630");
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
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        long long17 = hikariConfig1.maxLifetime;
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setTransactionIsolation("HikariPool-3060");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test20631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20631");
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
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.maxPoolSize = '4';
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        long long24 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig23.idleTimeout = (-1);
        hikariConfig23.setMaximumPoolSize((int) 'a');
        java.lang.String str29 = hikariConfig23.catalog;
        boolean boolean30 = hikariConfig23.isJdbc4ConnectionTest();
        boolean boolean31 = hikariConfig23.isInitializationFailFast();
        boolean boolean32 = hikariConfig23.isInitializationFailFast();
        java.lang.String str33 = hikariConfig23.getConnectionCustomizerClassName();
        java.util.Properties properties34 = hikariConfig23.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties34);
        boolean boolean38 = hikariConfig37.isInitializationFailFast();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test20632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20632");
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
        boolean boolean28 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setReadOnly(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test20633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20633");
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
        hikariConfig1.setConnectionInitSql("HikariPool-56");
        java.lang.String str22 = hikariConfig1.connectionInitSql;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer23;
        javax.sql.DataSource dataSource25 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-56" + "'", str22, "HikariPool-56");
        org.junit.Assert.assertNull(dataSource25);
    }

    @Test
    public void test20634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20634");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        long long5 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3L + "'", long5 == 3L);
    }

    @Test
    public void test20635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20635");
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
        hikariConfig1.setConnectionInitSql("HikariPool-56");
        java.lang.String str22 = hikariConfig1.connectionInitSql;
        boolean boolean23 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setIdleTimeout((long) (-1));
        long long26 = hikariConfig1.getAcquireRetryDelay();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-56" + "'", str22, "HikariPool-56");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
    }

    @Test
    public void test20636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20636");
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
        hikariConfig30.setIsolateInternalQueries(true);
        hikariConfig30.acquireRetries = (byte) -1;
        boolean boolean35 = hikariConfig30.isIsolateInternalQueries;
        boolean boolean36 = hikariConfig30.isRegisterMbeans();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test20637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20637");
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
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        java.lang.Class<?> wildcardClass21 = properties19.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test20638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20638");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        hikariConfig1.setJdbcUrl("HikariPool-2456");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig1.connectionCustomizer;
        int int13 = hikariConfig1.acquireRetries;
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.maxLifetime = (short) 0;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test20639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20639");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.isInitializationFailFast = false;
        boolean boolean5 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.connectionTimeout = 0L;
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = 358;
        java.lang.String str11 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20640");
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
        hikariConfig1.setCatalog("HikariPool-632");
        hikariConfig1.setJdbcUrl("HikariPool-1236");
        hikariConfig1.setLeakDetectionThreshold(60L);
        java.lang.String str22 = hikariConfig1.transactionIsolationName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20641");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.acquireRetryDelay = 750L;
        int int12 = hikariConfig1.maxPoolSize;
        hikariConfig1.setIsolateInternalQueries(true);
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test20642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20642");
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
        long long18 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.catalog = "HikariPool-557";
        hikariConfig1.setConnectionInitSql("HikariPool-841");
        int int23 = hikariConfig1.acquireIncrement;
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str26 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test20643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20643");
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
        hikariConfig1.poolName = "HikariPool-35325";
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55287" + "'", str9, "HikariPool-55287");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20644");
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
        hikariConfig1.setMaxLifetime(1800000L);
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.isIsolateInternalQueries = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20645");
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
        hikariConfig1.setIdleTimeout((long) 35);
        int int29 = hikariConfig1.maxPoolSize;
        javax.sql.DataSource dataSource30 = hikariConfig1.dataSource;
        long long31 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35L + "'", long31 == 35L);
    }

    @Test
    public void test20646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20646");
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
        hikariConfig1.setTransactionIsolation("HikariPool-19959");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20647");
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
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties16);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test20648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20648");
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
        hikariConfig1.isJdbc4connectionTest = true;
        boolean boolean24 = hikariConfig1.isInitializationFailFast;
        java.lang.String str25 = hikariConfig1.getPoolName();
        hikariConfig1.setMaxLifetime((long) (-1));
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-55302" + "'", str25, "HikariPool-55302");
    }

    @Test
    public void test20649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20649");
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
        long long19 = hikariConfig1.getIdleTimeout();
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setIdleTimeout(52L);
        int int23 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55304" + "'", str9, "HikariPool-55304");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-55304" + "'", str13, "HikariPool-55304");
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test20650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20650");
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
        int int21 = hikariConfig14.maxPoolSize;
        javax.sql.DataSource dataSource22 = null;
        hikariConfig14.setDataSource(dataSource22);
        javax.sql.DataSource dataSource24 = null;
        hikariConfig14.setDataSource(dataSource24);
        javax.sql.DataSource dataSource26 = hikariConfig14.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNull(dataSource26);
    }

    @Test
    public void test20651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20651");
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
        long long18 = hikariConfig1.idleTimeout;
        java.lang.String str19 = hikariConfig1.transactionIsolationName;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1192";
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.leakDetectionThreshold = 0L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20652");
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
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        long long14 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbcUrl("HikariPool-29082");
        java.lang.String str17 = hikariConfig1.getJdbcUrl();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-29082" + "'", str17, "HikariPool-29082");
    }

    @Test
    public void test20653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20653");
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
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        hikariConfig1.acquireRetries = (short) 0;
        boolean boolean16 = hikariConfig1.isIsolateInternalQueries();
        int int17 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test20654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20654");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolation = (byte) 10;
        long long8 = hikariConfig1.acquireRetryDelay;
        boolean boolean9 = hikariConfig1.isReadOnly();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test20655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20655");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.connectionCustomizerClassName = "HikariPool-90";
        hikariConfig1.isInitializationFailFast = false;
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test20656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20656");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.acquireIncrement = '#';
        int int8 = hikariConfig5.maxPoolSize;
        java.lang.String str9 = hikariConfig5.connectionInitSql;
        java.lang.String str10 = hikariConfig5.getConnectionInitSql();
        java.lang.String str11 = hikariConfig5.poolName;
        hikariConfig5.poolName = "HikariPool-18341";
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-55313" + "'", str11, "HikariPool-55313");
    }

    @Test
    public void test20657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20657");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.connectionTimeout = ' ';
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean14 = hikariConfig13.isReadOnly;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20658");
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
        boolean boolean22 = hikariConfig1.isInitializationFailFast;
        int int23 = hikariConfig1.getMinimumPoolSize();
        boolean boolean24 = hikariConfig1.isAutoCommit();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test20659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20659");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        java.lang.String str6 = hikariConfig1.jdbcUrl;
        hikariConfig1.maxPoolSize = 358;
        hikariConfig1.poolName = "HikariPool-268";
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        hikariConfig1.acquireRetries = (byte) 100;
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.transactionIsolation = 60;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test20660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20660");
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
        java.lang.String str21 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str22 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2147483647L + "'", long15 == 2147483647L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20661");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test20662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20662");
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
        java.util.Properties properties26 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties26);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test20663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20663");
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
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        java.lang.String str18 = hikariConfig1.poolName;
        int int19 = hikariConfig1.getTransactionIsolation();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-55330" + "'", str18, "HikariPool-55330");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test20664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20664");
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
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean21 = hikariConfig1.isInitializationFailFast;
        long long22 = hikariConfig1.acquireRetryDelay;
        int int23 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource24 = null;
        hikariConfig1.dataSource = dataSource24;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test20665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20665");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        long long11 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        hikariConfig1.isInitializationFailFast = true;
        int int15 = hikariConfig1.acquireRetries;
        boolean boolean16 = hikariConfig1.isRegisterMbeans;
        boolean boolean17 = hikariConfig1.isReadOnly();
        hikariConfig1.setReadOnly(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20666");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        int int5 = hikariConfig1.transactionIsolation;
        hikariConfig1.minPoolSize = (short) 10;
        int int8 = hikariConfig1.getAcquireRetries();
        int int9 = hikariConfig1.acquireIncrement;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test20667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20667");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        int int4 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.minPoolSize = '#';
        hikariConfig1.setLeakDetectionThreshold(5000L);
        int int9 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.lang.String str12 = hikariConfig11.getDataSourceClassName();
        hikariConfig11.setTransactionIsolation("hi!");
        hikariConfig11.acquireRetryDelay = '4';
        hikariConfig11.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties19 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.leakDetectionThreshold = 0L;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.idleTimeout = (-1);
        hikariConfig24.setMaximumPoolSize((int) 'a');
        long long30 = hikariConfig24.acquireRetryDelay;
        long long31 = hikariConfig24.leakDetectionThreshold;
        javax.sql.DataSource dataSource32 = hikariConfig24.getDataSource();
        hikariConfig24.connectionTestQuery = "HikariPool-273";
        int int35 = hikariConfig24.getTransactionIsolation();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        long long38 = hikariConfig37.getAcquireRetryDelay();
        hikariConfig37.idleTimeout = (-1);
        java.util.Properties properties41 = hikariConfig37.getDataSourceProperties();
        hikariConfig24.dataSourceProperties = properties41;
        hikariConfig20.setDataSourceProperties(properties41);
        hikariConfig1.dataSourceProperties = properties41;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig45.setUseInstrumentation(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties19);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test20668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20668");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.poolName = "HikariPool-90";
        hikariConfig1.setJdbcUrl("HikariPool-12291");
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55340" + "'", str9, "HikariPool-55340");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20669");
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
        hikariConfig17.catalog = "HikariPool-400";
        long long20 = hikariConfig17.leakDetectionThreshold;
        hikariConfig17.maxPoolSize = 10;
        boolean boolean23 = hikariConfig17.isInitializationFailFast;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig17.connectionCustomizer;
        long long25 = hikariConfig17.idleTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1800000L + "'", long25 == 1800000L);
    }

    @Test
    public void test20670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20670");
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
        long long19 = hikariConfig1.getIdleTimeout();
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries;
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
        int int22 = hikariConfig1.minPoolSize;
        hikariConfig1.setDataSourceClassName("HikariPool-2062");
        boolean boolean25 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setMinimumPoolSize(97);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55343" + "'", str9, "HikariPool-55343");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-55343" + "'", str13, "HikariPool-55343");
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test20671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20671");
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
        boolean boolean23 = hikariConfig1.isAutoCommit;
        java.lang.String str24 = hikariConfig1.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test20672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20672");
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
        javax.sql.DataSource dataSource50 = hikariConfig1.dataSource;
        javax.sql.DataSource dataSource51 = hikariConfig1.dataSource;
        hikariConfig1.transactionIsolation = (byte) 10;
        int int54 = hikariConfig1.maxPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNotNull(properties24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 97L + "'", long25 == 97L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertNull(str40);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "HikariPool-117" + "'", str48, "HikariPool-117");
        org.junit.Assert.assertNull(dataSource49);
        org.junit.Assert.assertNull(dataSource50);
        org.junit.Assert.assertNull(dataSource51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 60 + "'", int54 == 60);
    }

    @Test
    public void test20673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20673");
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
        hikariConfig10.setConnectionTestQuery("HikariPool-212");
        hikariConfig10.connectionTestQuery = "HikariPool-37";
        boolean boolean20 = hikariConfig10.isIsolateInternalQueries;
        long long21 = hikariConfig10.leakDetectionThreshold;
        java.lang.String str22 = hikariConfig10.getConnectionInitSql();
        int int23 = hikariConfig10.getMaximumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test20674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20674");
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
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setDataSourceClassName("HikariPool-134");
        hikariConfig1.acquireRetryDelay = (byte) 10;
        boolean boolean20 = hikariConfig1.isRegisterMbeans();
        java.lang.String str21 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-134" + "'", str21, "HikariPool-134");
    }

    @Test
    public void test20675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20675");
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
        int int17 = hikariConfig1.maxPoolSize;
        hikariConfig1.setRegisterMbeans(true);
        long long20 = hikariConfig1.connectionTimeout;
        boolean boolean21 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("HikariPool-3788");
        hikariConfig1.setAutoCommit(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test20676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20676");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test20677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20677");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-32955");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-32955 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20678");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-44500");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-44500 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20679");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setUseInstrumentation(true);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long15 = hikariConfig14.getAcquireRetryDelay();
        hikariConfig14.idleTimeout = (-1);
        java.util.Properties properties18 = hikariConfig14.getDataSourceProperties();
        long long19 = hikariConfig14.maxLifetime;
        hikariConfig14.setLeakDetectionThreshold(750L);
        int int22 = hikariConfig14.getMinimumPoolSize();
        hikariConfig14.acquireRetries = 'a';
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
        hikariConfig14.dataSourceProperties = properties38;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig1.dataSourceProperties = properties38;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties38);
        java.util.Properties properties44 = hikariConfig43.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        java.lang.String str48 = hikariConfig47.getDataSourceClassName();
        hikariConfig47.setTransactionIsolation("hi!");
        hikariConfig47.acquireRetryDelay = '4';
        hikariConfig47.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties55 = hikariConfig47.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig45.dataSourceProperties = properties55;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties55);
        long long60 = hikariConfig59.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties55);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + 3L + "'", long60 == 3L);
    }

    @Test
    public void test20680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20680");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getAcquireIncrement();
        hikariConfig5.setMinimumPoolSize((int) (short) 100);
        hikariConfig5.jdbcUrl = "HikariPool-28925";
        int int11 = hikariConfig5.minPoolSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test20681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20681");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-37528");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-37528 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20682");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxPoolSize = (byte) 100;
        hikariConfig1.poolName = "HikariPool-1203";
        boolean boolean12 = hikariConfig1.isReadOnly();
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test20683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20683");
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
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.isInitializationFailFast = false;
        long long21 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
    }

    @Test
    public void test20684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20684");
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
        int int20 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties21 = hikariConfig1.dataSourceProperties;
        boolean boolean22 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-55374" + "'", str17, "HikariPool-55374");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test20685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20685");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        hikariConfig1.isInitializationFailFast = false;
        java.util.Properties properties6 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test20686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20686");
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
        long long19 = hikariConfig14.maxLifetime;
        int int20 = hikariConfig14.maxPoolSize;
        hikariConfig14.dataSourceClassName = "HikariPool-2993";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test20687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20687");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-1362");
        int int26 = hikariConfig1.getMaximumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
    }

    @Test
    public void test20688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20688");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        java.lang.String str6 = hikariConfig5.transactionIsolationName;
        hikariConfig5.setInitializationFailFast(true);
        hikariConfig5.setAcquireRetries(1);
        hikariConfig5.setConnectionCustomizerClassName("HikariPool-320");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test20689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20689");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.connectionTestQuery = "HikariPool-921";
        int int18 = hikariConfig15.acquireRetries;
        hikariConfig15.isAutoCommit = false;
        hikariConfig15.setTransactionIsolation("HikariPool-40234");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test20690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20690");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        int int5 = hikariConfig1.acquireIncrement;
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.connectionTestQuery = "HikariPool-1465";
        int int9 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test20691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20691");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-223");
        hikariConfig1.maxPoolSize = (byte) -1;
        hikariConfig1.setJdbcUrl("HikariPool-19180");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test20692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20692");
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
        long long14 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str15 = hikariConfig1.jdbcUrl;
        hikariConfig1.setIdleTimeout(52L);
        hikariConfig1.acquireRetries = (byte) 100;
        java.lang.String str20 = hikariConfig1.getCatalog();
        hikariConfig1.isAutoCommit = true;
        long long23 = hikariConfig1.connectionTimeout;
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean26 = hikariConfig1.isAutoCommit;
        hikariConfig1.maxLifetime = (byte) 0;
        long long29 = hikariConfig1.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3L + "'", long23 == 3L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test20693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20693");
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
        boolean boolean15 = hikariConfig10.isAutoCommit;
        hikariConfig10.connectionTestQuery = "HikariPool-152";
        hikariConfig10.setCatalog("HikariPool-223");
        hikariConfig10.isAutoCommit = true;
        hikariConfig10.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20694");
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
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        int int21 = hikariConfig1.acquireIncrement;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-45");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45" + "'", str17, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test20695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20695");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str6 = hikariConfig1.transactionIsolationName;
        long long7 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.connectionTimeout = 97;
        boolean boolean10 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test20696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20696");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        java.lang.String str5 = hikariConfig1.getCatalog();
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        boolean boolean7 = hikariConfig1.isReadOnly();
        java.util.Properties properties8 = null;
        hikariConfig1.dataSourceProperties = properties8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test20697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20697");
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
        java.util.Properties properties31 = hikariConfig30.dataSourceProperties;
        boolean boolean32 = hikariConfig30.isInitializationFailFast();
        hikariConfig30.connectionCustomizerClassName = "HikariPool-133";
        hikariConfig30.setConnectionTimeout((long) (byte) 100);
        hikariConfig30.setAcquireRetryDelay((long) 3);
        hikariConfig30.setJdbc4ConnectionTest(true);
        hikariConfig30.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test20698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20698");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        long long11 = hikariConfig1.leakDetectionThreshold;
        boolean boolean12 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.setIsolateInternalQueries(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20699");
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
        hikariConfig1.acquireRetryDelay = '4';
        int int31 = hikariConfig1.transactionIsolation;
        hikariConfig1.acquireIncrement = '#';
        javax.sql.DataSource dataSource34 = hikariConfig1.getDataSource();
        long long35 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(dataSource34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 97L + "'", long35 == 97L);
    }

    @Test
    public void test20700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20700");
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
        int int19 = hikariConfig16.getMinimumPoolSize();
        hikariConfig16.setJdbcUrl("HikariPool-51331");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test20701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20701");
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
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.connectionInitSql = "hi!";
        hikariConfig22.acquireIncrement = (byte) 100;
        hikariConfig22.setMinimumPoolSize((int) (short) 0);
        java.lang.String str30 = hikariConfig22.dataSourceClassName;
        long long31 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.setConnectionTestQuery("HikariPool-114");
        long long34 = hikariConfig22.getMaxLifetime();
        boolean boolean35 = hikariConfig22.isIsolateInternalQueries();
        hikariConfig22.acquireRetries = 0;
        java.util.Properties properties38 = hikariConfig22.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties38);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer40 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer40;
        hikariConfig1.dataSourceClassName = "HikariPool-891";
        hikariConfig1.isReadOnly = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNull(str30);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 97L + "'", long34 == 97L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(properties38);
    }

    @Test
    public void test20702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20702");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        long long13 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setMinimumPoolSize(35);
        int int16 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.transactionIsolationName = "HikariPool-19669";
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55417" + "'", str9, "HikariPool-55417");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test20703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20703");
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
        hikariConfig1.setAcquireIncrement(60);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig18.setDataSource(dataSource20);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig18.connectionCustomizer = iConnectionCustomizer22;
        boolean boolean24 = hikariConfig18.isInitializationFailFast;
        int int25 = hikariConfig18.maxPoolSize;
        hikariConfig18.setPoolName("HikariPool-349");
        hikariConfig18.setDataSourceClassName("HikariPool-353");
        hikariConfig1.addDataSourceProperty("HikariPool-3699", (java.lang.Object) hikariConfig18);
        java.lang.String str31 = hikariConfig1.getConnectionInitSql();
        long long32 = hikariConfig1.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-55418" + "'", str11, "HikariPool-55418");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3L + "'", long32 == 3L);
    }

    @Test
    public void test20704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20704");
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
        long long16 = hikariConfig1.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test20705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20705");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setAcquireRetryDelay(60L);
        hikariConfig1.setTransactionIsolation("HikariPool-1057");
        hikariConfig1.setConnectionInitSql("HikariPool-42464");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test20706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20706");
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
        long long18 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test20707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20707");
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
        javax.sql.DataSource dataSource14 = null;
        hikariConfig10.dataSource = dataSource14;
        javax.sql.DataSource dataSource16 = hikariConfig10.getDataSource();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test20708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20708");
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
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str19 = hikariConfig1.getJdbcUrl();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test20709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20709");
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
        hikariConfig1.connectionInitSql = "HikariPool-19274";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test20710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20710");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        long long11 = hikariConfig1.getMaxLifetime();
        long long12 = hikariConfig1.getConnectionTimeout();
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.poolName = "HikariPool-488";
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setCatalog("HikariPool-6777");
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test20711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20711");
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
        int int15 = hikariConfig1.acquireRetries;
        java.lang.String str16 = hikariConfig1.transactionIsolationName;
        hikariConfig1.jdbcUrl = "HikariPool-167";
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        long long20 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
    }

    @Test
    public void test20712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20712");
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
        int int30 = hikariConfig1.acquireRetries;
        long long31 = hikariConfig1.acquireRetryDelay;
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        long long34 = hikariConfig33.getAcquireRetryDelay();
        hikariConfig33.connectionInitSql = "hi!";
        hikariConfig33.setTransactionIsolation("hi!");
        hikariConfig33.isInitializationFailFast = true;
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        long long43 = hikariConfig42.getAcquireRetryDelay();
        hikariConfig42.connectionInitSql = "hi!";
        hikariConfig42.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig42.transactionIsolation = (byte) 0;
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        long long52 = hikariConfig51.getAcquireRetryDelay();
        hikariConfig51.idleTimeout = (-1);
        java.util.Properties properties55 = hikariConfig51.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig42.setDataSourceProperties(properties55);
        hikariConfig33.setDataSourceProperties(properties55);
        hikariConfig1.dataSourceProperties = properties55;
        java.lang.String str62 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + 32L + "'", long52 == 32L);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test20713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20713");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        int int5 = hikariConfig1.acquireIncrement;
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        java.util.Properties properties7 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.connectionTestQuery = "HikariPool-2408";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test20714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20714");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        java.lang.String str6 = hikariConfig1.jdbcUrl;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.acquireIncrement = 358;
        hikariConfig1.setConnectionTestQuery("HikariPool-262");
        hikariConfig1.setLeakDetectionThreshold(750L);
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setTransactionIsolation("HikariPool-1602");
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20715");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionTestQuery("HikariPool-114");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setAcquireRetryDelay(35L);
        boolean boolean16 = hikariConfig1.isAutoCommit();
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20716");
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
        long long18 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test20717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20717");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIdleTimeout(0L);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        java.lang.String str9 = hikariConfig8.getDataSourceClassName();
        hikariConfig8.setTransactionIsolation("hi!");
        hikariConfig8.acquireRetryDelay = '4';
        hikariConfig8.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties16 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig1.setDataSourceProperties(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties16);
        javax.sql.DataSource dataSource24 = hikariConfig23.dataSource;
        java.lang.String str25 = hikariConfig23.getJdbcUrl();
        hikariConfig23.poolName = "HikariPool-19823";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test20718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20718");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.acquireIncrement = '#';
        int int8 = hikariConfig5.maxPoolSize;
        java.lang.String str9 = hikariConfig5.connectionInitSql;
        boolean boolean10 = hikariConfig5.isRegisterMbeans();
        boolean boolean11 = hikariConfig5.isIsolateInternalQueries();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str14 = hikariConfig13.getDataSourceClassName();
        hikariConfig13.setTransactionIsolation("hi!");
        hikariConfig13.acquireRetryDelay = '4';
        hikariConfig13.setConnectionCustomizerClassName("");
        java.lang.String str21 = hikariConfig13.getPoolName();
        long long22 = hikariConfig13.getLeakDetectionThreshold();
        hikariConfig13.transactionIsolationName = "HikariPool-55";
        java.lang.String str25 = hikariConfig13.getPoolName();
        java.lang.String str26 = hikariConfig13.connectionInitSql;
        boolean boolean27 = hikariConfig13.isRegisterMbeans;
        hikariConfig13.maxLifetime = (byte) 0;
        hikariConfig13.setPoolName("HikariPool-1157");
        java.util.Properties properties32 = hikariConfig13.getDataSourceProperties();
        hikariConfig5.setDataSourceProperties(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig34.connectionTestQuery = "HikariPool-1804";
        boolean boolean37 = hikariConfig34.isJdbc4ConnectionTest();
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-55464" + "'", str21, "HikariPool-55464");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-55464" + "'", str25, "HikariPool-55464");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test20719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20719");
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
        long long16 = hikariConfig1.getMaxLifetime();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer17;
        hikariConfig1.minPoolSize = 0;
        java.lang.String str21 = hikariConfig1.poolName;
        hikariConfig1.maxPoolSize = (byte) 1;
        hikariConfig1.connectionTestQuery = "HikariPool-18419";
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.lang.String str28 = hikariConfig27.getDataSourceClassName();
        int int29 = hikariConfig27.getAcquireRetries();
        int int30 = hikariConfig27.getAcquireIncrement();
        java.lang.String str31 = hikariConfig27.getConnectionCustomizerClassName();
        hikariConfig27.setRegisterMbeans(true);
        long long34 = hikariConfig27.connectionTimeout;
        long long35 = hikariConfig27.idleTimeout;
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        java.lang.String str38 = hikariConfig37.getDataSourceClassName();
        hikariConfig37.setTransactionIsolation("hi!");
        hikariConfig37.acquireRetryDelay = '4';
        hikariConfig37.setConnectionTimeout((long) (short) 0);
        hikariConfig37.setConnectionTestQuery("HikariPool-45");
        java.lang.String str47 = hikariConfig37.getConnectionTestQuery();
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        long long50 = hikariConfig49.getAcquireRetryDelay();
        hikariConfig49.connectionInitSql = "hi!";
        hikariConfig49.acquireIncrement = (byte) 100;
        hikariConfig49.setMinimumPoolSize((int) (short) 0);
        hikariConfig49.connectionTestQuery = "";
        hikariConfig49.jdbcUrl = "HikariPool-45";
        hikariConfig49.isReadOnly = false;
        hikariConfig49.setPoolName("");
        java.lang.String str65 = hikariConfig49.getConnectionTestQuery();
        java.util.Properties properties66 = hikariConfig49.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties66);
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties66);
        hikariConfig37.setDataSourceProperties(properties66);
        hikariConfig27.dataSourceProperties = properties66;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties66);
        hikariConfig1.dataSourceProperties = properties66;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-55466" + "'", str21, "HikariPool-55466");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(str31);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3L + "'", long34 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1800000L + "'", long35 == 1800000L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "HikariPool-45" + "'", str47, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 32L + "'", long50 == 32L);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(properties66);
    }

    @Test
    public void test20720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20720");
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
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.maxPoolSize = (byte) 0;
        java.util.Properties properties19 = hikariConfig16.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig1.setDataSourceProperties(properties19);
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        int int26 = hikariConfig1.acquireIncrement;
        hikariConfig1.idleTimeout = 600000L;
        hikariConfig1.leakDetectionThreshold = 100L;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = hikariConfig1.connectionCustomizer;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(iConnectionCustomizer31);
    }

    @Test
    public void test20721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20721");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.connectionTimeout = ' ';
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        hikariConfig1.jdbcUrl = "HikariPool-353";
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test20722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20722");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.connectionTimeout = ' ';
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxLifetime = (short) 100;
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
        java.lang.String str17 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setRegisterMbeans(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20723");
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
        hikariConfig1.setReadOnly(false);
        boolean boolean28 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(false);
        javax.sql.DataSource dataSource31 = null;
        hikariConfig1.dataSource = dataSource31;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55480" + "'", str9, "HikariPool-55480");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-55480" + "'", str13, "HikariPool-55480");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test20724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20724");
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
        hikariConfig1.maxPoolSize = (short) -1;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.idleTimeout = (-1);
        java.util.Properties properties26 = hikariConfig22.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties26;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        int int29 = hikariConfig28.getMinimumPoolSize();
        int int30 = hikariConfig28.getAcquireRetries();
        java.util.Properties properties31 = hikariConfig28.dataSourceProperties;
        boolean boolean32 = hikariConfig28.isRegisterMbeans;
        java.lang.String str33 = hikariConfig28.connectionInitSql;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test20725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20725");
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
        java.lang.String str27 = hikariConfig1.transactionIsolationName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(52L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-55485" + "'", str17, "HikariPool-55485");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test20726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20726");
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
        int int16 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.isRegisterMbeans = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test20727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20727");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setCatalog("hi!");
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        long long15 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2072");
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20728");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.setAutoCommit(true);
        long long6 = hikariConfig1.getConnectionTimeout();
        long long7 = hikariConfig1.acquireRetryDelay;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test20729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20729");
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
        java.lang.String str20 = hikariConfig1.connectionTestQuery;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20730");
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
        hikariConfig1.transactionIsolation = (short) 10;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int16 = hikariConfig1.getMinimumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test20731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20731");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setUseInstrumentation(true);
        long long8 = hikariConfig1.getIdleTimeout();
        hikariConfig1.isIsolateInternalQueries = false;
        int int11 = hikariConfig1.getAcquireRetries();
        long long12 = hikariConfig1.idleTimeout;
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test20732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20732");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-55");
        hikariConfig1.acquireIncrement = 10;
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        int int17 = hikariConfig1.getMinimumPoolSize();
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test20733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20733");
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
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483647L + "'", long20 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-45" + "'", str25, "HikariPool-45");
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test20734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20734");
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
        int int18 = hikariConfig1.getAcquireRetries();
        java.lang.String str19 = hikariConfig1.getCatalog();
        java.lang.String str20 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55497" + "'", str9, "HikariPool-55497");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20735");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (byte) -1;
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setTransactionIsolation("HikariPool-1061");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test20736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20736");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-77");
        hikariConfig1.setInitializationFailFast(true);
        long long12 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setAcquireIncrement((int) '4');
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.idleTimeout = (byte) 1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test20737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20737");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        long long7 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-119");
        hikariConfig1.isAutoCommit = false;
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setAcquireRetries(52);
        java.lang.String str15 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setJdbcUrl("HikariPool-28718");
        hikariConfig1.setJdbcUrl("HikariPool-532");
        hikariConfig1.setJdbcUrl("");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20738");
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
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        boolean boolean32 = hikariConfig31.isRegisterMbeans;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer33 = null;
        hikariConfig31.connectionCustomizer = iConnectionCustomizer33;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-55505" + "'", str15, "HikariPool-55505");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(str25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test20739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20739");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        int int17 = hikariConfig1.acquireRetries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test20740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20740");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        long long7 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setPoolName("HikariPool-27488");
        hikariConfig1.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test20741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20741");
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
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean23 = hikariConfig1.isIsolateInternalQueries;
        int int24 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test20742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20742");
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
        hikariConfig1.setReadOnly(false);
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig19.isJdbc4connectionTest = false;
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.lang.String str24 = hikariConfig23.getDataSourceClassName();
        hikariConfig23.setTransactionIsolation("hi!");
        hikariConfig23.acquireRetryDelay = '4';
        hikariConfig23.setConnectionCustomizerClassName("");
        java.lang.String str31 = hikariConfig23.getPoolName();
        long long32 = hikariConfig23.getLeakDetectionThreshold();
        java.lang.String str33 = hikariConfig23.connectionInitSql;
        int int34 = hikariConfig23.acquireRetries;
        hikariConfig23.setMaxLifetime((long) 97);
        hikariConfig23.setUseInstrumentation(true);
        java.util.Properties properties39 = hikariConfig23.getDataSourceProperties();
        java.util.Properties properties40 = hikariConfig23.getDataSourceProperties();
        java.lang.String str41 = hikariConfig23.connectionCustomizerClassName;
        hikariConfig23.poolName = "HikariPool-103";
        java.lang.String str44 = hikariConfig23.catalog;
        java.util.Properties properties45 = hikariConfig23.getDataSourceProperties();
        hikariConfig19.dataSourceProperties = properties45;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HikariPool-55514" + "'", str31, "HikariPool-55514");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test20743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20743");
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
        hikariConfig31.minPoolSize = (short) 10;
        hikariConfig31.setAcquireRetryDelay(1L);
        hikariConfig31.acquireIncrement = 100;
        long long38 = hikariConfig31.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(properties29);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 1800000L + "'", long38 == 1800000L);
    }

    @Test
    public void test20744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20744");
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
        int int14 = hikariConfig1.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test20745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20745");
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
        hikariConfig14.maxPoolSize = 60;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test20746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20746");
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
        long long23 = hikariConfig1.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
    }

    @Test
    public void test20747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20747");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test20748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20748");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        hikariConfig5.acquireIncrement = '#';
        java.lang.String str8 = hikariConfig5.getDataSourceClassName();
        hikariConfig5.setAutoCommit(false);
        int int11 = hikariConfig5.transactionIsolation;
        javax.sql.DataSource dataSource12 = hikariConfig5.getDataSource();
        hikariConfig5.isReadOnly = false;
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test20749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20749");
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
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        int int15 = hikariConfig1.transactionIsolation;
        hikariConfig1.setConnectionInitSql("HikariPool-177");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test20750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20750");
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
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.transactionIsolationName = "HikariPool-409";
        int int23 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.poolName = "HikariPool-20120";
        hikariConfig1.setCatalog("HikariPool-531");
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55530" + "'", str9, "HikariPool-55530");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test20751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20751");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireRetries(100);
        int int6 = hikariConfig1.maxPoolSize;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.jdbcUrl = "HikariPool-186";
        hikariConfig1.connectionTimeout = 2147483647L;
        java.lang.String str13 = hikariConfig1.catalog;
        boolean boolean14 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20752");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.jdbcUrl;
        java.lang.String str9 = hikariConfig1.jdbcUrl;
        long long10 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setReadOnly(true);
        int int13 = hikariConfig1.transactionIsolation;
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        java.lang.String str15 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20753");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        int int5 = hikariConfig1.getMaximumPoolSize();
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20754");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        long long5 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setReadOnly(false);
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setTransactionIsolation("HikariPool-86");
        java.lang.String str11 = hikariConfig1.poolName;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        long long15 = hikariConfig14.getAcquireRetryDelay();
        hikariConfig14.idleTimeout = (-1);
        java.util.Properties properties18 = hikariConfig14.getDataSourceProperties();
        long long19 = hikariConfig14.maxLifetime;
        hikariConfig14.setConnectionInitSql("");
        int int22 = hikariConfig14.acquireRetries;
        hikariConfig14.leakDetectionThreshold = (-1);
        long long25 = hikariConfig14.getAcquireRetryDelay();
        boolean boolean26 = hikariConfig14.isRegisterMbeans();
        hikariConfig14.setPoolName("HikariPool-541");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = null;
        hikariConfig14.connectionCustomizer = iConnectionCustomizer29;
        boolean boolean31 = hikariConfig14.isReadOnly();
        java.lang.String str32 = hikariConfig14.poolName;
        boolean boolean33 = hikariConfig14.isReadOnly;
        hikariConfig14.setConnectionInitSql("HikariPool-237");
        hikariConfig1.addDataSourceProperty("HikariPool-193", (java.lang.Object) "HikariPool-237");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-55534" + "'", str11, "HikariPool-55534");
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-541" + "'", str32, "HikariPool-541");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test20755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20755");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setTransactionIsolation("HikariPool-77");
        java.util.Properties properties6 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setMaximumPoolSize((int) '#');
        int int9 = hikariConfig1.minPoolSize;
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20756");
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
        java.lang.Class<?> wildcardClass22 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test20757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20757");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionTimeout = (byte) -1;
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.connectionInitSql = "hi!";
        hikariConfig16.acquireIncrement = (byte) 100;
        hikariConfig16.setMinimumPoolSize((int) (short) 0);
        java.lang.String str24 = hikariConfig16.dataSourceClassName;
        hikariConfig16.acquireIncrement = (byte) 100;
        hikariConfig16.setRegisterMbeans(false);
        java.util.Properties properties29 = hikariConfig16.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties29;
        int int31 = hikariConfig1.acquireIncrement;
        java.lang.String str32 = hikariConfig1.jdbcUrl;
        int int33 = hikariConfig1.maxPoolSize;
        long long34 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.idleTimeout = 5000L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test20758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20758");
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
        int int16 = hikariConfig1.maxPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-273" + "'", str13, "HikariPool-273");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test20759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20759");
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
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig16.setPoolName("HikariPool-43");
        hikariConfig16.setUseInstrumentation(false);
        java.lang.String str21 = hikariConfig16.getConnectionTestQuery();
        long long22 = hikariConfig16.getConnectionTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-55542" + "'", str11, "HikariPool-55542");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test20760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20760");
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
        hikariConfig25.leakDetectionThreshold = 1L;
        hikariConfig25.setAcquireRetries((int) (short) 0);
        boolean boolean31 = hikariConfig25.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test20761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20761");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setUseInstrumentation(true);
        long long8 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setTransactionIsolation("HikariPool-693");
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        int int15 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.jdbcUrl = "HikariPool-40876";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test20762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20762");
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
        javax.sql.DataSource dataSource19 = hikariConfig1.dataSource;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setReadOnly(true);
        boolean boolean23 = hikariConfig1.isIsolateInternalQueries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20763");
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
        long long14 = hikariConfig1.maxLifetime;
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMinimumPoolSize(3);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20764");
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
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.maxPoolSize = (short) 1;
        long long30 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionTestQuery = "HikariPool-41873";
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1800000L + "'", long30 == 1800000L);
    }

    @Test
    public void test20765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20765");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        long long7 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isIsolateInternalQueries;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20766");
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
        hikariConfig7.idleTimeout = 'a';
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test20767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20767");
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
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        long long15 = hikariConfig1.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test20768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20768");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        long long7 = hikariConfig1.connectionTimeout;
        hikariConfig1.jdbcUrl = "HikariPool-335";
        hikariConfig1.acquireRetries = (short) 10;
        hikariConfig1.setAcquireRetryDelay((long) (byte) 100);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setPoolName("HikariPool-160");
        hikariConfig1.setMinimumPoolSize(1);
        java.lang.String str20 = hikariConfig1.connectionTestQuery;
        int int21 = hikariConfig1.getTransactionIsolation();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test20769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20769");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.catalog = "HikariPool-84";
        hikariConfig1.setIsolateInternalQueries(true);
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setMinimumPoolSize(358);
        long long17 = hikariConfig1.getConnectionTimeout();
        long long18 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55571" + "'", str9, "HikariPool-55571");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test20770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20770");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str7 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("HikariPool-832");
        hikariConfig1.connectionCustomizerClassName = "HikariPool-150";
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries;
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-150" + "'", str13, "HikariPool-150");
    }

    @Test
    public void test20771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20771");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        int int5 = hikariConfig1.getAcquireRetries();
        hikariConfig1.acquireRetries = '#';
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.leakDetectionThreshold = 10L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test20772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20772");
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
        java.lang.String str20 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20773");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.catalog = "HikariPool-84";
        hikariConfig1.setMaxLifetime((long) 3);
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
        boolean boolean19 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55577" + "'", str9, "HikariPool-55577");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test20774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20774");
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
        hikariConfig1.isInitializationFailFast = false;
        long long20 = hikariConfig1.maxLifetime;
        long long21 = hikariConfig1.getAcquireRetryDelay();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test20775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20775");
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
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long19 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.idleTimeout = (-1);
        java.util.Properties properties22 = hikariConfig18.getDataSourceProperties();
        long long23 = hikariConfig18.maxLifetime;
        hikariConfig18.setConnectionInitSql("");
        int int26 = hikariConfig18.acquireRetries;
        hikariConfig18.leakDetectionThreshold = (-1);
        hikariConfig18.leakDetectionThreshold = (short) -1;
        hikariConfig1.addDataSourceProperty("HikariPool-754", (java.lang.Object) (short) -1);
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.setJdbc4ConnectionTest(true);
        boolean boolean36 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test20776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20776");
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
        hikariConfig1.acquireIncrement = (byte) 1;
        boolean boolean22 = hikariConfig1.isInitializationFailFast();
        java.lang.String str23 = hikariConfig1.connectionTestQuery;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test20777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20777");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setJdbcUrl("HikariPool-300");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-335");
        hikariConfig1.isAutoCommit = true;
        boolean boolean14 = hikariConfig1.isReadOnly();
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.setMaximumPoolSize(10);
        boolean boolean19 = hikariConfig1.isAutoCommit;
        int int20 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test20778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20778");
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
        hikariConfig1.maxPoolSize = (short) -1;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.idleTimeout = (-1);
        java.util.Properties properties26 = hikariConfig22.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties26;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties26);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig33.isJdbc4connectionTest = true;
        hikariConfig33.transactionIsolationName = "HikariPool-49081";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test20779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20779");
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
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str22 = hikariConfig21.connectionInitSql;
        hikariConfig21.minPoolSize = 358;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test20780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20780");
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
        hikariConfig1.isReadOnly = true;
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str20 = hikariConfig1.poolName;
        java.lang.String str21 = hikariConfig1.catalog;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-55603" + "'", str20, "HikariPool-55603");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20781");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        long long9 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setConnectionTestQuery("HikariPool-125");
        hikariConfig1.setAutoCommit(true);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.connectionInitSql = "hi!";
        hikariConfig16.acquireIncrement = (byte) 100;
        hikariConfig16.setMinimumPoolSize((int) (short) 0);
        hikariConfig16.connectionTestQuery = "";
        hikariConfig16.jdbcUrl = "HikariPool-45";
        hikariConfig16.isReadOnly = false;
        hikariConfig16.setPoolName("");
        java.lang.String str32 = hikariConfig16.getConnectionTestQuery();
        java.util.Properties properties33 = hikariConfig16.dataSourceProperties;
        int int34 = hikariConfig16.transactionIsolation;
        hikariConfig1.addDataSourceProperty("HikariPool-3926", (java.lang.Object) int34);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test20782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20782");
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
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        java.lang.String str15 = hikariConfig14.getConnectionCustomizerClassName();
        hikariConfig14.poolName = "HikariPool-6044";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20783");
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
        java.util.Properties properties21 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties21);
        java.util.Properties properties25 = hikariConfig24.dataSourceProperties;
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isInitializationFailFast();
        java.lang.String str30 = hikariConfig28.jdbcUrl;
        boolean boolean31 = hikariConfig28.isAutoCommit();
        hikariConfig28.setIsolateInternalQueries(true);
        java.lang.String str34 = hikariConfig28.connectionCustomizerClassName;
        hikariConfig28.connectionInitSql = "HikariPool-87";
        hikariConfig28.connectionInitSql = "HikariPool-1317";
        java.util.Properties properties39 = hikariConfig28.getDataSourceProperties();
        hikariConfig24.addDataSourceProperty("HikariPool-2072", (java.lang.Object) hikariConfig28);
        java.lang.String str41 = hikariConfig28.jdbcUrl;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test20784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20784");
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
        hikariConfig16.connectionInitSql = "HikariPool-154";
        hikariConfig16.setJdbcUrl("HikariPool-322");
        int int21 = hikariConfig16.getMinimumPoolSize();
        hikariConfig16.maxLifetime = 1;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test20785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20785");
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
        hikariConfig1.jdbcUrl = "HikariPool-159";
        java.lang.String str26 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource27 = hikariConfig1.dataSource;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(dataSource27);
    }

    @Test
    public void test20786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20786");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.isReadOnly = false;
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test20787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20787");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-54125");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-54125 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20788");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.getPoolName();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-55621" + "'", str8, "HikariPool-55621");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20789");
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
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        hikariConfig1.setConnectionTestQuery("HikariPool-207");
        hikariConfig1.idleTimeout = ' ';
        long long19 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        long long22 = hikariConfig21.getConnectionTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test20790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20790");
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
        java.lang.String str20 = hikariConfig19.getDataSourceClassName();
        hikariConfig19.setIsolateInternalQueries(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20791");
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
        hikariConfig1.setIdleTimeout(52L);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer23;
        long long25 = hikariConfig1.acquireRetryDelay;
        java.util.Properties properties26 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test20792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20792");
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
        hikariConfig1.setCatalog("HikariPool-12820");
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireIncrement((int) 'a');
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test20793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20793");
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
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setJdbcUrl("HikariPool-37949");
        hikariConfig1.acquireRetryDelay = 5000L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test20794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20794");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        hikariConfig1.setMaxLifetime((long) 97);
        hikariConfig1.setAutoCommit(false);
        long long15 = hikariConfig1.connectionTimeout;
        boolean boolean16 = hikariConfig1.isAutoCommit();
        int int17 = hikariConfig1.getAcquireRetries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test20795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20795");
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
        int int25 = hikariConfig1.getAcquireIncrement();
        java.lang.String str26 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean27 = hikariConfig1.isAutoCommit();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setJdbcUrl("HikariPool-28246");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer32 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer32);
    }

    @Test
    public void test20796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20796");
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
        long long14 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(false);
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        java.lang.String str22 = hikariConfig21.getDataSourceClassName();
        hikariConfig21.setTransactionIsolation("hi!");
        hikariConfig21.acquireRetryDelay = '4';
        hikariConfig21.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties29 = hikariConfig21.getDataSourceProperties();
        hikariConfig16.setDataSourceProperties(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        java.util.Properties properties32 = hikariConfig31.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig1.dataSourceProperties = properties32;
        javax.sql.DataSource dataSource36 = null;
        hikariConfig1.dataSource = dataSource36;
        hikariConfig1.setConnectionInitSql("HikariPool-18840");
        hikariConfig1.isAutoCommit = false;
        int int42 = hikariConfig1.acquireRetries;
        int int43 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test20797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20797");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        long long8 = hikariConfig1.maxLifetime;
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.catalog = "HikariPool-1933";
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.acquireRetries = (short) -1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-55640" + "'", str12, "HikariPool-55640");
    }

    @Test
    public void test20798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20798");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties11);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test20799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20799");
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
        hikariConfig19.poolName = "HikariPool-2409";
        hikariConfig19.isRegisterMbeans = false;
        java.lang.String str26 = hikariConfig19.getJdbcUrl();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test20800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20800");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.dataSourceClassName = "HikariPool-921";
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        int int13 = hikariConfig1.acquireRetries;
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str16 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.connectionInitSql = "hi!";
        hikariConfig19.acquireIncrement = (byte) 100;
        hikariConfig19.setMinimumPoolSize((int) (short) 0);
        hikariConfig19.connectionTestQuery = "";
        hikariConfig19.jdbcUrl = "HikariPool-45";
        hikariConfig19.setAcquireIncrement((int) (byte) 1);
        int int33 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.connectionTestQuery = "HikariPool-780";
        long long36 = hikariConfig19.getIdleTimeout();
        hikariConfig19.maxPoolSize = 10;
        hikariConfig19.connectionCustomizerClassName = "HikariPool-2638";
        hikariConfig1.addDataSourceProperty("HikariPool-7155", (java.lang.Object) "HikariPool-2638");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-921" + "'", str16, "HikariPool-921");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1800000L + "'", long36 == 1800000L);
    }

    @Test
    public void test20801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20801");
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
        hikariConfig1.setCatalog("HikariPool-45190");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test20802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20802");
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
        java.lang.String str36 = hikariConfig35.getJdbcUrl();
        java.lang.String str37 = hikariConfig35.jdbcUrl;
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig40.maxPoolSize = (byte) 0;
        boolean boolean43 = hikariConfig40.isAutoCommit;
        int int44 = hikariConfig40.transactionIsolation;
        hikariConfig35.addDataSourceProperty("HikariPool-44462", (java.lang.Object) hikariConfig40);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test20803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20803");
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
        java.util.Properties properties20 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test20804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20804");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.isRegisterMbeans = false;
        int int10 = hikariConfig1.acquireRetries;
        long long11 = hikariConfig1.getConnectionTimeout();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        long long13 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
    }

    @Test
    public void test20805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20805");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.isJdbc4connectionTest = false;
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.setReadOnly(true);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test20806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20806");
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
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        java.lang.String str17 = hikariConfig16.getDataSourceClassName();
        int int18 = hikariConfig16.getAcquireRetries();
        hikariConfig16.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig16.setDataSource(dataSource21);
        hikariConfig16.poolName = "HikariPool-127";
        long long25 = hikariConfig16.getIdleTimeout();
        java.lang.String str26 = hikariConfig16.getConnectionTestQuery();
        long long27 = hikariConfig16.idleTimeout;
        hikariConfig16.transactionIsolation = (short) 10;
        hikariConfig16.setAutoCommit(false);
        hikariConfig16.maxPoolSize = 32;
        hikariConfig16.maxLifetime = 97L;
        hikariConfig16.setAcquireRetryDelay((long) 10);
        hikariConfig1.addDataSourceProperty("HikariPool-952", (java.lang.Object) 10);
        int int39 = hikariConfig1.minPoolSize;
        long long40 = hikariConfig1.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1800000L + "'", long25 == 1800000L);
        org.junit.Assert.assertNull(str26);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test20807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20807");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setIsolateInternalQueries(true);
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        java.lang.String str15 = hikariConfig14.getDataSourceClassName();
        int int16 = hikariConfig14.getAcquireRetries();
        java.lang.String str17 = hikariConfig14.getJdbcUrl();
        hikariConfig14.setInitializationFailFast(false);
        hikariConfig14.setMinimumPoolSize(1);
        java.lang.String str22 = hikariConfig14.dataSourceClassName;
        boolean boolean23 = hikariConfig14.isInitializationFailFast;
        hikariConfig14.setTransactionIsolation("HikariPool-72");
        hikariConfig1.addDataSourceProperty("HikariPool-44099", (java.lang.Object) "HikariPool-72");
        hikariConfig1.acquireIncrement = (short) 10;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20808");
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
        hikariConfig1.isReadOnly = false;
        boolean boolean23 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setConnectionTestQuery("HikariPool-20071");
        java.lang.String str26 = hikariConfig1.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55664" + "'", str9, "HikariPool-55664");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test20809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20809");
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
        long long18 = hikariConfig1.maxLifetime;
        hikariConfig1.setAcquireIncrement((int) (short) 1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test20810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20810");
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
        hikariConfig1.setMaximumPoolSize(1);
        hikariConfig1.acquireRetryDelay = (byte) 100;
        long long25 = hikariConfig1.getAcquireRetryDelay();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer26;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55666" + "'", str9, "HikariPool-55666");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-55666" + "'", str13, "HikariPool-55666");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test20811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20811");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        long long12 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setTransactionIsolation("HikariPool-82");
        hikariConfig1.catalog = "";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setTransactionIsolation("HikariPool-781");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig1.connectionCustomizer;
        int int22 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties23 = hikariConfig1.dataSourceProperties;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test20812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20812");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-480");
        hikariConfig1.dataSourceClassName = "HikariPool-177";
        int int34 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test20813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20813");
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
        hikariConfig1.setIdleTimeout((long) ' ');
        boolean boolean17 = hikariConfig1.isIsolateInternalQueries;
        int int18 = hikariConfig1.minPoolSize;
        hikariConfig1.leakDetectionThreshold = 52L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test20814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20814");
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
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionInitSql("HikariPool-54441");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20815");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        long long12 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.connectionInitSql = "hi!";
        hikariConfig17.acquireIncrement = (byte) 100;
        hikariConfig17.setMinimumPoolSize((int) (short) 0);
        hikariConfig17.connectionTestQuery = "";
        hikariConfig17.jdbcUrl = "HikariPool-45";
        hikariConfig17.isReadOnly = false;
        boolean boolean31 = hikariConfig17.isInitializationFailFast;
        hikariConfig17.isInitializationFailFast = true;
        hikariConfig17.jdbcUrl = "HikariPool-833";
        hikariConfig17.setDataSourceClassName("HikariPool-180");
        hikariConfig17.minPoolSize = (short) -1;
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        long long42 = hikariConfig41.getAcquireRetryDelay();
        hikariConfig41.idleTimeout = (-1);
        java.util.Properties properties45 = hikariConfig41.getDataSourceProperties();
        long long46 = hikariConfig41.maxLifetime;
        hikariConfig41.setConnectionInitSql("");
        int int49 = hikariConfig41.acquireRetries;
        hikariConfig41.leakDetectionThreshold = (-1);
        java.util.Properties properties52 = hikariConfig41.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig17.dataSourceProperties = properties52;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig1.setDataSourceProperties(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties52);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer59 = hikariConfig58.connectionCustomizer;
        java.lang.String str60 = hikariConfig58.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertNotNull(properties45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 97L + "'", long46 == 97L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNull(iConnectionCustomizer59);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test20816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20816");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.isReadOnly = false;
        int int7 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.connectionInitSql = "";
        java.lang.String str10 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20817");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str9 = hikariConfig1.poolName;
        hikariConfig1.setReadOnly(true);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setConnectionInitSql("HikariPool-402");
        hikariConfig1.setAutoCommit(false);
        int int18 = hikariConfig1.getAcquireIncrement();
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55680" + "'", str9, "HikariPool-55680");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test20818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20818");
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
        long long22 = hikariConfig1.connectionTimeout;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.idleTimeout = (-1);
        hikariConfig25.setMaximumPoolSize((int) 'a');
        long long31 = hikariConfig25.getLeakDetectionThreshold();
        boolean boolean32 = hikariConfig25.isIsolateInternalQueries;
        boolean boolean33 = hikariConfig25.isJdbc4ConnectionTest();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        java.lang.String str36 = hikariConfig35.getDataSourceClassName();
        int int37 = hikariConfig35.getAcquireRetries();
        hikariConfig35.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource40 = null;
        hikariConfig35.setDataSource(dataSource40);
        hikariConfig35.transactionIsolation = (byte) 10;
        int int44 = hikariConfig35.acquireIncrement;
        hikariConfig35.acquireRetryDelay = 100;
        java.util.Properties properties47 = hikariConfig35.dataSourceProperties;
        hikariConfig25.dataSourceProperties = properties47;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig1.addDataSourceProperty("HikariPool-429", (java.lang.Object) properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig51.connectionTimeout = (-1L);
        long long54 = hikariConfig51.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig51.setDriverClassName("HikariPool-17182");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-17182' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
    }

    @Test
    public void test20819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20819");
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
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.isReadOnly = true;
        hikariConfig1.addDataSourceProperty("HikariPool-21095", (java.lang.Object) "HikariPool-20651");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20820");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.connectionTestQuery = "HikariPool-45";
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        hikariConfig1.poolName = "HikariPool-462";
        hikariConfig1.setIdleTimeout((long) (short) 0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
    }

    @Test
    public void test20821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20821");
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
        hikariConfig1.setAcquireRetries(1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-55693" + "'", str40, "HikariPool-55693");
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertNull(str50);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test20822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20822");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxLifetime = 750L;
        java.lang.String str13 = hikariConfig1.poolName;
        boolean boolean14 = hikariConfig1.isAutoCommit();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.idleTimeout = (-1);
        java.util.Properties properties20 = hikariConfig16.getDataSourceProperties();
        long long21 = hikariConfig16.maxLifetime;
        long long22 = hikariConfig16.getConnectionTimeout();
        java.lang.String str23 = hikariConfig16.getConnectionCustomizerClassName();
        hikariConfig16.isAutoCommit = false;
        hikariConfig16.isRegisterMbeans = false;
        java.util.Properties properties28 = hikariConfig16.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig1.setDataSourceProperties(properties28);
        int int31 = hikariConfig1.acquireRetries;
        hikariConfig1.isAutoCommit = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-55695" + "'", str13, "HikariPool-55695");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test20823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20823");
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
        int int26 = hikariConfig1.getAcquireRetries();
        int int27 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.setReadOnly(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test20824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20824");
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
        hikariConfig1.minPoolSize = (short) -1;
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.dataSource = dataSource21;
        hikariConfig1.maxPoolSize = (short) 1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20825");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.isInitializationFailFast = false;
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test20826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20826");
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
        hikariConfig1.setMaxLifetime((long) '#');
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.poolName = "";
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        long long19 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test20827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20827");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        long long7 = hikariConfig1.connectionTimeout;
        hikariConfig1.jdbcUrl = "HikariPool-335";
        hikariConfig1.acquireRetries = (short) 10;
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        long long14 = hikariConfig1.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test20828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20828");
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
        java.util.Properties properties34 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig35.setTransactionIsolation("HikariPool-29683");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test20829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20829");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.connectionTestQuery = "HikariPool-77";
        hikariConfig1.leakDetectionThreshold = '4';
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        long long15 = hikariConfig1.idleTimeout;
        long long16 = hikariConfig1.acquireRetryDelay;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test20830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20830");
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
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.acquireIncrement = 32;
        hikariConfig1.setConnectionInitSql("HikariPool-1764");
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.lang.String str25 = hikariConfig24.getDataSourceClassName();
        hikariConfig24.setTransactionIsolation("hi!");
        hikariConfig24.acquireRetryDelay = '4';
        hikariConfig24.setConnectionCustomizerClassName("");
        java.lang.String str32 = hikariConfig24.getPoolName();
        long long33 = hikariConfig24.getLeakDetectionThreshold();
        java.lang.String str34 = hikariConfig24.connectionInitSql;
        hikariConfig24.setConnectionTestQuery("HikariPool-271");
        java.util.Properties properties37 = hikariConfig24.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties37);
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.isReadOnly = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str25);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-55709" + "'", str32, "HikariPool-55709");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties37);
    }

    @Test
    public void test20831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20831");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        int int9 = hikariConfig1.acquireIncrement;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.lang.String str12 = hikariConfig11.getDataSourceClassName();
        hikariConfig11.setTransactionIsolation("hi!");
        hikariConfig11.acquireRetryDelay = '4';
        hikariConfig11.setConnectionTimeout((long) (short) 0);
        hikariConfig11.setConnectionTestQuery("HikariPool-45");
        java.lang.String str21 = hikariConfig11.getConnectionTestQuery();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        long long24 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig23.connectionInitSql = "hi!";
        hikariConfig23.acquireIncrement = (byte) 100;
        hikariConfig23.setMinimumPoolSize((int) (short) 0);
        hikariConfig23.connectionTestQuery = "";
        hikariConfig23.jdbcUrl = "HikariPool-45";
        hikariConfig23.isReadOnly = false;
        hikariConfig23.setPoolName("");
        java.lang.String str39 = hikariConfig23.getConnectionTestQuery();
        java.util.Properties properties40 = hikariConfig23.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig11.setDataSourceProperties(properties40);
        hikariConfig1.dataSourceProperties = properties40;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig45.setUseInstrumentation(false);
        hikariConfig45.setIsolateInternalQueries(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-45" + "'", str21, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test20832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20832");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxPoolSize = (byte) 100;
        hikariConfig1.poolName = "HikariPool-1203";
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean14 = hikariConfig1.isAutoCommit();
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test20833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20833");
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
        hikariConfig1.minPoolSize = (short) 10;
        boolean boolean18 = hikariConfig1.isAutoCommit();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test20834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20834");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        hikariConfig1.connectionTestQuery = "HikariPool-152";
        int int10 = hikariConfig1.maxPoolSize;
        hikariConfig1.setRegisterMbeans(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test20835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20835");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.jdbcUrl;
        int int9 = hikariConfig1.acquireRetries;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.poolName = "";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20836");
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
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        hikariConfig1.jdbcUrl = "HikariPool-52197";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-268" + "'", str15, "HikariPool-268");
    }

    @Test
    public void test20837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20837");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-46745");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-46745 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20838");
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
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.lang.String str24 = hikariConfig23.getDataSourceClassName();
        hikariConfig23.setTransactionIsolation("hi!");
        hikariConfig23.acquireRetryDelay = '4';
        hikariConfig23.setConnectionTimeout((long) (short) 0);
        hikariConfig23.setConnectionTestQuery("HikariPool-45");
        hikariConfig23.jdbcUrl = "HikariPool-84";
        hikariConfig23.isJdbc4connectionTest = false;
        hikariConfig14.addDataSourceProperty("HikariPool-172", (java.lang.Object) hikariConfig23);
        hikariConfig23.idleTimeout = 52L;
        int int40 = hikariConfig23.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-188" + "'", str20, "HikariPool-188");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test20839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20839");
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
        hikariConfig1.setAcquireRetryDelay((long) 97);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test20840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20840");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20841");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.connectionTestQuery = "HikariPool-1005";
        hikariConfig1.leakDetectionThreshold = (short) 1;
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test20842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20842");
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
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        boolean boolean20 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = 'a';
        int int23 = hikariConfig1.getAcquireRetries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test20843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20843");
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
        int int19 = hikariConfig1.acquireRetries;
        hikariConfig1.acquireRetries = 60;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55729" + "'", str9, "HikariPool-55729");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test20844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20844");
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
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig23.acquireRetryDelay = 100;
        long long26 = hikariConfig23.getMaxLifetime();
        java.lang.String str27 = hikariConfig23.dataSourceClassName;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test20845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20845");
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
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setJdbcUrl("HikariPool-35864");
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55736" + "'", str9, "HikariPool-55736");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20846");
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
        int int17 = hikariConfig1.getAcquireRetries();
        long long18 = hikariConfig1.getConnectionTimeout();
        boolean boolean19 = hikariConfig1.isReadOnly();
        boolean boolean20 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isReadOnly = true;
        java.lang.String str23 = hikariConfig1.connectionCustomizerClassName;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.connectionInitSql = "hi!";
        hikariConfig25.acquireIncrement = (byte) 100;
        hikariConfig25.setMinimumPoolSize((int) (short) 0);
        java.lang.String str33 = hikariConfig25.dataSourceClassName;
        long long34 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.setConnectionTestQuery("HikariPool-114");
        long long37 = hikariConfig25.getMaxLifetime();
        boolean boolean38 = hikariConfig25.isIsolateInternalQueries();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer39 = hikariConfig25.connectionCustomizer;
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        java.lang.String str42 = hikariConfig41.getDataSourceClassName();
        hikariConfig41.setTransactionIsolation("hi!");
        hikariConfig41.acquireRetryDelay = '4';
        hikariConfig41.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties49 = hikariConfig41.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig25.dataSourceProperties = properties49;
        hikariConfig1.setDataSourceProperties(properties49);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55737" + "'", str9, "HikariPool-55737");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNull(str33);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 97L + "'", long37 == 97L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(properties49);
    }

    @Test
    public void test20847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20847");
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
        long long70 = hikariConfig69.leakDetectionThreshold;
        boolean boolean71 = hikariConfig69.isRegisterMbeans;
        java.lang.String str72 = hikariConfig69.getConnectionTestQuery();
        java.lang.String str73 = hikariConfig69.getJdbcUrl();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-55743" + "'", str32, "HikariPool-55743");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 32L + "'", long61 == 32L);
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test20848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20848");
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
        java.lang.String str32 = hikariConfig31.getConnectionInitSql();
        hikariConfig31.setDataSourceClassName("HikariPool-1360");
        hikariConfig31.setAutoCommit(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test20849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20849");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setTransactionIsolation("HikariPool-77");
        hikariConfig1.connectionCustomizerClassName = "";
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.connectionInitSql = "hi!";
        hikariConfig10.acquireIncrement = (byte) 100;
        hikariConfig10.setMinimumPoolSize((int) (short) 0);
        hikariConfig10.connectionTestQuery = "";
        long long20 = hikariConfig10.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig10.connectionCustomizer = iConnectionCustomizer21;
        hikariConfig1.addDataSourceProperty("HikariPool-480", (java.lang.Object) hikariConfig10);
        java.lang.String str24 = hikariConfig1.getPoolName();
        long long25 = hikariConfig1.connectionTimeout;
        boolean boolean26 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-55751" + "'", str24, "HikariPool-55751");
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3L + "'", long25 == 3L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test20850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20850");
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
        hikariConfig20.acquireRetries = 100;
        hikariConfig20.setMinimumPoolSize((int) (short) 100);
        java.lang.String str25 = hikariConfig20.getConnectionCustomizerClassName();
        boolean boolean26 = hikariConfig20.isReadOnly;
        hikariConfig20.connectionTestQuery = "HikariPool-8969";
        boolean boolean29 = hikariConfig20.isReadOnly();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test20851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20851");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        boolean boolean6 = hikariConfig1.isReadOnly;
        long long7 = hikariConfig1.leakDetectionThreshold;
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.minPoolSize = (byte) 0;
        java.lang.Class<?> wildcardClass11 = hikariConfig1.getClass();
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test20852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20852");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        java.lang.String str6 = hikariConfig1.jdbcUrl;
        hikariConfig1.maxPoolSize = 358;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.isIsolateInternalQueries = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test20853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20853");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionInitSql = "HikariPool-519";
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setPoolName("HikariPool-239");
        int int12 = hikariConfig1.maxPoolSize;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-36320";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test20854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20854");
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
        java.lang.String str16 = hikariConfig1.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20855");
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
        hikariConfig1.setJdbcUrl("HikariPool-1642");
        long long19 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test20856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20856");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.catalog = "HikariPool-84";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.maxLifetime = 97;
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        hikariConfig1.setInitializationFailFast(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55761" + "'", str9, "HikariPool-55761");
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
    }

    @Test
    public void test20857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20857");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        long long7 = hikariConfig1.getConnectionTimeout();
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isAutoCommit = false;
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setTransactionIsolation("");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20858");
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
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.minPoolSize = 100;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55763" + "'", str9, "HikariPool-55763");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test20859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20859");
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
        hikariConfig1.connectionTestQuery = "HikariPool-1194";
        hikariConfig1.setDataSourceClassName("HikariPool-62");
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setConnectionTimeout(2147483647L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test20860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20860");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str6 = hikariConfig1.poolName;
        long long7 = hikariConfig1.idleTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-55765" + "'", str6, "HikariPool-55765");
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test20861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20861");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        java.lang.String str5 = hikariConfig1.catalog;
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test20862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20862");
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
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties21);
        java.lang.String str29 = hikariConfig28.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test20863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20863");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-290";
        hikariConfig1.setDataSourceClassName("HikariPool-764");
        hikariConfig1.connectionTimeout = 1L;
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        java.lang.String str15 = hikariConfig1.getCatalog();
        long long16 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
    }

    @Test
    public void test20864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20864");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str6 = hikariConfig1.transactionIsolationName;
        hikariConfig1.idleTimeout = 2147483647L;
        hikariConfig1.connectionInitSql = "HikariPool-16001";
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test20865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20865");
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
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20866");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-223");
        boolean boolean40 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test20867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20867");
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
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        long long22 = hikariConfig21.getAcquireRetryDelay();
        hikariConfig21.idleTimeout = (-1);
        hikariConfig21.setMaximumPoolSize((int) 'a');
        long long27 = hikariConfig21.getLeakDetectionThreshold();
        boolean boolean28 = hikariConfig21.isIsolateInternalQueries;
        int int29 = hikariConfig21.acquireRetries;
        hikariConfig21.transactionIsolation = (byte) -1;
        java.lang.String str32 = hikariConfig21.getConnectionInitSql();
        boolean boolean33 = hikariConfig21.isRegisterMbeans;
        boolean boolean34 = hikariConfig21.isReadOnly();
        int int35 = hikariConfig21.getTransactionIsolation();
        hikariConfig21.setAcquireRetries(0);
        hikariConfig21.isInitializationFailFast = false;
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        long long42 = hikariConfig41.getAcquireRetryDelay();
        hikariConfig41.idleTimeout = (-1);
        java.util.Properties properties45 = hikariConfig41.getDataSourceProperties();
        long long46 = hikariConfig41.maxLifetime;
        hikariConfig41.setConnectionInitSql("");
        int int49 = hikariConfig41.getMinimumPoolSize();
        long long50 = hikariConfig41.getLeakDetectionThreshold();
        hikariConfig41.setJdbcUrl("HikariPool-77");
        hikariConfig41.setConnectionTestQuery("HikariPool-56");
        java.util.Properties properties55 = hikariConfig41.dataSourceProperties;
        hikariConfig21.setDataSourceProperties(properties55);
        hikariConfig1.dataSourceProperties = properties55;
        hikariConfig1.dataSourceClassName = "";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertNotNull(properties45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 97L + "'", long46 == 97L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(properties55);
    }

    @Test
    public void test20868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20868");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.connectionTestQuery = "HikariPool-77";
        long long12 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.connectionTimeout = (short) 1;
        long long15 = hikariConfig1.connectionTimeout;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1355";
        hikariConfig1.setIdleTimeout((long) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test20869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20869");
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
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.dataSource = dataSource16;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.idleTimeout = (-1);
        hikariConfig19.setMaximumPoolSize((int) 'a');
        long long25 = hikariConfig19.getLeakDetectionThreshold();
        java.lang.String str26 = hikariConfig19.jdbcUrl;
        java.lang.String str27 = hikariConfig19.jdbcUrl;
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        java.lang.String str30 = hikariConfig29.getDataSourceClassName();
        int int31 = hikariConfig29.getAcquireRetries();
        hikariConfig29.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource34 = null;
        hikariConfig29.setDataSource(dataSource34);
        java.lang.String str36 = hikariConfig29.getConnectionTestQuery();
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        long long39 = hikariConfig38.getAcquireRetryDelay();
        hikariConfig38.connectionInitSql = "hi!";
        hikariConfig38.acquireIncrement = (byte) 100;
        hikariConfig38.setMinimumPoolSize((int) (short) 0);
        hikariConfig38.connectionTestQuery = "";
        hikariConfig38.jdbcUrl = "HikariPool-45";
        hikariConfig38.isReadOnly = false;
        hikariConfig38.setPoolName("");
        java.lang.String str54 = hikariConfig38.getConnectionTestQuery();
        java.util.Properties properties55 = hikariConfig38.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig29.setDataSourceProperties(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig19.dataSourceProperties = properties55;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig1.dataSourceProperties = properties55;
        java.util.Properties properties63 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties63);
        long long65 = hikariConfig64.getAcquireRetryDelay();
        hikariConfig64.connectionInitSql = "hi!";
        hikariConfig64.acquireIncrement = (byte) 100;
        hikariConfig64.setMinimumPoolSize((int) (short) 0);
        hikariConfig64.setCatalog("hi!");
        java.lang.String str74 = hikariConfig64.getConnectionCustomizerClassName();
        long long75 = hikariConfig64.getMaxLifetime();
        hikariConfig64.isRegisterMbeans = false;
        hikariConfig64.maxPoolSize = 35;
        hikariConfig64.setDataSourceClassName("HikariPool-283");
        long long82 = hikariConfig64.getMaxLifetime();
        hikariConfig64.acquireRetries = (byte) 1;
        boolean boolean85 = hikariConfig64.isInitializationFailFast();
        java.util.Properties properties86 = hikariConfig64.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig87 = new com.zaxxer.hikari.HikariConfig(properties86);
        hikariConfig1.dataSourceProperties = properties86;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(properties55);
// flaky:         org.junit.Assert.assertTrue("'" + long65 + "' != '" + 32L + "'", long65 == 32L);
        org.junit.Assert.assertNull(str74);
// flaky:         org.junit.Assert.assertTrue("'" + long75 + "' != '" + 97L + "'", long75 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long82 + "' != '" + 97L + "'", long82 == 97L);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(properties86);
    }

    @Test
    public void test20870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20870");
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
        hikariConfig1.isAutoCommit = false;
        boolean boolean18 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.poolName = "HikariPool-1302";
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.setDataSource(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20871");
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
        hikariConfig1.connectionTestQuery = "HikariPool-1196";
        hikariConfig1.catalog = "HikariPool-28462";
        hikariConfig1.setCatalog("HikariPool-37796");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test20872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20872");
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
        java.lang.String str49 = hikariConfig15.connectionCustomizerClassName;
        boolean boolean50 = hikariConfig15.isAutoCommit();
        hikariConfig15.setUseInstrumentation(false);
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test20873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20873");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        long long6 = hikariConfig5.getAcquireRetryDelay();
        hikariConfig5.connectionInitSql = "hi!";
        hikariConfig5.acquireIncrement = (byte) 100;
        hikariConfig5.setMinimumPoolSize((int) (short) 0);
        java.lang.String str13 = hikariConfig5.dataSourceClassName;
        long long14 = hikariConfig5.getAcquireRetryDelay();
        boolean boolean15 = hikariConfig5.isRegisterMbeans;
        int int16 = hikariConfig5.transactionIsolation;
        java.util.Properties properties17 = hikariConfig5.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig21.minPoolSize = (short) 0;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.idleTimeout = (-1);
        hikariConfig25.setMaximumPoolSize((int) 'a');
        java.lang.String str31 = hikariConfig25.catalog;
        java.lang.String str32 = hikariConfig25.transactionIsolationName;
        hikariConfig25.setTransactionIsolation("HikariPool-281");
        int int35 = hikariConfig25.transactionIsolation;
        hikariConfig25.setConnectionInitSql("HikariPool-963");
        hikariConfig25.transactionIsolation = 35;
        java.util.Properties properties40 = hikariConfig25.getDataSourceProperties();
        hikariConfig21.setDataSourceProperties(properties40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test20874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20874");
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
        hikariConfig1.isReadOnly = true;
        long long20 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.setMinimumPoolSize(1);
        hikariConfig1.catalog = "HikariPool-47692";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test20875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20875");
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
        hikariConfig1.transactionIsolation = (short) 10;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setIsolateInternalQueries(false);
        long long18 = hikariConfig1.getLeakDetectionThreshold();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test20876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20876");
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
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20877");
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
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test20878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20878");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        hikariConfig1.setMaxLifetime((long) 97);
        hikariConfig1.dataSourceClassName = "HikariPool-65";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        int int19 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setLeakDetectionThreshold(32L);
        boolean boolean22 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.acquireRetryDelay = (byte) 100;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test20879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20879");
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
        int int13 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1206";
        java.lang.String str16 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20880");
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
        long long13 = hikariConfig1.connectionTimeout;
        hikariConfig1.maxLifetime = ' ';
        hikariConfig1.isAutoCommit = false;
        int int18 = hikariConfig1.getMinimumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test20881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20881");
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
        int int23 = hikariConfig1.maxPoolSize;
        int int24 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2147483647L + "'", long17 == 2147483647L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 2147483647L + "'", long21 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
    }

    @Test
    public void test20882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20882");
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
        java.lang.String str30 = hikariConfig1.connectionInitSql;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test20883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20883");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-5826");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-5826 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20884");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        int int5 = hikariConfig1.acquireIncrement;
        long long6 = hikariConfig1.getMaxLifetime();
        boolean boolean7 = hikariConfig1.isReadOnly;
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        hikariConfig1.maxLifetime = 5000L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20885");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        long long4 = hikariConfig1.idleTimeout;
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isIsolateInternalQueries = true;
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.lang.String str11 = hikariConfig10.jdbcUrl;
        hikariConfig10.setTransactionIsolation("HikariPool-21955");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test20886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20886");
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
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        hikariConfig1.minPoolSize = (short) 0;
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test20887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20887");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.transactionIsolationName;
        hikariConfig0.minPoolSize = (byte) 100;
        hikariConfig0.acquireRetries = (short) 100;
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireIncrement(60);
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test20888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20888");
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
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setMaxLifetime((long) 3);
        java.lang.String str16 = hikariConfig1.getCatalog();
        int int17 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        int int21 = hikariConfig1.acquireRetries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test20889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20889");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-77");
        boolean boolean10 = hikariConfig1.isReadOnly;
        int int11 = hikariConfig1.getMinimumPoolSize();
        int int12 = hikariConfig1.getTransactionIsolation();
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireIncrement(60);
        hikariConfig1.setRegisterMbeans(false);
        long long18 = hikariConfig1.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test20890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20890");
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
        hikariConfig1.isJdbc4connectionTest = true;
        boolean boolean24 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setRegisterMbeans(true);
        int int27 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test20891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20891");
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
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.connectionInitSql = "hi!";
        hikariConfig25.acquireIncrement = (byte) 100;
        hikariConfig25.setMinimumPoolSize((int) (short) 0);
        hikariConfig25.connectionTestQuery = "";
        hikariConfig25.jdbcUrl = "HikariPool-45";
        hikariConfig25.isReadOnly = false;
        hikariConfig25.setPoolName("");
        java.lang.String str41 = hikariConfig25.getConnectionTestQuery();
        java.util.Properties properties42 = hikariConfig25.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig20.addDataSourceProperty("HikariPool-305", (java.lang.Object) hikariConfig46);
        hikariConfig20.connectionTimeout = 60L;
        hikariConfig20.setMinimumPoolSize(358);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test20892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20892");
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
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.transactionIsolationName = "HikariPool-2354";
        hikariConfig1.catalog = "HikariPool-185";
        hikariConfig1.setReadOnly(false);
        long long22 = hikariConfig1.maxLifetime;
        boolean boolean23 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-55847" + "'", str15, "HikariPool-55847");
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test20893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20893");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        hikariConfig1.connectionTestQuery = "HikariPool-167";
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setJdbcUrl("HikariPool-921");
        hikariConfig1.isAutoCommit = false;
        boolean boolean18 = hikariConfig1.isAutoCommit();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20894");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-143");
        int int18 = hikariConfig1.getMinimumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test20895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20895");
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
        hikariConfig1.maxPoolSize = (short) -1;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.idleTimeout = (-1);
        java.util.Properties properties26 = hikariConfig22.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties26;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties26);
        int int29 = hikariConfig28.getMinimumPoolSize();
        long long30 = hikariConfig28.idleTimeout;
        java.lang.String str31 = hikariConfig28.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1800000L + "'", long30 == 1800000L);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test20896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20896");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        long long7 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.maxLifetime = ' ';
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setTransactionIsolation("HikariPool-105");
        long long16 = hikariConfig1.idleTimeout;
        hikariConfig1.transactionIsolation = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
    }

    @Test
    public void test20897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20897");
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
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.idleTimeout = (-1);
        hikariConfig19.setMaximumPoolSize((int) 'a');
        java.lang.String str25 = hikariConfig19.catalog;
        hikariConfig19.connectionTimeout = ' ';
        java.lang.String str28 = hikariConfig19.getConnectionTestQuery();
        java.util.Properties properties29 = hikariConfig19.dataSourceProperties;
        java.util.Properties properties30 = hikariConfig19.getDataSourceProperties();
        hikariConfig19.maxLifetime = (short) 100;
        java.util.Properties properties33 = hikariConfig19.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig1.addDataSourceProperty("HikariPool-1075", (java.lang.Object) hikariConfig34);
        java.lang.String str36 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties33);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-55854" + "'", str36, "HikariPool-55854");
    }

    @Test
    public void test20898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20898");
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
        int int15 = hikariConfig1.getMaximumPoolSize();
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isIsolateInternalQueries = false;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20899");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-249");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test20900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20900");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        hikariConfig1.connectionTestQuery = "HikariPool-317";
        boolean boolean11 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test20901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20901");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-841";
        hikariConfig1.isIsolateInternalQueries = false;
        int int23 = hikariConfig1.acquireIncrement;
        javax.sql.DataSource dataSource24 = null;
        hikariConfig1.setDataSource(dataSource24);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test20902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20902");
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
        hikariConfig20.transactionIsolation = 97;
        boolean boolean23 = hikariConfig20.isReadOnly;
        hikariConfig20.setJdbcUrl("HikariPool-394");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test20903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20903");
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
        long long21 = hikariConfig1.maxLifetime;
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.dataSource = dataSource22;
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55874" + "'", str9, "HikariPool-55874");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
    }

    @Test
    public void test20904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20904");
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
        int int17 = hikariConfig1.minPoolSize;
        java.util.Properties properties18 = hikariConfig1.dataSourceProperties;
        hikariConfig1.acquireRetries = 0;
        hikariConfig1.setIsolateInternalQueries(false);
        long long23 = hikariConfig1.getIdleTimeout();
        int int24 = hikariConfig1.acquireRetries;
        hikariConfig1.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test20905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20905");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource6 = hikariConfig1.dataSource;
        boolean boolean7 = hikariConfig1.isReadOnly;
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test20906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20906");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-77");
        boolean boolean10 = hikariConfig1.isReadOnly;
        int int11 = hikariConfig1.getMinimumPoolSize();
        int int12 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 1800000L;
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20907");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-77");
        boolean boolean10 = hikariConfig1.isReadOnly;
        int int11 = hikariConfig1.getMinimumPoolSize();
        int int12 = hikariConfig1.getTransactionIsolation();
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        java.lang.Class<?> wildcardClass14 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test20908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20908");
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
        hikariConfig1.setReadOnly(false);
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean20 = hikariConfig19.isRegisterMbeans;
        boolean boolean21 = hikariConfig19.isRegisterMbeans();
        hikariConfig19.setConnectionInitSql("HikariPool-7122");
        java.lang.String str24 = hikariConfig19.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test20909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20909");
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
        long long18 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55883" + "'", str9, "HikariPool-55883");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-55883" + "'", str13, "HikariPool-55883");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test20910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20910");
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
        java.util.Properties properties20 = hikariConfig16.getDataSourceProperties();
        hikariConfig16.jdbcUrl = "HikariPool-9101";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test20911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20911");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.setDataSource(dataSource7);
        boolean boolean9 = hikariConfig1.isReadOnly();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str16 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setDataSourceClassName("HikariPool-55729");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test20912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20912");
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
        hikariConfig1.setPoolName("HikariPool-8081");
        java.lang.String str21 = hikariConfig1.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-45" + "'", str21, "HikariPool-45");
    }

    @Test
    public void test20913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20913");
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
        int int14 = hikariConfig10.acquireRetries;
        hikariConfig10.connectionCustomizerClassName = "HikariPool-1349";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test20914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20914");
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
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setInitializationFailFast(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20915");
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
        hikariConfig1.catalog = "HikariPool-1355";
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55899" + "'", str9, "HikariPool-55899");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-55899" + "'", str13, "HikariPool-55899");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test20916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20916");
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
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        long long14 = hikariConfig1.getIdleTimeout();
        java.lang.String str15 = hikariConfig1.catalog;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test20917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20917");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        int int12 = hikariConfig1.transactionIsolation;
        int int13 = hikariConfig1.maxPoolSize;
        int int14 = hikariConfig1.getAcquireRetries();
        long long15 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        long long18 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
    }

    @Test
    public void test20918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20918");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.acquireRetries = 10;
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test20919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20919");
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
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        long long15 = hikariConfig1.getMaxLifetime();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test20920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20920");
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
        int int19 = hikariConfig18.getTransactionIsolation();
        int int20 = hikariConfig18.transactionIsolation;
        hikariConfig18.idleTimeout = 97L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test20921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20921");
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
        hikariConfig1.setLeakDetectionThreshold((long) 32);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1601");
        java.lang.String str21 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.lang.String str24 = hikariConfig23.getDataSourceClassName();
        int int25 = hikariConfig23.getAcquireRetries();
        hikariConfig23.connectionTimeout = 100;
        boolean boolean28 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.idleTimeout = 3L;
        hikariConfig23.isAutoCommit = true;
        boolean boolean33 = hikariConfig23.isReadOnly;
        int int34 = hikariConfig23.transactionIsolation;
        hikariConfig23.setIsolateInternalQueries(false);
        hikariConfig23.connectionCustomizerClassName = "HikariPool-439";
        java.util.Properties properties39 = hikariConfig23.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties39;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties39);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties39);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(properties39);
    }

    @Test
    public void test20922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20922");
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
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        int int17 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        hikariConfig1.idleTimeout = 32;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test20923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20923");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionInitSql = "HikariPool-139";
        java.lang.String str8 = hikariConfig1.getCatalog();
        hikariConfig1.setAcquireRetryDelay(100L);
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        javax.sql.DataSource dataSource12 = hikariConfig1.dataSource;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test20924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20924");
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
        java.lang.String str20 = hikariConfig1.poolName;
        hikariConfig1.acquireRetries = (byte) 0;
        java.lang.String str23 = hikariConfig1.getCatalog();
        long long24 = hikariConfig1.getMaxLifetime();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-55915" + "'", str20, "HikariPool-55915");
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
    }

    @Test
    public void test20925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20925");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.connectionTimeout = ' ';
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxLifetime = (short) 100;
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        java.lang.String str16 = hikariConfig1.getPoolName();
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(properties15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-55916" + "'", str16, "HikariPool-55916");
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test20926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20926");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-28531");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-28531 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20927");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        long long21 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.connectionInitSql = "hi!";
        hikariConfig20.acquireIncrement = (byte) 100;
        hikariConfig20.setJdbcUrl("");
        hikariConfig20.setConnectionTimeout((long) 100);
        hikariConfig20.connectionTestQuery = "HikariPool-167";
        java.lang.String str32 = hikariConfig20.getConnectionInitSql();
        java.util.Properties properties33 = hikariConfig20.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties33;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig35.connectionCustomizerClassName = "HikariPool-539";
        java.lang.String str38 = hikariConfig35.connectionTestQuery;
        long long39 = hikariConfig35.getConnectionTimeout();
        hikariConfig35.transactionIsolationName = "HikariPool-38207";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNull(str38);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 3L + "'", long39 == 3L);
    }

    @Test
    public void test20928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20928");
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
        java.lang.String str15 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str17 = hikariConfig1.catalog;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20929");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-69");
        long long10 = hikariConfig1.idleTimeout;
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setConnectionInitSql("HikariPool-778");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test20930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20930");
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
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        boolean boolean17 = hikariConfig1.isReadOnly;
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test20931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20931");
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
        hikariConfig1.setCatalog("HikariPool-119");
        hikariConfig1.dataSourceClassName = "HikariPool-16857";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
    }

    @Test
    public void test20932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20932");
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
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setIdleTimeout(10L);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setDataSourceClassName("HikariPool-49052");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test20933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20933");
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
        hikariConfig1.jdbcUrl = "HikariPool-1039";
        hikariConfig1.transactionIsolationName = "HikariPool-618";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test20934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20934");
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
        hikariConfig1.setIdleTimeout((long) (byte) 0);
        hikariConfig1.connectionInitSql = "HikariPool-1393";
        long long36 = hikariConfig1.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(properties28);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 97L + "'", long36 == 97L);
    }

    @Test
    public void test20935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20935");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        long long5 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setReadOnly(false);
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.poolName = "HikariPool-175";
        boolean boolean12 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test20936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20936");
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
        int int28 = hikariConfig1.getMinimumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = hikariConfig1.connectionCustomizer;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer29);
    }

    @Test
    public void test20937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20937");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean17 = hikariConfig1.isAutoCommit;
        hikariConfig1.setConnectionInitSql("HikariPool-2411");
        long long20 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
    }

    @Test
    public void test20938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20938");
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
        int int20 = hikariConfig1.acquireIncrement;
        hikariConfig1.setMinimumPoolSize(100);
        hikariConfig1.connectionTimeout = 0L;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55941" + "'", str9, "HikariPool-55941");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-55941" + "'", str13, "HikariPool-55941");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test20939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20939");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        boolean boolean10 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test20940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20940");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        hikariConfig1.setMaxLifetime((long) 97);
        int int13 = hikariConfig1.getAcquireRetries();
        boolean boolean14 = hikariConfig1.isAutoCommit;
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-7770";
        hikariConfig1.idleTimeout = 'a';
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test20941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20941");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.setCatalog("HikariPool-1166");
        hikariConfig1.setAutoCommit(true);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long19 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.connectionInitSql = "hi!";
        hikariConfig18.acquireIncrement = (byte) 100;
        hikariConfig18.setMinimumPoolSize((int) (short) 0);
        hikariConfig18.connectionTestQuery = "";
        hikariConfig18.jdbcUrl = "HikariPool-45";
        hikariConfig18.dataSourceClassName = "hi!";
        hikariConfig18.setIdleTimeout((long) (short) 100);
        java.lang.String str34 = hikariConfig18.jdbcUrl;
        int int35 = hikariConfig18.acquireRetries;
        hikariConfig18.connectionInitSql = "HikariPool-209";
        boolean boolean38 = hikariConfig18.isReadOnly;
        hikariConfig1.addDataSourceProperty("HikariPool-2434", (java.lang.Object) boolean38);
        java.lang.String str40 = hikariConfig1.getPoolName();
        java.lang.String str41 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-45" + "'", str34, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-55944" + "'", str40, "HikariPool-55944");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "HikariPool-1166" + "'", str41, "HikariPool-1166");
    }

    @Test
    public void test20942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20942");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-27435");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-27435 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20943");
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
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long19 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.idleTimeout = (-1);
        hikariConfig18.setMaximumPoolSize((int) 'a');
        long long24 = hikariConfig18.getLeakDetectionThreshold();
        java.lang.String str25 = hikariConfig18.jdbcUrl;
        java.lang.String str26 = hikariConfig18.jdbcUrl;
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        java.lang.String str29 = hikariConfig28.getDataSourceClassName();
        int int30 = hikariConfig28.getAcquireRetries();
        hikariConfig28.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource33 = null;
        hikariConfig28.setDataSource(dataSource33);
        java.lang.String str35 = hikariConfig28.getConnectionTestQuery();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        long long38 = hikariConfig37.getAcquireRetryDelay();
        hikariConfig37.connectionInitSql = "hi!";
        hikariConfig37.acquireIncrement = (byte) 100;
        hikariConfig37.setMinimumPoolSize((int) (short) 0);
        hikariConfig37.connectionTestQuery = "";
        hikariConfig37.jdbcUrl = "HikariPool-45";
        hikariConfig37.isReadOnly = false;
        hikariConfig37.setPoolName("");
        java.lang.String str53 = hikariConfig37.getConnectionTestQuery();
        java.util.Properties properties54 = hikariConfig37.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        hikariConfig28.setDataSourceProperties(properties54);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties54);
        hikariConfig18.dataSourceProperties = properties54;
        java.util.Properties properties59 = hikariConfig18.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        hikariConfig1.dataSourceProperties = properties59;
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties59);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNull(str35);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNotNull(properties59);
    }

    @Test
    public void test20944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20944");
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
        boolean boolean30 = hikariConfig1.isAutoCommit();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test20945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20945");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-36166");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-36166 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20946");
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
        long long16 = hikariConfig1.acquireRetryDelay;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test20947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20947");
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
        hikariConfig1.idleTimeout = (short) -1;
        hikariConfig1.acquireRetries = (-1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test20948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20948");
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
        hikariConfig20.acquireRetries = 100;
        hikariConfig20.setMinimumPoolSize((int) (short) 100);
        boolean boolean25 = hikariConfig20.isJdbc4connectionTest;
        boolean boolean26 = hikariConfig20.isIsolateInternalQueries;
        int int27 = hikariConfig20.acquireIncrement;
        hikariConfig20.setIdleTimeout(35L);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test20949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20949");
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
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean18 = hikariConfig1.isInitializationFailFast;
        java.lang.String str19 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource20 = hikariConfig1.dataSource;
        hikariConfig1.setPoolName("HikariPool-36118");
        hikariConfig1.connectionCustomizerClassName = "HikariPool-939";
        int int25 = hikariConfig1.transactionIsolation;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test20950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20950");
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
        hikariConfig1.setReadOnly(false);
        java.util.Properties properties17 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean20 = hikariConfig19.isRegisterMbeans;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.connectionInitSql = "hi!";
        hikariConfig22.acquireIncrement = (byte) 100;
        hikariConfig22.setMinimumPoolSize((int) (short) 0);
        hikariConfig22.connectionTestQuery = "";
        hikariConfig22.jdbcUrl = "HikariPool-45";
        boolean boolean34 = hikariConfig22.isRegisterMbeans;
        hikariConfig22.isIsolateInternalQueries = true;
        java.util.Properties properties37 = hikariConfig22.getDataSourceProperties();
        hikariConfig19.setDataSourceProperties(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties37);
        java.lang.String str40 = hikariConfig39.catalog;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test20951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20951");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.jdbcUrl;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setTransactionIsolation("hi!");
        hikariConfig10.acquireRetryDelay = '4';
        hikariConfig10.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties18 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig1.dataSourceProperties = properties18;
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long23 = hikariConfig1.acquireRetryDelay;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
    }

    @Test
    public void test20952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20952");
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
        hikariConfig1.setConnectionInitSql("HikariPool-2150");
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-55972" + "'", str23, "HikariPool-55972");
    }

    @Test
    public void test20953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20953");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIdleTimeout(0L);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        java.lang.String str9 = hikariConfig8.getDataSourceClassName();
        hikariConfig8.setTransactionIsolation("hi!");
        hikariConfig8.acquireRetryDelay = '4';
        hikariConfig8.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties16 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig1.setDataSourceProperties(properties16);
        boolean boolean22 = hikariConfig1.isReadOnly();
        java.lang.String str23 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test20954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20954");
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
        boolean boolean18 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.transactionIsolation = 0;
        java.lang.String str21 = hikariConfig1.transactionIsolationName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test20955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20955");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str5 = hikariConfig1.getConnectionInitSql();
        java.lang.String str6 = hikariConfig1.jdbcUrl;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.acquireIncrement = 358;
        hikariConfig1.setConnectionTestQuery("HikariPool-262");
        java.lang.String str15 = hikariConfig1.transactionIsolationName;
        hikariConfig1.jdbcUrl = "HikariPool-2973";
        hikariConfig1.jdbcUrl = "HikariPool-30557";
        long long20 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test20956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20956");
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
        hikariConfig1.leakDetectionThreshold = 1L;
        boolean boolean21 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test20957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20957");
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
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties17);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-55989" + "'", str9, "HikariPool-55989");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test20958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20958");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-219");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-219 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20959");
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
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.idleTimeout = (-1);
        java.util.Properties properties21 = hikariConfig17.getDataSourceProperties();
        long long22 = hikariConfig17.maxLifetime;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.connectionInitSql = "hi!";
        hikariConfig24.acquireIncrement = (byte) 100;
        int int30 = hikariConfig24.minPoolSize;
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        long long33 = hikariConfig32.getAcquireRetryDelay();
        hikariConfig32.connectionInitSql = "hi!";
        hikariConfig32.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig32.transactionIsolation = (byte) 0;
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        long long42 = hikariConfig41.getAcquireRetryDelay();
        hikariConfig41.idleTimeout = (-1);
        java.util.Properties properties45 = hikariConfig41.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig32.setDataSourceProperties(properties45);
        hikariConfig24.setDataSourceProperties(properties45);
        hikariConfig17.setDataSourceProperties(properties45);
        java.util.Properties properties52 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties52);
        java.util.Properties properties55 = hikariConfig54.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties55;
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        long long60 = hikariConfig59.getAcquireRetryDelay();
        hikariConfig59.connectionInitSql = "hi!";
        hikariConfig59.acquireIncrement = (byte) 100;
        hikariConfig59.setMinimumPoolSize((int) (short) 0);
        hikariConfig59.connectionTestQuery = "";
        hikariConfig59.jdbcUrl = "HikariPool-45";
        boolean boolean71 = hikariConfig59.isRegisterMbeans;
        hikariConfig59.isIsolateInternalQueries = true;
        java.util.Properties properties74 = hikariConfig59.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig75 = new com.zaxxer.hikari.HikariConfig(properties74);
        hikariConfig75.catalog = "HikariPool-400";
        java.lang.String str78 = hikariConfig75.transactionIsolationName;
        int int79 = hikariConfig75.getMinimumPoolSize();
        boolean boolean80 = hikariConfig75.isInitializationFailFast;
        hikariConfig1.addDataSourceProperty("HikariPool-553", (java.lang.Object) boolean80);
        hikariConfig1.setJdbc4ConnectionTest(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNotNull(properties55);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + 32L + "'", long60 == 32L);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(properties74);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test20960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20960");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.connectionTimeout = ' ';
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        java.lang.String str17 = hikariConfig16.getDataSourceClassName();
        hikariConfig16.setTransactionIsolation("hi!");
        hikariConfig16.acquireRetryDelay = '4';
        hikariConfig16.setConnectionCustomizerClassName("");
        java.lang.String str24 = hikariConfig16.getPoolName();
        long long25 = hikariConfig16.getLeakDetectionThreshold();
        java.lang.String str26 = hikariConfig16.connectionInitSql;
        int int27 = hikariConfig16.acquireRetries;
        java.lang.String str28 = hikariConfig16.getPoolName();
        hikariConfig16.setAcquireRetries(60);
        java.lang.String str31 = hikariConfig16.jdbcUrl;
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        long long34 = hikariConfig33.getAcquireRetryDelay();
        hikariConfig33.connectionInitSql = "hi!";
        hikariConfig33.acquireIncrement = (byte) 100;
        hikariConfig33.setMinimumPoolSize((int) (short) 0);
        hikariConfig33.connectionTestQuery = "";
        long long43 = hikariConfig33.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer44 = null;
        hikariConfig33.connectionCustomizer = iConnectionCustomizer44;
        java.lang.String str46 = hikariConfig33.getConnectionTestQuery();
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        long long50 = hikariConfig49.getAcquireRetryDelay();
        hikariConfig49.idleTimeout = (-1);
        java.util.Properties properties53 = hikariConfig49.getDataSourceProperties();
        hikariConfig33.addDataSourceProperty("hi!", (java.lang.Object) properties53);
        hikariConfig16.setDataSourceProperties(properties53);
        hikariConfig14.dataSourceProperties = properties53;
        hikariConfig14.setTransactionIsolation("HikariPool-32036");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-56012" + "'", str24, "HikariPool-56012");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-56012" + "'", str28, "HikariPool-56012");
        org.junit.Assert.assertNull(str31);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3L + "'", long43 == 3L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 32L + "'", long50 == 32L);
        org.junit.Assert.assertNotNull(properties53);
    }

    @Test
    public void test20961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20961");
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
        int int37 = hikariConfig36.acquireIncrement;
        hikariConfig36.setMaximumPoolSize((int) (byte) 0);
        java.lang.String str40 = hikariConfig36.poolName;
        java.lang.String str41 = hikariConfig36.getDataSourceClassName();
        hikariConfig36.isInitializationFailFast = true;
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-56019" + "'", str40, "HikariPool-56019");
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test20962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20962");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout(2147483647L);
        hikariConfig1.setReadOnly(false);
        java.lang.String str10 = hikariConfig1.poolName;
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.acquireRetries = ' ';
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.connectionInitSql = "hi!";
        hikariConfig17.acquireIncrement = (byte) 100;
        hikariConfig17.setMinimumPoolSize((int) (short) 0);
        java.lang.String str25 = hikariConfig17.dataSourceClassName;
        long long26 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.setConnectionTestQuery("HikariPool-114");
        long long29 = hikariConfig17.getMaxLifetime();
        boolean boolean30 = hikariConfig17.isIsolateInternalQueries();
        hikariConfig17.acquireRetries = 0;
        boolean boolean33 = hikariConfig17.isReadOnly();
        boolean boolean34 = hikariConfig17.isReadOnly;
        int int35 = hikariConfig17.getMaximumPoolSize();
        java.util.Properties properties36 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties36);
        javax.sql.DataSource dataSource38 = null;
        hikariConfig1.setDataSource(dataSource38);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-56020" + "'", str10, "HikariPool-56020");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(str25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test20963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20963");
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
        hikariConfig1.isRegisterMbeans = false;
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-17164");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test20964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20964");
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
        hikariConfig1.setCatalog("HikariPool-2261");
        java.lang.String str23 = hikariConfig1.getConnectionInitSql();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test20965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20965");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setTransactionIsolation("HikariPool-1031");
        boolean boolean7 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test20966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20966");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-45299");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-45299 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20967");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig10.connectionCustomizer = iConnectionCustomizer16;
        hikariConfig10.setTransactionIsolation("HikariPool-682");
        long long20 = hikariConfig10.getLeakDetectionThreshold();
        int int21 = hikariConfig10.minPoolSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test20968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20968");
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
        hikariConfig1.isReadOnly = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 2147483647L + "'", long15 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test20969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20969");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        long long11 = hikariConfig1.connectionTimeout;
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isAutoCommit = true;
        int int15 = hikariConfig1.minPoolSize;
        boolean boolean16 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAcquireIncrement((int) 'a');
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test20970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20970");
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
        hikariConfig1.idleTimeout = '#';
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test20971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20971");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.idleTimeout = 3L;
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test20972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20972");
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
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        java.lang.String str17 = hikariConfig16.getDataSourceClassName();
        hikariConfig16.setTransactionIsolation("hi!");
        hikariConfig16.acquireRetryDelay = '4';
        hikariConfig16.setConnectionCustomizerClassName("");
        java.lang.String str24 = hikariConfig16.getPoolName();
        long long25 = hikariConfig16.getLeakDetectionThreshold();
        java.lang.String str26 = hikariConfig16.connectionInitSql;
        int int27 = hikariConfig16.acquireRetries;
        hikariConfig16.setMaxLifetime((long) 97);
        hikariConfig16.setUseInstrumentation(true);
        java.util.Properties properties32 = hikariConfig16.getDataSourceProperties();
        java.util.Properties properties33 = hikariConfig16.getDataSourceProperties();
        hikariConfig14.dataSourceProperties = properties33;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties33);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig35.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-56035" + "'", str24, "HikariPool-56035");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test20973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20973");
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
        int int21 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties22 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        long long24 = hikariConfig23.getConnectionTimeout();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(properties22);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
    }

    @Test
    public void test20974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20974");
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
        boolean boolean19 = hikariConfig18.isAutoCommit();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-56040" + "'", str9, "HikariPool-56040");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test20975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20975");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = (short) 100;
        hikariConfig1.setUseInstrumentation(false);
        boolean boolean10 = hikariConfig1.isAutoCommit();
        int int11 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource12 = hikariConfig1.dataSource;
        int int13 = hikariConfig1.maxPoolSize;
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test20976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20976");
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
        long long18 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.idleTimeout = 1;
        long long21 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test20977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20977");
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
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-56045" + "'", str8, "HikariPool-56045");
        org.junit.Assert.assertNull(iConnectionCustomizer9);
    }

    @Test
    public void test20978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20978");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.connectionInitSql = "HikariPool-1016";
        int int12 = hikariConfig1.acquireIncrement;
        boolean boolean13 = hikariConfig1.isReadOnly();
        hikariConfig1.leakDetectionThreshold = 97;
        hikariConfig1.setAcquireRetryDelay(60L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test20979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20979");
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
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.setLeakDetectionThreshold(35L);
        hikariConfig1.setReadOnly(true);
        boolean boolean22 = hikariConfig1.isRegisterMbeans();
        long long23 = hikariConfig1.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
    }

    @Test
    public void test20980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20980");
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
        hikariConfig1.acquireRetryDelay = (short) 100;
        hikariConfig1.setAcquireRetries((int) 'a');
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test20981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20981");
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
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setTransactionIsolation("HikariPool-1516");
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isInitializationFailFast();
        hikariConfig19.setInitializationFailFast(false);
        java.lang.String str23 = hikariConfig19.getConnectionInitSql();
        java.lang.String str24 = hikariConfig19.jdbcUrl;
        hikariConfig19.setAutoCommit(false);
        hikariConfig19.setMaximumPoolSize(100);
        hikariConfig19.acquireIncrement = 358;
        hikariConfig19.setConnectionTestQuery("HikariPool-262");
        hikariConfig19.setLeakDetectionThreshold(750L);
        java.lang.String str35 = hikariConfig19.getConnectionCustomizerClassName();
        java.lang.String str36 = hikariConfig19.poolName;
        hikariConfig1.addDataSourceProperty("HikariPool-30046", (java.lang.Object) hikariConfig19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str35);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-56051" + "'", str36, "HikariPool-56051");
    }

    @Test
    public void test20982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20982");
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
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        boolean boolean17 = hikariConfig1.isRegisterMbeans;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20983");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setAcquireRetryDelay((long) 0);
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setJdbc4ConnectionTest(true);
        boolean boolean17 = hikariConfig1.isReadOnly;
        hikariConfig1.setInitializationFailFast(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test20984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20984");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.getTransactionIsolation();
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.maxLifetime = 'a';
        hikariConfig1.setConnectionInitSql("HikariPool-29123");
        hikariConfig1.dataSourceClassName = "HikariPool-309";
        hikariConfig1.minPoolSize = (byte) 0;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test20985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20985");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-46228");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-46228 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20986");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-46644");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-46644 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20987");
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
        hikariConfig16.transactionIsolation = (short) 0;
        hikariConfig16.setPoolName("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test20988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20988");
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
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        hikariConfig1.addDataSourceProperty("HikariPool-41802", (java.lang.Object) "HikariPool-37646");
        long long24 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-56060" + "'", str9, "HikariPool-56060");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource20);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
    }

    @Test
    public void test20989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20989");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = null;
        hikariConfig25.connectionCustomizer = iConnectionCustomizer29;
        hikariConfig25.acquireRetryDelay = 100;
        hikariConfig25.isRegisterMbeans = true;
        long long35 = hikariConfig25.getLeakDetectionThreshold();
        java.lang.String str36 = hikariConfig25.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test20990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20990");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setCatalog("hi!");
        int int11 = hikariConfig1.getAcquireRetries();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean13 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test20991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20991");
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
        java.lang.String str38 = hikariConfig37.connectionInitSql;
        hikariConfig37.setMaxLifetime((long) 100);
        hikariConfig37.setIdleTimeout((long) 1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test20992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20992");
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
        int int17 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 32;
        hikariConfig1.setAcquireRetries((int) (short) 0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setConnectionInitSql("HikariPool-12316");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = hikariConfig1.connectionCustomizer;
        java.lang.String str27 = hikariConfig1.getJdbcUrl();
        boolean boolean28 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45" + "'", str16, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test20993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20993");
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
        hikariConfig10.connectionTimeout = (-1L);
        long long16 = hikariConfig10.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test20994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20994");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        long long3 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig1.setDataSource(dataSource4);
        hikariConfig1.setMaxLifetime(100L);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
    }

    @Test
    public void test20995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20995");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.jdbcUrl = "HikariPool-609";
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setConnectionTestQuery("HikariPool-26923");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test20996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20996");
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
        hikariConfig1.minPoolSize = 97;
        hikariConfig1.isAutoCommit = true;
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.isReadOnly = true;
        java.lang.String str20 = hikariConfig1.getJdbcUrl();
        hikariConfig1.connectionInitSql = "HikariPool-510";
        java.lang.String str23 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test20997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20997");
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
        hikariConfig1.setJdbcUrl("HikariPool-97");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test20998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20998");
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
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str21 = hikariConfig1.getPoolName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-56085" + "'", str21, "HikariPool-56085");
    }

    @Test
    public void test20999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test20999");
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
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str15 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test21000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test21000");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-44862");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-44862 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}
