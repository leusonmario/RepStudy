import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest36 {

    public static boolean debug = false;

    @Test
    public void test18001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18001");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        java.lang.String str3 = hikariConfig0.getPoolName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.maxPoolSize;
        long long6 = hikariConfig0.maxLifetime;
        hikariConfig0.connectionInitSql = "HikariPool-238";
        hikariConfig0.setPoolName("HikariPool-1107");
        hikariConfig0.acquireRetries = 100;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-43841" + "'", str3, "HikariPool-43841");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test18002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18002");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        long long10 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.isIsolateInternalQueries = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test18003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18003");
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
        long long16 = hikariConfig0.leakDetectionThreshold;
        long long17 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test18004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18004");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        hikariConfig0.setTransactionIsolation("HikariPool-122");
        int int11 = hikariConfig0.minPoolSize;
        boolean boolean12 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18005");
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
        long long16 = hikariConfig0.maxLifetime;
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean22 = hikariConfig0.isJdbc4connectionTest;
        int int23 = hikariConfig0.getAcquireIncrement();
        int int24 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test18006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18006");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setTransactionIsolation("HikariPool-48");
        long long10 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str11 = hikariConfig0.connectionInitSql;
        hikariConfig0.setJdbcUrl("HikariPool-86");
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.transactionIsolationName = "HikariPool-3133";
        hikariConfig0.setTransactionIsolation("HikariPool-1402");
        hikariConfig0.setPoolName("HikariPool-8265");
        boolean boolean21 = hikariConfig0.isAutoCommit;
        boolean boolean22 = hikariConfig0.isAutoCommit();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-43847" + "'", str3, "HikariPool-43847");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test18007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18007");
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
        boolean boolean11 = hikariConfig0.isReadOnly;
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.jdbcUrl = "HikariPool-1713";
        hikariConfig0.connectionInitSql = "HikariPool-905";
        boolean boolean17 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test18008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18008");
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
        boolean boolean11 = hikariConfig0.isReadOnly;
        hikariConfig0.setConnectionInitSql("HikariPool-548");
        java.lang.String str14 = hikariConfig0.dataSourceClassName;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-41593";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18009");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setMaximumPoolSize((int) '#');
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str15 = hikariConfig0.getCatalog();
        hikariConfig0.setIdleTimeout((long) 100);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18010");
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
        java.lang.String str21 = hikariConfig0.connectionCustomizerClassName;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str23 = hikariConfig22.getConnectionInitSql();
        long long24 = hikariConfig22.getLeakDetectionThreshold();
        hikariConfig22.leakDetectionThreshold = (-1);
        int int27 = hikariConfig22.acquireIncrement;
        hikariConfig22.setInitializationFailFast(true);
        boolean boolean30 = hikariConfig22.isReadOnly();
        java.lang.String str31 = hikariConfig22.catalog;
        java.util.Properties properties32 = hikariConfig22.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig0.dataSourceProperties = properties32;
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-47" + "'", str15, "HikariPool-47");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test18011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18011");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.jdbcUrl = "HikariPool-372";
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setCatalog("HikariPool-186");
        hikariConfig0.connectionCustomizerClassName = "HikariPool-1386";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18012");
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
        hikariConfig0.leakDetectionThreshold = 10;
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.setJdbcUrl("HikariPool-21871");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test18013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18013");
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
        boolean boolean17 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18014");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        hikariConfig0.transactionIsolation = 1;
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.acquireIncrement = 100;
        hikariConfig0.catalog = "HikariPool-20671";
        org.junit.Assert.assertNull(iConnectionCustomizer3);
    }

    @Test
    public void test18015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18015");
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
        java.util.Properties properties30 = hikariConfig0.getDataSourceProperties();
        long long31 = hikariConfig0.getAcquireRetryDelay();
        long long32 = hikariConfig0.getMaxLifetime();
        javax.sql.DataSource dataSource33 = hikariConfig0.getDataSource();
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
        org.junit.Assert.assertNotNull(properties30);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertNull(dataSource33);
    }

    @Test
    public void test18016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18016");
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
        long long16 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.transactionIsolation = 3;
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.isIsolateInternalQueries = false;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test18017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18017");
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
        int int22 = hikariConfig0.getAcquireIncrement();
        boolean boolean23 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test18018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18018");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig0.connectionCustomizer;
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
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test18019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18019");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        int int8 = hikariConfig0.getAcquireRetries();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.poolName = "HikariPool-65";
        boolean boolean12 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18020");
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
        hikariConfig0.setConnectionInitSql("HikariPool-220");
        boolean boolean29 = hikariConfig0.isRegisterMbeans;
        boolean boolean30 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test18021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18021");
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
        java.lang.String str15 = hikariConfig0.jdbcUrl;
        long long16 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.leakDetectionThreshold = 100;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test18022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18022");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setMaxLifetime((long) 35);
        java.lang.String str12 = hikariConfig0.getCatalog();
        hikariConfig0.acquireIncrement = 'a';
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean16 = hikariConfig0.isRegisterMbeans;
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-208" + "'", str9, "HikariPool-208");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test18023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18023");
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
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.connectionTestQuery = "HikariPool-899";
        long long16 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test18024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18024");
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
        hikariConfig0.setTransactionIsolation("HikariPool-497");
        int int20 = hikariConfig0.transactionIsolation;
        int int21 = hikariConfig0.acquireRetries;
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.acquireIncrement = (short) 1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test18025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18025");
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
        long long14 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.acquireRetries = 97;
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test18026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18026");
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
        java.lang.String str14 = hikariConfig0.connectionTestQuery;
        java.lang.String str15 = hikariConfig0.dataSourceClassName;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.setDataSource(dataSource16);
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18027");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.poolName = "HikariPool-73";
        long long11 = hikariConfig0.connectionTimeout;
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.setDataSourceClassName("HikariPool-2833");
        hikariConfig0.acquireIncrement = (byte) 1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test18028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18028");
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
        java.lang.String str14 = hikariConfig0.connectionTestQuery;
        java.lang.String str15 = hikariConfig0.getJdbcUrl();
        int int16 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.dataSourceClassName = "HikariPool-37250";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test18029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18029");
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
        long long44 = hikariConfig0.connectionTimeout;
        java.util.Properties properties45 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setDataSourceClassName("HikariPool-25206");
        hikariConfig0.maxLifetime = (byte) 10;
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
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 32L + "'", long44 == 32L);
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test18030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18030");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        int int8 = hikariConfig0.maxPoolSize;
        long long9 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str10 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-43887" + "'", str10, "HikariPool-43887");
    }

    @Test
    public void test18031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18031");
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
        long long23 = hikariConfig0.idleTimeout;
        long long24 = hikariConfig0.leakDetectionThreshold;
        boolean boolean25 = hikariConfig0.isJdbc4connectionTest;
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test18032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18032");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setDataSourceClassName("HikariPool-234");
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        hikariConfig0.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(properties7);
    }

    @Test
    public void test18033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18033");
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
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str39 = hikariConfig38.getConnectionInitSql();
        long long40 = hikariConfig38.getLeakDetectionThreshold();
        hikariConfig38.leakDetectionThreshold = (-1);
        long long43 = hikariConfig38.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource46 = hikariConfig45.getDataSource();
        hikariConfig45.setConnectionTestQuery("");
        hikariConfig45.connectionCustomizerClassName = "";
        hikariConfig45.setConnectionCustomizerClassName("hi!");
        java.lang.String str53 = hikariConfig45.getCatalog();
        boolean boolean54 = hikariConfig45.isRegisterMbeans;
        long long55 = hikariConfig45.connectionTimeout;
        hikariConfig45.setConnectionInitSql("HikariPool-48");
        hikariConfig38.addDataSourceProperty("hi!", (java.lang.Object) hikariConfig45);
        hikariConfig38.setConnectionCustomizerClassName("hi!");
        boolean boolean61 = hikariConfig38.isJdbc4connectionTest;
        long long62 = hikariConfig38.getConnectionTimeout();
        java.util.Properties properties63 = hikariConfig38.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties63);
        int int65 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNull(dataSource46);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long55 + "' != '" + 32L + "'", long55 == 32L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long62 + "' != '" + 32L + "'", long62 == 32L);
        org.junit.Assert.assertNotNull(properties63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
    }

    @Test
    public void test18034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18034");
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
        javax.sql.DataSource dataSource30 = hikariConfig0.getDataSource();
        boolean boolean31 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(dataSource30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test18035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18035");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.idleTimeout = (-1);
        int int12 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.acquireIncrement = 32;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test18036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18036");
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
        long long30 = hikariConfig0.connectionTimeout;
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.maxPoolSize = (short) 1;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-43899" + "'", str3, "HikariPool-43899");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-48" + "'", str27, "HikariPool-48");
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
    }

    @Test
    public void test18037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18037");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireRetries = 10;
        hikariConfig0.setPoolName("HikariPool-111");
        hikariConfig0.setConnectionInitSql("HikariPool-187");
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-2029");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-2029' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test18038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18038");
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
        hikariConfig0.connectionTestQuery = "HikariPool-35234";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18039");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.transactionIsolationName = "hi!";
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("HikariPool-103");
        boolean boolean12 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18040");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        java.lang.String str5 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setCatalog("HikariPool-179");
        hikariConfig0.acquireRetries = (short) 1;
        java.lang.String str10 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-43914" + "'", str10, "HikariPool-43914");
    }

    @Test
    public void test18041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18041");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        hikariConfig0.transactionIsolation = 'a';
        long long11 = hikariConfig0.connectionTimeout;
        int int12 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test18042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18042");
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
        long long16 = hikariConfig0.maxLifetime;
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean22 = hikariConfig0.isJdbc4connectionTest;
        int int23 = hikariConfig0.minPoolSize;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str25 = hikariConfig24.getConnectionInitSql();
        long long26 = hikariConfig24.getLeakDetectionThreshold();
        hikariConfig24.leakDetectionThreshold = (-1);
        long long29 = hikariConfig24.acquireRetryDelay;
        boolean boolean30 = hikariConfig24.isRegisterMbeans;
        hikariConfig24.setConnectionInitSql("");
        hikariConfig24.connectionTimeout = 0L;
        java.lang.String str35 = hikariConfig24.dataSourceClassName;
        hikariConfig24.setConnectionInitSql("HikariPool-16");
        hikariConfig24.setMaxLifetime((long) (short) 100);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer40 = null;
        hikariConfig24.connectionCustomizer = iConnectionCustomizer40;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource43 = hikariConfig42.getDataSource();
        hikariConfig42.setConnectionTestQuery("");
        hikariConfig42.setInitializationFailFast(false);
        hikariConfig42.catalog = "";
        javax.sql.DataSource dataSource50 = null;
        hikariConfig42.dataSource = dataSource50;
        javax.sql.DataSource dataSource52 = null;
        hikariConfig42.dataSource = dataSource52;
        int int54 = hikariConfig42.maxPoolSize;
        long long55 = hikariConfig42.getIdleTimeout();
        hikariConfig42.connectionTestQuery = "HikariPool-47";
        long long58 = hikariConfig42.maxLifetime;
        java.lang.String str59 = hikariConfig42.getDataSourceClassName();
        hikariConfig42.setUseInstrumentation(true);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig62.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer65 = hikariConfig62.connectionCustomizer;
        hikariConfig62.setDataSourceClassName("HikariPool-47");
        hikariConfig62.setDataSourceClassName("HikariPool-18");
        int int70 = hikariConfig62.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource72 = hikariConfig71.getDataSource();
        hikariConfig71.setConnectionTestQuery("");
        hikariConfig71.setInitializationFailFast(false);
        long long77 = hikariConfig71.getConnectionTimeout();
        java.util.Properties properties78 = hikariConfig71.dataSourceProperties;
        hikariConfig62.setDataSourceProperties(properties78);
        hikariConfig42.dataSourceProperties = properties78;
        hikariConfig24.dataSourceProperties = properties78;
        hikariConfig0.setDataSourceProperties(properties78);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 60 + "'", int54 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long58 + "' != '" + 32L + "'", long58 == 32L);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(iConnectionCustomizer65);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 60 + "'", int70 == 60);
        org.junit.Assert.assertNull(dataSource72);
// flaky:         org.junit.Assert.assertTrue("'" + long77 + "' != '" + 32L + "'", long77 == 32L);
        org.junit.Assert.assertNotNull(properties78);
    }

    @Test
    public void test18043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18043");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setAcquireRetryDelay(5000L);
        hikariConfig0.isAutoCommit = false;
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-515");
        java.lang.String str16 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-515" + "'", str16, "HikariPool-515");
    }

    @Test
    public void test18044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18044");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setJdbcUrl("HikariPool-173");
        hikariConfig0.acquireRetries = (short) 10;
        java.lang.String str9 = hikariConfig0.connectionTestQuery;
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.leakDetectionThreshold = (byte) -1;
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18045");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.jdbcUrl = "HikariPool-2029";
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test18046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18046");
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
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties47);
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
    }

    @Test
    public void test18047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18047");
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
        hikariConfig0.minPoolSize = (byte) 1;
        boolean boolean23 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test18048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18048");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        java.lang.String str2 = hikariConfig0.poolName;
        long long3 = hikariConfig0.getIdleTimeout();
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.transactionIsolationName = "HikariPool-3752";
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-43933" + "'", str2, "HikariPool-43933");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test18049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18049");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.transactionIsolation = 0;
        hikariConfig0.setAcquireIncrement(97);
        hikariConfig0.connectionTimeout = 1;
        java.lang.String str8 = hikariConfig0.connectionCustomizerClassName;
        int int9 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test18050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18050");
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
        javax.sql.DataSource dataSource19 = hikariConfig0.dataSource;
        hikariConfig0.isAutoCommit = true;
        int int22 = hikariConfig0.transactionIsolation;
        hikariConfig0.transactionIsolationName = "HikariPool-13598";
        int int25 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-150");
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test18051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18051");
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
        int int20 = hikariConfig0.transactionIsolation;
        hikariConfig0.acquireRetryDelay = (short) 1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test18052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18052");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        boolean boolean10 = hikariConfig0.isAutoCommit();
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setReadOnly(true);
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-208" + "'", str9, "HikariPool-208");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test18053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18053");
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
        java.lang.String str15 = hikariConfig0.connectionInitSql;
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-43940" + "'", str3, "HikariPool-43940");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18054");
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
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test18055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18055");
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
        long long29 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str26);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
    }

    @Test
    public void test18056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18056");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setLeakDetectionThreshold((long) (short) -1);
        int int12 = hikariConfig0.acquireIncrement;
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18057");
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
        hikariConfig0.dataSourceClassName = "HikariPool-2029";
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.connectionCustomizerClassName = "";
        boolean boolean25 = hikariConfig0.isIsolateInternalQueries();
        int int26 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-43945" + "'", str18, "HikariPool-43945");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test18058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18058");
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
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setMaximumPoolSize((int) 'a');
        hikariConfig21.isAutoCommit = false;
        hikariConfig21.setConnectionCustomizerClassName("HikariPool-16576");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test18059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18059");
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
        hikariConfig0.connectionTimeout = 3L;
        boolean boolean16 = hikariConfig0.isReadOnly();
        boolean boolean17 = hikariConfig0.isInitializationFailFast;
        java.lang.String str18 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18060");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        int int4 = hikariConfig0.getTransactionIsolation();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        java.lang.String str6 = hikariConfig0.connectionCustomizerClassName;
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setIsolateInternalQueries(true);
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
        java.lang.String str33 = hikariConfig10.getJdbcUrl();
        javax.sql.DataSource dataSource34 = hikariConfig10.dataSource;
        hikariConfig10.isJdbc4connectionTest = true;
        java.lang.String str37 = hikariConfig10.transactionIsolationName;
        hikariConfig10.setTransactionIsolation("");
        hikariConfig10.isRegisterMbeans = true;
        java.util.Properties properties42 = hikariConfig10.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties42;
        java.lang.String str44 = hikariConfig0.connectionTestQuery;
        hikariConfig0.poolName = "HikariPool-1651";
        boolean boolean47 = hikariConfig0.isAutoCommit();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-43950" + "'", str13, "HikariPool-43950");
        org.junit.Assert.assertNull(dataSource24);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(dataSource34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-48" + "'", str37, "HikariPool-48");
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test18061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18061");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-25";
        javax.sql.DataSource dataSource7 = hikariConfig0.dataSource;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.setInitializationFailFast(false);
        long long18 = hikariConfig12.getConnectionTimeout();
        java.util.Properties properties19 = hikariConfig12.dataSourceProperties;
        hikariConfig9.dataSourceProperties = properties19;
        hikariConfig9.maxLifetime = 750L;
        hikariConfig9.minPoolSize = (short) 100;
        hikariConfig9.jdbcUrl = "HikariPool-29";
        java.lang.String str27 = hikariConfig9.catalog;
        hikariConfig0.addDataSourceProperty("HikariPool-777", (java.lang.Object) hikariConfig9);
        hikariConfig9.isAutoCommit = false;
        hikariConfig9.maxPoolSize = (short) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(dataSource13);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test18062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18062");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        int int8 = hikariConfig0.getMaximumPoolSize();
        boolean boolean9 = hikariConfig0.isJdbc4connectionTest;
        int int10 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test18063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18063");
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
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18064");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.isRegisterMbeans = true;
        javax.sql.DataSource dataSource9 = hikariConfig0.dataSource;
        hikariConfig0.maxLifetime = 52L;
        hikariConfig0.connectionTimeout = 97;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test18065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18065");
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
        java.lang.String str27 = hikariConfig0.poolName;
        java.lang.String str28 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str29 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setLeakDetectionThreshold((long) 52);
        hikariConfig0.setConnectionTestQuery("HikariPool-8247");
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
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-43959" + "'", str27, "HikariPool-43959");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test18066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18066");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(false);
        int int4 = hikariConfig0.transactionIsolation;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource6 = hikariConfig5.getDataSource();
        hikariConfig5.setConnectionTestQuery("");
        int int9 = hikariConfig5.getTransactionIsolation();
        boolean boolean10 = hikariConfig5.isRegisterMbeans();
        hikariConfig5.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig5.setDataSource(dataSource13);
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
        java.util.Properties properties35 = hikariConfig23.dataSourceProperties;
        java.util.Properties properties36 = hikariConfig23.getDataSourceProperties();
        hikariConfig5.setDataSourceProperties(properties36);
        hikariConfig0.dataSourceProperties = properties36;
        hikariConfig0.idleTimeout = (short) 0;
        boolean boolean41 = hikariConfig0.isReadOnly();
        boolean boolean42 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(dataSource24);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test18067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18067");
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
        hikariConfig0.setConnectionInitSql("HikariPool-43080");
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18068");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        boolean boolean7 = hikariConfig0.isAutoCommit;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-606";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test18069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18069");
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
        hikariConfig0.setMinimumPoolSize(1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test18070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18070");
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
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        boolean boolean15 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18071");
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
        hikariConfig0.idleTimeout = 0L;
        java.lang.String str18 = hikariConfig0.catalog;
        hikariConfig0.setConnectionInitSql("HikariPool-557");
        hikariConfig0.maxLifetime = 97L;
        java.lang.String str23 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test18072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18072");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.acquireRetries = '#';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test18073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18073");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.jdbcUrl = "HikariPool-272";
        hikariConfig0.transactionIsolationName = "HikariPool-255";
        int int10 = hikariConfig0.maxPoolSize;
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18074");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer40 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setLeakDetectionThreshold((long) (short) 10);
        long long43 = hikariConfig0.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str46 = hikariConfig45.getConnectionInitSql();
        long long47 = hikariConfig45.getLeakDetectionThreshold();
        hikariConfig45.leakDetectionThreshold = (-1);
        long long50 = hikariConfig45.acquireRetryDelay;
        boolean boolean51 = hikariConfig45.isRegisterMbeans;
        hikariConfig45.setConnectionInitSql("");
        hikariConfig45.catalog = "HikariPool-101";
        int int56 = hikariConfig45.acquireIncrement;
        hikariConfig45.transactionIsolationName = "HikariPool-7835";
        hikariConfig0.addDataSourceProperty("HikariPool-22490", (java.lang.Object) hikariConfig45);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer40);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 100L + "'", long50 == 100L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test18075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18075");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.jdbcUrl = "HikariPool-963";
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.isInitializationFailFast = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18076");
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
        boolean boolean17 = hikariConfig0.isInitializationFailFast();
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource19 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test18077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18077");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-13803");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-13803 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18078");
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
        java.lang.String str29 = hikariConfig0.catalog;
        java.lang.String str30 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-43979" + "'", str15, "HikariPool-43979");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-43979" + "'", str30, "HikariPool-43979");
    }

    @Test
    public void test18079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18079");
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
        hikariConfig0.idleTimeout = 0L;
        hikariConfig0.maxLifetime = 52L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18080");
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
        hikariConfig0.setMaximumPoolSize((int) (short) 1);
        boolean boolean19 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test18081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18081");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setMaxLifetime((long) (short) -1);
        hikariConfig0.setConnectionTestQuery("HikariPool-79");
        java.lang.String str14 = hikariConfig0.jdbcUrl;
        hikariConfig0.leakDetectionThreshold = 60;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18082");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.setCatalog("");
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.connectionTimeout = 35;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test18083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18083");
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
        hikariConfig0.connectionTestQuery = "HikariPool-1141";
        javax.sql.DataSource dataSource35 = hikariConfig0.dataSource;
        hikariConfig0.acquireRetryDelay = (short) 1;
        boolean boolean38 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNull(dataSource35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test18084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18084");
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
        int int28 = hikariConfig0.acquireIncrement;
        hikariConfig0.acquireRetryDelay = (short) 10;
        hikariConfig0.acquireRetries = 'a';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test18085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18085");
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
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-43990" + "'", str3, "HikariPool-43990");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test18086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18086");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setDataSourceClassName("HikariPool-174");
        int int7 = hikariConfig0.transactionIsolation;
        hikariConfig0.setCatalog("HikariPool-100");
        hikariConfig0.setTransactionIsolation("HikariPool-220");
        long long12 = hikariConfig0.connectionTimeout;
        long long13 = hikariConfig0.maxLifetime;
        hikariConfig0.connectionTestQuery = "HikariPool-37154";
        boolean boolean16 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18087");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean8 = hikariConfig0.isAutoCommit();
        int int9 = hikariConfig0.acquireIncrement;
        int int10 = hikariConfig0.acquireRetries;
        hikariConfig0.setMaxLifetime((long) 60);
        hikariConfig0.acquireRetryDelay = (byte) 1;
        boolean boolean15 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18088");
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
        hikariConfig0.setUseInstrumentation(true);
        long long27 = hikariConfig0.getIdleTimeout();
        long long28 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
    }

    @Test
    public void test18089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18089");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        long long10 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.isAutoCommit = true;
        int int13 = hikariConfig0.acquireRetries;
        java.lang.String str14 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setAcquireRetries(0);
        boolean boolean17 = hikariConfig0.isInitializationFailFast;
        long long18 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str19 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18090");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        java.lang.String str3 = hikariConfig0.getPoolName();
        int int4 = hikariConfig0.maxPoolSize;
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.String str7 = hikariConfig0.catalog;
        hikariConfig0.maxLifetime = 'a';
        hikariConfig0.jdbcUrl = "HikariPool-31015";
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44003" + "'", str3, "HikariPool-44003");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18091");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        hikariConfig0.connectionTimeout = 'a';
        long long12 = hikariConfig0.getMaxLifetime();
        int int13 = hikariConfig0.transactionIsolation;
        long long14 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str15 = hikariConfig0.getCatalog();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str18 = hikariConfig17.getConnectionInitSql();
        long long19 = hikariConfig17.getLeakDetectionThreshold();
        hikariConfig17.leakDetectionThreshold = (-1);
        long long22 = hikariConfig17.acquireRetryDelay;
        boolean boolean23 = hikariConfig17.isRegisterMbeans;
        hikariConfig17.connectionTimeout = (short) 10;
        hikariConfig17.setPoolName("HikariPool-16");
        int int28 = hikariConfig17.acquireRetries;
        hikariConfig17.poolName = "HikariPool-1515";
        hikariConfig0.addDataSourceProperty("HikariPool-15670", (java.lang.Object) "HikariPool-1515");
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test18092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18092");
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
        hikariConfig0.setJdbcUrl("HikariPool-1129");
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.connectionInitSql = "HikariPool-436";
        hikariConfig0.setUseInstrumentation(false);
        long long27 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 750L + "'", long27 == 750L);
    }

    @Test
    public void test18093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18093");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        long long5 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test18094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18094");
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
        hikariConfig0.setIdleTimeout((long) (byte) -1);
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
        java.lang.String str26 = hikariConfig13.getCatalog();
        hikariConfig13.catalog = "HikariPool-426";
        hikariConfig13.setJdbcUrl("HikariPool-1183");
        java.util.Properties properties31 = hikariConfig13.dataSourceProperties;
        hikariConfig0.setDataSourceProperties(properties31);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test18095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18095");
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
        hikariConfig0.poolName = "HikariPool-1008";
        hikariConfig0.setLeakDetectionThreshold(35L);
        hikariConfig0.setCatalog("HikariPool-4241");
        java.lang.String str51 = hikariConfig0.connectionTestQuery;
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
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test18096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18096");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.acquireIncrement = (-1);
        hikariConfig0.acquireRetries = 100;
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        hikariConfig0.setIsolateInternalQueries(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer13;
        boolean boolean15 = hikariConfig0.isInitializationFailFast;
        long long16 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test18097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18097");
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
        java.lang.String str14 = hikariConfig0.getPoolName();
        hikariConfig0.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource18 = hikariConfig17.getDataSource();
        hikariConfig17.setConnectionTestQuery("");
        hikariConfig17.connectionCustomizerClassName = "";
        hikariConfig17.setConnectionCustomizerClassName("hi!");
        java.lang.String str25 = hikariConfig17.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = null;
        hikariConfig17.connectionCustomizer = iConnectionCustomizer26;
        hikariConfig17.jdbcUrl = "HikariPool-16";
        hikariConfig17.connectionInitSql = "HikariPool-38";
        int int32 = hikariConfig17.getAcquireRetries();
        boolean boolean33 = hikariConfig17.isRegisterMbeans;
        hikariConfig17.dataSourceClassName = "HikariPool-171";
        java.util.Properties properties36 = hikariConfig17.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig0.setDataSourceProperties(properties36);
        java.lang.String str39 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.connectionTimeout = (byte) 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-44018" + "'", str14, "HikariPool-44018");
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test18098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18098");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer19;
        hikariConfig0.isRegisterMbeans = true;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18099");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        hikariConfig0.acquireRetryDelay = 3L;
        hikariConfig0.poolName = "HikariPool-66";
        hikariConfig0.setCatalog("HikariPool-48");
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        long long12 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test18100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18100");
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
        hikariConfig0.acquireRetryDelay = (short) 100;
        java.lang.Class<?> wildcardClass17 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18101");
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
        hikariConfig0.isAutoCommit = false;
        java.lang.String str50 = hikariConfig0.connectionCustomizerClassName;
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
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "HikariPool-44025" + "'", str46, "HikariPool-44025");
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "HikariPool-295" + "'", str50, "HikariPool-295");
    }

    @Test
    public void test18102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18102");
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
        hikariConfig0.acquireRetryDelay = (byte) 100;
        long long41 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-2667";
        hikariConfig0.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
    }

    @Test
    public void test18103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18103");
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
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        hikariConfig0.setJdbcUrl("HikariPool-7348");
        java.util.Properties properties24 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-44031" + "'", str14, "HikariPool-44031");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test18104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18104");
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
        java.lang.String str24 = hikariConfig0.transactionIsolationName;
        javax.sql.DataSource dataSource25 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(dataSource25);
    }

    @Test
    public void test18105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18105");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        hikariConfig0.idleTimeout = 5000L;
        hikariConfig0.idleTimeout = 5000L;
        boolean boolean12 = hikariConfig0.isAutoCommit;
        java.lang.String str13 = hikariConfig0.transactionIsolationName;
        long long14 = hikariConfig0.getIdleTimeout();
        java.lang.String str15 = hikariConfig0.transactionIsolationName;
        java.lang.String str16 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18106");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int5 = hikariConfig0.acquireRetries;
        java.lang.String str6 = hikariConfig0.catalog;
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        java.lang.String str8 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test18107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18107");
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
        hikariConfig20.setMinimumPoolSize((int) (short) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test18108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18108");
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
        hikariConfig0.connectionTestQuery = "HikariPool-84";
        hikariConfig0.acquireIncrement = (short) 0;
        hikariConfig0.poolName = "HikariPool-142";
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setAcquireRetryDelay((long) 35);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test18109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18109");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        java.lang.String str5 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig7.setMaxLifetime((long) (short) 10);
        int int10 = hikariConfig7.getAcquireRetries();
        hikariConfig7.setInitializationFailFast(true);
        long long13 = hikariConfig7.getLeakDetectionThreshold();
        hikariConfig0.addDataSourceProperty("HikariPool-543", (java.lang.Object) long13);
        java.lang.String str15 = hikariConfig0.getCatalog();
        boolean boolean16 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test18110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18110");
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
        int int18 = hikariConfig0.getAcquireIncrement();
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
        javax.sql.DataSource dataSource42 = hikariConfig19.getDataSource();
        hikariConfig19.isReadOnly = true;
        hikariConfig19.acquireRetries = (byte) 1;
        hikariConfig19.setConnectionCustomizerClassName("HikariPool-859");
        long long49 = hikariConfig19.getAcquireRetryDelay();
        int int50 = hikariConfig19.minPoolSize;
        java.lang.String str51 = hikariConfig19.getConnectionTestQuery();
        hikariConfig19.setMaxLifetime((long) '4');
        java.lang.String str54 = hikariConfig19.getPoolName();
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource56 = hikariConfig55.getDataSource();
        hikariConfig55.setConnectionTestQuery("");
        hikariConfig55.connectionCustomizerClassName = "";
        hikariConfig55.setConnectionCustomizerClassName("hi!");
        java.lang.String str63 = hikariConfig55.getCatalog();
        int int64 = hikariConfig55.acquireRetries;
        hikariConfig55.isRegisterMbeans = true;
        hikariConfig55.isIsolateInternalQueries = true;
        int int69 = hikariConfig55.minPoolSize;
        boolean boolean70 = hikariConfig55.isReadOnly;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str72 = hikariConfig71.getConnectionInitSql();
        long long73 = hikariConfig71.getLeakDetectionThreshold();
        hikariConfig71.leakDetectionThreshold = (-1);
        long long76 = hikariConfig71.acquireRetryDelay;
        hikariConfig71.setLeakDetectionThreshold((long) (byte) -1);
        java.util.Properties properties79 = hikariConfig71.getDataSourceProperties();
        hikariConfig55.dataSourceProperties = properties79;
        hikariConfig19.dataSourceProperties = properties79;
        hikariConfig0.dataSourceProperties = properties79;
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNull(dataSource42);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 100L + "'", long49 == 100L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10 + "'", int50 == 10);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "HikariPool-44049" + "'", str54, "HikariPool-44049");
        org.junit.Assert.assertNull(dataSource56);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long76 + "' != '" + 100L + "'", long76 == 100L);
        org.junit.Assert.assertNotNull(properties79);
    }

    @Test
    public void test18111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18111");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement((int) ' ');
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaximumPoolSize((int) ' ');
        hikariConfig0.transactionIsolation = (short) 1;
        hikariConfig0.setMinimumPoolSize((int) 'a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test18112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18112");
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
        long long20 = hikariConfig0.acquireRetryDelay;
        long long21 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setMaximumPoolSize(35);
        java.util.Properties properties24 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test18113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18113");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-73");
        hikariConfig0.jdbcUrl = "HikariPool-132";
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.setJdbc4ConnectionTest(true);
        long long17 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) 'a');
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test18114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18114");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.minPoolSize = (byte) 100;
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.connectionInitSql = "HikariPool-894";
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.dataSource = dataSource10;
        hikariConfig0.dataSourceClassName = "HikariPool-3770";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18115");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-34155");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test18116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18116");
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
        int int16 = hikariConfig0.getMinimumPoolSize();
        long long17 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test18117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18117");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.transactionIsolation = 3;
        java.lang.String str12 = hikariConfig0.catalog;
        java.lang.String str13 = hikariConfig0.poolName;
        java.lang.String str14 = hikariConfig0.dataSourceClassName;
        hikariConfig0.minPoolSize = (short) -1;
        hikariConfig0.setAcquireRetryDelay((long) '#');
        hikariConfig0.dataSourceClassName = "HikariPool-24588";
        boolean boolean21 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-44063" + "'", str13, "HikariPool-44063");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test18118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18118");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.maxLifetime = 35L;
        boolean boolean5 = hikariConfig0.isAutoCommit;
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.isAutoCommit = true;
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        int int10 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.connectionCustomizerClassName = "";
        hikariConfig12.setConnectionCustomizerClassName("hi!");
        java.lang.String str20 = hikariConfig12.getCatalog();
        int int21 = hikariConfig12.acquireRetries;
        hikariConfig12.isRegisterMbeans = true;
        hikariConfig12.isIsolateInternalQueries = true;
        int int26 = hikariConfig12.minPoolSize;
        hikariConfig12.catalog = "";
        hikariConfig12.setAcquireRetryDelay(10L);
        hikariConfig0.addDataSourceProperty("HikariPool-1076", (java.lang.Object) hikariConfig12);
        hikariConfig0.setPoolName("HikariPool-42390");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test18119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18119");
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
        hikariConfig0.minPoolSize = 35;
        boolean boolean46 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.idleTimeout = (byte) 1;
        boolean boolean49 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-44068" + "'", str20, "HikariPool-44068");
        org.junit.Assert.assertNull(dataSource31);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertNotNull(properties37);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test18120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18120");
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
        hikariConfig0.setCatalog("HikariPool-1131");
        hikariConfig0.catalog = "HikariPool-130";
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        hikariConfig0.setConnectionInitSql("HikariPool-42678");
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test18121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18121");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setLeakDetectionThreshold((long) 10);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-150");
        hikariConfig0.acquireIncrement = 52;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test18122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18122");
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
        int int18 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.acquireRetryDelay = 60L;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test18123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18123");
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
        java.lang.String str16 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-838" + "'", str16, "HikariPool-838");
    }

    @Test
    public void test18124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18124");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        long long5 = hikariConfig0.idleTimeout;
        boolean boolean6 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setCatalog("HikariPool-661");
        boolean boolean9 = hikariConfig0.isReadOnly();
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries;
        long long11 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.minPoolSize = 52;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
    }

    @Test
    public void test18125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18125");
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
        boolean boolean15 = hikariConfig0.isReadOnly;
        long long16 = hikariConfig0.idleTimeout;
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.acquireRetryDelay = 32;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test18126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18126");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer7;
        hikariConfig0.setJdbcUrl("HikariPool-440");
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test18127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18127");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        long long10 = hikariConfig0.acquireRetryDelay;
        java.lang.String str11 = hikariConfig0.catalog;
        java.lang.String str12 = hikariConfig0.dataSourceClassName;
        hikariConfig0.connectionInitSql = "HikariPool-4205";
        int int15 = hikariConfig0.acquireIncrement;
        int int16 = hikariConfig0.maxPoolSize;
        java.lang.String str17 = hikariConfig0.transactionIsolationName;
        hikariConfig0.transactionIsolationName = "HikariPool-37762";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18128");
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
        java.lang.String str15 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setAcquireRetryDelay((long) 60);
        boolean boolean18 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str19 = hikariConfig0.getPoolName();
        boolean boolean20 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-44081" + "'", str19, "HikariPool-44081");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18129");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.util.Properties properties5 = hikariConfig0.dataSourceProperties;
        boolean boolean6 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.transactionIsolation = 35;
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        java.util.Properties properties10 = hikariConfig0.dataSourceProperties;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-31513");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-31513' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test18130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18130");
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
        hikariConfig0.jdbcUrl = "HikariPool-29";
        java.lang.String str18 = hikariConfig0.catalog;
        hikariConfig0.transactionIsolation = 1;
        hikariConfig0.acquireIncrement = (short) 0;
        hikariConfig0.setTransactionIsolation("HikariPool-1048");
        long long25 = hikariConfig0.connectionTimeout;
        boolean boolean26 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test18131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18131");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource11 = hikariConfig10.getDataSource();
        hikariConfig10.setConnectionTestQuery("");
        hikariConfig10.setInitializationFailFast(false);
        hikariConfig10.catalog = "";
        javax.sql.DataSource dataSource18 = null;
        hikariConfig10.dataSource = dataSource18;
        javax.sql.DataSource dataSource20 = null;
        hikariConfig10.dataSource = dataSource20;
        int int22 = hikariConfig10.maxPoolSize;
        long long23 = hikariConfig10.getIdleTimeout();
        hikariConfig10.setReadOnly(false);
        java.lang.String str26 = hikariConfig10.connectionTestQuery;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str28 = hikariConfig27.getConnectionInitSql();
        long long29 = hikariConfig27.getLeakDetectionThreshold();
        hikariConfig27.leakDetectionThreshold = (-1);
        int int32 = hikariConfig27.acquireIncrement;
        hikariConfig27.setInitializationFailFast(true);
        hikariConfig27.setMaximumPoolSize((int) '#');
        long long37 = hikariConfig27.getLeakDetectionThreshold();
        java.lang.String str38 = hikariConfig27.getConnectionInitSql();
        java.util.Properties properties39 = hikariConfig27.getDataSourceProperties();
        hikariConfig10.setDataSourceProperties(properties39);
        hikariConfig0.addDataSourceProperty("HikariPool-2091", (java.lang.Object) hikariConfig10);
        long long42 = hikariConfig10.idleTimeout;
        hikariConfig10.acquireIncrement = (byte) 100;
        int int45 = hikariConfig10.getTransactionIsolation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(properties39);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test18132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18132");
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
        java.lang.String str23 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-2800");
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
    }

    @Test
    public void test18133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18133");
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
        hikariConfig0.idleTimeout = 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18134");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        hikariConfig11.setMaxLifetime(35L);
        hikariConfig11.setAutoCommit(false);
        hikariConfig11.transactionIsolationName = "hi!";
        hikariConfig11.setInitializationFailFast(false);
        hikariConfig11.leakDetectionThreshold = 97L;
        long long23 = hikariConfig11.leakDetectionThreshold;
        hikariConfig0.addDataSourceProperty("HikariPool-470", (java.lang.Object) long23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource27 = hikariConfig26.getDataSource();
        hikariConfig26.setConnectionTestQuery("");
        hikariConfig26.connectionCustomizerClassName = "";
        hikariConfig26.setConnectionCustomizerClassName("hi!");
        java.lang.String str34 = hikariConfig26.getCatalog();
        java.util.Properties properties35 = hikariConfig26.dataSourceProperties;
        int int36 = hikariConfig26.minPoolSize;
        long long37 = hikariConfig26.getMaxLifetime();
        hikariConfig26.maxLifetime = 10L;
        hikariConfig26.connectionInitSql = "";
        hikariConfig26.isAutoCommit = false;
        hikariConfig26.isReadOnly = true;
        java.util.Properties properties46 = hikariConfig26.dataSourceProperties;
        long long47 = hikariConfig26.idleTimeout;
        hikariConfig0.addDataSourceProperty("HikariPool-1887", (java.lang.Object) hikariConfig26);
        hikariConfig0.setJdbcUrl("HikariPool-7536");
        int int51 = hikariConfig0.acquireIncrement;
        boolean boolean52 = hikariConfig0.isAutoCommit();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-30634");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-30634' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 97L + "'", long23 == 97L);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
        org.junit.Assert.assertNotNull(properties46);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test18135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18135");
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
        java.lang.String str14 = hikariConfig0.jdbcUrl;
        hikariConfig0.maxPoolSize = 10;
        int int17 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test18136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18136");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        hikariConfig0.acquireRetries = (byte) 100;
        hikariConfig0.leakDetectionThreshold = 0L;
        hikariConfig0.transactionIsolationName = "HikariPool-1067";
        long long13 = hikariConfig0.getConnectionTimeout();
        java.lang.String str14 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-44095" + "'", str14, "HikariPool-44095");
    }

    @Test
    public void test18137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18137");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setReadOnly(true);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setLeakDetectionThreshold((long) 32);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test18138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18138");
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
        int int25 = hikariConfig0.acquireRetries;
        hikariConfig0.isInitializationFailFast = true;
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test18139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18139");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        hikariConfig0.minPoolSize = 0;
        java.lang.String str12 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18140");
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
        hikariConfig0.setReadOnly(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test18141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18141");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        hikariConfig0.setJdbcUrl("HikariPool-47");
        boolean boolean13 = hikariConfig0.isAutoCommit;
        java.lang.String str14 = hikariConfig0.jdbcUrl;
        hikariConfig0.setConnectionTestQuery("HikariPool-3807");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-47" + "'", str14, "HikariPool-47");
    }

    @Test
    public void test18142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18142");
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
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setPoolName("HikariPool-239");
        int int46 = hikariConfig0.getMaximumPoolSize();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60 + "'", int46 == 60);
    }

    @Test
    public void test18143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18143");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.setIdleTimeout((long) 10);
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        hikariConfig0.transactionIsolation = (byte) -1;
        long long13 = hikariConfig0.acquireRetryDelay;
        java.util.Properties properties14 = hikariConfig0.dataSourceProperties;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test18144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18144");
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
        hikariConfig0.idleTimeout = 100L;
        boolean boolean44 = hikariConfig0.isReadOnly;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-18347");
        long long47 = hikariConfig0.getConnectionTimeout();
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
    }

    @Test
    public void test18145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18145");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        boolean boolean4 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.acquireRetryDelay = 750L;
        int int8 = hikariConfig0.acquireRetries;
        long long9 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str10 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 750L + "'", long9 == 750L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18146");
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
        boolean boolean15 = hikariConfig0.isReadOnly;
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.connectionTimeout = 3;
        hikariConfig0.idleTimeout = (byte) 1;
        long long21 = hikariConfig0.connectionTimeout;
        int int22 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test18147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18147");
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
        boolean boolean15 = hikariConfig0.isInitializationFailFast();
        long long16 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test18148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18148");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.setTransactionIsolation("HikariPool-350");
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource10 = hikariConfig9.getDataSource();
        hikariConfig9.setConnectionTestQuery("");
        hikariConfig9.setInitializationFailFast(false);
        long long15 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setJdbcUrl("HikariPool-47");
        hikariConfig9.isIsolateInternalQueries = false;
        hikariConfig9.setIsolateInternalQueries(true);
        hikariConfig9.setPoolName("HikariPool-127");
        hikariConfig9.setPoolName("HikariPool-135");
        hikariConfig9.acquireIncrement = 0;
        hikariConfig9.setMaxLifetime((long) (short) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource31 = hikariConfig30.getDataSource();
        hikariConfig30.setConnectionTestQuery("");
        hikariConfig30.setInitializationFailFast(false);
        hikariConfig30.catalog = "";
        javax.sql.DataSource dataSource38 = null;
        hikariConfig30.dataSource = dataSource38;
        javax.sql.DataSource dataSource40 = null;
        hikariConfig30.dataSource = dataSource40;
        int int42 = hikariConfig30.maxPoolSize;
        hikariConfig30.transactionIsolation = (short) 0;
        java.lang.String str45 = hikariConfig30.getConnectionInitSql();
        int int46 = hikariConfig30.getAcquireRetries();
        hikariConfig30.leakDetectionThreshold = 1L;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str50 = hikariConfig49.getConnectionInitSql();
        long long51 = hikariConfig49.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer52 = null;
        hikariConfig49.connectionCustomizer = iConnectionCustomizer52;
        boolean boolean54 = hikariConfig49.isIsolateInternalQueries();
        hikariConfig49.poolName = "HikariPool-47";
        java.lang.String str57 = hikariConfig49.getCatalog();
        long long58 = hikariConfig49.acquireRetryDelay;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str60 = hikariConfig59.getConnectionInitSql();
        long long61 = hikariConfig59.getLeakDetectionThreshold();
        int int62 = hikariConfig59.getMaximumPoolSize();
        java.util.Properties properties63 = hikariConfig59.getDataSourceProperties();
        hikariConfig49.setDataSourceProperties(properties63);
        hikariConfig30.setDataSourceProperties(properties63);
        hikariConfig9.setDataSourceProperties(properties63);
        hikariConfig0.dataSourceProperties = properties63;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(dataSource31);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 0L + "'", long51 == 0L);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(str57);
// flaky:         org.junit.Assert.assertTrue("'" + long58 + "' != '" + 100L + "'", long58 == 100L);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 0L + "'", long61 == 0L);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 60 + "'", int62 == 60);
        org.junit.Assert.assertNotNull(properties63);
    }

    @Test
    public void test18149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18149");
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
        hikariConfig16.isInitializationFailFast = true;
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
    }

    @Test
    public void test18150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18150");
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
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        int int20 = hikariConfig0.getTransactionIsolation();
        java.lang.String str21 = hikariConfig0.catalog;
        hikariConfig0.setCatalog("");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test18151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18151");
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
        boolean boolean18 = hikariConfig0.isRegisterMbeans;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-39510");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-39510' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18152");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        java.lang.String str6 = hikariConfig0.getPoolName();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str8 = hikariConfig7.getConnectionInitSql();
        long long9 = hikariConfig7.getLeakDetectionThreshold();
        hikariConfig7.leakDetectionThreshold = (-1);
        int int12 = hikariConfig7.acquireIncrement;
        hikariConfig7.setInitializationFailFast(true);
        boolean boolean15 = hikariConfig7.isAutoCommit();
        hikariConfig7.setTransactionIsolation("");
        long long18 = hikariConfig7.idleTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource20 = hikariConfig19.getDataSource();
        hikariConfig19.setConnectionTestQuery("");
        hikariConfig19.connectionCustomizerClassName = "";
        hikariConfig19.setConnectionCustomizerClassName("hi!");
        java.lang.String str27 = hikariConfig19.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = null;
        hikariConfig19.connectionCustomizer = iConnectionCustomizer28;
        hikariConfig19.setJdbcUrl("HikariPool-38");
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig32.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource36 = hikariConfig35.getDataSource();
        hikariConfig35.setConnectionTestQuery("");
        hikariConfig35.setInitializationFailFast(false);
        long long41 = hikariConfig35.getConnectionTimeout();
        java.util.Properties properties42 = hikariConfig35.dataSourceProperties;
        hikariConfig32.dataSourceProperties = properties42;
        hikariConfig19.setDataSourceProperties(properties42);
        hikariConfig7.dataSourceProperties = properties42;
        hikariConfig0.dataSourceProperties = properties42;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties42);
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-44125" + "'", str6, "HikariPool-44125");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(dataSource36);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 32L + "'", long41 == 32L);
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test18153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18153");
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
        java.lang.String str24 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test18154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18154");
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
        boolean boolean18 = hikariConfig0.isInitializationFailFast;
        boolean boolean19 = hikariConfig0.isReadOnly;
        hikariConfig0.isReadOnly = false;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18155");
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
        boolean boolean40 = hikariConfig0.isAutoCommit();
        java.lang.String str41 = hikariConfig0.poolName;
        hikariConfig0.setMaximumPoolSize(97);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer44 = hikariConfig0.connectionCustomizer;
        java.lang.String str45 = hikariConfig0.getJdbcUrl();
        java.lang.String str46 = hikariConfig0.dataSourceClassName;
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "HikariPool-44136" + "'", str41, "HikariPool-44136");
        org.junit.Assert.assertNull(iConnectionCustomizer44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test18156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18156");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig13.connectionCustomizer;
        hikariConfig13.setDataSourceClassName("HikariPool-47");
        hikariConfig13.setDataSourceClassName("HikariPool-18");
        hikariConfig13.transactionIsolation = 1;
        hikariConfig13.setConnectionTestQuery("HikariPool-86");
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str26 = hikariConfig25.getConnectionInitSql();
        hikariConfig25.setMaxLifetime(35L);
        hikariConfig25.setMaxLifetime(0L);
        hikariConfig25.transactionIsolation = 0;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig33.setMaxLifetime((long) (short) 10);
        hikariConfig33.setConnectionTimeout(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource39 = hikariConfig38.getDataSource();
        hikariConfig38.setConnectionTestQuery("");
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource43 = hikariConfig42.getDataSource();
        hikariConfig42.setConnectionTestQuery("");
        hikariConfig42.setInitializationFailFast(false);
        long long48 = hikariConfig42.getConnectionTimeout();
        java.util.Properties properties49 = hikariConfig42.dataSourceProperties;
        hikariConfig38.setDataSourceProperties(properties49);
        hikariConfig33.setDataSourceProperties(properties49);
        hikariConfig25.dataSourceProperties = properties49;
        hikariConfig13.setDataSourceProperties(properties49);
        hikariConfig0.dataSourceProperties = properties49;
        hikariConfig0.connectionTestQuery = "HikariPool-4302";
        hikariConfig0.setLeakDetectionThreshold((long) 32);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(dataSource39);
        org.junit.Assert.assertNull(dataSource43);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 32L + "'", long48 == 32L);
        org.junit.Assert.assertNotNull(properties49);
    }

    @Test
    public void test18157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18157");
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
        hikariConfig0.transactionIsolationName = "HikariPool-7465";
        hikariConfig0.idleTimeout = (byte) 1;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18158");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-16");
        boolean boolean7 = hikariConfig0.isReadOnly();
        int int8 = hikariConfig0.minPoolSize;
        int int9 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18159");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        long long10 = hikariConfig0.connectionTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource12 = hikariConfig11.getDataSource();
        hikariConfig11.setConnectionTestQuery("");
        hikariConfig11.connectionCustomizerClassName = "";
        hikariConfig11.setConnectionCustomizerClassName("hi!");
        java.lang.String str19 = hikariConfig11.getCatalog();
        java.util.Properties properties20 = hikariConfig11.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str23 = hikariConfig22.getConnectionInitSql();
        long long24 = hikariConfig22.getLeakDetectionThreshold();
        hikariConfig22.leakDetectionThreshold = (-1);
        long long27 = hikariConfig22.acquireRetryDelay;
        boolean boolean28 = hikariConfig22.isRegisterMbeans;
        hikariConfig11.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean28);
        java.util.Properties properties30 = hikariConfig11.getDataSourceProperties();
        hikariConfig11.transactionIsolationName = "HikariPool-18";
        java.util.Properties properties33 = hikariConfig11.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties33);
        int int35 = hikariConfig0.transactionIsolation;
        boolean boolean36 = hikariConfig0.isReadOnly;
        hikariConfig0.leakDetectionThreshold = (byte) 1;
        boolean boolean39 = hikariConfig0.isReadOnly();
        boolean boolean40 = hikariConfig0.isReadOnly;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test18160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18160");
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
        boolean boolean15 = hikariConfig0.isAutoCommit();
        hikariConfig0.jdbcUrl = "HikariPool-398";
        hikariConfig0.setAcquireRetries(100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test18161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18161");
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
        java.lang.String str25 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setConnectionTestQuery("HikariPool-34782");
        boolean boolean28 = hikariConfig0.isReadOnly();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44152" + "'", str3, "HikariPool-44152");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-48" + "'", str25, "HikariPool-48");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test18162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18162");
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
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setJdbcUrl("HikariPool-4522");
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-44155" + "'", str14, "HikariPool-44155");
    }

    @Test
    public void test18163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18163");
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
        hikariConfig0.setCatalog("HikariPool-2520");
        hikariConfig0.maxPoolSize = (short) 10;
        hikariConfig0.poolName = "HikariPool-445";
        boolean boolean25 = hikariConfig0.isAutoCommit;
        hikariConfig0.idleTimeout = 1L;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test18164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18164");
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
        long long26 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean27 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test18165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18165");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        int int9 = hikariConfig0.getMinimumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer10;
        boolean boolean12 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18166");
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
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        hikariConfig0.jdbcUrl = "HikariPool-31112";
        boolean boolean19 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18167");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.util.Properties properties5 = hikariConfig0.dataSourceProperties;
        boolean boolean6 = hikariConfig0.isInitializationFailFast;
        boolean boolean7 = hikariConfig0.isAutoCommit();
        hikariConfig0.setDataSourceClassName("HikariPool-6378");
        hikariConfig0.dataSourceClassName = "HikariPool-1576";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test18168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18168");
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
        hikariConfig0.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test18169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18169");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        hikariConfig0.idleTimeout = 97L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test18170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18170");
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
        hikariConfig0.minPoolSize = 'a';
        hikariConfig0.maxLifetime = 1L;
        int int26 = hikariConfig0.minPoolSize;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test18171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18171");
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
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test18172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18172");
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
        hikariConfig0.setLeakDetectionThreshold((long) 97);
        hikariConfig0.setReadOnly(false);
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
    }

    @Test
    public void test18173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18173");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionTimeout = 10L;
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setTransactionIsolation("HikariPool-73");
        java.lang.String str15 = hikariConfig0.connectionTestQuery;
        hikariConfig0.isInitializationFailFast = false;
        long long18 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
    }

    @Test
    public void test18174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18174");
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
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig0.getCatalog();
        hikariConfig0.connectionTimeout = (short) 0;
        hikariConfig0.maxPoolSize = (short) 0;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test18175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18175");
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
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str49 = hikariConfig48.getConnectionInitSql();
        long long50 = hikariConfig48.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer51 = null;
        hikariConfig48.connectionCustomizer = iConnectionCustomizer51;
        hikariConfig48.setReadOnly(true);
        int int55 = hikariConfig48.transactionIsolation;
        hikariConfig48.setMinimumPoolSize(0);
        hikariConfig48.jdbcUrl = "HikariPool-541";
        hikariConfig48.connectionTimeout = 60;
        hikariConfig48.acquireRetries = (byte) 0;
        hikariConfig0.addDataSourceProperty("HikariPool-5019", (java.lang.Object) hikariConfig48);
        javax.sql.DataSource dataSource65 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-44174" + "'", str20, "HikariPool-44174");
        org.junit.Assert.assertNull(dataSource31);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertNotNull(properties37);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(dataSource65);
    }

    @Test
    public void test18176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18176");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(iConnectionCustomizer24);
    }

    @Test
    public void test18177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18177");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.connectionTestQuery = "HikariPool-331";
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        boolean boolean9 = hikariConfig0.isInitializationFailFast;
        java.lang.String str10 = hikariConfig0.getPoolName();
        javax.sql.DataSource dataSource11 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-44181" + "'", str10, "HikariPool-44181");
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test18178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18178");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-26187");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-26187 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18179");
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
        hikariConfig7.transactionIsolation = (short) -1;
        long long23 = hikariConfig7.acquireRetryDelay;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test18180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18180");
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
        hikariConfig0.setConnectionInitSql("HikariPool-14504");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-44185" + "'", str29, "HikariPool-44185");
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-44185" + "'", str32, "HikariPool-44185");
    }

    @Test
    public void test18181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18181");
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
        hikariConfig0.isReadOnly = true;
        boolean boolean22 = hikariConfig0.isInitializationFailFast();
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.setInitializationFailFast(false);
        long long29 = hikariConfig23.getConnectionTimeout();
        hikariConfig23.setJdbcUrl("HikariPool-47");
        hikariConfig23.isIsolateInternalQueries = false;
        hikariConfig23.connectionTestQuery = "HikariPool-62";
        java.util.Properties properties36 = hikariConfig23.getDataSourceProperties();
        hikariConfig23.setConnectionTestQuery("HikariPool-2633");
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource40 = hikariConfig39.getDataSource();
        hikariConfig39.setConnectionTestQuery("");
        hikariConfig39.connectionCustomizerClassName = "";
        hikariConfig39.setConnectionCustomizerClassName("hi!");
        java.lang.String str47 = hikariConfig39.getCatalog();
        boolean boolean48 = hikariConfig39.isRegisterMbeans;
        hikariConfig39.setAcquireRetries(0);
        long long51 = hikariConfig39.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig52.setMaxLifetime((long) (short) 10);
        java.lang.String str55 = hikariConfig52.getPoolName();
        hikariConfig52.jdbcUrl = "";
        hikariConfig52.setMaxLifetime(0L);
        hikariConfig52.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig62.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource66 = hikariConfig65.getDataSource();
        hikariConfig65.setConnectionTestQuery("");
        hikariConfig65.setInitializationFailFast(false);
        long long71 = hikariConfig65.getConnectionTimeout();
        java.util.Properties properties72 = hikariConfig65.dataSourceProperties;
        hikariConfig62.dataSourceProperties = properties72;
        hikariConfig52.setDataSourceProperties(properties72);
        java.lang.String str75 = hikariConfig52.getJdbcUrl();
        javax.sql.DataSource dataSource76 = hikariConfig52.dataSource;
        java.util.Properties properties77 = hikariConfig52.dataSourceProperties;
        hikariConfig39.dataSourceProperties = properties77;
        com.zaxxer.hikari.HikariConfig hikariConfig79 = new com.zaxxer.hikari.HikariConfig(properties77);
        hikariConfig23.dataSourceProperties = properties77;
        hikariConfig0.setDataSourceProperties(properties77);
        long long82 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dataSource24);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(dataSource40);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str55 + "' != '" + "HikariPool-44191" + "'", str55, "HikariPool-44191");
        org.junit.Assert.assertNull(dataSource66);
// flaky:         org.junit.Assert.assertTrue("'" + long71 + "' != '" + 32L + "'", long71 == 32L);
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNull(dataSource76);
        org.junit.Assert.assertNotNull(properties77);
// flaky:         org.junit.Assert.assertTrue("'" + long82 + "' != '" + 32L + "'", long82 == 32L);
    }

    @Test
    public void test18182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18182");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        hikariConfig0.connectionTimeout = 'a';
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setJdbcUrl("HikariPool-383");
        int int15 = hikariConfig0.getTransactionIsolation();
        int int16 = hikariConfig0.maxPoolSize;
        hikariConfig0.setPoolName("HikariPool-41973");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test18183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18183");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.leakDetectionThreshold = 5000L;
        int int5 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) 0);
        hikariConfig0.jdbcUrl = "HikariPool-29099";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test18184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18184");
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
        java.lang.String str16 = hikariConfig0.transactionIsolationName;
        boolean boolean17 = hikariConfig0.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test18185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18185");
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
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.poolName = "";
        hikariConfig0.connectionTestQuery = "";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18186");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        boolean boolean12 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test18187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18187");
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
        java.lang.String str17 = hikariConfig11.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig11.connectionCustomizer;
        java.lang.String str19 = hikariConfig11.getConnectionInitSql();
        boolean boolean20 = hikariConfig11.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = null;
        hikariConfig11.connectionCustomizer = iConnectionCustomizer21;
        boolean boolean23 = hikariConfig11.isIsolateInternalQueries;
        javax.sql.DataSource dataSource24 = hikariConfig11.dataSource;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test18188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18188");
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
        java.lang.String str17 = hikariConfig0.getCatalog();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig0.dataSource = dataSource18;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-2172" + "'", str17, "HikariPool-2172");
    }

    @Test
    public void test18189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18189");
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
        long long20 = hikariConfig0.maxLifetime;
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test18190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18190");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getCatalog();
        java.lang.String str8 = hikariConfig0.connectionInitSql;
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.setUseInstrumentation(false);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource15 = hikariConfig14.getDataSource();
        hikariConfig14.setConnectionTestQuery("");
        hikariConfig14.connectionCustomizerClassName = "";
        hikariConfig14.setConnectionCustomizerClassName("hi!");
        java.lang.String str22 = hikariConfig14.getCatalog();
        java.util.Properties properties23 = hikariConfig14.dataSourceProperties;
        hikariConfig14.acquireRetryDelay = 35;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource27 = hikariConfig26.getDataSource();
        hikariConfig26.setConnectionTestQuery("");
        hikariConfig26.connectionCustomizerClassName = "";
        hikariConfig26.setConnectionCustomizerClassName("hi!");
        java.lang.String str34 = hikariConfig26.getCatalog();
        boolean boolean35 = hikariConfig26.isRegisterMbeans;
        hikariConfig26.setAcquireRetries(0);
        long long38 = hikariConfig26.getMaxLifetime();
        hikariConfig26.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource42 = hikariConfig41.getDataSource();
        hikariConfig41.setConnectionTestQuery("");
        hikariConfig41.setInitializationFailFast(false);
        hikariConfig41.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource50 = hikariConfig49.getDataSource();
        hikariConfig49.setConnectionTestQuery("");
        hikariConfig49.connectionCustomizerClassName = "";
        hikariConfig49.setConnectionCustomizerClassName("hi!");
        java.lang.String str57 = hikariConfig49.getCatalog();
        java.util.Properties properties58 = hikariConfig49.dataSourceProperties;
        hikariConfig41.dataSourceProperties = properties58;
        hikariConfig26.setDataSourceProperties(properties58);
        hikariConfig14.setDataSourceProperties(properties58);
        hikariConfig0.dataSourceProperties = properties58;
        hikariConfig0.setIdleTimeout(3L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-44206" + "'", str6, "HikariPool-44206");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertNull(dataSource50);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(properties58);
    }

    @Test
    public void test18191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18191");
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
        java.lang.String str18 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.isInitializationFailFast = false;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18192");
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
        hikariConfig0.connectionCustomizerClassName = "HikariPool-4648";
        java.lang.String str19 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-44212" + "'", str15, "HikariPool-44212");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-44212" + "'", str16, "HikariPool-44212");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18193");
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
        long long26 = hikariConfig0.getIdleTimeout();
        long long27 = hikariConfig0.getMaxLifetime();
        int int28 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.acquireRetryDelay = (byte) 10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
    }

    @Test
    public void test18194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18194");
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
        java.lang.String str15 = hikariConfig0.dataSourceClassName;
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        boolean boolean17 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test18195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18195");
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
        long long20 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
    }

    @Test
    public void test18196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18196");
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
        hikariConfig0.maxPoolSize = 1;
        hikariConfig0.transactionIsolationName = "HikariPool-21667";
        long long25 = hikariConfig0.connectionTimeout;
        hikariConfig0.maxPoolSize = (-1);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
    }

    @Test
    public void test18197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18197");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(true);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str7 = hikariConfig0.transactionIsolationName;
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.maxPoolSize = 60;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.dataSource = dataSource11;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-24497";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test18198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18198");
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
        hikariConfig0.setLeakDetectionThreshold(100L);
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setTransactionIsolation("HikariPool-36214");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18199");
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
        hikariConfig0.acquireIncrement = 60;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
    }

    @Test
    public void test18200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18200");
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
        long long44 = hikariConfig0.getLeakDetectionThreshold();
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
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
    }

    @Test
    public void test18201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18201");
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
        java.lang.String str24 = hikariConfig0.catalog;
        hikariConfig0.setConnectionInitSql("HikariPool-941");
        hikariConfig0.setConnectionInitSql("");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44227" + "'", str3, "HikariPool-44227");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test18202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18202");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.transactionIsolationName = "";
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig0.connectionCustomizer;
        boolean boolean12 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18203");
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
        hikariConfig0.transactionIsolation = 35;
        hikariConfig0.catalog = "HikariPool-12187";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test18204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18204");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-110");
        hikariConfig0.setMinimumPoolSize(3);
        hikariConfig0.acquireIncrement = 100;
        hikariConfig0.acquireRetryDelay = 35;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test18205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18205");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.util.Properties properties5 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig6.catalog = "HikariPool-516";
        java.lang.String str9 = hikariConfig6.getConnectionTestQuery();
        hikariConfig6.leakDetectionThreshold = (byte) 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18206");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean11 = hikariConfig0.isReadOnly;
        hikariConfig0.setConnectionTestQuery("HikariPool-9492");
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.setInitializationFailFast(false);
        hikariConfig15.catalog = "";
        javax.sql.DataSource dataSource23 = hikariConfig15.getDataSource();
        hikariConfig15.acquireRetries = (short) 10;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = hikariConfig15.connectionCustomizer;
        hikariConfig15.setAcquireRetryDelay((long) (short) 0);
        hikariConfig15.connectionInitSql = "HikariPool-1601";
        hikariConfig0.addDataSourceProperty("HikariPool-30086", (java.lang.Object) hikariConfig15);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNull(iConnectionCustomizer26);
    }

    @Test
    public void test18207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18207");
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
        java.lang.String str19 = hikariConfig0.dataSourceClassName;
        boolean boolean20 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-29" + "'", str18, "HikariPool-29");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-29" + "'", str19, "HikariPool-29");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18208");
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
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.setDataSource(dataSource16);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18209");
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
        long long15 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-44248" + "'", str13, "HikariPool-44248");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test18210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18210");
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
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str14 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setTransactionIsolation("HikariPool-318");
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        javax.sql.DataSource dataSource18 = hikariConfig0.getDataSource();
        int int19 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.leakDetectionThreshold = 0L;
        int int22 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setDataSourceClassName("HikariPool-15840");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
    }

    @Test
    public void test18211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18211");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.jdbcUrl = "HikariPool-208";
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.dataSourceClassName = "HikariPool-55";
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        hikariConfig10.acquireIncrement = 0;
        hikariConfig10.maxLifetime = 100;
        java.lang.String str16 = hikariConfig10.connectionInitSql;
        hikariConfig10.setTransactionIsolation("HikariPool-47");
        hikariConfig10.minPoolSize = 100;
        java.lang.String str21 = hikariConfig10.getDataSourceClassName();
        boolean boolean22 = hikariConfig10.isIsolateInternalQueries;
        javax.sql.DataSource dataSource23 = hikariConfig10.dataSource;
        hikariConfig10.isIsolateInternalQueries = true;
        java.util.Properties properties26 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties26;
        hikariConfig0.setMaxLifetime(35L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-141" + "'", str7, "HikariPool-141");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dataSource23);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test18212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18212");
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
        hikariConfig0.acquireIncrement = 97;
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.connectionInitSql = "HikariPool-2664";
        hikariConfig0.acquireIncrement = 3;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer49 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer49;
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
    }

    @Test
    public void test18213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18213");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        boolean boolean7 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str10 = hikariConfig0.connectionTestQuery;
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test18214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18214");
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
        hikariConfig0.setJdbc4ConnectionTest(false);
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
    }

    @Test
    public void test18215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18215");
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
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.acquireRetryDelay = 35L;
        java.util.Properties properties54 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(dataSource30);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(properties54);
    }

    @Test
    public void test18216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18216");
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
        hikariConfig0.leakDetectionThreshold = (short) 10;
        java.lang.String str15 = hikariConfig0.poolName;
        hikariConfig0.maxLifetime = '#';
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-44262" + "'", str15, "HikariPool-44262");
    }

    @Test
    public void test18217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18217");
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
        int int14 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test18218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18218");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        hikariConfig0.setTransactionIsolation("HikariPool-122");
        hikariConfig0.setCatalog("HikariPool-65");
        long long13 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIdleTimeout(0L);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test18219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18219");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.acquireRetryDelay = 97L;
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
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test18220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18220");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isReadOnly();
        java.lang.String str7 = hikariConfig0.connectionTestQuery;
        long long8 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test18221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18221");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.dataSourceClassName;
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMinimumPoolSize(35);
        int int11 = hikariConfig0.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test18222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18222");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        int int8 = hikariConfig0.getAcquireIncrement();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        long long12 = hikariConfig10.getLeakDetectionThreshold();
        int int13 = hikariConfig10.getMaximumPoolSize();
        long long14 = hikariConfig10.leakDetectionThreshold;
        hikariConfig10.catalog = "HikariPool-62";
        boolean boolean17 = hikariConfig10.isJdbc4connectionTest;
        int int18 = hikariConfig10.acquireRetries;
        hikariConfig10.transactionIsolationName = "HikariPool-66";
        hikariConfig10.setReadOnly(false);
        hikariConfig10.jdbcUrl = "HikariPool-90";
        boolean boolean25 = hikariConfig10.isReadOnly;
        boolean boolean26 = hikariConfig10.isReadOnly;
        hikariConfig10.setMaxLifetime(60L);
        java.lang.String str29 = hikariConfig10.connectionInitSql;
        hikariConfig0.addDataSourceProperty("HikariPool-16050", (java.lang.Object) hikariConfig10);
        int int31 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test18223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18223");
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
        int int22 = hikariConfig0.getTransactionIsolation();
        java.lang.String str23 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-44274" + "'", str21, "HikariPool-44274");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test18224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18224");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setCatalog("");
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setMaxLifetime(5000L);
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        java.lang.String str14 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-44275" + "'", str14, "HikariPool-44275");
    }

    @Test
    public void test18225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18225");
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
        long long15 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test18226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18226");
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
        hikariConfig0.setCatalog("");
        long long37 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 100L + "'", long37 == 100L);
    }

    @Test
    public void test18227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18227");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        hikariConfig0.acquireRetryDelay = 3L;
        hikariConfig0.setConnectionTestQuery("HikariPool-1141");
        hikariConfig0.isReadOnly = true;
        int int11 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test18228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18228");
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
        hikariConfig23.acquireRetries = 52;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44284" + "'", str3, "HikariPool-44284");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
    }

    @Test
    public void test18229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18229");
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
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.setAutoCommit(false);
        java.lang.String str50 = hikariConfig0.getConnectionCustomizerClassName();
        long long51 = hikariConfig0.maxLifetime;
        int int52 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "HikariPool-103" + "'", str50, "HikariPool-103");
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 60 + "'", int52 == 60);
    }

    @Test
    public void test18230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18230");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("HikariPool-47");
        boolean boolean9 = hikariConfig0.isAutoCommit;
        long long10 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test18231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18231");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        int int3 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setInitializationFailFast(true);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str7 = hikariConfig0.transactionIsolationName;
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-217");
        hikariConfig0.setJdbc4ConnectionTest(true);
        boolean boolean15 = hikariConfig0.isReadOnly();
        boolean boolean16 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test18232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18232");
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
        java.lang.String str15 = hikariConfig0.getConnectionInitSql();
        int int16 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        boolean boolean19 = hikariConfig0.isInitializationFailFast;
        boolean boolean20 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setIdleTimeout((long) (byte) -1);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18233");
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
        java.lang.String str28 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.isRegisterMbeans = false;
        boolean boolean31 = hikariConfig0.isAutoCommit;
        java.lang.String str32 = hikariConfig0.getPoolName();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44297" + "'", str3, "HikariPool-44297");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-44297" + "'", str32, "HikariPool-44297");
    }

    @Test
    public void test18234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18234");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-352");
        hikariConfig0.setDataSourceClassName("HikariPool-3200");
        java.lang.String str10 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-44300" + "'", str10, "HikariPool-44300");
    }

    @Test
    public void test18235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18235");
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
        hikariConfig13.maxLifetime = '4';
        int int18 = hikariConfig13.acquireRetries;
        boolean boolean19 = hikariConfig13.isAutoCommit;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test18236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18236");
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
        boolean boolean13 = hikariConfig0.isAutoCommit;
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        java.lang.String str15 = hikariConfig0.getCatalog();
        java.lang.String str16 = hikariConfig0.getJdbcUrl();
        hikariConfig0.idleTimeout = 3L;
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.dataSourceClassName = "HikariPool-3580";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18237");
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
        hikariConfig0.jdbcUrl = "HikariPool-838";
        boolean boolean20 = hikariConfig0.isInitializationFailFast;
        java.lang.String str21 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-44305" + "'", str21, "HikariPool-44305");
    }

    @Test
    public void test18238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18238");
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
        boolean boolean14 = hikariConfig0.isAutoCommit;
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18239");
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
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("HikariPool-32548");
        java.lang.String str19 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-1067" + "'", str19, "HikariPool-1067");
    }

    @Test
    public void test18240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18240");
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
        long long19 = hikariConfig0.getLeakDetectionThreshold();
        int int20 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionTestQuery("HikariPool-2991");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-3705");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-3705' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test18241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18241");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        hikariConfig0.transactionIsolation = 1;
        int int10 = hikariConfig0.maxPoolSize;
        hikariConfig0.isInitializationFailFast = true;
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
        int int14 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-574";
        java.lang.String str17 = hikariConfig0.getJdbcUrl();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18242");
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
        int int27 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setReadOnly(true);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test18243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18243");
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
        long long15 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setJdbcUrl("HikariPool-22278");
        long long18 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test18244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18244");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        hikariConfig0.isRegisterMbeans = false;
        long long9 = hikariConfig0.idleTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer10;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.getDataSource();
        hikariConfig13.setConnectionTestQuery("");
        hikariConfig13.setInitializationFailFast(false);
        hikariConfig13.catalog = "";
        javax.sql.DataSource dataSource21 = null;
        hikariConfig13.dataSource = dataSource21;
        javax.sql.DataSource dataSource23 = null;
        hikariConfig13.dataSource = dataSource23;
        int int25 = hikariConfig13.maxPoolSize;
        hikariConfig13.transactionIsolation = (short) 0;
        java.lang.String str28 = hikariConfig13.getConnectionInitSql();
        hikariConfig0.addDataSourceProperty("HikariPool-142", (java.lang.Object) hikariConfig13);
        hikariConfig0.dataSourceClassName = "HikariPool-959";
        java.lang.String str32 = hikariConfig0.getJdbcUrl();
        java.lang.String str33 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test18245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18245");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.poolName = "HikariPool-73";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test18246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18246");
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
        int int36 = hikariConfig0.acquireIncrement;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-44317" + "'", str15, "HikariPool-44317");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test18247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18247");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.setRegisterMbeans(false);
        long long13 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test18248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18248");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setCatalog("HikariPool-93");
        boolean boolean11 = hikariConfig0.isJdbc4connectionTest;
        long long12 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18249");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(0L);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAcquireRetries(100);
        java.lang.String str15 = hikariConfig0.dataSourceClassName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig0.connectionCustomizer;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.dataSource = dataSource17;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource21 = hikariConfig20.getDataSource();
        hikariConfig20.setConnectionTestQuery("");
        java.util.Properties properties24 = hikariConfig20.getDataSourceProperties();
        hikariConfig20.transactionIsolation = ' ';
        java.lang.String str27 = hikariConfig20.getCatalog();
        hikariConfig20.setConnectionTestQuery("HikariPool-3366");
        int int30 = hikariConfig20.getMinimumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-9584", (java.lang.Object) hikariConfig20);
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test18250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18250");
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
        long long17 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test18251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18251");
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
        hikariConfig0.connectionInitSql = "HikariPool-627";
        hikariConfig0.isIsolateInternalQueries = true;
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
    }

    @Test
    public void test18252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18252");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        long long6 = hikariConfig0.maxLifetime;
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setInitializationFailFast(true);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-44327" + "'", str7, "HikariPool-44327");
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test18253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18253");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setLeakDetectionThreshold((long) (byte) -1);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        java.lang.String str9 = hikariConfig0.connectionInitSql;
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        long long14 = hikariConfig12.getLeakDetectionThreshold();
        hikariConfig12.leakDetectionThreshold = (-1);
        long long17 = hikariConfig12.acquireRetryDelay;
        hikariConfig12.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig12.setIsolateInternalQueries(false);
        hikariConfig12.isReadOnly = false;
        hikariConfig12.setJdbcUrl("HikariPool-235");
        hikariConfig0.addDataSourceProperty("HikariPool-7522", (java.lang.Object) "HikariPool-235");
        hikariConfig0.setTransactionIsolation("HikariPool-37058");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test18254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18254");
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
        java.lang.String str25 = hikariConfig0.connectionTestQuery;
        java.lang.String str26 = hikariConfig0.connectionInitSql;
        long long27 = hikariConfig0.connectionTimeout;
        hikariConfig0.setConnectionInitSql("HikariPool-2884");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str26);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
    }

    @Test
    public void test18255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18255");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        long long4 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str5 = hikariConfig0.jdbcUrl;
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str9 = hikariConfig8.getConnectionInitSql();
        long long10 = hikariConfig8.getLeakDetectionThreshold();
        hikariConfig8.leakDetectionThreshold = (-1);
        long long13 = hikariConfig8.acquireRetryDelay;
        hikariConfig8.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig8.setIdleTimeout(100L);
        long long18 = hikariConfig8.idleTimeout;
        hikariConfig8.idleTimeout = 0L;
        hikariConfig8.setUseInstrumentation(true);
        hikariConfig0.addDataSourceProperty("HikariPool-3128", (java.lang.Object) hikariConfig8);
        hikariConfig8.acquireIncrement = 'a';
        int int26 = hikariConfig8.getTransactionIsolation();
        hikariConfig8.setMaximumPoolSize(1);
        hikariConfig8.connectionInitSql = "HikariPool-14378";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test18256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18256");
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
        hikariConfig0.setPoolName("HikariPool-182");
        java.lang.String str30 = hikariConfig0.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test18257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18257");
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
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.connectionTestQuery = "HikariPool-90";
        hikariConfig0.dataSourceClassName = "HikariPool-560";
        boolean boolean25 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.catalog = "HikariPool-1905";
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test18258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18258");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.maxLifetime;
        hikariConfig0.setIsolateInternalQueries(true);
        int int10 = hikariConfig0.getMinimumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test18259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18259");
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
        hikariConfig0.isJdbc4connectionTest = true;
        long long18 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str19 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-135" + "'", str19, "HikariPool-135");
    }

    @Test
    public void test18260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18260");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.poolName = "";
        int int8 = hikariConfig0.getTransactionIsolation();
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test18261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18261");
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
        hikariConfig0.connectionCustomizerClassName = "HikariPool-3550";
        boolean boolean20 = hikariConfig0.isIsolateInternalQueries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18262");
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
        hikariConfig0.connectionTestQuery = "HikariPool-188";
        java.lang.String str28 = hikariConfig0.getPoolName();
        boolean boolean29 = hikariConfig0.isAutoCommit;
        hikariConfig0.setAcquireIncrement((int) '#');
        hikariConfig0.leakDetectionThreshold = 35;
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
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-44346" + "'", str28, "HikariPool-44346");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test18263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18263");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        hikariConfig0.maxPoolSize = (byte) -1;
        hikariConfig0.setMaximumPoolSize((int) '4');
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(dataSource1);
    }

    @Test
    public void test18264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18264");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str9 = hikariConfig0.poolName;
        boolean boolean10 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-44349" + "'", str9, "HikariPool-44349");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18265");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        int int7 = hikariConfig0.getAcquireIncrement();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries;
        long long9 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test18266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18266");
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
        hikariConfig0.jdbcUrl = "HikariPool-29";
        java.lang.String str18 = hikariConfig0.catalog;
        hikariConfig0.setCatalog("HikariPool-3");
        hikariConfig0.setMinimumPoolSize(35);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18267");
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
        int int14 = hikariConfig0.acquireRetries;
        hikariConfig0.acquireRetryDelay = (short) 100;
        hikariConfig0.transactionIsolation = 35;
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test18268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18268");
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
        boolean boolean25 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionInitSql("HikariPool-2991");
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
        long long55 = hikariConfig29.leakDetectionThreshold;
        long long56 = hikariConfig29.getConnectionTimeout();
        hikariConfig0.addDataSourceProperty("HikariPool-1760", (java.lang.Object) long56);
        java.util.Properties properties58 = hikariConfig0.dataSourceProperties;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44354" + "'", str3, "HikariPool-44354");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-44357" + "'", str32, "HikariPool-44357");
        org.junit.Assert.assertNull(dataSource43);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 32L + "'", long48 == 32L);
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(dataSource53);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 32L + "'", long56 == 32L);
        org.junit.Assert.assertNotNull(properties58);
    }

    @Test
    public void test18269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18269");
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
        java.lang.String str14 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18270");
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
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.dataSourceClassName = "HikariPool-43841";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(dataSource18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test18271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18271");
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
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.setAcquireRetryDelay(32L);
        java.lang.String str22 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-44362" + "'", str15, "HikariPool-44362");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18272");
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
        int int19 = hikariConfig0.acquireIncrement;
        long long20 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test18273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18273");
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
        hikariConfig0.transactionIsolation = 100;
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        java.lang.String str20 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18274");
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
        java.lang.String str25 = hikariConfig0.jdbcUrl;
        boolean boolean26 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test18275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18275");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        hikariConfig0.maxPoolSize = (short) 100;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        java.lang.String str10 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.connectionTimeout = (short) 1;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer13;
        hikariConfig0.setAcquireRetryDelay((long) 100);
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18276");
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
        long long13 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test18277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18277");
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
        long long16 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setIdleTimeout((long) 35);
        boolean boolean19 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18278");
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
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.minPoolSize = 35;
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setMinimumPoolSize((int) '#');
        long long21 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.poolName = "HikariPool-1386";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test18279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18279");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        hikariConfig0.jdbcUrl = "HikariPool-1037";
        boolean boolean12 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-44373" + "'", str6, "HikariPool-44373");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18280");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        hikariConfig0.transactionIsolation = 1;
        int int10 = hikariConfig0.maxPoolSize;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-495");
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource15 = hikariConfig14.getDataSource();
        hikariConfig14.setConnectionTestQuery("");
        hikariConfig14.setInitializationFailFast(false);
        hikariConfig14.catalog = "";
        javax.sql.DataSource dataSource22 = null;
        hikariConfig14.dataSource = dataSource22;
        boolean boolean24 = hikariConfig14.isRegisterMbeans();
        boolean boolean25 = hikariConfig14.isJdbc4ConnectionTest();
        hikariConfig14.maxLifetime = 35;
        hikariConfig14.setConnectionTestQuery("HikariPool-932");
        hikariConfig14.setIdleTimeout(5000L);
        java.lang.String str32 = hikariConfig14.poolName;
        int int33 = hikariConfig14.getAcquireRetries();
        hikariConfig14.setAcquireRetries((int) (short) 100);
        hikariConfig14.setMinimumPoolSize(0);
        long long38 = hikariConfig14.getConnectionTimeout();
        hikariConfig0.addDataSourceProperty("HikariPool-30400", (java.lang.Object) long38);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HikariPool-44376" + "'", str32, "HikariPool-44376");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 32L + "'", long38 == 32L);
    }

    @Test
    public void test18281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18281");
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
        hikariConfig0.jdbcUrl = "HikariPool-1155";
        java.lang.String str47 = hikariConfig0.connectionInitSql;
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
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test18282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18282");
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
        boolean boolean17 = hikariConfig0.isReadOnly();
        hikariConfig0.setMinimumPoolSize(0);
        int int20 = hikariConfig0.transactionIsolation;
        hikariConfig0.setDataSourceClassName("HikariPool-16049");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test18283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18283");
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
        boolean boolean29 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setPoolName("HikariPool-1196");
        long long32 = hikariConfig0.leakDetectionThreshold;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44381" + "'", str3, "HikariPool-44381");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test18284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18284");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str5 = hikariConfig4.getConnectionInitSql();
        long long6 = hikariConfig4.getLeakDetectionThreshold();
        hikariConfig4.leakDetectionThreshold = (-1);
        long long9 = hikariConfig4.acquireRetryDelay;
        hikariConfig4.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig4.setIdleTimeout(100L);
        long long14 = hikariConfig4.idleTimeout;
        hikariConfig4.idleTimeout = 0L;
        hikariConfig4.isIsolateInternalQueries = true;
        hikariConfig4.setMinimumPoolSize((int) (byte) 100);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig4.connectionCustomizer;
        hikariConfig4.connectionTestQuery = "HikariPool-283";
        boolean boolean24 = hikariConfig4.isAutoCommit;
        java.lang.String str25 = hikariConfig4.getJdbcUrl();
        java.lang.String str26 = hikariConfig4.catalog;
        java.util.Properties properties27 = hikariConfig4.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties27;
        hikariConfig0.isRegisterMbeans = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test18285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18285");
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
        boolean boolean41 = hikariConfig0.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer42 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer42;
        java.lang.String str44 = hikariConfig0.getConnectionInitSql();
        long long45 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.isReadOnly = true;
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str44);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 100L + "'", long45 == 100L);
    }

    @Test
    public void test18286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18286");
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
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource18 = hikariConfig17.getDataSource();
        hikariConfig17.setConnectionTestQuery("");
        hikariConfig17.connectionCustomizerClassName = "";
        hikariConfig17.setConnectionCustomizerClassName("hi!");
        int int25 = hikariConfig17.acquireIncrement;
        int int26 = hikariConfig17.minPoolSize;
        hikariConfig17.poolName = "HikariPool-132";
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str30 = hikariConfig29.getConnectionInitSql();
        long long31 = hikariConfig29.getLeakDetectionThreshold();
        int int32 = hikariConfig29.getMaximumPoolSize();
        long long33 = hikariConfig29.getIdleTimeout();
        int int34 = hikariConfig29.maxPoolSize;
        java.lang.String str35 = hikariConfig29.getConnectionCustomizerClassName();
        java.util.Properties properties36 = hikariConfig29.dataSourceProperties;
        hikariConfig17.setDataSourceProperties(properties36);
        hikariConfig0.dataSourceProperties = properties36;
        boolean boolean39 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean40 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str41 = hikariConfig0.getConnectionInitSql();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test18287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18287");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-62");
        hikariConfig0.acquireRetryDelay = 0L;
        hikariConfig0.connectionTimeout = 'a';
        hikariConfig0.minPoolSize = (byte) -1;
        hikariConfig0.connectionTestQuery = "HikariPool-442";
        hikariConfig0.connectionTimeout = 1L;
        hikariConfig0.setAcquireIncrement((int) ' ');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test18288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18288");
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
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setMaxLifetime((long) (short) 0);
        int int38 = hikariConfig0.getAcquireIncrement();
        boolean boolean39 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setUseInstrumentation(true);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test18289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18289");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.dataSource = dataSource11;
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18290");
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
        hikariConfig0.acquireRetries = (-1);
        java.lang.String str48 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test18291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18291");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        long long11 = hikariConfig0.getIdleTimeout();
        int int12 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setCatalog("HikariPool-240");
        int int15 = hikariConfig0.getTransactionIsolation();
        int int16 = hikariConfig0.transactionIsolation;
        javax.sql.DataSource dataSource17 = hikariConfig0.dataSource;
        hikariConfig0.isRegisterMbeans = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test18292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18292");
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
        hikariConfig23.setConnectionTimeout(0L);
        java.lang.String str28 = hikariConfig23.getConnectionCustomizerClassName();
        boolean boolean29 = hikariConfig23.isReadOnly();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44401" + "'", str3, "HikariPool-44401");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test18293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18293");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.catalog = "HikariPool-948";
        int int5 = hikariConfig0.getMinimumPoolSize();
        javax.sql.DataSource dataSource6 = hikariConfig0.dataSource;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setLeakDetectionThreshold(100L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
    }

    @Test
    public void test18294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18294");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.getTransactionIsolation();
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("HikariPool-1608");
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean16 = hikariConfig0.isAutoCommit();
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.dataSource = dataSource17;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test18295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18295");
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
        int int45 = hikariConfig0.getMaximumPoolSize();
        int int46 = hikariConfig0.acquireRetries;
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 60 + "'", int45 == 60);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
    }

    @Test
    public void test18296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18296");
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
        boolean boolean31 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test18297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18297");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.jdbcUrl = "HikariPool-16";
        hikariConfig0.isRegisterMbeans = false;
        int int10 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.catalog = "HikariPool-47";
        long long13 = hikariConfig0.getLeakDetectionThreshold();
        java.util.Properties properties14 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean17 = hikariConfig16.isAutoCommit();
        int int18 = hikariConfig16.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test18298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18298");
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
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        boolean boolean17 = hikariConfig0.isReadOnly();
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-62" + "'", str16, "HikariPool-62");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18299");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement((int) ' ');
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaximumPoolSize((int) ' ');
        hikariConfig0.maxLifetime = 0L;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig0.setDataSource(dataSource15);
        hikariConfig0.setJdbcUrl("HikariPool-32823");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test18300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18300");
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
        java.util.Properties properties47 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig48.setIsolateInternalQueries(false);
        hikariConfig48.setJdbcUrl("HikariPool-3733");
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
        org.junit.Assert.assertNotNull(properties47);
    }

    @Test
    public void test18301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18301");
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
        hikariConfig0.setInitializationFailFast(true);
        int int45 = hikariConfig0.transactionIsolation;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer46 = hikariConfig0.connectionCustomizer;
        long long47 = hikariConfig0.maxLifetime;
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer46);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
    }

    @Test
    public void test18302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18302");
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
        boolean boolean17 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18303");
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
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries;
        int int17 = hikariConfig0.getMinimumPoolSize();
        boolean boolean18 = hikariConfig0.isRegisterMbeans;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18304");
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
        hikariConfig0.dataSourceClassName = "HikariPool-773";
        hikariConfig0.setCatalog("HikariPool-31731");
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
    public void test18305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18305");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setPoolName("HikariPool-149");
        java.lang.String str10 = hikariConfig0.poolName;
        hikariConfig0.isReadOnly = false;
        hikariConfig0.setIdleTimeout(3L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-149" + "'", str10, "HikariPool-149");
    }

    @Test
    public void test18306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18306");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.maxLifetime = 97L;
        long long12 = hikariConfig0.maxLifetime;
        boolean boolean13 = hikariConfig0.isInitializationFailFast();
        long long14 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setPoolName("HikariPool-7777");
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test18307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18307");
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
        hikariConfig0.maxLifetime = 100;
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
    }

    @Test
    public void test18308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18308");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        int int4 = hikariConfig0.getTransactionIsolation();
        java.lang.String str5 = hikariConfig0.connectionTestQuery;
        int int6 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test18309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18309");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-73");
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        java.lang.String str12 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.isReadOnly = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-73" + "'", str12, "HikariPool-73");
    }

    @Test
    public void test18310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18310");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        boolean boolean7 = hikariConfig0.isAutoCommit();
        int int8 = hikariConfig0.transactionIsolation;
        hikariConfig0.minPoolSize = 0;
        hikariConfig0.transactionIsolation = 52;
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test18311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18311");
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
        long long22 = hikariConfig0.maxLifetime;
        hikariConfig0.setConnectionTimeout((long) 100);
        long long25 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test18312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18312");
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
        hikariConfig0.setIdleTimeout(2147483647L);
        hikariConfig0.setAcquireRetries((int) '4');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test18313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18313");
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
        java.lang.String str14 = hikariConfig0.connectionInitSql;
        boolean boolean15 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setPoolName("HikariPool-1305");
        long long18 = hikariConfig0.getIdleTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNull(iConnectionCustomizer19);
    }

    @Test
    public void test18314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18314");
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
            hikariConfig0.setMinimumPoolSize((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
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
    public void test18315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18315");
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
        hikariConfig0.transactionIsolationName = "HikariPool-1050";
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource19 = hikariConfig18.getDataSource();
        hikariConfig18.setConnectionTestQuery("");
        hikariConfig18.setInitializationFailFast(false);
        hikariConfig18.catalog = "";
        javax.sql.DataSource dataSource26 = null;
        hikariConfig18.dataSource = dataSource26;
        boolean boolean28 = hikariConfig18.isRegisterMbeans();
        boolean boolean29 = hikariConfig18.isJdbc4ConnectionTest();
        hikariConfig18.maxLifetime = 35;
        hikariConfig18.setConnectionCustomizerClassName("HikariPool-84");
        boolean boolean34 = hikariConfig18.isAutoCommit;
        hikariConfig18.poolName = "HikariPool-132";
        hikariConfig0.addDataSourceProperty("HikariPool-2694", (java.lang.Object) "HikariPool-132");
        hikariConfig0.catalog = "HikariPool-2145";
        int int40 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-44446" + "'", str13, "HikariPool-44446");
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
    }

    @Test
    public void test18316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18316");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        long long4 = hikariConfig0.leakDetectionThreshold;
        java.lang.String str5 = hikariConfig0.jdbcUrl;
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.minPoolSize = 97;
        int int9 = hikariConfig0.minPoolSize;
        hikariConfig0.maxPoolSize = (short) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test18317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18317");
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
        hikariConfig0.setAcquireRetryDelay((long) 35);
        int int28 = hikariConfig0.getMinimumPoolSize();
        boolean boolean29 = hikariConfig0.isRegisterMbeans();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource17);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test18318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18318");
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
        java.lang.String str39 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test18319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18319");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement((int) ' ');
        hikariConfig0.setDataSourceClassName("HikariPool-686");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer10;
        int int12 = hikariConfig0.getAcquireRetries();
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        hikariConfig0.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18320");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        java.lang.String str3 = hikariConfig0.getPoolName();
        int int4 = hikariConfig0.maxPoolSize;
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-5786");
        long long10 = hikariConfig0.getIdleTimeout();
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44456" + "'", str3, "HikariPool-44456");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18321");
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
        java.lang.String str15 = hikariConfig0.getCatalog();
        boolean boolean16 = hikariConfig0.isIsolateInternalQueries;
        long long17 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test18322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18322");
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
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.setAcquireIncrement((int) (short) 10);
        hikariConfig0.setCatalog("HikariPool-28474");
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test18323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18323");
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
        hikariConfig0.isIsolateInternalQueries = false;
        hikariConfig0.maxLifetime = 'a';
        long long20 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test18324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18324");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setReadOnly(true);
        long long7 = hikariConfig0.getIdleTimeout();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        int int9 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test18325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18325");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setTransactionIsolation("HikariPool-1141");
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setLeakDetectionThreshold(750L);
        hikariConfig0.isInitializationFailFast = true;
        int int17 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setAcquireRetries((int) (byte) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test18326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18326");
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
        long long16 = hikariConfig0.getMaxLifetime();
        long long17 = hikariConfig0.getIdleTimeout();
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test18327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18327");
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
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.dataSource = dataSource17;
        boolean boolean19 = hikariConfig0.isReadOnly();
        hikariConfig0.connectionTimeout = 0L;
        boolean boolean22 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-44474" + "'", str14, "HikariPool-44474");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test18328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18328");
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
        boolean boolean22 = hikariConfig8.isReadOnly;
        hikariConfig8.setTransactionIsolation("HikariPool-80");
        boolean boolean25 = hikariConfig8.isAutoCommit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(dataSource9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test18329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18329");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.setIdleTimeout((long) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str10 = hikariConfig9.getConnectionInitSql();
        hikariConfig9.acquireIncrement = 0;
        hikariConfig9.maxLifetime = 100;
        long long15 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setConnectionTestQuery("HikariPool-16");
        int int18 = hikariConfig9.acquireRetries;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource20 = hikariConfig19.getDataSource();
        hikariConfig19.setConnectionTestQuery("");
        hikariConfig19.setInitializationFailFast(false);
        java.lang.String str25 = hikariConfig19.getConnectionInitSql();
        hikariConfig19.setReadOnly(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig19.setDataSource(dataSource28);
        java.util.Properties properties30 = hikariConfig19.getDataSourceProperties();
        hikariConfig9.dataSourceProperties = properties30;
        hikariConfig0.setDataSourceProperties(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig35.setConnectionCustomizerClassName("HikariPool-37068");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test18330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18330");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean6 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        hikariConfig0.setAcquireIncrement(1);
        int int10 = hikariConfig0.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test18331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18331");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.isInitializationFailFast = true;
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setDataSourceClassName("HikariPool-40857");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test18332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18332");
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
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str17 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setPoolName("HikariPool-4397");
        long long20 = hikariConfig0.connectionTimeout;
        hikariConfig0.setReadOnly(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
    }

    @Test
    public void test18333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18333");
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
        long long25 = hikariConfig0.connectionTimeout;
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        boolean boolean28 = hikariConfig0.isAutoCommit;
        javax.sql.DataSource dataSource29 = hikariConfig0.getDataSource();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(dataSource29);
    }

    @Test
    public void test18334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18334");
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
        java.lang.String str26 = hikariConfig0.getJdbcUrl();
        int int27 = hikariConfig0.acquireIncrement;
        boolean boolean28 = hikariConfig0.isInitializationFailFast();
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
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test18335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18335");
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
        long long15 = hikariConfig0.idleTimeout;
        hikariConfig0.setTransactionIsolation("HikariPool-17621");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test18336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18336");
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
        java.lang.String str27 = hikariConfig0.poolName;
        java.lang.String str28 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str29 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setIsolateInternalQueries(false);
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
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-44492" + "'", str27, "HikariPool-44492");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test18337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18337");
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
        hikariConfig0.connectionTestQuery = "HikariPool-59";
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.isIsolateInternalQueries = true;
        long long22 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
    }

    @Test
    public void test18338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18338");
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
        java.lang.String str14 = hikariConfig0.connectionInitSql;
        long long15 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test18339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18339");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionTimeout(5000L);
        hikariConfig0.acquireIncrement = 35;
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str7 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18340");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        java.lang.String str2 = hikariConfig0.poolName;
        int int3 = hikariConfig0.getAcquireIncrement();
        int int4 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-44497" + "'", str2, "HikariPool-44497");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
    }

    @Test
    public void test18341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18341");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        int int4 = hikariConfig0.getTransactionIsolation();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.acquireRetryDelay = 1;
        hikariConfig0.setJdbcUrl("HikariPool-110");
        boolean boolean10 = hikariConfig0.isInitializationFailFast;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig0.connectionCustomizer;
        java.lang.String str12 = hikariConfig0.jdbcUrl;
        hikariConfig0.connectionInitSql = "HikariPool-98";
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-110" + "'", str12, "HikariPool-110");
    }

    @Test
    public void test18342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18342");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-30129");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-30129 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18343");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        int int8 = hikariConfig0.maxPoolSize;
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig13.connectionCustomizer = iConnectionCustomizer14;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test18344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18344");
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
        long long13 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test18345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18345");
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
        java.util.Properties properties13 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test18346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18346");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        java.lang.String str2 = hikariConfig0.poolName;
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.leakDetectionThreshold = 100;
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HikariPool-44508" + "'", str2, "HikariPool-44508");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test18347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18347");
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
        int int24 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test18348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18348");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.dataSourceClassName = "HikariPool-2385";
        java.util.Properties properties11 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test18349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18349");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.catalog = "HikariPool-62";
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        long long8 = hikariConfig0.idleTimeout;
        hikariConfig0.setMaxLifetime(10L);
        java.lang.String str11 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18350");
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
        boolean boolean15 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.minPoolSize = 35;
        boolean boolean18 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setMinimumPoolSize((int) '#');
        int int21 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test18351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18351");
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
        java.lang.String str81 = hikariConfig0.connectionInitSql;
        boolean boolean82 = hikariConfig0.isAutoCommit();
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
    public void test18352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18352");
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
        int int14 = hikariConfig0.getAcquireRetries();
        boolean boolean15 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.poolName = "HikariPool-9693";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-44518" + "'", str12, "HikariPool-44518");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18353");
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
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str18 = hikariConfig0.catalog;
        java.lang.String str19 = hikariConfig0.poolName;
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str22 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-44519" + "'", str19, "HikariPool-44519");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18354");
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
        boolean boolean24 = hikariConfig0.isIsolateInternalQueries();
        long long25 = hikariConfig0.idleTimeout;
        hikariConfig0.setUseInstrumentation(true);
        boolean boolean28 = hikariConfig0.isRegisterMbeans();
        boolean boolean29 = hikariConfig0.isAutoCommit;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test18355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18355");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setCatalog("HikariPool-220");
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44521" + "'", str3, "HikariPool-44521");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test18356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18356");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setReadOnly(false);
        java.lang.String str6 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setMaxLifetime((-1L));
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test18357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18357");
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
        boolean boolean26 = hikariConfig0.isInitializationFailFast;
        int int27 = hikariConfig0.acquireIncrement;
        hikariConfig0.maxLifetime = 0L;
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test18358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18358");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        java.lang.String str3 = hikariConfig0.getPoolName();
        hikariConfig0.jdbcUrl = "";
        int int6 = hikariConfig0.acquireIncrement;
        hikariConfig0.setPoolName("HikariPool-236");
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        boolean boolean10 = hikariConfig0.isInitializationFailFast;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44527" + "'", str3, "HikariPool-44527");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18359");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.leakDetectionThreshold = 5000L;
        long long5 = hikariConfig0.idleTimeout;
        int int6 = hikariConfig0.getAcquireRetries();
        hikariConfig0.isReadOnly = false;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource10 = hikariConfig9.getDataSource();
        hikariConfig9.setConnectionTestQuery("");
        hikariConfig9.setInitializationFailFast(false);
        long long15 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setJdbcUrl("HikariPool-47");
        hikariConfig9.isIsolateInternalQueries = false;
        hikariConfig9.setIsolateInternalQueries(true);
        hikariConfig9.setPoolName("HikariPool-127");
        hikariConfig9.setPoolName("HikariPool-135");
        boolean boolean26 = hikariConfig9.isInitializationFailFast();
        java.lang.String str27 = hikariConfig9.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource29 = hikariConfig28.getDataSource();
        hikariConfig28.setConnectionTestQuery("");
        hikariConfig28.connectionCustomizerClassName = "";
        hikariConfig28.setConnectionCustomizerClassName("hi!");
        java.lang.String str36 = hikariConfig28.getCatalog();
        java.util.Properties properties37 = hikariConfig28.dataSourceProperties;
        hikariConfig28.acquireRetryDelay = 35;
        long long40 = hikariConfig28.idleTimeout;
        java.util.Properties properties41 = hikariConfig28.dataSourceProperties;
        hikariConfig9.dataSourceProperties = properties41;
        hikariConfig0.setDataSourceProperties(properties41);
        boolean boolean44 = hikariConfig0.isReadOnly();
        hikariConfig0.isIsolateInternalQueries = true;
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(dataSource10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties37);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-1L) + "'", long40 == (-1L));
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test18360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18360");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.connectionCustomizerClassName;
        long long10 = hikariConfig0.getMaxLifetime();
        int int11 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test18361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18361");
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
        hikariConfig0.setCatalog("HikariPool-193");
        hikariConfig0.connectionCustomizerClassName = "HikariPool-4001";
        boolean boolean27 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setDataSourceClassName("HikariPool-745");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test18362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18362");
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
        hikariConfig0.setPoolName("");
        java.lang.String str27 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test18363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18363");
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
        hikariConfig0.setMaxLifetime(0L);
        hikariConfig0.setReadOnly(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource21);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
    }

    @Test
    public void test18364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18364");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireRetries = 10;
        hikariConfig0.setPoolName("HikariPool-111");
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.dataSource = dataSource6;
        long long8 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.connectionInitSql = "HikariPool-4162";
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.maxPoolSize = 3;
        boolean boolean14 = hikariConfig0.isReadOnly();
        java.lang.String str15 = hikariConfig0.getCatalog();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18365");
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
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionInitSql("HikariPool-19395");
        hikariConfig0.maxPoolSize = '4';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18366");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.maxLifetime = (short) 0;
        hikariConfig0.isAutoCommit = true;
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.leakDetectionThreshold = (byte) 100;
        hikariConfig0.connectionInitSql = "HikariPool-74";
        hikariConfig0.setDataSourceClassName("HikariPool-3366");
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18367");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        int int9 = hikariConfig0.acquireRetries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer10;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test18368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18368");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-31097");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test18369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18369");
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
        java.lang.String str36 = hikariConfig14.getConnectionTestQuery();
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HikariPool-47" + "'", str36, "HikariPool-47");
    }

    @Test
    public void test18370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18370");
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
        java.lang.String str16 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-44545" + "'", str16, "HikariPool-44545");
    }

    @Test
    public void test18371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18371");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.dataSourceClassName = "HikariPool-25";
        hikariConfig0.maxPoolSize = 3;
        int int11 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.catalog = "HikariPool-3899";
        boolean boolean14 = hikariConfig0.isAutoCommit;
        hikariConfig0.acquireRetryDelay = 32;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test18372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18372");
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
        java.lang.String str14 = hikariConfig0.connectionTestQuery;
        hikariConfig0.dataSourceClassName = "HikariPool-1751";
        hikariConfig0.setUseInstrumentation(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18373");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        hikariConfig0.isAutoCommit = true;
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test18374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18374");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setConnectionTestQuery("HikariPool-141");
        hikariConfig0.setTransactionIsolation("HikariPool-350");
        java.lang.String str7 = hikariConfig0.getCatalog();
        hikariConfig0.setConnectionTestQuery("HikariPool-131");
        hikariConfig0.connectionInitSql = "HikariPool-1828";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18375");
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
        boolean boolean21 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.minPoolSize = 97;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test18376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18376");
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
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setMaxLifetime((long) (short) 0);
        int int38 = hikariConfig0.getAcquireIncrement();
        boolean boolean39 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test18377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18377");
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
        hikariConfig0.setMaximumPoolSize(52);
        int int33 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str34 = hikariConfig0.getJdbcUrl();
        hikariConfig0.connectionTimeout = 100L;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-44555" + "'", str15, "HikariPool-44555");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test18378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18378");
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
        hikariConfig0.setLeakDetectionThreshold((long) 3);
        hikariConfig0.setUseInstrumentation(false);
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
    }

    @Test
    public void test18379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18379");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        hikariConfig0.maxPoolSize = (short) 100;
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        java.lang.String str10 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.acquireRetryDelay = 52L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18380");
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
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str29 = hikariConfig0.transactionIsolationName;
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
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test18381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18381");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.setIdleTimeout((long) 3);
        hikariConfig0.isAutoCommit = false;
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.jdbcUrl = "HikariPool-13845";
        javax.sql.DataSource dataSource14 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test18382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18382");
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
        int int23 = hikariConfig0.getAcquireIncrement();
        boolean boolean24 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean25 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-44564" + "'", str15, "HikariPool-44564");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test18383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18383");
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
        boolean boolean17 = hikariConfig0.isReadOnly();
        java.lang.String str18 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18384");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.transactionIsolation = 3;
        hikariConfig0.setMinimumPoolSize(1);
        boolean boolean14 = hikariConfig0.isRegisterMbeans();
        java.lang.String str15 = hikariConfig0.poolName;
        hikariConfig0.setConnectionTestQuery("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-44566" + "'", str15, "HikariPool-44566");
    }

    @Test
    public void test18385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18385");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        int int8 = hikariConfig0.getMaximumPoolSize();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        long long10 = hikariConfig0.connectionTimeout;
        int int11 = hikariConfig0.getTransactionIsolation();
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test18386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18386");
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
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-5211");
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        long long18 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str19 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18387");
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
        hikariConfig0.setConnectionInitSql("HikariPool-2567");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test18388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18388");
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
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        hikariConfig0.setConnectionInitSql("HikariPool-647");
        java.lang.String str23 = hikariConfig0.getCatalog();
        int int24 = hikariConfig0.minPoolSize;
        java.lang.String str25 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-332" + "'", str23, "HikariPool-332");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-332" + "'", str25, "HikariPool-332");
    }

    @Test
    public void test18389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18389");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        int int6 = hikariConfig0.getTransactionIsolation();
        long long7 = hikariConfig0.maxLifetime;
        java.lang.String str8 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setConnectionTestQuery("HikariPool-5165");
        hikariConfig0.isInitializationFailFast = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test18390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18390");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        int int10 = hikariConfig0.minPoolSize;
        int int11 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test18391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18391");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource16 = hikariConfig15.getDataSource();
        hikariConfig15.setConnectionTestQuery("");
        hikariConfig15.connectionCustomizerClassName = "";
        hikariConfig15.setConnectionCustomizerClassName("hi!");
        java.lang.String str23 = hikariConfig15.getCatalog();
        java.util.Properties properties24 = hikariConfig15.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str27 = hikariConfig26.getConnectionInitSql();
        long long28 = hikariConfig26.getLeakDetectionThreshold();
        hikariConfig26.leakDetectionThreshold = (-1);
        long long31 = hikariConfig26.acquireRetryDelay;
        boolean boolean32 = hikariConfig26.isRegisterMbeans;
        hikariConfig15.addDataSourceProperty("HikariPool-47", (java.lang.Object) boolean32);
        java.util.Properties properties34 = hikariConfig15.getDataSourceProperties();
        hikariConfig15.setMaxLifetime((long) 3);
        hikariConfig15.setReadOnly(true);
        hikariConfig15.poolName = "HikariPool-415";
        hikariConfig15.setConnectionInitSql("");
        hikariConfig15.setAcquireRetries(52);
        int int45 = hikariConfig15.getMinimumPoolSize();
        java.util.Properties properties46 = hikariConfig15.dataSourceProperties;
        hikariConfig0.dataSourceProperties = properties46;
        java.lang.String str48 = hikariConfig0.getDataSourceClassName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(properties46);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test18392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18392");
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
        int int44 = hikariConfig0.acquireRetries;
        javax.sql.DataSource dataSource45 = null;
        hikariConfig0.setDataSource(dataSource45);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
    }

    @Test
    public void test18393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18393");
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
        java.lang.String str20 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.connectionTestQuery = "HikariPool-1949";
        hikariConfig0.setMaxLifetime((long) (short) -1);
        hikariConfig0.setPoolName("HikariPool-10047");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18394");
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
        long long15 = hikariConfig0.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setJdbcUrl("HikariPool-2449");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer19;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
    }

    @Test
    public void test18395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18395");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        long long12 = hikariConfig0.getMaxLifetime();
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        int int14 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.connectionInitSql = "HikariPool-2409";
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        long long18 = hikariConfig0.connectionTimeout;
        int int19 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test18396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18396");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        long long5 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAcquireIncrement((int) ' ');
        hikariConfig0.setDataSourceClassName("HikariPool-686");
        hikariConfig0.setConnectionInitSql("HikariPool-3685");
        long long12 = hikariConfig0.acquireRetryDelay;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test18397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18397");
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
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.getConnectionInitSql();
        hikariConfig12.setMaxLifetime(35L);
        hikariConfig12.setAutoCommit(false);
        int int18 = hikariConfig12.getTransactionIsolation();
        long long19 = hikariConfig12.connectionTimeout;
        boolean boolean20 = hikariConfig12.isRegisterMbeans;
        java.util.Properties properties21 = hikariConfig12.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties21);
        boolean boolean23 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.isInitializationFailFast = false;
        java.lang.String str26 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test18398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18398");
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
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test18399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18399");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.catalog = "";
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.leakDetectionThreshold = (short) 10;
        boolean boolean11 = hikariConfig0.isReadOnly;
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setMaxLifetime(60L);
        hikariConfig0.minPoolSize = (short) 10;
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.setDataSourceClassName("HikariPool-26086");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test18400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18400");
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
        long long12 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test18401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18401");
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
        javax.sql.DataSource dataSource24 = hikariConfig0.dataSource;
        hikariConfig0.setUseInstrumentation(false);
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
        org.junit.Assert.assertNull(dataSource24);
    }

    @Test
    public void test18402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18402");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1052");
        hikariConfig0.setJdbcUrl("HikariPool-853");
        java.lang.String str14 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setDataSourceClassName("HikariPool-5126");
        java.lang.String str17 = hikariConfig0.getPoolName();
        int int18 = hikariConfig0.transactionIsolation;
        java.lang.String str19 = hikariConfig0.getConnectionCustomizerClassName();
        long long20 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-44592" + "'", str17, "HikariPool-44592");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-1052" + "'", str19, "HikariPool-1052");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test18403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18403");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str10 = hikariConfig0.poolName;
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str13 = hikariConfig0.getPoolName();
        long long14 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-44599" + "'", str10, "HikariPool-44599");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-44599" + "'", str13, "HikariPool-44599");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
    }

    @Test
    public void test18404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18404");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-566");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer17;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18405");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig0.connectionCustomizer;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        long long12 = hikariConfig10.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig10.connectionCustomizer = iConnectionCustomizer13;
        boolean boolean15 = hikariConfig10.isIsolateInternalQueries();
        long long16 = hikariConfig10.maxLifetime;
        long long17 = hikariConfig10.idleTimeout;
        hikariConfig10.acquireIncrement = 100;
        hikariConfig0.addDataSourceProperty("HikariPool-1440", (java.lang.Object) 100);
        java.lang.String str21 = hikariConfig0.getDataSourceClassName();
        java.lang.String str22 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test18406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18406");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.connectionTimeout = 0L;
        hikariConfig0.setJdbcUrl("HikariPool-978");
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str15 = hikariConfig0.connectionCustomizerClassName;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig0.setDataSource(dataSource16);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18407");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        boolean boolean5 = hikariConfig0.isAutoCommit;
        java.lang.String str6 = hikariConfig0.transactionIsolationName;
        hikariConfig0.setConnectionTimeout(0L);
        java.lang.String str9 = hikariConfig0.connectionCustomizerClassName;
        int int10 = hikariConfig0.getAcquireRetries();
        java.lang.String str11 = hikariConfig0.connectionTestQuery;
        hikariConfig0.setJdbc4ConnectionTest(true);
        boolean boolean14 = hikariConfig0.isReadOnly;
        hikariConfig0.setInitializationFailFast(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test18408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18408");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18409");
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
        hikariConfig0.maxPoolSize = '#';
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-7465");
        hikariConfig0.maxPoolSize = 100;
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
    public void test18410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18410");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (byte) 0;
        hikariConfig0.acquireRetryDelay = 3L;
        hikariConfig0.poolName = "HikariPool-66";
        hikariConfig0.setCatalog("HikariPool-48");
        java.lang.String str11 = hikariConfig0.connectionCustomizerClassName;
        int int12 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.acquireRetries = 1;
        java.lang.String str15 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18411");
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
        hikariConfig0.setAutoCommit(true);
        java.lang.String str43 = hikariConfig0.transactionIsolationName;
        hikariConfig0.isIsolateInternalQueries = true;
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
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test18412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18412");
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
        hikariConfig0.setJdbcUrl("HikariPool-161");
        hikariConfig0.transactionIsolationName = "HikariPool-12785";
        boolean boolean53 = hikariConfig0.isInitializationFailFast();
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test18413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18413");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.isAutoCommit = true;
        java.lang.String str14 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test18414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18414");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int5 = hikariConfig0.acquireRetries;
        java.lang.String str6 = hikariConfig0.catalog;
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setTransactionIsolation("HikariPool-1021");
        hikariConfig0.connectionInitSql = "HikariPool-5165";
        java.lang.String str12 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-44626" + "'", str7, "HikariPool-44626");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-1021" + "'", str12, "HikariPool-1021");
    }

    @Test
    public void test18415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18415");
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
        hikariConfig0.leakDetectionThreshold = 0L;
        boolean boolean43 = hikariConfig0.isAutoCommit();
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test18416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18416");
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
        hikariConfig0.setLeakDetectionThreshold((long) 1);
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
    }

    @Test
    public void test18417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18417");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.acquireRetries = 35;
        int int12 = hikariConfig0.getAcquireIncrement();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test18418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18418");
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
        int int14 = hikariConfig0.acquireRetries;
        long long15 = hikariConfig0.getMaxLifetime();
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test18419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18419");
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
        hikariConfig0.setMinimumPoolSize(10);
        hikariConfig0.idleTimeout = 0L;
        java.lang.String str23 = hikariConfig0.getPoolName();
        long long24 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-44640" + "'", str23, "HikariPool-44640");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
    }

    @Test
    public void test18420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18420");
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
        hikariConfig0.connectionInitSql = "HikariPool-141";
        boolean boolean28 = hikariConfig0.isAutoCommit();
        boolean boolean29 = hikariConfig0.isAutoCommit;
        java.util.Properties properties30 = hikariConfig0.dataSourceProperties;
        java.lang.String str31 = hikariConfig0.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44641" + "'", str3, "HikariPool-44641");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test18421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18421");
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
        boolean boolean23 = hikariConfig0.isAutoCommit();
        hikariConfig0.maxLifetime = (byte) 100;
        java.lang.String str26 = hikariConfig0.poolName;
        javax.sql.DataSource dataSource27 = hikariConfig0.dataSource;
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-47" + "'", str26, "HikariPool-47");
        org.junit.Assert.assertNull(dataSource27);
    }

    @Test
    public void test18422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18422");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        java.lang.String str4 = hikariConfig0.catalog;
        java.util.Properties properties5 = hikariConfig0.dataSourceProperties;
        boolean boolean6 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.transactionIsolation = 35;
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str12 = hikariConfig0.connectionTestQuery;
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str15 = hikariConfig0.connectionTestQuery;
        hikariConfig0.jdbcUrl = "HikariPool-519";
        hikariConfig0.minPoolSize = 'a';
        int int20 = hikariConfig0.transactionIsolation;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test18423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18423");
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
        hikariConfig0.jdbcUrl = "HikariPool-2343";
        hikariConfig0.isJdbc4connectionTest = false;
        java.lang.String str26 = hikariConfig0.getPoolName();
        int int27 = hikariConfig0.getMinimumPoolSize();
        long long28 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-44647" + "'", str26, "HikariPool-44647");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
    }

    @Test
    public void test18424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18424");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        hikariConfig0.acquireIncrement = '4';
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.transactionIsolationName = "HikariPool-127";
        boolean boolean12 = hikariConfig0.isJdbc4connectionTest;
        int int13 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setJdbcUrl("HikariPool-4221");
        hikariConfig0.idleTimeout = ' ';
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test18425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18425");
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
        hikariConfig0.setUseInstrumentation(false);
        int int40 = hikariConfig0.acquireRetries;
        hikariConfig0.setJdbcUrl("HikariPool-123");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-44649" + "'", str34, "HikariPool-44649");
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test18426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18426");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getTransactionIsolation();
        long long2 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int5 = hikariConfig0.acquireRetries;
        java.lang.String str6 = hikariConfig0.catalog;
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.leakDetectionThreshold = (byte) 10;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-44652" + "'", str7, "HikariPool-44652");
    }

    @Test
    public void test18427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18427");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-14714");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-14714 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18428");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test18429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18429");
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
        java.lang.String str27 = hikariConfig0.getJdbcUrl();
        java.lang.String str28 = hikariConfig0.getCatalog();
        java.lang.String str29 = hikariConfig0.dataSourceClassName;
        hikariConfig0.maxPoolSize = 1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test18430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18430");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-34680");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-34680 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18431");
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
        hikariConfig0.isJdbc4connectionTest = false;
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test18432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18432");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.getTransactionIsolation();
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-1144";
        int int9 = hikariConfig0.getMinimumPoolSize();
        int int10 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test18433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18433");
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
        int int29 = hikariConfig0.getTransactionIsolation();
        boolean boolean30 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test18434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18434");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        java.lang.String str3 = hikariConfig0.getPoolName();
        int int4 = hikariConfig0.maxPoolSize;
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setIsolateInternalQueries(false);
        long long10 = hikariConfig0.acquireRetryDelay;
        int int11 = hikariConfig0.acquireRetries;
        int int12 = hikariConfig0.getMinimumPoolSize();
        boolean boolean13 = hikariConfig0.isRegisterMbeans();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44663" + "'", str3, "HikariPool-44663");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18435");
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
        hikariConfig0.setAcquireRetries(52);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource24 = hikariConfig23.getDataSource();
        hikariConfig23.setConnectionTestQuery("");
        hikariConfig23.setInitializationFailFast(false);
        java.lang.String str29 = hikariConfig23.getConnectionInitSql();
        hikariConfig23.setReadOnly(true);
        javax.sql.DataSource dataSource32 = null;
        hikariConfig23.setDataSource(dataSource32);
        java.util.Properties properties34 = hikariConfig23.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        int int36 = hikariConfig35.getAcquireIncrement();
        java.util.Properties properties37 = hikariConfig35.dataSourceProperties;
        hikariConfig0.addDataSourceProperty("HikariPool-2531", (java.lang.Object) hikariConfig35);
        boolean boolean39 = hikariConfig35.isIsolateInternalQueries();
        java.lang.String str40 = hikariConfig35.connectionTestQuery;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test18436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18436");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries;
        boolean boolean4 = hikariConfig0.isAutoCommit();
        hikariConfig0.setJdbc4ConnectionTest(true);
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setConnectionInitSql("HikariPool-2963");
        hikariConfig0.isIsolateInternalQueries = true;
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test18437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18437");
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
        hikariConfig7.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource27 = hikariConfig26.getDataSource();
        hikariConfig26.setConnectionTestQuery("");
        hikariConfig26.connectionCustomizerClassName = "";
        hikariConfig26.setConnectionCustomizerClassName("hi!");
        java.lang.String str34 = hikariConfig26.getCatalog();
        java.util.Properties properties35 = hikariConfig26.dataSourceProperties;
        int int36 = hikariConfig26.minPoolSize;
        long long37 = hikariConfig26.getMaxLifetime();
        long long38 = hikariConfig26.acquireRetryDelay;
        java.lang.String str39 = hikariConfig26.connectionTestQuery;
        java.lang.String str40 = hikariConfig26.connectionTestQuery;
        java.lang.String str41 = hikariConfig26.getJdbcUrl();
        hikariConfig26.setAcquireIncrement((int) (short) 100);
        hikariConfig7.addDataSourceProperty("HikariPool-809", (java.lang.Object) hikariConfig26);
        javax.sql.DataSource dataSource45 = hikariConfig26.dataSource;
        long long46 = hikariConfig26.leakDetectionThreshold;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(dataSource45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
    }

    @Test
    public void test18438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18438");
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
        int int19 = hikariConfig0.getAcquireIncrement();
        boolean boolean20 = hikariConfig0.isRegisterMbeans();
        javax.sql.DataSource dataSource21 = hikariConfig0.getDataSource();
        hikariConfig0.setRegisterMbeans(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test18439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18439");
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
        hikariConfig0.setReadOnly(true);
        hikariConfig0.poolName = "HikariPool-4334";
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test18440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18440");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        int int4 = hikariConfig0.acquireRetries;
        int int5 = hikariConfig0.minPoolSize;
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setAutoCommit(true);
        int int9 = hikariConfig0.acquireIncrement;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str12 = hikariConfig11.getConnectionInitSql();
        long long13 = hikariConfig11.getLeakDetectionThreshold();
        hikariConfig11.leakDetectionThreshold = (-1);
        long long16 = hikariConfig11.acquireRetryDelay;
        boolean boolean17 = hikariConfig11.isRegisterMbeans;
        hikariConfig11.setConnectionInitSql("");
        hikariConfig11.connectionTimeout = 0L;
        java.lang.String str22 = hikariConfig11.getJdbcUrl();
        java.lang.String str23 = hikariConfig11.connectionTestQuery;
        int int24 = hikariConfig11.getTransactionIsolation();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str26 = hikariConfig25.getConnectionInitSql();
        long long27 = hikariConfig25.getLeakDetectionThreshold();
        int int28 = hikariConfig25.getMaximumPoolSize();
        long long29 = hikariConfig25.getIdleTimeout();
        int int30 = hikariConfig25.maxPoolSize;
        java.lang.String str31 = hikariConfig25.getConnectionCustomizerClassName();
        hikariConfig25.setConnectionCustomizerClassName("HikariPool-127");
        java.lang.String str34 = hikariConfig25.getConnectionInitSql();
        javax.sql.DataSource dataSource35 = hikariConfig25.getDataSource();
        boolean boolean36 = hikariConfig25.isAutoCommit();
        hikariConfig25.setConnectionCustomizerClassName("HikariPool-474");
        java.util.Properties properties39 = hikariConfig25.dataSourceProperties;
        hikariConfig11.setDataSourceProperties(properties39);
        hikariConfig0.addDataSourceProperty("HikariPool-1001", (java.lang.Object) properties39);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-44673" + "'", str6, "HikariPool-44673");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(dataSource35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(properties39);
    }

    @Test
    public void test18441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18441");
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
        boolean boolean15 = hikariConfig0.isReadOnly;
        hikariConfig0.isReadOnly = false;
        hikariConfig0.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18442");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionTestQuery("HikariPool-16");
        int int9 = hikariConfig0.acquireRetries;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource11 = hikariConfig10.getDataSource();
        hikariConfig10.setConnectionTestQuery("");
        hikariConfig10.setInitializationFailFast(false);
        java.lang.String str16 = hikariConfig10.getConnectionInitSql();
        hikariConfig10.setReadOnly(true);
        javax.sql.DataSource dataSource19 = null;
        hikariConfig10.setDataSource(dataSource19);
        java.util.Properties properties21 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties21;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-283";
        java.lang.String str25 = hikariConfig0.connectionInitSql;
        long long26 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setPoolName("HikariPool-2652");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test18443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18443");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.idleTimeout = 3;
        hikariConfig0.setLeakDetectionThreshold(52L);
        int int6 = hikariConfig0.minPoolSize;
        hikariConfig0.transactionIsolationName = "";
        java.lang.String str9 = hikariConfig0.getCatalog();
        boolean boolean10 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.setDataSourceClassName("HikariPool-6248");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test18444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18444");
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
        hikariConfig0.acquireRetryDelay = 1L;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test18445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18445");
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
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setDataSourceClassName("HikariPool-3995");
        java.lang.String str28 = hikariConfig0.getPoolName();
        hikariConfig0.catalog = "HikariPool-6728";
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
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-44685" + "'", str28, "HikariPool-44685");
    }

    @Test
    public void test18446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18446");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        java.lang.String str6 = hikariConfig0.connectionInitSql;
        hikariConfig0.setTransactionIsolation("HikariPool-47");
        hikariConfig0.isRegisterMbeans = true;
        java.lang.String str11 = hikariConfig0.poolName;
        hikariConfig0.minPoolSize = 35;
        hikariConfig0.catalog = "HikariPool-713";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-44687" + "'", str11, "HikariPool-44687");
    }

    @Test
    public void test18447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18447");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        int int5 = hikariConfig0.acquireIncrement;
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str8 = hikariConfig0.getPoolName();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.isAutoCommit = false;
        long long12 = hikariConfig0.connectionTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-44688" + "'", str8, "HikariPool-44688");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test18448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18448");
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
        javax.sql.DataSource dataSource17 = null;
        hikariConfig0.dataSource = dataSource17;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig0.connectionCustomizer;
        java.lang.String str20 = hikariConfig0.getPoolName();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(iConnectionCustomizer19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-44689" + "'", str20, "HikariPool-44689");
    }

    @Test
    public void test18449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18449");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.util.Properties properties9 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setJdbcUrl("HikariPool-272");
        hikariConfig0.transactionIsolation = 1;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig0.connectionCustomizer;
        int int15 = hikariConfig0.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test18450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18450");
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
        java.lang.Class<?> wildcardClass26 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test18451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18451");
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
        long long23 = hikariConfig0.maxLifetime;
        int int24 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
    }

    @Test
    public void test18452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18452");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.transactionIsolation = 0;
        long long4 = hikariConfig0.maxLifetime;
        boolean boolean5 = hikariConfig0.isAutoCommit();
        hikariConfig0.setMaxLifetime((long) 60);
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.poolName = "HikariPool-9353";
        hikariConfig0.setMaxLifetime((long) (short) 10);
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test18453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18453");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-26828");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-26828 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18454");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setMaxLifetime(35L);
        hikariConfig0.setAutoCommit(false);
        java.util.Properties properties6 = hikariConfig0.dataSourceProperties;
        hikariConfig0.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig0.isInitializationFailFast;
        hikariConfig0.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18455");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setUseInstrumentation(false);
        int int9 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setUseInstrumentation(false);
        long long12 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setTransactionIsolation("HikariPool-754");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test18456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18456");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.leakDetectionThreshold = (short) -1;
        hikariConfig0.transactionIsolation = 3;
        long long13 = hikariConfig0.getConnectionTimeout();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
    }

    @Test
    public void test18457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18457");
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
        hikariConfig0.setAutoCommit(false);
        boolean boolean16 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource19 = hikariConfig0.dataSource;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test18458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18458");
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
        hikariConfig0.setReadOnly(true);
        long long20 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setConnectionInitSql("HikariPool-14603");
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test18459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18459");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str4 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.maxLifetime = (short) 0;
        hikariConfig0.isAutoCommit = true;
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.leakDetectionThreshold = (byte) 100;
        hikariConfig0.connectionInitSql = "HikariPool-74";
        javax.sql.DataSource dataSource14 = hikariConfig0.getDataSource();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig15.setMaxLifetime((long) (short) 10);
        java.lang.String str18 = hikariConfig15.getPoolName();
        hikariConfig15.jdbcUrl = "";
        hikariConfig15.setMaxLifetime(0L);
        hikariConfig15.setTransactionIsolation("HikariPool-48");
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig25.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource29 = hikariConfig28.getDataSource();
        hikariConfig28.setConnectionTestQuery("");
        hikariConfig28.setInitializationFailFast(false);
        long long34 = hikariConfig28.getConnectionTimeout();
        java.util.Properties properties35 = hikariConfig28.dataSourceProperties;
        hikariConfig25.dataSourceProperties = properties35;
        hikariConfig15.setDataSourceProperties(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig0.setDataSourceProperties(properties35);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-44705" + "'", str18, "HikariPool-44705");
        org.junit.Assert.assertNull(dataSource29);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 32L + "'", long34 == 32L);
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test18460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18460");
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
        hikariConfig0.leakDetectionThreshold = (short) 0;
        long long16 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test18461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18461");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.acquireRetries = 0;
        int int9 = hikariConfig0.acquireIncrement;
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setConnectionTestQuery("HikariPool-208");
        boolean boolean14 = hikariConfig0.isReadOnly;
        int int15 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setMaximumPoolSize((int) 'a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test18462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18462");
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
        int int23 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test18463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18463");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setMaximumPoolSize((int) (short) 100);
        hikariConfig0.setMaxLifetime((long) 10);
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        java.lang.String str14 = hikariConfig0.connectionCustomizerClassName;
        java.lang.String str15 = hikariConfig0.poolName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-44713" + "'", str15, "HikariPool-44713");
    }

    @Test
    public void test18464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18464");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getIdleTimeout();
        int int5 = hikariConfig0.maxPoolSize;
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-127");
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        boolean boolean11 = hikariConfig0.isAutoCommit();
        hikariConfig0.transactionIsolationName = "HikariPool-963";
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.transactionIsolationName = "HikariPool-38985";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test18465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18465");
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
        java.util.Properties properties31 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.transactionIsolationName = "HikariPool-891";
        java.lang.String str34 = hikariConfig0.poolName;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-44283";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-66" + "'", str34, "HikariPool-66");
    }

    @Test
    public void test18466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18466");
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
        hikariConfig0.setConnectionTestQuery("HikariPool-35");
        hikariConfig0.isAutoCommit = true;
        hikariConfig0.setIdleTimeout((long) '4');
        long long22 = hikariConfig0.leakDetectionThreshold;
        long long23 = hikariConfig0.maxLifetime;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
    }

    @Test
    public void test18467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18467");
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
        int int30 = hikariConfig0.getTransactionIsolation();
        int int31 = hikariConfig0.getAcquireRetries();
        boolean boolean32 = hikariConfig0.isInitializationFailFast;
        java.lang.String str33 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str36 = hikariConfig35.getConnectionInitSql();
        long long37 = hikariConfig35.getLeakDetectionThreshold();
        hikariConfig35.leakDetectionThreshold = (byte) 0;
        hikariConfig35.connectionCustomizerClassName = "HikariPool-25";
        javax.sql.DataSource dataSource42 = hikariConfig35.dataSource;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig44.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource48 = hikariConfig47.getDataSource();
        hikariConfig47.setConnectionTestQuery("");
        hikariConfig47.setInitializationFailFast(false);
        long long53 = hikariConfig47.getConnectionTimeout();
        java.util.Properties properties54 = hikariConfig47.dataSourceProperties;
        hikariConfig44.dataSourceProperties = properties54;
        hikariConfig44.maxLifetime = 750L;
        hikariConfig44.minPoolSize = (short) 100;
        hikariConfig44.jdbcUrl = "HikariPool-29";
        java.lang.String str62 = hikariConfig44.catalog;
        hikariConfig35.addDataSourceProperty("HikariPool-777", (java.lang.Object) hikariConfig44);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer64 = hikariConfig44.connectionCustomizer;
        hikariConfig0.addDataSourceProperty("HikariPool-12921", (java.lang.Object) hikariConfig44);
        hikariConfig0.connectionTimeout = 97L;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-47" + "'", str33, "HikariPool-47");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNull(dataSource42);
        org.junit.Assert.assertNull(dataSource48);
// flaky:         org.junit.Assert.assertTrue("'" + long53 + "' != '" + 32L + "'", long53 == 32L);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(iConnectionCustomizer64);
    }

    @Test
    public void test18468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18468");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.maxPoolSize = 'a';
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test18469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18469");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setPoolName("HikariPool-543");
        java.lang.String str10 = hikariConfig0.connectionInitSql;
        hikariConfig0.setAutoCommit(true);
        java.lang.String str13 = hikariConfig0.jdbcUrl;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18470");
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
        hikariConfig0.isReadOnly = false;
        java.lang.String str14 = hikariConfig0.transactionIsolationName;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-14742";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18471");
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
        long long28 = hikariConfig0.acquireRetryDelay;
        java.lang.String str29 = hikariConfig0.getDataSourceClassName();
        java.lang.String str30 = hikariConfig0.catalog;
        java.lang.String str31 = hikariConfig0.connectionInitSql;
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
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 100L + "'", long28 == 100L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test18472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18472");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.lang.String str8 = hikariConfig0.getCatalog();
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setAcquireRetries(0);
        boolean boolean12 = hikariConfig0.isRegisterMbeans;
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 1);
        java.util.Properties properties16 = hikariConfig0.dataSourceProperties;
        int int17 = hikariConfig0.transactionIsolation;
        hikariConfig0.setAutoCommit(true);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test18473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18473");
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
        boolean boolean23 = hikariConfig0.isIsolateInternalQueries;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test18474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18474");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        java.lang.String str7 = hikariConfig0.jdbcUrl;
        boolean boolean8 = hikariConfig0.isReadOnly;
        java.lang.String str9 = hikariConfig0.jdbcUrl;
        long long10 = hikariConfig0.getMaxLifetime();
        hikariConfig0.isInitializationFailFast = true;
        java.lang.String str13 = hikariConfig0.connectionTestQuery;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18475");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.connectionTimeout = 10;
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setPoolName("HikariPool-66");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer11;
        hikariConfig0.setIdleTimeout((long) 60);
        hikariConfig0.isRegisterMbeans = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test18476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18476");
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
        java.lang.String str15 = hikariConfig0.jdbcUrl;
        hikariConfig0.poolName = "HikariPool-4202";
        hikariConfig0.leakDetectionThreshold = 60;
        java.util.Properties properties20 = hikariConfig0.getDataSourceProperties();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test18477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18477");
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
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-1909");
        long long29 = hikariConfig0.getAcquireRetryDelay();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
    }

    @Test
    public void test18478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18478");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        long long6 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setDataSourceClassName("HikariPool-66");
        hikariConfig0.setTransactionIsolation("HikariPool-122");
        int int11 = hikariConfig0.minPoolSize;
        int int12 = hikariConfig0.transactionIsolation;
        java.util.Properties properties13 = hikariConfig0.dataSourceProperties;
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setTransactionIsolation("HikariPool-15794");
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test18479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18479");
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
        java.lang.String str21 = hikariConfig0.transactionIsolationName;
        boolean boolean22 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-47" + "'", str15, "HikariPool-47");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test18480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18480");
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
        long long20 = hikariConfig0.acquireRetryDelay;
        hikariConfig0.setDataSourceClassName("HikariPool-509");
        java.lang.String str23 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str24 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test18481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18481");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer29;
        long long31 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-44744" + "'", str15, "HikariPool-44744");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
    }

    @Test
    public void test18482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18482");
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
        long long16 = hikariConfig0.getMaxLifetime();
        hikariConfig0.connectionTimeout = 2147483647L;
        hikariConfig0.leakDetectionThreshold = 3;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test18483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18483");
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
        hikariConfig0.setPoolName("HikariPool-801");
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18484");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = null;
        hikariConfig7.connectionCustomizer = iConnectionCustomizer25;
        long long27 = hikariConfig7.connectionTimeout;
        boolean boolean28 = hikariConfig7.isReadOnly();
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
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test18485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18485");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.connectionCustomizerClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig0.connectionCustomizer;
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        int int8 = hikariConfig0.maxPoolSize;
        java.lang.String str9 = hikariConfig0.getCatalog();
        hikariConfig0.transactionIsolation = (short) 100;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18486");
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
        long long23 = hikariConfig0.getIdleTimeout();
        hikariConfig0.transactionIsolation = (byte) 1;
        hikariConfig0.setAcquireRetries(0);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
    }

    @Test
    public void test18487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18487");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getMaximumPoolSize();
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.acquireRetries = (short) 1;
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.isAutoCommit = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test18488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18488");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.acquireIncrement = 0;
        hikariConfig0.maxLifetime = 100;
        long long6 = hikariConfig0.getConnectionTimeout();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.minPoolSize = 32;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18489");
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
        java.lang.String str13 = hikariConfig0.transactionIsolationName;
        java.lang.String str14 = hikariConfig0.getJdbcUrl();
        hikariConfig0.isJdbc4connectionTest = true;
        boolean boolean17 = hikariConfig0.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18490");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        long long6 = hikariConfig0.getIdleTimeout();
        long long7 = hikariConfig0.leakDetectionThreshold;
        boolean boolean8 = hikariConfig0.isReadOnly();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        hikariConfig0.connectionInitSql = "HikariPool-484";
        boolean boolean14 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.poolName = "HikariPool-16829";
        java.lang.Class<?> wildcardClass17 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18491");
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
        hikariConfig0.setUseInstrumentation(true);
        long long17 = hikariConfig0.connectionTimeout;
        int int18 = hikariConfig0.getAcquireIncrement();
        boolean boolean19 = hikariConfig0.isRegisterMbeans();
        int int20 = hikariConfig0.acquireRetries;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test18492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18492");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties7 = hikariConfig0.dataSourceProperties;
        boolean boolean8 = hikariConfig0.isReadOnly;
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setConnectionInitSql("HikariPool-2924");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource13 = hikariConfig12.getDataSource();
        hikariConfig12.setConnectionTestQuery("");
        hikariConfig12.setInitializationFailFast(false);
        hikariConfig12.catalog = "";
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource21 = hikariConfig20.getDataSource();
        hikariConfig20.setConnectionTestQuery("");
        hikariConfig20.connectionCustomizerClassName = "";
        hikariConfig20.setConnectionCustomizerClassName("hi!");
        java.lang.String str28 = hikariConfig20.getCatalog();
        java.util.Properties properties29 = hikariConfig20.dataSourceProperties;
        hikariConfig12.dataSourceProperties = properties29;
        hikariConfig12.connectionCustomizerClassName = "hi!";
        int int33 = hikariConfig12.maxPoolSize;
        java.lang.String str34 = hikariConfig12.connectionInitSql;
        int int35 = hikariConfig12.getTransactionIsolation();
        java.util.Properties properties36 = hikariConfig12.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties36);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer38 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setAcquireRetries((int) '#');
        boolean boolean43 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.idleTimeout = 'a';
        org.junit.Assert.assertNull(dataSource1);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(dataSource21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(iConnectionCustomizer38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test18493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18493");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setMaxLifetime((long) (short) 10);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setDataSourceClassName("HikariPool-47");
        hikariConfig0.setDataSourceClassName("HikariPool-18");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getDataSourceClassName();
        long long10 = hikariConfig0.getIdleTimeout();
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setLeakDetectionThreshold(0L);
        hikariConfig0.setConnectionInitSql("HikariPool-2152");
        long long18 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test18494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18494");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.catalog = "HikariPool-101";
        int int11 = hikariConfig0.acquireIncrement;
        java.util.Properties properties12 = hikariConfig0.getDataSourceProperties();
        java.lang.String str13 = hikariConfig0.dataSourceClassName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18495");
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
        hikariConfig0.setAcquireRetryDelay(10L);
        hikariConfig0.connectionTestQuery = "HikariPool-38";
        hikariConfig0.acquireRetries = (short) -1;
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-18" + "'", str9, "HikariPool-18");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test18496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18496");
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
        hikariConfig0.connectionInitSql = "HikariPool-299";
        hikariConfig0.setDataSourceClassName("HikariPool-9371");
        long long18 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test18497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18497");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        boolean boolean5 = hikariConfig0.isIsolateInternalQueries();
        long long6 = hikariConfig0.maxLifetime;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        hikariConfig0.minPoolSize = '#';
        java.lang.String str11 = hikariConfig0.connectionCustomizerClassName;
        hikariConfig0.idleTimeout = 0;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource15 = hikariConfig14.getDataSource();
        hikariConfig14.setConnectionTestQuery("");
        hikariConfig14.setInitializationFailFast(false);
        java.lang.String str20 = hikariConfig14.getConnectionInitSql();
        hikariConfig14.setReadOnly(true);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig14.setDataSource(dataSource23);
        java.util.Properties properties25 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig0.dataSourceProperties = properties25;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test18498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18498");
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
        hikariConfig0.isAutoCommit = true;
        boolean boolean32 = hikariConfig0.isRegisterMbeans;
        boolean boolean33 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.isInitializationFailFast = false;
        hikariConfig0.setAcquireRetryDelay(0L);
        java.lang.Class<?> wildcardClass38 = hikariConfig0.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HikariPool-44770" + "'", str3, "HikariPool-44770");
        org.junit.Assert.assertNull(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-48" + "'", str27, "HikariPool-48");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test18499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18499");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.leakDetectionThreshold = (-1);
        long long5 = hikariConfig0.acquireRetryDelay;
        boolean boolean6 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.connectionTimeout = (short) 10;
        hikariConfig0.setPoolName("HikariPool-16");
        long long11 = hikariConfig0.leakDetectionThreshold;
        hikariConfig0.setPoolName("HikariPool-154");
        hikariConfig0.setConnectionTestQuery("HikariPool-4932");
        hikariConfig0.connectionTestQuery = "HikariPool-12256";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test18500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18500");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer3;
        hikariConfig0.acquireRetries = 0;
        boolean boolean7 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.acquireRetries = '4';
        java.lang.String str10 = hikariConfig0.getDataSourceClassName();
        int int11 = hikariConfig0.getAcquireRetries();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }
}
