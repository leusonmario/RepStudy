import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05501");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        long long7 = hikariConfig0.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        hikariConfig8.connectionCustomizerClassName = "";
        hikariConfig8.setConnectionCustomizerClassName("hi!");
        java.lang.String str16 = hikariConfig8.getCatalog();
        int int17 = hikariConfig8.acquireRetries;
        hikariConfig8.setRegisterMbeans(true);
        java.lang.String str20 = hikariConfig8.getDataSourceClassName();
        java.util.Properties properties21 = hikariConfig8.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig0.dataSourceProperties = properties21;
        hikariConfig0.minPoolSize = 97;
        hikariConfig0.isRegisterMbeans = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05502");
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
        long long15 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05503");
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
        int int37 = hikariConfig0.getAcquireIncrement();
        java.lang.String str38 = hikariConfig0.getJdbcUrl();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05504");
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
        java.util.Properties properties15 = hikariConfig0.dataSourceProperties;
        int int16 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05505");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        java.lang.String str2 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.catalog = "HikariPool-474";
        hikariConfig0.setConnectionTestQuery("HikariPool-1087");
        hikariConfig0.setDataSourceClassName("HikariPool-5915");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05506");
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
        boolean boolean12 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean13 = hikariConfig0.isInitializationFailFast();
        int int14 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05507");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        long long4 = hikariConfig0.maxLifetime;
        long long5 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setAcquireRetryDelay(10L);
        hikariConfig0.connectionTestQuery = "HikariPool-590";
        hikariConfig0.idleTimeout = 35;
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int14 = hikariConfig0.maxPoolSize;
        int int15 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05508");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        java.lang.String str5 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.connectionTimeout = 35;
        int int8 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05509");
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
        hikariConfig0.acquireRetryDelay = 60;
        hikariConfig0.setJdbcUrl("HikariPool-2755");
        hikariConfig0.maxLifetime = 10L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05510");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setCatalog("HikariPool-880");
        int int11 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05511");
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
        hikariConfig0.dataSource = dataSource18;
        hikariConfig0.jdbcUrl = "HikariPool-75";
        boolean boolean22 = hikariConfig0.isInitializationFailFast;
        int int23 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05512");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setAcquireRetryDelay(5000L);
        java.lang.String str11 = hikariConfig0.transactionIsolationName;
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05513");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        boolean boolean10 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05514");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        int int8 = hikariConfig0.maxPoolSize;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05515");
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
        boolean boolean26 = hikariConfig7.isIsolateInternalQueries();
        hikariConfig7.setPoolName("HikariPool-9116");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05516");
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
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.idleTimeout = (short) 1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05517");
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
        boolean boolean36 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties31);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-14048" + "'", str33, "HikariPool-14048");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05518");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.poolName = "HikariPool-428";
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.setInitializationFailFast(false);
        hikariConfig12.catalog = "";
        javax.sql.DataSource dataSource20 = hikariConfig12.getDataSource();
        hikariConfig12.poolName = "HikariPool-73";
        hikariConfig0.addDataSourceProperty("HikariPool-215", (java.lang.Object) "HikariPool-73");
        boolean boolean24 = hikariConfig0.isAutoCommit;
        boolean boolean25 = hikariConfig0.isAutoCommit;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05519");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        hikariConfig0.maxPoolSize = (short) 100;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.maxLifetime = 97L;
        hikariConfig0.minPoolSize = (byte) 10;
        hikariConfig0.setMaxLifetime((long) 35);
        int int16 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setDataSourceClassName("HikariPool-1173");
        java.util.Properties properties21 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties22 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05520");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1602");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1602 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05521");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionTimeout(5000L);
        boolean boolean3 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05522");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        java.util.Properties properties8 = hikariConfig0.dataSourceProperties;
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbcUrl("HikariPool-29");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05523");
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
        hikariConfig0.setCatalog("HikariPool-3809");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05524");
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
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        int int17 = hikariConfig0.acquireRetries;
        hikariConfig0.poolName = "HikariPool-307";
        javax.sql.DataSource dataSource20 = null;
        hikariConfig0.dataSource = dataSource20;
        long long22 = hikariConfig0.idleTimeout;
        javax.sql.DataSource dataSource23 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(dataSource23);
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05525");
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
        hikariConfig0.connectionTestQuery = "HikariPool-3646";
        java.lang.String str31 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIdleTimeout(2147483647L);
        boolean boolean34 = hikariConfig0.isReadOnly();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05526");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetryDelay((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05527");
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
        hikariConfig0.acquireIncrement = (byte) 1;
        java.lang.String str22 = hikariConfig0.getConnectionInitSql();
        boolean boolean23 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05528");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        hikariConfig0.connectionTimeout = (byte) 1;
        java.lang.String str11 = hikariConfig0.jdbcUrl;
        boolean boolean12 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05529");
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
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05530");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        hikariConfig0.setMaxLifetime(1L);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05531");
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
        int int17 = hikariConfig0.acquireIncrement;
        int int18 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05532");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig0.connectionCustomizer;
        java.lang.String str14 = hikariConfig0.getCatalog();
        java.lang.String str15 = hikariConfig0.catalog;
        hikariConfig0.minPoolSize = 35;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05533");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setPoolName("HikariPool-149");
        java.lang.String str10 = hikariConfig0.poolName;
        int int11 = hikariConfig0.acquireRetries;
        javax.sql.DataSource dataSource12 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-149" + "'", str10, "HikariPool-149");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05534");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionCustomizerClassName("");
        boolean boolean12 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05535");
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
        boolean boolean23 = hikariConfig15.isAutoCommit;
        hikariConfig15.catalog = "HikariPool-1092";
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05536");
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
        hikariConfig0.leakDetectionThreshold = 'a';
        java.lang.String str22 = hikariConfig0.catalog;
        hikariConfig0.setAcquireRetries(100);
        hikariConfig0.setIdleTimeout(100L);
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05537");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-511");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-14099" + "'", str11, "HikariPool-14099");
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
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05538");
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
        hikariConfig0.setIdleTimeout((long) 'a');
        long long13 = hikariConfig0.getIdleTimeout();
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str15 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05539");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isReadOnly();
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setAcquireRetries((int) (byte) 10);
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionTestQuery("HikariPool-1291");
        hikariConfig0.setIdleTimeout((long) (short) -1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05540");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-38");
        int int9 = hikariConfig0.getAcquireIncrement();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
        hikariConfig0.maxLifetime = (byte) 10;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer13;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05541");
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
        hikariConfig0.setUseInstrumentation(false);
        int int17 = hikariConfig0.transactionIsolation;
        long long18 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05542");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        boolean boolean5 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-435");
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.maxPoolSize = (byte) 0;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05543");
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
        hikariConfig0.isJdbc4connectionTest = false;
        long long29 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05544");
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
        hikariConfig0.isJdbc4connectionTest = false;
        boolean boolean29 = hikariConfig0.isJdbc4ConnectionTest();
        int int30 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05545");
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
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        java.lang.String str19 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05546");
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
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        int int17 = hikariConfig0.acquireRetries;
        hikariConfig0.poolName = "HikariPool-307";
        javax.sql.DataSource dataSource20 = null;
        hikariConfig0.dataSource = dataSource20;
        hikariConfig0.transactionIsolation = 0;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05547");
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
        long long33 = hikariConfig0.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str35 = hikariConfig34.getConnectionInitSql();
        long long36 = hikariConfig34.getLeakDetectionThreshold();
        int int37 = hikariConfig34.getMaximumPoolSize();
        long long38 = hikariConfig34.getIdleTimeout();
        int int39 = hikariConfig34.maxPoolSize;
        java.lang.String str40 = hikariConfig34.getConnectionCustomizerClassName();
        boolean boolean41 = hikariConfig34.isJdbc4connectionTest;
        hikariConfig34.maxPoolSize = 3;
        java.util.Properties properties44 = hikariConfig34.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties44;
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
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 60 + "'", int37 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1L) + "'", long38 == (-1L));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05548");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        long long7 = hikariConfig0.maxLifetime;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str9 = hikariConfig8.getConnectionInitSql();
        long long10 = hikariConfig8.getLeakDetectionThreshold();
        hikariConfig8.leakDetectionThreshold = (-1);
        long long13 = hikariConfig8.acquireRetryDelay;
        long long14 = hikariConfig8.getIdleTimeout();
        hikariConfig8.isInitializationFailFast = true;
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
        hikariConfig8.dataSourceProperties = properties49;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig0.dataSourceProperties = properties49;
        java.util.Properties properties55 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertNotNull(properties55);
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05549");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-978");
        java.lang.String str16 = hikariConfig0.connectionCustomizerClassName;
        int int17 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05550");
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
        hikariConfig0.minPoolSize = (short) -1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05551");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.maxPoolSize = (byte) 1;
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str12 = hikariConfig0.connectionInitSql;
        long long13 = hikariConfig0.maxLifetime;
        boolean boolean14 = hikariConfig0.isRegisterMbeans;
        java.lang.String str15 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setReadOnly(true);
        java.util.Properties properties18 = hikariConfig0.dataSourceProperties;
        long long19 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-47" + "'", str15, "HikariPool-47");
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05552");
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
        boolean boolean46 = hikariConfig0.isReadOnly();
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
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05553");
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
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-3969");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05554");
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
        long long20 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05555");
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
        int int17 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05556");
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
        int int12 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        int int14 = hikariConfig0.transactionIsolation;
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05557");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        int int8 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionInitSql("HikariPool-7818");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05558");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        long long11 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setMaximumPoolSize((int) '#');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05559");
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
        hikariConfig0.isAutoCommit = false;
        boolean boolean18 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.jdbcUrl = "HikariPool-2359";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05560");
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
        java.lang.String str16 = hikariConfig0.transactionIsolationName;
        int int17 = hikariConfig0.getAcquireRetries();
        hikariConfig0.minPoolSize = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetryDelay((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05561");
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
        boolean boolean16 = hikariConfig0.isReadOnly();
        hikariConfig0.poolName = "HikariPool-889";
        hikariConfig0.setConnectionCustomizerClassName("");
        boolean boolean21 = hikariConfig0.isReadOnly;
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05562");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        int int7 = hikariConfig0.acquireIncrement;
        long long8 = hikariConfig0.getMaxLifetime();
        int int9 = hikariConfig0.getMinimumPoolSize();
        boolean boolean10 = hikariConfig0.isAutoCommit();
        int int11 = hikariConfig0.getTransactionIsolation();
        boolean boolean12 = hikariConfig0.isInitializationFailFast;
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05563");
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
        int int16 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05564");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean6 = hikariConfig0.isAutoCommit;
        java.lang.String str7 = hikariConfig0.connectionInitSql;
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.connectionTimeout = (byte) 10;
        java.lang.String str11 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05565");
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
        java.lang.String str33 = hikariConfig0.connectionInitSql;
        long long34 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.minPoolSize = (byte) 1;
        hikariConfig0.isIsolateInternalQueries = false;
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05566");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer14;
        int int16 = hikariConfig0.acquireIncrement;
        hikariConfig0.connectionTestQuery = "HikariPool-2013";
        int int19 = hikariConfig0.acquireRetries;
        boolean boolean20 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05567");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        hikariConfig0.setConnectionTestQuery("HikariPool-101");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05568");
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
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        long long11 = hikariConfig0.getMaxLifetime();
        java.lang.String str12 = hikariConfig0.jdbcUrl;
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
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05569");
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
        hikariConfig0.setCatalog("HikariPool-169");
        javax.sql.DataSource dataSource20 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05570");
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
        hikariConfig0.minPoolSize = (short) -1;
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05571");
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
        java.lang.String str30 = hikariConfig0.transactionIsolationName;
        hikariConfig0.connectionTestQuery = "HikariPool-9751";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05572");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.isInitializationFailFast = true;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-14205" + "'", str3, "HikariPool-14205");
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05573");
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
        hikariConfig0.setJdbcUrl("HikariPool-79");
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource23 = hikariConfig22.getDataSource();
        hikariConfig22.setConnectionTestQuery("");
        hikariConfig22.connectionCustomizerClassName = "";
        hikariConfig22.setConnectionCustomizerClassName("hi!");
        java.lang.String str30 = hikariConfig22.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = null;
        hikariConfig22.connectionCustomizer = iConnectionCustomizer31;
        hikariConfig22.jdbcUrl = "HikariPool-16";
        hikariConfig22.connectionInitSql = "HikariPool-38";
        int int37 = hikariConfig22.getAcquireRetries();
        hikariConfig22.leakDetectionThreshold = 35;
        hikariConfig22.connectionInitSql = "HikariPool-4051";
        hikariConfig0.addDataSourceProperty("HikariPool-3031", (java.lang.Object) hikariConfig22);
        long long43 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05574");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        long long7 = hikariConfig0.getMaxLifetime();
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.poolName;
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        long long11 = hikariConfig0.connectionTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-14210" + "'", str9, "HikariPool-14210");
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05575");
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
        hikariConfig0.isAutoCommit = false;
        javax.sql.DataSource dataSource30 = hikariConfig0.getDataSource();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-14211" + "'", str3, "HikariPool-14211");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNull(dataSource30);
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05576");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.connectionTestQuery = "HikariPool-327";
        hikariConfig0.setIdleTimeout((long) 60);
        int int13 = hikariConfig0.acquireIncrement;
        int int14 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05577");
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
        java.util.Properties properties17 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource20 = hikariConfig19.getDataSource();
        hikariConfig19.setConnectionTestQuery("");
        hikariConfig19.connectionCustomizerClassName = "";
        hikariConfig19.setConnectionCustomizerClassName("hi!");
        java.lang.String str27 = hikariConfig19.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = null;
        hikariConfig19.connectionCustomizer = iConnectionCustomizer28;
        hikariConfig19.connectionTimeout = 100L;
        hikariConfig19.transactionIsolationName = "";
        hikariConfig19.jdbcUrl = "";
        hikariConfig0.addDataSourceProperty("HikariPool-3120", (java.lang.Object) hikariConfig19);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource38 = hikariConfig37.getDataSource();
        hikariConfig37.setConnectionTestQuery("");
        hikariConfig37.setInitializationFailFast(false);
        long long43 = hikariConfig37.getConnectionTimeout();
        java.util.Properties properties44 = hikariConfig37.dataSourceProperties;
        boolean boolean45 = hikariConfig37.isInitializationFailFast();
        hikariConfig37.setLeakDetectionThreshold(0L);
        java.lang.String str48 = hikariConfig37.connectionCustomizerClassName;
        int int49 = hikariConfig37.getAcquireRetries();
        hikariConfig37.maxLifetime = 0L;
        hikariConfig37.setMaximumPoolSize((int) ' ');
        java.util.Properties properties54 = hikariConfig37.getDataSourceProperties();
        hikariConfig19.setDataSourceProperties(properties54);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-14215" + "'", str13, "HikariPool-14215");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(dataSource38);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertNotNull(properties54);
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05578");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.connectionTestQuery = "HikariPool-116";
        boolean boolean7 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05579");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.connectionTimeout;
        boolean boolean8 = hikariConfig0.isRegisterMbeans;
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.connectionTestQuery = "HikariPool-885";
        hikariConfig0.setMinimumPoolSize((int) '#');
        hikariConfig0.connectionTestQuery = "";
        int int16 = hikariConfig0.getMaximumPoolSize();
        boolean boolean17 = hikariConfig0.isInitializationFailFast;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05580");
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
        boolean boolean26 = hikariConfig8.isReadOnly;
        long long27 = hikariConfig8.leakDetectionThreshold;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05581");
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
        int int25 = hikariConfig0.acquireRetries;
        boolean boolean26 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05582");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("HikariPool-102");
        hikariConfig0.connectionTestQuery = "";
        hikariConfig0.isInitializationFailFast = true;
        int int17 = hikariConfig0.maxPoolSize;
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.dataSource = dataSource18;
        hikariConfig0.setIdleTimeout((long) (short) 100);
        java.lang.String str22 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-14233" + "'", str22, "HikariPool-14233");
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05583");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        hikariConfig0.isIsolateInternalQueries = true;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        long long14 = hikariConfig12.getLeakDetectionThreshold();
        hikariConfig12.leakDetectionThreshold = (-1);
        long long17 = hikariConfig12.acquireRetryDelay;
        long long18 = hikariConfig12.getIdleTimeout();
        hikariConfig12.acquireIncrement = '4';
        javax.sql.DataSource dataSource21 = hikariConfig12.getDataSource();
        hikariConfig12.acquireRetries = 35;
        java.util.Properties properties24 = hikariConfig12.dataSourceProperties;
        hikariConfig12.isJdbc4connectionTest = false;
        boolean boolean27 = hikariConfig12.isIsolateInternalQueries;
        boolean boolean28 = hikariConfig12.isReadOnly();
        hikariConfig12.setIdleTimeout(35L);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = hikariConfig12.connectionCustomizer;
        hikariConfig12.connectionTestQuery = "HikariPool-3966";
        hikariConfig0.addDataSourceProperty("HikariPool-220", (java.lang.Object) hikariConfig12);
        int int35 = hikariConfig12.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05584");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.maxPoolSize = (byte) 1;
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str12 = hikariConfig0.connectionInitSql;
        long long13 = hikariConfig0.maxLifetime;
        boolean boolean14 = hikariConfig0.isRegisterMbeans;
        boolean boolean15 = hikariConfig0.isAutoCommit;
        java.lang.String str16 = hikariConfig0.poolName;
        boolean boolean17 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-14240" + "'", str16, "HikariPool-14240");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05585");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean8 = hikariConfig0.isReadOnly();
        java.lang.String str9 = hikariConfig0.catalog;
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        boolean boolean11 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05586");
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
        boolean boolean22 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay((long) 60);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig0.setDataSource(dataSource25);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05587");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.leakDetectionThreshold = 0L;
        hikariConfig0.setPoolName("HikariPool-196");
        hikariConfig0.isJdbc4connectionTest = false;
        boolean boolean15 = hikariConfig0.isInitializationFailFast();
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05588");
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
        java.lang.Class<?> wildcardClass47 = hikariConfig0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05589");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        hikariConfig0.connectionTestQuery = "";
        boolean boolean12 = hikariConfig0.isReadOnly();
        hikariConfig0.setMinimumPoolSize((int) '#');
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-14270" + "'", str3, "HikariPool-14270");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05590");
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
        hikariConfig0.setRegisterMbeans(false);
        int int20 = hikariConfig0.getMinimumPoolSize();
        long long21 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05591");
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
        java.lang.String str22 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties23 = null;
        hikariConfig0.dataSourceProperties = properties23;
        hikariConfig0.maxPoolSize = (short) 100;
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-3852");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-3852' could not be loaded");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05592");
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
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05593");
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
        hikariConfig0.connectionTestQuery = "HikariPool-604";
        boolean boolean22 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05594");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        int int8 = hikariConfig0.maxPoolSize;
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        java.util.Properties properties10 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.acquireRetryDelay = 750L;
        int int14 = hikariConfig11.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05595");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.poolName = "";
        hikariConfig0.setJdbcUrl("");
        boolean boolean13 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.addDataSourceProperty("HikariPool-599", (java.lang.Object) "HikariPool-421");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05596");
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
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05597");
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
        java.lang.String str15 = hikariConfig0.connectionTestQuery;
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        boolean boolean17 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-3259" + "'", str16, "HikariPool-3259");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05598");
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
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.leakDetectionThreshold = 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05599");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        hikariConfig0.idleTimeout = 97;
        long long12 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05600");
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
        hikariConfig0.transactionIsolationName = "HikariPool-6662";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05601");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1950");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05602");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-90");
        hikariConfig0.acquireRetryDelay = 750L;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource31 = hikariConfig30.getDataSource();
        hikariConfig30.setConnectionTestQuery("");
        hikariConfig30.setInitializationFailFast(false);
        hikariConfig30.catalog = "";
        int int38 = hikariConfig30.getMaximumPoolSize();
        hikariConfig30.connectionTimeout = 10L;
        hikariConfig30.isReadOnly = false;
        hikariConfig30.connectionInitSql = "";
        java.util.Properties properties45 = hikariConfig30.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties45);
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
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60 + "'", int38 == 60);
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05603");
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
        java.lang.String str17 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.transactionIsolationName = "HikariPool-1213";
        java.lang.String str20 = hikariConfig0.connectionInitSql;
        hikariConfig0.setIdleTimeout((long) (short) 0);
        hikariConfig0.setInitializationFailFast(true);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-14316" + "'", str3, "HikariPool-14316");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05604");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.isRegisterMbeans = true;
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionInitSql = "HikariPool-1607";
        hikariConfig0.setMaxLifetime((long) ' ');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05605");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        int int8 = hikariConfig0.maxPoolSize;
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        java.lang.String str10 = hikariConfig0.jdbcUrl;
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05606");
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
        int int16 = hikariConfig0.transactionIsolation;
        java.lang.String str17 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05607");
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
        hikariConfig0.setReadOnly(true);
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        int int20 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05608");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.poolName = "HikariPool-73";
        long long11 = hikariConfig0.connectionTimeout;
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setCatalog("HikariPool-75");
        hikariConfig0.connectionInitSql = "HikariPool-1234";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05609");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.acquireRetries = ' ';
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05610");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.isReadOnly = false;
        long long8 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05611");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        long long3 = hikariConfig0.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource5 = hikariConfig4.getDataSource();
        hikariConfig4.setConnectionTestQuery("");
        hikariConfig4.connectionCustomizerClassName = "";
        hikariConfig4.setConnectionCustomizerClassName("hi!");
        java.lang.String str12 = hikariConfig4.getCatalog();
        boolean boolean13 = hikariConfig4.isRegisterMbeans;
        hikariConfig4.setAcquireRetries(0);
        hikariConfig4.setMaximumPoolSize((int) '#');
        hikariConfig4.setTransactionIsolation("hi!");
        boolean boolean20 = hikariConfig4.isInitializationFailFast();
        java.lang.String str21 = hikariConfig4.connectionInitSql;
        hikariConfig4.maxPoolSize = 0;
        java.util.Properties properties24 = hikariConfig4.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig0.setDataSourceProperties(properties24);
        java.lang.String str27 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setPoolName("HikariPool-210");
        boolean boolean30 = hikariConfig0.isJdbc4ConnectionTest();
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-47" + "'", str27, "HikariPool-47");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05612");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        java.lang.String str3 = hikariConfig0.getPoolName();
        int int4 = hikariConfig0.maxPoolSize;
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.poolName = "HikariPool-2966";
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig10.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig10.connectionCustomizer;
        hikariConfig10.setDataSourceClassName("HikariPool-47");
        hikariConfig10.setDataSourceClassName("HikariPool-18");
        boolean boolean18 = hikariConfig10.isRegisterMbeans();
        java.lang.String str19 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.setIdleTimeout((long) (-1));
        hikariConfig10.setUseInstrumentation(false);
        hikariConfig10.connectionTestQuery = "HikariPool-201";
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource27 = hikariConfig26.getDataSource();
        hikariConfig26.setConnectionTestQuery("");
        hikariConfig26.connectionCustomizerClassName = "";
        hikariConfig26.setConnectionCustomizerClassName("hi!");
        java.lang.String str34 = hikariConfig26.getCatalog();
        int int35 = hikariConfig26.acquireRetries;
        hikariConfig26.setRegisterMbeans(true);
        java.lang.String str38 = hikariConfig26.getDataSourceClassName();
        java.util.Properties properties39 = hikariConfig26.dataSourceProperties;
        hikariConfig10.setDataSourceProperties(properties39);
        hikariConfig0.setDataSourceProperties(properties39);
        hikariConfig0.setAutoCommit(true);
        java.lang.String str44 = hikariConfig0.getJdbcUrl();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-14340" + "'", str3, "HikariPool-14340");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-18" + "'", str19, "HikariPool-18");
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05613");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        int int9 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05614");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.lang.String str8 = hikariConfig0.connectionInitSql;
        long long9 = hikariConfig0.leakDetectionThreshold;
        boolean boolean10 = hikariConfig0.isReadOnly;
        hikariConfig0.dataSourceClassName = "HikariPool-242";
        java.util.Properties properties13 = hikariConfig0.dataSourceProperties;
        java.lang.Class<?> wildcardClass14 = properties13.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05615");
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
        hikariConfig0.setMinimumPoolSize((int) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05616");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        int int8 = hikariConfig0.maxPoolSize;
        hikariConfig0.maxPoolSize = 97;
        java.util.Properties properties11 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        java.lang.String str13 = hikariConfig12.poolName;
        hikariConfig12.maxPoolSize = 60;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNotNull(properties11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-14376" + "'", str13, "HikariPool-14376");
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05617");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        boolean boolean2 = hikariConfig0.isAutoCommit;
        int int3 = hikariConfig0.getAcquireRetries();
        int int4 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05618");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMinimumPoolSize(0);
        hikariConfig0.setAcquireRetries((int) (byte) 10);
        java.lang.String str13 = hikariConfig0.getPoolName();
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        long long15 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-14402" + "'", str13, "HikariPool-14402");
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05619");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        hikariConfig0.acquireIncrement = (short) 100;
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.idleTimeout = (short) -1;
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-2399");
        java.lang.String str14 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-14403" + "'", str14, "HikariPool-14403");
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05620");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource9 = hikariConfig8.getDataSource();
        hikariConfig8.setConnectionTestQuery("");
        long long12 = hikariConfig8.maxLifetime;
        hikariConfig8.setAcquireRetryDelay((long) 0);
        int int15 = hikariConfig8.getAcquireRetries();
        hikariConfig8.leakDetectionThreshold = (short) 1;
        hikariConfig8.setAutoCommit(true);
        hikariConfig0.addDataSourceProperty("HikariPool-409", (java.lang.Object) true);
        java.lang.String str21 = hikariConfig0.getConnectionCustomizerClassName();
        long long22 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setLeakDetectionThreshold(2147483647L);
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05621");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig0.isAutoCommit();
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setDataSourceClassName("HikariPool-890");
        hikariConfig0.idleTimeout = 0L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05622");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-16");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        int int11 = hikariConfig0.getMinimumPoolSize();
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str13 = hikariConfig0.dataSourceClassName;
        int int14 = hikariConfig0.minPoolSize;
        hikariConfig0.isRegisterMbeans = true;
        int int17 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05623");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireRetries = 10;
        hikariConfig0.setConnectionTestQuery("HikariPool-1918");
        hikariConfig0.minPoolSize = 10;
        java.lang.String str8 = hikariConfig0.poolName;
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-14425" + "'", str8, "HikariPool-14425");
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05624");
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
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setConnectionTestQuery("HikariPool-637");
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str19 = hikariConfig18.getConnectionInitSql();
        long long20 = hikariConfig18.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig18.connectionCustomizer = iConnectionCustomizer21;
        boolean boolean23 = hikariConfig18.isIsolateInternalQueries();
        hikariConfig18.poolName = "HikariPool-47";
        java.lang.String str26 = hikariConfig18.transactionIsolationName;
        hikariConfig18.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties29 = hikariConfig18.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties29;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05625");
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
        hikariConfig0.connectionTestQuery = "HikariPool-1787";
        long long21 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05626");
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
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-3031";
        hikariConfig0.maxLifetime = 5000L;
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05627");
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
        long long21 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05628");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3045");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3045 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05629");
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
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.connectionTimeout = (short) 100;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05630");
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
        hikariConfig0.transactionIsolation = 10;
        hikariConfig0.acquireRetries = 0;
        long long26 = hikariConfig0.getMaxLifetime();
        java.lang.String str27 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05631");
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
        hikariConfig0.setUseInstrumentation(false);
        long long31 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05632");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        hikariConfig0.acquireIncrement = (short) 100;
        java.lang.String str8 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.idleTimeout = (short) -1;
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setTransactionIsolation("HikariPool-942");
        boolean boolean14 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        java.lang.String str17 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str22 = hikariConfig21.getConnectionInitSql();
        long long23 = hikariConfig21.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = null;
        hikariConfig21.connectionCustomizer = iConnectionCustomizer24;
        boolean boolean26 = hikariConfig21.isIsolateInternalQueries();
        hikariConfig21.poolName = "HikariPool-47";
        java.lang.String str29 = hikariConfig21.transactionIsolationName;
        hikariConfig21.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties32 = hikariConfig21.getDataSourceProperties();
        hikariConfig21.setReadOnly(false);
        java.lang.String str35 = hikariConfig21.poolName;
        hikariConfig21.setMinimumPoolSize((int) ' ');
        hikariConfig0.addDataSourceProperty("HikariPool-1971", (java.lang.Object) ' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-47" + "'", str35, "HikariPool-47");
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05633");
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
        int int14 = hikariConfig0.transactionIsolation;
        int int15 = hikariConfig0.acquireRetries;
        java.lang.String str16 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05634");
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
        hikariConfig0.setAcquireIncrement(10);
        boolean boolean20 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-10972";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05635");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.poolName = "HikariPool-183";
        java.lang.String str8 = hikariConfig0.getPoolName();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setTransactionIsolation("HikariPool-332");
        hikariConfig0.acquireRetries = (byte) 0;
        java.lang.String str15 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-183" + "'", str8, "HikariPool-183");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05636");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05637");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionTimeout(5000L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05638");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig0.dataSource;
        int int11 = hikariConfig0.maxPoolSize;
        java.lang.String str12 = hikariConfig0.getPoolName();
        hikariConfig0.dataSourceClassName = "HikariPool-5082";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-14483" + "'", str12, "HikariPool-14483");
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05639");
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
        java.lang.String str16 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05640");
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
        long long21 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-13592";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05641");
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
        hikariConfig0.setAcquireRetries((int) 'a');
        hikariConfig0.setMaxLifetime((-1L));
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05642");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05643");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setMaximumPoolSize((int) (short) 10);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.dataSource = dataSource11;
        java.lang.String str13 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05644");
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
        int int17 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05645");
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
        java.lang.String str16 = hikariConfig0.transactionIsolationName;
        hikariConfig0.connectionInitSql = "HikariPool-7";
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource21 = hikariConfig20.getDataSource();
        hikariConfig20.idleTimeout = 3;
        hikariConfig20.setLeakDetectionThreshold(52L);
        int int26 = hikariConfig20.minPoolSize;
        hikariConfig20.setIdleTimeout((long) 10);
        hikariConfig20.setConnectionTimeout((long) (short) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str32 = hikariConfig31.getConnectionInitSql();
        long long33 = hikariConfig31.getLeakDetectionThreshold();
        hikariConfig31.leakDetectionThreshold = (byte) 0;
        hikariConfig31.acquireRetryDelay = 3L;
        hikariConfig31.poolName = "HikariPool-66";
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource41 = hikariConfig40.getDataSource();
        hikariConfig40.setConnectionTestQuery("");
        hikariConfig40.connectionCustomizerClassName = "";
        hikariConfig40.setConnectionCustomizerClassName("hi!");
        java.lang.String str48 = hikariConfig40.getCatalog();
        boolean boolean49 = hikariConfig40.isRegisterMbeans;
        hikariConfig40.setAcquireRetries(0);
        hikariConfig40.setMaximumPoolSize((int) '#');
        hikariConfig40.setTransactionIsolation("hi!");
        boolean boolean56 = hikariConfig40.isInitializationFailFast();
        java.lang.String str57 = hikariConfig40.connectionInitSql;
        hikariConfig40.maxPoolSize = 0;
        java.util.Properties properties60 = hikariConfig40.getDataSourceProperties();
        hikariConfig31.setDataSourceProperties(properties60);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig20.dataSourceProperties = properties60;
        hikariConfig0.addDataSourceProperty("HikariPool-327", (java.lang.Object) hikariConfig20);
        long long65 = hikariConfig20.maxLifetime;
        long long66 = hikariConfig20.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(properties60);
// flaky:         org.junit.Assert.assertTrue("'" + long65 + "' != '" + 32L + "'", long65 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long66 + "' != '" + 32L + "'", long66 == 32L);
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05646");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setIsolateInternalQueries(true);
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.transactionIsolation = 0;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05647");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        int int9 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setMaxLifetime((long) (short) 1);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05648");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        boolean boolean8 = hikariConfig0.isReadOnly();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        long long10 = hikariConfig0.idleTimeout;
        hikariConfig0.setDataSourceClassName("HikariPool-743");
        hikariConfig0.maxLifetime = 0L;
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05649");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMaximumPoolSize((int) '#');
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionInitSql("HikariPool-3485");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05650");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.setIdleTimeout((long) 10);
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        long long11 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.idleTimeout = ' ';
        int int14 = hikariConfig0.minPoolSize;
        long long15 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setCatalog("HikariPool-743");
        hikariConfig0.transactionIsolation = (byte) -1;
        long long20 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05651");
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
        java.lang.String str47 = hikariConfig23.getConnectionTestQuery();
        int int48 = hikariConfig23.transactionIsolation;
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05652");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.transactionIsolation = 0;
        long long4 = hikariConfig0.maxLifetime;
        boolean boolean5 = hikariConfig0.isAutoCommit();
        hikariConfig0.setReadOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05653");
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
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource18 = hikariConfig17.getDataSource();
        hikariConfig17.setConnectionTestQuery("");
        hikariConfig17.connectionCustomizerClassName = "";
        hikariConfig17.setConnectionCustomizerClassName("hi!");
        java.lang.String str25 = hikariConfig17.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = null;
        hikariConfig17.connectionCustomizer = iConnectionCustomizer26;
        hikariConfig17.setJdbcUrl("HikariPool-38");
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig30.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource34 = hikariConfig33.getDataSource();
        hikariConfig33.setConnectionTestQuery("");
        hikariConfig33.setInitializationFailFast(false);
        long long39 = hikariConfig33.getConnectionTimeout();
        java.util.Properties properties40 = hikariConfig33.dataSourceProperties;
        hikariConfig30.dataSourceProperties = properties40;
        hikariConfig17.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig0.dataSourceProperties = properties40;
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
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(dataSource34);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05654");
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
        hikariConfig0.connectionTimeout = (short) 1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-14552" + "'", str11, "HikariPool-14552");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05655");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig0.dataSource;
        long long11 = hikariConfig0.leakDetectionThreshold;
        long long12 = hikariConfig0.maxLifetime;
        boolean boolean13 = hikariConfig0.isReadOnly();
        boolean boolean14 = hikariConfig0.isReadOnly;
        long long15 = hikariConfig0.connectionTimeout;
        long long16 = hikariConfig0.idleTimeout;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-254");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05656");
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
        hikariConfig0.setReadOnly(true);
        long long22 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05657");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setJdbcUrl("HikariPool-173");
        hikariConfig0.acquireRetries = (short) 10;
        hikariConfig0.setReadOnly(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05658");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-5302");
        long long11 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.acquireIncrement = (short) 1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05659");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-836");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-836 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05660");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.poolName = "HikariPool-1748";
        long long15 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05661");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        boolean boolean11 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setAutoCommit(false);
        java.lang.String str14 = hikariConfig0.jdbcUrl;
        hikariConfig0.jdbcUrl = "HikariPool-3646";
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.dataSource = dataSource17;
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05662");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        java.lang.String str11 = hikariConfig0.getPoolName();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAcquireRetryDelay(97L);
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.transactionIsolation = '#';
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-14576" + "'", str11, "HikariPool-14576");
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05663");
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
        hikariConfig0.setAcquireRetries(35);
        hikariConfig0.setAcquireRetryDelay((long) (short) 1);
        hikariConfig0.setAcquireRetries(97);
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05664");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        boolean boolean12 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str13 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer14;
        hikariConfig0.setMaxLifetime(100L);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05665");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        long long9 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean10 = hikariConfig0.isJdbc4connectionTest;
        int int11 = hikariConfig0.acquireIncrement;
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05666");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.maxPoolSize = 35;
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        int int8 = hikariConfig0.getAcquireRetries();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05667");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05668");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-295");
        boolean boolean11 = hikariConfig0.isAutoCommit;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.setInitializationFailFast(false);
        long long18 = hikariConfig12.getConnectionTimeout();
        hikariConfig12.setJdbcUrl("HikariPool-47");
        hikariConfig12.setCatalog("HikariPool-135");
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.connectionCustomizerClassName = "";
        hikariConfig23.setConnectionCustomizerClassName("hi!");
        java.lang.String str31 = hikariConfig23.getCatalog();
        boolean boolean32 = hikariConfig23.isRegisterMbeans;
        hikariConfig23.setAcquireRetries(0);
        hikariConfig23.setMaximumPoolSize((int) '#');
        hikariConfig23.setTransactionIsolation("hi!");
        boolean boolean39 = hikariConfig23.isInitializationFailFast();
        java.lang.String str40 = hikariConfig23.connectionInitSql;
        hikariConfig23.maxPoolSize = 0;
        java.util.Properties properties43 = hikariConfig23.getDataSourceProperties();
        hikariConfig12.dataSourceProperties = properties43;
        hikariConfig0.dataSourceProperties = properties43;
        java.lang.String str46 = hikariConfig0.getPoolName();
        long long47 = hikariConfig0.getConnectionTimeout();
        long long48 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str49 = hikariConfig0.connectionInitSql;
        long long50 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource13);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(properties43);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "HikariPool-14594" + "'", str46, "HikariPool-14594");
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05669");
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
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05670");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setDataSourceClassName("HikariPool-1711");
        hikariConfig0.isReadOnly = false;
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        java.lang.Class<?> wildcardClass12 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05671");
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
        boolean boolean24 = hikariConfig0.isRegisterMbeans();
        int int25 = hikariConfig0.getMaximumPoolSize();
        int int26 = hikariConfig0.getMinimumPoolSize();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05672");
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
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05673");
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
        hikariConfig0.maxLifetime = 35;
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setAcquireRetryDelay((long) ' ');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05674");
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
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        javax.sql.DataSource dataSource16 = hikariConfig0.getDataSource();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str19 = hikariConfig18.getConnectionInitSql();
        long long20 = hikariConfig18.getLeakDetectionThreshold();
        hikariConfig18.leakDetectionThreshold = (-1);
        long long23 = hikariConfig18.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource26 = hikariConfig25.getDataSource();
        hikariConfig25.setConnectionTestQuery("");
        hikariConfig25.connectionCustomizerClassName = "";
        hikariConfig25.setConnectionCustomizerClassName("hi!");
        java.lang.String str33 = hikariConfig25.getCatalog();
        boolean boolean34 = hikariConfig25.isRegisterMbeans;
        long long35 = hikariConfig25.connectionTimeout;
        hikariConfig25.setConnectionInitSql("HikariPool-48");
        hikariConfig18.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig25);
        hikariConfig18.setUseInstrumentation(false);
        java.lang.String str41 = hikariConfig18.getJdbcUrl();
        java.util.Properties properties42 = hikariConfig18.getDataSourceProperties();
        hikariConfig18.acquireRetryDelay = (-1L);
        hikariConfig0.addDataSourceProperty("HikariPool-975", (java.lang.Object) (-1L));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05675");
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
        hikariConfig15.isInitializationFailFast = true;
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
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05676");
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
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str20 = hikariConfig19.getConnectionInitSql();
        long long21 = hikariConfig19.getLeakDetectionThreshold();
        int int22 = hikariConfig19.getMaximumPoolSize();
        long long23 = hikariConfig19.getIdleTimeout();
        int int24 = hikariConfig19.maxPoolSize;
        java.lang.String str25 = hikariConfig19.getConnectionCustomizerClassName();
        hikariConfig19.setConnectionCustomizerClassName("HikariPool-127");
        hikariConfig19.isIsolateInternalQueries = true;
        hikariConfig0.addDataSourceProperty("HikariPool-1769", (java.lang.Object) hikariConfig19);
        int int31 = hikariConfig19.getMinimumPoolSize();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05677");
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
        hikariConfig0.setAcquireRetryDelay((long) 100);
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
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05678");
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
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.setIdleTimeout((long) '#');
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05679");
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
        boolean boolean29 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.minPoolSize = (short) 1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-14634" + "'", str15, "HikariPool-14634");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05680");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        hikariConfig0.transactionIsolation = 1;
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.isAutoCommit = false;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-10156");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-10156' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer3);
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05681");
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
        hikariConfig0.setIdleTimeout(5000L);
        hikariConfig0.connectionTestQuery = "HikariPool-426";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer23;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05682");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str11 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05683");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.catalog = "HikariPool-978";
        hikariConfig0.isIsolateInternalQueries = false;
        long long13 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05684");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-16");
        boolean boolean7 = hikariConfig0.isReadOnly();
        int int8 = hikariConfig0.minPoolSize;
        int int9 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.minPoolSize = ' ';
        long long12 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05685");
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
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig23.setMaxLifetime((long) (short) 10);
        java.lang.String str26 = hikariConfig23.getPoolName();
        hikariConfig23.jdbcUrl = "";
        hikariConfig23.setMaxLifetime(0L);
        hikariConfig23.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig33.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource37 = hikariConfig36.getDataSource();
        hikariConfig36.setConnectionTestQuery("");
        hikariConfig36.setInitializationFailFast(false);
        long long42 = hikariConfig36.getConnectionTimeout();
        java.util.Properties properties43 = hikariConfig36.dataSourceProperties;
        hikariConfig33.dataSourceProperties = properties43;
        hikariConfig23.setDataSourceProperties(properties43);
        java.lang.String str46 = hikariConfig23.getJdbcUrl();
        javax.sql.DataSource dataSource47 = hikariConfig23.dataSource;
        java.util.Properties properties48 = hikariConfig23.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties48;
        long long50 = hikariConfig0.idleTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer51 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer51;
        int int53 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-14650" + "'", str26, "HikariPool-14650");
        org.junit.Assert.assertNull(dataSource37);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(dataSource47);
        org.junit.Assert.assertNotNull(properties48);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05686");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        int int8 = hikariConfig0.maxPoolSize;
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.acquireRetries = 3;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05687");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.maxLifetime;
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        hikariConfig0.catalog = "HikariPool-1159";
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05688");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMaximumPoolSize((int) '#');
        java.lang.String str10 = hikariConfig0.getPoolName();
        int int11 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-14667" + "'", str10, "HikariPool-14667");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05689");
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
        long long19 = hikariConfig0.getMaxLifetime();
        java.lang.String str20 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource21 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 750L + "'", long19 == 750L);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05690");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setDataSourceClassName("HikariPool-1711");
        hikariConfig0.isReadOnly = false;
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.connectionTimeout = (byte) 10;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05691");
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
        boolean boolean28 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05692");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionTimeout(5000L);
        long long3 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setAutoCommit(true);
        java.lang.String str6 = hikariConfig0.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05693");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries;
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.acquireRetries = 52;
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05694");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        hikariConfig0.maxPoolSize = (short) 100;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setJdbcUrl("HikariPool-1006");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05695");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        long long5 = hikariConfig0.getMaxLifetime();
        int int6 = hikariConfig0.transactionIsolation;
        hikariConfig0.setPoolName("HikariPool-25");
        hikariConfig0.setPoolName("HikariPool-645");
        javax.sql.DataSource dataSource11 = hikariConfig0.dataSource;
        java.util.Properties properties12 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05696");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.transactionIsolationName = "";
        java.lang.String str9 = hikariConfig0.getCatalog();
        boolean boolean10 = hikariConfig0.isInitializationFailFast;
        int int11 = hikariConfig0.getAcquireRetries();
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        int int14 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05697");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setMaxLifetime((long) '4');
        int int6 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.acquireIncrement = '4';
        hikariConfig0.setCatalog("HikariPool-538");
        long long11 = hikariConfig0.getAcquireRetryDelay();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.addDataSourceProperty("", obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05698");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.util.Properties properties5 = hikariConfig0.dataSourceProperties;
        long long6 = hikariConfig0.connectionTimeout;
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str9 = hikariConfig0.getPoolName();
        hikariConfig0.transactionIsolationName = "HikariPool-2686";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer12;
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-14711" + "'", str9, "HikariPool-14711");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05699");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        hikariConfig0.setAcquireRetries(100);
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        int int14 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05700");
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
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setReadOnly(false);
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-14714" + "'", str7, "HikariPool-14714");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05701");
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
        hikariConfig0.isReadOnly = true;
        hikariConfig0.acquireRetries = (byte) 1;
        hikariConfig0.maxPoolSize = (byte) -1;
        java.lang.Class<?> wildcardClass30 = hikariConfig0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05702");
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
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) 1);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05703");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.acquireRetries = 52;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.isAutoCommit = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05704");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        java.lang.String str8 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.jdbcUrl = "HikariPool-533";
        hikariConfig0.setDataSourceClassName("HikariPool-8795");
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05705");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        javax.sql.DataSource dataSource5 = null;
        hikariConfig0.dataSource = dataSource5;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05706");
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
        java.lang.String str53 = hikariConfig0.connectionTestQuery;
        boolean boolean54 = hikariConfig0.isRegisterMbeans;
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05707");
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
        hikariConfig0.setConnectionInitSql("HikariPool-1213");
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource25 = hikariConfig24.getDataSource();
        hikariConfig24.setConnectionTestQuery("");
        hikariConfig24.connectionCustomizerClassName = "";
        hikariConfig24.setConnectionCustomizerClassName("hi!");
        java.lang.String str32 = hikariConfig24.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer33 = null;
        hikariConfig24.connectionCustomizer = iConnectionCustomizer33;
        java.lang.String str35 = hikariConfig24.getPoolName();
        int int36 = hikariConfig24.getAcquireIncrement();
        java.util.Properties properties37 = hikariConfig24.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties37);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertNull(str32);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-14729" + "'", str35, "HikariPool-14729");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(properties37);
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05708");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        int int7 = hikariConfig0.maxPoolSize;
        int int8 = hikariConfig0.getTransactionIsolation();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.isRegisterMbeans = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05709");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.maxLifetime;
        hikariConfig0.transactionIsolation = (short) 0;
        hikariConfig0.setCatalog("HikariPool-5383");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05710");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-591");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-591 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05711");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer20;
        hikariConfig0.transactionIsolation = '#';
        long long24 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05712");
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
        hikariConfig0.idleTimeout = (short) 10;
        hikariConfig0.idleTimeout = (short) 100;
        java.lang.String str24 = hikariConfig0.catalog;
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.setTransactionIsolation("HikariPool-3998");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05713");
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
        int int15 = hikariConfig0.getAcquireRetries();
        hikariConfig0.catalog = "HikariPool-472";
        int int18 = hikariConfig0.transactionIsolation;
        boolean boolean19 = hikariConfig0.isReadOnly();
        boolean boolean20 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05714");
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
        hikariConfig0.connectionTestQuery = "HikariPool-566";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer30 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(iConnectionCustomizer30);
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05715");
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
        java.lang.String str15 = hikariConfig0.connectionInitSql;
        java.lang.String str16 = hikariConfig0.getPoolName();
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        hikariConfig0.acquireIncrement = (byte) 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-14750" + "'", str16, "HikariPool-14750");
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05716");
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
        long long14 = hikariConfig11.acquireRetryDelay;
        java.lang.String str15 = hikariConfig11.connectionCustomizerClassName;
        hikariConfig11.setConnectionCustomizerClassName("HikariPool-2506");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05717");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.isIsolateInternalQueries = false;
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        boolean boolean12 = hikariConfig0.isInitializationFailFast;
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        java.lang.String str14 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-47" + "'", str13, "HikariPool-47");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05718");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.isAutoCommit = true;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-235");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-235' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05719");
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
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-208" + "'", str12, "HikariPool-208");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05720");
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
        java.lang.String str16 = hikariConfig0.connectionTestQuery;
        hikariConfig0.acquireRetries = (byte) 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05721");
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
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05722");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setPoolName("HikariPool-543");
        java.lang.String str10 = hikariConfig0.connectionInitSql;
        hikariConfig0.maxLifetime = (byte) -1;
        hikariConfig0.leakDetectionThreshold = 35;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05723");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-183");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.maxPoolSize = (byte) 1;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-14770" + "'", str3, "HikariPool-14770");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05724");
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
        hikariConfig0.acquireRetries = 3;
        javax.sql.DataSource dataSource13 = hikariConfig0.dataSource;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05725");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setDataSourceClassName("HikariPool-121");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05726");
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
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str21 = hikariConfig20.getConnectionInitSql();
        long long22 = hikariConfig20.getLeakDetectionThreshold();
        hikariConfig20.leakDetectionThreshold = (-1);
        int int25 = hikariConfig20.acquireIncrement;
        hikariConfig20.setInitializationFailFast(true);
        boolean boolean28 = hikariConfig20.isAutoCommit();
        hikariConfig20.setTransactionIsolation("");
        long long31 = hikariConfig20.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource33 = hikariConfig32.getDataSource();
        hikariConfig32.setConnectionTestQuery("");
        hikariConfig32.connectionCustomizerClassName = "";
        hikariConfig32.setConnectionCustomizerClassName("hi!");
        java.lang.String str40 = hikariConfig32.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer41 = null;
        hikariConfig32.connectionCustomizer = iConnectionCustomizer41;
        hikariConfig32.setJdbcUrl("HikariPool-38");
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig45.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource49 = hikariConfig48.getDataSource();
        hikariConfig48.setConnectionTestQuery("");
        hikariConfig48.setInitializationFailFast(false);
        long long54 = hikariConfig48.getConnectionTimeout();
        java.util.Properties properties55 = hikariConfig48.dataSourceProperties;
        hikariConfig45.dataSourceProperties = properties55;
        hikariConfig32.setDataSourceProperties(properties55);
        hikariConfig20.dataSourceProperties = properties55;
        long long59 = hikariConfig20.getMaxLifetime();
        hikariConfig20.acquireRetryDelay = 0;
        hikariConfig20.isJdbc4connectionTest = false;
        hikariConfig20.leakDetectionThreshold = 60;
        boolean boolean66 = hikariConfig20.isInitializationFailFast;
        hikariConfig0.addDataSourceProperty("HikariPool-25", (java.lang.Object) hikariConfig20);
        hikariConfig0.setDataSourceClassName("HikariPool-1934");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str72 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(dataSource49);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 32L + "'", long54 == 32L);
        org.junit.Assert.assertNotNull(properties55);
// flaky:         org.junit.Assert.assertTrue("'" + long59 + "' != '" + 32L + "'", long59 == 32L);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05727");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.setConnectionTimeout((long) (byte) 0);
        hikariConfig0.setMinimumPoolSize(10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05728");
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
        java.lang.String str47 = hikariConfig46.poolName;
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
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "HikariPool-14806" + "'", str47, "HikariPool-14806");
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05729");
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
        hikariConfig0.acquireIncrement = '4';
        boolean boolean22 = hikariConfig0.isReadOnly();
        int int23 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.maxPoolSize = (short) 0;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05730");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer32 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer32;
        java.lang.String str34 = hikariConfig0.connectionInitSql;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str36 = hikariConfig35.getConnectionInitSql();
        long long37 = hikariConfig35.getLeakDetectionThreshold();
        hikariConfig35.leakDetectionThreshold = (-1);
        long long40 = hikariConfig35.acquireRetryDelay;
        long long41 = hikariConfig35.getIdleTimeout();
        hikariConfig35.acquireIncrement = '4';
        javax.sql.DataSource dataSource44 = hikariConfig35.getDataSource();
        hikariConfig35.acquireRetries = 35;
        java.util.Properties properties47 = hikariConfig35.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig0.dataSourceProperties = properties47;
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
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
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 100L + "'", long40 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNull(dataSource44);
        org.junit.Assert.assertNotNull(properties47);
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05731");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        java.lang.String str3 = hikariConfig0.getPoolName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.maxPoolSize;
        long long6 = hikariConfig0.maxLifetime;
        int int7 = hikariConfig0.minPoolSize;
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.isIsolateInternalQueries = false;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-14820" + "'", str3, "HikariPool-14820");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05732");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMaximumPoolSize((int) '#');
        java.lang.String str10 = hikariConfig0.getCatalog();
        int int11 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05733");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.acquireRetryDelay = 100;
        hikariConfig0.leakDetectionThreshold = 97L;
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05734");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.leakDetectionThreshold = 60;
        java.lang.String str9 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05735");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        boolean boolean4 = hikariConfig0.isJdbc4connectionTest;
        long long5 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str6 = hikariConfig0.poolName;
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setPoolName("HikariPool-1350");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-14828" + "'", str6, "HikariPool-14828");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05736");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.transactionIsolationName = "hi!";
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05737");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        boolean boolean2 = hikariConfig0.isAutoCommit;
        int int3 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource4 = hikariConfig0.dataSource;
        hikariConfig0.maxLifetime = 100L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05738");
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
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str32 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(dataSource18);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05739");
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
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        int int19 = hikariConfig0.getMaximumPoolSize();
        int int20 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05740");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str11 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05741");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str11 = hikariConfig0.getCatalog();
        java.lang.String str12 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-14839" + "'", str12, "HikariPool-14839");
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05742");
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
        hikariConfig0.isJdbc4connectionTest = true;
        long long30 = hikariConfig0.getMaxLifetime();
        int int31 = hikariConfig0.maxPoolSize;
        javax.sql.DataSource dataSource32 = null;
        hikariConfig0.dataSource = dataSource32;
        hikariConfig0.transactionIsolation = 97;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05743");
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
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(100L);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-2141";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05744");
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
        hikariConfig0.setDataSourceClassName("HikariPool-590");
        hikariConfig0.setIdleTimeout((long) (short) -1);
        hikariConfig0.setMaxLifetime((long) 100);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-14851" + "'", str15, "HikariPool-14851");
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05745");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.maxLifetime;
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setConnectionTestQuery("HikariPool-5165");
        java.lang.String str11 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-14852" + "'", str11, "HikariPool-14852");
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05746");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.poolName = "HikariPool-428";
        boolean boolean11 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.transactionIsolation = 10;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig0.connectionCustomizer;
        hikariConfig0.isReadOnly = false;
        hikariConfig0.maxPoolSize = 52;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05747");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-451");
        boolean boolean23 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05748");
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
        hikariConfig23.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-14860" + "'", str3, "HikariPool-14860");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(properties25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-14863" + "'", str26, "HikariPool-14863");
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05749");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold(10L);
        java.lang.String str6 = hikariConfig0.connectionTestQuery;
        hikariConfig0.setConnectionInitSql("HikariPool-833");
        java.lang.String str9 = hikariConfig0.poolName;
        int int10 = hikariConfig0.minPoolSize;
        boolean boolean11 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-14864" + "'", str9, "HikariPool-14864");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05750");
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
        java.lang.String str22 = hikariConfig8.getPoolName();
        int int23 = hikariConfig8.getMaximumPoolSize();
        hikariConfig8.setLeakDetectionThreshold((long) 10);
        boolean boolean26 = hikariConfig8.isIsolateInternalQueries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-14866" + "'", str22, "HikariPool-14866");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05751");
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
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.isReadOnly = true;
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
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05752");
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
        java.lang.String str22 = hikariConfig8.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05753");
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
        long long39 = hikariConfig21.maxLifetime;
        hikariConfig0.addDataSourceProperty("HikariPool-1108", (java.lang.Object) long39);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource42 = hikariConfig41.getDataSource();
        hikariConfig41.setConnectionTestQuery("");
        hikariConfig41.setInitializationFailFast(false);
        hikariConfig41.poolName = "";
        int int49 = hikariConfig41.getTransactionIsolation();
        java.lang.String str50 = hikariConfig41.getConnectionInitSql();
        long long51 = hikariConfig41.getConnectionTimeout();
        hikariConfig41.isAutoCommit = true;
        java.lang.String str54 = hikariConfig41.connectionTestQuery;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str56 = hikariConfig55.getJdbcUrl();
        hikariConfig55.setRegisterMbeans(false);
        int int59 = hikariConfig55.transactionIsolation;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource61 = hikariConfig60.getDataSource();
        hikariConfig60.setConnectionTestQuery("");
        int int64 = hikariConfig60.getTransactionIsolation();
        boolean boolean65 = hikariConfig60.isRegisterMbeans();
        hikariConfig60.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource68 = null;
        hikariConfig60.setDataSource(dataSource68);
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str71 = hikariConfig70.getConnectionInitSql();
        long long72 = hikariConfig70.getLeakDetectionThreshold();
        int int73 = hikariConfig70.getMaximumPoolSize();
        long long74 = hikariConfig70.leakDetectionThreshold;
        hikariConfig70.setInitializationFailFast(true);
        com.zaxxer.hikari.HikariConfig hikariConfig78 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource79 = hikariConfig78.getDataSource();
        hikariConfig78.setConnectionTestQuery("");
        hikariConfig78.connectionCustomizerClassName = "";
        long long84 = hikariConfig78.getAcquireRetryDelay();
        hikariConfig78.setDataSourceClassName("HikariPool-66");
        hikariConfig78.setInitializationFailFast(false);
        hikariConfig70.addDataSourceProperty("HikariPool-62", (java.lang.Object) hikariConfig78);
        java.util.Properties properties90 = hikariConfig78.dataSourceProperties;
        java.util.Properties properties91 = hikariConfig78.getDataSourceProperties();
        hikariConfig60.setDataSourceProperties(properties91);
        hikariConfig55.dataSourceProperties = properties91;
        int int94 = hikariConfig55.getAcquireIncrement();
        java.util.Properties properties95 = hikariConfig55.dataSourceProperties;
        hikariConfig41.dataSourceProperties = properties95;
        hikariConfig0.dataSourceProperties = properties95;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str50);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(dataSource61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 60 + "'", int73 == 60);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertNull(dataSource79);
// flaky:         org.junit.Assert.assertTrue("'" + long84 + "' != '" + 100L + "'", long84 == 100L);
        org.junit.Assert.assertNotNull(properties90);
        org.junit.Assert.assertNotNull(properties91);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertNotNull(properties95);
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05754");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        long long4 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str5 = hikariConfig0.jdbcUrl;
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05755");
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
        int int16 = hikariConfig0.acquireRetries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05756");
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
        javax.sql.DataSource dataSource43 = hikariConfig0.dataSource;
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
        org.junit.Assert.assertNull(dataSource43);
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05757");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        int int8 = hikariConfig0.maxPoolSize;
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        java.util.Properties properties10 = hikariConfig0.dataSourceProperties;
        hikariConfig0.acquireRetryDelay = (short) 10;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05758");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int8 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05759");
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
        hikariConfig0.setIsolateInternalQueries(true);
        int int17 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.maxLifetime = 10L;
        boolean boolean20 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05760");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("HikariPool-978");
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        hikariConfig0.setAutoCommit(false);
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        long long12 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-978" + "'", str11, "HikariPool-978");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05761");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setDataSourceClassName("HikariPool-833");
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        int int12 = hikariConfig0.minPoolSize;
        hikariConfig0.setTransactionIsolation("HikariPool-132");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        boolean boolean17 = hikariConfig0.isAutoCommit;
        hikariConfig0.setDataSourceClassName("HikariPool-2832");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05762");
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
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.dataSource = dataSource13;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05763");
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
        java.lang.String str18 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05764");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        java.lang.String str7 = hikariConfig0.poolName;
        java.lang.String str8 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-14922" + "'", str7, "HikariPool-14922");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-14922" + "'", str8, "HikariPool-14922");
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05765");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        hikariConfig0.setJdbcUrl("HikariPool-47");
        boolean boolean13 = hikariConfig0.isAutoCommit;
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05766");
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
        hikariConfig0.transactionIsolationName = "HikariPool-272";
        int int20 = hikariConfig0.maxPoolSize;
        boolean boolean21 = hikariConfig0.isReadOnly;
        hikariConfig0.setDataSourceClassName("HikariPool-5116");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05767");
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
        hikariConfig0.connectionInitSql = "HikariPool-604";
        java.util.Properties properties29 = hikariConfig0.getDataSourceProperties();
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
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05768");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-25");
        hikariConfig0.setMaxLifetime(5000L);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer13;
        java.lang.String str15 = hikariConfig0.jdbcUrl;
        hikariConfig0.isInitializationFailFast = false;
        boolean boolean18 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05769");
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
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.isJdbc4connectionTest = false;
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-14933" + "'", str9, "HikariPool-14933");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05770");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-530");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-530 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05771");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-38");
        int int9 = hikariConfig0.getAcquireIncrement();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
        boolean boolean11 = hikariConfig0.isInitializationFailFast;
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05772");
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
        hikariConfig0.poolName = "HikariPool-4159";
        int int26 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05773");
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
        long long13 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05774");
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
        hikariConfig17.setAcquireRetries((int) '#');
        javax.sql.DataSource dataSource38 = hikariConfig17.getDataSource();
        hikariConfig17.catalog = "HikariPool-111";
        long long41 = hikariConfig17.connectionTimeout;
        java.lang.String str42 = hikariConfig17.dataSourceClassName;
        hikariConfig17.isInitializationFailFast = true;
        long long45 = hikariConfig17.getMaxLifetime();
        hikariConfig0.addDataSourceProperty("HikariPool-6642", (java.lang.Object) long45);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(dataSource38);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
        org.junit.Assert.assertNull(str42);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 32L + "'", long45 == 32L);
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05775");
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
        hikariConfig0.isJdbc4connectionTest = false;
        long long20 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05776");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        java.lang.String str11 = hikariConfig0.connectionTestQuery;
        long long12 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.isRegisterMbeans = true;
        boolean boolean15 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05777");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        int int12 = hikariConfig0.transactionIsolation;
        java.lang.String str13 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05778");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.transactionIsolationName = "hi!";
        java.lang.String str8 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setInitializationFailFast(true);
        int int11 = hikariConfig0.maxPoolSize;
        int int12 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05779");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        hikariConfig0.maxPoolSize = (short) 100;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        java.lang.String str10 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05780");
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
        hikariConfig0.setAcquireRetries((int) (byte) 0);
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05781");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        java.util.Properties properties8 = hikariConfig0.dataSourceProperties;
        int int9 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05782");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setMaxLifetime((long) '4');
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.leakDetectionThreshold = 0;
        boolean boolean9 = hikariConfig0.isAutoCommit();
        long long10 = hikariConfig0.maxLifetime;
        hikariConfig0.acquireIncrement = (-1);
        hikariConfig0.connectionInitSql = "HikariPool-167";
        hikariConfig0.transactionIsolation = '4';
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05783");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12968");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12968 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05784");
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
        int int13 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-2334");
        hikariConfig0.setDataSourceClassName("HikariPool-7534");
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05785");
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
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05786");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        long long8 = hikariConfig0.idleTimeout;
        long long9 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05787");
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
        hikariConfig0.idleTimeout = 'a';
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05788");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setAcquireRetryDelay((long) (short) 1);
        boolean boolean10 = hikariConfig0.isAutoCommit();
        hikariConfig0.connectionInitSql = "HikariPool-2694";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig0.connectionCustomizer;
        boolean boolean14 = hikariConfig0.isAutoCommit();
        hikariConfig0.setDataSourceClassName("HikariPool-4001");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05789");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3969");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3969 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05790");
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
        java.lang.String str20 = hikariConfig0.dataSourceClassName;
        hikariConfig0.jdbcUrl = "HikariPool-1037";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05791");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        boolean boolean5 = hikariConfig0.isAutoCommit;
        java.lang.String str6 = hikariConfig0.jdbcUrl;
        long long7 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireRetryDelay((long) 60);
        hikariConfig0.setJdbcUrl("HikariPool-457");
        hikariConfig0.connectionTestQuery = "HikariPool-2573";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05792");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.acquireIncrement = (-1);
        hikariConfig0.acquireRetries = 100;
        hikariConfig0.acquireRetries = 1;
        int int11 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05793");
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
        hikariConfig0.connectionTestQuery = "HikariPool-137";
        boolean boolean49 = hikariConfig0.isInitializationFailFast;
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05794");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        hikariConfig0.idleTimeout = 52L;
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        long long8 = hikariConfig0.connectionTimeout;
        hikariConfig0.dataSourceClassName = "HikariPool-18";
        hikariConfig0.setCatalog("HikariPool-1131");
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05795");
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
        long long16 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05796");
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
        boolean boolean44 = hikariConfig0.isRegisterMbeans;
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05797");
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
        long long14 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05798");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str6 = hikariConfig0.getCatalog();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05799");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str12 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.maxLifetime = 'a';
        boolean boolean15 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setMaximumPoolSize(1);
        java.util.Properties properties18 = hikariConfig0.getDataSourceProperties();
        int int19 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05800");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setCatalog("HikariPool-135");
        hikariConfig0.dataSourceClassName = "HikariPool-485";
        hikariConfig0.transactionIsolationName = "HikariPool-1052";
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str16 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.isRegisterMbeans = true;
        long long19 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05801");
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
        hikariConfig0.connectionTimeout = 35;
        hikariConfig0.setAcquireRetryDelay(5000L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05802");
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
        hikariConfig0.leakDetectionThreshold = (byte) 0;
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
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05803");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.util.Properties properties5 = hikariConfig0.dataSourceProperties;
        boolean boolean6 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.transactionIsolation = 35;
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str10 = hikariConfig0.jdbcUrl;
        hikariConfig0.setConnectionTimeout(100L);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05804");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.jdbcUrl = "HikariPool-16";
        int int13 = hikariConfig0.transactionIsolation;
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
        javax.sql.DataSource dataSource27 = null;
        hikariConfig14.dataSource = dataSource27;
        java.lang.String str29 = hikariConfig14.connectionTestQuery;
        java.util.Properties properties30 = hikariConfig14.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties30;
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05805");
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
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        boolean boolean27 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05806");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05807");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireRetries = 10;
        hikariConfig0.setPoolName("HikariPool-111");
        hikariConfig0.setConnectionInitSql("HikariPool-187");
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        boolean boolean10 = hikariConfig0.isRegisterMbeans;
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionTestQuery("HikariPool-7511");
        java.lang.String str14 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05808");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer30 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer30;
        boolean boolean32 = hikariConfig0.isReadOnly;
        hikariConfig0.connectionTestQuery = "HikariPool-1238";
        hikariConfig0.transactionIsolationName = "";
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-15053" + "'", str3, "HikariPool-15053");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05809");
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
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.dataSource = dataSource14;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-6980");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-6980' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-913" + "'", str13, "HikariPool-913");
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05810");
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
        boolean boolean44 = hikariConfig0.isInitializationFailFast();
        java.lang.String str45 = hikariConfig0.transactionIsolationName;
        java.lang.String str46 = hikariConfig0.connectionTestQuery;
        hikariConfig0.acquireRetries = 0;
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05811");
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
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
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
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05812");
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
        boolean boolean27 = hikariConfig0.isReadOnly;
        java.lang.String str28 = hikariConfig0.getPoolName();
        long long29 = hikariConfig0.getConnectionTimeout();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-15071" + "'", str28, "HikariPool-15071");
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05813");
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
        long long27 = hikariConfig0.getIdleTimeout();
        hikariConfig0.maxLifetime = 35;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05814");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        long long14 = hikariConfig12.getLeakDetectionThreshold();
        hikariConfig12.leakDetectionThreshold = (-1);
        long long17 = hikariConfig12.acquireRetryDelay;
        long long18 = hikariConfig12.getIdleTimeout();
        long long19 = hikariConfig12.leakDetectionThreshold;
        java.lang.String str20 = hikariConfig12.getCatalog();
        int int21 = hikariConfig12.acquireRetries;
        java.util.Properties properties22 = hikariConfig12.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties22;
        java.lang.String str24 = hikariConfig0.poolName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-10869");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-10869' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(properties22);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-15076" + "'", str24, "HikariPool-15076");
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05815");
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
        int int15 = hikariConfig0.acquireRetries;
        hikariConfig0.setConnectionTestQuery("HikariPool-1126");
        hikariConfig0.isRegisterMbeans = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05816");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setMaximumPoolSize((int) '#');
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05817");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig0.dataSource;
        int int11 = hikariConfig0.maxPoolSize;
        java.lang.String str12 = hikariConfig0.getPoolName();
        hikariConfig0.minPoolSize = 0;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-15080" + "'", str12, "HikariPool-15080");
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05818");
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
        hikariConfig0.transactionIsolationName = "HikariPool-73";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setReadOnly(false);
        hikariConfig0.transactionIsolationName = "HikariPool-1440";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(iConnectionCustomizer23);
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05819");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        int int4 = hikariConfig0.getTransactionIsolation();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        boolean boolean10 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05820");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        int int7 = hikariConfig0.getAcquireIncrement();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setUseInstrumentation(true);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        hikariConfig11.acquireIncrement = 0;
        hikariConfig11.connectionTimeout = 10;
        boolean boolean17 = hikariConfig11.isReadOnly();
        java.lang.String str18 = hikariConfig11.connectionCustomizerClassName;
        hikariConfig11.setAcquireRetries((int) (byte) 10);
        boolean boolean21 = hikariConfig11.isInitializationFailFast();
        java.util.Properties properties22 = hikariConfig11.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties22;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05821");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setCatalog("");
        hikariConfig0.setIsolateInternalQueries(false);
        int int11 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05822");
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
        java.lang.String str22 = hikariConfig0.getDataSourceClassName();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig0.dataSource = dataSource23;
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05823");
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
        hikariConfig0.connectionInitSql = "HikariPool-376";
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.catalog = "HikariPool-2652";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05824");
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
        hikariConfig0.poolName = "";
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.leakDetectionThreshold = 3;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05825");
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
        java.lang.String str18 = hikariConfig0.catalog;
        hikariConfig0.setIdleTimeout((long) (short) 10);
        hikariConfig0.acquireRetryDelay = (byte) 1;
        int int23 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05826");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-11723");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-11723 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05827");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setPoolName("HikariPool-66");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-4465");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-4465' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05828");
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
        hikariConfig8.acquireRetryDelay = (short) 100;
        hikariConfig8.setCatalog("HikariPool-1950");
        javax.sql.DataSource dataSource25 = hikariConfig8.dataSource;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNull(dataSource25);
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05829");
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
        hikariConfig0.setRegisterMbeans(false);
        java.lang.Class<?> wildcardClass39 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05830");
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
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.dataSource = dataSource13;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-15119" + "'", str7, "HikariPool-15119");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05831");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setDataSourceClassName("HikariPool-38");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer11;
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        int int14 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05832");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.util.Properties properties5 = hikariConfig0.dataSourceProperties;
        boolean boolean6 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.transactionIsolation = 35;
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setJdbcUrl("HikariPool-193");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05833");
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
        hikariConfig0.setAutoCommit(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-555");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-555' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05834");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setDataSourceClassName("HikariPool-38");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer11;
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        boolean boolean14 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05835");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        hikariConfig0.transactionIsolation = 1;
        hikariConfig0.dataSourceClassName = "HikariPool-1067";
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.getConnectionInitSql();
        long long15 = hikariConfig13.getLeakDetectionThreshold();
        int int16 = hikariConfig13.getMaximumPoolSize();
        long long17 = hikariConfig13.getIdleTimeout();
        int int18 = hikariConfig13.maxPoolSize;
        java.lang.String str19 = hikariConfig13.getConnectionCustomizerClassName();
        hikariConfig0.addDataSourceProperty("HikariPool-137", (java.lang.Object) hikariConfig13);
        hikariConfig13.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05836");
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
        java.lang.String str22 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer23;
        java.lang.String str25 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05837");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        long long9 = hikariConfig0.leakDetectionThreshold;
        boolean boolean10 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05838");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.maxLifetime = (short) 0;
        hikariConfig0.isAutoCommit = true;
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.leakDetectionThreshold = (byte) 100;
        hikariConfig0.setConnectionInitSql("HikariPool-223");
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.connectionCustomizerClassName = "";
        hikariConfig15.setConnectionCustomizerClassName("hi!");
        java.lang.String str23 = hikariConfig15.getCatalog();
        java.util.Properties properties24 = hikariConfig15.dataSourceProperties;
        int int25 = hikariConfig15.minPoolSize;
        long long26 = hikariConfig15.getMaxLifetime();
        long long27 = hikariConfig15.acquireRetryDelay;
        hikariConfig15.setLeakDetectionThreshold((long) (byte) 10);
        hikariConfig15.connectionInitSql = "HikariPool-93";
        hikariConfig15.setAcquireRetries((int) (byte) 1);
        int int34 = hikariConfig15.acquireRetries;
        hikariConfig0.addDataSourceProperty("HikariPool-3664", (java.lang.Object) hikariConfig15);
        hikariConfig0.poolName = "HikariPool-5118";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05839");
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
        java.util.Properties properties18 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-84" + "'", str17, "HikariPool-84");
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05840");
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
        int int17 = hikariConfig0.acquireRetries;
        javax.sql.DataSource dataSource18 = hikariConfig0.dataSource;
        int int19 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05841");
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
        long long15 = hikariConfig0.getIdleTimeout();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05842");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        java.lang.String str2 = hikariConfig0.poolName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-15155" + "'", str2, "HikariPool-15155");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05843");
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
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "HikariPool-8565";
        java.lang.String str25 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05844");
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
        java.lang.Class<?> wildcardClass17 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05845");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        hikariConfig0.acquireRetries = (byte) 100;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.jdbcUrl = "HikariPool-141";
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        int int15 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbcUrl("HikariPool-873");
        hikariConfig0.poolName = "HikariPool-3736";
        int int20 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05846");
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
        long long33 = hikariConfig0.getLeakDetectionThreshold();
        int int34 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str35 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05847");
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
        java.lang.String str18 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-84" + "'", str17, "HikariPool-84");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05848");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        long long4 = hikariConfig0.maxLifetime;
        hikariConfig0.setAcquireRetryDelay((long) 0);
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.leakDetectionThreshold = (short) 1;
        long long10 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.isAutoCommit = false;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource15 = hikariConfig14.getDataSource();
        hikariConfig14.setConnectionTestQuery("");
        hikariConfig14.setInitializationFailFast(false);
        hikariConfig14.catalog = "";
        int int22 = hikariConfig14.getMaximumPoolSize();
        hikariConfig14.leakDetectionThreshold = (short) 10;
        hikariConfig14.isJdbc4connectionTest = true;
        boolean boolean27 = hikariConfig14.isReadOnly();
        java.lang.String str28 = hikariConfig14.getConnectionInitSql();
        long long29 = hikariConfig14.acquireRetryDelay;
        hikariConfig14.setUseInstrumentation(true);
        boolean boolean32 = hikariConfig14.isInitializationFailFast();
        hikariConfig0.addDataSourceProperty("HikariPool-1109", (java.lang.Object) hikariConfig14);
        boolean boolean34 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05849");
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
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.idleTimeout = 100L;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05850");
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
        hikariConfig0.isReadOnly = false;
        boolean boolean27 = hikariConfig0.isAutoCommit;
        long long28 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05851");
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
        hikariConfig0.setUseInstrumentation(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer34 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer34;
        hikariConfig0.dataSourceClassName = "HikariPool-3570";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-15195" + "'", str15, "HikariPool-15195");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05852");
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
        java.lang.String str18 = hikariConfig0.getConnectionTestQuery();
        boolean boolean19 = hikariConfig0.isRegisterMbeans;
        boolean boolean20 = hikariConfig0.isReadOnly();
        hikariConfig0.idleTimeout = 1L;
        hikariConfig0.connectionInitSql = "";
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05853");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean6 = hikariConfig0.isAutoCommit;
        javax.sql.DataSource dataSource7 = hikariConfig0.dataSource;
        hikariConfig0.setPoolName("HikariPool-184");
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        boolean boolean11 = hikariConfig0.isReadOnly();
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05854");
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
        java.lang.String str49 = hikariConfig0.jdbcUrl;
        hikariConfig0.dataSourceClassName = "HikariPool-110";
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(dataSource30);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05855");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.setPoolName("HikariPool-184");
        hikariConfig0.transactionIsolation = 0;
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.maxLifetime = 35;
        hikariConfig0.minPoolSize = (short) 0;
        boolean boolean18 = hikariConfig0.isAutoCommit;
        hikariConfig0.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05856");
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
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.acquireRetryDelay = 100;
        boolean boolean19 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05857");
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
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05858");
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
        java.lang.String str33 = hikariConfig0.getConnectionInitSql();
        boolean boolean34 = hikariConfig0.isRegisterMbeans;
        long long35 = hikariConfig0.acquireRetryDelay;
        java.util.Properties properties36 = hikariConfig0.dataSourceProperties;
        int int37 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05859");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.transactionIsolationName = "";
        hikariConfig0.jdbcUrl = "HikariPool-3298";
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1226");
        hikariConfig0.setLeakDetectionThreshold((long) (short) -1);
        long long16 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05860");
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
        java.util.Properties properties13 = hikariConfig12.dataSourceProperties;
        hikariConfig12.setJdbcUrl("HikariPool-167");
        hikariConfig12.acquireRetries = '4';
        hikariConfig12.acquireRetries = 1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05861");
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
        int int40 = hikariConfig0.transactionIsolation;
        boolean boolean41 = hikariConfig0.isAutoCommit();
        boolean boolean42 = hikariConfig0.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer43 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer43;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05862");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-110");
        hikariConfig0.setMinimumPoolSize(3);
        hikariConfig0.acquireIncrement = 100;
        java.lang.String str15 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05863");
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
        hikariConfig0.setIdleTimeout((long) (byte) 0);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig0.setDataSource(dataSource21);
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
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05864");
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
        hikariConfig0.leakDetectionThreshold = 3L;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource17 = hikariConfig16.getDataSource();
        hikariConfig16.setConnectionTestQuery("");
        hikariConfig16.connectionCustomizerClassName = "";
        hikariConfig16.setConnectionCustomizerClassName("hi!");
        java.lang.String str24 = hikariConfig16.getCatalog();
        boolean boolean25 = hikariConfig16.isRegisterMbeans;
        hikariConfig16.setAcquireRetries(0);
        hikariConfig16.setMaximumPoolSize((int) '#');
        hikariConfig16.setTransactionIsolation("hi!");
        boolean boolean32 = hikariConfig16.isInitializationFailFast();
        long long33 = hikariConfig16.getMaxLifetime();
        javax.sql.DataSource dataSource34 = hikariConfig16.dataSource;
        java.lang.String str35 = hikariConfig16.getConnectionCustomizerClassName();
        boolean boolean36 = hikariConfig16.isJdbc4ConnectionTest();
        java.util.Properties properties37 = hikariConfig16.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties37);
        hikariConfig0.isAutoCommit = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(properties37);
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05865");
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
        boolean boolean27 = hikariConfig0.isInitializationFailFast();
        int int28 = hikariConfig0.acquireRetries;
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05866");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-4299");
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05867");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig0.isAutoCommit();
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05868");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.leakDetectionThreshold = 0L;
        int int11 = hikariConfig0.transactionIsolation;
        boolean boolean12 = hikariConfig0.isAutoCommit();
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.dataSourceClassName = "HikariPool-14956";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05869");
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
        long long26 = hikariConfig0.connectionTimeout;
        boolean boolean27 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05870");
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
        boolean boolean42 = hikariConfig0.isRegisterMbeans();
        java.lang.String str43 = hikariConfig0.transactionIsolationName;
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05871");
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
        boolean boolean48 = hikariConfig0.isReadOnly;
        int int49 = hikariConfig0.minPoolSize;
        hikariConfig0.maxPoolSize = (byte) 0;
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05872");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str5 = hikariConfig0.getPoolName();
        hikariConfig0.idleTimeout = (byte) 1;
        hikariConfig0.leakDetectionThreshold = (byte) -1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-15262" + "'", str5, "HikariPool-15262");
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05873");
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
        boolean boolean27 = hikariConfig23.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource29 = hikariConfig28.getDataSource();
        hikariConfig28.setConnectionTestQuery("");
        hikariConfig28.connectionCustomizerClassName = "";
        hikariConfig28.setConnectionCustomizerClassName("hi!");
        int int36 = hikariConfig28.acquireIncrement;
        long long37 = hikariConfig28.acquireRetryDelay;
        long long38 = hikariConfig28.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource41 = hikariConfig40.getDataSource();
        hikariConfig40.setConnectionTestQuery("");
        hikariConfig40.setInitializationFailFast(false);
        hikariConfig40.catalog = "";
        int int48 = hikariConfig40.getMaximumPoolSize();
        hikariConfig40.leakDetectionThreshold = (short) 10;
        hikariConfig40.isJdbc4connectionTest = true;
        boolean boolean53 = hikariConfig40.isReadOnly();
        java.lang.String str54 = hikariConfig40.getConnectionInitSql();
        java.lang.String str55 = hikariConfig40.poolName;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str57 = hikariConfig56.getConnectionInitSql();
        long long58 = hikariConfig56.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer59 = null;
        hikariConfig56.connectionCustomizer = iConnectionCustomizer59;
        boolean boolean61 = hikariConfig56.isIsolateInternalQueries();
        hikariConfig56.poolName = "HikariPool-47";
        java.lang.String str64 = hikariConfig56.transactionIsolationName;
        hikariConfig56.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties67 = hikariConfig56.getDataSourceProperties();
        hikariConfig40.dataSourceProperties = properties67;
        hikariConfig28.addDataSourceProperty("HikariPool-453", (java.lang.Object) properties67);
        hikariConfig23.setDataSourceProperties(properties67);
        hikariConfig23.leakDetectionThreshold = 5000L;
        hikariConfig23.connectionTimeout = 97;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-15265" + "'", str3, "HikariPool-15265");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(properties25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-15268" + "'", str26, "HikariPool-15268");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertNull(dataSource41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 60 + "'", int48 == 60);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str54);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "HikariPool-15270" + "'", str55, "HikariPool-15270");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(properties67);
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05874");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean10 = hikariConfig0.isAutoCommit;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig0.connectionCustomizer;
        hikariConfig0.connectionTimeout = (byte) -1;
        hikariConfig0.transactionIsolation = 1;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05875");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig0.connectionCustomizer;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer12;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-10480";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05876");
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
        hikariConfig0.setAcquireRetryDelay((long) (short) 10);
        hikariConfig0.setMaxLifetime((long) 100);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05877");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.setIdleTimeout((long) 10);
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (byte) 0;
        hikariConfig11.acquireRetryDelay = 3L;
        hikariConfig11.poolName = "HikariPool-66";
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource21 = hikariConfig20.getDataSource();
        hikariConfig20.setConnectionTestQuery("");
        hikariConfig20.connectionCustomizerClassName = "";
        hikariConfig20.setConnectionCustomizerClassName("hi!");
        java.lang.String str28 = hikariConfig20.getCatalog();
        boolean boolean29 = hikariConfig20.isRegisterMbeans;
        hikariConfig20.setAcquireRetries(0);
        hikariConfig20.setMaximumPoolSize((int) '#');
        hikariConfig20.setTransactionIsolation("hi!");
        boolean boolean36 = hikariConfig20.isInitializationFailFast();
        java.lang.String str37 = hikariConfig20.connectionInitSql;
        hikariConfig20.maxPoolSize = 0;
        java.util.Properties properties40 = hikariConfig20.getDataSourceProperties();
        hikariConfig11.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig0.dataSourceProperties = properties40;
        javax.sql.DataSource dataSource44 = hikariConfig0.getDataSource();
        hikariConfig0.setJdbcUrl("HikariPool-8934");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNull(dataSource44);
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05878");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05879");
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
        hikariConfig0.setMinimumPoolSize(0);
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.connectionInitSql = "HikariPool-1109";
        int int20 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05880");
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
        hikariConfig0.maxPoolSize = 97;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05881");
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
        hikariConfig0.setAcquireRetries((int) (byte) 10);
        hikariConfig0.setAutoCommit(false);
        boolean boolean22 = hikariConfig0.isReadOnly();
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        hikariConfig0.setTransactionIsolation("HikariPool-1370");
        boolean boolean27 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05882");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getCatalog();
        java.lang.String str8 = hikariConfig0.connectionInitSql;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-15286" + "'", str6, "HikariPool-15286");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05883");
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
        hikariConfig0.setAcquireRetries((int) (byte) 0);
        hikariConfig0.setPoolName("HikariPool-54");
        long long18 = hikariConfig0.idleTimeout;
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05884");
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
        int int20 = hikariConfig0.getMinimumPoolSize();
        boolean boolean21 = hikariConfig0.isJdbc4ConnectionTest();
        int int22 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.isRegisterMbeans = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05885");
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
        hikariConfig0.setUseInstrumentation(false);
        long long36 = hikariConfig0.getConnectionTimeout();
        java.lang.String str37 = hikariConfig0.connectionCustomizerClassName;
        long long38 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-15300" + "'", str13, "HikariPool-15300");
        org.junit.Assert.assertNull(dataSource24);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNotNull(properties30);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05886");
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
        java.util.Properties properties18 = hikariConfig0.dataSourceProperties;
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05887");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("HikariPool-1021");
        java.lang.String str12 = hikariConfig0.dataSourceClassName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-66" + "'", str12, "HikariPool-66");
        org.junit.Assert.assertNull(iConnectionCustomizer13);
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05888");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.isRegisterMbeans = true;
        java.lang.String str11 = hikariConfig0.poolName;
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setPoolName("HikariPool-1887");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-15305" + "'", str11, "HikariPool-15305");
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05889");
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
        boolean boolean19 = hikariConfig0.isReadOnly;
        hikariConfig0.connectionInitSql = "HikariPool-401";
        hikariConfig0.minPoolSize = (short) 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05890");
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
        long long22 = hikariConfig0.leakDetectionThreshold;
        boolean boolean23 = hikariConfig0.isRegisterMbeans();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05891");
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
        hikariConfig0.acquireRetryDelay = 97L;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05892");
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
        int int29 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-223");
        boolean boolean32 = hikariConfig0.isRegisterMbeans();
        long long33 = hikariConfig0.connectionTimeout;
        hikariConfig0.acquireRetries = 97;
        hikariConfig0.acquireRetries = (byte) 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05893");
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
        hikariConfig0.idleTimeout = (short) 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05894");
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
        java.lang.String str19 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean20 = hikariConfig0.isJdbc4ConnectionTest();
        int int21 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05895");
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
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.transactionIsolationName = "HikariPool-146";
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05896");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.dataSourceClassName = "HikariPool-14011";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05897");
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
        hikariConfig0.setConnectionInitSql("HikariPool-317");
        boolean boolean26 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05898");
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
        int int16 = hikariConfig0.acquireIncrement;
        hikariConfig0.setMaximumPoolSize((int) (short) 0);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-73" + "'", str11, "HikariPool-73");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05899");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.dataSource = dataSource8;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        boolean boolean12 = hikariConfig0.isRegisterMbeans;
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05900");
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
        int int13 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05901");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setReadOnly(false);
        int int9 = hikariConfig0.transactionIsolation;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05902");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isRegisterMbeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05903");
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
        long long18 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05904");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        int int10 = hikariConfig0.minPoolSize;
        long long11 = hikariConfig0.connectionTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig12.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.setInitializationFailFast(false);
        long long21 = hikariConfig15.getConnectionTimeout();
        java.util.Properties properties22 = hikariConfig15.dataSourceProperties;
        hikariConfig12.dataSourceProperties = properties22;
        java.lang.String str24 = hikariConfig12.catalog;
        hikariConfig12.setConnectionInitSql("HikariPool-66");
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig27.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource31 = hikariConfig30.getDataSource();
        hikariConfig30.setConnectionTestQuery("");
        hikariConfig30.setInitializationFailFast(false);
        long long36 = hikariConfig30.getConnectionTimeout();
        java.util.Properties properties37 = hikariConfig30.dataSourceProperties;
        hikariConfig27.dataSourceProperties = properties37;
        hikariConfig12.setDataSourceProperties(properties37);
        hikariConfig0.dataSourceProperties = properties37;
        hikariConfig0.setJdbcUrl("HikariPool-48");
        java.lang.String str43 = hikariConfig0.poolName;
        java.lang.String str44 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(dataSource16);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(dataSource31);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertNotNull(properties37);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "HikariPool-15337" + "'", str43, "HikariPool-15337");
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05905");
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
        boolean boolean12 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean13 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.dataSourceClassName = "HikariPool-74";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05906");
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
        java.util.Properties properties28 = hikariConfig0.getDataSourceProperties();
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
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05907");
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
        hikariConfig0.transactionIsolationName = "HikariPool-221";
        hikariConfig0.connectionTestQuery = "HikariPool-1045";
        hikariConfig0.setAcquireRetryDelay(32L);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05908");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        hikariConfig0.isRegisterMbeans = false;
        long long9 = hikariConfig0.idleTimeout;
        hikariConfig0.setMaximumPoolSize(3);
        java.lang.String str12 = hikariConfig0.connectionInitSql;
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05909");
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
        hikariConfig0.isInitializationFailFast = false;
        java.lang.String str18 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05910");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-4162");
        hikariConfig0.transactionIsolation = 1;
        hikariConfig0.setTransactionIsolation("HikariPool-2466");
        hikariConfig0.setAcquireIncrement(10);
        java.lang.String str16 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05911");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.isReadOnly = false;
        hikariConfig0.setConnectionInitSql("HikariPool-453");
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        int int15 = hikariConfig0.acquireIncrement;
        java.util.Properties properties16 = hikariConfig0.getDataSourceProperties();
        boolean boolean17 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05912");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        hikariConfig0.poolName = "HikariPool-989";
        long long13 = hikariConfig0.acquireRetryDelay;
        java.lang.String str14 = hikariConfig0.connectionInitSql;
        java.lang.String str15 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-989" + "'", str15, "HikariPool-989");
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05913");
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
        hikariConfig0.setTransactionIsolation("HikariPool-357");
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        long long17 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05914");
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
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05915");
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
        hikariConfig0.transactionIsolation = (short) 0;
        hikariConfig0.transactionIsolationName = "HikariPool-891";
        boolean boolean17 = hikariConfig0.isInitializationFailFast;
        long long18 = hikariConfig0.acquireRetryDelay;
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        long long20 = hikariConfig0.maxLifetime;
        hikariConfig0.setIdleTimeout((long) 10);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNull(dataSource19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05916");
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
        long long19 = hikariConfig0.connectionTimeout;
        long long20 = hikariConfig0.connectionTimeout;
        boolean boolean21 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2147483647L + "'", long19 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483647L + "'", long20 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05917");
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
        hikariConfig0.setConnectionInitSql("HikariPool-48");
        java.lang.String str21 = hikariConfig0.connectionCustomizerClassName;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource23 = hikariConfig22.getDataSource();
        hikariConfig22.setConnectionTestQuery("");
        hikariConfig22.setReadOnly(false);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig22.dataSource = dataSource28;
        hikariConfig22.setJdbc4ConnectionTest(false);
        hikariConfig22.setIsolateInternalQueries(true);
        boolean boolean34 = hikariConfig22.isInitializationFailFast();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str36 = hikariConfig35.getConnectionInitSql();
        long long37 = hikariConfig35.getLeakDetectionThreshold();
        hikariConfig35.leakDetectionThreshold = (-1);
        int int40 = hikariConfig35.acquireIncrement;
        hikariConfig35.setPoolName("HikariPool-62");
        hikariConfig35.acquireRetryDelay = 0L;
        java.lang.String str45 = hikariConfig35.getCatalog();
        javax.sql.DataSource dataSource46 = hikariConfig35.getDataSource();
        int int47 = hikariConfig35.getMinimumPoolSize();
        long long48 = hikariConfig35.getAcquireRetryDelay();
        hikariConfig35.setRegisterMbeans(false);
        boolean boolean51 = hikariConfig35.isRegisterMbeans;
        java.lang.String str52 = hikariConfig35.connectionInitSql;
        java.util.Properties properties53 = hikariConfig35.getDataSourceProperties();
        hikariConfig22.setDataSourceProperties(properties53);
        hikariConfig0.setDataSourceProperties(properties53);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(properties53);
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05918");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        int int7 = hikariConfig0.getMaximumPoolSize();
        long long8 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05919");
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
        int int18 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05920");
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
        int int21 = hikariConfig0.maxPoolSize;
        hikariConfig0.setMinimumPoolSize(3);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05921");
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
        hikariConfig0.acquireRetries = (byte) 10;
        java.lang.String str18 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-15387" + "'", str18, "HikariPool-15387");
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05922");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        java.lang.String str9 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.maxLifetime = (-1);
        long long12 = hikariConfig0.getIdleTimeout();
        hikariConfig0.minPoolSize = 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05923");
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
        java.lang.String str16 = hikariConfig0.jdbcUrl;
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05924");
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
        long long26 = hikariConfig0.leakDetectionThreshold;
        long long27 = hikariConfig0.getConnectionTimeout();
        boolean boolean28 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.maxLifetime = 35L;
        hikariConfig0.setMinimumPoolSize(32);
        long long33 = hikariConfig0.maxLifetime;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-15394" + "'", str3, "HikariPool-15394");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 35L + "'", long33 == 35L);
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05925");
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
        java.lang.String str30 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource32 = hikariConfig31.getDataSource();
        hikariConfig31.setConnectionTestQuery("");
        hikariConfig31.setInitializationFailFast(false);
        long long37 = hikariConfig31.getConnectionTimeout();
        hikariConfig31.setJdbcUrl("HikariPool-47");
        hikariConfig31.isIsolateInternalQueries = false;
        hikariConfig31.connectionTestQuery = "HikariPool-62";
        java.util.Properties properties44 = hikariConfig31.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties44);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-15401" + "'", str3, "HikariPool-15401");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-48" + "'", str27, "HikariPool-48");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(dataSource32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05926");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.acquireRetries = 0;
        hikariConfig0.connectionInitSql = "HikariPool-84";
        java.lang.String str11 = hikariConfig0.dataSourceClassName;
        java.lang.String str12 = hikariConfig0.connectionCustomizerClassName;
        int int13 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05927");
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
        hikariConfig0.maxPoolSize = (short) 10;
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
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05928");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer14;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05929");
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
        hikariConfig0.connectionCustomizerClassName = "HikariPool-1784";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05930");
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
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05931");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        long long4 = hikariConfig0.maxLifetime;
        long long5 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setAcquireRetryDelay(10L);
        hikariConfig0.connectionTestQuery = "HikariPool-590";
        hikariConfig0.idleTimeout = 35;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.isReadOnly = true;
        java.lang.String str16 = hikariConfig0.dataSourceClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 35L + "'", long4 == 35L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05932");
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
        java.lang.String str45 = hikariConfig0.connectionTestQuery;
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
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05933");
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
        java.lang.String str15 = hikariConfig0.connectionCustomizerClassName;
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime((long) 32);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05934");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.lang.String str5 = hikariConfig0.poolName;
        long long6 = hikariConfig0.getMaxLifetime();
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setAcquireRetries((int) (byte) 100);
        hikariConfig0.minPoolSize = (byte) -1;
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-15442" + "'", str5, "HikariPool-15442");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05935");
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
        javax.sql.DataSource dataSource13 = hikariConfig0.dataSource;
        hikariConfig0.setMaximumPoolSize(100);
        java.lang.String str16 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05936");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setCatalog("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.dataSource = dataSource9;
        java.lang.Class<?> wildcardClass11 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05937");
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
        java.lang.String str35 = hikariConfig0.getConnectionInitSql();
        boolean boolean36 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05938");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.poolName = "HikariPool-47";
        java.lang.String str8 = hikariConfig0.getCatalog();
        long long9 = hikariConfig0.getIdleTimeout();
        long long10 = hikariConfig0.acquireRetryDelay;
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setReadOnly(false);
        long long14 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05939");
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
        hikariConfig0.setJdbc4ConnectionTest(true);
        long long19 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05940");
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
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean22 = hikariConfig0.isIsolateInternalQueries;
        java.lang.String str23 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-122" + "'", str23, "HikariPool-122");
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05941");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        long long10 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        hikariConfig0.setUseInstrumentation(true);
        long long14 = hikariConfig0.getAcquireRetryDelay();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-15455" + "'", str3, "HikariPool-15455");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05942");
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
        hikariConfig0.setAcquireRetryDelay(3L);
        int int45 = hikariConfig0.transactionIsolation;
        hikariConfig0.jdbcUrl = "HikariPool-10697";
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05943");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05944");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean4 = hikariConfig0.isAutoCommit();
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str7 = hikariConfig0.connectionInitSql;
        hikariConfig0.setMinimumPoolSize((int) ' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05945");
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
        boolean boolean17 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionInitSql("HikariPool-511");
        boolean boolean20 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05946");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setMaxLifetime((long) 35);
        hikariConfig0.setInitializationFailFast(false);
        boolean boolean14 = hikariConfig0.isAutoCommit();
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setTransactionIsolation("HikariPool-2635");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-208" + "'", str9, "HikariPool-208");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05947");
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
        javax.sql.DataSource dataSource50 = null;
        hikariConfig0.setDataSource(dataSource50);
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
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05948");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        int int9 = hikariConfig0.transactionIsolation;
        long long10 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.transactionIsolationName = "HikariPool-2650";
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.dataSource = dataSource15;
        int int17 = hikariConfig0.acquireIncrement;
        long long18 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05949");
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
        hikariConfig0.setReadOnly(false);
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-3" + "'", str17, "HikariPool-3");
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05950");
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
        hikariConfig0.maxLifetime = 10L;
        int int16 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05951");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        boolean boolean5 = hikariConfig0.isAutoCommit;
        java.lang.String str6 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setConnectionTimeout(0L);
        java.lang.Class<?> wildcardClass9 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05952");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        long long9 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean10 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.poolName = "HikariPool-980";
        java.lang.String str13 = hikariConfig0.connectionCustomizerClassName;
        boolean boolean14 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05953");
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
        hikariConfig8.acquireRetryDelay = (short) 100;
        boolean boolean23 = hikariConfig8.isReadOnly();
        boolean boolean24 = hikariConfig8.isJdbc4ConnectionTest();
        hikariConfig8.transactionIsolationName = "HikariPool-4301";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05954");
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
        long long17 = hikariConfig0.idleTimeout;
        int int18 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05955");
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
        java.lang.String str17 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05956");
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
        hikariConfig0.setJdbcUrl("HikariPool-79");
        java.lang.String str21 = hikariConfig0.poolName;
        long long22 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-15504" + "'", str21, "HikariPool-15504");
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05957");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05958");
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
        hikariConfig0.setAcquireRetries(0);
        boolean boolean22 = hikariConfig0.isJdbc4connectionTest;
        int int23 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05959");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str12 = hikariConfig0.connectionInitSql;
        boolean boolean13 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setAcquireRetries(0);
        java.lang.String str16 = hikariConfig0.transactionIsolationName;
        hikariConfig0.isAutoCommit = false;
        long long19 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05960");
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
        hikariConfig0.isRegisterMbeans = true;
        long long17 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setUseInstrumentation(true);
        long long20 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05961");
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
        hikariConfig0.jdbcUrl = "HikariPool-1732";
        long long28 = hikariConfig0.getIdleTimeout();
        javax.sql.DataSource dataSource29 = null;
        hikariConfig0.setDataSource(dataSource29);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05962");
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
        int int15 = hikariConfig0.getAcquireRetries();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05963");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-470");
        hikariConfig0.maxLifetime = 60L;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig0.setDataSource(dataSource14);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05964");
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
        long long14 = hikariConfig11.acquireRetryDelay;
        boolean boolean15 = hikariConfig11.isAutoCommit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05965");
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
        java.lang.String str35 = hikariConfig0.getConnectionInitSql();
        java.lang.String str36 = hikariConfig0.dataSourceClassName;
        int int37 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05966");
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
        long long14 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str15 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05967");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        java.lang.String str10 = hikariConfig0.transactionIsolationName;
        hikariConfig0.isRegisterMbeans = true;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05968");
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
        java.lang.String str33 = hikariConfig0.connectionTestQuery;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-15558" + "'", str3, "HikariPool-15558");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05969");
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
        long long18 = hikariConfig0.leakDetectionThreshold;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05970");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.isRegisterMbeans = true;
        java.lang.String str11 = hikariConfig0.poolName;
        long long12 = hikariConfig0.maxLifetime;
        long long13 = hikariConfig0.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-871");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-871' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-15565" + "'", str11, "HikariPool-15565");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05971");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.util.Properties properties5 = hikariConfig0.dataSourceProperties;
        boolean boolean6 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.transactionIsolation = 35;
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str10 = hikariConfig0.jdbcUrl;
        hikariConfig0.setAcquireRetries((int) (short) 10);
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str15 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-15572" + "'", str15, "HikariPool-15572");
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05972");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        long long7 = hikariConfig0.maxLifetime;
        long long8 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setLeakDetectionThreshold(32L);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-3534";
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.setMinimumPoolSize(32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05973");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.setReadOnly(true);
        hikariConfig0.maxPoolSize = (short) 100;
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.maxLifetime = 97L;
        int int12 = hikariConfig0.transactionIsolation;
        hikariConfig0.maxPoolSize = 32;
        hikariConfig0.connectionInitSql = "HikariPool-4181";
        boolean boolean17 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05974");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-8912");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-8912 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05975");
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
        hikariConfig0.isRegisterMbeans = false;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout(60L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05976");
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
        boolean boolean42 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setCatalog("HikariPool-2982");
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05977");
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
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05978");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold(10L);
        hikariConfig0.setUseInstrumentation(false);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        java.lang.String str9 = hikariConfig0.getPoolName();
        long long10 = hikariConfig0.maxLifetime;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer11;
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-15599" + "'", str9, "HikariPool-15599");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05979");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        boolean boolean5 = hikariConfig0.isAutoCommit;
        java.lang.String str6 = hikariConfig0.jdbcUrl;
        long long7 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireRetryDelay((long) 60);
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.acquireRetries = 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05980");
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
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str22 = hikariConfig21.getConnectionInitSql();
        long long23 = hikariConfig21.getLeakDetectionThreshold();
        int int24 = hikariConfig21.getMaximumPoolSize();
        long long25 = hikariConfig21.getConnectionTimeout();
        long long26 = hikariConfig21.getMaxLifetime();
        java.lang.String str27 = hikariConfig21.connectionCustomizerClassName;
        hikariConfig21.acquireRetryDelay = 1;
        hikariConfig21.isInitializationFailFast = true;
        hikariConfig21.connectionCustomizerClassName = "HikariPool-322";
        hikariConfig0.addDataSourceProperty("HikariPool-4967", (java.lang.Object) "HikariPool-322");
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05981");
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
        int int22 = hikariConfig0.acquireIncrement;
        hikariConfig0.setConnectionTestQuery("HikariPool-3130");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05982");
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
        java.lang.String str22 = hikariConfig0.connectionInitSql;
        hikariConfig0.minPoolSize = ' ';
        hikariConfig0.isReadOnly = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05983");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer14;
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05984");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-209");
        boolean boolean30 = hikariConfig0.isInitializationFailFast;
        int int31 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05985");
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
        java.lang.String str22 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer23;
        hikariConfig0.acquireRetries = (short) 10;
        hikariConfig0.minPoolSize = 1;
        hikariConfig0.isAutoCommit = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05986");
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
        hikariConfig0.setInitializationFailFast(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05987");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setReadOnly(false);
        int int9 = hikariConfig0.transactionIsolation;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        hikariConfig0.setIdleTimeout((long) 35);
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        java.lang.String str15 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05988");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        hikariConfig0.isIsolateInternalQueries = true;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig0.connectionCustomizer;
        hikariConfig0.connectionTestQuery = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05989");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setAutoCommit(true);
        java.lang.String str4 = hikariConfig1.getJdbcUrl();
        long long5 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05990");
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
        long long16 = hikariConfig0.connectionTimeout;
        hikariConfig0.poolName = "HikariPool-533";
        int int19 = hikariConfig0.acquireRetries;
        int int20 = hikariConfig0.acquireIncrement;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1515");
        int int23 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05991");
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
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        int int17 = hikariConfig0.acquireRetries;
        hikariConfig0.poolName = "HikariPool-307";
        long long20 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05992");
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
        java.lang.String str23 = hikariConfig0.getConnectionTestQuery();
        int int24 = hikariConfig0.getMinimumPoolSize();
        boolean boolean25 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05993");
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
        hikariConfig0.isReadOnly = false;
        java.lang.String str40 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbcUrl("HikariPool-97");
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str45 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNull(str40);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HikariPool-15629" + "'", str45, "HikariPool-15629");
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05994");
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
        java.lang.String str16 = hikariConfig0.transactionIsolationName;
        hikariConfig0.isReadOnly = false;
        java.lang.String str19 = hikariConfig0.dataSourceClassName;
        hikariConfig0.connectionTimeout = (short) 0;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05995");
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
        int int15 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-15635" + "'", str14, "HikariPool-15635");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05996");
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
        hikariConfig0.setAcquireRetryDelay(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str34 = hikariConfig33.getConnectionInitSql();
        long long35 = hikariConfig33.getLeakDetectionThreshold();
        hikariConfig33.leakDetectionThreshold = (-1);
        hikariConfig33.idleTimeout = 52L;
        java.lang.String str40 = hikariConfig33.getDataSourceClassName();
        long long41 = hikariConfig33.connectionTimeout;
        javax.sql.DataSource dataSource42 = null;
        hikariConfig33.setDataSource(dataSource42);
        java.lang.String str44 = hikariConfig33.getCatalog();
        hikariConfig33.maxPoolSize = 35;
        hikariConfig33.jdbcUrl = "HikariPool-4516";
        hikariConfig0.addDataSourceProperty("HikariPool-677", (java.lang.Object) hikariConfig33);
        java.lang.String str50 = hikariConfig33.poolName;
        java.lang.String str51 = hikariConfig33.transactionIsolationName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(str40);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
        org.junit.Assert.assertNull(str44);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "HikariPool-15638" + "'", str50, "HikariPool-15638");
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05997");
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
        int int11 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05998");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaximumPoolSize(10);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig0.connectionCustomizer;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer12;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str15 = hikariConfig14.getConnectionInitSql();
        hikariConfig14.setMaxLifetime(35L);
        hikariConfig14.setAutoCommit(false);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource21 = hikariConfig20.getDataSource();
        hikariConfig20.setConnectionTestQuery("");
        hikariConfig20.connectionCustomizerClassName = "";
        hikariConfig20.setConnectionCustomizerClassName("hi!");
        java.lang.String str28 = hikariConfig20.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = null;
        hikariConfig20.connectionCustomizer = iConnectionCustomizer29;
        hikariConfig20.setJdbcUrl("HikariPool-38");
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig33.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource37 = hikariConfig36.getDataSource();
        hikariConfig36.setConnectionTestQuery("");
        hikariConfig36.setInitializationFailFast(false);
        long long42 = hikariConfig36.getConnectionTimeout();
        java.util.Properties properties43 = hikariConfig36.dataSourceProperties;
        hikariConfig33.dataSourceProperties = properties43;
        hikariConfig20.setDataSourceProperties(properties43);
        hikariConfig14.setDataSourceProperties(properties43);
        java.util.Properties properties47 = hikariConfig14.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties47);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer49 = hikariConfig0.connectionCustomizer;
        java.lang.String str50 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setAcquireRetryDelay((long) 60);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(dataSource37);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(iConnectionCustomizer49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test05999");
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
        hikariConfig0.dataSource = dataSource18;
        long long20 = hikariConfig0.maxLifetime;
        java.lang.String str21 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test06000");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource10 = hikariConfig9.getDataSource();
        hikariConfig9.setConnectionTestQuery("");
        hikariConfig9.setInitializationFailFast(false);
        long long15 = hikariConfig9.getConnectionTimeout();
        java.util.Properties properties16 = hikariConfig9.dataSourceProperties;
        boolean boolean17 = hikariConfig9.isInitializationFailFast();
        hikariConfig9.setLeakDetectionThreshold(0L);
        hikariConfig9.setUseInstrumentation(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = hikariConfig9.connectionCustomizer;
        hikariConfig9.isRegisterMbeans = false;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str26 = hikariConfig25.getConnectionInitSql();
        hikariConfig25.setMaxLifetime(35L);
        hikariConfig25.setAutoCommit(false);
        hikariConfig25.transactionIsolationName = "hi!";
        java.lang.String str33 = hikariConfig25.connectionCustomizerClassName;
        boolean boolean34 = hikariConfig25.isInitializationFailFast();
        java.lang.String str35 = hikariConfig25.jdbcUrl;
        hikariConfig25.connectionTimeout = 5000L;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource39 = hikariConfig38.getDataSource();
        hikariConfig38.setConnectionTestQuery("");
        hikariConfig38.connectionCustomizerClassName = "";
        hikariConfig38.setConnectionCustomizerClassName("hi!");
        java.lang.String str46 = hikariConfig38.getCatalog();
        boolean boolean47 = hikariConfig38.isRegisterMbeans;
        hikariConfig38.setAcquireRetries(0);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str51 = hikariConfig50.getConnectionInitSql();
        long long52 = hikariConfig50.getLeakDetectionThreshold();
        int int53 = hikariConfig50.getMaximumPoolSize();
        java.util.Properties properties54 = hikariConfig50.getDataSourceProperties();
        hikariConfig38.dataSourceProperties = properties54;
        hikariConfig25.setDataSourceProperties(properties54);
        hikariConfig9.setDataSourceProperties(properties54);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties54);
        hikariConfig0.setDataSourceProperties(properties54);
        hikariConfig0.setAcquireRetryDelay(3L);
        java.lang.String str62 = hikariConfig0.poolName;
        hikariConfig0.connectionTestQuery = "HikariPool-7271";
        boolean boolean65 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(dataSource39);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60 + "'", int53 == 60);
        org.junit.Assert.assertNotNull(properties54);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "HikariPool-15650" + "'", str62, "HikariPool-15650");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }
}
