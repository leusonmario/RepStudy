import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest45 {

    public static boolean debug = false;

    @Test
    public void test22501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22501");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.dataSourceClassName = "HikariPool-3259";
        hikariConfig0.setReadOnly(false);
        boolean boolean17 = hikariConfig0.isAutoCommit;
        javax.sql.DataSource dataSource18 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test22502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22502");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setCatalog("HikariPool-93");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.dataSourceClassName = "HikariPool-1473";
        hikariConfig0.maxLifetime = 0L;
        hikariConfig0.setCatalog("HikariPool-26894");
        javax.sql.DataSource dataSource21 = null;
        hikariConfig0.setDataSource(dataSource21);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test22503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22503");
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
        hikariConfig0.poolName = "";
        long long31 = hikariConfig0.getIdleTimeout();
        boolean boolean32 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test22504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22504");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        boolean boolean9 = hikariConfig0.isReadOnly;
        int int10 = hikariConfig0.getAcquireRetries();
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.setDataSourceClassName("HikariPool-1067");
        hikariConfig0.transactionIsolationName = "HikariPool-47";
        hikariConfig0.setMaximumPoolSize(1);
        hikariConfig0.setMaximumPoolSize(35);
        int int21 = hikariConfig0.getMinimumPoolSize();
        int int22 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test22505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22505");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        long long4 = hikariConfig0.maxLifetime;
        long long5 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.transactionIsolation = (byte) 1;
        boolean boolean8 = hikariConfig0.isJdbc4connectionTest;
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test22506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22506");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.leakDetectionThreshold = 5000L;
        long long5 = hikariConfig0.idleTimeout;
        int int6 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer8;
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test22507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22507");
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
        int int13 = hikariConfig0.getMinimumPoolSize();
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.Class<?> wildcardClass15 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test22508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22508");
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
        java.lang.String str27 = hikariConfig0.connectionTestQuery;
        java.lang.String str28 = hikariConfig0.getDataSourceClassName();
        int int29 = hikariConfig0.acquireRetries;
        java.lang.String str30 = hikariConfig0.poolName;
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-51679" + "'", str30, "HikariPool-51679");
    }

    @Test
    public void test22509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22509");
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
        int int42 = hikariConfig0.minPoolSize;
        java.lang.String str43 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.catalog = "HikariPool-2905";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer46 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean49 = hikariConfig0.isInitializationFailFast;
        int int50 = hikariConfig0.getMaximumPoolSize();
        long long51 = hikariConfig0.connectionTimeout;
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(iConnectionCustomizer46);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 60 + "'", int50 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
    }

    @Test
    public void test22510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22510");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setCatalog("HikariPool-135");
        hikariConfig0.setMinimumPoolSize((int) '#');
        hikariConfig0.catalog = "HikariPool-823";
        long long15 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setPoolName("HikariPool-3888");
        long long18 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test22511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22511");
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
        long long46 = hikariConfig0.getConnectionTimeout();
        long long47 = hikariConfig0.getLeakDetectionThreshold();
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
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 32L + "'", long46 == 32L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 60L + "'", long47 == 60L);
    }

    @Test
    public void test22512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22512");
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
        hikariConfig0.isRegisterMbeans = true;
        boolean boolean16 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setConnectionTestQuery("HikariPool-1109");
        int int19 = hikariConfig0.transactionIsolation;
        hikariConfig0.isAutoCommit = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test22513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22513");
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
        hikariConfig0.maxLifetime = 0L;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str30 = hikariConfig29.getConnectionInitSql();
        long long31 = hikariConfig29.getLeakDetectionThreshold();
        hikariConfig29.leakDetectionThreshold = (-1);
        long long34 = hikariConfig29.acquireRetryDelay;
        long long35 = hikariConfig29.getIdleTimeout();
        hikariConfig29.acquireIncrement = '4';
        javax.sql.DataSource dataSource38 = hikariConfig29.getDataSource();
        hikariConfig29.acquireRetries = 35;
        java.util.Properties properties41 = hikariConfig29.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        hikariConfig0.setDataSourceProperties(properties41);
        hikariConfig0.isInitializationFailFast = true;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-51691" + "'", str3, "HikariPool-51691");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-48" + "'", str26, "HikariPool-48");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test22514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22514");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.acquireIncrement = '4';
        hikariConfig0.minPoolSize = (byte) 10;
        hikariConfig0.connectionTimeout = 32L;
        hikariConfig0.maxPoolSize = 60;
        long long12 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test22515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22515");
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
        long long15 = hikariConfig0.getMaxLifetime();
        hikariConfig0.maxLifetime = (short) 100;
        hikariConfig0.setJdbcUrl("HikariPool-858");
        java.lang.String str20 = hikariConfig0.catalog;
        hikariConfig0.setMaxLifetime((long) 35);
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test22516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22516");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        int int8 = hikariConfig0.acquireIncrement;
        int int9 = hikariConfig0.minPoolSize;
        hikariConfig0.poolName = "HikariPool-132";
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        long long14 = hikariConfig12.getLeakDetectionThreshold();
        int int15 = hikariConfig12.getMaximumPoolSize();
        long long16 = hikariConfig12.getIdleTimeout();
        int int17 = hikariConfig12.maxPoolSize;
        java.lang.String str18 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig12.dataSourceProperties;
        hikariConfig0.setDataSourceProperties(properties19);
        hikariConfig0.connectionTimeout = '4';
        long long23 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isAutoCommit = false;
        java.lang.String str26 = hikariConfig0.getPoolName();
        hikariConfig0.setDataSourceClassName("HikariPool-22597");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties19);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-132" + "'", str26, "HikariPool-132");
    }

    @Test
    public void test22517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22517");
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
        hikariConfig0.connectionTimeout = 0L;
        boolean boolean30 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.leakDetectionThreshold = 100;
        hikariConfig0.setAcquireRetryDelay(0L);
        boolean boolean35 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.maxLifetime = '#';
        boolean boolean40 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.transactionIsolationName = "HikariPool-213";
        int int43 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test22518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22518");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        int int7 = hikariConfig0.acquireIncrement;
        hikariConfig0.setMaximumPoolSize(52);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test22519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22519");
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
        hikariConfig0.setAcquireRetryDelay(35L);
        java.lang.String str23 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test22520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22520");
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
        hikariConfig0.catalog = "";
        hikariConfig0.catalog = "HikariPool-1056";
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test22521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22521");
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
        int int20 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
    }

    @Test
    public void test22522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22522");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.connectionTestQuery = "HikariPool-327";
        int int11 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setUseInstrumentation(false);
        int int14 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test22523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22523");
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
        hikariConfig0.dataSourceClassName = "HikariPool-169";
        boolean boolean18 = hikariConfig0.isRegisterMbeans;
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        int int20 = hikariConfig0.maxPoolSize;
        int int21 = hikariConfig0.getMaximumPoolSize();
        java.util.Properties properties22 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.connectionTestQuery = "HikariPool-16418";
        long long25 = hikariConfig0.idleTimeout;
        int int26 = hikariConfig0.getMinimumPoolSize();
        long long27 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-51707" + "'", str15, "HikariPool-51707");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNotNull(properties22);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
    }

    @Test
    public void test22524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22524");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.minPoolSize = 100;
        java.lang.String str11 = hikariConfig0.getDataSourceClassName();
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries;
        javax.sql.DataSource dataSource13 = hikariConfig0.dataSource;
        hikariConfig0.isIsolateInternalQueries = true;
        boolean boolean16 = hikariConfig0.isReadOnly;
        hikariConfig0.acquireRetries = (byte) 0;
        boolean boolean19 = hikariConfig0.isAutoCommit;
        hikariConfig0.minPoolSize = 35;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test22525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22525");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        long long11 = hikariConfig0.maxLifetime;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-596";
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        hikariConfig0.setConnectionInitSql("");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test22526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22526");
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
        hikariConfig0.setIdleTimeout((long) 'a');
        java.lang.String str73 = hikariConfig0.connectionTestQuery;
        hikariConfig0.isReadOnly = true;
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
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test22527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22527");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setDataSourceClassName("HikariPool-174");
        int int7 = hikariConfig0.transactionIsolation;
        hikariConfig0.setCatalog("HikariPool-100");
        hikariConfig0.setTransactionIsolation("HikariPool-220");
        hikariConfig0.setInitializationFailFast(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer14;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test22528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22528");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.jdbcUrl = "HikariPool-16";
        hikariConfig0.setCatalog("HikariPool-910");
        boolean boolean15 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test22529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22529");
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
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        long long18 = hikariConfig0.maxLifetime;
        java.lang.String str19 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-4035";
        long long22 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-51718" + "'", str13, "HikariPool-51718");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test22530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22530");
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
        hikariConfig0.isRegisterMbeans = false;
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
        java.util.Properties properties42 = hikariConfig23.getDataSourceProperties();
        hikariConfig23.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties45 = hikariConfig23.getDataSourceProperties();
        javax.sql.DataSource dataSource46 = hikariConfig23.getDataSource();
        java.lang.String str47 = hikariConfig23.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource49 = hikariConfig48.getDataSource();
        hikariConfig48.setConnectionTestQuery("");
        java.lang.String str52 = hikariConfig48.catalog;
        java.util.Properties properties53 = hikariConfig48.dataSourceProperties;
        hikariConfig23.dataSourceProperties = properties53;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties53);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource57 = hikariConfig56.getDataSource();
        hikariConfig56.setConnectionTestQuery("");
        hikariConfig56.setInitializationFailFast(false);
        hikariConfig56.catalog = "";
        javax.sql.DataSource dataSource64 = null;
        hikariConfig56.dataSource = dataSource64;
        javax.sql.DataSource dataSource66 = null;
        hikariConfig56.dataSource = dataSource66;
        int int68 = hikariConfig56.maxPoolSize;
        long long69 = hikariConfig56.getIdleTimeout();
        javax.sql.DataSource dataSource70 = hikariConfig56.dataSource;
        hikariConfig56.setDataSourceClassName("HikariPool-122");
        java.util.Properties properties73 = hikariConfig56.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties73);
        hikariConfig55.setDataSourceProperties(properties73);
        hikariConfig0.dataSourceProperties = properties73;
        int int77 = hikariConfig0.maxPoolSize;
        int int78 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 100L + "'", long39 == 100L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(dataSource49);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNull(dataSource57);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 60 + "'", int68 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long69 + "' != '" + (-1L) + "'", long69 == (-1L));
        org.junit.Assert.assertNull(dataSource70);
        org.junit.Assert.assertNotNull(properties73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 35 + "'", int77 == 35);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test22531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22531");
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
        hikariConfig0.isAutoCommit = false;
        boolean boolean29 = hikariConfig0.isRegisterMbeans();
        boolean boolean30 = hikariConfig0.isRegisterMbeans();
        java.lang.String str31 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test22532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22532");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        hikariConfig0.setJdbcUrl("HikariPool-47");
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        hikariConfig0.isRegisterMbeans = false;
        long long18 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test22533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22533");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        hikariConfig0.connectionTimeout = 'a';
        hikariConfig0.minPoolSize = (byte) -1;
        hikariConfig0.minPoolSize = (short) 10;
        hikariConfig0.setPoolName("HikariPool-201");
        int int18 = hikariConfig0.acquireRetries;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str21 = hikariConfig20.getConnectionInitSql();
        long long22 = hikariConfig20.getLeakDetectionThreshold();
        hikariConfig20.leakDetectionThreshold = (-1);
        int int25 = hikariConfig20.acquireIncrement;
        hikariConfig20.setInitializationFailFast(true);
        java.lang.String str28 = hikariConfig20.getPoolName();
        hikariConfig20.setLeakDetectionThreshold((long) (short) 100);
        java.lang.String str31 = hikariConfig20.catalog;
        boolean boolean32 = hikariConfig20.isJdbc4connectionTest;
        hikariConfig0.addDataSourceProperty("HikariPool-3673", (java.lang.Object) hikariConfig20);
        hikariConfig20.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-51731" + "'", str28, "HikariPool-51731");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test22534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22534");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.minPoolSize;
        java.lang.String str2 = hikariConfig0.catalog;
        hikariConfig0.setPoolName("HikariPool-95");
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.poolName;
        int int7 = hikariConfig0.acquireRetries;
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-95" + "'", str6, "HikariPool-95");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test22535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22535");
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
        hikariConfig0.setMaxLifetime(750L);
        hikariConfig0.connectionTestQuery = "HikariPool-3023";
        int int19 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test22536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22536");
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
        javax.sql.DataSource dataSource22 = hikariConfig0.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNull(dataSource22);
    }

    @Test
    public void test22537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22537");
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
        java.lang.String str23 = hikariConfig0.transactionIsolationName;
        int int24 = hikariConfig0.transactionIsolation;
        hikariConfig0.acquireRetryDelay = (byte) 10;
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test22538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22538");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean4 = hikariConfig0.isAutoCommit();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test22539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22539");
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
        int int40 = hikariConfig0.acquireIncrement;
        hikariConfig0.isReadOnly = false;
        hikariConfig0.setConnectionInitSql("");
        javax.sql.DataSource dataSource45 = null;
        hikariConfig0.setDataSource(dataSource45);
        javax.sql.DataSource dataSource47 = null;
        hikariConfig0.setDataSource(dataSource47);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test22540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22540");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        int int7 = hikariConfig0.acquireIncrement;
        long long8 = hikariConfig0.getMaxLifetime();
        int int9 = hikariConfig0.getMinimumPoolSize();
        long long10 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test22541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22541");
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
        hikariConfig0.setCatalog("HikariPool-55");
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        java.util.Properties properties17 = hikariConfig0.getDataSourceProperties();
        java.lang.String str18 = hikariConfig0.connectionTestQuery;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str20 = hikariConfig19.getConnectionInitSql();
        long long21 = hikariConfig19.getLeakDetectionThreshold();
        hikariConfig19.leakDetectionThreshold = (-1);
        long long24 = hikariConfig19.acquireRetryDelay;
        long long25 = hikariConfig19.getIdleTimeout();
        long long26 = hikariConfig19.leakDetectionThreshold;
        java.lang.String str27 = hikariConfig19.getCatalog();
        int int28 = hikariConfig19.acquireRetries;
        java.util.Properties properties29 = hikariConfig19.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig0.dataSourceProperties = properties29;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test22542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22542");
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
        hikariConfig0.setAutoCommit(false);
        boolean boolean46 = hikariConfig0.isInitializationFailFast();
        boolean boolean47 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.connectionTimeout = (byte) 0;
        hikariConfig0.setMaxLifetime(10L);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test22543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22543");
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
        hikariConfig0.dataSourceClassName = "HikariPool-49642";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test22544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22544");
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
        hikariConfig0.setAutoCommit(false);
        long long26 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.leakDetectionThreshold = 0L;
        boolean boolean31 = hikariConfig0.isReadOnly();
        java.util.Properties properties32 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIdleTimeout((long) (short) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test22545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22545");
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
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        int int16 = hikariConfig0.acquireRetries;
        long long17 = hikariConfig0.leakDetectionThreshold;
        java.util.Properties properties18 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test22546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22546");
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
        hikariConfig0.transactionIsolationName = "HikariPool-331";
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.connectionTimeout = (short) 100;
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        java.util.Properties properties27 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test22547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22547");
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
        java.util.Properties properties17 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long20 = hikariConfig0.getConnectionTimeout();
        javax.sql.DataSource dataSource21 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test22548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22548");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.acquireRetries = 0;
        hikariConfig0.connectionInitSql = "HikariPool-84";
        hikariConfig0.setTransactionIsolation("HikariPool-853");
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.getConnectionInitSql();
        hikariConfig13.setMaxLifetime(35L);
        hikariConfig13.setAutoCommit(false);
        int int19 = hikariConfig13.getTransactionIsolation();
        long long20 = hikariConfig13.connectionTimeout;
        boolean boolean21 = hikariConfig13.isRegisterMbeans;
        java.util.Properties properties22 = hikariConfig13.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties22);
        long long24 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.isJdbc4connectionTest = false;
        int int27 = hikariConfig0.acquireRetries;
        hikariConfig0.setCatalog("HikariPool-1968");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test22549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22549");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setMinimumPoolSize((int) ' ');
        int int11 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setMaximumPoolSize(32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test22550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22550");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.connectionTimeout = 0L;
        java.lang.String str11 = hikariConfig0.catalog;
        java.lang.String str12 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (short) 0);
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test22551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22551");
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
        int int23 = hikariConfig0.maxPoolSize;
        hikariConfig0.connectionTestQuery = "HikariPool-21390";
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test22552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22552");
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
        hikariConfig0.setDataSourceClassName("HikariPool-38");
        hikariConfig0.isAutoCommit = false;
        java.lang.String str27 = hikariConfig0.getConnectionTestQuery();
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
    public void test22553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22553");
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
        java.lang.String str21 = hikariConfig8.jdbcUrl;
        java.lang.String str22 = hikariConfig8.getPoolName();
        java.lang.String str23 = hikariConfig8.getJdbcUrl();
        java.lang.String str24 = hikariConfig8.jdbcUrl;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-51764" + "'", str22, "HikariPool-51764");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test22554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22554");
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
        boolean boolean14 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22555");
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
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer15;
        long long17 = hikariConfig0.leakDetectionThreshold;
        int int18 = hikariConfig0.transactionIsolation;
        hikariConfig0.connectionInitSql = "HikariPool-4386";
        hikariConfig0.acquireRetries = 1;
        hikariConfig0.setConnectionInitSql("HikariPool-2183");
        hikariConfig0.jdbcUrl = "HikariPool-1025";
        int int27 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test22556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22556");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-34505");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-34505 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22557");
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
        hikariConfig8.setDataSourceClassName("HikariPool-237");
        boolean boolean23 = hikariConfig8.isInitializationFailFast;
        hikariConfig8.setIsolateInternalQueries(true);
        boolean boolean26 = hikariConfig8.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test22558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22558");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-73");
        hikariConfig0.jdbcUrl = "HikariPool-132";
        hikariConfig0.setConnectionTestQuery("HikariPool-642");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        hikariConfig0.setDataSourceClassName("HikariPool-1343");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test22559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22559");
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
        int int19 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.minPoolSize = 10;
        java.lang.String str22 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test22560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22560");
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
        java.lang.String str14 = hikariConfig0.connectionInitSql;
        int int15 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str16 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test22561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22561");
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
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setDataSourceClassName("HikariPool-491");
        int int20 = hikariConfig0.acquireRetries;
        boolean boolean21 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str22 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setLeakDetectionThreshold((long) 'a');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test22562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22562");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.setIdleTimeout(100L);
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str12 = hikariConfig0.jdbcUrl;
        hikariConfig0.connectionInitSql = "HikariPool-24185";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test22563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22563");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        hikariConfig0.acquireRetries = (byte) 100;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.jdbcUrl = "HikariPool-141";
        hikariConfig0.transactionIsolation = '4';
        hikariConfig0.poolName = "HikariPool-46071";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22564");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        hikariConfig0.connectionTimeout = 'a';
        hikariConfig0.setTransactionIsolation("HikariPool-2924");
        hikariConfig0.connectionTimeout = 100L;
        java.lang.String str16 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test22565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22565");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.transactionIsolation = 0;
        long long4 = hikariConfig0.maxLifetime;
        boolean boolean5 = hikariConfig0.isAutoCommit();
        hikariConfig0.setMaxLifetime((long) 60);
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.poolName = "HikariPool-9353";
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test22566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22566");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(false);
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setInitializationFailFast(true);
        long long7 = hikariConfig0.maxLifetime;
        java.lang.String str8 = hikariConfig0.catalog;
        long long9 = hikariConfig0.connectionTimeout;
        hikariConfig0.setTransactionIsolation("HikariPool-17248");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test22567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22567");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1052");
        hikariConfig0.acquireRetries = (short) 0;
        hikariConfig0.isReadOnly = true;
        boolean boolean16 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test22568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22568");
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
        java.lang.String str27 = hikariConfig0.connectionTestQuery;
        java.lang.String str28 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.setConnectionTestQuery("HikariPool-1026");
        hikariConfig0.idleTimeout = 1;
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test22569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22569");
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
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource34 = hikariConfig33.getDataSource();
        hikariConfig33.setConnectionTestQuery("");
        hikariConfig33.setInitializationFailFast(false);
        long long39 = hikariConfig33.getConnectionTimeout();
        java.util.Properties properties40 = hikariConfig33.dataSourceProperties;
        int int41 = hikariConfig33.maxPoolSize;
        boolean boolean42 = hikariConfig33.isInitializationFailFast();
        java.util.Properties properties43 = hikariConfig33.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig26.setDataSourceProperties(properties43);
        boolean boolean46 = hikariConfig26.isRegisterMbeans;
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
        org.junit.Assert.assertNull(dataSource34);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 60 + "'", int41 == 60);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test22570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22570");
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
        int int15 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer16;
        hikariConfig0.poolName = "";
        hikariConfig0.dataSourceClassName = "HikariPool-19395";
        hikariConfig0.leakDetectionThreshold = 0;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-51790" + "'", str13, "HikariPool-51790");
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test22571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22571");
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
        java.lang.String str25 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test22572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22572");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        java.lang.String str3 = hikariConfig0.getPoolName();
        int int4 = hikariConfig0.maxPoolSize;
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.String str7 = hikariConfig0.catalog;
        hikariConfig0.maxLifetime = 'a';
        int int10 = hikariConfig0.transactionIsolation;
        hikariConfig0.setPoolName("HikariPool-3664");
        int int13 = hikariConfig0.acquireRetries;
        int int14 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 100;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-51792" + "'", str3, "HikariPool-51792");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test22573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22573");
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
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.poolName = "HikariPool-1110";
        hikariConfig0.setPoolName("HikariPool-751");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test22574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22574");
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
        javax.sql.DataSource dataSource16 = hikariConfig0.getDataSource();
        boolean boolean17 = hikariConfig0.isJdbc4connectionTest;
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.setDataSource(dataSource18);
        hikariConfig0.setJdbcUrl("HikariPool-28600");
        boolean boolean22 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test22575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22575");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        hikariConfig0.connectionCustomizerClassName = "";
        boolean boolean11 = hikariConfig0.isJdbc4connectionTest;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.setInitializationFailFast(false);
        hikariConfig12.poolName = "";
        int int20 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setDataSourceClassName("HikariPool-38");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig12.connectionCustomizer = iConnectionCustomizer23;
        java.util.Properties properties25 = hikariConfig12.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties25);
        boolean boolean27 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test22576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22576");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        int int10 = hikariConfig0.getMaximumPoolSize();
        boolean boolean11 = hikariConfig0.isRegisterMbeans;
        long long12 = hikariConfig0.idleTimeout;
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str16 = hikariConfig0.connectionTestQuery;
        boolean boolean17 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test22577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22577");
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
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.acquireIncrement = (byte) 0;
        java.util.Properties properties24 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setAcquireRetries(32);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test22578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22578");
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
        boolean boolean22 = hikariConfig0.isAutoCommit();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setReadOnly(true);
        int int27 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.acquireIncrement = (short) 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test22579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22579");
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
        java.util.Properties properties16 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test22580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22580");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-295");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig0.connectionCustomizer;
        java.util.Properties properties12 = hikariConfig0.dataSourceProperties;
        hikariConfig0.isReadOnly = false;
        boolean boolean15 = hikariConfig0.isRegisterMbeans;
        boolean boolean16 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test22581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22581");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        java.lang.String str11 = hikariConfig0.connectionCustomizerClassName;
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean13 = hikariConfig0.isAutoCommit;
        hikariConfig0.setTransactionIsolation("HikariPool-1473");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test22582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22582");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setRegisterMbeans(false);
        long long14 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1727");
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.dataSource = dataSource17;
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        java.lang.String str20 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-1727" + "'", str20, "HikariPool-1727");
    }

    @Test
    public void test22583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22583");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig0.connectionCustomizerClassName;
        int int14 = hikariConfig0.getTransactionIsolation();
        long long15 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test22584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22584");
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
        boolean boolean24 = hikariConfig0.isAutoCommit;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test22585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22585");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        hikariConfig0.maxPoolSize = (short) 100;
        hikariConfig0.setAcquireRetries((int) '4');
        hikariConfig0.setJdbcUrl("HikariPool-340");
        hikariConfig0.transactionIsolationName = "HikariPool-618";
        hikariConfig0.setJdbcUrl("HikariPool-811");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test22586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22586");
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
        com.zaxxer.hikari.HikariConfig hikariConfig91 = new com.zaxxer.hikari.HikariConfig(properties85);
        hikariConfig91.isIsolateInternalQueries = true;
        long long94 = hikariConfig91.getIdleTimeout();
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
// flaky:         org.junit.Assert.assertTrue("'" + long94 + "' != '" + (-1L) + "'", long94 == (-1L));
    }

    @Test
    public void test22587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22587");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isAutoCommit();
        java.lang.String str10 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setTransactionIsolation("HikariPool-236");
        boolean boolean13 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setJdbcUrl("HikariPool-40150");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test22588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22588");
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
        long long16 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str17 = hikariConfig0.getCatalog();
        long long18 = hikariConfig0.idleTimeout;
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setJdbcUrl("HikariPool-2741");
        boolean boolean23 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test22589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22589");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-73");
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setMinimumPoolSize(52);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test22590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22590");
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
        hikariConfig0.setAcquireRetries(0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test22591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22591");
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
        long long43 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str44 = hikariConfig0.connectionCustomizerClassName;
        boolean boolean45 = hikariConfig0.isAutoCommit;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str47 = hikariConfig46.getConnectionInitSql();
        hikariConfig46.acquireIncrement = 0;
        hikariConfig46.maxLifetime = 100;
        long long52 = hikariConfig46.getConnectionTimeout();
        hikariConfig46.setConnectionTestQuery("HikariPool-16");
        int int55 = hikariConfig46.acquireRetries;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource57 = hikariConfig56.getDataSource();
        hikariConfig56.setConnectionTestQuery("");
        hikariConfig56.setInitializationFailFast(false);
        java.lang.String str62 = hikariConfig56.getConnectionInitSql();
        hikariConfig56.setReadOnly(true);
        javax.sql.DataSource dataSource65 = null;
        hikariConfig56.setDataSource(dataSource65);
        java.util.Properties properties67 = hikariConfig56.getDataSourceProperties();
        hikariConfig46.dataSourceProperties = properties67;
        hikariConfig0.dataSourceProperties = properties67;
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties67);
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
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str47);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + 32L + "'", long52 == 32L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNull(dataSource57);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(properties67);
    }

    @Test
    public void test22592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22592");
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
        long long15 = hikariConfig0.maxLifetime;
        hikariConfig0.setIsolateInternalQueries(true);
        long long18 = hikariConfig0.getIdleTimeout();
        long long19 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str20 = hikariConfig0.getCatalog();
        hikariConfig0.maxPoolSize = (short) 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test22593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22593");
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
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        hikariConfig0.setReadOnly(true);
        int int22 = hikariConfig0.maxPoolSize;
        long long23 = hikariConfig0.getMaxLifetime();
        java.lang.String str24 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test22594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22594");
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
        boolean boolean45 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setDataSourceClassName("HikariPool-10697");
        boolean boolean48 = hikariConfig0.isInitializationFailFast;
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test22595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22595");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.dataSource = dataSource6;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(true);
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        java.lang.String str13 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test22596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22596");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        boolean boolean8 = hikariConfig0.isReadOnly();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str10 = hikariConfig0.transactionIsolationName;
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22597");
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
        hikariConfig0.connectionCustomizerClassName = "HikariPool-97";
        hikariConfig0.setPoolName("HikariPool-332");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer19;
        java.lang.String str21 = hikariConfig0.getPoolName();
        hikariConfig0.connectionInitSql = "HikariPool-12026";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-332" + "'", str21, "HikariPool-332");
    }

    @Test
    public void test22598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22598");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean11 = hikariConfig0.isRegisterMbeans;
        boolean boolean12 = hikariConfig0.isAutoCommit();
        int int13 = hikariConfig0.getAcquireIncrement();
        long long14 = hikariConfig0.getIdleTimeout();
        hikariConfig0.poolName = "HikariPool-633";
        int int17 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test22599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22599");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.catalog = "HikariPool-978";
        long long11 = hikariConfig0.acquireRetryDelay;
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test22600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22600");
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
        java.lang.String str17 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str20 = hikariConfig19.getConnectionInitSql();
        hikariConfig19.setMaxLifetime(35L);
        hikariConfig19.setAutoCommit(false);
        hikariConfig19.transactionIsolationName = "hi!";
        hikariConfig19.setInitializationFailFast(false);
        hikariConfig19.leakDetectionThreshold = 97L;
        long long31 = hikariConfig19.leakDetectionThreshold;
        int int32 = hikariConfig19.minPoolSize;
        java.util.Properties properties33 = hikariConfig19.dataSourceProperties;
        hikariConfig0.addDataSourceProperty("HikariPool-956", (java.lang.Object) properties33);
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test22601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22601");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setMinimumPoolSize((int) ' ');
        int int11 = hikariConfig0.getAcquireRetries();
        long long12 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test22602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22602");
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
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.setDataSource(dataSource18);
        java.lang.String str20 = hikariConfig0.getPoolName();
        long long21 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-51851" + "'", str20, "HikariPool-51851");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test22603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22603");
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
        boolean boolean22 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionInitSql("HikariPool-2811");
        int int25 = hikariConfig0.maxPoolSize;
        hikariConfig0.setAcquireIncrement((int) '4');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
    }

    @Test
    public void test22604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22604");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        hikariConfig0.connectionTimeout = 100;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime(52L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test22605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22605");
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
        hikariConfig26.connectionCustomizerClassName = "HikariPool-1087";
        hikariConfig26.setConnectionInitSql("HikariPool-2264");
        boolean boolean35 = hikariConfig26.isRegisterMbeans;
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test22606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22606");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.connectionCustomizerClassName = "";
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig11.getCatalog();
        java.util.Properties properties20 = hikariConfig11.dataSourceProperties;
        int int21 = hikariConfig11.minPoolSize;
        long long22 = hikariConfig11.getMaxLifetime();
        hikariConfig11.maxLifetime = 10L;
        hikariConfig11.connectionInitSql = "";
        hikariConfig11.isAutoCommit = false;
        hikariConfig11.isReadOnly = true;
        java.util.Properties properties31 = hikariConfig11.dataSourceProperties;
        hikariConfig0.setDataSourceProperties(properties31);
        javax.sql.DataSource dataSource33 = null;
        hikariConfig0.setDataSource(dataSource33);
        java.lang.String str35 = hikariConfig0.getConnectionCustomizerClassName();
        int int36 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test22607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22607");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        long long10 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setJdbcUrl("HikariPool-1820");
        java.lang.String str17 = hikariConfig0.getCatalog();
        java.util.Properties properties18 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test22608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22608");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setMaxLifetime((long) '4');
        int int6 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.acquireIncrement = '4';
        hikariConfig0.catalog = "HikariPool-5219";
        hikariConfig0.setAcquireRetryDelay((long) 'a');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test22609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22609");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-974");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-974 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22610");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.dataSourceClassName = "HikariPool-25";
        hikariConfig0.maxPoolSize = 3;
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.acquireIncrement = (short) 100;
        hikariConfig0.leakDetectionThreshold = '#';
        hikariConfig0.setConnectionInitSql("HikariPool-15629");
        boolean boolean18 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test22611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22611");
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
        hikariConfig0.dataSourceClassName = "HikariPool-169";
        boolean boolean18 = hikariConfig0.isRegisterMbeans;
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        java.lang.String str20 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionInitSql("HikariPool-2392");
        java.lang.String str23 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-51865" + "'", str15, "HikariPool-51865");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test22612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22612");
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
        boolean boolean24 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str25 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test22613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22613");
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
        hikariConfig0.setMaxLifetime((long) (short) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource22 = hikariConfig21.getDataSource();
        hikariConfig21.setConnectionTestQuery("");
        hikariConfig21.setInitializationFailFast(false);
        hikariConfig21.catalog = "";
        javax.sql.DataSource dataSource29 = null;
        hikariConfig21.dataSource = dataSource29;
        javax.sql.DataSource dataSource31 = null;
        hikariConfig21.dataSource = dataSource31;
        int int33 = hikariConfig21.maxPoolSize;
        hikariConfig21.transactionIsolation = (short) 0;
        java.lang.String str36 = hikariConfig21.getConnectionInitSql();
        int int37 = hikariConfig21.getAcquireRetries();
        hikariConfig21.leakDetectionThreshold = 1L;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str41 = hikariConfig40.getConnectionInitSql();
        long long42 = hikariConfig40.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer43 = null;
        hikariConfig40.connectionCustomizer = iConnectionCustomizer43;
        boolean boolean45 = hikariConfig40.isIsolateInternalQueries();
        hikariConfig40.poolName = "HikariPool-47";
        java.lang.String str48 = hikariConfig40.getCatalog();
        long long49 = hikariConfig40.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str51 = hikariConfig50.getConnectionInitSql();
        long long52 = hikariConfig50.getLeakDetectionThreshold();
        int int53 = hikariConfig50.getMaximumPoolSize();
        java.util.Properties properties54 = hikariConfig50.getDataSourceProperties();
        hikariConfig40.setDataSourceProperties(properties54);
        hikariConfig21.setDataSourceProperties(properties54);
        hikariConfig0.setDataSourceProperties(properties54);
        int int58 = hikariConfig0.transactionIsolation;
        java.lang.String str59 = hikariConfig0.jdbcUrl;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer60 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer60;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str48);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 100L + "'", long49 == 100L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60 + "'", int53 == 60);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "HikariPool-47" + "'", str59, "HikariPool-47");
    }

    @Test
    public void test22614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22614");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        hikariConfig0.maxLifetime = 10L;
        hikariConfig0.maxPoolSize = 97;
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setCatalog("HikariPool-32204");
        long long17 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test22615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22615");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.isRegisterMbeans = true;
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.transactionIsolationName = "HikariPool-777";
        java.lang.String str15 = hikariConfig0.transactionIsolationName;
        boolean boolean16 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        int int21 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-777" + "'", str15, "HikariPool-777");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test22616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22616");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        int int8 = hikariConfig0.acquireIncrement;
        long long9 = hikariConfig0.acquireRetryDelay;
        long long10 = hikariConfig0.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.setInitializationFailFast(false);
        hikariConfig12.catalog = "";
        int int20 = hikariConfig12.getMaximumPoolSize();
        hikariConfig12.leakDetectionThreshold = (short) 10;
        hikariConfig12.isJdbc4connectionTest = true;
        boolean boolean25 = hikariConfig12.isReadOnly();
        java.lang.String str26 = hikariConfig12.getConnectionInitSql();
        java.lang.String str27 = hikariConfig12.poolName;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str29 = hikariConfig28.getConnectionInitSql();
        long long30 = hikariConfig28.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = null;
        hikariConfig28.connectionCustomizer = iConnectionCustomizer31;
        boolean boolean33 = hikariConfig28.isIsolateInternalQueries();
        hikariConfig28.poolName = "HikariPool-47";
        java.lang.String str36 = hikariConfig28.transactionIsolationName;
        hikariConfig28.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties39 = hikariConfig28.getDataSourceProperties();
        hikariConfig12.dataSourceProperties = properties39;
        hikariConfig0.addDataSourceProperty("HikariPool-453", (java.lang.Object) properties39);
        hikariConfig0.connectionTestQuery = "HikariPool-3231";
        int int44 = hikariConfig0.minPoolSize;
        java.lang.String str45 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-51875" + "'", str27, "HikariPool-51875");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test22617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22617");
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
        hikariConfig0.isAutoCommit = true;
        int int44 = hikariConfig0.transactionIsolation;
        hikariConfig0.jdbcUrl = "HikariPool-10344";
        int int47 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test22618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22618");
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
        java.lang.String str30 = hikariConfig0.connectionTestQuery;
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int33 = hikariConfig0.getAcquireIncrement();
        java.lang.String str34 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-47" + "'", str30, "HikariPool-47");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test22619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22619");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        hikariConfig0.catalog = "HikariPool-491";
        hikariConfig0.setMaxLifetime(60L);
        long long9 = hikariConfig0.getAcquireRetryDelay();
        int int10 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setTransactionIsolation("HikariPool-485");
        java.lang.String str13 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-51882" + "'", str13, "HikariPool-51882");
    }

    @Test
    public void test22620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22620");
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
        hikariConfig0.acquireRetries = (byte) 100;
        java.lang.String str21 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.acquireRetryDelay = 100;
        boolean boolean24 = hikariConfig0.isReadOnly();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test22621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22621");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.transactionIsolationName = "";
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setIdleTimeout(2147483647L);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer13;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test22622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22622");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.setInitializationFailFast(false);
        long long12 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean13 = hikariConfig0.isInitializationFailFast;
        long long14 = hikariConfig0.maxLifetime;
        hikariConfig0.isAutoCommit = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test22623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22623");
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
        hikariConfig0.setAcquireRetries(10);
        int int19 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setJdbcUrl("HikariPool-203");
        int int22 = hikariConfig0.minPoolSize;
        hikariConfig0.acquireRetries = (byte) 1;
        java.lang.String str25 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test22624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22624");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.poolName = "";
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTestQuery("HikariPool-183");
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.poolName = "HikariPool-612";
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str20 = hikariConfig19.getConnectionInitSql();
        hikariConfig19.acquireIncrement = 0;
        hikariConfig19.maxLifetime = 100;
        java.lang.String str25 = hikariConfig19.connectionInitSql;
        hikariConfig19.setTransactionIsolation("HikariPool-47");
        hikariConfig19.minPoolSize = 100;
        java.lang.String str30 = hikariConfig19.getDataSourceClassName();
        boolean boolean31 = hikariConfig19.isIsolateInternalQueries;
        hikariConfig19.connectionTimeout = 10;
        hikariConfig19.connectionInitSql = "HikariPool-3488";
        hikariConfig19.setMaximumPoolSize((int) (byte) 1);
        boolean boolean38 = hikariConfig19.isAutoCommit;
        hikariConfig19.setInitializationFailFast(false);
        hikariConfig0.addDataSourceProperty("HikariPool-28622", (java.lang.Object) hikariConfig19);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test22625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22625");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer27 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer27;
        hikariConfig0.isIsolateInternalQueries = false;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-51890" + "'", str3, "HikariPool-51890");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test22626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22626");
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
        long long18 = hikariConfig0.maxLifetime;
        java.lang.String str19 = hikariConfig0.connectionTestQuery;
        java.lang.String str20 = hikariConfig0.transactionIsolationName;
        long long21 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isJdbc4connectionTest = true;
        int int24 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str25 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test22627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22627");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setLeakDetectionThreshold(10L);
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22628");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setPoolName("HikariPool-1886");
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test22629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22629");
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
        hikariConfig0.acquireIncrement = 3;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig33.setMaxLifetime((long) (short) 10);
        int int36 = hikariConfig33.getAcquireRetries();
        hikariConfig33.setInitializationFailFast(true);
        long long39 = hikariConfig33.getLeakDetectionThreshold();
        java.lang.String str40 = hikariConfig33.transactionIsolationName;
        int int41 = hikariConfig33.getAcquireRetries();
        hikariConfig33.setConnectionInitSql("HikariPool-541");
        hikariConfig33.setLeakDetectionThreshold(100L);
        hikariConfig33.catalog = "HikariPool-948";
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str49 = hikariConfig48.getConnectionInitSql();
        long long50 = hikariConfig48.getLeakDetectionThreshold();
        hikariConfig48.leakDetectionThreshold = (-1);
        long long53 = hikariConfig48.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource56 = hikariConfig55.getDataSource();
        hikariConfig55.setConnectionTestQuery("");
        hikariConfig55.connectionCustomizerClassName = "";
        hikariConfig55.setConnectionCustomizerClassName("hi!");
        java.lang.String str63 = hikariConfig55.getCatalog();
        boolean boolean64 = hikariConfig55.isRegisterMbeans;
        long long65 = hikariConfig55.connectionTimeout;
        hikariConfig55.setConnectionInitSql("HikariPool-48");
        hikariConfig48.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig55);
        hikariConfig48.setUseInstrumentation(false);
        java.lang.String str71 = hikariConfig48.getJdbcUrl();
        hikariConfig48.setAcquireRetries(100);
        hikariConfig48.jdbcUrl = "HikariPool-55";
        hikariConfig48.isJdbc4connectionTest = true;
        java.util.Properties properties78 = hikariConfig48.dataSourceProperties;
        hikariConfig33.setDataSourceProperties(properties78);
        hikariConfig0.dataSourceProperties = properties78;
        java.lang.String str81 = hikariConfig0.catalog;
        boolean boolean82 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long53 + "' != '" + 100L + "'", long53 == 100L);
        org.junit.Assert.assertNull(dataSource56);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long65 + "' != '" + 32L + "'", long65 == 32L);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(properties78);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test22630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22630");
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
        java.lang.String str32 = hikariConfig0.dataSourceClassName;
        hikariConfig0.isRegisterMbeans = true;
        java.lang.String str35 = hikariConfig0.dataSourceClassName;
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
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test22631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22631");
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
        hikariConfig0.connectionCustomizerClassName = "HikariPool-203";
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test22632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22632");
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
        java.lang.String str26 = hikariConfig0.dataSourceClassName;
        hikariConfig0.catalog = "HikariPool-165";
        boolean boolean29 = hikariConfig0.isReadOnly();
        java.lang.String str30 = hikariConfig0.dataSourceClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test22633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22633");
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
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        int int14 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.connectionTestQuery = "HikariPool-19550";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test22634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22634");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        boolean boolean11 = hikariConfig0.isReadOnly;
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        boolean boolean13 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test22635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22635");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-38");
        hikariConfig0.setConnectionTimeout(750L);
        hikariConfig0.maxLifetime = 97;
        java.lang.Class<?> wildcardClass13 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test22636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22636");
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
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        hikariConfig0.connectionTimeout = '4';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test22637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22637");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        long long11 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.transactionIsolationName = "HikariPool-216";
        java.util.Properties properties14 = hikariConfig0.dataSourceProperties;
        long long15 = hikariConfig0.acquireRetryDelay;
        int int16 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test22638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22638");
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
        java.lang.String str21 = hikariConfig0.connectionTestQuery;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer22;
        boolean boolean24 = hikariConfig0.isReadOnly();
        hikariConfig0.setLeakDetectionThreshold(10L);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test22639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22639");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        hikariConfig0.maxPoolSize = (short) 100;
        hikariConfig0.setAcquireRetries((int) '4');
        hikariConfig0.setJdbcUrl("HikariPool-340");
        java.lang.String str13 = hikariConfig0.connectionTestQuery;
        hikariConfig0.setDataSourceClassName("HikariPool-43271");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test22640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22640");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.connectionTimeout = 0L;
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        int int12 = hikariConfig0.acquireIncrement;
        hikariConfig0.catalog = "HikariPool-2172";
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaximumPoolSize(0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test22641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22641");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        hikariConfig0.maxPoolSize = (short) 100;
        int int9 = hikariConfig0.maxPoolSize;
        java.lang.String str10 = hikariConfig0.poolName;
        hikariConfig0.dataSourceClassName = "HikariPool-42849";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-51914" + "'", str10, "HikariPool-51914");
    }

    @Test
    public void test22642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22642");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig0.connectionCustomizer;
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        java.lang.String str9 = hikariConfig0.poolName;
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.connectionInitSql = "HikariPool-48214";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-51915" + "'", str6, "HikariPool-51915");
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-51915" + "'", str9, "HikariPool-51915");
    }

    @Test
    public void test22643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22643");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.leakDetectionThreshold = (short) -1;
        hikariConfig0.jdbcUrl = "HikariPool-752";
        int int13 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.acquireIncrement = (byte) 1;
        int int16 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test22644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22644");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        javax.sql.DataSource dataSource9 = hikariConfig0.dataSource;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
        int int11 = hikariConfig0.transactionIsolation;
        hikariConfig0.poolName = "";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test22645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22645");
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
        javax.sql.DataSource dataSource16 = hikariConfig0.dataSource;
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test22646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22646");
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
        boolean boolean17 = hikariConfig0.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.setDataSource(dataSource18);
        java.util.Properties properties20 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test22647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22647");
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
        java.lang.String str38 = hikariConfig0.getJdbcUrl();
        hikariConfig0.isJdbc4connectionTest = false;
        java.lang.String str41 = hikariConfig0.connectionInitSql;
        long long42 = hikariConfig0.acquireRetryDelay;
        java.lang.String str43 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str41);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "HikariPool-51920" + "'", str43, "HikariPool-51920");
    }

    @Test
    public void test22648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22648");
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
        int int25 = hikariConfig0.transactionIsolation;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-35743");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = hikariConfig0.connectionCustomizer;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-25280");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-25280' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer28);
    }

    @Test
    public void test22649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22649");
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
        int int13 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str14 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test22650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22650");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        int int7 = hikariConfig0.acquireIncrement;
        boolean boolean8 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.connectionInitSql = "HikariPool-1698";
        hikariConfig0.setConnectionTestQuery("HikariPool-237");
        boolean boolean16 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test22651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22651");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-1330");
        boolean boolean22 = hikariConfig0.isInitializationFailFast();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str24 = hikariConfig23.getConnectionInitSql();
        long long25 = hikariConfig23.getLeakDetectionThreshold();
        hikariConfig23.leakDetectionThreshold = (-1);
        int int28 = hikariConfig23.acquireIncrement;
        long long29 = hikariConfig23.getIdleTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer30 = null;
        hikariConfig23.connectionCustomizer = iConnectionCustomizer30;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource33 = hikariConfig32.getDataSource();
        hikariConfig32.setConnectionTestQuery("");
        hikariConfig32.connectionCustomizerClassName = "";
        hikariConfig32.setConnectionCustomizerClassName("hi!");
        java.lang.String str40 = hikariConfig32.getCatalog();
        boolean boolean41 = hikariConfig32.isRegisterMbeans;
        javax.sql.DataSource dataSource42 = hikariConfig32.dataSource;
        long long43 = hikariConfig32.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str46 = hikariConfig45.getConnectionInitSql();
        long long47 = hikariConfig45.getLeakDetectionThreshold();
        hikariConfig45.leakDetectionThreshold = (-1);
        int int50 = hikariConfig45.acquireIncrement;
        hikariConfig45.setInitializationFailFast(true);
        int int53 = hikariConfig45.maxPoolSize;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str55 = hikariConfig54.getConnectionInitSql();
        long long56 = hikariConfig54.getLeakDetectionThreshold();
        hikariConfig54.leakDetectionThreshold = (-1);
        long long59 = hikariConfig54.acquireRetryDelay;
        long long60 = hikariConfig54.getIdleTimeout();
        hikariConfig54.acquireIncrement = '4';
        javax.sql.DataSource dataSource63 = hikariConfig54.getDataSource();
        hikariConfig54.acquireRetries = 35;
        java.util.Properties properties66 = hikariConfig54.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties66);
        hikariConfig45.setDataSourceProperties(properties66);
        boolean boolean69 = hikariConfig45.isJdbc4ConnectionTest();
        boolean boolean70 = hikariConfig45.isJdbc4connectionTest;
        hikariConfig32.addDataSourceProperty("HikariPool-1021", (java.lang.Object) boolean70);
        hikariConfig32.setAcquireIncrement((int) ' ');
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str75 = hikariConfig74.getConnectionInitSql();
        long long76 = hikariConfig74.getLeakDetectionThreshold();
        hikariConfig74.leakDetectionThreshold = (-1);
        int int79 = hikariConfig74.acquireIncrement;
        hikariConfig74.setPoolName("HikariPool-62");
        hikariConfig74.acquireRetryDelay = 0L;
        java.lang.String str84 = hikariConfig74.getCatalog();
        javax.sql.DataSource dataSource85 = hikariConfig74.getDataSource();
        int int86 = hikariConfig74.getMinimumPoolSize();
        hikariConfig74.setMinimumPoolSize(60);
        boolean boolean89 = hikariConfig74.isIsolateInternalQueries();
        java.util.Properties properties90 = hikariConfig74.dataSourceProperties;
        hikariConfig32.setDataSourceProperties(properties90);
        hikariConfig23.setDataSourceProperties(properties90);
        hikariConfig0.setDataSourceProperties(properties90);
        boolean boolean94 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean95 = hikariConfig0.isReadOnly();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(dataSource42);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60 + "'", int53 == 60);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long59 + "' != '" + 100L + "'", long59 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + (-1L) + "'", long60 == (-1L));
        org.junit.Assert.assertNull(dataSource63);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNull(dataSource85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 10 + "'", int86 == 10);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(properties90);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test22652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22652");
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
        hikariConfig0.acquireRetryDelay = ' ';
        java.lang.String str20 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setMaximumPoolSize(32);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-10440";
        hikariConfig0.setAcquireRetries(32);
        java.util.Properties properties27 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test22653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22653");
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
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.isAutoCommit = true;
        boolean boolean22 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setPoolName("HikariPool-1248");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test22654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22654");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setAcquireRetryDelay(5000L);
        java.lang.String str11 = hikariConfig0.transactionIsolationName;
        boolean boolean12 = hikariConfig0.isReadOnly();
        java.lang.String str13 = hikariConfig0.poolName;
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.connectionTimeout = 3;
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        hikariConfig0.setConnectionTimeout(0L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-51938" + "'", str13, "HikariPool-51938");
    }

    @Test
    public void test22655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22655");
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
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2172");
        java.lang.String str31 = hikariConfig0.getJdbcUrl();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-51939" + "'", str3, "HikariPool-51939");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test22656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22656");
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
        long long22 = hikariConfig0.idleTimeout;
        int int23 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.catalog = "HikariPool-37029";
        boolean boolean26 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test22657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22657");
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
        java.util.Properties properties20 = hikariConfig8.dataSourceProperties;
        hikariConfig8.setDataSourceClassName("HikariPool-124");
        long long23 = hikariConfig8.getLeakDetectionThreshold();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str25 = hikariConfig24.getConnectionInitSql();
        hikariConfig24.acquireIncrement = 0;
        hikariConfig24.connectionTimeout = 10;
        boolean boolean30 = hikariConfig24.isReadOnly();
        java.lang.String str31 = hikariConfig24.connectionCustomizerClassName;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource33 = hikariConfig32.getDataSource();
        hikariConfig32.setConnectionTestQuery("");
        hikariConfig32.setInitializationFailFast(false);
        hikariConfig32.catalog = "";
        int int40 = hikariConfig32.getMaximumPoolSize();
        hikariConfig32.leakDetectionThreshold = (short) 10;
        hikariConfig32.isJdbc4connectionTest = true;
        boolean boolean45 = hikariConfig32.isReadOnly();
        java.lang.String str46 = hikariConfig32.getConnectionInitSql();
        java.lang.String str47 = hikariConfig32.poolName;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str49 = hikariConfig48.getConnectionInitSql();
        long long50 = hikariConfig48.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer51 = null;
        hikariConfig48.connectionCustomizer = iConnectionCustomizer51;
        boolean boolean53 = hikariConfig48.isIsolateInternalQueries();
        hikariConfig48.poolName = "HikariPool-47";
        java.lang.String str56 = hikariConfig48.transactionIsolationName;
        hikariConfig48.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties59 = hikariConfig48.getDataSourceProperties();
        hikariConfig32.dataSourceProperties = properties59;
        hikariConfig24.setDataSourceProperties(properties59);
        hikariConfig8.dataSourceProperties = properties59;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "HikariPool-51946" + "'", str47, "HikariPool-51946");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(properties59);
    }

    @Test
    public void test22658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22658");
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
        hikariConfig0.connectionInitSql = "HikariPool-15694";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test22659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22659");
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
        hikariConfig0.setTransactionIsolation("HikariPool-2453");
        hikariConfig0.setLeakDetectionThreshold((long) (short) -1);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str20 = hikariConfig19.getConnectionInitSql();
        long long21 = hikariConfig19.getLeakDetectionThreshold();
        int int22 = hikariConfig19.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = hikariConfig19.connectionCustomizer;
        hikariConfig19.setUseInstrumentation(false);
        hikariConfig19.setRegisterMbeans(false);
        java.lang.String str28 = hikariConfig19.getConnectionInitSql();
        hikariConfig0.addDataSourceProperty("HikariPool-130", (java.lang.Object) hikariConfig19);
        hikariConfig19.setDataSourceClassName("HikariPool-46133");
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer23);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test22660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22660");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        hikariConfig0.transactionIsolation = 'a';
        hikariConfig0.acquireIncrement = 10;
        java.lang.String str13 = hikariConfig0.getCatalog();
        java.lang.String str14 = hikariConfig0.catalog;
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str17 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-141" + "'", str17, "HikariPool-141");
    }

    @Test
    public void test22661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22661");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        int int8 = hikariConfig0.acquireIncrement;
        int int9 = hikariConfig0.minPoolSize;
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.dataSourceClassName = "HikariPool-1787";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-3641");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-3641' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test22662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22662");
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
        long long16 = hikariConfig0.connectionTimeout;
        java.lang.String str17 = hikariConfig0.dataSourceClassName;
        long long18 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test22663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22663");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        boolean boolean8 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.isJdbc4connectionTest = false;
        java.lang.String str11 = hikariConfig0.connectionTestQuery;
        java.lang.String str12 = hikariConfig0.jdbcUrl;
        int int13 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setJdbc4ConnectionTest(true);
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test22664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22664");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.transactionIsolationName = "HikariPool-84";
        int int8 = hikariConfig0.getAcquireRetries();
        int int9 = hikariConfig0.maxPoolSize;
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test22665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22665");
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
        hikariConfig0.catalog = "HikariPool-390";
        boolean boolean16 = hikariConfig0.isInitializationFailFast;
        long long17 = hikariConfig0.idleTimeout;
        boolean boolean18 = hikariConfig0.isAutoCommit();
        int int19 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTestQuery = "HikariPool-1129";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test22666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22666");
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
        hikariConfig0.idleTimeout = 97L;
        hikariConfig0.leakDetectionThreshold = (-1L);
        hikariConfig0.isRegisterMbeans = false;
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
    }

    @Test
    public void test22667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22667");
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
        java.lang.String str24 = hikariConfig0.dataSourceClassName;
        java.lang.String str25 = hikariConfig0.connectionTestQuery;
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test22668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22668");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-1137";
        hikariConfig0.dataSourceClassName = "HikariPool-907";
        long long13 = hikariConfig0.connectionTimeout;
        int int14 = hikariConfig0.getMinimumPoolSize();
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setCatalog("HikariPool-22005");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test22669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22669");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.connectionCustomizerClassName;
        javax.sql.DataSource dataSource4 = hikariConfig0.dataSource;
        javax.sql.DataSource dataSource5 = null;
        hikariConfig0.setDataSource(dataSource5);
        hikariConfig0.acquireRetryDelay = (short) 1;
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test22670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22670");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-20591");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-20591 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22671");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean13 = hikariConfig0.isReadOnly();
        hikariConfig0.acquireRetryDelay = (byte) 100;
        hikariConfig0.setTransactionIsolation("HikariPool-263");
        hikariConfig0.connectionTestQuery = "HikariPool-650";
        boolean boolean20 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str21 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test22672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22672");
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
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.idleTimeout = 32L;
        hikariConfig0.setCatalog("HikariPool-4932");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-51967" + "'", str11, "HikariPool-51967");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test22673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22673");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        hikariConfig0.isRegisterMbeans = false;
        int int10 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str11 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig14.setMaxLifetime((long) (short) 10);
        java.lang.String str17 = hikariConfig14.getPoolName();
        hikariConfig14.jdbcUrl = "";
        hikariConfig14.setMaxLifetime(0L);
        hikariConfig14.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig24.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource28 = hikariConfig27.getDataSource();
        hikariConfig27.setConnectionTestQuery("");
        hikariConfig27.setInitializationFailFast(false);
        long long33 = hikariConfig27.getConnectionTimeout();
        java.util.Properties properties34 = hikariConfig27.dataSourceProperties;
        hikariConfig24.dataSourceProperties = properties34;
        hikariConfig14.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties34);
        long long38 = hikariConfig37.acquireRetryDelay;
        java.util.Properties properties39 = hikariConfig37.getDataSourceProperties();
        java.lang.String str40 = hikariConfig37.getPoolName();
        boolean boolean41 = hikariConfig37.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource43 = hikariConfig42.getDataSource();
        hikariConfig42.setConnectionTestQuery("");
        hikariConfig42.connectionCustomizerClassName = "";
        hikariConfig42.setConnectionCustomizerClassName("hi!");
        int int50 = hikariConfig42.acquireIncrement;
        long long51 = hikariConfig42.acquireRetryDelay;
        long long52 = hikariConfig42.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource55 = hikariConfig54.getDataSource();
        hikariConfig54.setConnectionTestQuery("");
        hikariConfig54.setInitializationFailFast(false);
        hikariConfig54.catalog = "";
        int int62 = hikariConfig54.getMaximumPoolSize();
        hikariConfig54.leakDetectionThreshold = (short) 10;
        hikariConfig54.isJdbc4connectionTest = true;
        boolean boolean67 = hikariConfig54.isReadOnly();
        java.lang.String str68 = hikariConfig54.getConnectionInitSql();
        java.lang.String str69 = hikariConfig54.poolName;
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str71 = hikariConfig70.getConnectionInitSql();
        long long72 = hikariConfig70.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer73 = null;
        hikariConfig70.connectionCustomizer = iConnectionCustomizer73;
        boolean boolean75 = hikariConfig70.isIsolateInternalQueries();
        hikariConfig70.poolName = "HikariPool-47";
        java.lang.String str78 = hikariConfig70.transactionIsolationName;
        hikariConfig70.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties81 = hikariConfig70.getDataSourceProperties();
        hikariConfig54.dataSourceProperties = properties81;
        hikariConfig42.addDataSourceProperty("HikariPool-453", (java.lang.Object) properties81);
        hikariConfig37.setDataSourceProperties(properties81);
        com.zaxxer.hikari.HikariConfig hikariConfig85 = new com.zaxxer.hikari.HikariConfig(properties81);
        hikariConfig0.dataSourceProperties = properties81;
        long long87 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-51969" + "'", str17, "HikariPool-51969");
        org.junit.Assert.assertNull(dataSource28);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertNotNull(properties34);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNotNull(properties39);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-51972" + "'", str40, "HikariPool-51972");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + 100L + "'", long52 == 100L);
        org.junit.Assert.assertNull(dataSource55);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 60 + "'", int62 == 60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(str68);
// flaky:         org.junit.Assert.assertEquals("'" + str69 + "' != '" + "HikariPool-51974" + "'", str69, "HikariPool-51974");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertNotNull(properties81);
// flaky:         org.junit.Assert.assertTrue("'" + long87 + "' != '" + 32L + "'", long87 == 32L);
    }

    @Test
    public void test22674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22674");
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
        long long42 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str43 = hikariConfig0.getConnectionInitSql();
        boolean boolean44 = hikariConfig0.isIsolateInternalQueries;
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
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test22675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22675");
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
        hikariConfig0.transactionIsolationName = "HikariPool-801";
        long long22 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.maxLifetime = 0L;
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test22676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22676");
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
        hikariConfig0.setTransactionIsolation("HikariPool-2453");
        int int16 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test22677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22677");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean6 = hikariConfig0.isAutoCommit;
        java.lang.String str7 = hikariConfig0.connectionInitSql;
        hikariConfig0.catalog = "HikariPool-184";
        hikariConfig0.setAcquireRetryDelay((long) (short) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test22678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22678");
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
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str44 = hikariConfig0.catalog;
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.connectionTimeout = 0L;
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
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test22679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22679");
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
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str23 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test22680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22680");
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
        boolean boolean17 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test22681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22681");
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
        hikariConfig0.setAcquireRetries(0);
        int int20 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test22682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22682");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.leakDetectionThreshold = (-1L);
        long long11 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test22683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22683");
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
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionInitSql("HikariPool-1063");
        int int44 = hikariConfig0.acquireIncrement;
        hikariConfig0.isIsolateInternalQueries = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test22684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22684");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setMaxLifetime(100L);
        java.lang.String str9 = hikariConfig0.getPoolName();
        long long10 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-236";
        hikariConfig0.catalog = "HikariPool-1918";
        hikariConfig0.maxPoolSize = 32;
        hikariConfig0.leakDetectionThreshold = 10;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-51997" + "'", str9, "HikariPool-51997");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test22685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22685");
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
        hikariConfig0.setJdbcUrl("HikariPool-3410");
        int int15 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test22686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22686");
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
        int int13 = hikariConfig0.getAcquireIncrement();
        long long14 = hikariConfig0.connectionTimeout;
        javax.sql.DataSource dataSource15 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test22687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22687");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbcUrl("HikariPool-3883");
        hikariConfig0.leakDetectionThreshold = 1;
        hikariConfig0.setLeakDetectionThreshold((long) (short) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test22688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22688");
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
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.dataSource = dataSource15;
        hikariConfig0.isAutoCommit = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test22689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22689");
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
        int int22 = hikariConfig0.transactionIsolation;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-182";
        hikariConfig0.catalog = "";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test22690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22690");
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
        java.lang.String str24 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-52004" + "'", str24, "HikariPool-52004");
    }

    @Test
    public void test22691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22691");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.connectionTestQuery = "HikariPool-201";
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.connectionCustomizerClassName = "";
        hikariConfig16.setConnectionCustomizerClassName("hi!");
        java.lang.String str24 = hikariConfig16.getCatalog();
        int int25 = hikariConfig16.acquireRetries;
        hikariConfig16.setRegisterMbeans(true);
        java.lang.String str28 = hikariConfig16.getDataSourceClassName();
        java.util.Properties properties29 = hikariConfig16.dataSourceProperties;
        hikariConfig0.setDataSourceProperties(properties29);
        hikariConfig0.poolName = "HikariPool-558";
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test22692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22692");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        int int10 = hikariConfig0.getMaximumPoolSize();
        boolean boolean11 = hikariConfig0.isRegisterMbeans;
        long long12 = hikariConfig0.idleTimeout;
        boolean boolean13 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.leakDetectionThreshold = 'a';
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test22693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22693");
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
        hikariConfig0.setAutoCommit(false);
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
    }

    @Test
    public void test22694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22694");
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
        int int19 = hikariConfig0.getAcquireRetries();
        hikariConfig0.maxPoolSize = (byte) -1;
        java.lang.String str22 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.acquireIncrement = 0;
        java.util.Properties properties25 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test22695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22695");
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
        hikariConfig0.transactionIsolationName = "HikariPool-331";
        hikariConfig0.acquireRetries = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test22696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22696");
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
        hikariConfig0.setDataSourceClassName("HikariPool-38");
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int27 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionInitSql("HikariPool-37058");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test22697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22697");
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
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        hikariConfig0.setAutoCommit(false);
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
    public void test22698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22698");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        long long10 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold(60L);
        hikariConfig0.setAcquireRetryDelay(1L);
        long long15 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test22699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22699");
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
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.isIsolateInternalQueries = false;
        long long22 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test22700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22700");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireRetries((int) 'a');
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2486");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setMaxLifetime((long) (short) 100);
        int int17 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionTestQuery = "HikariPool-4221";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test22701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22701");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-36503");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-36503 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22702");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        int int7 = hikariConfig0.getAcquireIncrement();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries;
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test22703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22703");
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
        hikariConfig0.acquireIncrement = 'a';
        hikariConfig0.setTransactionIsolation("HikariPool-2690");
        hikariConfig0.setMinimumPoolSize(10);
        hikariConfig0.setCatalog("HikariPool-6077");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-25025");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer36 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer36;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test22704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22704");
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
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.connectionTimeout = 35L;
        java.lang.String str20 = hikariConfig0.transactionIsolationName;
        java.lang.String str21 = hikariConfig0.poolName;
        hikariConfig0.isReadOnly = false;
        hikariConfig0.transactionIsolation = 60;
        hikariConfig0.acquireRetries = 0;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-52028" + "'", str13, "HikariPool-52028");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-52028" + "'", str21, "HikariPool-52028");
    }

    @Test
    public void test22705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22705");
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
        int int46 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60 + "'", int46 == 60);
    }

    @Test
    public void test22706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22706");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.catalog = "HikariPool-86";
        long long12 = hikariConfig0.leakDetectionThreshold;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        hikariConfig0.connectionInitSql = "HikariPool-2654";
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        long long18 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean19 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireRetries(60);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test22707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22707");
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
        boolean boolean47 = hikariConfig0.isAutoCommit;
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.poolName = "HikariPool-8946";
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-52036" + "'", str20, "HikariPool-52036");
        org.junit.Assert.assertNull(dataSource31);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertNotNull(properties37);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test22708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22708");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getCatalog();
        java.lang.String str8 = hikariConfig0.connectionInitSql;
        long long9 = hikariConfig0.leakDetectionThreshold;
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-52040" + "'", str6, "HikariPool-52040");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test22709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22709");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        int int8 = hikariConfig0.getTransactionIsolation();
        java.lang.String str9 = hikariConfig0.dataSourceClassName;
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test22710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22710");
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
        long long13 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean16 = hikariConfig0.isRegisterMbeans;
        java.lang.String str17 = hikariConfig0.connectionInitSql;
        boolean boolean18 = hikariConfig0.isAutoCommit();
        int int19 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test22711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22711");
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
        java.lang.String str16 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionInitSql("HikariPool-4051");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-524" + "'", str16, "HikariPool-524");
    }

    @Test
    public void test22712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22712");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        hikariConfig0.acquireIncrement = (short) 100;
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        java.lang.String str10 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test22713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22713");
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
        hikariConfig0.acquireRetries = (byte) -1;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setCatalog("HikariPool-40615");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-52045" + "'", str3, "HikariPool-52045");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test22714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22714");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.isReadOnly = true;
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setMaximumPoolSize(0);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test22715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22715");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        long long4 = hikariConfig0.maxLifetime;
        long long5 = hikariConfig0.leakDetectionThreshold;
        boolean boolean6 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test22716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22716");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        int int4 = hikariConfig0.maxPoolSize;
        java.lang.String str5 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-52050" + "'", str5, "HikariPool-52050");
    }

    @Test
    public void test22717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22717");
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
        javax.sql.DataSource dataSource21 = null;
        hikariConfig0.dataSource = dataSource21;
        int int23 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setDataSourceClassName("HikariPool-46108");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test22718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22718");
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
        java.lang.String str20 = hikariConfig0.jdbcUrl;
        hikariConfig0.catalog = "HikariPool-8153";
        javax.sql.DataSource dataSource23 = null;
        hikariConfig0.setDataSource(dataSource23);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-66" + "'", str19, "HikariPool-66");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test22719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22719");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.poolName = "HikariPool-73";
        java.lang.String str11 = hikariConfig0.poolName;
        hikariConfig0.setConnectionInitSql("HikariPool-2886");
        int int14 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-73" + "'", str11, "HikariPool-73");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test22720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22720");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setDataSourceClassName("HikariPool-833");
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.minPoolSize = 'a';
        hikariConfig0.minPoolSize = (-1);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test22721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22721");
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
        long long15 = hikariConfig0.getMaxLifetime();
        hikariConfig0.maxLifetime = (short) 100;
        hikariConfig0.setJdbcUrl("HikariPool-858");
        java.lang.String str20 = hikariConfig0.catalog;
        hikariConfig0.setMaxLifetime((long) 35);
        int int23 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test22722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22722");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-948";
        boolean boolean11 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22723");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getCatalog();
        java.lang.String str8 = hikariConfig0.connectionInitSql;
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer10;
        java.lang.String str12 = hikariConfig0.jdbcUrl;
        boolean boolean13 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setMaximumPoolSize(100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-52058" + "'", str6, "HikariPool-52058");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test22724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22724");
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
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.addDataSourceProperty("HikariPool-1748", (java.lang.Object) "HikariPool-1159");
        hikariConfig0.setAcquireRetryDelay((long) 52);
        int int22 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-52059" + "'", str13, "HikariPool-52059");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test22725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22725");
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
        java.util.Properties properties22 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setTransactionIsolation("HikariPool-39850");
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-47" + "'", str13, "HikariPool-47");
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test22726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22726");
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
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-4134");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-52062" + "'", str17, "HikariPool-52062");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-122" + "'", str18, "HikariPool-122");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test22727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22727");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        int int13 = hikariConfig0.acquireIncrement;
        boolean boolean14 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22728");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.catalog = "HikariPool-86";
        long long12 = hikariConfig0.leakDetectionThreshold;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        hikariConfig0.connectionInitSql = "HikariPool-2654";
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        int int18 = hikariConfig0.acquireIncrement;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-4123";
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-50529");
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test22729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22729");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-73");
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        int int12 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.connectionTestQuery = "HikariPool-47800";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test22730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22730");
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
        hikariConfig0.transactionIsolation = 3;
        hikariConfig0.leakDetectionThreshold = ' ';
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
    }

    @Test
    public void test22731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22731");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        hikariConfig0.setJdbcUrl("HikariPool-5842");
        hikariConfig0.leakDetectionThreshold = 1;
        hikariConfig0.setIdleTimeout((long) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
    }

    @Test
    public void test22732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22732");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.acquireRetryDelay = 5000L;
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        java.lang.String str15 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test22733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22733");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.connectionTimeout = '#';
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-15337");
        int int10 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test22734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22734");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.setReadOnly(false);
        hikariConfig0.isIsolateInternalQueries = true;
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean14 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test22735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22735");
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
        long long16 = hikariConfig0.getMaxLifetime();
        java.util.Properties properties17 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test22736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22736");
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
        int int17 = hikariConfig0.maxPoolSize;
        hikariConfig0.acquireRetries = 52;
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.connectionInitSql = "HikariPool-9758";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test22737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22737");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        java.lang.String str3 = hikariConfig0.getPoolName();
        int int4 = hikariConfig0.maxPoolSize;
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-5786");
        long long10 = hikariConfig0.maxLifetime;
        hikariConfig0.setConnectionInitSql("HikariPool-214");
        hikariConfig0.maxPoolSize = 0;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-52075" + "'", str3, "HikariPool-52075");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test22738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22738");
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
        java.lang.String str13 = hikariConfig0.connectionTestQuery;
        hikariConfig0.maxPoolSize = (byte) 10;
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        boolean boolean18 = hikariConfig0.isReadOnly();
        java.util.Properties properties19 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setConnectionCustomizerClassName("");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test22739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22739");
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
        java.util.Properties properties21 = hikariConfig0.dataSourceProperties;
        boolean boolean22 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test22740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22740");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.lang.String str5 = hikariConfig0.poolName;
        long long6 = hikariConfig0.getMaxLifetime();
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.isIsolateInternalQueries = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-52078" + "'", str5, "HikariPool-52078");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test22741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22741");
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
        hikariConfig0.isReadOnly = false;
        int int19 = hikariConfig0.acquireRetries;
        hikariConfig0.acquireIncrement = (short) 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test22742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22742");
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
        java.util.Properties properties25 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource26 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(dataSource26);
    }

    @Test
    public void test22743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22743");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        long long17 = hikariConfig15.getLeakDetectionThreshold();
        int int18 = hikariConfig15.getMaximumPoolSize();
        long long19 = hikariConfig15.leakDetectionThreshold;
        hikariConfig15.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        long long29 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig23.setDataSourceClassName("HikariPool-66");
        hikariConfig23.setInitializationFailFast(false);
        hikariConfig15.addDataSourceProperty("HikariPool-62", (java.lang.Object) hikariConfig23);
        hikariConfig0.addDataSourceProperty("HikariPool-216", (java.lang.Object) hikariConfig23);
        hikariConfig0.setTransactionIsolation("HikariPool-775");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer38 = hikariConfig0.connectionCustomizer;
        hikariConfig0.connectionTestQuery = "HikariPool-47547";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(dataSource24);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer38);
    }

    @Test
    public void test22744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22744");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        hikariConfig0.maxPoolSize = (short) 100;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        long long11 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test22745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22745");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        hikariConfig0.maxLifetime = 10L;
        hikariConfig0.maxPoolSize = 97;
        hikariConfig0.connectionTimeout = 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test22746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22746");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-25");
        hikariConfig0.setMaxLifetime(5000L);
        long long13 = hikariConfig0.leakDetectionThreshold;
        long long14 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties15 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test22747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22747");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str7 = hikariConfig0.poolName;
        hikariConfig0.setAcquireRetryDelay(5000L);
        hikariConfig0.acquireIncrement = 32;
        hikariConfig0.minPoolSize = (short) 1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-52089" + "'", str7, "HikariPool-52089");
    }

    @Test
    public void test22748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22748");
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
        boolean boolean23 = hikariConfig0.isRegisterMbeans;
        boolean boolean24 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test22749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22749");
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
        long long28 = hikariConfig0.connectionTimeout;
        hikariConfig0.idleTimeout = 10L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
    }

    @Test
    public void test22750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22750");
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
        hikariConfig0.connectionInitSql = "HikariPool-93";
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        int int19 = hikariConfig0.acquireRetries;
        hikariConfig0.idleTimeout = (byte) 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test22751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22751");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setJdbcUrl("HikariPool-173");
        hikariConfig0.acquireRetries = (short) 10;
        java.lang.String str9 = hikariConfig0.connectionTestQuery;
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.isJdbc4connectionTest = false;
        boolean boolean14 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test22752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22752");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        int int8 = hikariConfig0.maxPoolSize;
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.idleTimeout = 0L;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-322";
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test22753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22753");
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
        java.lang.String str16 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.transactionIsolation = 0;
        hikariConfig0.setLeakDetectionThreshold((long) 3);
        boolean boolean21 = hikariConfig0.isRegisterMbeans();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test22754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22754");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isReadOnly;
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig0.connectionTestQuery;
        hikariConfig0.setMaximumPoolSize(0);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test22755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22755");
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
        int int45 = hikariConfig0.transactionIsolation;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1515");
        hikariConfig0.connectionInitSql = "HikariPool-5058";
        int int50 = hikariConfig0.getMaximumPoolSize();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 60 + "'", int50 == 60);
    }

    @Test
    public void test22756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22756");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(0L);
        hikariConfig0.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig0.connectionCustomizer;
        hikariConfig0.isRegisterMbeans = false;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str17 = hikariConfig16.getConnectionInitSql();
        hikariConfig16.setMaxLifetime(35L);
        hikariConfig16.setAutoCommit(false);
        hikariConfig16.transactionIsolationName = "hi!";
        java.lang.String str24 = hikariConfig16.connectionCustomizerClassName;
        boolean boolean25 = hikariConfig16.isInitializationFailFast();
        java.lang.String str26 = hikariConfig16.jdbcUrl;
        hikariConfig16.connectionTimeout = 5000L;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource30 = hikariConfig29.getDataSource();
        hikariConfig29.setConnectionTestQuery("");
        hikariConfig29.connectionCustomizerClassName = "";
        hikariConfig29.setConnectionCustomizerClassName("hi!");
        java.lang.String str37 = hikariConfig29.getCatalog();
        boolean boolean38 = hikariConfig29.isRegisterMbeans;
        hikariConfig29.setAcquireRetries(0);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str42 = hikariConfig41.getConnectionInitSql();
        long long43 = hikariConfig41.getLeakDetectionThreshold();
        int int44 = hikariConfig41.getMaximumPoolSize();
        java.util.Properties properties45 = hikariConfig41.getDataSourceProperties();
        hikariConfig29.dataSourceProperties = properties45;
        hikariConfig16.setDataSourceProperties(properties45);
        hikariConfig0.setDataSourceProperties(properties45);
        hikariConfig0.leakDetectionThreshold = 100;
        long long51 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 60 + "'", int44 == 60);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 100L + "'", long51 == 100L);
    }

    @Test
    public void test22757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22757");
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
        int int17 = hikariConfig0.transactionIsolation;
        long long18 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-25025");
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test22758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22758");
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
        long long18 = hikariConfig0.maxLifetime;
        hikariConfig0.acquireRetryDelay = 10;
        hikariConfig0.minPoolSize = 3;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setAcquireRetryDelay((long) 60);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer23);
    }

    @Test
    public void test22759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22759");
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
        hikariConfig0.maxPoolSize = (byte) 10;
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.poolName = "HikariPool-49372";
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
    public void test22760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22760");
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
        hikariConfig0.connectionCustomizerClassName = "HikariPool-618";
        hikariConfig0.acquireIncrement = 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer24;
        java.lang.String str26 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-52111" + "'", str26, "HikariPool-52111");
    }

    @Test
    public void test22761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22761");
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
        boolean boolean40 = hikariConfig0.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-31547");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-31547' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-52114" + "'", str16, "HikariPool-52114");
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test22762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22762");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.idleTimeout = (short) 0;
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.acquireIncrement = '4';
        hikariConfig0.dataSourceClassName = "HikariPool-5302";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test22763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22763");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setDataSourceClassName("HikariPool-174");
        int int7 = hikariConfig0.transactionIsolation;
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireRetries = 0;
        hikariConfig0.setIdleTimeout(0L);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
    }

    @Test
    public void test22764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22764");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        int int7 = hikariConfig0.transactionIsolation;
        hikariConfig0.setMinimumPoolSize(0);
        long long10 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.minPoolSize = (byte) -1;
        long long13 = hikariConfig0.getIdleTimeout();
        long long14 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setPoolName("HikariPool-18432");
        int int17 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test22765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22765");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        hikariConfig0.acquireIncrement = (short) 100;
        hikariConfig0.connectionTimeout = '4';
        hikariConfig0.isIsolateInternalQueries = false;
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setJdbcUrl("HikariPool-339");
        int int19 = hikariConfig0.getAcquireRetries();
        long long20 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test22766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22766");
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
        boolean boolean39 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean40 = hikariConfig0.isAutoCommit;
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test22767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22767");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1158");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1158 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22768");
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
        java.lang.String str18 = hikariConfig0.connectionInitSql;
        java.lang.String str19 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test22769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22769");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-16178");
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-52127" + "'", str6, "HikariPool-52127");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test22770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22770");
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
        long long41 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(dataSource30);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
    }

    @Test
    public void test22771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22771");
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
        boolean boolean22 = hikariConfig0.isAutoCommit();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.maxPoolSize = '4';
        long long27 = hikariConfig0.idleTimeout;
        long long28 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str29 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test22772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22772");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-73");
        hikariConfig0.jdbcUrl = "HikariPool-132";
        java.lang.String str13 = hikariConfig0.connectionTestQuery;
        long long14 = hikariConfig0.getAcquireRetryDelay();
        int int15 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.connectionTestQuery = "HikariPool-4111";
        boolean boolean18 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str19 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test22773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22773");
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
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test22774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22774");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.maxPoolSize = 3;
        java.util.Properties properties10 = hikariConfig0.dataSourceProperties;
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig0.getConnectionInitSql();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str15 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test22775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22775");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        long long17 = hikariConfig15.getLeakDetectionThreshold();
        int int18 = hikariConfig15.getMaximumPoolSize();
        long long19 = hikariConfig15.leakDetectionThreshold;
        hikariConfig15.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        long long29 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig23.setDataSourceClassName("HikariPool-66");
        hikariConfig23.setInitializationFailFast(false);
        hikariConfig15.addDataSourceProperty("HikariPool-62", (java.lang.Object) hikariConfig23);
        hikariConfig0.addDataSourceProperty("HikariPool-216", (java.lang.Object) hikariConfig23);
        boolean boolean36 = hikariConfig0.isRegisterMbeans;
        java.lang.String str37 = hikariConfig0.transactionIsolationName;
        hikariConfig0.connectionTimeout = 60L;
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.isReadOnly = true;
        boolean boolean44 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(dataSource24);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test22776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22776");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        int int7 = hikariConfig0.getAcquireIncrement();
        java.lang.String str8 = hikariConfig0.getPoolName();
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-52141" + "'", str8, "HikariPool-52141");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test22777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22777");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer12;
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        long long15 = hikariConfig0.connectionTimeout;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.dataSource = dataSource16;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource20 = hikariConfig19.getDataSource();
        hikariConfig19.setConnectionTestQuery("");
        hikariConfig19.connectionCustomizerClassName = "";
        hikariConfig19.setConnectionCustomizerClassName("hi!");
        java.lang.String str27 = hikariConfig19.getCatalog();
        java.util.Properties properties28 = hikariConfig19.dataSourceProperties;
        int int29 = hikariConfig19.minPoolSize;
        long long30 = hikariConfig19.getMaxLifetime();
        long long31 = hikariConfig19.acquireRetryDelay;
        long long32 = hikariConfig19.idleTimeout;
        java.lang.String str33 = hikariConfig19.transactionIsolationName;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource36 = hikariConfig35.getDataSource();
        hikariConfig35.setConnectionTestQuery("");
        hikariConfig35.connectionCustomizerClassName = "";
        hikariConfig35.setConnectionCustomizerClassName("hi!");
        java.lang.String str43 = hikariConfig35.getCatalog();
        boolean boolean44 = hikariConfig35.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource47 = hikariConfig46.getDataSource();
        hikariConfig46.setConnectionTestQuery("");
        hikariConfig46.connectionCustomizerClassName = "";
        hikariConfig46.setConnectionCustomizerClassName("hi!");
        java.lang.String str54 = hikariConfig46.getCatalog();
        boolean boolean55 = hikariConfig46.isRegisterMbeans;
        hikariConfig46.setAcquireRetries(0);
        hikariConfig46.setMaximumPoolSize((int) '#');
        hikariConfig35.addDataSourceProperty("HikariPool-47", (java.lang.Object) '#');
        hikariConfig35.setConnectionTestQuery("HikariPool-47");
        java.lang.String str63 = hikariConfig35.connectionInitSql;
        hikariConfig35.transactionIsolation = (short) 100;
        hikariConfig35.setAcquireRetries(100);
        hikariConfig35.transactionIsolationName = "HikariPool-101";
        java.util.Properties properties70 = hikariConfig35.getDataSourceProperties();
        hikariConfig19.addDataSourceProperty("HikariPool-910", (java.lang.Object) hikariConfig35);
        hikariConfig0.addDataSourceProperty("HikariPool-8733", (java.lang.Object) hikariConfig35);
        hikariConfig0.setAcquireRetries(97);
        int int75 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(dataSource47);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(properties70);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 60 + "'", int75 == 60);
    }

    @Test
    public void test22778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22778");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.acquireRetryDelay = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test22779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22779");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.poolName = "HikariPool-73";
        long long11 = hikariConfig0.connectionTimeout;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-137");
        hikariConfig0.maxLifetime = (short) 10;
        hikariConfig0.catalog = "HikariPool-4109";
        int int18 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test22780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22780");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        long long10 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        hikariConfig0.setUseInstrumentation(true);
        long long14 = hikariConfig0.maxLifetime;
        hikariConfig0.isInitializationFailFast = false;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.dataSource = dataSource17;
        hikariConfig0.catalog = "HikariPool-5378";
        hikariConfig0.setLeakDetectionThreshold((long) (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-52148" + "'", str3, "HikariPool-52148");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test22781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22781");
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
        int int18 = hikariConfig0.getAcquireIncrement();
        boolean boolean19 = hikariConfig0.isReadOnly;
        hikariConfig0.setTransactionIsolation("HikariPool-10972");
        hikariConfig0.poolName = "";
        int int24 = hikariConfig0.getAcquireRetries();
        long long25 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource26 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNull(dataSource26);
    }

    @Test
    public void test22782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22782");
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
        hikariConfig0.setLeakDetectionThreshold(5000L);
        java.lang.String str42 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-52151" + "'", str16, "HikariPool-52151");
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(dataSource37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test22783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22783");
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
        int int52 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setTransactionIsolation("HikariPool-435");
        long long55 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean56 = hikariConfig0.isInitializationFailFast;
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test22784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22784");
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
        int int36 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setCatalog("HikariPool-40645");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
    }

    @Test
    public void test22785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22785");
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
        hikariConfig0.setCatalog("HikariPool-236");
        hikariConfig0.acquireRetryDelay = (byte) 1;
        boolean boolean17 = hikariConfig0.isRegisterMbeans;
        int int18 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test22786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22786");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.connectionTimeout = 0L;
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean13 = hikariConfig0.isInitializationFailFast();
        boolean boolean14 = hikariConfig0.isRegisterMbeans;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        long long17 = hikariConfig15.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig15.connectionCustomizer = iConnectionCustomizer18;
        hikariConfig15.setReadOnly(true);
        long long22 = hikariConfig15.maxLifetime;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str24 = hikariConfig23.getConnectionInitSql();
        long long25 = hikariConfig23.getLeakDetectionThreshold();
        hikariConfig23.leakDetectionThreshold = (-1);
        long long28 = hikariConfig23.acquireRetryDelay;
        long long29 = hikariConfig23.getIdleTimeout();
        hikariConfig23.isInitializationFailFast = true;
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
        hikariConfig23.dataSourceProperties = properties64;
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig15.dataSourceProperties = properties64;
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig0.dataSourceProperties = properties64;
        com.zaxxer.hikari.HikariConfig hikariConfig72 = new com.zaxxer.hikari.HikariConfig(properties64);
        java.lang.String str73 = hikariConfig72.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 32L + "'", long44 == 32L);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertNull(dataSource56);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test22787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22787");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.util.Properties properties8 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test22788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22788");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str12 = hikariConfig0.dataSourceClassName;
        boolean boolean13 = hikariConfig0.isAutoCommit();
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test22789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22789");
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
        int int13 = hikariConfig0.minPoolSize;
        hikariConfig0.isAutoCommit = true;
        long long16 = hikariConfig0.getConnectionTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource18 = hikariConfig17.getDataSource();
        hikariConfig17.setConnectionTestQuery("");
        hikariConfig17.connectionCustomizerClassName = "";
        hikariConfig17.setConnectionCustomizerClassName("hi!");
        java.lang.String str25 = hikariConfig17.getCatalog();
        boolean boolean26 = hikariConfig17.isRegisterMbeans;
        hikariConfig17.setAcquireRetries(0);
        hikariConfig17.setMaximumPoolSize((int) '#');
        hikariConfig17.setMinimumPoolSize((int) (byte) 10);
        java.lang.String str33 = hikariConfig17.transactionIsolationName;
        hikariConfig17.connectionInitSql = "HikariPool-7";
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource38 = hikariConfig37.getDataSource();
        hikariConfig37.idleTimeout = 3;
        hikariConfig37.setLeakDetectionThreshold(52L);
        int int43 = hikariConfig37.minPoolSize;
        hikariConfig37.setIdleTimeout((long) 10);
        hikariConfig37.setConnectionTimeout((long) (short) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str49 = hikariConfig48.getConnectionInitSql();
        long long50 = hikariConfig48.getLeakDetectionThreshold();
        hikariConfig48.leakDetectionThreshold = (byte) 0;
        hikariConfig48.acquireRetryDelay = 3L;
        hikariConfig48.poolName = "HikariPool-66";
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource58 = hikariConfig57.getDataSource();
        hikariConfig57.setConnectionTestQuery("");
        hikariConfig57.connectionCustomizerClassName = "";
        hikariConfig57.setConnectionCustomizerClassName("hi!");
        java.lang.String str65 = hikariConfig57.getCatalog();
        boolean boolean66 = hikariConfig57.isRegisterMbeans;
        hikariConfig57.setAcquireRetries(0);
        hikariConfig57.setMaximumPoolSize((int) '#');
        hikariConfig57.setTransactionIsolation("hi!");
        boolean boolean73 = hikariConfig57.isInitializationFailFast();
        java.lang.String str74 = hikariConfig57.connectionInitSql;
        hikariConfig57.maxPoolSize = 0;
        java.util.Properties properties77 = hikariConfig57.getDataSourceProperties();
        hikariConfig48.setDataSourceProperties(properties77);
        com.zaxxer.hikari.HikariConfig hikariConfig79 = new com.zaxxer.hikari.HikariConfig(properties77);
        hikariConfig37.dataSourceProperties = properties77;
        hikariConfig17.addDataSourceProperty("HikariPool-327", (java.lang.Object) hikariConfig37);
        java.lang.String str82 = hikariConfig17.getConnectionCustomizerClassName();
        java.util.Properties properties83 = hikariConfig17.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties83;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNull(dataSource58);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(properties77);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertNotNull(properties83);
    }

    @Test
    public void test22790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22790");
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
        java.lang.String str27 = hikariConfig0.getConnectionTestQuery();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test22791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22791");
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
        hikariConfig0.dataSourceClassName = "HikariPool-169";
        boolean boolean18 = hikariConfig0.isRegisterMbeans;
        int int19 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1711");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.isReadOnly = false;
        hikariConfig0.setUseInstrumentation(true);
        int int28 = hikariConfig0.minPoolSize;
        java.util.Properties properties29 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-52181" + "'", str15, "HikariPool-52181");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test22792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22792");
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
        hikariConfig0.setConnectionInitSql("HikariPool-551");
        javax.sql.DataSource dataSource29 = hikariConfig0.getDataSource();
        java.lang.String str30 = hikariConfig0.getDataSourceClassName();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-52182" + "'", str3, "HikariPool-52182");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test22793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22793");
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
        long long16 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str17 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(dataSource15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-52185" + "'", str17, "HikariPool-52185");
    }

    @Test
    public void test22794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22794");
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
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireIncrement(97);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test22795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22795");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.acquireIncrement = (short) 10;
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        long long11 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-52187" + "'", str6, "HikariPool-52187");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test22796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22796");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.jdbcUrl = "HikariPool-7393";
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test22797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22797");
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
        int int25 = hikariConfig0.getMinimumPoolSize();
        boolean boolean26 = hikariConfig0.isReadOnly;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-52189" + "'", str3, "HikariPool-52189");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test22798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22798");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.maxLifetime;
        long long13 = hikariConfig0.idleTimeout;
        hikariConfig0.setTransactionIsolation("HikariPool-3729");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test22799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22799");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        java.lang.String str11 = hikariConfig0.connectionCustomizerClassName;
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str13 = hikariConfig0.connectionTestQuery;
        hikariConfig0.maxPoolSize = '4';
        int int16 = hikariConfig0.getAcquireRetries();
        int int17 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.isJdbc4connectionTest = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer20);
    }

    @Test
    public void test22800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22800");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str10 = hikariConfig0.poolName;
        long long11 = hikariConfig0.maxLifetime;
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-52194" + "'", str10, "HikariPool-52194");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test22801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22801");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        long long6 = hikariConfig0.maxLifetime;
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMaxLifetime(0L);
        long long12 = hikariConfig0.getMaxLifetime();
        int int13 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-52195" + "'", str7, "HikariPool-52195");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test22802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22802");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.acquireRetryDelay = (short) 0;
        java.lang.String str8 = hikariConfig0.connectionCustomizerClassName;
        long long9 = hikariConfig0.acquireRetryDelay;
        long long10 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test22803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22803");
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
        java.util.Properties properties32 = hikariConfig0.dataSourceProperties;
        java.util.Properties properties33 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-52197" + "'", str3, "HikariPool-52197");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-48" + "'", str27, "HikariPool-48");
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test22804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22804");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.transactionIsolation = 0;
        long long4 = hikariConfig0.maxLifetime;
        boolean boolean5 = hikariConfig0.isAutoCommit();
        hikariConfig0.setMaxLifetime((long) 60);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.setMaximumPoolSize(52);
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test22805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22805");
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
        int int12 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetries(1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test22806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22806");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        int int5 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test22807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22807");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.setIsolateInternalQueries(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer13;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str17 = hikariConfig16.getConnectionInitSql();
        long long18 = hikariConfig16.getLeakDetectionThreshold();
        int int19 = hikariConfig16.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig16.connectionCustomizer;
        java.lang.String str21 = hikariConfig16.connectionInitSql;
        int int22 = hikariConfig16.acquireIncrement;
        hikariConfig0.addDataSourceProperty("HikariPool-3596", (java.lang.Object) int22);
        boolean boolean24 = hikariConfig0.isRegisterMbeans();
        long long25 = hikariConfig0.idleTimeout;
        boolean boolean26 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test22808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22808");
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
        long long23 = hikariConfig0.getMaxLifetime();
        boolean boolean24 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int27 = hikariConfig0.getAcquireRetries();
        java.lang.String str28 = hikariConfig0.getJdbcUrl();
        hikariConfig0.acquireRetryDelay = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test22809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22809");
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
        javax.sql.DataSource dataSource19 = null;
        hikariConfig0.dataSource = dataSource19;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer21;
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.minPoolSize = (short) -1;
        long long27 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str28 = hikariConfig0.getDataSourceClassName();
        boolean boolean29 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test22810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22810");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-38431");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-38431 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22811");
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
        hikariConfig26.setUseInstrumentation(false);
        hikariConfig26.setConnectionCustomizerClassName("HikariPool-21434");
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
    }

    @Test
    public void test22812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22812");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        boolean boolean7 = hikariConfig0.isAutoCommit();
        int int8 = hikariConfig0.transactionIsolation;
        int int9 = hikariConfig0.minPoolSize;
        hikariConfig0.minPoolSize = (byte) 10;
        hikariConfig0.minPoolSize = 10;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test22813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22813");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(0L);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAcquireRetries(60);
        java.lang.String str15 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-52216" + "'", str15, "HikariPool-52216");
    }

    @Test
    public void test22814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22814");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("HikariPool-978");
        java.lang.String str7 = hikariConfig0.poolName;
        hikariConfig0.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-52217" + "'", str7, "HikariPool-52217");
    }

    @Test
    public void test22815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22815");
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
        hikariConfig0.idleTimeout = 97L;
        hikariConfig0.leakDetectionThreshold = (-1L);
        long long47 = hikariConfig0.connectionTimeout;
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
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
    }

    @Test
    public void test22816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22816");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.minPoolSize = (byte) 100;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-285");
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
        hikariConfig9.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties31 = hikariConfig9.getDataSourceProperties();
        java.util.Properties properties32 = hikariConfig9.dataSourceProperties;
        hikariConfig9.connectionTestQuery = "HikariPool-149";
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource36 = hikariConfig35.getDataSource();
        hikariConfig35.setConnectionTestQuery("");
        hikariConfig35.connectionCustomizerClassName = "";
        hikariConfig35.setConnectionCustomizerClassName("hi!");
        java.lang.String str43 = hikariConfig35.getCatalog();
        java.util.Properties properties44 = hikariConfig35.dataSourceProperties;
        int int45 = hikariConfig35.minPoolSize;
        java.lang.String str46 = hikariConfig35.getConnectionTestQuery();
        java.util.Properties properties47 = hikariConfig35.dataSourceProperties;
        hikariConfig9.setDataSourceProperties(properties47);
        hikariConfig0.setDataSourceProperties(properties47);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-15400";
        java.lang.String str52 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test22817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22817");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setConnectionTimeout((long) 100);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test22818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22818");
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
        long long14 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str15 = hikariConfig0.jdbcUrl;
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setConnectionInitSql("HikariPool-28562");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test22819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22819");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        hikariConfig0.setJdbcUrl("HikariPool-47");
        boolean boolean13 = hikariConfig0.isAutoCommit;
        hikariConfig0.setMaximumPoolSize(10);
        boolean boolean16 = hikariConfig0.isJdbc4ConnectionTest();
        int int17 = hikariConfig0.getAcquireIncrement();
        long long18 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-33926");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test22820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22820");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.isRegisterMbeans = true;
        boolean boolean12 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setMaximumPoolSize((int) (short) 10);
        hikariConfig0.isReadOnly = false;
        hikariConfig0.catalog = "HikariPool-142";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test22821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22821");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-1137";
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        long long14 = hikariConfig12.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig12.connectionCustomizer = iConnectionCustomizer15;
        boolean boolean17 = hikariConfig12.isIsolateInternalQueries();
        hikariConfig12.setAcquireIncrement((int) (short) 10);
        int int20 = hikariConfig12.getAcquireRetries();
        hikariConfig12.setUseInstrumentation(true);
        hikariConfig0.addDataSourceProperty("HikariPool-30740", (java.lang.Object) true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test22822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22822");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig0.setIdleTimeout(100L);
        long long10 = hikariConfig0.idleTimeout;
        long long11 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource12 = hikariConfig0.dataSource;
        hikariConfig0.idleTimeout = (short) 100;
        hikariConfig0.jdbcUrl = "HikariPool-4648";
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test22823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22823");
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
        javax.sql.DataSource dataSource93 = null;
        hikariConfig0.setDataSource(dataSource93);
        hikariConfig0.poolName = "HikariPool-2701";
        java.lang.String str97 = hikariConfig0.poolName;
        int int98 = hikariConfig0.getAcquireIncrement();
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
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "HikariPool-2701" + "'", str97, "HikariPool-2701");
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 1 + "'", int98 == 1);
    }

    @Test
    public void test22824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22824");
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
        hikariConfig23.setMaxLifetime(5000L);
        hikariConfig23.connectionCustomizerClassName = "HikariPool-603";
        java.util.Properties properties49 = hikariConfig23.dataSourceProperties;
        hikariConfig23.setReadOnly(true);
        long long52 = hikariConfig23.leakDetectionThreshold;
        int int53 = hikariConfig23.minPoolSize;
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
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test22825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22825");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.dataSourceClassName = "HikariPool-25";
        hikariConfig0.maxPoolSize = 3;
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setReadOnly(true);
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        long long15 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean16 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime(32L);
        java.util.Properties properties19 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test22826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22826");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.minPoolSize = (short) 1;
        boolean boolean8 = hikariConfig0.isReadOnly;
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22827");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetries((int) (short) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource18 = hikariConfig17.getDataSource();
        hikariConfig17.setConnectionTestQuery("");
        hikariConfig17.connectionCustomizerClassName = "";
        hikariConfig17.setConnectionCustomizerClassName("hi!");
        java.lang.String str25 = hikariConfig17.getCatalog();
        java.util.Properties properties26 = hikariConfig17.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str29 = hikariConfig28.getConnectionInitSql();
        long long30 = hikariConfig28.getLeakDetectionThreshold();
        hikariConfig28.leakDetectionThreshold = (-1);
        long long33 = hikariConfig28.acquireRetryDelay;
        boolean boolean34 = hikariConfig28.isRegisterMbeans;
        hikariConfig17.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean34);
        java.util.Properties properties36 = hikariConfig17.getDataSourceProperties();
        hikariConfig17.setMaxLifetime((long) 3);
        hikariConfig17.setReadOnly(true);
        hikariConfig17.poolName = "HikariPool-415";
        hikariConfig17.setConnectionInitSql("");
        hikariConfig17.setAcquireRetries(52);
        int int47 = hikariConfig17.getMinimumPoolSize();
        java.util.Properties properties48 = hikariConfig17.dataSourceProperties;
        hikariConfig0.setDataSourceProperties(properties48);
        hikariConfig0.catalog = "HikariPool-49238";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertNotNull(properties48);
    }

    @Test
    public void test22828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22828");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setPoolName("HikariPool-543");
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.acquireIncrement = (byte) 0;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test22829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22829");
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
        boolean boolean22 = hikariConfig0.isAutoCommit();
        java.lang.String str23 = hikariConfig0.getConnectionInitSql();
        int int24 = hikariConfig0.transactionIsolation;
        javax.sql.DataSource dataSource25 = null;
        hikariConfig0.setDataSource(dataSource25);
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test22830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22830");
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
        boolean boolean22 = hikariConfig0.isAutoCommit();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setReadOnly(true);
        long long27 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
    }

    @Test
    public void test22831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22831");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        hikariConfig0.setPoolName("HikariPool-1111");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1255");
        org.junit.Assert.assertNull(dataSource1);
    }

    @Test
    public void test22832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22832");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        int int5 = hikariConfig0.getMinimumPoolSize();
        int int6 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test22833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22833");
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
        java.lang.String str18 = hikariConfig0.poolName;
        javax.sql.DataSource dataSource19 = hikariConfig0.dataSource;
        javax.sql.DataSource dataSource20 = null;
        hikariConfig0.dataSource = dataSource20;
        hikariConfig0.leakDetectionThreshold = 32;
        boolean boolean24 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.poolName = "HikariPool-34114";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-52260" + "'", str18, "HikariPool-52260");
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test22834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22834");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.poolName = "HikariPool-73";
        long long11 = hikariConfig0.connectionTimeout;
        hikariConfig0.setInitializationFailFast(false);
        int int14 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test22835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22835");
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
        int int32 = hikariConfig0.getMinimumPoolSize();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test22836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22836");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        int int8 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionInitSql("HikariPool-910");
        hikariConfig0.setPoolName("HikariPool-937");
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        java.lang.String str15 = hikariConfig0.getCatalog();
        hikariConfig0.transactionIsolationName = "HikariPool-35953";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test22837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22837");
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
        hikariConfig0.connectionInitSql = "HikariPool-51915";
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-52267" + "'", str20, "HikariPool-52267");
        org.junit.Assert.assertNull(dataSource31);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertNotNull(properties37);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test22838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22838");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        int int4 = hikariConfig0.getTransactionIsolation();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.acquireRetryDelay = 1;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.setRegisterMbeans(false);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setLeakDetectionThreshold(60L);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test22839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22839");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        boolean boolean9 = hikariConfig0.isReadOnly;
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setMinimumPoolSize((int) '#');
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource15 = hikariConfig14.getDataSource();
        hikariConfig14.setConnectionTestQuery("");
        hikariConfig14.setInitializationFailFast(false);
        hikariConfig14.catalog = "";
        int int22 = hikariConfig14.getMaximumPoolSize();
        hikariConfig14.leakDetectionThreshold = (short) 10;
        hikariConfig14.jdbcUrl = "HikariPool-48";
        hikariConfig14.leakDetectionThreshold = ' ';
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig30.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer33 = hikariConfig30.connectionCustomizer;
        hikariConfig30.setDataSourceClassName("HikariPool-47");
        hikariConfig30.setDataSourceClassName("HikariPool-18");
        boolean boolean38 = hikariConfig30.isRegisterMbeans();
        java.lang.String str39 = hikariConfig30.getDataSourceClassName();
        hikariConfig30.setIdleTimeout((long) (-1));
        hikariConfig30.maxPoolSize = 0;
        hikariConfig14.addDataSourceProperty("HikariPool-1909", (java.lang.Object) 0);
        hikariConfig0.addDataSourceProperty("HikariPool-677", (java.lang.Object) "HikariPool-1909");
        int int46 = hikariConfig0.getAcquireRetries();
        boolean boolean47 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str48 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HikariPool-18" + "'", str39, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test22840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22840");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.dataSourceClassName = "HikariPool-25";
        hikariConfig0.maxPoolSize = 3;
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setReadOnly(true);
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        long long15 = hikariConfig0.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str17 = hikariConfig16.getConnectionInitSql();
        hikariConfig16.setMaxLifetime(35L);
        hikariConfig16.setAutoCommit(false);
        hikariConfig16.transactionIsolationName = "hi!";
        hikariConfig16.connectionTestQuery = "HikariPool-184";
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource27 = hikariConfig26.getDataSource();
        hikariConfig26.setConnectionTestQuery("");
        hikariConfig26.connectionCustomizerClassName = "";
        hikariConfig26.setConnectionCustomizerClassName("hi!");
        java.lang.String str34 = hikariConfig26.getCatalog();
        boolean boolean35 = hikariConfig26.isRegisterMbeans;
        hikariConfig26.setAcquireRetries(0);
        hikariConfig26.setMaximumPoolSize((int) '#');
        hikariConfig26.setTransactionIsolation("hi!");
        hikariConfig26.setConnectionInitSql("hi!");
        hikariConfig26.setCatalog("HikariPool-38");
        hikariConfig26.isIsolateInternalQueries = false;
        hikariConfig26.acquireIncrement = 'a';
        java.util.Properties properties50 = hikariConfig26.getDataSourceProperties();
        hikariConfig16.setDataSourceProperties(properties50);
        hikariConfig0.setDataSourceProperties(properties50);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties50);
        int int54 = hikariConfig53.getTransactionIsolation();
        hikariConfig53.setReadOnly(true);
        hikariConfig53.setAcquireIncrement(32);
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test22841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22841");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.maxPoolSize = 'a';
        long long12 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAcquireRetries(3);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test22842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22842");
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
        hikariConfig0.poolName = "HikariPool-2694";
        hikariConfig0.transactionIsolation = (-1);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-52283" + "'", str3, "HikariPool-52283");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-48" + "'", str27, "HikariPool-48");
    }

    @Test
    public void test22843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22843");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str7 = hikariConfig0.connectionInitSql;
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.connectionInitSql = "";
        hikariConfig0.setAcquireRetryDelay(35L);
        int int15 = hikariConfig0.acquireIncrement;
        long long16 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test22844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22844");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        java.lang.String str3 = hikariConfig0.getPoolName();
        int int4 = hikariConfig0.maxPoolSize;
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.String str7 = hikariConfig0.catalog;
        hikariConfig0.setIdleTimeout(100L);
        hikariConfig0.dataSourceClassName = "HikariPool-1313";
        boolean boolean12 = hikariConfig0.isReadOnly;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-52287" + "'", str3, "HikariPool-52287");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test22845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22845");
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
        boolean boolean17 = hikariConfig0.isIsolateInternalQueries;
        int int18 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test22846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22846");
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
        hikariConfig0.setPoolName("HikariPool-437");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig0.connectionCustomizer;
        java.lang.String str21 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-66" + "'", str21, "HikariPool-66");
    }

    @Test
    public void test22847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22847");
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
        hikariConfig0.dataSourceClassName = "HikariPool-1374";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22848");
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
        hikariConfig0.isJdbc4connectionTest = false;
        int int17 = hikariConfig0.getAcquireRetries();
        boolean boolean18 = hikariConfig0.isAutoCommit();
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-52292" + "'", str14, "HikariPool-52292");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test22849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22849");
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
        hikariConfig0.poolName = "HikariPool-5888";
        hikariConfig0.leakDetectionThreshold = 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test22850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22850");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.leakDetectionThreshold = (byte) -1;
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setPoolName("HikariPool-3488");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2378");
        hikariConfig0.addDataSourceProperty("HikariPool-21400", (java.lang.Object) "HikariPool-29266");
        hikariConfig0.setTransactionIsolation("HikariPool-4159");
        javax.sql.DataSource dataSource21 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test22851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22851");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        long long10 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(false);
        long long13 = hikariConfig0.getConnectionTimeout();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test22852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22852");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.maxPoolSize = 35;
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        int int8 = hikariConfig0.getAcquireRetries();
        boolean boolean9 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str10 = hikariConfig0.connectionTestQuery;
        java.util.Properties properties11 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test22853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22853");
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
        hikariConfig0.setRegisterMbeans(false);
        long long17 = hikariConfig0.connectionTimeout;
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        java.lang.String str20 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setPoolName("HikariPool-30177");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test22854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22854");
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
        long long18 = hikariConfig0.maxLifetime;
        int int19 = hikariConfig0.minPoolSize;
        java.lang.String str20 = hikariConfig0.dataSourceClassName;
        boolean boolean21 = hikariConfig0.isRegisterMbeans;
        int int22 = hikariConfig0.maxPoolSize;
        java.util.Properties properties23 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test22855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22855");
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
        long long18 = hikariConfig0.leakDetectionThreshold;
        int int19 = hikariConfig0.acquireRetries;
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test22856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22856");
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
        long long21 = hikariConfig0.getIdleTimeout();
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig22.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource26 = hikariConfig25.getDataSource();
        hikariConfig25.setConnectionTestQuery("");
        hikariConfig25.setInitializationFailFast(false);
        long long31 = hikariConfig25.getConnectionTimeout();
        java.util.Properties properties32 = hikariConfig25.dataSourceProperties;
        hikariConfig22.dataSourceProperties = properties32;
        hikariConfig22.maxLifetime = 750L;
        java.util.Properties properties36 = hikariConfig22.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties36;
        boolean boolean38 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str39 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(dataSource26);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test22857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22857");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        boolean boolean5 = hikariConfig0.isAutoCommit;
        java.lang.String str6 = hikariConfig0.jdbcUrl;
        hikariConfig0.leakDetectionThreshold = '4';
        java.lang.String str9 = hikariConfig0.catalog;
        long long10 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.leakDetectionThreshold = (byte) 1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test22858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22858");
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
        hikariConfig0.setAcquireRetries(1);
        java.lang.String str24 = hikariConfig0.connectionCustomizerClassName;
        java.util.Properties properties25 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test22859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22859");
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
        hikariConfig0.addDataSourceProperty("HikariPool-3449", (java.lang.Object) hikariConfig35);
        hikariConfig0.connectionTimeout = 1L;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-838" + "'", str17, "HikariPool-838");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test22860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22860");
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
        hikariConfig0.setJdbcUrl("HikariPool-322");
        hikariConfig0.setAcquireRetries((int) '4');
        boolean boolean24 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test22861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22861");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test22862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22862");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-472");
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
    }

    @Test
    public void test22863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22863");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.poolName;
        long long8 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-52315" + "'", str7, "HikariPool-52315");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test22864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22864");
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
        hikariConfig0.setPoolName("HikariPool-2636");
        java.lang.String str19 = hikariConfig0.catalog;
        boolean boolean20 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test22865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22865");
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
        boolean boolean18 = hikariConfig0.isInitializationFailFast();
        java.lang.String str19 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-47" + "'", str19, "HikariPool-47");
    }

    @Test
    public void test22866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22866");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setMaxLifetime((long) 'a');
        hikariConfig0.connectionInitSql = "HikariPool-45077";
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-52319" + "'", str3, "HikariPool-52319");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(iConnectionCustomizer24);
    }

    @Test
    public void test22867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22867");
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
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.dataSource = dataSource14;
        java.lang.String str16 = hikariConfig0.connectionInitSql;
        java.util.Properties properties17 = hikariConfig0.dataSourceProperties;
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test22868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22868");
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
        hikariConfig0.setReadOnly(false);
        int int35 = hikariConfig0.transactionIsolation;
        java.lang.String str36 = hikariConfig0.jdbcUrl;
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.Class<?> wildcardClass39 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test22869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22869");
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
        long long28 = hikariConfig0.getIdleTimeout();
        java.lang.String str29 = hikariConfig0.dataSourceClassName;
        boolean boolean30 = hikariConfig0.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer31;
        long long33 = hikariConfig0.getConnectionTimeout();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-52325" + "'", str3, "HikariPool-52325");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-48" + "'", str27, "HikariPool-48");
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
    }

    @Test
    public void test22870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22870");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        hikariConfig0.setLeakDetectionThreshold(60L);
        hikariConfig0.minPoolSize = (short) 1;
        hikariConfig0.setCatalog("HikariPool-10725");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test22871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22871");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        hikariConfig0.idleTimeout = 52L;
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.catalog = "HikariPool-31115";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test22872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22872");
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
        hikariConfig0.setPoolName("HikariPool-342");
        hikariConfig0.idleTimeout = 3L;
        int int22 = hikariConfig0.maxPoolSize;
        hikariConfig0.jdbcUrl = "HikariPool-31149";
        hikariConfig0.isInitializationFailFast = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
    }

    @Test
    public void test22873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22873");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.poolName = "HikariPool-183";
        java.lang.String str8 = hikariConfig0.getPoolName();
        java.lang.String str9 = hikariConfig0.connectionInitSql;
        hikariConfig0.setIdleTimeout(750L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-183" + "'", str8, "HikariPool-183");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test22874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22874");
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
        boolean boolean22 = hikariConfig0.isReadOnly;
        long long23 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test22875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22875");
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
        java.lang.String str27 = hikariConfig0.connectionTestQuery;
        hikariConfig0.acquireIncrement = 52;
        java.lang.String str30 = hikariConfig0.catalog;
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test22876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22876");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.poolName;
        boolean boolean10 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setMaxLifetime((long) (short) 1);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        int int14 = hikariConfig0.acquireIncrement;
        long long15 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setCatalog("HikariPool-225");
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52336" + "'", str9, "HikariPool-52336");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test22877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22877");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        hikariConfig0.transactionIsolation = 1;
        hikariConfig0.dataSourceClassName = "HikariPool-1067";
        hikariConfig0.setTransactionIsolation("HikariPool-4219");
        java.lang.String str14 = hikariConfig0.dataSourceClassName;
        java.util.Properties properties15 = null;
        hikariConfig0.dataSourceProperties = properties15;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-1067" + "'", str14, "HikariPool-1067");
    }

    @Test
    public void test22878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22878");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-134");
        long long17 = hikariConfig0.getMaxLifetime();
        hikariConfig0.maxLifetime = (short) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test22879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22879");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.maxLifetime = (short) 100;
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.connectionTimeout = 10;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test22880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22880");
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
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test22881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22881");
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
        boolean boolean28 = hikariConfig0.isJdbc4connectionTest;
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test22882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22882");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-16");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        int int11 = hikariConfig0.getMinimumPoolSize();
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.connectionTestQuery = "HikariPool-13362";
        hikariConfig0.connectionInitSql = "HikariPool-44835";
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test22883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22883");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.connectionTimeout;
        boolean boolean8 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAutoCommit(false);
        int int13 = hikariConfig0.maxPoolSize;
        hikariConfig0.acquireRetryDelay = 0;
        java.lang.String str16 = hikariConfig0.getPoolName();
        hikariConfig0.setMaxLifetime((long) (byte) 10);
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-52344" + "'", str16, "HikariPool-52344");
    }

    @Test
    public void test22884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22884");
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
        java.lang.String str18 = hikariConfig0.dataSourceClassName;
        hikariConfig0.acquireRetryDelay = 3;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test22885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22885");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        boolean boolean8 = hikariConfig0.isReadOnly();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.isReadOnly = false;
        hikariConfig0.acquireRetries = (byte) 1;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-8307");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test22886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22886");
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
        int int27 = hikariConfig0.getAcquireRetries();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-225";
        long long30 = hikariConfig0.idleTimeout;
        java.util.Properties properties31 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-20710");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource21);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test22887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22887");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.acquireIncrement = (short) 10;
        hikariConfig0.setCatalog("HikariPool-390");
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test22888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22888");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        long long4 = hikariConfig0.maxLifetime;
        long long5 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str6 = hikariConfig0.dataSourceClassName;
        java.lang.String str7 = hikariConfig0.catalog;
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test22889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22889");
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
        java.lang.String str27 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean28 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str29 = hikariConfig0.getPoolName();
        java.util.Properties properties30 = null;
        hikariConfig0.dataSourceProperties = properties30;
        java.lang.String str32 = hikariConfig0.poolName;
        boolean boolean33 = hikariConfig0.isReadOnly();
        hikariConfig0.connectionTimeout = (short) 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-52353" + "'", str29, "HikariPool-52353");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-52353" + "'", str32, "HikariPool-52353");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test22890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22890");
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
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean37 = hikariConfig0.isReadOnly();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test22891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22891");
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
        hikariConfig0.maxLifetime = (short) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-62" + "'", str15, "HikariPool-62");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test22892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22892");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer2;
        javax.sql.DataSource dataSource4 = hikariConfig0.getDataSource();
        java.lang.String str5 = hikariConfig0.dataSourceClassName;
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test22893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22893");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        long long6 = hikariConfig0.maxLifetime;
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.dataSourceClassName = "HikariPool-383";
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        java.lang.String str11 = hikariConfig0.getCatalog();
        long long12 = hikariConfig0.maxLifetime;
        hikariConfig0.isReadOnly = true;
        java.lang.String str15 = hikariConfig0.getCatalog();
        hikariConfig0.setMaxLifetime((long) (byte) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-52360" + "'", str7, "HikariPool-52360");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test22894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22894");
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
        long long23 = hikariConfig0.getMaxLifetime();
        int int24 = hikariConfig0.transactionIsolation;
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setConnectionTestQuery("");
        boolean boolean29 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource30 = hikariConfig0.dataSource;
        hikariConfig0.setMinimumPoolSize(10);
        hikariConfig0.setAcquireRetryDelay((long) (short) 1);
        hikariConfig0.idleTimeout = 2147483647L;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(dataSource30);
    }

    @Test
    public void test22895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22895");
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
        int int25 = hikariConfig23.maxPoolSize;
        hikariConfig23.catalog = "HikariPool-905";
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-52363" + "'", str3, "HikariPool-52363");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
    }

    @Test
    public void test22896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22896");
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
        hikariConfig0.leakDetectionThreshold = 5000L;
        java.lang.String str24 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test22897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22897");
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
        hikariConfig0.connectionInitSql = "HikariPool-457";
        java.lang.String str18 = hikariConfig0.transactionIsolationName;
        java.lang.String str19 = hikariConfig0.getConnectionInitSql();
        java.lang.String str20 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-457" + "'", str19, "HikariPool-457");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test22898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22898");
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
        long long15 = hikariConfig0.getMaxLifetime();
        hikariConfig0.maxLifetime = (short) 100;
        hikariConfig0.setJdbcUrl("HikariPool-858");
        java.lang.String str20 = hikariConfig0.catalog;
        boolean boolean21 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test22899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22899");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.connectionTimeout = 97L;
        java.lang.String str13 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test22900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22900");
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
        int int31 = hikariConfig0.getAcquireRetries();
        java.lang.String str32 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.idleTimeout = 52;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-18" + "'", str32, "HikariPool-18");
    }

    @Test
    public void test22901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22901");
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
        hikariConfig0.dataSourceClassName = "";
        boolean boolean19 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.connectionInitSql = "HikariPool-48026";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test22902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22902");
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
        boolean boolean15 = hikariConfig0.isReadOnly;
        hikariConfig0.isIsolateInternalQueries = false;
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.dataSource = dataSource18;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test22903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22903");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.isRegisterMbeans = true;
        int int11 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test22904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22904");
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
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
        java.lang.String str18 = hikariConfig0.transactionIsolationName;
        java.lang.String str19 = hikariConfig0.jdbcUrl;
        hikariConfig0.setDataSourceClassName("HikariPool-272");
        hikariConfig0.setCatalog("HikariPool-4621");
        boolean boolean24 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.maxPoolSize = 3;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-52376" + "'", str15, "HikariPool-52376");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test22905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22905");
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
        hikariConfig0.isRegisterMbeans = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test22906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22906");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        hikariConfig0.acquireRetryDelay = 35;
        long long12 = hikariConfig0.idleTimeout;
        java.util.Properties properties13 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setTransactionIsolation("HikariPool-9846");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.acquireIncrement = (short) 1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test22907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22907");
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
        com.zaxxer.hikari.HikariConfig hikariConfig91 = new com.zaxxer.hikari.HikariConfig(properties85);
        hikariConfig91.isIsolateInternalQueries = true;
        hikariConfig91.setJdbcUrl("HikariPool-4540");
        long long96 = hikariConfig91.getAcquireRetryDelay();
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
// flaky:         org.junit.Assert.assertTrue("'" + long96 + "' != '" + 100L + "'", long96 == 100L);
    }

    @Test
    public void test22908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22908");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.acquireRetryDelay = 100;
        hikariConfig0.poolName = "HikariPool-152";
        int int14 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-616");
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.dataSource = dataSource17;
        hikariConfig0.connectionInitSql = "HikariPool-599";
        java.lang.String str21 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test22909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22909");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.lang.String str8 = hikariConfig0.connectionInitSql;
        hikariConfig0.dataSourceClassName = "HikariPool-62";
        hikariConfig0.setMaxLifetime((-1L));
        hikariConfig0.jdbcUrl = "HikariPool-2361";
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.dataSource = dataSource15;
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test22910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22910");
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
        long long13 = hikariConfig0.acquireRetryDelay;
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test22911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22911");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        long long7 = hikariConfig0.maxLifetime;
        long long8 = hikariConfig0.leakDetectionThreshold;
        long long9 = hikariConfig0.getMaxLifetime();
        hikariConfig0.connectionInitSql = "HikariPool-3745";
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
        javax.sql.DataSource dataSource26 = hikariConfig12.dataSource;
        hikariConfig12.idleTimeout = (short) 1;
        hikariConfig12.connectionTimeout = 0L;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = null;
        hikariConfig12.connectionCustomizer = iConnectionCustomizer31;
        java.util.Properties properties33 = hikariConfig12.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties33;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int36 = hikariConfig35.maxPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
    }

    @Test
    public void test22912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22912");
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
        boolean boolean16 = hikariConfig0.isReadOnly;
        boolean boolean17 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test22913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22913");
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
        hikariConfig0.leakDetectionThreshold = 10;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-52398" + "'", str3, "HikariPool-52398");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test22914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22914");
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
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        long long17 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-52401" + "'", str12, "HikariPool-52401");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test22915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22915");
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
        java.util.Properties properties17 = null;
        hikariConfig0.dataSourceProperties = properties17;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test22916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22916");
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
        hikariConfig0.minPoolSize = (-1);
        hikariConfig0.setMinimumPoolSize(10);
        hikariConfig0.poolName = "HikariPool-29014";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test22917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22917");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = hikariConfig0.getDataSource();
        boolean boolean9 = hikariConfig0.isReadOnly;
        int int10 = hikariConfig0.getAcquireRetries();
        boolean boolean11 = hikariConfig0.isAutoCommit();
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test22918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22918");
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
        int int31 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource32 = null;
        hikariConfig0.dataSource = dataSource32;
        hikariConfig0.acquireIncrement = 1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2147483647L + "'", long30 == 2147483647L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test22919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22919");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.minPoolSize = (byte) 100;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-285");
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
        hikariConfig9.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties31 = hikariConfig9.getDataSourceProperties();
        java.util.Properties properties32 = hikariConfig9.dataSourceProperties;
        hikariConfig9.connectionTestQuery = "HikariPool-149";
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource36 = hikariConfig35.getDataSource();
        hikariConfig35.setConnectionTestQuery("");
        hikariConfig35.connectionCustomizerClassName = "";
        hikariConfig35.setConnectionCustomizerClassName("hi!");
        java.lang.String str43 = hikariConfig35.getCatalog();
        java.util.Properties properties44 = hikariConfig35.dataSourceProperties;
        int int45 = hikariConfig35.minPoolSize;
        java.lang.String str46 = hikariConfig35.getConnectionTestQuery();
        java.util.Properties properties47 = hikariConfig35.dataSourceProperties;
        hikariConfig9.setDataSourceProperties(properties47);
        hikariConfig0.setDataSourceProperties(properties47);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-15400";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer52 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(dataSource36);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(iConnectionCustomizer52);
    }

    @Test
    public void test22920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22920");
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
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str25 = hikariConfig0.getCatalog();
        hikariConfig0.setCatalog("HikariPool-14692");
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test22921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22921");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setJdbcUrl("HikariPool-283");
        hikariConfig0.connectionCustomizerClassName = "HikariPool-208";
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str14 = hikariConfig0.getPoolName();
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.setAcquireRetries(97);
        java.lang.String str19 = hikariConfig0.poolName;
        boolean boolean20 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-52413" + "'", str14, "HikariPool-52413");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-52413" + "'", str19, "HikariPool-52413");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test22922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22922");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setCatalog("HikariPool-135");
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        boolean boolean13 = hikariConfig0.isInitializationFailFast;
        java.lang.String str14 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test22923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22923");
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
        java.lang.String str16 = hikariConfig0.getPoolName();
        hikariConfig0.setConnectionInitSql("HikariPool-16265");
        hikariConfig0.connectionTimeout = 52L;
        hikariConfig0.setMaximumPoolSize(60);
        int int23 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-52415" + "'", str16, "HikariPool-52415");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test22924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22924");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.idleTimeout = (short) 10;
        hikariConfig0.maxPoolSize = (byte) 10;
        int int9 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test22925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22925");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setPoolName("HikariPool-149");
        java.lang.String str10 = hikariConfig0.poolName;
        int int11 = hikariConfig0.acquireRetries;
        java.lang.String str12 = hikariConfig0.transactionIsolationName;
        long long13 = hikariConfig0.getMaxLifetime();
        boolean boolean14 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-149" + "'", str10, "HikariPool-149");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22926");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMinimumPoolSize(0);
        hikariConfig0.setAcquireRetries((int) (byte) 10);
        java.lang.String str13 = hikariConfig0.getPoolName();
        java.lang.String str14 = hikariConfig0.poolName;
        int int15 = hikariConfig0.minPoolSize;
        long long16 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-52418" + "'", str13, "HikariPool-52418");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-52418" + "'", str14, "HikariPool-52418");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test22927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22927");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.poolName = "";
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-25496");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test22928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22928");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.dataSourceClassName = "HikariPool-3259";
        hikariConfig0.setReadOnly(false);
        hikariConfig0.minPoolSize = 10;
        long long19 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionTestQuery("HikariPool-17057");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test22929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22929");
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
        int int13 = hikariConfig0.getMinimumPoolSize();
        int int14 = hikariConfig0.transactionIsolation;
        int int15 = hikariConfig0.getAcquireIncrement();
        boolean boolean16 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test22930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22930");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        java.lang.String str5 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.connectionTimeout = 35;
        hikariConfig0.jdbcUrl = "HikariPool-2466";
        long long10 = hikariConfig0.idleTimeout;
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test22931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22931");
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
        hikariConfig0.maxLifetime = 97;
        hikariConfig0.minPoolSize = 0;
        java.lang.String str23 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setPoolName("HikariPool-885");
        boolean boolean26 = hikariConfig0.isAutoCommit();
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test22932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22932");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        hikariConfig0.transactionIsolation = 'a';
        hikariConfig0.acquireIncrement = 10;
        hikariConfig0.maxPoolSize = (short) 0;
        hikariConfig0.isReadOnly = false;
        int int17 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str20 = hikariConfig19.getJdbcUrl();
        boolean boolean21 = hikariConfig19.isAutoCommit;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = hikariConfig19.connectionCustomizer;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.setInitializationFailFast(false);
        hikariConfig23.catalog = "";
        javax.sql.DataSource dataSource31 = null;
        hikariConfig23.dataSource = dataSource31;
        javax.sql.DataSource dataSource33 = null;
        hikariConfig23.dataSource = dataSource33;
        int int35 = hikariConfig23.maxPoolSize;
        hikariConfig23.transactionIsolation = (short) 0;
        java.lang.String str38 = hikariConfig23.getConnectionInitSql();
        int int39 = hikariConfig23.getAcquireRetries();
        hikariConfig23.leakDetectionThreshold = 1L;
        hikariConfig23.acquireRetryDelay = 52L;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig44.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource48 = hikariConfig47.getDataSource();
        hikariConfig47.setConnectionTestQuery("");
        hikariConfig47.setInitializationFailFast(false);
        long long53 = hikariConfig47.getConnectionTimeout();
        java.util.Properties properties54 = hikariConfig47.dataSourceProperties;
        hikariConfig44.dataSourceProperties = properties54;
        java.lang.String str56 = hikariConfig44.catalog;
        hikariConfig44.catalog = "HikariPool-65";
        hikariConfig44.acquireIncrement = (short) 0;
        java.util.Properties properties61 = hikariConfig44.getDataSourceProperties();
        hikariConfig23.dataSourceProperties = properties61;
        hikariConfig19.dataSourceProperties = properties61;
        hikariConfig0.addDataSourceProperty("HikariPool-4087", (java.lang.Object) properties61);
        int int65 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer22);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNull(dataSource48);
// flaky:         org.junit.Assert.assertTrue("'" + long53 + "' != '" + 32L + "'", long53 == 32L);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(properties61);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
    }

    @Test
    public void test22933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22933");
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
        long long31 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
    }

    @Test
    public void test22934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22934");
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
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
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
    }

    @Test
    public void test22935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22935");
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
        hikariConfig0.jdbcUrl = "HikariPool-1153";
        boolean boolean16 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setConnectionTimeout(0L);
        int int19 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test22936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22936");
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
        boolean boolean91 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.idleTimeout = 1;
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
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test22937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22937");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-4906");
        java.lang.String str8 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test22938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22938");
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
        hikariConfig0.dataSourceClassName = "HikariPool-29";
        hikariConfig0.setMaximumPoolSize(0);
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        int int19 = hikariConfig0.getTransactionIsolation();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource22 = hikariConfig21.getDataSource();
        hikariConfig21.setConnectionTestQuery("");
        hikariConfig21.connectionCustomizerClassName = "";
        hikariConfig21.setConnectionCustomizerClassName("hi!");
        java.lang.String str29 = hikariConfig21.getCatalog();
        boolean boolean30 = hikariConfig21.isRegisterMbeans;
        hikariConfig21.setAcquireRetries(0);
        hikariConfig21.setMaximumPoolSize((int) '#');
        hikariConfig21.setTransactionIsolation("hi!");
        boolean boolean37 = hikariConfig21.isInitializationFailFast();
        long long38 = hikariConfig21.getMaxLifetime();
        javax.sql.DataSource dataSource39 = hikariConfig21.dataSource;
        java.lang.String str40 = hikariConfig21.getConnectionCustomizerClassName();
        hikariConfig21.dataSourceClassName = "HikariPool-4155";
        hikariConfig0.addDataSourceProperty("HikariPool-93", (java.lang.Object) hikariConfig21);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-29" + "'", str18, "HikariPool-29");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNull(dataSource39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test22939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22939");
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
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        long long15 = hikariConfig0.getMaxLifetime();
        hikariConfig0.maxLifetime = 52L;
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.acquireRetryDelay = 52;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
    }

    @Test
    public void test22940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22940");
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
        hikariConfig0.maxPoolSize = 3;
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
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
    public void test22941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22941");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        hikariConfig0.acquireRetryDelay = 35;
        int int12 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.acquireRetryDelay = 60;
        long long15 = hikariConfig0.acquireRetryDelay;
        java.lang.Class<?> wildcardClass16 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test22942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22942");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-16");
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        hikariConfig0.setJdbcUrl("HikariPool-4890");
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test22943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22943");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setPoolName("HikariPool-149");
        java.lang.String str10 = hikariConfig0.poolName;
        int int11 = hikariConfig0.acquireRetries;
        int int12 = hikariConfig0.getMaximumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-149" + "'", str10, "HikariPool-149");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test22944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22944");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold(10L);
        java.lang.String str6 = hikariConfig0.connectionTestQuery;
        hikariConfig0.transactionIsolationName = "";
        java.lang.String str9 = hikariConfig0.connectionTestQuery;
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test22945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22945");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.util.Properties properties5 = hikariConfig0.dataSourceProperties;
        int int6 = hikariConfig0.acquireIncrement;
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        hikariConfig0.connectionInitSql = "HikariPool-838";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test22946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22946");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        hikariConfig0.setRegisterMbeans(true);
        long long8 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(dataSource5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test22947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22947");
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
        java.lang.String str16 = hikariConfig0.jdbcUrl;
        java.lang.String str17 = hikariConfig0.connectionInitSql;
        hikariConfig0.acquireRetryDelay = 3;
        long long20 = hikariConfig0.getMaxLifetime();
        hikariConfig0.minPoolSize = (-1);
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test22948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22948");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        int int9 = hikariConfig0.maxPoolSize;
        hikariConfig0.connectionTestQuery = "HikariPool-4443";
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.setInitializationFailFast(false);
        long long22 = hikariConfig16.getConnectionTimeout();
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig13.dataSourceProperties = properties23;
        java.lang.String str25 = hikariConfig13.getConnectionTestQuery();
        hikariConfig13.acquireRetryDelay = 0;
        boolean boolean28 = hikariConfig13.isAutoCommit();
        hikariConfig0.addDataSourceProperty("HikariPool-7708", (java.lang.Object) boolean28);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test22949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22949");
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
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        boolean boolean15 = hikariConfig0.isAutoCommit;
        hikariConfig0.setMaximumPoolSize(0);
        boolean boolean18 = hikariConfig0.isInitializationFailFast();
        java.lang.String str19 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.maxPoolSize = (byte) 100;
        hikariConfig0.acquireIncrement = ' ';
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test22950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22950");
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
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str19 = hikariConfig0.getPoolName();
        hikariConfig0.isReadOnly = false;
        java.lang.String str22 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-417" + "'", str19, "HikariPool-417");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test22951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22951");
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
        boolean boolean17 = hikariConfig0.isAutoCommit();
        boolean boolean18 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-52464" + "'", str14, "HikariPool-52464");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test22952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22952");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.minPoolSize;
        java.lang.String str2 = hikariConfig0.catalog;
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        hikariConfig0.minPoolSize = 0;
        boolean boolean6 = hikariConfig0.isReadOnly;
        long long7 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test22953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22953");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        long long12 = hikariConfig0.idleTimeout;
        hikariConfig0.isAutoCommit = false;
        int int15 = hikariConfig0.minPoolSize;
        hikariConfig0.isInitializationFailFast = true;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test22954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22954");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMaximumPoolSize((int) '#');
        java.lang.String str10 = hikariConfig0.connectionCustomizerClassName;
        long long11 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        boolean boolean14 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test22955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22955");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setCatalog("HikariPool-1056");
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAutoCommit(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer12;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test22956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22956");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        hikariConfig0.acquireIncrement = (byte) 100;
        hikariConfig0.setLeakDetectionThreshold(60L);
        hikariConfig0.transactionIsolationName = "HikariPool-932";
        int int15 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test22957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22957");
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
        hikariConfig0.setAutoCommit(false);
        java.lang.String str25 = hikariConfig0.connectionTestQuery;
        boolean boolean26 = hikariConfig0.isAutoCommit();
        boolean boolean27 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 0);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test22958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22958");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-4472");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-4472 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22959");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        java.lang.String str11 = hikariConfig0.getPoolName();
        int int12 = hikariConfig0.getAcquireIncrement();
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.transactionIsolationName = "HikariPool-176";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-52475" + "'", str11, "HikariPool-52475");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test22960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22960");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.setAcquireRetryDelay((long) 100);
        java.lang.String str5 = hikariConfig0.getCatalog();
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean7 = hikariConfig0.isInitializationFailFast();
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.dataSourceClassName = "HikariPool-1226";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMinimumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22961");
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
        hikariConfig0.setCatalog("HikariPool-383");
        boolean boolean27 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str28 = hikariConfig0.getDataSourceClassName();
        boolean boolean29 = hikariConfig0.isRegisterMbeans;
        boolean boolean30 = hikariConfig0.isAutoCommit();
        boolean boolean31 = hikariConfig0.isReadOnly;
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
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test22962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22962");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMaximumPoolSize((int) '#');
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        long long12 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        hikariConfig0.connectionInitSql = "HikariPool-1632";
        hikariConfig0.setCatalog("");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer19;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test22963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22963");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setLeakDetectionThreshold((long) (short) -1);
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test22964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22964");
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
        java.lang.String str16 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.transactionIsolation = 0;
        int int19 = hikariConfig0.maxPoolSize;
        hikariConfig0.acquireRetryDelay = 32;
        hikariConfig0.connectionTimeout = 'a';
        hikariConfig0.catalog = "HikariPool-17520";
        hikariConfig0.setPoolName("HikariPool-2424");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test22965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22965");
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
        long long18 = hikariConfig0.acquireRetryDelay;
        long long19 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setConnectionTestQuery("HikariPool-39111");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test22966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22966");
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
        boolean boolean37 = hikariConfig13.isRegisterMbeans;
        hikariConfig13.dataSourceClassName = "HikariPool-15558";
        java.util.Properties properties40 = hikariConfig13.dataSourceProperties;
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test22967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22967");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        java.lang.String str2 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAutoCommit(true);
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        int int6 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test22968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22968");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        boolean boolean5 = hikariConfig0.isAutoCommit;
        java.lang.String str6 = hikariConfig0.transactionIsolationName;
        int int7 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.acquireIncrement = 60;
        long long10 = hikariConfig0.idleTimeout;
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test22969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22969");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str16 = hikariConfig15.getConnectionInitSql();
        long long17 = hikariConfig15.getLeakDetectionThreshold();
        int int18 = hikariConfig15.getMaximumPoolSize();
        long long19 = hikariConfig15.leakDetectionThreshold;
        hikariConfig15.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        long long29 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig23.setDataSourceClassName("HikariPool-66");
        hikariConfig23.setInitializationFailFast(false);
        hikariConfig15.addDataSourceProperty("HikariPool-62", (java.lang.Object) hikariConfig23);
        hikariConfig0.addDataSourceProperty("HikariPool-216", (java.lang.Object) hikariConfig23);
        java.lang.String str36 = hikariConfig0.poolName;
        java.lang.String str37 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(dataSource24);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-52489" + "'", str36, "HikariPool-52489");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test22970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22970");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setMaximumPoolSize((int) (short) 10);
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        hikariConfig0.maxLifetime = 2147483647L;
        boolean boolean14 = hikariConfig0.isReadOnly;
        java.lang.String str15 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test22971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22971");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-32117";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test22972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22972");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setJdbcUrl("HikariPool-511");
        hikariConfig0.isRegisterMbeans = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test22973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22973");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.connectionTestQuery = "HikariPool-331";
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.connectionTestQuery = "HikariPool-1019";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer13;
        boolean boolean15 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test22974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22974");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.connectionTestQuery = "HikariPool-331";
        int int7 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.maxLifetime = 1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test22975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22975");
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
        int int18 = hikariConfig0.acquireIncrement;
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setIdleTimeout((long) (short) 100);
        int int23 = hikariConfig0.getAcquireIncrement();
        int int24 = hikariConfig0.minPoolSize;
        boolean boolean25 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int28 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
    }

    @Test
    public void test22976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22976");
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
        int int23 = hikariConfig0.acquireRetries;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig0.setAcquireRetryDelay((long) (short) 100);
        boolean boolean28 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test22977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22977");
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
        hikariConfig0.isReadOnly = true;
        java.lang.String str23 = hikariConfig0.jdbcUrl;
        java.lang.String str24 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-52500" + "'", str18, "HikariPool-52500");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-127" + "'", str23, "HikariPool-127");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test22978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22978");
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
            hikariConfig0.setAcquireRetryDelay((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test22979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22979");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-16");
        boolean boolean7 = hikariConfig0.isReadOnly();
        int int8 = hikariConfig0.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-4382");
        boolean boolean12 = hikariConfig0.isReadOnly;
        hikariConfig0.setConnectionInitSql("HikariPool-6525");
        javax.sql.DataSource dataSource15 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test22980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22980");
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
        java.lang.String str21 = hikariConfig0.connectionTestQuery;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer22;
        hikariConfig0.maxPoolSize = 1;
        hikariConfig0.setLeakDetectionThreshold((long) 3);
        java.util.Properties properties28 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test22981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22981");
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
        java.lang.String str16 = hikariConfig0.connectionTestQuery;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str18 = hikariConfig17.getConnectionInitSql();
        long long19 = hikariConfig17.getLeakDetectionThreshold();
        hikariConfig17.leakDetectionThreshold = (-1);
        int int22 = hikariConfig17.acquireIncrement;
        hikariConfig17.setInitializationFailFast(true);
        hikariConfig17.setMaximumPoolSize((int) '#');
        long long27 = hikariConfig17.getLeakDetectionThreshold();
        java.lang.String str28 = hikariConfig17.getConnectionInitSql();
        java.util.Properties properties29 = hikariConfig17.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str33 = hikariConfig32.getConnectionInitSql();
        long long34 = hikariConfig32.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = null;
        hikariConfig32.connectionCustomizer = iConnectionCustomizer35;
        boolean boolean37 = hikariConfig32.isIsolateInternalQueries();
        hikariConfig32.setAcquireIncrement((int) (short) 10);
        int int40 = hikariConfig32.getAcquireRetries();
        java.util.Properties properties41 = hikariConfig32.getDataSourceProperties();
        hikariConfig32.setConnectionInitSql("HikariPool-910");
        hikariConfig32.setPoolName("HikariPool-937");
        hikariConfig32.acquireRetries = 100;
        hikariConfig0.addDataSourceProperty("HikariPool-4522", (java.lang.Object) hikariConfig32);
        hikariConfig32.maxLifetime = 0L;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(properties41);
    }

    @Test
    public void test22982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22982");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setReadOnly(false);
        java.lang.String str9 = hikariConfig0.getPoolName();
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIdleTimeout(100L);
        hikariConfig0.catalog = "HikariPool-154";
        java.lang.String str15 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52507" + "'", str9, "HikariPool-52507");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test22983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22983");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.setInitializationFailFast(false);
        long long17 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setJdbcUrl("HikariPool-47");
        hikariConfig11.isIsolateInternalQueries = false;
        hikariConfig11.connectionTestQuery = "HikariPool-62";
        hikariConfig11.isInitializationFailFast = false;
        hikariConfig0.addDataSourceProperty("HikariPool-2460", (java.lang.Object) false);
        int int27 = hikariConfig0.transactionIsolation;
        long long28 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(dataSource12);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
    }

    @Test
    public void test22984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22984");
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
        hikariConfig0.acquireRetries = (short) 1;
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        long long21 = hikariConfig0.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(97L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test22985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22985");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setMaxLifetime((long) '4');
        int int6 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.maxPoolSize = 60;
        hikariConfig0.leakDetectionThreshold = '4';
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test22986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22986");
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
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test22987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22987");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-137");
        java.lang.String str23 = hikariConfig0.connectionInitSql;
        int int24 = hikariConfig0.getAcquireRetries();
        long long25 = hikariConfig0.connectionTimeout;
        boolean boolean26 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test22988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22988");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setCatalog("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.dataSource = dataSource9;
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-2943");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-2943' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test22989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22989");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        hikariConfig0.setMaxLifetime((long) 100);
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        long long11 = hikariConfig0.getConnectionTimeout();
        int int12 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test22990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22990");
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
        hikariConfig0.transactionIsolation = (short) 0;
        hikariConfig0.acquireRetries = 100;
        hikariConfig0.minPoolSize = (byte) 1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test22991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22991");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.minPoolSize;
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.isAutoCommit = false;
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test22992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22992");
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
        hikariConfig0.setDataSourceClassName("HikariPool-620");
        java.lang.String str17 = hikariConfig0.dataSourceClassName;
        hikariConfig0.isRegisterMbeans = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-620" + "'", str17, "HikariPool-620");
    }

    @Test
    public void test22993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22993");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        hikariConfig0.setJdbcUrl("HikariPool-47");
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        int int14 = hikariConfig0.transactionIsolation;
        hikariConfig0.setLeakDetectionThreshold(52L);
        hikariConfig0.connectionTimeout = (short) 1;
        java.lang.String str19 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean20 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.maxPoolSize = (-1);
        hikariConfig0.setDataSourceClassName("HikariPool-1905");
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test22994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22994");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        hikariConfig0.setAcquireRetries(100);
        hikariConfig0.setMinimumPoolSize(3);
        hikariConfig0.maxLifetime = 2147483647L;
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test22995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22995");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.maxLifetime;
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str10 = hikariConfig0.catalog;
        hikariConfig0.dataSourceClassName = "HikariPool-5082";
        long long13 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test22996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22996");
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
        java.lang.String str16 = hikariConfig0.transactionIsolationName;
        long long17 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test22997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22997");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.dataSourceClassName = "HikariPool-165";
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 1);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test22998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22998");
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
        int int12 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.idleTimeout = 52;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test22999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test22999");
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
        int int31 = hikariConfig0.getAcquireRetries();
        boolean boolean32 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test23000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest45.test23000");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.isReadOnly = true;
        java.lang.String str4 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionTestQuery("HikariPool-2617");
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        java.lang.String str8 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-2617" + "'", str8, "HikariPool-2617");
    }
}
