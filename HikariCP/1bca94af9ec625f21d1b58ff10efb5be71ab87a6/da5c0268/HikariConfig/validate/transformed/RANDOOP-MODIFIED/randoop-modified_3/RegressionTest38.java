import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test19001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19001");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int15 = hikariConfig1.maxPoolSize;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-5346";
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        java.lang.String str21 = hikariConfig20.getDataSourceClassName();
        int int22 = hikariConfig20.getAcquireRetries();
        hikariConfig20.connectionTimeout = 100;
        boolean boolean25 = hikariConfig20.isInitializationFailFast();
        java.lang.String str26 = hikariConfig20.connectionTestQuery;
        hikariConfig20.setJdbcUrl("HikariPool-300");
        hikariConfig20.setConnectionCustomizerClassName("HikariPool-335");
        javax.sql.DataSource dataSource31 = null;
        hikariConfig20.setDataSource(dataSource31);
        boolean boolean33 = hikariConfig20.isRegisterMbeans;
        hikariConfig20.dataSourceClassName = "HikariPool-609";
        int int36 = hikariConfig20.maxPoolSize;
        hikariConfig20.acquireRetries = 1;
        java.lang.String str39 = hikariConfig20.connectionTestQuery;
        hikariConfig20.setJdbcUrl("HikariPool-3066");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer42 = hikariConfig20.connectionCustomizer;
        hikariConfig20.jdbcUrl = "HikariPool-1331";
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        java.lang.String str47 = hikariConfig46.getDataSourceClassName();
        int int48 = hikariConfig46.getAcquireRetries();
        hikariConfig46.connectionTimeout = 100;
        boolean boolean51 = hikariConfig46.isInitializationFailFast();
        java.lang.String str52 = hikariConfig46.connectionTestQuery;
        hikariConfig46.setJdbcUrl("HikariPool-300");
        hikariConfig46.setConnectionCustomizerClassName("HikariPool-335");
        hikariConfig46.setLeakDetectionThreshold(600000L);
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        long long61 = hikariConfig60.getAcquireRetryDelay();
        hikariConfig60.connectionInitSql = "hi!";
        hikariConfig60.acquireIncrement = (byte) 100;
        hikariConfig60.setMinimumPoolSize((int) (short) 0);
        hikariConfig60.connectionTestQuery = "";
        hikariConfig60.jdbcUrl = "HikariPool-45";
        hikariConfig60.isReadOnly = false;
        hikariConfig60.setPoolName("");
        java.lang.String str76 = hikariConfig60.getConnectionTestQuery();
        java.util.Properties properties77 = hikariConfig60.dataSourceProperties;
        hikariConfig46.dataSourceProperties = properties77;
        com.zaxxer.hikari.HikariConfig hikariConfig79 = new com.zaxxer.hikari.HikariConfig(properties77);
        com.zaxxer.hikari.HikariConfig hikariConfig80 = new com.zaxxer.hikari.HikariConfig(properties77);
        com.zaxxer.hikari.HikariConfig hikariConfig81 = new com.zaxxer.hikari.HikariConfig(properties77);
        long long82 = hikariConfig81.leakDetectionThreshold;
        long long83 = hikariConfig81.acquireRetryDelay;
        long long84 = hikariConfig81.idleTimeout;
        long long85 = hikariConfig81.leakDetectionThreshold;
        java.util.Properties properties86 = hikariConfig81.dataSourceProperties;
        hikariConfig20.setDataSourceProperties(properties86);
        hikariConfig1.addDataSourceProperty("HikariPool-18547", (java.lang.Object) hikariConfig20);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(iConnectionCustomizer42);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str52);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 32L + "'", long61 == 32L);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(properties77);
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 0L + "'", long82 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long83 + "' != '" + 32L + "'", long83 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long84 + "' != '" + 1800000L + "'", long84 == 1800000L);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + 0L + "'", long85 == 0L);
        org.junit.Assert.assertNotNull(properties86);
    }

    @Test
    public void test19002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19002");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2540");
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
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig27.idleTimeout = 35;
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        boolean boolean32 = hikariConfig31.isInitializationFailFast();
        hikariConfig31.setInitializationFailFast(false);
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        java.lang.String str37 = hikariConfig36.getDataSourceClassName();
        hikariConfig36.setTransactionIsolation("hi!");
        hikariConfig36.acquireRetryDelay = '4';
        hikariConfig36.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties44 = hikariConfig36.getDataSourceProperties();
        hikariConfig31.setDataSourceProperties(properties44);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int47 = hikariConfig46.minPoolSize;
        boolean boolean48 = hikariConfig46.isReadOnly;
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig50.maxPoolSize = (byte) 0;
        java.util.Properties properties53 = hikariConfig50.dataSourceProperties;
        hikariConfig46.dataSourceProperties = properties53;
        hikariConfig27.setDataSourceProperties(properties53);
        hikariConfig1.dataSourceProperties = properties53;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties53);
        hikariConfig57.acquireRetries = 0;
        hikariConfig57.transactionIsolationName = "HikariPool-11600";
        hikariConfig57.isInitializationFailFast = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(properties53);
    }

    @Test
    public void test19003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19003");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        long long8 = hikariConfig1.maxLifetime;
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.catalog = "HikariPool-1933";
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test19004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19004");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.transactionIsolation = 'a';
        hikariConfig1.transactionIsolationName = "HikariPool-105";
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test19005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19005");
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
        hikariConfig1.isRegisterMbeans = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19006");
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
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test19007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19007");
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
        java.lang.String str17 = hikariConfig1.getJdbcUrl();
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource23 = hikariConfig20.getDataSource();
        hikariConfig20.connectionTestQuery = "HikariPool-55";
        hikariConfig20.connectionTestQuery = "hi!";
        java.lang.String str28 = hikariConfig20.poolName;
        hikariConfig20.setReadOnly(true);
        boolean boolean31 = hikariConfig20.isIsolateInternalQueries();
        hikariConfig20.setJdbc4ConnectionTest(false);
        hikariConfig20.connectionInitSql = "";
        boolean boolean36 = hikariConfig20.isRegisterMbeans;
        java.util.Properties properties37 = hikariConfig20.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig1.dataSourceProperties = properties37;
        hikariConfig1.setAutoCommit(false);
        long long42 = hikariConfig1.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(dataSource23);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-51651" + "'", str28, "HikariPool-51651");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(properties37);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1800000L + "'", long42 == 1800000L);
    }

    @Test
    public void test19008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19008");
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
        boolean boolean16 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test19009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19009");
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
        hikariConfig1.setLeakDetectionThreshold(3L);
        hikariConfig1.leakDetectionThreshold = (short) 0;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test19010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19010");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        hikariConfig1.connectionInitSql = "HikariPool-429";
        hikariConfig1.setJdbcUrl("HikariPool-365");
        hikariConfig1.setJdbc4ConnectionTest(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL HikariPool-365");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test19011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19011");
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
        java.lang.String str15 = hikariConfig1.poolName;
        long long16 = hikariConfig1.connectionTimeout;
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-55" + "'", str15, "HikariPool-55");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2147483647L + "'", long16 == 2147483647L);
    }

    @Test
    public void test19012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19012");
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
        int int12 = hikariConfig1.minPoolSize;
        hikariConfig1.maxPoolSize = 358;
        hikariConfig1.setDataSourceClassName("HikariPool-547");
        hikariConfig1.transactionIsolationName = "HikariPool-12334";
        boolean boolean19 = hikariConfig1.isIsolateInternalQueries;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test19013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19013");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-291";
        long long9 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.maxPoolSize = 32;
        hikariConfig1.acquireRetries = (byte) 10;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test19014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19014");
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
        hikariConfig1.setCatalog("HikariPool-128");
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-51664" + "'", str26, "HikariPool-51664");
    }

    @Test
    public void test19015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19015");
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
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test19016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19016");
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
        hikariConfig1.dataSourceClassName = "HikariPool-913";
        java.lang.String str21 = hikariConfig1.getPoolName();
        hikariConfig1.isJdbc4connectionTest = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-51668" + "'", str21, "HikariPool-51668");
    }

    @Test
    public void test19017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19017");
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
        long long25 = hikariConfig1.connectionTimeout;
        hikariConfig1.jdbcUrl = "HikariPool-140";
        boolean boolean28 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3L + "'", long25 == 3L);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test19018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19018");
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
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setAcquireRetries((int) (short) 1);
        long long27 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.isIsolateInternalQueries = true;
        boolean boolean30 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test19019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19019");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setCatalog("HikariPool-104");
        hikariConfig1.setMaxLifetime((long) 97);
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        long long15 = hikariConfig1.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
    }

    @Test
    public void test19020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19020");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.isAutoCommit = true;
        int int9 = hikariConfig1.acquireIncrement;
        int int10 = hikariConfig1.transactionIsolation;
        hikariConfig1.transactionIsolationName = "HikariPool-5034";
        hikariConfig1.setMaxLifetime(10L);
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test19021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19021");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource3 = null;
        hikariConfig1.setDataSource(dataSource3);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        int int8 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "HikariPool-24";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-708";
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        hikariConfig1.jdbcUrl = "HikariPool-2661";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test19022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19022");
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
        hikariConfig20.jdbcUrl = "HikariPool-927";
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        long long27 = hikariConfig26.getAcquireRetryDelay();
        hikariConfig26.connectionInitSql = "hi!";
        hikariConfig26.acquireIncrement = (byte) 100;
        hikariConfig26.setMinimumPoolSize((int) (short) 0);
        hikariConfig26.connectionTestQuery = "";
        hikariConfig26.jdbcUrl = "HikariPool-45";
        hikariConfig26.dataSourceClassName = "hi!";
        hikariConfig26.setIdleTimeout((long) (short) 100);
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        java.lang.String str44 = hikariConfig43.getDataSourceClassName();
        hikariConfig43.setTransactionIsolation("hi!");
        hikariConfig43.acquireRetryDelay = '4';
        hikariConfig43.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties51 = hikariConfig43.getDataSourceProperties();
        hikariConfig43.setAcquireRetries((int) (short) 1);
        java.util.Properties properties54 = hikariConfig43.getDataSourceProperties();
        hikariConfig26.dataSourceProperties = properties54;
        hikariConfig20.setDataSourceProperties(properties54);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties54);
        hikariConfig57.isInitializationFailFast = true;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertNotNull(properties54);
    }

    @Test
    public void test19023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19023");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setTransactionIsolation("HikariPool-77");
        hikariConfig1.setMinimumPoolSize(1);
        hikariConfig1.isIsolateInternalQueries = false;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test19024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19024");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionTimeout = (-1);
        hikariConfig1.setMinimumPoolSize(10);
        int int7 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str8 = hikariConfig1.poolName;
        long long9 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-51684" + "'", str8, "HikariPool-51684");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
    }

    @Test
    public void test19025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19025");
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
        hikariConfig0.isIsolateInternalQueries = false;
        java.lang.String str24 = hikariConfig0.poolName;
        boolean boolean25 = hikariConfig0.isIsolateInternalQueries;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-99");
        long long28 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(str1);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-45" + "'", str20, "HikariPool-45");
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-51685" + "'", str24, "HikariPool-51685");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test19026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19026");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.maxLifetime = (short) 10;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.catalog = "HikariPool-1691";
        java.lang.String str12 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test19027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19027");
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
        long long25 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean26 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setPoolName("HikariPool-224");
        long long29 = hikariConfig1.acquireRetryDelay;
        long long30 = hikariConfig1.idleTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1800000L + "'", long30 == 1800000L);
    }

    @Test
    public void test19028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19028");
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
        hikariConfig16.setIdleTimeout(3L);
        long long21 = hikariConfig16.leakDetectionThreshold;
        boolean boolean22 = hikariConfig16.isReadOnly;
        hikariConfig16.setIdleTimeout(52L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test19029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19029");
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
        hikariConfig1.isRegisterMbeans = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-51705" + "'", str11, "HikariPool-51705");
    }

    @Test
    public void test19030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19030");
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
        java.lang.String str13 = hikariConfig1.getPoolName();
        hikariConfig1.setAcquireRetries(60);
        java.lang.String str16 = hikariConfig1.jdbcUrl;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long19 = hikariConfig18.getAcquireRetryDelay();
        hikariConfig18.connectionInitSql = "hi!";
        hikariConfig18.acquireIncrement = (byte) 100;
        hikariConfig18.setMinimumPoolSize((int) (short) 0);
        hikariConfig18.connectionTestQuery = "";
        long long28 = hikariConfig18.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = null;
        hikariConfig18.connectionCustomizer = iConnectionCustomizer29;
        java.lang.String str31 = hikariConfig18.getConnectionTestQuery();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        long long35 = hikariConfig34.getAcquireRetryDelay();
        hikariConfig34.idleTimeout = (-1);
        java.util.Properties properties38 = hikariConfig34.getDataSourceProperties();
        hikariConfig18.addDataSourceProperty("hi!", (java.lang.Object) properties38);
        hikariConfig1.setDataSourceProperties(properties38);
        hikariConfig1.setUseInstrumentation(true);
        long long43 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-51706" + "'", str9, "HikariPool-51706");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-51706" + "'", str13, "HikariPool-51706");
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties38);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 3L + "'", long43 == 3L);
    }

    @Test
    public void test19031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19031");
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
        java.lang.Class<?> wildcardClass16 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test19032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19032");
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
        hikariConfig14.isInitializationFailFast = true;
        java.lang.String str20 = hikariConfig14.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test19033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19033");
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
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        long long37 = hikariConfig36.getAcquireRetryDelay();
        hikariConfig36.idleTimeout = (-1);
        hikariConfig36.setMaximumPoolSize((int) 'a');
        java.lang.String str42 = hikariConfig36.catalog;
        boolean boolean43 = hikariConfig36.isJdbc4ConnectionTest();
        boolean boolean44 = hikariConfig36.isInitializationFailFast();
        boolean boolean45 = hikariConfig36.isInitializationFailFast();
        boolean boolean46 = hikariConfig36.isRegisterMbeans;
        hikariConfig36.dataSourceClassName = "HikariPool-268";
        int int49 = hikariConfig36.getTransactionIsolation();
        hikariConfig36.isInitializationFailFast = true;
        boolean boolean52 = hikariConfig36.isAutoCommit;
        hikariConfig36.maxLifetime = 10L;
        boolean boolean55 = hikariConfig36.isAutoCommit;
        hikariConfig1.addDataSourceProperty("HikariPool-894", (java.lang.Object) hikariConfig36);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer57 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isIsolateInternalQueries = true;
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
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer57);
    }

    @Test
    public void test19034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19034");
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
        hikariConfig1.setIsolateInternalQueries(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test19035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19035");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-14914");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-14914 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19036");
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
        hikariConfig1.setAutoCommit(false);
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource29 = hikariConfig26.getDataSource();
        hikariConfig26.connectionTestQuery = "HikariPool-127";
        int int32 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.maxPoolSize = (byte) 100;
        java.util.Properties properties35 = hikariConfig26.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig1.setDataSourceProperties(properties35);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-56" + "'", str22, "HikariPool-56");
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test19037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19037");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        long long4 = hikariConfig1.getIdleTimeout();
        int int5 = hikariConfig1.getAcquireIncrement();
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.leakDetectionThreshold = (byte) 1;
        hikariConfig1.setPoolName("HikariPool-2072");
        int int11 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test19038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19038");
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
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.setJdbc4ConnectionTest(true);
        boolean boolean16 = hikariConfig13.isReadOnly;
        java.lang.String str17 = hikariConfig13.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test19039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19039");
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
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        long long19 = hikariConfig18.acquireRetryDelay;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(properties17);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 32L + "'", long19 == 32L);
    }

    @Test
    public void test19040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19040");
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
        java.lang.String str30 = hikariConfig1.transactionIsolationName;
        int int31 = hikariConfig1.maxPoolSize;
        hikariConfig1.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
    }

    @Test
    public void test19041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19041");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        hikariConfig1.maxLifetime = ' ';
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("HikariPool-18316");
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        boolean boolean11 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.connectionTestQuery = "HikariPool-1787";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-18316" + "'", str10, "HikariPool-18316");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19042");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        long long8 = hikariConfig1.maxLifetime;
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.catalog = "HikariPool-1933";
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test19043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19043");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        int int7 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxPoolSize = (byte) 100;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean14 = hikariConfig13.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test19044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19044");
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
        hikariConfig20.isRegisterMbeans = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test19045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19045");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isInitializationFailFast = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test19046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19046");
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
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        hikariConfig1.setMinimumPoolSize(100);
        long long17 = hikariConfig1.getConnectionTimeout();
        java.lang.String str18 = hikariConfig1.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test19047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19047");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        java.lang.String str4 = hikariConfig1.getPoolName();
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.acquireRetryDelay = (-1);
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        long long10 = hikariConfig9.getAcquireRetryDelay();
        hikariConfig9.idleTimeout = (-1);
        java.util.Properties properties13 = hikariConfig9.getDataSourceProperties();
        long long14 = hikariConfig9.maxLifetime;
        hikariConfig9.setConnectionInitSql("");
        int int17 = hikariConfig9.acquireRetries;
        hikariConfig9.leakDetectionThreshold = (-1);
        hikariConfig9.leakDetectionThreshold = (short) -1;
        javax.sql.DataSource dataSource22 = hikariConfig9.dataSource;
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
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig9.dataSourceProperties = properties45;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties45);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig1.dataSourceProperties = properties45;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties45);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-51745" + "'", str4, "HikariPool-51745");
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNull(dataSource22);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test19048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19048");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-38906");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-38906 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19049");
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
        int int18 = hikariConfig1.minPoolSize;
        int int19 = hikariConfig1.minPoolSize;
        long long20 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test19050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19050");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isAutoCommit = true;
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        hikariConfig1.setMinimumPoolSize((int) ' ');
        hikariConfig1.setReadOnly(true);
        int int17 = hikariConfig1.acquireIncrement;
        hikariConfig1.setConnectionInitSql("HikariPool-382");
        boolean boolean20 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test19051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19051");
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
        hikariConfig1.poolName = "HikariPool-11739";
        hikariConfig1.setPoolName("HikariPool-45669");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test19052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19052");
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
        java.util.Properties properties23 = hikariConfig22.dataSourceProperties;
        hikariConfig22.isIsolateInternalQueries = false;
        int int26 = hikariConfig22.getMinimumPoolSize();
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
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test19053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19053");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.poolName = "HikariPool-127";
        int int10 = hikariConfig1.minPoolSize;
        int int11 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setJdbcUrl("HikariPool-631");
        hikariConfig1.setAutoCommit(false);
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        boolean boolean18 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19054");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.connectionCustomizer;
        hikariConfig1.maxLifetime = 52L;
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        int int17 = hikariConfig1.acquireIncrement;
        hikariConfig1.transactionIsolationName = "HikariPool-42230";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test19055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19055");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        java.lang.String str5 = hikariConfig1.getCatalog();
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        long long7 = hikariConfig1.connectionTimeout;
        hikariConfig1.setCatalog("HikariPool-33402");
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test19056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19056");
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
        long long14 = hikariConfig1.idleTimeout;
        hikariConfig1.acquireRetries = (short) 1;
        java.lang.String str17 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.dataSource = dataSource18;
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-51771" + "'", str9, "HikariPool-51771");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test19057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19057");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        long long5 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setReadOnly(false);
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setTransactionIsolation("HikariPool-6825");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test19058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19058");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean5 = hikariConfig1.isReadOnly();
        long long6 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        java.lang.String str9 = hikariConfig8.getDataSourceClassName();
        int int10 = hikariConfig8.getAcquireRetries();
        hikariConfig8.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig8.setDataSource(dataSource13);
        java.lang.String str15 = hikariConfig8.getConnectionTestQuery();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.connectionInitSql = "hi!";
        hikariConfig17.acquireIncrement = (byte) 100;
        hikariConfig17.setMinimumPoolSize((int) (short) 0);
        hikariConfig17.connectionTestQuery = "";
        hikariConfig17.jdbcUrl = "HikariPool-45";
        hikariConfig17.isReadOnly = false;
        hikariConfig17.setPoolName("");
        java.lang.String str33 = hikariConfig17.getConnectionTestQuery();
        java.util.Properties properties34 = hikariConfig17.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig8.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties34);
        java.util.Properties properties38 = hikariConfig37.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties38);
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig43.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource46 = hikariConfig43.getDataSource();
        hikariConfig43.connectionTestQuery = "HikariPool-127";
        hikariConfig43.setAutoCommit(true);
        hikariConfig43.connectionCustomizerClassName = "HikariPool-291";
        hikariConfig40.addDataSourceProperty("", (java.lang.Object) hikariConfig43);
        hikariConfig40.minPoolSize = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNull(dataSource46);
    }

    @Test
    public void test19059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19059");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        java.lang.String str8 = hikariConfig1.getCatalog();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean10 = hikariConfig1.isReadOnly();
        java.lang.String str11 = hikariConfig1.catalog;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test19060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19060");
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
        hikariConfig1.acquireRetries = 'a';
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19061");
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
        java.util.Properties properties15 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.acquireRetryDelay;
        long long18 = hikariConfig16.getMaxLifetime();
        javax.sql.DataSource dataSource19 = null;
        hikariConfig16.dataSource = dataSource19;
        hikariConfig16.setRegisterMbeans(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(properties15);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
    }

    @Test
    public void test19062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19062");
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
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(false);
        boolean boolean20 = hikariConfig16.isReadOnly();
        hikariConfig16.setAutoCommit(true);
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties23;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig25.maxPoolSize = 97;
        boolean boolean28 = hikariConfig25.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test19063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19063");
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
        java.lang.String str20 = hikariConfig17.transactionIsolationName;
        int int21 = hikariConfig17.getMinimumPoolSize();
        boolean boolean22 = hikariConfig17.isInitializationFailFast;
        hikariConfig17.transactionIsolation = 32;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig17.setConnectionTimeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test19064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19064");
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
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource17 = hikariConfig14.getDataSource();
        hikariConfig14.connectionTestQuery = "HikariPool-55";
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        boolean boolean22 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.setInitializationFailFast(false);
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        java.lang.String str27 = hikariConfig26.getDataSourceClassName();
        hikariConfig26.setTransactionIsolation("hi!");
        hikariConfig26.acquireRetryDelay = '4';
        hikariConfig26.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties34 = hikariConfig26.getDataSourceProperties();
        hikariConfig21.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig14.setDataSourceProperties(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        hikariConfig1.setReadOnly(false);
        long long41 = hikariConfig1.getMaxLifetime();
        java.lang.String str42 = hikariConfig1.jdbcUrl;
        java.lang.String str43 = hikariConfig1.dataSourceClassName;
        boolean boolean44 = hikariConfig1.isReadOnly;
        boolean boolean45 = hikariConfig1.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties34);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 97L + "'", long41 == 97L);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test19065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19065");
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
        hikariConfig20.catalog = "HikariPool-12376";
        boolean boolean27 = hikariConfig20.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test19066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19066");
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
        boolean boolean16 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.jdbcUrl = "HikariPool-545";
        java.lang.String str21 = hikariConfig1.transactionIsolationName;
        long long22 = hikariConfig1.idleTimeout;
        javax.sql.DataSource dataSource23 = null;
        hikariConfig1.dataSource = dataSource23;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-51800" + "'", str9, "HikariPool-51800");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-51800" + "'", str13, "HikariPool-51800");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-55" + "'", str21, "HikariPool-55");
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
    }

    @Test
    public void test19067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19067");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.setConnectionTimeout((long) 358);
        hikariConfig1.isAutoCommit = true;
        boolean boolean11 = hikariConfig1.isReadOnly();
        hikariConfig1.catalog = "HikariPool-191";
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        long long16 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-127" + "'", str14, "HikariPool-127");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 358L + "'", long16 == 358L);
    }

    @Test
    public void test19068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19068");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionTimeout = (byte) -1;
        int int14 = hikariConfig1.acquireRetries;
        hikariConfig1.setConnectionTestQuery("HikariPool-2315");
        java.lang.String str17 = hikariConfig1.poolName;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.idleTimeout = (-1);
        hikariConfig19.setMaximumPoolSize((int) 'a');
        java.lang.String str25 = hikariConfig19.catalog;
        hikariConfig19.connectionTimeout = ' ';
        java.lang.String str28 = hikariConfig19.getConnectionTestQuery();
        java.util.Properties properties29 = hikariConfig19.dataSourceProperties;
        hikariConfig19.minPoolSize = 'a';
        hikariConfig19.setAcquireRetryDelay((long) 10);
        hikariConfig19.catalog = "HikariPool-209";
        javax.sql.DataSource dataSource36 = null;
        hikariConfig19.setDataSource(dataSource36);
        boolean boolean38 = hikariConfig19.isJdbc4ConnectionTest();
        java.util.Properties properties39 = hikariConfig19.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties39;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-51802" + "'", str17, "HikariPool-51802");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(properties39);
    }

    @Test
    public void test19069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19069");
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
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.idleTimeout = (-1);
        hikariConfig16.setMaximumPoolSize((int) 'a');
        java.lang.String str22 = hikariConfig16.catalog;
        boolean boolean23 = hikariConfig16.isReadOnly;
        hikariConfig16.isJdbc4connectionTest = true;
        hikariConfig16.isReadOnly = true;
        int int28 = hikariConfig16.maxPoolSize;
        hikariConfig16.setJdbc4ConnectionTest(false);
        boolean boolean31 = hikariConfig16.isAutoCommit();
        int int32 = hikariConfig16.maxPoolSize;
        boolean boolean33 = hikariConfig16.isReadOnly();
        hikariConfig16.leakDetectionThreshold = '#';
        java.util.Properties properties36 = hikariConfig16.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig1.dataSourceProperties = properties36;
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test19070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19070");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.connectionTimeout = (short) -1;
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test19071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19071");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.transactionIsolationName;
        int int2 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTimeout((long) 100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test19072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19072");
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
        boolean boolean16 = hikariConfig1.isAutoCommit();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer17;
        int int19 = hikariConfig1.getAcquireRetries();
        hikariConfig1.catalog = "HikariPool-2308";
        hikariConfig1.setConnectionTestQuery("HikariPool-13517");
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-51811" + "'", str9, "HikariPool-51811");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-51811" + "'", str13, "HikariPool-51811");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test19073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19073");
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
        long long22 = hikariConfig14.idleTimeout;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.lang.String str25 = hikariConfig24.getDataSourceClassName();
        int int26 = hikariConfig24.getAcquireRetries();
        java.lang.String str27 = hikariConfig24.getJdbcUrl();
        hikariConfig24.setInitializationFailFast(false);
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        long long32 = hikariConfig31.getAcquireRetryDelay();
        hikariConfig31.idleTimeout = (-1);
        hikariConfig31.setMaximumPoolSize((int) 'a');
        long long37 = hikariConfig31.getLeakDetectionThreshold();
        java.lang.String str38 = hikariConfig31.catalog;
        long long39 = hikariConfig31.getMaxLifetime();
        boolean boolean40 = hikariConfig31.isReadOnly;
        long long41 = hikariConfig31.getIdleTimeout();
        java.util.Properties properties42 = hikariConfig31.getDataSourceProperties();
        hikariConfig24.dataSourceProperties = properties42;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig14.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties42);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-51813" + "'", str15, "HikariPool-51813");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1800000L + "'", long22 == 1800000L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNull(str27);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNull(str38);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 97L + "'", long39 == 97L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test19074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19074");
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
        java.lang.String str25 = hikariConfig1.dataSourceClassName;
        hikariConfig1.leakDetectionThreshold = 3L;
        java.lang.String str28 = hikariConfig1.getConnectionTestQuery();
        int int29 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
    }

    @Test
    public void test19075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19075");
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
        hikariConfig16.setAcquireRetries((int) '#');
        long long23 = hikariConfig16.getAcquireRetryDelay();
        boolean boolean24 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.isJdbc4connectionTest = false;
        hikariConfig16.connectionTestQuery = "HikariPool-4206";
        boolean boolean29 = hikariConfig16.isAutoCommit;
        int int30 = hikariConfig16.acquireRetries;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test19076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19076");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1173";
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        java.lang.String str14 = hikariConfig1.catalog;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test19077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19077");
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
        int int16 = hikariConfig1.acquireRetries;
        hikariConfig1.setAcquireRetryDelay(2147483647L);
        java.lang.String str19 = hikariConfig1.getJdbcUrl();
        boolean boolean20 = hikariConfig1.isRegisterMbeans;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19078");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.connectionTimeout = ' ';
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.leakDetectionThreshold = 100;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test19079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19079");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolationName = "HikariPool-39027";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer4);
    }

    @Test
    public void test19080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19080");
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
        hikariConfig1.setConnectionInitSql("HikariPool-439");
        hikariConfig1.setIdleTimeout(5000L);
        java.lang.String str30 = hikariConfig1.transactionIsolationName;
        java.util.Properties properties31 = null;
        hikariConfig1.dataSourceProperties = properties31;
        java.lang.String str33 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test19081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19081");
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
        long long13 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.addDataSourceProperty("HikariPool-1714", (java.lang.Object) "HikariPool-559");
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.maxPoolSize = (-1);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-51831" + "'", str9, "HikariPool-51831");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
    }

    @Test
    public void test19082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19082");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setTransactionIsolation("HikariPool-100");
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.setPoolName("HikariPool-173");
        hikariConfig1.idleTimeout = 52L;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.connectionInitSql = "hi!";
        hikariConfig17.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig17.transactionIsolation = (byte) 0;
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        long long27 = hikariConfig26.getAcquireRetryDelay();
        hikariConfig26.idleTimeout = (-1);
        java.util.Properties properties30 = hikariConfig26.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties30);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig17.setDataSourceProperties(properties30);
        hikariConfig17.setJdbcUrl("HikariPool-300");
        hikariConfig17.catalog = "HikariPool-908";
        hikariConfig17.jdbcUrl = "HikariPool-1039";
        hikariConfig17.setConnectionTestQuery("HikariPool-968");
        java.util.Properties properties43 = hikariConfig17.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties43;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test19083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19083");
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
        boolean boolean34 = hikariConfig1.isIsolateInternalQueries();
        int int35 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setIdleTimeout(600000L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
    }

    @Test
    public void test19084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19084");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        hikariConfig1.catalog = "HikariPool-11152";
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test19085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19085");
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
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        java.lang.String str16 = hikariConfig1.getJdbcUrl();
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19086");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.minPoolSize = 0;
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        hikariConfig1.isReadOnly = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test19087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19087");
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
        hikariConfig1.setAutoCommit(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties38);
// flaky:         org.junit.Assert.assertEquals("'" + str40 + "' != '" + "HikariPool-51846" + "'", str40, "HikariPool-51846");
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertNull(str50);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
        org.junit.Assert.assertNotNull(properties54);
    }

    @Test
    public void test19088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19088");
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
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str15 = hikariConfig1.getCatalog();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-160" + "'", str15, "HikariPool-160");
    }

    @Test
    public void test19089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19089");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str12 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(100);
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        java.lang.String str16 = hikariConfig1.connectionTestQuery;
        hikariConfig1.isReadOnly = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test19090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19090");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        hikariConfig1.maxPoolSize = 100;
        int int8 = hikariConfig1.getMinimumPoolSize();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.connectionInitSql = "HikariPool-12551";
        java.lang.String str13 = hikariConfig1.catalog;
        boolean boolean14 = hikariConfig1.isReadOnly;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19091");
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
        hikariConfig1.setAcquireRetries((int) (short) 1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test19092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19092");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean14 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19093");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer2 = hikariConfig0.connectionCustomizer;
        hikariConfig0.setReadOnly(false);
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setJdbcUrl("HikariPool-34894");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(iConnectionCustomizer2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test19094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19094");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.leakDetectionThreshold = (-1);
        hikariConfig1.leakDetectionThreshold = 0L;
        hikariConfig1.jdbcUrl = "HikariPool-258";
        long long11 = hikariConfig1.getMaxLifetime();
        boolean boolean12 = hikariConfig1.isAutoCommit;
        hikariConfig1.maxPoolSize = 60;
        long long15 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.idleTimeout = (byte) 100;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 97L + "'", long11 == 97L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
    }

    @Test
    public void test19095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19095");
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
        java.lang.String str54 = hikariConfig53.getJdbcUrl();
        int int55 = hikariConfig53.transactionIsolation;
        boolean boolean56 = hikariConfig53.isReadOnly();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 2147483647L + "'", long41 == 2147483647L);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test19096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19096");
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
        long long14 = hikariConfig10.getConnectionTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-281" + "'", str13, "HikariPool-281");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test19097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19097");
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
        hikariConfig1.setPoolName("HikariPool-279");
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test19098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19098");
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
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isAutoCommit = true;
        int int18 = hikariConfig1.acquireRetries;
        long long19 = hikariConfig1.getMaxLifetime();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test19099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19099");
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
        hikariConfig16.isAutoCommit = false;
        hikariConfig16.setMinimumPoolSize(3);
        long long21 = hikariConfig16.getConnectionTimeout();
        boolean boolean22 = hikariConfig16.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test19100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19100");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout(2147483647L);
        hikariConfig1.minPoolSize = 0;
        long long10 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-449");
        hikariConfig1.isJdbc4connectionTest = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
    }

    @Test
    public void test19101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19101");
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
        hikariConfig14.setCatalog("HikariPool-2795");
        long long20 = hikariConfig14.idleTimeout;
        int int21 = hikariConfig14.getMinimumPoolSize();
        hikariConfig14.idleTimeout = (short) 100;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test19102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19102");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-55";
        int int14 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-55" + "'", str17, "HikariPool-55");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test19103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19103");
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
        hikariConfig10.transactionIsolationName = "HikariPool-31510";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19104");
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
        java.lang.String str18 = hikariConfig1.connectionCustomizerClassName;
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetryDelay(5000L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test19105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19105");
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
        int int36 = hikariConfig1.acquireRetries;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.connectionTimeout = 32;
        hikariConfig1.dataSourceClassName = "HikariPool-4163";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-45" + "'", str11, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test19106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19106");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str16 = hikariConfig15.connectionTestQuery;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig15.setDataSource(dataSource17);
        hikariConfig15.leakDetectionThreshold = 60L;
        int int21 = hikariConfig15.minPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test19107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19107");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-290";
        int int9 = hikariConfig1.getTransactionIsolation();
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        hikariConfig1.leakDetectionThreshold = 60;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        long long16 = hikariConfig15.getAcquireRetryDelay();
        hikariConfig15.connectionInitSql = "hi!";
        hikariConfig15.setTransactionIsolation("hi!");
        hikariConfig15.dataSourceClassName = "HikariPool-291";
        long long23 = hikariConfig15.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = null;
        hikariConfig15.connectionCustomizer = iConnectionCustomizer24;
        hikariConfig15.setAcquireRetries((int) (byte) 1);
        long long28 = hikariConfig15.connectionTimeout;
        hikariConfig1.addDataSourceProperty("HikariPool-528", (java.lang.Object) long28);
        java.lang.String str30 = hikariConfig1.getCatalog();
        hikariConfig1.acquireRetryDelay = 52L;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test19108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19108");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int12 = hikariConfig11.minPoolSize;
        long long13 = hikariConfig11.leakDetectionThreshold;
        long long14 = hikariConfig11.leakDetectionThreshold;
        hikariConfig11.connectionInitSql = "HikariPool-9965";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig11.connectionCustomizer = iConnectionCustomizer17;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test19109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19109");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setLeakDetectionThreshold(1L);
        int int14 = hikariConfig1.maxPoolSize;
        int int15 = hikariConfig1.getAcquireIncrement();
        boolean boolean16 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test19110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19110");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.isReadOnly = false;
        hikariConfig1.maxLifetime = ' ';
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test19111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19111");
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
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.maxPoolSize = (byte) 100;
        int int21 = hikariConfig1.minPoolSize;
        hikariConfig1.connectionInitSql = "HikariPool-1635";
        hikariConfig1.dataSourceClassName = "HikariPool-81";
        java.lang.String str26 = hikariConfig1.getJdbcUrl();
        long long27 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45" + "'", str17, "HikariPool-45");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNull(str26);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1800000L + "'", long27 == 1800000L);
    }

    @Test
    public void test19112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19112");
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
        int int14 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test19113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19113");
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
        javax.sql.DataSource dataSource25 = null;
        hikariConfig1.dataSource = dataSource25;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer27 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer27;
        hikariConfig1.setRegisterMbeans(false);
        long long31 = hikariConfig1.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource32 = hikariConfig1.dataSource;
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNull(dataSource32);
    }

    @Test
    public void test19114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19114");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        long long7 = hikariConfig1.acquireRetryDelay;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.lang.String str10 = hikariConfig9.getDataSourceClassName();
        hikariConfig9.setTransactionIsolation("hi!");
        hikariConfig9.acquireRetryDelay = '4';
        hikariConfig9.setConnectionTimeout((long) (short) 0);
        hikariConfig9.setConnectionTestQuery("HikariPool-45");
        long long19 = hikariConfig9.connectionTimeout;
        hikariConfig9.setMaxLifetime(1L);
        java.lang.String str22 = hikariConfig9.getJdbcUrl();
        hikariConfig9.setUseInstrumentation(true);
        hikariConfig9.setConnectionInitSql("HikariPool-195");
        hikariConfig9.connectionTimeout = 3L;
        java.util.Properties properties29 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig1.dataSourceProperties = properties29;
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2147483647L + "'", long19 == 2147483647L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test19115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19115");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        java.lang.String str4 = hikariConfig1.poolName;
        int int5 = hikariConfig1.acquireIncrement;
        hikariConfig1.idleTimeout = (short) -1;
        hikariConfig1.acquireRetryDelay = 52;
        long long10 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-51907" + "'", str4, "HikariPool-51907");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
    }

    @Test
    public void test19116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19116");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isAutoCommit;
        hikariConfig1.setReadOnly(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test19117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19117");
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
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setJdbc4ConnectionTest(true);
        boolean boolean23 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test19118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19118");
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
        boolean boolean16 = hikariConfig1.isAutoCommit();
        boolean boolean17 = hikariConfig1.isReadOnly;
        int int18 = hikariConfig1.getMinimumPoolSize();
        javax.sql.DataSource dataSource19 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test19119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19119");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        long long5 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setReadOnly(false);
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.poolName = "HikariPool-175";
        hikariConfig1.setConnectionTimeout((long) 100);
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.dataSource = dataSource14;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test19120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19120");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig6.setAcquireRetryDelay((long) 1);
        java.lang.String str9 = hikariConfig6.getConnectionTestQuery();
        java.lang.String str10 = hikariConfig6.poolName;
        hikariConfig6.setConnectionCustomizerClassName("HikariPool-123");
        hikariConfig6.isRegisterMbeans = false;
        hikariConfig6.setAcquireIncrement(358);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-51913" + "'", str10, "HikariPool-51913");
    }

    @Test
    public void test19121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19121");
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
        hikariConfig1.jdbcUrl = "HikariPool-5066";
        hikariConfig1.setIdleTimeout(0L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test19122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19122");
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
        hikariConfig25.isInitializationFailFast = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-51916" + "'", str21, "HikariPool-51916");
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test19123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19123");
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
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig1.connectionCustomizer;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer22;
        java.lang.String str24 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2147483647L + "'", long17 == 2147483647L);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-45" + "'", str19, "HikariPool-45");
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test19124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19124");
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
        hikariConfig1.jdbcUrl = "HikariPool-3108";
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test19125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19125");
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
        int int13 = hikariConfig1.getMaximumPoolSize();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test19126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19126");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setMaxLifetime(60L);
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        long long12 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test19127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19127");
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
        int int18 = hikariConfig1.maxPoolSize;
        hikariConfig1.setIsolateInternalQueries(false);
        hikariConfig1.maxPoolSize = 358;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test19128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19128");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.lang.String str4 = hikariConfig1.getJdbcUrl();
        hikariConfig1.setConnectionInitSql("HikariPool-2529");
        hikariConfig1.connectionCustomizerClassName = "HikariPool-34134";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test19129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19129");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        hikariConfig1.connectionTimeout = '4';
        boolean boolean8 = hikariConfig1.isReadOnly();
        hikariConfig1.setMaxLifetime((long) 0);
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean15 = hikariConfig1.isReadOnly;
        hikariConfig1.setTransactionIsolation("HikariPool-12708");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19130");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        boolean boolean10 = hikariConfig1.isReadOnly();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test19131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19131");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-26095");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-26095 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19132");
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
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        long long17 = hikariConfig16.getAcquireRetryDelay();
        hikariConfig16.connectionInitSql = "hi!";
        hikariConfig16.acquireIncrement = (byte) 100;
        hikariConfig16.setJdbcUrl("");
        hikariConfig16.setConnectionTimeout((long) 100);
        hikariConfig16.connectionTestQuery = "HikariPool-167";
        java.lang.String str28 = hikariConfig16.getConnectionInitSql();
        java.util.Properties properties29 = hikariConfig16.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig31.setRegisterMbeans(true);
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig31);
        hikariConfig31.setConnectionInitSql("HikariPool-1946");
        long long37 = hikariConfig31.getLeakDetectionThreshold();
        boolean boolean38 = hikariConfig31.isReadOnly();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-51928" + "'", str9, "HikariPool-51928");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test19133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19133");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.maxLifetime = 3;
        hikariConfig1.maxPoolSize = 1;
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.poolName = "HikariPool-1840";
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19134");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-291";
        hikariConfig1.setJdbcUrl("HikariPool-2411");
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1175";
        hikariConfig1.catalog = "HikariPool-46365";
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test19135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19135");
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
        hikariConfig1.acquireRetryDelay = (short) -1;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test19136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19136");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.transactionIsolationName = "HikariPool-154";
        hikariConfig1.jdbcUrl = "";
        long long14 = hikariConfig1.idleTimeout;
        long long15 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test19137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19137");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        java.lang.String str10 = hikariConfig1.getJdbcUrl();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test19138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19138");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer18;
        int int20 = hikariConfig1.acquireIncrement;
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test19139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19139");
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
        hikariConfig1.isIsolateInternalQueries = false;
        java.lang.String str17 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setDataSourceClassName("HikariPool-14546");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test19140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19140");
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
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str19 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str20 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaxLifetime((long) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test19141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19141");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-41843");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-41843 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19142");
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
        int int22 = hikariConfig1.maxPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer23;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer25;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
    }

    @Test
    public void test19143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19143");
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
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setReadOnly(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test19144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19144");
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
        java.lang.String str14 = hikariConfig1.getJdbcUrl();
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource20 = hikariConfig17.getDataSource();
        hikariConfig17.connectionTestQuery = "HikariPool-127";
        hikariConfig17.maxLifetime = 3;
        hikariConfig17.setMinimumPoolSize(3);
        java.util.Properties properties27 = hikariConfig17.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig1.dataSourceProperties = properties27;
        hikariConfig1.setJdbc4ConnectionTest(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test19145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19145");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        long long9 = hikariConfig1.acquireRetryDelay;
        int int10 = hikariConfig1.acquireIncrement;
        java.lang.String str11 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-51955" + "'", str11, "HikariPool-51955");
    }

    @Test
    public void test19146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19146");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer4);
    }

    @Test
    public void test19147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19147");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setConnectionTestQuery("HikariPool-45");
        hikariConfig1.setTransactionIsolation("HikariPool-114");
        hikariConfig1.setDataSourceClassName("HikariPool-77");
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.dataSource = dataSource16;
        hikariConfig1.setInitializationFailFast(true);
        long long20 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource15);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 97L + "'", long20 == 97L);
    }

    @Test
    public void test19148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19148");
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
        java.lang.String str19 = hikariConfig1.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test19149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19149");
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
        int int36 = hikariConfig1.transactionIsolation;
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
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test19150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19150");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setUseInstrumentation(false);
        int int7 = hikariConfig1.getAcquireIncrement();
        int int8 = hikariConfig1.acquireRetries;
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.minPoolSize = (short) 0;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test19151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19151");
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
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.minPoolSize = 1;
        hikariConfig1.maxLifetime = (short) 1;
        hikariConfig1.acquireIncrement = 3;
        long long22 = hikariConfig1.getConnectionTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test19152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19152");
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
        hikariConfig14.setUseInstrumentation(false);
        java.lang.String str19 = hikariConfig14.getJdbcUrl();
        java.lang.String str20 = hikariConfig14.catalog;
        long long21 = hikariConfig14.acquireRetryDelay;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test19153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19153");
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
        hikariConfig1.setLeakDetectionThreshold(100L);
        hikariConfig1.setConnectionInitSql("HikariPool-451");
        int int22 = hikariConfig1.transactionIsolation;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test19154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19154");
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
        hikariConfig1.minPoolSize = 100;
        int int16 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setReadOnly(true);
        hikariConfig1.acquireRetryDelay = 60;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test19155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19155");
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
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setJdbcUrl("HikariPool-8085");
        java.lang.String str24 = hikariConfig1.jdbcUrl;
        hikariConfig1.acquireRetries = (-1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2147483647L + "'", long17 == 2147483647L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-8085" + "'", str24, "HikariPool-8085");
    }

    @Test
    public void test19156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19156");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str9 = hikariConfig1.poolName;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        long long12 = hikariConfig11.getAcquireRetryDelay();
        hikariConfig11.connectionInitSql = "hi!";
        hikariConfig11.setTransactionIsolation("hi!");
        hikariConfig11.isInitializationFailFast = true;
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        long long21 = hikariConfig20.getAcquireRetryDelay();
        hikariConfig20.connectionInitSql = "hi!";
        hikariConfig20.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig20.transactionIsolation = (byte) 0;
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        long long30 = hikariConfig29.getAcquireRetryDelay();
        hikariConfig29.idleTimeout = (-1);
        java.util.Properties properties33 = hikariConfig29.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig20.setDataSourceProperties(properties33);
        hikariConfig11.setDataSourceProperties(properties33);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig1.dataSourceProperties = properties33;
        hikariConfig1.setAcquireRetryDelay((long) '#');
        boolean boolean43 = hikariConfig1.isReadOnly();
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        long long46 = hikariConfig45.getAcquireRetryDelay();
        hikariConfig45.connectionInitSql = "hi!";
        hikariConfig45.acquireIncrement = (byte) 100;
        hikariConfig45.setMinimumPoolSize((int) (short) 0);
        java.lang.String str53 = hikariConfig45.dataSourceClassName;
        int int54 = hikariConfig45.transactionIsolation;
        java.lang.String str55 = hikariConfig45.dataSourceClassName;
        hikariConfig45.connectionInitSql = "HikariPool-132";
        java.util.Properties properties58 = hikariConfig45.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties58);
        java.util.Properties properties60 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties60);
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-51974" + "'", str9, "HikariPool-51974");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 32L + "'", long46 == 32L);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertNotNull(properties60);
    }

    @Test
    public void test19157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19157");
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
        hikariConfig1.setMaxLifetime((long) 'a');
        hikariConfig1.connectionTimeout = 'a';
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-51984" + "'", str9, "HikariPool-51984");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19158");
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
        long long21 = hikariConfig14.maxLifetime;
        hikariConfig14.isJdbc4connectionTest = false;
        hikariConfig14.setPoolName("HikariPool-1073");
        hikariConfig14.setReadOnly(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
    }

    @Test
    public void test19159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19159");
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
        long long17 = hikariConfig14.acquireRetryDelay;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertNull(str16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
    }

    @Test
    public void test19160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19160");
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
        hikariConfig1.setMaximumPoolSize((int) ' ');
        hikariConfig1.setJdbcUrl("HikariPool-833");
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        long long20 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setIsolateInternalQueries(true);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-51993" + "'", str9, "HikariPool-51993");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
    }

    @Test
    public void test19161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19161");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setCatalog("HikariPool-3794");
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        int int9 = hikariConfig1.acquireIncrement;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test19162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19162");
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
        int int14 = hikariConfig1.acquireRetries;
        hikariConfig1.leakDetectionThreshold = 358;
        hikariConfig1.connectionTestQuery = "HikariPool-10485";
        hikariConfig1.acquireRetries = 0;
        boolean boolean21 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-51995" + "'", str9, "HikariPool-51995");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test19163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19163");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        hikariConfig1.setIdleTimeout((long) 100);
        hikariConfig1.isReadOnly = true;
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.dataSourceClassName = "HikariPool-29953";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test19164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19164");
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
        hikariConfig1.isReadOnly = false;
        java.lang.String str28 = hikariConfig1.getPoolName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-51997" + "'", str23, "HikariPool-51997");
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-51997" + "'", str28, "HikariPool-51997");
    }

    @Test
    public void test19165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19165");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.jdbcUrl;
        hikariConfig10.setAutoCommit(false);
        int int14 = hikariConfig10.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig10.connectionCustomizer;
        hikariConfig10.connectionTestQuery = "";
        hikariConfig10.setAutoCommit(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
    }

    @Test
    public void test19166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19166");
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
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-52004" + "'", str10, "HikariPool-52004");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test19167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19167");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetryDelay((long) 10);
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setJdbcUrl("HikariPool-567");
        hikariConfig1.setPoolName("HikariPool-15191");
        hikariConfig1.setInitializationFailFast(false);
        long long16 = hikariConfig1.connectionTimeout;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-30676");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-30676' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test19168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19168");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries;
        long long14 = hikariConfig1.idleTimeout;
        java.lang.String str15 = hikariConfig1.poolName;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.idleTimeout = (-1);
        hikariConfig17.setMaximumPoolSize((int) 'a');
        long long23 = hikariConfig17.acquireRetryDelay;
        long long24 = hikariConfig17.leakDetectionThreshold;
        javax.sql.DataSource dataSource25 = hikariConfig17.getDataSource();
        hikariConfig17.connectionTestQuery = "HikariPool-273";
        int int28 = hikariConfig17.getTransactionIsolation();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        long long31 = hikariConfig30.getAcquireRetryDelay();
        hikariConfig30.idleTimeout = (-1);
        java.util.Properties properties34 = hikariConfig30.getDataSourceProperties();
        hikariConfig17.dataSourceProperties = properties34;
        hikariConfig1.dataSourceProperties = properties34;
        hikariConfig1.isReadOnly = true;
        java.lang.String str39 = hikariConfig1.getJdbcUrl();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-52006" + "'", str15, "HikariPool-52006");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test19169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19169");
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
        hikariConfig1.setDataSourceClassName("");
        boolean boolean20 = hikariConfig1.isAutoCommit;
        int int21 = hikariConfig1.acquireRetries;
        javax.sql.DataSource dataSource22 = hikariConfig1.getDataSource();
        long long23 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45" + "'", str16, "HikariPool-45");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test19170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19170");
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
        hikariConfig10.setJdbcUrl("HikariPool-753");
        hikariConfig10.setUseInstrumentation(false);
        int int19 = hikariConfig10.acquireRetries;
        java.lang.String str20 = hikariConfig10.getCatalog();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test19171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19171");
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
        hikariConfig28.setIdleTimeout(600000L);
        hikariConfig28.setAutoCommit(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test19172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19172");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.maxLifetime = 3;
        hikariConfig1.maxPoolSize = 1;
        boolean boolean11 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test19173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19173");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str6 = hikariConfig1.transactionIsolationName;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test19174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19174");
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
        hikariConfig1.setAutoCommit(false);
        boolean boolean20 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean21 = hikariConfig1.isReadOnly();
        java.lang.String str22 = hikariConfig1.jdbcUrl;
        int int23 = hikariConfig1.getMinimumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-45" + "'", str22, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test19175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19175");
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
        boolean boolean17 = hikariConfig1.isAutoCommit;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        int int19 = hikariConfig1.getAcquireIncrement();
        java.lang.String str20 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test19176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19176");
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
        java.lang.String str14 = hikariConfig1.getCatalog();
        hikariConfig1.dataSourceClassName = "HikariPool-8925";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-8719");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-8719' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test19177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19177");
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
        hikariConfig1.connectionTestQuery = "HikariPool-609";
        int int16 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test19178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19178");
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
        long long26 = hikariConfig1.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
    }

    @Test
    public void test19179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19179");
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
        hikariConfig14.acquireRetries = (byte) 1;
        javax.sql.DataSource dataSource22 = null;
        hikariConfig14.setDataSource(dataSource22);
        long long24 = hikariConfig14.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
    }

    @Test
    public void test19180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19180");
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
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        long long32 = hikariConfig31.getAcquireRetryDelay();
        hikariConfig31.connectionInitSql = "hi!";
        hikariConfig31.acquireIncrement = (byte) 100;
        hikariConfig31.setMinimumPoolSize((int) (short) 0);
        java.lang.String str39 = hikariConfig31.dataSourceClassName;
        long long40 = hikariConfig31.getAcquireRetryDelay();
        hikariConfig31.idleTimeout = (byte) -1;
        java.util.Properties properties43 = hikariConfig31.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        java.lang.String str45 = hikariConfig44.getPoolName();
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        long long48 = hikariConfig47.getAcquireRetryDelay();
        hikariConfig47.connectionInitSql = "hi!";
        hikariConfig47.acquireIncrement = (byte) 100;
        hikariConfig47.setMinimumPoolSize((int) (short) 0);
        java.lang.String str55 = hikariConfig47.dataSourceClassName;
        long long56 = hikariConfig47.getAcquireRetryDelay();
        hikariConfig47.idleTimeout = (byte) -1;
        java.util.Properties properties59 = hikariConfig47.dataSourceProperties;
        hikariConfig44.setDataSourceProperties(properties59);
        hikariConfig1.dataSourceProperties = properties59;
        hikariConfig1.leakDetectionThreshold = 100L;
        hikariConfig1.connectionCustomizerClassName = "";
        hikariConfig1.isIsolateInternalQueries = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str29);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertNull(str39);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
        org.junit.Assert.assertNotNull(properties43);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HikariPool-52031" + "'", str45, "HikariPool-52031");
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 32L + "'", long48 == 32L);
        org.junit.Assert.assertNull(str55);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 32L + "'", long56 == 32L);
        org.junit.Assert.assertNotNull(properties59);
    }

    @Test
    public void test19181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19181");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        java.lang.String str3 = hikariConfig1.jdbcUrl;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIdleTimeout(0L);
        int int7 = hikariConfig1.acquireRetries;
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test19182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19182");
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
        int int21 = hikariConfig1.minPoolSize;
        long long22 = hikariConfig1.connectionTimeout;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-829");
        hikariConfig1.setTransactionIsolation("HikariPool-14741");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test19183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19183");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        java.lang.String str5 = hikariConfig1.catalog;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-63";
        hikariConfig1.setConnectionInitSql("HikariPool-21151");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test19184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19184");
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
        hikariConfig10.setAcquireRetryDelay((long) 0);
        hikariConfig10.setAcquireRetryDelay((long) (short) 1);
        boolean boolean21 = hikariConfig10.isInitializationFailFast;
        hikariConfig10.setUseInstrumentation(false);
        hikariConfig10.connectionInitSql = "HikariPool-111";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test19185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19185");
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
        int int13 = hikariConfig1.getAcquireIncrement();
        java.lang.String str14 = hikariConfig1.poolName;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        java.lang.String str17 = hikariConfig16.getDataSourceClassName();
        hikariConfig16.setTransactionIsolation("hi!");
        hikariConfig16.acquireRetryDelay = '4';
        hikariConfig16.setConnectionCustomizerClassName("");
        java.lang.String str24 = hikariConfig16.getPoolName();
        long long25 = hikariConfig16.getLeakDetectionThreshold();
        hikariConfig16.transactionIsolationName = "HikariPool-55";
        java.lang.String str28 = hikariConfig16.getPoolName();
        hikariConfig16.setConnectionCustomizerClassName("");
        hikariConfig16.jdbcUrl = "HikariPool-55";
        hikariConfig16.maxPoolSize = 10;
        java.util.Properties properties35 = hikariConfig16.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-52040" + "'", str14, "HikariPool-52040");
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-52041" + "'", str24, "HikariPool-52041");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-52041" + "'", str28, "HikariPool-52041");
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test19186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19186");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        java.lang.String str9 = hikariConfig8.getDataSourceClassName();
        hikariConfig8.setTransactionIsolation("hi!");
        hikariConfig8.acquireRetryDelay = '4';
        hikariConfig8.setConnectionCustomizerClassName("");
        java.lang.String str16 = hikariConfig8.getPoolName();
        hikariConfig8.catalog = "HikariPool-84";
        hikariConfig8.isRegisterMbeans = true;
        hikariConfig8.maxLifetime = 97;
        hikariConfig8.setRegisterMbeans(true);
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        java.lang.String str27 = hikariConfig26.getDataSourceClassName();
        hikariConfig26.setTransactionIsolation("hi!");
        hikariConfig26.acquireRetryDelay = '4';
        hikariConfig26.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties34 = hikariConfig26.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig8.setDataSourceProperties(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties34);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-52044" + "'", str16, "HikariPool-52044");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test19187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19187");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setReadOnly(false);
        long long8 = hikariConfig1.getIdleTimeout();
        long long9 = hikariConfig1.maxLifetime;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setTransactionIsolation("HikariPool-36673");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        hikariConfig14.setInitializationFailFast(false);
        java.lang.String str18 = hikariConfig14.getConnectionInitSql();
        java.lang.String str19 = hikariConfig14.jdbcUrl;
        hikariConfig14.maxPoolSize = 358;
        hikariConfig14.setJdbc4ConnectionTest(true);
        java.util.Properties properties24 = hikariConfig14.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties24);
        hikariConfig1.leakDetectionThreshold = 97;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test19188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19188");
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
        hikariConfig10.connectionTimeout = 1800000L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test19189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19189");
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
        hikariConfig1.isIsolateInternalQueries = false;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test19190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19190");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        long long3 = hikariConfig1.idleTimeout;
        long long4 = hikariConfig1.maxLifetime;
        hikariConfig1.connectionInitSql = "HikariPool-134";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1800000L + "'", long3 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
    }

    @Test
    public void test19191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19191");
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
        java.lang.String str26 = hikariConfig1.jdbcUrl;
        hikariConfig1.isAutoCommit = false;
        boolean boolean29 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52056" + "'", str9, "HikariPool-52056");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-52056" + "'", str13, "HikariPool-52056");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test19192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19192");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.connectionInitSql = "HikariPool-1936";
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19193");
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
        hikariConfig1.minPoolSize = (short) -1;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.idleTimeout = (-1);
        java.util.Properties properties29 = hikariConfig25.getDataSourceProperties();
        long long30 = hikariConfig25.maxLifetime;
        hikariConfig25.setConnectionInitSql("");
        int int33 = hikariConfig25.acquireRetries;
        hikariConfig25.leakDetectionThreshold = (-1);
        java.util.Properties properties36 = hikariConfig25.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig1.dataSourceProperties = properties36;
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        hikariConfig1.dataSourceClassName = "HikariPool-1196";
        hikariConfig1.setRegisterMbeans(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNotNull(properties29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test19194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19194");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-13717");
        long long31 = hikariConfig1.idleTimeout;
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
    }

    @Test
    public void test19195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19195");
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
        java.lang.String str35 = hikariConfig30.getCatalog();
        hikariConfig30.setTransactionIsolation("HikariPool-236");
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        boolean boolean40 = hikariConfig39.isInitializationFailFast();
        java.lang.String str41 = hikariConfig39.jdbcUrl;
        long long42 = hikariConfig39.idleTimeout;
        hikariConfig39.transactionIsolation = (short) 0;
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        long long47 = hikariConfig46.getAcquireRetryDelay();
        hikariConfig46.idleTimeout = (-1);
        hikariConfig46.setMaximumPoolSize((int) 'a');
        long long52 = hikariConfig46.getLeakDetectionThreshold();
        java.lang.String str53 = hikariConfig46.jdbcUrl;
        java.lang.String str54 = hikariConfig46.jdbcUrl;
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        java.lang.String str57 = hikariConfig56.getDataSourceClassName();
        int int58 = hikariConfig56.getAcquireRetries();
        hikariConfig56.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource61 = null;
        hikariConfig56.setDataSource(dataSource61);
        java.lang.String str63 = hikariConfig56.getConnectionTestQuery();
        java.util.Properties properties64 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties64);
        long long66 = hikariConfig65.getAcquireRetryDelay();
        hikariConfig65.connectionInitSql = "hi!";
        hikariConfig65.acquireIncrement = (byte) 100;
        hikariConfig65.setMinimumPoolSize((int) (short) 0);
        hikariConfig65.connectionTestQuery = "";
        hikariConfig65.jdbcUrl = "HikariPool-45";
        hikariConfig65.isReadOnly = false;
        hikariConfig65.setPoolName("");
        java.lang.String str81 = hikariConfig65.getConnectionTestQuery();
        java.util.Properties properties82 = hikariConfig65.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig83 = new com.zaxxer.hikari.HikariConfig(properties82);
        hikariConfig56.setDataSourceProperties(properties82);
        com.zaxxer.hikari.HikariConfig hikariConfig85 = new com.zaxxer.hikari.HikariConfig(properties82);
        hikariConfig46.dataSourceProperties = properties82;
        com.zaxxer.hikari.HikariConfig hikariConfig87 = new com.zaxxer.hikari.HikariConfig(properties82);
        hikariConfig39.dataSourceProperties = properties82;
        hikariConfig30.dataSourceProperties = properties82;
        com.zaxxer.hikari.HikariConfig hikariConfig90 = new com.zaxxer.hikari.HikariConfig(properties82);
        com.zaxxer.hikari.HikariConfig hikariConfig91 = new com.zaxxer.hikari.HikariConfig(properties82);
        com.zaxxer.hikari.HikariConfig hikariConfig92 = new com.zaxxer.hikari.HikariConfig(properties82);
        hikariConfig92.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1800000L + "'", long42 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 32L + "'", long47 == 32L);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertNull(str63);
// flaky:         org.junit.Assert.assertTrue("'" + long66 + "' != '" + 32L + "'", long66 == 32L);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertNotNull(properties82);
    }

    @Test
    public void test19196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19196");
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
        java.util.Properties properties19 = hikariConfig1.dataSourceProperties;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test19197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19197");
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
        boolean boolean21 = hikariConfig1.isIsolateInternalQueries();
        java.lang.String str22 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test19198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19198");
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
        hikariConfig1.minPoolSize = (short) -1;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.idleTimeout = (-1);
        java.util.Properties properties29 = hikariConfig25.getDataSourceProperties();
        long long30 = hikariConfig25.maxLifetime;
        hikariConfig25.setConnectionInitSql("");
        int int33 = hikariConfig25.acquireRetries;
        hikariConfig25.leakDetectionThreshold = (-1);
        java.util.Properties properties36 = hikariConfig25.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig1.dataSourceProperties = properties36;
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        java.lang.String str41 = hikariConfig1.poolName;
        hikariConfig1.setReadOnly(true);
        hikariConfig1.dataSourceClassName = "HikariPool-36118";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNotNull(properties29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(properties36);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "HikariPool-52079" + "'", str41, "HikariPool-52079");
    }

    @Test
    public void test19199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19199");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.setDataSource(dataSource5);
        hikariConfig1.idleTimeout = 600000L;
        long long9 = hikariConfig1.idleTimeout;
        boolean boolean10 = hikariConfig1.isAutoCommit();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        long long13 = hikariConfig12.getAcquireRetryDelay();
        hikariConfig12.idleTimeout = (-1);
        hikariConfig12.setMaximumPoolSize((int) 'a');
        long long18 = hikariConfig12.getLeakDetectionThreshold();
        java.lang.String str19 = hikariConfig12.jdbcUrl;
        java.lang.String str20 = hikariConfig12.jdbcUrl;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        java.lang.String str23 = hikariConfig22.getDataSourceClassName();
        int int24 = hikariConfig22.getAcquireRetries();
        hikariConfig22.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource27 = null;
        hikariConfig22.setDataSource(dataSource27);
        java.lang.String str29 = hikariConfig22.getConnectionTestQuery();
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        long long32 = hikariConfig31.getAcquireRetryDelay();
        hikariConfig31.connectionInitSql = "hi!";
        hikariConfig31.acquireIncrement = (byte) 100;
        hikariConfig31.setMinimumPoolSize((int) (short) 0);
        hikariConfig31.connectionTestQuery = "";
        hikariConfig31.jdbcUrl = "HikariPool-45";
        hikariConfig31.isReadOnly = false;
        hikariConfig31.setPoolName("");
        java.lang.String str47 = hikariConfig31.getConnectionTestQuery();
        java.util.Properties properties48 = hikariConfig31.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        hikariConfig22.setDataSourceProperties(properties48);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties48);
        hikariConfig12.dataSourceProperties = properties48;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties48);
        hikariConfig1.setDataSourceProperties(properties48);
        boolean boolean55 = hikariConfig1.isRegisterMbeans();
        java.lang.String str56 = hikariConfig1.connectionTestQuery;
        java.lang.String str57 = hikariConfig1.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 600000L + "'", long9 == 600000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNull(str29);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 32L + "'", long32 == 32L);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test19200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19200");
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
        long long19 = hikariConfig1.getMaxLifetime();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
    }

    @Test
    public void test19201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19201");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2183");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2183 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19202");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.dataSourceClassName = "HikariPool-876";
        hikariConfig1.acquireIncrement = 100;
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        long long15 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-876" + "'", str12, "HikariPool-876");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test19203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19203");
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
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setReadOnly(true);
        java.lang.String str16 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test19204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19204");
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
        java.lang.String str41 = hikariConfig37.poolName;
        hikariConfig37.maxLifetime = 97;
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
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "HikariPool-52100" + "'", str41, "HikariPool-52100");
    }

    @Test
    public void test19205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19205");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionInitSql("");
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.isAutoCommit = false;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        hikariConfig1.maxPoolSize = (byte) -1;
        boolean boolean16 = hikariConfig1.isIsolateInternalQueries();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19206");
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
        hikariConfig1.setAcquireRetryDelay(0L);
        long long24 = hikariConfig1.getMaxLifetime();
        hikariConfig1.poolName = "HikariPool-226";
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 97L + "'", long24 == 97L);
    }

    @Test
    public void test19207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19207");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        long long9 = hikariConfig1.idleTimeout;
        long long10 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        long long13 = hikariConfig12.getAcquireRetryDelay();
        hikariConfig12.idleTimeout = (-1);
        hikariConfig12.setMaximumPoolSize((int) 'a');
        java.lang.String str18 = hikariConfig12.catalog;
        boolean boolean19 = hikariConfig12.isJdbc4ConnectionTest();
        hikariConfig12.setMinimumPoolSize(0);
        int int22 = hikariConfig12.getMaximumPoolSize();
        hikariConfig12.acquireRetries = 97;
        boolean boolean25 = hikariConfig12.isInitializationFailFast;
        hikariConfig12.setAutoCommit(true);
        java.util.Properties properties28 = hikariConfig12.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig1.setDataSourceProperties(properties28);
        long long31 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(properties28);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 97L + "'", long31 == 97L);
    }

    @Test
    public void test19208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19208");
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
        long long21 = hikariConfig1.maxLifetime;
        int int22 = hikariConfig1.getAcquireRetries();
        boolean boolean23 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean24 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52108" + "'", str9, "HikariPool-52108");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-52108" + "'", str13, "HikariPool-52108");
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test19209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19209");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.connectionTestQuery = "HikariPool-128";
        int int13 = hikariConfig1.getMaximumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test19210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19210");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionTimeout = (byte) -1;
        int int14 = hikariConfig1.acquireRetries;
        hikariConfig1.setCatalog("HikariPool-1223");
        boolean boolean17 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str18 = hikariConfig1.catalog;
        long long19 = hikariConfig1.connectionTimeout;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.dataSourceClassName = "hi!";
        hikariConfig22.setRegisterMbeans(false);
        long long28 = hikariConfig22.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = hikariConfig22.connectionCustomizer;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-11684", (java.lang.Object) iConnectionCustomizer29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-1223" + "'", str18, "HikariPool-1223");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer29);
    }

    @Test
    public void test19211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19211");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setAcquireRetryDelay(60L);
        java.lang.String str12 = hikariConfig1.connectionInitSql;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test19212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19212");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireRetries(100);
        int int6 = hikariConfig1.maxPoolSize;
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.acquireRetryDelay = 60;
        int int12 = hikariConfig1.acquireRetries;
        hikariConfig1.connectionTestQuery = "HikariPool-3734";
        hikariConfig1.setDataSourceClassName("HikariPool-30901");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test19213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19213");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        hikariConfig1.setPoolName("HikariPool-159");
        hikariConfig1.connectionTestQuery = "HikariPool-429";
        long long12 = hikariConfig1.getConnectionTimeout();
        long long13 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(dataSource7);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test19214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19214");
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
        int int19 = hikariConfig1.acquireRetries;
        hikariConfig1.setAcquireRetryDelay(600000L);
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test19215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19215");
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
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.idleTimeout = 750L;
        hikariConfig1.isReadOnly = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45" + "'", str16, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test19216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19216");
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
        java.lang.String str17 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test19217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19217");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties5);
        java.util.Properties properties9 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties9);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test19218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19218");
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
        boolean boolean15 = hikariConfig1.isReadOnly;
        hikariConfig1.connectionTimeout = 5000L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19219");
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
        long long36 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
    }

    @Test
    public void test19220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19220");
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
        java.lang.String str27 = hikariConfig25.getJdbcUrl();
        long long28 = hikariConfig25.getConnectionTimeout();
        java.lang.String str29 = hikariConfig25.poolName;
        boolean boolean30 = hikariConfig25.isAutoCommit();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertNull(str27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-52138" + "'", str29, "HikariPool-52138");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test19221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19221");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        java.lang.String str5 = hikariConfig1.getPoolName();
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        hikariConfig1.leakDetectionThreshold = 35L;
        hikariConfig1.connectionInitSql = "HikariPool-3536";
        hikariConfig1.setJdbcUrl("HikariPool-9772");
        hikariConfig1.isReadOnly = true;
        hikariConfig1.setTransactionIsolation("HikariPool-7103");
        hikariConfig1.leakDetectionThreshold = 358L;
        hikariConfig1.transactionIsolation = (-1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-52139" + "'", str5, "HikariPool-52139");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test19222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19222");
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
        hikariConfig10.setAcquireRetryDelay((long) 0);
        java.lang.String str19 = hikariConfig10.getJdbcUrl();
        javax.sql.DataSource dataSource20 = hikariConfig10.getDataSource();
        long long21 = hikariConfig10.maxLifetime;
        hikariConfig10.setDataSourceClassName("HikariPool-28431");
        hikariConfig10.maxPoolSize = 100;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-279" + "'", str19, "HikariPool-279");
        org.junit.Assert.assertNull(dataSource20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 97L + "'", long21 == 97L);
    }

    @Test
    public void test19223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19223");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.maxLifetime = (-1L);
        hikariConfig1.setAcquireRetryDelay(2147483647L);
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionTimeout = (short) 100;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
    }

    @Test
    public void test19224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19224");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.poolName = "HikariPool-127";
        int int10 = hikariConfig1.minPoolSize;
        int int11 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isAutoCommit = true;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource18 = hikariConfig15.getDataSource();
        hikariConfig15.connectionTestQuery = "HikariPool-55";
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        boolean boolean23 = hikariConfig22.isInitializationFailFast();
        hikariConfig22.setInitializationFailFast(false);
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.lang.String str28 = hikariConfig27.getDataSourceClassName();
        hikariConfig27.setTransactionIsolation("hi!");
        hikariConfig27.acquireRetryDelay = '4';
        hikariConfig27.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties35 = hikariConfig27.getDataSourceProperties();
        hikariConfig22.setDataSourceProperties(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig15.setDataSourceProperties(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig1.setDataSourceProperties(properties35);
        hikariConfig1.acquireRetryDelay = 60L;
        boolean boolean44 = hikariConfig1.isIsolateInternalQueries;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test19225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19225");
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
        hikariConfig1.transactionIsolationName = "HikariPool-639";
        long long21 = hikariConfig1.getIdleTimeout();
        boolean boolean22 = hikariConfig1.isJdbc4connectionTest;
        int int23 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52150" + "'", str9, "HikariPool-52150");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test19226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19226");
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
        hikariConfig1.setLeakDetectionThreshold(2147483647L);
        int int24 = hikariConfig1.acquireRetries;
        boolean boolean25 = hikariConfig1.isReadOnly();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test19227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19227");
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
        long long22 = hikariConfig16.getLeakDetectionThreshold();
        javax.sql.DataSource dataSource23 = null;
        hikariConfig16.dataSource = dataSource23;
        java.lang.String str25 = hikariConfig16.dataSourceClassName;
        hikariConfig16.setJdbcUrl("HikariPool-1024");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test19228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19228");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.dataSourceClassName = "";
        java.lang.String str14 = hikariConfig1.poolName;
        int int15 = hikariConfig1.acquireRetries;
        hikariConfig1.setJdbcUrl("HikariPool-14546");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-52155" + "'", str14, "HikariPool-52155");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test19229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19229");
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
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAutoCommit(true);
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str17 = hikariConfig1.poolName;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.connectionInitSql = "hi!";
        hikariConfig19.acquireIncrement = (byte) 100;
        hikariConfig19.setJdbcUrl("");
        hikariConfig19.setConnectionTimeout((long) 100);
        hikariConfig19.connectionTestQuery = "HikariPool-167";
        java.lang.String str31 = hikariConfig19.getConnectionInitSql();
        java.util.Properties properties32 = hikariConfig19.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        javax.sql.DataSource dataSource35 = hikariConfig34.dataSource;
        hikariConfig34.setTransactionIsolation("HikariPool-140");
        hikariConfig34.setJdbc4ConnectionTest(false);
        java.util.Properties properties40 = hikariConfig34.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties40);
        long long42 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(dataSource15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-52156" + "'", str17, "HikariPool-52156");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(dataSource35);
        org.junit.Assert.assertNotNull(properties40);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 97L + "'", long42 == 97L);
    }

    @Test
    public void test19230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19230");
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
        hikariConfig1.acquireRetryDelay = 1;
        java.util.Properties properties18 = hikariConfig1.dataSourceProperties;
        javax.sql.DataSource dataSource19 = hikariConfig1.dataSource;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test19231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19231");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.getIdleTimeout();
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test19232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19232");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout(2147483647L);
        hikariConfig1.minPoolSize = 0;
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMaximumPoolSize(100);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(false);
        boolean boolean20 = hikariConfig16.isReadOnly();
        long long21 = hikariConfig16.getAcquireRetryDelay();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        java.lang.String str24 = hikariConfig23.getDataSourceClassName();
        int int25 = hikariConfig23.getAcquireRetries();
        hikariConfig23.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig23.setDataSource(dataSource28);
        java.lang.String str30 = hikariConfig23.getConnectionTestQuery();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        long long33 = hikariConfig32.getAcquireRetryDelay();
        hikariConfig32.connectionInitSql = "hi!";
        hikariConfig32.acquireIncrement = (byte) 100;
        hikariConfig32.setMinimumPoolSize((int) (short) 0);
        hikariConfig32.connectionTestQuery = "";
        hikariConfig32.jdbcUrl = "HikariPool-45";
        hikariConfig32.isReadOnly = false;
        hikariConfig32.setPoolName("");
        java.lang.String str48 = hikariConfig32.getConnectionTestQuery();
        java.util.Properties properties49 = hikariConfig32.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig23.setDataSourceProperties(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties49);
        java.util.Properties properties53 = hikariConfig52.dataSourceProperties;
        hikariConfig16.setDataSourceProperties(properties53);
        hikariConfig1.dataSourceProperties = properties53;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties53);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties53);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNull(str30);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertNotNull(properties53);
    }

    @Test
    public void test19233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19233");
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
        hikariConfig1.setMaxLifetime((long) 'a');
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        long long19 = hikariConfig1.getIdleTimeout();
        long long20 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52175" + "'", str9, "HikariPool-52175");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test19234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19234");
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
        long long14 = hikariConfig1.getConnectionTimeout();
        int int15 = hikariConfig1.transactionIsolation;
        java.lang.String str16 = hikariConfig1.transactionIsolationName;
        boolean boolean17 = hikariConfig1.isAutoCommit;
        hikariConfig1.maxLifetime = 1800000L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19235");
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
        hikariConfig1.acquireIncrement = (short) 0;
        hikariConfig1.isIsolateInternalQueries = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test19236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19236");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.connectionInitSql = "HikariPool-487";
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.connectionInitSql = "HikariPool-12966";
        hikariConfig1.isReadOnly = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19237");
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
        java.lang.String str16 = hikariConfig15.getDataSourceClassName();
        hikariConfig15.setMinimumPoolSize(3);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test19238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19238");
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
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long27 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
    }

    @Test
    public void test19239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19239");
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
        hikariConfig1.isRegisterMbeans = true;
        int int18 = hikariConfig1.getMaximumPoolSize();
        long long19 = hikariConfig1.getMaxLifetime();
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAcquireRetries(3);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test19240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19240");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        hikariConfig1.idleTimeout = 100L;
        long long13 = hikariConfig1.idleTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test19241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19241");
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
        boolean boolean15 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.connectionInitSql = "HikariPool-2183";
        boolean boolean18 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setMinimumPoolSize(97);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19242");
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
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource17 = hikariConfig14.getDataSource();
        hikariConfig14.connectionTestQuery = "HikariPool-55";
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        boolean boolean22 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.setInitializationFailFast(false);
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        java.lang.String str27 = hikariConfig26.getDataSourceClassName();
        hikariConfig26.setTransactionIsolation("hi!");
        hikariConfig26.acquireRetryDelay = '4';
        hikariConfig26.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties34 = hikariConfig26.getDataSourceProperties();
        hikariConfig21.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig14.setDataSourceProperties(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        hikariConfig1.acquireRetryDelay = (short) 100;
        int int41 = hikariConfig1.maxPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
    }

    @Test
    public void test19243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19243");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        long long7 = hikariConfig1.connectionTimeout;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.setJdbcUrl("HikariPool-833");
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.maxPoolSize = 358;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19244");
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
        java.lang.String str13 = hikariConfig1.poolName;
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        long long15 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setAcquireRetries((int) 'a');
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52197" + "'", str9, "HikariPool-52197");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-52197" + "'", str13, "HikariPool-52197");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19245");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-14079");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-14079 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19246");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.isReadOnly = false;
        hikariConfig1.isReadOnly = true;
        hikariConfig1.setMaxLifetime((long) (-1));
        java.lang.String str9 = hikariConfig1.getJdbcUrl();
        hikariConfig1.jdbcUrl = "HikariPool-2281";
        hikariConfig1.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test19247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19247");
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
        hikariConfig1.isAutoCommit = true;
        java.lang.String str47 = hikariConfig1.getCatalog();
        hikariConfig1.isRegisterMbeans = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-52200" + "'", str17, "HikariPool-52200");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertNull(dataSource38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test19248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19248");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.setConnectionTimeout((long) 358);
        hikariConfig1.isAutoCommit = true;
        boolean boolean11 = hikariConfig1.isReadOnly();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str14 = hikariConfig13.getDataSourceClassName();
        int int15 = hikariConfig13.getAcquireRetries();
        java.util.Properties properties16 = hikariConfig13.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties16);
        hikariConfig1.acquireRetryDelay = (byte) 0;
        hikariConfig1.setCatalog("HikariPool-51096");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test19249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19249");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-960");
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.setDataSource(dataSource19);
        javax.sql.DataSource dataSource21 = hikariConfig1.getDataSource();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(dataSource21);
    }

    @Test
    public void test19250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19250");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(0);
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.maxPoolSize = (byte) 0;
        java.util.Properties properties17 = hikariConfig14.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean20 = hikariConfig19.isReadOnly();
        boolean boolean21 = hikariConfig19.isInitializationFailFast;
        java.lang.String str22 = hikariConfig19.getPoolName();
        hikariConfig1.addDataSourceProperty("HikariPool-6821", (java.lang.Object) hikariConfig19);
        java.lang.String str24 = hikariConfig1.connectionTestQuery;
        int int25 = hikariConfig1.getMaximumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-52208" + "'", str22, "HikariPool-52208");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
    }

    @Test
    public void test19251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19251");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setIdleTimeout(2147483647L);
        hikariConfig1.setCatalog("HikariPool-26");
        java.lang.String str15 = hikariConfig1.jdbcUrl;
        boolean boolean16 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test19252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19252");
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
        int int21 = hikariConfig1.getMinimumPoolSize();
        long long22 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45" + "'", str16, "HikariPool-45");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 52L + "'", long22 == 52L);
    }

    @Test
    public void test19253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19253");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isAutoCommit;
        long long10 = hikariConfig1.leakDetectionThreshold;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetries((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test19254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19254");
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
        hikariConfig29.setJdbc4ConnectionTest(false);
        hikariConfig29.maxLifetime = (-1);
        java.lang.String str34 = hikariConfig29.dataSourceClassName;
        hikariConfig29.setCatalog("");
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        long long39 = hikariConfig38.getAcquireRetryDelay();
        hikariConfig38.connectionInitSql = "hi!";
        hikariConfig38.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig38.transactionIsolation = (byte) 0;
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        long long48 = hikariConfig47.getAcquireRetryDelay();
        hikariConfig47.idleTimeout = (-1);
        java.util.Properties properties51 = hikariConfig47.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig38.setDataSourceProperties(properties51);
        boolean boolean56 = hikariConfig38.isInitializationFailFast;
        hikariConfig38.isInitializationFailFast = false;
        hikariConfig38.acquireIncrement = (byte) 0;
        java.lang.String str61 = hikariConfig38.poolName;
        hikariConfig38.acquireRetries = (byte) 10;
        java.util.Properties properties64 = hikariConfig38.dataSourceProperties;
        hikariConfig29.setDataSourceProperties(properties64);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 32L + "'", long48 == 32L);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str61 + "' != '" + "HikariPool-52219" + "'", str61, "HikariPool-52219");
        org.junit.Assert.assertNotNull(properties64);
    }

    @Test
    public void test19255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19255");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.acquireRetries = 358;
        long long11 = hikariConfig1.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test19256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19256");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.catalog = "HikariPool-84";
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean14 = hikariConfig1.isAutoCommit;
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str17 = hikariConfig1.catalog;
        boolean boolean18 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52225" + "'", str9, "HikariPool-52225");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-84" + "'", str17, "HikariPool-84");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test19257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19257");
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
        boolean boolean36 = hikariConfig1.isAutoCommit();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test19258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19258");
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
        java.lang.String str15 = hikariConfig14.catalog;
        long long16 = hikariConfig14.getAcquireRetryDelay();
        hikariConfig14.setReadOnly(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test19259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19259");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setReadOnly(true);
        hikariConfig1.poolName = "HikariPool-29";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1615");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test19260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19260");
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
        hikariConfig1.setAcquireIncrement(10);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test19261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19261");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test19262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19262");
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
        java.lang.String str21 = hikariConfig1.getDataSourceClassName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test19263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19263");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.minPoolSize = (short) 100;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test19264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19264");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.poolName = "HikariPool-127";
        long long10 = hikariConfig1.getIdleTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolation = '#';
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        int int15 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test19265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19265");
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
        hikariConfig1.setLeakDetectionThreshold(5000L);
        int int17 = hikariConfig1.transactionIsolation;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test19266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19266");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        hikariConfig1.setTransactionIsolation("HikariPool-195");
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        java.lang.String str11 = hikariConfig10.jdbcUrl;
        java.lang.String str12 = hikariConfig10.connectionCustomizerClassName;
        java.lang.String str13 = hikariConfig10.getDataSourceClassName();
        int int14 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.acquireRetries = 0;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test19267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19267");
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
        int int14 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setIsolateInternalQueries(false);
        long long17 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
    }

    @Test
    public void test19268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19268");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setTransactionIsolation("HikariPool-281");
        boolean boolean11 = hikariConfig1.isAutoCommit();
        java.lang.String str12 = hikariConfig1.connectionInitSql;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test19269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19269");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        long long6 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold(750L);
        int int9 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.connectionTestQuery = "HikariPool-77";
        java.lang.String str12 = hikariConfig1.getJdbcUrl();
        int int13 = hikariConfig1.maxPoolSize;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test19270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19270");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        long long7 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.acquireRetries = (byte) 0;
        hikariConfig1.validate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
    }

    @Test
    public void test19271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19271");
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
        boolean boolean15 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.connectionInitSql = "HikariPool-2183";
        hikariConfig1.isAutoCommit = true;
        int int20 = hikariConfig1.transactionIsolation;
        long long21 = hikariConfig1.idleTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
    }

    @Test
    public void test19272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19272");
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
        int int21 = hikariConfig1.acquireRetries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test19273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19273");
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
        long long12 = hikariConfig1.acquireRetryDelay;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test19274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19274");
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
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties31);
        java.util.Properties properties35 = hikariConfig34.getDataSourceProperties();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test19275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19275");
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
        java.util.Properties properties23 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test19276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19276");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        int int5 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str6 = hikariConfig1.getJdbcUrl();
        hikariConfig1.isRegisterMbeans = false;
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-3407");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test19277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19277");
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
        hikariConfig29.setJdbc4ConnectionTest(false);
        hikariConfig29.maxLifetime = (-1);
        java.lang.String str34 = hikariConfig29.dataSourceClassName;
        java.lang.String str35 = hikariConfig29.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test19278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19278");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        hikariConfig1.idleTimeout = 3;
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.minPoolSize = 358;
        boolean boolean19 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setJdbc4ConnectionTest(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test19279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19279");
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
        hikariConfig1.isInitializationFailFast = false;
        java.lang.String str24 = hikariConfig1.connectionInitSql;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setMinimumPoolSize(1);
        hikariConfig1.transactionIsolationName = "HikariPool-44";
        boolean boolean31 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-195" + "'", str24, "HikariPool-195");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test19280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19280");
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
        hikariConfig1.dataSourceClassName = "HikariPool-300";
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.idleTimeout = 52;
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        java.lang.String str22 = hikariConfig21.getDataSourceClassName();
        hikariConfig21.setTransactionIsolation("hi!");
        hikariConfig21.acquireRetryDelay = '4';
        hikariConfig21.setConnectionCustomizerClassName("");
        java.lang.String str29 = hikariConfig21.getPoolName();
        long long30 = hikariConfig21.getLeakDetectionThreshold();
        java.lang.String str31 = hikariConfig21.connectionInitSql;
        int int32 = hikariConfig21.acquireRetries;
        java.lang.String str33 = hikariConfig21.getPoolName();
        hikariConfig21.setAcquireRetries(60);
        java.lang.String str36 = hikariConfig21.jdbcUrl;
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        long long39 = hikariConfig38.getAcquireRetryDelay();
        hikariConfig38.connectionInitSql = "hi!";
        hikariConfig38.acquireIncrement = (byte) 100;
        hikariConfig38.setMinimumPoolSize((int) (short) 0);
        hikariConfig38.connectionTestQuery = "";
        long long48 = hikariConfig38.getConnectionTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer49 = null;
        hikariConfig38.connectionCustomizer = iConnectionCustomizer49;
        java.lang.String str51 = hikariConfig38.getConnectionTestQuery();
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        long long55 = hikariConfig54.getAcquireRetryDelay();
        hikariConfig54.idleTimeout = (-1);
        java.util.Properties properties58 = hikariConfig54.getDataSourceProperties();
        hikariConfig38.addDataSourceProperty("hi!", (java.lang.Object) properties58);
        hikariConfig21.setDataSourceProperties(properties58);
        hikariConfig1.dataSourceProperties = properties58;
        hikariConfig1.poolName = "HikariPool-4656";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-52282" + "'", str29, "HikariPool-52282");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HikariPool-52282" + "'", str33, "HikariPool-52282");
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 3L + "'", long48 == 3L);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
// flaky:         org.junit.Assert.assertTrue("'" + long55 + "' != '" + 32L + "'", long55 == 32L);
        org.junit.Assert.assertNotNull(properties58);
    }

    @Test
    public void test19281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19281");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setMaxLifetime(1L);
        hikariConfig1.setTransactionIsolation("HikariPool-337");
        long long10 = hikariConfig1.idleTimeout;
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test19282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19282");
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
        boolean boolean19 = hikariConfig1.isAutoCommit;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test19283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19283");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setReadOnly(false);
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test19284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19284");
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
        hikariConfig1.setMaxLifetime((long) 60);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test19285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19285");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        long long5 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.maxLifetime = (short) 1;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer8;
        hikariConfig1.maxLifetime = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
    }

    @Test
    public void test19286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19286");
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
        int int19 = hikariConfig1.acquireRetries;
        boolean boolean20 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2147483647L + "'", long17 == 2147483647L);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19287");
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
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        java.lang.String str17 = hikariConfig1.jdbcUrl;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2846");
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.minPoolSize = (-1);
        long long26 = hikariConfig22.getLeakDetectionThreshold();
        hikariConfig22.isIsolateInternalQueries = false;
        hikariConfig22.setUseInstrumentation(false);
        java.lang.String str31 = hikariConfig22.jdbcUrl;
        hikariConfig22.setUseInstrumentation(true);
        hikariConfig22.setConnectionInitSql("HikariPool-486");
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig37.maxPoolSize = (byte) 0;
        java.util.Properties properties40 = hikariConfig37.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig22.setDataSourceProperties(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties40);
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig1.dataSourceProperties = properties40;
        hikariConfig1.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig1.isIsolateInternalQueries = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-2846" + "'", str20, "HikariPool-2846");
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test19288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19288");
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
        int int14 = hikariConfig1.getAcquireIncrement();
        long long15 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setPoolName("HikariPool-185");
        hikariConfig1.connectionInitSql = "HikariPool-451";
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setDataSourceClassName("HikariPool-517");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test19289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19289");
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
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-291" + "'", str12, "HikariPool-291");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-291" + "'", str17, "HikariPool-291");
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test19290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19290");
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
        hikariConfig20.setMaxLifetime((long) 0);
        hikariConfig20.setReadOnly(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test19291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19291");
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
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str20 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test19292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19292");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setIsolateInternalQueries(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.acquireRetries = 0;
        java.lang.String str8 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        java.lang.String str11 = hikariConfig1.getJdbcUrl();
        hikariConfig1.isReadOnly = false;
        java.lang.String str14 = hikariConfig1.getCatalog();
        hikariConfig1.maxPoolSize = 0;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-52308" + "'", str8, "HikariPool-52308");
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test19293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19293");
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
        hikariConfig1.transactionIsolationName = "HikariPool-639";
        long long21 = hikariConfig1.getIdleTimeout();
        boolean boolean22 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str25 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setPoolName("HikariPool-870");
        java.lang.String str28 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52309" + "'", str9, "HikariPool-52309");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test19294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19294");
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
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        java.lang.String str31 = hikariConfig30.getDataSourceClassName();
        int int32 = hikariConfig30.getAcquireRetries();
        hikariConfig30.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource35 = null;
        hikariConfig30.setDataSource(dataSource35);
        hikariConfig30.transactionIsolation = (byte) 10;
        java.lang.String str39 = hikariConfig30.getJdbcUrl();
        boolean boolean40 = hikariConfig30.isAutoCommit();
        hikariConfig30.leakDetectionThreshold = (-1L);
        long long43 = hikariConfig30.maxLifetime;
        hikariConfig30.setJdbc4ConnectionTest(false);
        hikariConfig1.addDataSourceProperty("HikariPool-1173", (java.lang.Object) hikariConfig30);
        boolean boolean47 = hikariConfig1.isInitializationFailFast();
        java.lang.String str48 = hikariConfig1.catalog;
        hikariConfig1.setConnectionInitSql("HikariPool-1003");
        java.util.Properties properties51 = hikariConfig1.dataSourceProperties;
        hikariConfig1.leakDetectionThreshold = 32;
        long long54 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireIncrement((int) ' ');
        hikariConfig1.setIsolateInternalQueries(false);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 97L + "'", long43 == 97L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(properties51);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 32L + "'", long54 == 32L);
    }

    @Test
    public void test19295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19295");
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
        java.lang.String str13 = hikariConfig1.poolName;
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        long long15 = hikariConfig1.leakDetectionThreshold;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer16;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52313" + "'", str9, "HikariPool-52313");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-52313" + "'", str13, "HikariPool-52313");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test19296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19296");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-2065");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19297");
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
        hikariConfig16.isAutoCommit = false;
        hikariConfig16.setMinimumPoolSize(3);
        hikariConfig16.setMinimumPoolSize(3);
        java.lang.String str23 = hikariConfig16.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test19298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19298");
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
        hikariConfig1.jdbcUrl = "HikariPool-1047";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test19299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19299");
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
        int int18 = hikariConfig1.acquireRetries;
        hikariConfig1.idleTimeout = 1L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45" + "'", str17, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test19300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19300");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTimeout = 0L;
        long long15 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setMinimumPoolSize(0);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.dataSource = dataSource22;
        int int24 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test19301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19301");
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
        boolean boolean16 = hikariConfig1.isIsolateInternalQueries;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        java.lang.String str19 = hikariConfig18.getDataSourceClassName();
        hikariConfig18.setTransactionIsolation("hi!");
        hikariConfig18.acquireRetryDelay = '4';
        hikariConfig18.setConnectionCustomizerClassName("");
        java.lang.String str26 = hikariConfig18.getPoolName();
        long long27 = hikariConfig18.getLeakDetectionThreshold();
        hikariConfig18.transactionIsolationName = "HikariPool-55";
        hikariConfig18.minPoolSize = (byte) 10;
        java.lang.String str32 = hikariConfig18.getDataSourceClassName();
        javax.sql.DataSource dataSource33 = hikariConfig18.dataSource;
        long long34 = hikariConfig18.getIdleTimeout();
        java.lang.String str35 = hikariConfig18.getConnectionCustomizerClassName();
        boolean boolean36 = hikariConfig18.isAutoCommit;
        boolean boolean37 = hikariConfig18.isRegisterMbeans;
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        long long40 = hikariConfig39.getAcquireRetryDelay();
        hikariConfig39.idleTimeout = (-1);
        java.util.Properties properties43 = hikariConfig39.getDataSourceProperties();
        long long44 = hikariConfig39.maxLifetime;
        hikariConfig39.setConnectionInitSql("");
        int int47 = hikariConfig39.acquireRetries;
        hikariConfig39.leakDetectionThreshold = (-1);
        java.util.Properties properties50 = hikariConfig39.dataSourceProperties;
        hikariConfig18.dataSourceProperties = properties50;
        hikariConfig1.dataSourceProperties = properties50;
        hikariConfig1.setTransactionIsolation("HikariPool-52079");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-52322" + "'", str26, "HikariPool-52322");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(dataSource33);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1800000L + "'", long34 == 1800000L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 32L + "'", long40 == 32L);
        org.junit.Assert.assertNotNull(properties43);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 97L + "'", long44 == 97L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(properties50);
    }

    @Test
    public void test19302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19302");
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
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.connectionTestQuery = "HikariPool-967";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-52324" + "'", str11, "HikariPool-52324");
    }

    @Test
    public void test19303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19303");
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
        boolean boolean31 = hikariConfig30.isInitializationFailFast();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test19304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19304");
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
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.connectionInitSql = "hi!";
        hikariConfig25.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource31 = null;
        hikariConfig25.dataSource = dataSource31;
        javax.sql.DataSource dataSource33 = hikariConfig25.dataSource;
        int int34 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setMaxLifetime((long) 100);
        hikariConfig25.transactionIsolationName = "HikariPool-55";
        hikariConfig25.leakDetectionThreshold = 'a';
        int int41 = hikariConfig25.minPoolSize;
        hikariConfig25.minPoolSize = (short) 10;
        boolean boolean44 = hikariConfig25.isInitializationFailFast;
        java.lang.String str45 = hikariConfig25.getDataSourceClassName();
        long long46 = hikariConfig25.idleTimeout;
        int int47 = hikariConfig25.getAcquireRetries();
        java.util.Properties properties48 = hikariConfig25.getDataSourceProperties();
        hikariConfig23.setDataSourceProperties(properties48);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1800000L + "'", long46 == 1800000L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(properties48);
    }

    @Test
    public void test19305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19305");
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
        javax.sql.DataSource dataSource36 = null;
        hikariConfig1.dataSource = dataSource36;
        hikariConfig1.setMaximumPoolSize((int) (short) 100);
        hikariConfig1.dataSourceClassName = "";
        javax.sql.DataSource dataSource42 = hikariConfig1.dataSource;
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
        org.junit.Assert.assertNull(dataSource42);
    }

    @Test
    public void test19306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19306");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setLeakDetectionThreshold((long) 3);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test19307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19307");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        long long6 = hikariConfig5.getAcquireRetryDelay();
        hikariConfig5.connectionInitSql = "hi!";
        hikariConfig5.acquireIncrement = (byte) 100;
        hikariConfig5.setMinimumPoolSize((int) (short) 0);
        java.lang.String str13 = hikariConfig5.dataSourceClassName;
        long long14 = hikariConfig5.getAcquireRetryDelay();
        hikariConfig5.setLeakDetectionThreshold((long) (byte) 0);
        java.lang.String str17 = hikariConfig5.getConnectionCustomizerClassName();
        hikariConfig5.connectionTestQuery = "";
        boolean boolean20 = hikariConfig5.isAutoCommit;
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getAcquireRetryDelay();
        hikariConfig22.idleTimeout = (-1);
        java.util.Properties properties26 = hikariConfig22.getDataSourceProperties();
        long long27 = hikariConfig22.maxLifetime;
        hikariConfig22.setConnectionInitSql("");
        int int30 = hikariConfig22.acquireRetries;
        hikariConfig22.leakDetectionThreshold = (-1);
        java.util.Properties properties33 = hikariConfig22.dataSourceProperties;
        hikariConfig5.setDataSourceProperties(properties33);
        hikariConfig1.setDataSourceProperties(properties33);
        hikariConfig1.connectionTimeout = 100L;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
        org.junit.Assert.assertNotNull(properties26);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(properties33);
    }

    @Test
    public void test19308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19308");
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
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test19309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19309");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        long long7 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.maxLifetime = ' ';
        long long10 = hikariConfig1.connectionTimeout;
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.idleTimeout = (byte) 0;
        hikariConfig1.acquireRetryDelay = 5000L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test19310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19310");
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
        long long16 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        long long19 = hikariConfig1.maxLifetime;
        hikariConfig1.setReadOnly(false);
        long long22 = hikariConfig1.maxLifetime;
        java.lang.String str23 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test19311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19311");
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
        java.lang.String str15 = hikariConfig1.catalog;
        hikariConfig1.setMaximumPoolSize((int) '#');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        javax.sql.DataSource dataSource19 = hikariConfig1.dataSource;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test19312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19312");
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
        hikariConfig1.isIsolateInternalQueries = true;
        hikariConfig1.minPoolSize = 1;
        hikariConfig1.maxLifetime = (short) 1;
        hikariConfig1.acquireIncrement = 3;
        boolean boolean22 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test19313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19313");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.maxLifetime = 0;
        long long7 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.setIdleTimeout(32L);
        int int10 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.setInitializationFailFast(false);
        hikariConfig16.leakDetectionThreshold = (-1);
        hikariConfig16.isJdbc4connectionTest = false;
        java.util.Properties properties24 = hikariConfig16.getDataSourceProperties();
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        long long27 = hikariConfig26.getAcquireRetryDelay();
        hikariConfig26.connectionInitSql = "hi!";
        hikariConfig26.acquireIncrement = (byte) 100;
        hikariConfig26.setMinimumPoolSize((int) (short) 0);
        hikariConfig26.connectionTestQuery = "";
        hikariConfig26.jdbcUrl = "HikariPool-45";
        hikariConfig26.isReadOnly = false;
        hikariConfig26.setPoolName("");
        java.lang.String str42 = hikariConfig26.getConnectionTestQuery();
        java.util.Properties properties43 = hikariConfig26.dataSourceProperties;
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        long long46 = hikariConfig45.getAcquireRetryDelay();
        hikariConfig45.connectionInitSql = "hi!";
        hikariConfig45.acquireIncrement = (byte) 100;
        hikariConfig45.setJdbcUrl("");
        hikariConfig45.setConnectionTimeout((long) 100);
        hikariConfig45.connectionTestQuery = "HikariPool-167";
        java.lang.String str57 = hikariConfig45.getConnectionInitSql();
        java.util.Properties properties58 = hikariConfig45.dataSourceProperties;
        hikariConfig26.dataSourceProperties = properties58;
        hikariConfig16.dataSourceProperties = properties58;
        hikariConfig1.addDataSourceProperty("HikariPool-34464", (java.lang.Object) properties58);
        java.lang.String str62 = hikariConfig1.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(properties24);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(properties43);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 32L + "'", long46 == 32L);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test19314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19314");
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
        hikariConfig1.setAcquireRetryDelay((long) 60);
        hikariConfig1.setConnectionTestQuery("");
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test19315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19315");
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
        java.lang.String str23 = hikariConfig1.jdbcUrl;
        int int24 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties25 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        long long27 = hikariConfig26.getLeakDetectionThreshold();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test19316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19316");
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
        java.lang.String str16 = hikariConfig1.getJdbcUrl();
        java.lang.String str17 = hikariConfig1.transactionIsolationName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test19317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19317");
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
        hikariConfig13.acquireRetryDelay = 2147483647L;
        java.lang.String str16 = hikariConfig13.dataSourceClassName;
        boolean boolean17 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.maxPoolSize = (byte) 10;
        hikariConfig13.setConnectionInitSql("HikariPool-41623");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19318");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        boolean boolean5 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        long long8 = hikariConfig7.getAcquireRetryDelay();
        hikariConfig7.idleTimeout = (-1);
        java.util.Properties properties11 = hikariConfig7.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig1.setDataSourceProperties(properties11);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig14.isIsolateInternalQueries = true;
        boolean boolean17 = hikariConfig14.isReadOnly;
        hikariConfig14.isInitializationFailFast = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19319");
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
        hikariConfig1.acquireIncrement = 'a';
        int int18 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52368" + "'", str9, "HikariPool-52368");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test19320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19320");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.transactionIsolation = 3;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test19321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19321");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig6.catalog = "HikariPool-2341";
        javax.sql.DataSource dataSource9 = null;
        hikariConfig6.dataSource = dataSource9;
        hikariConfig6.setPoolName("HikariPool-353");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test19322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19322");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-291";
        long long9 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.isJdbc4connectionTest = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer17;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test19323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19323");
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
        boolean boolean14 = hikariConfig1.isReadOnly();
        int int15 = hikariConfig1.getMaximumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test19324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19324");
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
        long long22 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireRetryDelay((long) (short) 0);
        long long25 = hikariConfig1.acquireRetryDelay;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52379" + "'", str9, "HikariPool-52379");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-52379" + "'", str13, "HikariPool-52379");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test19325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19325");
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
        java.lang.String str18 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource19 = hikariConfig1.dataSource;
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.String str22 = hikariConfig1.jdbcUrl;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(dataSource15);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-52380" + "'", str18, "HikariPool-52380");
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test19326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19326");
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
        java.lang.String str16 = hikariConfig1.connectionInitSql;
        hikariConfig1.transactionIsolationName = "HikariPool-602";
        hikariConfig1.setIsolateInternalQueries(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test19327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19327");
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
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("HikariPool-789");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45" + "'", str17, "HikariPool-45");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test19328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19328");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetries((int) (short) 1);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setPoolName("HikariPool-189");
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test19329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19329");
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
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setUseInstrumentation(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test19330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19330");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.connectionInitSql = "HikariPool-487";
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setPoolName("HikariPool-228");
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long19 = hikariConfig1.idleTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test19331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19331");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.getIdleTimeout();
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        int int12 = hikariConfig1.acquireRetries;
        hikariConfig1.setAcquireIncrement((int) (byte) 1);
        hikariConfig1.setRegisterMbeans(true);
        long long17 = hikariConfig1.connectionTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
    }

    @Test
    public void test19332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19332");
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
        boolean boolean23 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test19333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19333");
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
        boolean boolean34 = hikariConfig1.isAutoCommit();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test19334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19334");
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
        hikariConfig1.connectionInitSql = "HikariPool-2021";
        int int16 = hikariConfig1.getAcquireRetries();
        hikariConfig1.catalog = "HikariPool-48080";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test19335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19335");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.catalog = "HikariPool-84";
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean14 = hikariConfig1.isAutoCommit;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMinimumPoolSize(52);
        hikariConfig1.setReadOnly(false);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52400" + "'", str9, "HikariPool-52400");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test19336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19336");
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
        java.lang.String str19 = hikariConfig16.getConnectionCustomizerClassName();
        hikariConfig16.idleTimeout = 60;
        java.lang.String str22 = hikariConfig16.getJdbcUrl();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.connectionInitSql = "hi!";
        hikariConfig24.acquireIncrement = (byte) 100;
        hikariConfig24.setJdbcUrl("");
        hikariConfig24.setConnectionTimeout((long) 100);
        hikariConfig24.connectionTestQuery = "HikariPool-167";
        java.lang.String str36 = hikariConfig24.getConnectionInitSql();
        java.util.Properties properties37 = hikariConfig24.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig16.dataSourceProperties = properties37;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig41.setUseInstrumentation(false);
        hikariConfig41.isAutoCommit = false;
        hikariConfig41.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(properties37);
    }

    @Test
    public void test19337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19337");
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
        hikariConfig1.connectionTestQuery = "HikariPool-1884";
        boolean boolean20 = hikariConfig1.isJdbc4connectionTest;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test19338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19338");
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
        boolean boolean16 = hikariConfig1.isReadOnly;
        hikariConfig1.setMaximumPoolSize(32);
        hikariConfig1.connectionTimeout = 600000L;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19339");
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
        hikariConfig1.catalog = "HikariPool-44304";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test19340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19340");
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
        boolean boolean23 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.maxPoolSize = (byte) 0;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test19341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19341");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        int int12 = hikariConfig1.minPoolSize;
        hikariConfig1.setPoolName("HikariPool-154");
        hikariConfig1.connectionCustomizerClassName = "HikariPool-618";
        boolean boolean17 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.isRegisterMbeans = false;
        java.lang.String str20 = hikariConfig1.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test19342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19342");
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
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.dataSourceClassName = "HikariPool-2405";
        hikariConfig1.setLeakDetectionThreshold(1L);
        int int22 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test19343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19343");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setAutoCommit(true);
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setReadOnly(true);
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test19344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19344");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        hikariConfig1.maxPoolSize = 60;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52415" + "'", str9, "HikariPool-52415");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19345");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-42888");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-42888 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19346");
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
        long long26 = hikariConfig1.getConnectionTimeout();
        java.lang.String str27 = hikariConfig1.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test19347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19347");
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
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str16 = hikariConfig15.connectionTestQuery;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig15.setDataSource(dataSource17);
        boolean boolean19 = hikariConfig15.isRegisterMbeans();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test19348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19348");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer17;
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties20 = hikariConfig1.dataSourceProperties;
        java.lang.String str21 = hikariConfig1.getCatalog();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-47988";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test19349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19349");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        int int5 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = true;
        int int8 = hikariConfig1.getAcquireIncrement();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test19350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19350");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.connectionTestQuery = "HikariPool-45";
        hikariConfig1.setMaxLifetime((long) (short) -1);
        long long15 = hikariConfig1.getMaxLifetime();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test19351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19351");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.connectionTestQuery = "HikariPool-45";
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setRegisterMbeans(true);
        long long17 = hikariConfig1.maxLifetime;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test19352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19352");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = null;
        hikariConfig19.connectionCustomizer = iConnectionCustomizer20;
        hikariConfig19.setMaximumPoolSize((int) (byte) 0);
        int int24 = hikariConfig19.maxPoolSize;
        java.lang.String str25 = hikariConfig19.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test19353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19353");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.minPoolSize = (short) 100;
        hikariConfig1.acquireRetries = (byte) 1;
        hikariConfig1.addDataSourceProperty("HikariPool-2425", (java.lang.Object) "HikariPool-8464");
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test19354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19354");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        long long3 = hikariConfig1.leakDetectionThreshold;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        java.util.Properties properties5 = hikariConfig1.dataSourceProperties;
        int int6 = hikariConfig1.acquireRetries;
        int int7 = hikariConfig1.maxPoolSize;
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        int int9 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test19355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19355");
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
        long long21 = hikariConfig1.idleTimeout;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
    }

    @Test
    public void test19356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19356");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isIsolateInternalQueries;
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionTimeout((long) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test19357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19357");
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
        hikariConfig1.setReadOnly(true);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1584");
        int int18 = hikariConfig1.maxPoolSize;
        int int19 = hikariConfig1.getAcquireRetries();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.dataSource = dataSource20;
        hikariConfig1.setJdbcUrl("HikariPool-18273");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test19358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19358");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        int int9 = hikariConfig1.acquireRetries;
        long long10 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.isInitializationFailFast = true;
        int int13 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setLeakDetectionThreshold(32L);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer16;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        java.lang.String str20 = hikariConfig19.getDataSourceClassName();
        hikariConfig19.setTransactionIsolation("hi!");
        hikariConfig19.acquireRetryDelay = '4';
        hikariConfig19.setConnectionCustomizerClassName("");
        java.lang.String str27 = hikariConfig19.getPoolName();
        long long28 = hikariConfig19.getLeakDetectionThreshold();
        java.lang.String str29 = hikariConfig19.connectionInitSql;
        int int30 = hikariConfig19.acquireRetries;
        hikariConfig19.setMaxLifetime((long) 97);
        hikariConfig19.setUseInstrumentation(true);
        java.util.Properties properties35 = hikariConfig19.getDataSourceProperties();
        java.util.Properties properties36 = hikariConfig19.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig1.dataSourceProperties = properties36;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties36);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HikariPool-52435" + "'", str27, "HikariPool-52435");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(properties35);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test19359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19359");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-18445");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-18445 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19360");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig7.transactionIsolationName = "HikariPool-172";
        hikariConfig7.setCatalog("HikariPool-191");
        boolean boolean12 = hikariConfig7.isJdbc4connectionTest;
        hikariConfig7.isInitializationFailFast = true;
        long long15 = hikariConfig7.getMaxLifetime();
        long long16 = hikariConfig7.getAcquireRetryDelay();
        boolean boolean17 = hikariConfig7.isJdbc4ConnectionTest();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test19361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19361");
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
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.maxPoolSize = 97;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test19362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19362");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-946");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-946 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19363");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        int int12 = hikariConfig1.transactionIsolation;
        hikariConfig1.poolName = "HikariPool-284";
        hikariConfig1.acquireRetryDelay = 100L;
        hikariConfig1.setConnectionTestQuery("HikariPool-26");
        java.lang.String str19 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.minPoolSize = 32;
        hikariConfig1.transactionIsolationName = "HikariPool-14200";
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test19364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19364");
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
        hikariConfig15.transactionIsolation = '4';
        java.lang.String str20 = hikariConfig15.getConnectionCustomizerClassName();
        hikariConfig15.setPoolName("HikariPool-19973");
        java.lang.String str23 = hikariConfig15.transactionIsolationName;
        long long24 = hikariConfig15.getLeakDetectionThreshold();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test19365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19365");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setCatalog("HikariPool-64");
        hikariConfig1.jdbcUrl = "HikariPool-1946";
        int int14 = hikariConfig1.transactionIsolation;
        hikariConfig1.maxLifetime = 10L;
        int int17 = hikariConfig1.getTransactionIsolation();
        int int18 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test19366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19366");
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
        java.lang.String str19 = hikariConfig1.connectionCustomizerClassName;
        int int20 = hikariConfig1.getMaximumPoolSize();
        long long21 = hikariConfig1.connectionTimeout;
        boolean boolean22 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3L + "'", long21 == 3L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test19367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19367");
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
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties55);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties55);
        java.lang.String str59 = hikariConfig58.jdbcUrl;
        boolean boolean60 = hikariConfig58.isRegisterMbeans();
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
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test19368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19368");
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
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setAcquireRetries(100);
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test19369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19369");
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
        java.lang.String str15 = hikariConfig1.poolName;
        long long16 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-55" + "'", str15, "HikariPool-55");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test19370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19370");
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
        long long15 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test19371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19371");
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
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.leakDetectionThreshold = 600000L;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        long long20 = hikariConfig19.getAcquireRetryDelay();
        hikariConfig19.minPoolSize = (-1);
        long long23 = hikariConfig19.getLeakDetectionThreshold();
        hikariConfig19.isIsolateInternalQueries = false;
        hikariConfig19.setUseInstrumentation(false);
        long long28 = hikariConfig19.leakDetectionThreshold;
        int int29 = hikariConfig19.acquireIncrement;
        java.lang.String str30 = hikariConfig19.getConnectionCustomizerClassName();
        hikariConfig19.idleTimeout = '#';
        hikariConfig19.setReadOnly(false);
        hikariConfig1.addDataSourceProperty("HikariPool-44890", (java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test19372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19372");
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
        java.lang.String str25 = hikariConfig20.getCatalog();
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        java.lang.String str28 = hikariConfig27.getDataSourceClassName();
        int int29 = hikariConfig27.getAcquireRetries();
        hikariConfig27.connectionTimeout = 100;
        boolean boolean32 = hikariConfig27.isInitializationFailFast();
        javax.sql.DataSource dataSource33 = hikariConfig27.dataSource;
        hikariConfig27.minPoolSize = (short) 100;
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        java.lang.String str38 = hikariConfig37.getDataSourceClassName();
        hikariConfig37.setTransactionIsolation("hi!");
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
        hikariConfig37.dataSourceProperties = properties54;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties54);
        hikariConfig27.setDataSourceProperties(properties54);
        hikariConfig20.dataSourceProperties = properties54;
        hikariConfig20.transactionIsolation = 35;
        int int61 = hikariConfig20.maxPoolSize;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(str38);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 32L + "'", long43 == 32L);
        org.junit.Assert.assertNull(str50);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 32L + "'", long51 == 32L);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 60 + "'", int61 == 60);
    }

    @Test
    public void test19373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19373");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.getIdleTimeout();
        long long10 = hikariConfig1.getIdleTimeout();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isRegisterMbeans = false;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test19374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19374");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.catalog = "HikariPool-84";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setLeakDetectionThreshold((long) '4');
        hikariConfig1.isReadOnly = true;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-188");
        java.lang.String str22 = hikariConfig1.getPoolName();
        boolean boolean23 = hikariConfig1.isReadOnly();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52487" + "'", str9, "HikariPool-52487");
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-52487" + "'", str22, "HikariPool-52487");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test19375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19375");
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
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties25);
        boolean boolean28 = hikariConfig27.isIsolateInternalQueries;
        java.lang.String str29 = hikariConfig27.poolName;
        hikariConfig27.connectionTimeout = 97L;
        hikariConfig27.isIsolateInternalQueries = false;
        hikariConfig27.setMaximumPoolSize(52);
        hikariConfig27.acquireRetryDelay = 97L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-52502" + "'", str29, "HikariPool-52502");
    }

    @Test
    public void test19376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19376");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        hikariConfig1.connectionTestQuery = "HikariPool-167";
        hikariConfig1.setIsolateInternalQueries(false);
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.catalog = "HikariPool-41741";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test19377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19377");
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
        int int19 = hikariConfig1.acquireIncrement;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test19378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19378");
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
        java.util.Properties properties19 = hikariConfig1.dataSourceProperties;
        long long20 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2147483647L + "'", long17 == 2147483647L);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2147483647L + "'", long20 == 2147483647L);
    }

    @Test
    public void test19379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19379");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long7 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setIdleTimeout(10L);
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        int int12 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.transactionIsolation = 0;
        java.lang.String str17 = hikariConfig1.getPoolName();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-52506" + "'", str17, "HikariPool-52506");
    }

    @Test
    public void test19380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19380");
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
        hikariConfig13.acquireRetryDelay = 2147483647L;
        java.lang.String str16 = hikariConfig13.dataSourceClassName;
        boolean boolean17 = hikariConfig13.isInitializationFailFast();
        long long18 = hikariConfig13.getConnectionTimeout();
        java.lang.String str19 = hikariConfig13.getJdbcUrl();
        hikariConfig13.transactionIsolationName = "HikariPool-8337";
        int int22 = hikariConfig13.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test19381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19381");
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
        java.util.Properties properties23 = hikariConfig22.dataSourceProperties;
        int int24 = hikariConfig22.minPoolSize;
        java.lang.Class<?> wildcardClass25 = hikariConfig22.getClass();
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
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test19382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19382");
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
        java.lang.String str16 = hikariConfig1.getPoolName();
        int int17 = hikariConfig1.getMaximumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-52516" + "'", str16, "HikariPool-52516");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test19383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19383");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.setAcquireRetries((int) (short) 100);
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        int int12 = hikariConfig1.minPoolSize;
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean15 = hikariConfig1.isReadOnly;
        boolean boolean16 = hikariConfig1.isReadOnly();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test19384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19384");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireRetries(100);
        int int6 = hikariConfig1.maxPoolSize;
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setCatalog("HikariPool-28");
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        boolean boolean16 = hikariConfig15.isIsolateInternalQueries();
        int int17 = hikariConfig15.getAcquireIncrement();
        hikariConfig15.minPoolSize = (byte) -1;
        hikariConfig15.setMaxLifetime(97L);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test19385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19385");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-406");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-406 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19386");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        long long5 = hikariConfig1.maxLifetime;
        int int6 = hikariConfig1.acquireRetries;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        hikariConfig1.setDataSourceClassName("HikariPool-260");
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setConnectionInitSql("HikariPool-211");
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
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig35.connectionTimeout = 32;
        java.lang.String str38 = hikariConfig35.catalog;
        boolean boolean39 = hikariConfig35.isJdbc4connectionTest;
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        boolean boolean42 = hikariConfig41.isInitializationFailFast();
        hikariConfig41.dataSourceClassName = "hi!";
        hikariConfig41.setRegisterMbeans(false);
        javax.sql.DataSource dataSource47 = hikariConfig41.getDataSource();
        java.util.Properties properties48 = hikariConfig41.getDataSourceProperties();
        hikariConfig35.dataSourceProperties = properties48;
        hikariConfig1.addDataSourceProperty("HikariPool-4345", (java.lang.Object) properties48);
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties48);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(properties4);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(dataSource47);
        org.junit.Assert.assertNotNull(properties48);
    }

    @Test
    public void test19387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19387");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-12668");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-12668 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19388");
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
        hikariConfig1.setReadOnly(true);
        hikariConfig1.transactionIsolationName = "HikariPool-2604";
        java.lang.String str24 = hikariConfig1.getConnectionInitSql();
        boolean boolean25 = hikariConfig1.isReadOnly;
        java.lang.String str26 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52529" + "'", str9, "HikariPool-52529");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-52529" + "'", str13, "HikariPool-52529");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test19389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19389");
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
        hikariConfig1.idleTimeout = 97;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19390");
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
        java.lang.String str21 = hikariConfig1.getJdbcUrl();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test19391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19391");
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
        hikariConfig1.connectionTimeout = 358;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("HikariPool-24375");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-24375' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test19392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19392");
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
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        long long18 = hikariConfig17.getAcquireRetryDelay();
        hikariConfig17.connectionInitSql = "hi!";
        hikariConfig17.acquireIncrement = (byte) 100;
        hikariConfig17.setMinimumPoolSize((int) (short) 0);
        java.lang.String str25 = hikariConfig17.dataSourceClassName;
        long long26 = hikariConfig17.getAcquireRetryDelay();
        boolean boolean27 = hikariConfig17.isRegisterMbeans;
        int int28 = hikariConfig17.transactionIsolation;
        java.util.Properties properties29 = hikariConfig17.dataSourceProperties;
        hikariConfig17.setIdleTimeout(1800000L);
        hikariConfig17.setRegisterMbeans(true);
        hikariConfig17.connectionTimeout = '#';
        java.util.Properties properties36 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties36);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setIsolateInternalQueries(true);
        hikariConfig1.setMaxLifetime((long) (short) 100);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertNull(str25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test19393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19393");
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
        hikariConfig1.acquireRetryDelay = 60L;
        java.util.Properties properties22 = hikariConfig1.dataSourceProperties;
        int int23 = hikariConfig1.acquireIncrement;
        java.lang.String str24 = hikariConfig1.getDataSourceClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer25;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test19394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19394");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionTimeout = 100;
        boolean boolean6 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-290";
        int int9 = hikariConfig1.getTransactionIsolation();
        java.lang.String str10 = hikariConfig1.jdbcUrl;
        int int11 = hikariConfig1.acquireRetries;
        hikariConfig1.acquireIncrement = 60;
        hikariConfig1.maxLifetime = (-1L);
        int int16 = hikariConfig1.acquireIncrement;
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test19395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19395");
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
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test19396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19396");
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
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.isIsolateInternalQueries = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties17);
    }

    @Test
    public void test19397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19397");
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
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource17 = hikariConfig14.getDataSource();
        hikariConfig14.connectionTestQuery = "HikariPool-55";
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        boolean boolean22 = hikariConfig21.isInitializationFailFast();
        hikariConfig21.setInitializationFailFast(false);
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        java.lang.String str27 = hikariConfig26.getDataSourceClassName();
        hikariConfig26.setTransactionIsolation("hi!");
        hikariConfig26.acquireRetryDelay = '4';
        hikariConfig26.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties34 = hikariConfig26.getDataSourceProperties();
        hikariConfig21.setDataSourceProperties(properties34);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig14.setDataSourceProperties(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        hikariConfig1.setReadOnly(false);
        long long41 = hikariConfig1.getMaxLifetime();
        java.lang.String str42 = hikariConfig1.jdbcUrl;
        java.lang.String str43 = hikariConfig1.jdbcUrl;
        hikariConfig1.transactionIsolation = 10;
        java.lang.String str46 = hikariConfig1.poolName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 97L + "'", long9 == 97L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(properties34);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 97L + "'", long41 == 97L);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
// flaky:         org.junit.Assert.assertEquals("'" + str46 + "' != '" + "HikariPool-52540" + "'", str46, "HikariPool-52540");
    }

    @Test
    public void test19398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19398");
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
        hikariConfig1.acquireIncrement = 0;
        hikariConfig1.connectionCustomizerClassName = "";
        boolean boolean24 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.acquireRetryDelay = 60;
        hikariConfig1.setLeakDetectionThreshold(60L);
        hikariConfig1.transactionIsolationName = "HikariPool-52079";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test19399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19399");
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
        int int18 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test19400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19400");
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
        java.lang.String str22 = hikariConfig1.getPoolName();
        hikariConfig1.connectionTimeout = 97L;
        hikariConfig1.acquireRetryDelay = 358L;
        int int27 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52547" + "'", str9, "HikariPool-52547");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 97L + "'", long19 == 97L);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HikariPool-52547" + "'", str22, "HikariPool-52547");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test19401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19401");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str6 = hikariConfig1.poolName;
        boolean boolean7 = hikariConfig1.isIsolateInternalQueries;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.idleTimeout = (-1);
        hikariConfig10.setMaximumPoolSize((int) 'a');
        long long16 = hikariConfig10.getLeakDetectionThreshold();
        java.lang.String str17 = hikariConfig10.catalog;
        long long18 = hikariConfig10.maxLifetime;
        hikariConfig10.dataSourceClassName = "HikariPool-114";
        hikariConfig10.setMaximumPoolSize(0);
        long long23 = hikariConfig10.leakDetectionThreshold;
        java.lang.String str24 = hikariConfig10.jdbcUrl;
        hikariConfig10.setIdleTimeout(52L);
        hikariConfig10.acquireRetries = (byte) 100;
        hikariConfig1.addDataSourceProperty("HikariPool-3195", (java.lang.Object) hikariConfig10);
        hikariConfig10.connectionCustomizerClassName = "HikariPool-37110";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-52548" + "'", str6, "HikariPool-52548");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test19402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19402");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer31;
        boolean boolean33 = hikariConfig1.isInitializationFailFast();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 32L + "'", long22 == 32L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test19403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19403");
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
        long long26 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties27 = hikariConfig1.dataSourceProperties;
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setHikariPool-189");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test19404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19404");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-18251");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-18251 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19405");
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
        hikariConfig1.transactionIsolation = (short) 100;
        boolean boolean24 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.connectionTestQuery = "HikariPool-1571";
        boolean boolean27 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        int int30 = hikariConfig1.acquireIncrement;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52555" + "'", str9, "HikariPool-52555");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-52555" + "'", str13, "HikariPool-52555");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1800000L + "'", long21 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test19406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19406");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        long long3 = hikariConfig1.maxLifetime;
        java.util.Properties properties4 = hikariConfig1.getDataSourceProperties();
        java.lang.String str5 = hikariConfig1.getCatalog();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean8 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setLeakDetectionThreshold((long) 97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test19407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19407");
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
        hikariConfig1.minPoolSize = (short) -1;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.idleTimeout = (-1);
        java.util.Properties properties29 = hikariConfig25.getDataSourceProperties();
        long long30 = hikariConfig25.maxLifetime;
        hikariConfig25.setConnectionInitSql("");
        int int33 = hikariConfig25.acquireRetries;
        hikariConfig25.leakDetectionThreshold = (-1);
        java.util.Properties properties36 = hikariConfig25.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig1.dataSourceProperties = properties36;
        hikariConfig1.poolName = "HikariPool-2194";
        java.lang.String str41 = hikariConfig1.catalog;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNotNull(properties29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 97L + "'", long30 == 97L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test19408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19408");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isIsolateInternalQueries = false;
        hikariConfig1.setUseInstrumentation(false);
        long long10 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setConnectionTestQuery("HikariPool-300");
        hikariConfig1.dataSourceClassName = "HikariPool-209";
        hikariConfig1.acquireRetryDelay = 358L;
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.jdbcUrl = "HikariPool-5555";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test19409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19409");
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
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getAcquireRetryDelay();
        long long24 = hikariConfig22.idleTimeout;
        java.lang.String str25 = hikariConfig22.getPoolName();
        hikariConfig22.setConnectionTestQuery("HikariPool-833");
        long long28 = hikariConfig22.acquireRetryDelay;
        long long29 = hikariConfig22.getConnectionTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-1425", (java.lang.Object) long29);
        java.util.Properties properties31 = hikariConfig1.getDataSourceProperties();
        boolean boolean32 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setConnectionTimeout(0L);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-52562" + "'", str25, "HikariPool-52562");
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3L + "'", long29 == 3L);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test19410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19410");
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
        hikariConfig10.setJdbcUrl("HikariPool-539");
        java.util.Properties properties15 = hikariConfig10.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test19411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19411");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        hikariConfig1.setMinimumPoolSize(100);
        hikariConfig1.setCatalog("HikariPool-1863");
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
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig34.setConnectionTestQuery("HikariPool-283");
        hikariConfig34.isRegisterMbeans = false;
        int int39 = hikariConfig34.getMinimumPoolSize();
        java.util.Properties properties40 = hikariConfig34.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties40);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 32L + "'", long17 == 32L);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(properties40);
    }

    @Test
    public void test19412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19412");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.setConnectionTimeout((long) 358);
        hikariConfig1.isAutoCommit = true;
        boolean boolean11 = hikariConfig1.isReadOnly();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        java.lang.String str14 = hikariConfig13.getDataSourceClassName();
        int int15 = hikariConfig13.getAcquireRetries();
        java.util.Properties properties16 = hikariConfig13.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        java.lang.String str19 = hikariConfig18.getConnectionCustomizerClassName();
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test19413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19413");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        int int8 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        long long11 = hikariConfig10.getAcquireRetryDelay();
        hikariConfig10.idleTimeout = (-1);
        hikariConfig10.setMaximumPoolSize((int) 'a');
        java.lang.String str16 = hikariConfig10.catalog;
        boolean boolean17 = hikariConfig10.isJdbc4ConnectionTest();
        hikariConfig10.setMinimumPoolSize(0);
        hikariConfig10.setUseInstrumentation(true);
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        long long24 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig23.idleTimeout = (-1);
        java.util.Properties properties27 = hikariConfig23.getDataSourceProperties();
        long long28 = hikariConfig23.maxLifetime;
        hikariConfig23.setLeakDetectionThreshold(750L);
        int int31 = hikariConfig23.getMinimumPoolSize();
        hikariConfig23.acquireRetries = 'a';
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        long long36 = hikariConfig35.getAcquireRetryDelay();
        hikariConfig35.connectionInitSql = "hi!";
        hikariConfig35.acquireIncrement = (byte) 100;
        hikariConfig35.setMinimumPoolSize((int) (short) 0);
        java.lang.String str43 = hikariConfig35.dataSourceClassName;
        long long44 = hikariConfig35.getAcquireRetryDelay();
        hikariConfig35.idleTimeout = (byte) -1;
        java.util.Properties properties47 = hikariConfig35.dataSourceProperties;
        hikariConfig23.dataSourceProperties = properties47;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig10.dataSourceProperties = properties47;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties47);
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties47);
        java.util.Properties properties53 = hikariConfig52.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        java.lang.String str57 = hikariConfig56.getDataSourceClassName();
        hikariConfig56.setTransactionIsolation("hi!");
        hikariConfig56.acquireRetryDelay = '4';
        hikariConfig56.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties64 = hikariConfig56.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig54.dataSourceProperties = properties64;
        com.zaxxer.hikari.HikariConfig hikariConfig67 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig1.setDataSourceProperties(properties64);
        hikariConfig1.connectionInitSql = "HikariPool-1664";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertNotNull(properties27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 97L + "'", long28 == 97L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 32L + "'", long36 == 32L);
        org.junit.Assert.assertNull(str43);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 32L + "'", long44 == 32L);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(properties64);
    }

    @Test
    public void test19414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19414");
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
        hikariConfig16.maxLifetime = 5000L;
        hikariConfig16.connectionCustomizerClassName = "HikariPool-1808";
        hikariConfig16.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test19415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19415");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.transactionIsolation = (byte) 10;
        int int10 = hikariConfig1.acquireIncrement;
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        long long12 = hikariConfig1.acquireRetryDelay;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setTransactionIsolation("HikariPool-5165");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19416");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.isReadOnly = false;
        boolean boolean18 = hikariConfig15.isInitializationFailFast;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test19417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19417");
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
        java.lang.String str19 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isAutoCommit = false;
        java.lang.String str22 = hikariConfig1.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test19418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19418");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.isReadOnly = false;
        int int7 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setJdbcUrl("HikariPool-1581");
        boolean boolean12 = hikariConfig1.isRegisterMbeans();
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19419");
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
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setCatalog("HikariPool-1027");
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.leakDetectionThreshold = 35;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52592" + "'", str9, "HikariPool-52592");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-52592" + "'", str13, "HikariPool-52592");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test19420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19420");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.isAutoCommit = false;
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.transactionIsolationName = "";
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        java.lang.String str17 = hikariConfig16.getDataSourceClassName();
        int int18 = hikariConfig16.getAcquireRetries();
        hikariConfig16.connectionTimeout = 100;
        boolean boolean21 = hikariConfig16.isInitializationFailFast();
        java.lang.String str22 = hikariConfig16.connectionTestQuery;
        hikariConfig16.setConnectionCustomizerClassName("HikariPool-69");
        int int25 = hikariConfig16.getMaximumPoolSize();
        hikariConfig16.acquireIncrement = (short) -1;
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        boolean boolean30 = hikariConfig29.isInitializationFailFast();
        hikariConfig29.setInitializationFailFast(false);
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        java.lang.String str35 = hikariConfig34.getDataSourceClassName();
        hikariConfig34.setTransactionIsolation("hi!");
        hikariConfig34.acquireRetryDelay = '4';
        hikariConfig34.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties42 = hikariConfig34.getDataSourceProperties();
        hikariConfig29.setDataSourceProperties(properties42);
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig44.setAutoCommit(true);
        hikariConfig44.minPoolSize = '#';
        java.util.Properties properties49 = hikariConfig44.getDataSourceProperties();
        hikariConfig16.dataSourceProperties = properties49;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig1.setDataSourceProperties(properties49);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties49);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(properties49);
    }

    @Test
    public void test19421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19421");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = (-1);
        long long5 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolation = (byte) 10;
        long long8 = hikariConfig1.acquireRetryDelay;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test19422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19422");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setConnectionTimeout((long) 100);
        java.lang.String str11 = hikariConfig1.getJdbcUrl();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.connectionInitSql = "HikariPool-177";
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        hikariConfig1.transactionIsolation = '#';
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test19423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19423");
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
        int int14 = hikariConfig1.acquireRetries;
        hikariConfig1.setAcquireRetries(100);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test19424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19424");
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
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test19425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19425");
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
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionInitSql("HikariPool-1859");
        boolean boolean20 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.setAcquireIncrement(10);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45" + "'", str17, "HikariPool-45");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19426");
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
        boolean boolean47 = hikariConfig1.isReadOnly();
        long long48 = hikariConfig1.maxLifetime;
        boolean boolean49 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 32L + "'", long18 == 32L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 32L + "'", long35 == 32L);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 97L + "'", long48 == 97L);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test19427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19427");
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
        hikariConfig1.setLeakDetectionThreshold((long) 100);
        hikariConfig1.setReadOnly(false);
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test19428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19428");
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
        long long25 = hikariConfig1.getConnectionTimeout();
        javax.sql.DataSource dataSource26 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer27 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer27;
        javax.sql.DataSource dataSource29 = hikariConfig1.getDataSource();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3L + "'", long25 == 3L);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertNull(dataSource29);
    }

    @Test
    public void test19429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19429");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setIdleTimeout(2147483647L);
        hikariConfig1.setCatalog("HikariPool-26");
        java.lang.String str15 = hikariConfig1.jdbcUrl;
        hikariConfig1.setDataSourceClassName("HikariPool-49");
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        int int21 = hikariConfig1.acquireRetries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-49" + "'", str18, "HikariPool-49");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test19430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19430");
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
        boolean boolean14 = hikariConfig1.isIsolateInternalQueries();
        hikariConfig1.idleTimeout = 1800000L;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test19431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19431");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (short) 0;
        hikariConfig1.connectionInitSql = "HikariPool-48";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        boolean boolean8 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setLeakDetectionThreshold((-1L));
        long long11 = hikariConfig1.getLeakDetectionThreshold();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test19432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19432");
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
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        long long23 = hikariConfig22.getAcquireRetryDelay();
        long long24 = hikariConfig22.idleTimeout;
        java.lang.String str25 = hikariConfig22.getPoolName();
        hikariConfig22.setConnectionTestQuery("HikariPool-833");
        long long28 = hikariConfig22.acquireRetryDelay;
        long long29 = hikariConfig22.getConnectionTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-1425", (java.lang.Object) long29);
        java.util.Properties properties31 = hikariConfig1.getDataSourceProperties();
        java.lang.String str32 = hikariConfig1.dataSourceClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 32L + "'", long23 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-52622" + "'", str25, "HikariPool-52622");
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 32L + "'", long28 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 3L + "'", long29 == 3L);
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test19433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19433");
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
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.acquireRetries = 32;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test19434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19434");
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
        long long23 = hikariConfig1.connectionTimeout;
        hikariConfig1.setReadOnly(true);
        java.lang.String str26 = hikariConfig1.getPoolName();
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        long long29 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.connectionInitSql = "hi!";
        hikariConfig28.acquireIncrement = (byte) 100;
        hikariConfig28.setMinimumPoolSize((int) (short) 0);
        hikariConfig28.connectionTestQuery = "";
        long long38 = hikariConfig28.getConnectionTimeout();
        hikariConfig28.connectionTimeout = (byte) -1;
        javax.sql.DataSource dataSource41 = null;
        hikariConfig28.dataSource = dataSource41;
        hikariConfig28.setAcquireRetryDelay((long) (short) 0);
        javax.sql.DataSource dataSource45 = null;
        hikariConfig28.dataSource = dataSource45;
        hikariConfig28.transactionIsolation = (short) 10;
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        java.lang.String str51 = hikariConfig50.getDataSourceClassName();
        hikariConfig50.setTransactionIsolation("hi!");
        hikariConfig50.acquireRetryDelay = '4';
        hikariConfig50.setConnectionCustomizerClassName("");
        java.lang.String str58 = hikariConfig50.getPoolName();
        long long59 = hikariConfig50.getLeakDetectionThreshold();
        java.lang.String str60 = hikariConfig50.connectionInitSql;
        java.util.Properties properties61 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties61);
        long long63 = hikariConfig62.getAcquireRetryDelay();
        hikariConfig62.connectionInitSql = "hi!";
        hikariConfig62.setTransactionIsolation("hi!");
        hikariConfig62.isInitializationFailFast = true;
        java.util.Properties properties70 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties70);
        long long72 = hikariConfig71.getAcquireRetryDelay();
        hikariConfig71.connectionInitSql = "hi!";
        hikariConfig71.setLeakDetectionThreshold((long) (byte) -1);
        hikariConfig71.transactionIsolation = (byte) 0;
        java.util.Properties properties79 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig80 = new com.zaxxer.hikari.HikariConfig(properties79);
        long long81 = hikariConfig80.getAcquireRetryDelay();
        hikariConfig80.idleTimeout = (-1);
        java.util.Properties properties84 = hikariConfig80.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig85 = new com.zaxxer.hikari.HikariConfig(properties84);
        com.zaxxer.hikari.HikariConfig hikariConfig86 = new com.zaxxer.hikari.HikariConfig(properties84);
        com.zaxxer.hikari.HikariConfig hikariConfig87 = new com.zaxxer.hikari.HikariConfig(properties84);
        hikariConfig71.setDataSourceProperties(properties84);
        hikariConfig62.setDataSourceProperties(properties84);
        com.zaxxer.hikari.HikariConfig hikariConfig90 = new com.zaxxer.hikari.HikariConfig(properties84);
        hikariConfig50.dataSourceProperties = properties84;
        hikariConfig28.dataSourceProperties = properties84;
        hikariConfig1.dataSourceProperties = properties84;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1800000L + "'", long18 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 3L + "'", long23 == 3L);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HikariPool-52625" + "'", str26, "HikariPool-52625");
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 3L + "'", long38 == 3L);
        org.junit.Assert.assertNull(str51);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "HikariPool-52627" + "'", str58, "HikariPool-52627");
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNull(str60);
// flaky:         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 32L + "'", long63 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long72 + "' != '" + 32L + "'", long72 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long81 + "' != '" + 32L + "'", long81 == 32L);
        org.junit.Assert.assertNotNull(properties84);
    }

    @Test
    public void test19435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19435");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setPoolName("HikariPool-753");
        java.lang.String str3 = hikariConfig0.connectionTestQuery;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer4 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer4;
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test19436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19436");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties4);
        boolean boolean7 = hikariConfig6.isReadOnly();
        hikariConfig6.acquireRetries = (short) 0;
        hikariConfig6.setTransactionIsolation("HikariPool-50974");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test19437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19437");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        hikariConfig1.setConnectionCustomizerClassName("");
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.transactionIsolationName = "HikariPool-55";
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setTransactionIsolation("HikariPool-2451");
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52641" + "'", str9, "HikariPool-52641");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test19438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19438");
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
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        boolean boolean26 = hikariConfig25.isInitializationFailFast();
        java.lang.String str27 = hikariConfig25.jdbcUrl;
        long long28 = hikariConfig25.idleTimeout;
        boolean boolean29 = hikariConfig25.isJdbc4ConnectionTest();
        hikariConfig25.isIsolateInternalQueries = true;
        java.util.Properties properties32 = hikariConfig25.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties32);
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        long long37 = hikariConfig36.getAcquireRetryDelay();
        hikariConfig36.connectionInitSql = "hi!";
        hikariConfig36.acquireIncrement = (byte) 100;
        hikariConfig36.setMinimumPoolSize((int) (short) 0);
        java.lang.String str44 = hikariConfig36.dataSourceClassName;
        long long45 = hikariConfig36.getAcquireRetryDelay();
        hikariConfig36.idleTimeout = (byte) -1;
        java.util.Properties properties48 = hikariConfig36.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        hikariConfig49.setTransactionIsolation("HikariPool-188");
        boolean boolean52 = hikariConfig49.isAutoCommit;
        java.util.Properties properties53 = hikariConfig49.dataSourceProperties;
        hikariConfig34.setDataSourceProperties(properties53);
        hikariConfig1.setDataSourceProperties(properties53);
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties53);
        hikariConfig56.setDataSourceClassName("HikariPool-1106");
        boolean boolean59 = hikariConfig56.isJdbc4ConnectionTest();
        boolean boolean60 = hikariConfig56.isAutoCommit();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1800000L + "'", long28 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(properties32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 32L + "'", long37 == 32L);
        org.junit.Assert.assertNull(str44);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 32L + "'", long45 == 32L);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(properties53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test19439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19439");
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
        hikariConfig1.setMaxLifetime(60L);
        boolean boolean15 = hikariConfig1.isReadOnly;
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        java.lang.String str18 = hikariConfig1.connectionCustomizerClassName;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test19440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19440");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.connectionTestQuery = "";
        hikariConfig1.connectionTestQuery = "HikariPool-45";
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        long long14 = hikariConfig1.getIdleTimeout();
        long long15 = hikariConfig1.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45" + "'", str13, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
    }

    @Test
    public void test19441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19441");
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
        java.lang.String str15 = hikariConfig14.catalog;
        boolean boolean16 = hikariConfig14.isJdbc4ConnectionTest();
        hikariConfig14.isRegisterMbeans = false;
        hikariConfig14.transactionIsolation = '#';
        hikariConfig14.transactionIsolationName = "HikariPool-17716";
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        long long26 = hikariConfig25.getAcquireRetryDelay();
        hikariConfig25.connectionInitSql = "hi!";
        hikariConfig25.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource31 = null;
        hikariConfig25.dataSource = dataSource31;
        javax.sql.DataSource dataSource33 = hikariConfig25.dataSource;
        java.lang.String str34 = hikariConfig25.connectionTestQuery;
        java.lang.String str35 = hikariConfig25.dataSourceClassName;
        int int36 = hikariConfig25.transactionIsolation;
        boolean boolean37 = hikariConfig25.isJdbc4connectionTest;
        javax.sql.DataSource dataSource38 = hikariConfig25.dataSource;
        hikariConfig25.setAcquireRetries(3);
        long long41 = hikariConfig25.getIdleTimeout();
        hikariConfig25.transactionIsolationName = "HikariPool-886";
        hikariConfig14.addDataSourceProperty("HikariPool-547", (java.lang.Object) "HikariPool-886");
        int int45 = hikariConfig14.getMinimumPoolSize();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 32L + "'", long26 == 32L);
        org.junit.Assert.assertNull(dataSource33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(dataSource38);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1800000L + "'", long41 == 1800000L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test19442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19442");
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
        hikariConfig1.setJdbcUrl("HikariPool-268");
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isIsolateInternalQueries();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        long long26 = hikariConfig24.maxLifetime;
        java.util.Properties properties27 = hikariConfig24.getDataSourceProperties();
        java.lang.String str28 = hikariConfig24.getCatalog();
        hikariConfig24.connectionTestQuery = "HikariPool-84";
        hikariConfig24.transactionIsolation = (short) 100;
        int int33 = hikariConfig24.getTransactionIsolation();
        hikariConfig20.addDataSourceProperty("HikariPool-134", (java.lang.Object) hikariConfig24);
        hikariConfig24.catalog = "hi!";
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        long long39 = hikariConfig38.getAcquireRetryDelay();
        hikariConfig38.idleTimeout = (-1);
        java.util.Properties properties42 = hikariConfig38.getDataSourceProperties();
        long long43 = hikariConfig38.maxLifetime;
        hikariConfig38.setLeakDetectionThreshold(750L);
        int int46 = hikariConfig38.getMinimumPoolSize();
        java.lang.String str47 = hikariConfig38.getDataSourceClassName();
        hikariConfig38.setLeakDetectionThreshold(2147483647L);
        java.lang.String str50 = hikariConfig38.getDataSourceClassName();
        java.util.Properties properties51 = hikariConfig38.getDataSourceProperties();
        hikariConfig24.setDataSourceProperties(properties51);
        hikariConfig1.setDataSourceProperties(properties51);
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        java.lang.String str56 = hikariConfig55.getDataSourceClassName();
        long long57 = hikariConfig55.leakDetectionThreshold;
        hikariConfig55.setTransactionIsolation("HikariPool-77");
        hikariConfig55.connectionCustomizerClassName = "";
        javax.sql.DataSource dataSource62 = null;
        hikariConfig55.dataSource = dataSource62;
        java.lang.String str64 = hikariConfig55.poolName;
        hikariConfig55.setInitializationFailFast(true);
        java.util.Properties properties67 = hikariConfig55.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties67);
        hikariConfig1.connectionInitSql = "HikariPool-17270";
        hikariConfig1.setInitializationFailFast(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 32L + "'", long39 == 32L);
        org.junit.Assert.assertNotNull(properties42);
// flaky:         org.junit.Assert.assertTrue("'" + long43 + "' != '" + 97L + "'", long43 == 97L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "HikariPool-52658" + "'", str64, "HikariPool-52658");
        org.junit.Assert.assertNotNull(properties67);
    }

    @Test
    public void test19443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19443");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-2721";
        boolean boolean46 = hikariConfig1.isJdbc4ConnectionTest();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test19444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19444");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-28026";
        hikariConfig1.setDataSourceClassName("HikariPool-51705");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test19445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19445");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean12 = hikariConfig1.isIsolateInternalQueries();
        boolean boolean13 = hikariConfig1.isAutoCommit();
        long long14 = hikariConfig1.getMaxLifetime();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
    }

    @Test
    public void test19446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19446");
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
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        int int20 = hikariConfig18.getMinimumPoolSize();
        hikariConfig18.setConnectionCustomizerClassName("HikariPool-1106");
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        long long25 = hikariConfig24.getAcquireRetryDelay();
        hikariConfig24.idleTimeout = (-1);
        hikariConfig24.setMaximumPoolSize((int) 'a');
        java.lang.String str30 = hikariConfig24.catalog;
        java.lang.String str31 = hikariConfig24.transactionIsolationName;
        hikariConfig24.acquireIncrement = (short) 1;
        hikariConfig24.setIdleTimeout((long) (byte) -1);
        boolean boolean36 = hikariConfig24.isJdbc4connectionTest;
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        boolean boolean39 = hikariConfig38.isInitializationFailFast();
        long long40 = hikariConfig38.maxLifetime;
        java.util.Properties properties41 = hikariConfig38.getDataSourceProperties();
        hikariConfig38.isIsolateInternalQueries = false;
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        boolean boolean46 = hikariConfig45.isInitializationFailFast();
        long long47 = hikariConfig45.maxLifetime;
        java.util.Properties properties48 = hikariConfig45.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        hikariConfig38.setDataSourceProperties(properties48);
        hikariConfig24.dataSourceProperties = properties48;
        hikariConfig18.setDataSourceProperties(properties48);
        java.lang.String str53 = hikariConfig18.connectionInitSql;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 97L + "'", long47 == 97L);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test19447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19447");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-37361");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-37361 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19448");
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
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        int int14 = hikariConfig1.transactionIsolation;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        java.lang.String str18 = hikariConfig17.getDataSourceClassName();
        int int19 = hikariConfig17.getAcquireRetries();
        hikariConfig17.connectionTimeout = 100;
        boolean boolean22 = hikariConfig17.isInitializationFailFast();
        java.lang.String str23 = hikariConfig17.connectionTestQuery;
        hikariConfig17.setJdbcUrl("HikariPool-300");
        hikariConfig17.setConnectionCustomizerClassName("HikariPool-335");
        javax.sql.DataSource dataSource28 = null;
        hikariConfig17.setDataSource(dataSource28);
        boolean boolean30 = hikariConfig17.isRegisterMbeans;
        hikariConfig17.dataSourceClassName = "HikariPool-609";
        int int33 = hikariConfig17.maxPoolSize;
        hikariConfig17.acquireRetries = 1;
        hikariConfig17.setConnectionTestQuery("HikariPool-683");
        int int38 = hikariConfig17.minPoolSize;
        hikariConfig1.addDataSourceProperty("HikariPool-2092", (java.lang.Object) int38);
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        long long42 = hikariConfig41.getAcquireRetryDelay();
        hikariConfig41.connectionInitSql = "hi!";
        hikariConfig41.acquireIncrement = (byte) 100;
        hikariConfig41.setMinimumPoolSize((int) (short) 0);
        java.lang.String str49 = hikariConfig41.dataSourceClassName;
        long long50 = hikariConfig41.getAcquireRetryDelay();
        hikariConfig41.setLeakDetectionThreshold((long) (byte) 0);
        java.lang.String str53 = hikariConfig41.getConnectionCustomizerClassName();
        hikariConfig41.minPoolSize = (short) 10;
        java.util.Properties properties56 = hikariConfig41.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties56);
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties56);
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties56);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 32L + "'", long42 == 32L);
        org.junit.Assert.assertNull(str49);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 32L + "'", long50 == 32L);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(properties56);
    }

    @Test
    public void test19449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19449");
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
        java.lang.String str15 = hikariConfig1.catalog;
        hikariConfig1.setLeakDetectionThreshold((long) (-1));
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        hikariConfig1.setRegisterMbeans(false);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test19450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19450");
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
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        java.lang.String str17 = hikariConfig1.jdbcUrl;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2846");
        java.lang.String str20 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionTestQuery = "HikariPool-46873";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-2846" + "'", str20, "HikariPool-2846");
    }

    @Test
    public void test19451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19451");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.getIdleTimeout();
        int int10 = hikariConfig1.maxPoolSize;
        hikariConfig1.connectionInitSql = "HikariPool-126";
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        java.lang.String str14 = hikariConfig1.getCatalog();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isInitializationFailFast();
        long long18 = hikariConfig16.maxLifetime;
        java.util.Properties properties19 = hikariConfig16.getDataSourceProperties();
        java.lang.String str20 = hikariConfig16.getCatalog();
        hikariConfig16.connectionTestQuery = "HikariPool-84";
        java.lang.String str23 = hikariConfig16.connectionTestQuery;
        javax.sql.DataSource dataSource24 = null;
        hikariConfig16.setDataSource(dataSource24);
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        long long29 = hikariConfig28.getAcquireRetryDelay();
        hikariConfig28.idleTimeout = (-1);
        java.util.Properties properties32 = hikariConfig28.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig16.addDataSourceProperty("HikariPool-2221", (java.lang.Object) properties32);
        hikariConfig1.dataSourceProperties = properties32;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-126" + "'", str13, "HikariPool-126");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-84" + "'", str23, "HikariPool-84");
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 32L + "'", long29 == 32L);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test19452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19452");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setJdbcUrl("hi!");
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        int int12 = hikariConfig1.minPoolSize;
        hikariConfig1.setPoolName("HikariPool-154");
        hikariConfig1.connectionCustomizerClassName = "HikariPool-618";
        boolean boolean17 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.connectionTimeout = 52L;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19453");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-127";
        hikariConfig1.setConnectionTimeout((long) 358);
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setAcquireRetryDelay(750L);
        boolean boolean13 = hikariConfig1.isIsolateInternalQueries;
        hikariConfig1.setConnectionCustomizerClassName("");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test19454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19454");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource6 = null;
        hikariConfig1.setDataSource(dataSource6);
        hikariConfig1.transactionIsolation = (byte) 10;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        long long11 = hikariConfig1.idleTimeout;
        hikariConfig1.acquireIncrement = 3;
        hikariConfig1.minPoolSize = 52;
        java.lang.String str16 = hikariConfig1.connectionInitSql;
        boolean boolean17 = hikariConfig1.isIsolateInternalQueries();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test19455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19455");
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
        boolean boolean13 = hikariConfig1.isReadOnly;
        java.lang.String str14 = hikariConfig1.getCatalog();
        boolean boolean15 = hikariConfig1.isAutoCommit();
        boolean boolean16 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test19456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19456");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        int int7 = hikariConfig1.minPoolSize;
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean9 = hikariConfig1.isAutoCommit;
        long long10 = hikariConfig1.leakDetectionThreshold;
        long long11 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.dataSourceClassName = "HikariPool-298";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test19457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19457");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer17;
        hikariConfig1.setIdleTimeout(0L);
        java.lang.String str21 = hikariConfig1.catalog;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test19458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19458");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.acquireIncrement = (short) 1;
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str14 = hikariConfig1.getPoolName();
        long long15 = hikariConfig1.getLeakDetectionThreshold();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-52697" + "'", str14, "HikariPool-52697");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test19459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19459");
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
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        hikariConfig1.isReadOnly = true;
        hikariConfig1.setJdbcUrl("HikariPool-13439");
        java.lang.String str22 = hikariConfig1.connectionTestQuery;
        hikariConfig1.poolName = "HikariPool-693";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test19460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19460");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2517");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2517 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19461");
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
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig34.setDriverClassName("HikariPool-38597");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-38597' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-45" + "'", str11, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1800000L + "'", long36 == 1800000L);
    }

    @Test
    public void test19462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19462");
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
        int int14 = hikariConfig1.acquireIncrement;
        long long15 = hikariConfig1.connectionTimeout;
        long long16 = hikariConfig1.getIdleTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test19463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19463");
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
        hikariConfig25.setCatalog("HikariPool-1703");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test19464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19464");
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
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig1.connectionCustomizer;
        hikariConfig1.connectionTestQuery = "HikariPool-473";
        javax.sql.DataSource dataSource23 = hikariConfig1.dataSource;
        long long24 = hikariConfig1.idleTimeout;
        java.lang.String str25 = hikariConfig1.catalog;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertNull(dataSource23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1800000L + "'", long24 == 1800000L);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test19465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19465");
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
        int int19 = hikariConfig1.acquireRetries;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2147483647L + "'", long11 == 2147483647L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 2147483647L + "'", long17 == 2147483647L);
        org.junit.Assert.assertNull(iConnectionCustomizer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test19466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19466");
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
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setPoolName("HikariPool-748");
        java.lang.String str22 = hikariConfig1.getJdbcUrl();
        int int23 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
    }

    @Test
    public void test19467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19467");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-291";
        long long9 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        hikariConfig1.transactionIsolation = (short) 1;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setAutoCommit(false);
        int int20 = hikariConfig1.getTransactionIsolation();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test19468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19468");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.maxPoolSize = (byte) 0;
        javax.sql.DataSource dataSource4 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-55";
        hikariConfig1.connectionTestQuery = "hi!";
        java.lang.String str9 = hikariConfig1.poolName;
        hikariConfig1.setReadOnly(true);
        hikariConfig1.isInitializationFailFast = true;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.dataSource = dataSource14;
        hikariConfig1.maxLifetime = 5000L;
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
        hikariConfig1.jdbcUrl = "HikariPool-24609";
        org.junit.Assert.assertNull(dataSource4);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52715" + "'", str9, "HikariPool-52715");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test19469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19469");
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
        java.lang.String str18 = hikariConfig1.connectionTestQuery;
        long long19 = hikariConfig1.getIdleTimeout();
        long long20 = hikariConfig1.getConnectionTimeout();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test19470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19470");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str7 = hikariConfig1.catalog;
        boolean boolean8 = hikariConfig1.isReadOnly;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setAcquireRetryDelay(60L);
        boolean boolean12 = hikariConfig1.isAutoCommit();
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setIsolateInternalQueries(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test19471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19471");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) -1);
        long long7 = hikariConfig1.connectionTimeout;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        hikariConfig1.setJdbcUrl("HikariPool-833");
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        long long14 = hikariConfig1.getMaxLifetime();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
    }

    @Test
    public void test19472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19472");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setCatalog("hi!");
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.maxPoolSize = 35;
        long long17 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean20 = hikariConfig1.isReadOnly;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test19473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19473");
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
        boolean boolean19 = hikariConfig18.isJdbc4connectionTest;
        hikariConfig18.setIsolateInternalQueries(false);
        hikariConfig18.setRegisterMbeans(true);
        int int24 = hikariConfig18.minPoolSize;
        long long25 = hikariConfig18.acquireRetryDelay;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32L + "'", long25 == 32L);
    }

    @Test
    public void test19474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19474");
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
        boolean boolean38 = hikariConfig23.isInitializationFailFast();
        hikariConfig23.setTransactionIsolation("HikariPool-298");
        java.lang.String str41 = hikariConfig23.connectionInitSql;
        hikariConfig23.acquireRetryDelay = 10;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-188" + "'", str20, "HikariPool-188");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test19475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19475");
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
        int int13 = hikariConfig5.acquireRetries;
        hikariConfig5.connectionTestQuery = "HikariPool-39590";
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test19476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19476");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-39846");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-39846 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19477");
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
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test19478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19478");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.setRegisterMbeans(false);
        long long7 = hikariConfig1.acquireRetryDelay;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        hikariConfig1.acquireIncrement = (byte) 100;
        long long14 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setMaxLifetime((long) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test19479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19479");
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
        long long12 = hikariConfig1.acquireRetryDelay;
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        java.lang.String str14 = hikariConfig1.getCatalog();
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        long long16 = hikariConfig1.getIdleTimeout();
        java.lang.String str17 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52737" + "'", str9, "HikariPool-52737");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1800000L + "'", long16 == 1800000L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test19480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19480");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.jdbcUrl;
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        hikariConfig1.setConnectionTestQuery("HikariPool-32524");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test19481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19481");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str6 = hikariConfig1.transactionIsolationName;
        hikariConfig1.idleTimeout = 2147483647L;
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test19482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19482");
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
        long long19 = hikariConfig1.idleTimeout;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.dataSourceClassName = "HikariPool-15512";
        hikariConfig1.poolName = "HikariPool-12646";
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test19483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19483");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.acquireRetryDelay = '4';
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.minPoolSize = 0;
        hikariConfig1.setLeakDetectionThreshold(0L);
        java.lang.String str12 = hikariConfig1.getPoolName();
        hikariConfig1.idleTimeout = (byte) 1;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-52743" + "'", str12, "HikariPool-52743");
    }

    @Test
    public void test19484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19484");
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
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isReadOnly = true;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-52748" + "'", str15, "HikariPool-52748");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test19485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19485");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.acquireRetries = ' ';
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(properties28);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32L + "'", long31 == 32L);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test19486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19486");
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
        javax.sql.DataSource dataSource29 = hikariConfig25.getDataSource();
        int int30 = hikariConfig25.minPoolSize;
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test19487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19487");
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
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        long long33 = hikariConfig32.getAcquireRetryDelay();
        hikariConfig32.connectionInitSql = "hi!";
        hikariConfig32.acquireIncrement = (byte) 100;
        hikariConfig32.setMinimumPoolSize((int) (short) 0);
        hikariConfig32.connectionTestQuery = "";
        long long42 = hikariConfig32.getConnectionTimeout();
        int int43 = hikariConfig32.getMaximumPoolSize();
        long long44 = hikariConfig32.maxLifetime;
        hikariConfig32.setDataSourceClassName("HikariPool-117");
        boolean boolean47 = hikariConfig32.isAutoCommit;
        javax.sql.DataSource dataSource48 = null;
        hikariConfig32.dataSource = dataSource48;
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        long long52 = hikariConfig51.getAcquireRetryDelay();
        hikariConfig51.idleTimeout = (-1);
        java.util.Properties properties55 = hikariConfig51.getDataSourceProperties();
        long long56 = hikariConfig51.maxLifetime;
        hikariConfig51.setLeakDetectionThreshold(750L);
        int int59 = hikariConfig51.getMinimumPoolSize();
        hikariConfig51.acquireRetries = 'a';
        java.util.Properties properties62 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        long long64 = hikariConfig63.getAcquireRetryDelay();
        hikariConfig63.connectionInitSql = "hi!";
        hikariConfig63.acquireIncrement = (byte) 100;
        hikariConfig63.setMinimumPoolSize((int) (short) 0);
        java.lang.String str71 = hikariConfig63.dataSourceClassName;
        long long72 = hikariConfig63.getAcquireRetryDelay();
        hikariConfig63.idleTimeout = (byte) -1;
        java.util.Properties properties75 = hikariConfig63.dataSourceProperties;
        hikariConfig51.dataSourceProperties = properties75;
        com.zaxxer.hikari.HikariConfig hikariConfig77 = new com.zaxxer.hikari.HikariConfig(properties75);
        hikariConfig32.dataSourceProperties = properties75;
        java.lang.String str79 = hikariConfig32.dataSourceClassName;
        javax.sql.DataSource dataSource80 = hikariConfig32.getDataSource();
        int int81 = hikariConfig32.minPoolSize;
        java.util.Properties properties82 = hikariConfig32.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties82;
        hikariConfig1.setAcquireRetries((int) (byte) 0);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 32L + "'", long20 == 32L);
        org.junit.Assert.assertNotNull(properties23);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 32L + "'", long33 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long42 + "' != '" + 3L + "'", long42 == 3L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 60 + "'", int43 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 97L + "'", long44 == 97L);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + 32L + "'", long52 == 32L);
        org.junit.Assert.assertNotNull(properties55);
// flaky:         org.junit.Assert.assertTrue("'" + long56 + "' != '" + 97L + "'", long56 == 97L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long64 + "' != '" + 32L + "'", long64 == 32L);
        org.junit.Assert.assertNull(str71);
// flaky:         org.junit.Assert.assertTrue("'" + long72 + "' != '" + 32L + "'", long72 == 32L);
        org.junit.Assert.assertNotNull(properties75);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "HikariPool-117" + "'", str79, "HikariPool-117");
        org.junit.Assert.assertNull(dataSource80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(properties82);
    }

    @Test
    public void test19488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19488");
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
        hikariConfig1.connectionCustomizerClassName = "HikariPool-40954";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test19489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19489");
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
        hikariConfig14.acquireRetries = 0;
        hikariConfig14.setPoolName("HikariPool-32009");
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
    public void test19490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19490");
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
        boolean boolean36 = hikariConfig1.isAutoCommit;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer37 = hikariConfig1.connectionCustomizer;
        boolean boolean38 = hikariConfig1.isIsolateInternalQueries;
        int int39 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-45" + "'", str11, "HikariPool-45");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 52L + "'", long35 == 52L);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test19491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19491");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-36285");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-36285 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test19492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19492");
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
        hikariConfig8.setIsolateInternalQueries(true);
        hikariConfig8.setAcquireRetryDelay(1800000L);
        java.lang.String str15 = hikariConfig8.getConnectionInitSql();
        hikariConfig8.setReadOnly(true);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test19493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19493");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.setConnectionInitSql("HikariPool-84");
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        java.lang.String str12 = hikariConfig10.connectionInitSql;
        hikariConfig10.setMinimumPoolSize((int) (byte) 0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig10.connectionCustomizer = iConnectionCustomizer15;
        int int17 = hikariConfig10.maxPoolSize;
        hikariConfig10.setLeakDetectionThreshold(52L);
        hikariConfig10.setCatalog("HikariPool-353");
        int int22 = hikariConfig10.maxPoolSize;
        hikariConfig10.setJdbc4ConnectionTest(false);
        hikariConfig1.addDataSourceProperty("HikariPool-39108", (java.lang.Object) hikariConfig10);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
    }

    @Test
    public void test19494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19494");
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
        hikariConfig25.setAcquireRetries(3);
        int int28 = hikariConfig25.transactionIsolation;
        java.lang.String str29 = hikariConfig25.connectionTestQuery;
        hikariConfig25.setIdleTimeout((long) 52);
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test19495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19495");
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
        hikariConfig1.setIdleTimeout(0L);
        int int18 = hikariConfig1.acquireIncrement;
        hikariConfig1.acquireRetries = 10;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test19496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19496");
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
        hikariConfig10.setTransactionIsolation("HikariPool-37");
        boolean boolean22 = hikariConfig10.isReadOnly;
        hikariConfig10.setAcquireRetries(32);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test19497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19497");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.acquireIncrement = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTimeout = (byte) 10;
        javax.sql.DataSource dataSource13 = hikariConfig1.dataSource;
        int int14 = hikariConfig1.getTransactionIsolation();
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.connectionTestQuery = "HikariPool-2165";
        int int18 = hikariConfig1.acquireRetries;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test19498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19498");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getDataSourceClassName();
        int int3 = hikariConfig1.getAcquireRetries();
        int int4 = hikariConfig1.getAcquireIncrement();
        long long5 = hikariConfig1.leakDetectionThreshold;
        boolean boolean6 = hikariConfig1.isIsolateInternalQueries;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.poolName = "HikariPool-47707";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test19499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19499");
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
        long long12 = hikariConfig1.acquireRetryDelay;
        hikariConfig1.dataSourceClassName = "HikariPool-225";
        long long15 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-52798" + "'", str9, "HikariPool-52798");
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-225" + "'", str20, "HikariPool-225");
    }

    @Test
    public void test19500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test19500");
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
        java.lang.String str33 = hikariConfig32.getDataSourceClassName();
        hikariConfig32.isJdbc4connectionTest = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertNull(str33);
    }
}
