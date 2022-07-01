import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.leakDetectionThreshold = 32L;
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.connectionInitSql = "HikariPool-1267";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-120";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        long long10 = hikariConfig1.idleTimeout;
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.connectionInitSql = "HikariPool-802";
        hikariConfig1.catalog = "HikariPool-5335";
        boolean boolean17 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2323");
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        long long12 = hikariConfig1.getConnectionTimeout();
        int int13 = hikariConfig1.minPoolSize;
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.catalog = "HikariPool-25034";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.poolName;
        hikariConfig10.setDataSourceClassName("");
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig10);
        java.lang.String str15 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str16 = hikariConfig1.getPoolName();
        long long17 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-27125" + "'", str11, "HikariPool-27125");
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-27124" + "'", str16, "HikariPool-27124");
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.connectionInitSql = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setAcquireRetries(0);
        boolean boolean18 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        hikariConfig0.transactionIsolation = 100;
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig0.catalog;
        boolean boolean9 = hikariConfig0.isRegisterMbeans;
        java.lang.String str10 = hikariConfig0.connectionInitSql;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setTransactionIsolation("hi!");
        int int16 = hikariConfig11.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig11);
        hikariConfig11.connectionInitSql = "HikariPool-222";
        hikariConfig11.setPoolName("HikariPool-114");
        hikariConfig11.setUseInstrumentation(true);
        long long24 = hikariConfig11.getAcquireRetryDelay();
        boolean boolean25 = hikariConfig11.isRegisterMbeans();
        hikariConfig11.leakDetectionThreshold = 52;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.connectionTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.catalog;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        hikariConfig15.connectionTimeout = 10L;
        hikariConfig15.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        hikariConfig23.isInitializationFailFast = true;
        int int29 = hikariConfig23.acquireRetries;
        hikariConfig23.setMaxLifetime((long) (-1));
        int int32 = hikariConfig23.getTransactionIsolation();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        int int39 = hikariConfig34.getMaximumPoolSize();
        int int40 = hikariConfig34.transactionIsolation;
        java.util.Properties properties41 = hikariConfig34.dataSourceProperties;
        hikariConfig23.setDataSourceProperties(properties41);
        hikariConfig15.setDataSourceProperties(properties41);
        hikariConfig1.setDataSourceProperties(properties41);
        java.lang.String str45 = hikariConfig1.getPoolName();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str48 = hikariConfig1.getPoolName();
        long long49 = hikariConfig1.idleTimeout;
        long long50 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.transactionIsolationName = "HikariPool-2991";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-2573";
        hikariConfig1.idleTimeout = 0L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(properties41);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HikariPool-27136" + "'", str45, "HikariPool-27136");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "HikariPool-27136" + "'", str48, "HikariPool-27136");
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 60L + "'", long49 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 10L + "'", long50 == 10L);
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setDataSourceClassName("HikariPool-517");
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        long long14 = hikariConfig1.maxLifetime;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.catalog = "HikariPool-116";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        int int9 = hikariConfig8.getTransactionIsolation();
        hikariConfig8.setRegisterMbeans(false);
        java.lang.String str12 = hikariConfig8.transactionIsolationName;
        int int13 = hikariConfig8.transactionIsolation;
        javax.sql.DataSource dataSource14 = null;
        hikariConfig8.dataSource = dataSource14;
        long long16 = hikariConfig8.maxLifetime;
        java.lang.String str17 = hikariConfig8.dataSourceClassName;
        hikariConfig8.setRegisterMbeans(true);
        hikariConfig1.addDataSourceProperty("HikariPool-114", (java.lang.Object) hikariConfig8);
        int int21 = hikariConfig8.getAcquireRetries();
        long long22 = hikariConfig8.getMaxLifetime();
        hikariConfig8.idleTimeout = 87L;
        hikariConfig8.transactionIsolationName = "HikariPool-756";
        int int27 = hikariConfig8.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) 3);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        int int14 = hikariConfig1.acquireRetries;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        java.lang.String str20 = hikariConfig16.dataSourceClassName;
        java.lang.String str21 = hikariConfig16.dataSourceClassName;
        hikariConfig16.setJdbc4ConnectionTest(false);
        int int24 = hikariConfig16.maxPoolSize;
        hikariConfig16.idleTimeout = (byte) -1;
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        int int29 = hikariConfig28.getTransactionIsolation();
        hikariConfig28.setRegisterMbeans(false);
        hikariConfig28.dataSourceClassName = "";
        hikariConfig28.setTransactionIsolation("");
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        hikariConfig37.isInitializationFailFast = true;
        int int43 = hikariConfig37.acquireRetries;
        hikariConfig37.setMaxLifetime((long) (-1));
        int int46 = hikariConfig37.getTransactionIsolation();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        int int49 = hikariConfig48.getTransactionIsolation();
        hikariConfig48.setRegisterMbeans(false);
        java.lang.String str52 = hikariConfig48.transactionIsolationName;
        int int53 = hikariConfig48.getMaximumPoolSize();
        int int54 = hikariConfig48.transactionIsolation;
        java.util.Properties properties55 = hikariConfig48.dataSourceProperties;
        hikariConfig37.setDataSourceProperties(properties55);
        hikariConfig28.dataSourceProperties = properties55;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig16.dataSourceProperties = properties55;
        hikariConfig1.setDataSourceProperties(properties55);
        boolean boolean61 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.poolName = "HikariPool-410";
        hikariConfig1.dataSourceClassName = "HikariPool-26";
        hikariConfig1.setMaxLifetime((long) (short) 1);
        long long68 = hikariConfig1.idleTimeout;
        java.util.Properties properties69 = hikariConfig1.dataSourceProperties;
        long long70 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60 + "'", int53 == 60);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long68 + "' != '" + 60L + "'", long68 == 60L);
        org.junit.Assert.assertNotNull(properties69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1L + "'", long70 == 1L);
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) "HikariPool-6");
        hikariConfig1.setMaxLifetime(10L);
        long long10 = hikariConfig1.connectionTimeout;
        long long11 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.idleTimeout = 2147483647L;
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig14.dataSourceClassName = "";
        hikariConfig14.setIdleTimeout((long) (short) 100);
        java.util.Properties properties22 = hikariConfig14.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties22;
        javax.sql.DataSource dataSource24 = hikariConfig1.dataSource;
        hikariConfig1.connectionTestQuery = "HikariPool-277";
        int int27 = hikariConfig1.getAcquireRetries();
        boolean boolean28 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setPoolName("HikariPool-249");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig13.connectionCustomizer;
        int int25 = hikariConfig13.getMaximumPoolSize();
        javax.sql.DataSource dataSource26 = null;
        hikariConfig13.setDataSource(dataSource26);
        hikariConfig13.isAutoCommit = false;
        java.lang.String str30 = hikariConfig13.getCatalog();
        java.lang.String str31 = hikariConfig13.getDataSourceClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer32 = hikariConfig13.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(iConnectionCustomizer24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(iConnectionCustomizer32);
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        hikariConfig1.connectionTimeout = 1L;
        int int10 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-21785");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-21785 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.catalog;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        hikariConfig15.connectionTimeout = 10L;
        hikariConfig15.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        hikariConfig23.isInitializationFailFast = true;
        int int29 = hikariConfig23.acquireRetries;
        hikariConfig23.setMaxLifetime((long) (-1));
        int int32 = hikariConfig23.getTransactionIsolation();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        int int39 = hikariConfig34.getMaximumPoolSize();
        int int40 = hikariConfig34.transactionIsolation;
        java.util.Properties properties41 = hikariConfig34.dataSourceProperties;
        hikariConfig23.setDataSourceProperties(properties41);
        hikariConfig15.setDataSourceProperties(properties41);
        hikariConfig1.setDataSourceProperties(properties41);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties41);
        boolean boolean46 = hikariConfig45.isInitializationFailFast();
        hikariConfig45.setInitializationFailFast(false);
        int int49 = hikariConfig45.maxPoolSize;
        long long50 = hikariConfig45.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 60 + "'", int49 == 60);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.maxLifetime = '#';
        java.lang.String str11 = hikariConfig1.catalog;
        hikariConfig1.setTransactionIsolation("HikariPool-249");
        hikariConfig1.setIdleTimeout((long) 60);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer16;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.dataSourceClassName = "HikariPool-204";
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries(10);
        boolean boolean19 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.minPoolSize = (short) 0;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.leakDetectionThreshold = 35L;
        java.lang.String str28 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.String str15 = hikariConfig1.connectionTestQuery;
        hikariConfig1.maxLifetime = (short) 100;
        hikariConfig1.setMaxLifetime(35L);
        hikariConfig1.poolName = "HikariPool-1457";
        int int22 = hikariConfig1.transactionIsolation;
        hikariConfig1.setPoolName("HikariPool-447");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isJdbc4connectionTest = false;
        int int12 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionTestQuery = "HikariPool-173";
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.isInitializationFailFast = false;
        boolean boolean17 = hikariConfig1.isAutoCommit;
        java.lang.String str18 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str8 = hikariConfig1.getPoolName();
        hikariConfig1.setDataSourceClassName("HikariPool-756");
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setLeakDetectionThreshold((long) (short) -1);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        hikariConfig16.setTransactionIsolation("hi!");
        long long22 = hikariConfig16.connectionTimeout;
        java.lang.String str23 = hikariConfig16.getPoolName();
        hikariConfig16.isAutoCommit = true;
        java.lang.String str26 = hikariConfig16.getPoolName();
        hikariConfig16.setRegisterMbeans(true);
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        int int32 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.setRegisterMbeans(false);
        hikariConfig31.dataSourceClassName = "";
        hikariConfig31.setTransactionIsolation("");
        boolean boolean39 = hikariConfig31.isRegisterMbeans();
        hikariConfig31.setDataSourceClassName("HikariPool-173");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer42 = hikariConfig31.connectionCustomizer;
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        int int45 = hikariConfig44.getTransactionIsolation();
        hikariConfig44.setRegisterMbeans(false);
        hikariConfig44.dataSourceClassName = "";
        hikariConfig44.setIdleTimeout((long) (short) 100);
        java.util.Properties properties52 = hikariConfig44.getDataSourceProperties();
        hikariConfig31.dataSourceProperties = properties52;
        javax.sql.DataSource dataSource54 = hikariConfig31.dataSource;
        hikariConfig16.addDataSourceProperty("HikariPool-2262", (java.lang.Object) hikariConfig31);
        java.util.Properties properties56 = hikariConfig31.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties56;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig58.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-27174" + "'", str8, "HikariPool-27174");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertNull(dataSource54);
        org.junit.Assert.assertNotNull(properties56);
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(true);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        int int13 = hikariConfig1.maxPoolSize;
        hikariConfig1.acquireRetries = 97;
        long long16 = hikariConfig1.getIdleTimeout();
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-27181" + "'", str8, "HikariPool-27181");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        long long10 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        long long12 = hikariConfig1.idleTimeout;
        int int13 = hikariConfig1.maxPoolSize;
        java.lang.String str14 = hikariConfig1.poolName;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-27182" + "'", str14, "HikariPool-27182");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.poolName = "HikariPool-59";
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.dataSourceClassName = "HikariPool-707";
        hikariConfig1.idleTimeout = (byte) -1;
        hikariConfig1.acquireRetries = 60;
        hikariConfig1.setConnectionInitSql("HikariPool-1632");
        java.lang.String str23 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        int int16 = hikariConfig11.getMaximumPoolSize();
        int int17 = hikariConfig11.transactionIsolation;
        java.util.Properties properties18 = hikariConfig11.dataSourceProperties;
        hikariConfig11.transactionIsolation = (byte) 1;
        hikariConfig11.dataSourceClassName = "";
        boolean boolean23 = hikariConfig11.isJdbc4connectionTest;
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-59", (java.lang.Object) hikariConfig11);
        hikariConfig1.acquireRetries = 0;
        hikariConfig1.setIdleTimeout((long) (short) 1);
        hikariConfig1.setPoolName("HikariPool-927");
        java.lang.String str33 = hikariConfig1.connectionCustomizerClassName;
        int int34 = hikariConfig1.acquireRetries;
        hikariConfig1.catalog = "HikariPool-18591";
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        long long13 = hikariConfig1.maxLifetime;
        hikariConfig1.transactionIsolationName = "HikariPool-205";
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.setConnectionInitSql("hi!");
        int int21 = hikariConfig18.getMinimumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-780", (java.lang.Object) int21);
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        hikariConfig24.isInitializationFailFast = true;
        int int30 = hikariConfig24.acquireRetries;
        hikariConfig24.setMaxLifetime((long) (-1));
        boolean boolean33 = hikariConfig24.isInitializationFailFast();
        long long34 = hikariConfig24.maxLifetime;
        hikariConfig24.minPoolSize = (byte) -1;
        boolean boolean37 = hikariConfig24.isJdbc4connectionTest;
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.setRegisterMbeans(false);
        java.lang.String str43 = hikariConfig39.transactionIsolationName;
        long long44 = hikariConfig39.getIdleTimeout();
        java.lang.String str45 = hikariConfig39.getCatalog();
        java.lang.String str46 = hikariConfig39.getConnectionTestQuery();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig48.dataSourceClassName = "";
        java.util.Properties properties51 = hikariConfig48.dataSourceProperties;
        hikariConfig39.setDataSourceProperties(properties51);
        hikariConfig24.setDataSourceProperties(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig1.setDataSourceProperties(properties51);
        hikariConfig1.maxLifetime = (short) -1;
        hikariConfig1.connectionTimeout = '4';
        boolean boolean60 = hikariConfig1.isRegisterMbeans();
        long long61 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(str43);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 60L + "'", long44 == 60L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(properties51);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 60L + "'", long61 == 60L);
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        int int16 = hikariConfig11.getMaximumPoolSize();
        int int17 = hikariConfig11.transactionIsolation;
        java.util.Properties properties18 = hikariConfig11.dataSourceProperties;
        hikariConfig11.transactionIsolation = (byte) 1;
        hikariConfig11.dataSourceClassName = "";
        boolean boolean23 = hikariConfig11.isJdbc4connectionTest;
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-59", (java.lang.Object) hikariConfig11);
        hikariConfig11.setMaximumPoolSize(10);
        hikariConfig11.setAutoCommit(true);
        java.lang.String str31 = hikariConfig11.getConnectionCustomizerClassName();
        boolean boolean32 = hikariConfig11.isJdbc4connectionTest;
        hikariConfig11.connectionTestQuery = "HikariPool-24393";
        int int35 = hikariConfig11.maxPoolSize;
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.setCatalog("HikariPool-320");
        hikariConfig1.minPoolSize = '4';
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.catalog = "HikariPool-10316";
        hikariConfig1.validate();
        int int15 = hikariConfig1.minPoolSize;
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) 'a');
        int int14 = hikariConfig1.maxPoolSize;
        hikariConfig1.maxLifetime = 5000L;
        hikariConfig1.setIdleTimeout(52L);
        int int19 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.connectionTimeout = 87;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-414";
        java.lang.String str10 = hikariConfig1.getPoolName();
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAcquireRetries((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-27205" + "'", str10, "HikariPool-27205");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setTransactionIsolation("hi!");
        int int16 = hikariConfig11.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig11);
        int int18 = hikariConfig1.minPoolSize;
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setConnectionInitSql("hi!");
        long long23 = hikariConfig20.getLeakDetectionThreshold();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        int int30 = hikariConfig25.getMaximumPoolSize();
        int int31 = hikariConfig25.transactionIsolation;
        java.util.Properties properties32 = hikariConfig25.dataSourceProperties;
        hikariConfig20.dataSourceProperties = properties32;
        java.util.Properties properties34 = hikariConfig20.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties34);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer36 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMinimumPoolSize(87);
        int int39 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNull(iConnectionCustomizer36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 87 + "'", int39 == 87);
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.connectionTimeout = (byte) 1;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.transactionIsolation = 100;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        int int14 = hikariConfig1.acquireRetries;
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        int int10 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.connectionInitSql = "HikariPool-517";
        java.lang.String str15 = hikariConfig1.getCatalog();
        java.lang.String str16 = hikariConfig1.poolName;
        java.lang.String str17 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.dataSource = dataSource18;
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-824", obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-27217" + "'", str16, "HikariPool-27217");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) 'a');
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.catalog = "";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.maxLifetime = (-1);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig14.transactionIsolationName;
        int int19 = hikariConfig14.transactionIsolation;
        java.lang.String str20 = hikariConfig14.getConnectionInitSql();
        int int21 = hikariConfig14.getMaximumPoolSize();
        hikariConfig14.setJdbc4ConnectionTest(false);
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        java.lang.String str30 = hikariConfig26.transactionIsolationName;
        long long31 = hikariConfig26.getIdleTimeout();
        java.lang.String str32 = hikariConfig26.getCatalog();
        java.util.Properties properties33 = hikariConfig26.getDataSourceProperties();
        hikariConfig26.setUseInstrumentation(false);
        hikariConfig14.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig26);
        hikariConfig14.poolName = "HikariPool-104";
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig40.leakDetectionThreshold = 100;
        boolean boolean43 = hikariConfig40.isJdbc4ConnectionTest();
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        long long50 = hikariConfig45.getIdleTimeout();
        java.lang.String str51 = hikariConfig45.getCatalog();
        java.lang.String str52 = hikariConfig45.getConnectionTestQuery();
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        hikariConfig54.dataSourceClassName = "";
        java.util.Properties properties57 = hikariConfig54.dataSourceProperties;
        hikariConfig45.setDataSourceProperties(properties57);
        hikariConfig40.dataSourceProperties = properties57;
        java.util.Properties properties60 = hikariConfig40.dataSourceProperties;
        hikariConfig14.dataSourceProperties = properties60;
        hikariConfig1.dataSourceProperties = properties60;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties60);
        hikariConfig63.dataSourceClassName = "HikariPool-413";
        java.lang.String str66 = hikariConfig63.connectionCustomizerClassName;
        hikariConfig63.maxPoolSize = (byte) 10;
        java.lang.String str69 = hikariConfig63.getConnectionTestQuery();
        hikariConfig63.poolName = "HikariPool-22152";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str30);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 60L + "'", long31 == 60L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 60L + "'", long50 == 60L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str69);
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getAcquireRetries();
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        long long8 = hikariConfig0.getMaxLifetime();
        java.lang.Class<?> wildcardClass9 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 32L;
        int int5 = hikariConfig1.getTransactionIsolation();
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource7 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource7);
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.isJdbc4connectionTest = false;
        long long10 = hikariConfig1.getMaxLifetime();
        int int11 = hikariConfig1.getMaximumPoolSize();
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.dataSourceClassName = "HikariPool-357";
        java.lang.String str15 = hikariConfig1.getCatalog();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig6.transactionIsolationName;
        long long11 = hikariConfig6.getIdleTimeout();
        java.lang.String str12 = hikariConfig6.getCatalog();
        java.lang.String str13 = hikariConfig6.getConnectionTestQuery();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        java.util.Properties properties18 = hikariConfig15.dataSourceProperties;
        hikariConfig6.setDataSourceProperties(properties18);
        hikariConfig1.dataSourceProperties = properties18;
        java.lang.String str21 = hikariConfig1.poolName;
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str24 = hikariConfig1.getConnectionTestQuery();
        int int25 = hikariConfig1.minPoolSize;
        int int26 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionTestQuery = "HikariPool-1781";
        hikariConfig1.setConnectionTestQuery("HikariPool-2056");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-27236" + "'", str21, "HikariPool-27236");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.isAutoCommit = false;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        int int17 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.connectionInitSql = "HikariPool-104";
        hikariConfig1.setPoolName("HikariPool-204");
        boolean boolean12 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.transactionIsolationName = "HikariPool-17064";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.transactionIsolation = 100;
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isRegisterMbeans = true;
        int int16 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.transactionIsolation = 100;
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean14 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setDataSourceClassName("HikariPool-517");
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isJdbc4connectionTest = false;
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-1024");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionInitSql("HikariPool-780");
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        java.lang.String str9 = hikariConfig1.getPoolName();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.setDataSource(dataSource10);
        hikariConfig1.transactionIsolationName = "HikariPool-204";
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(100);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        long long13 = hikariConfig1.maxLifetime;
        int int14 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        hikariConfig1.setConnectionInitSql("HikariPool-9397");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.leakDetectionThreshold = 1L;
        hikariConfig1.maxPoolSize = (byte) 0;
        long long9 = hikariConfig1.connectionTimeout;
        hikariConfig1.connectionInitSql = "HikariPool-581";
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.idleTimeout = (byte) -1;
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        hikariConfig13.dataSourceClassName = "";
        hikariConfig13.setTransactionIsolation("");
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        int int23 = hikariConfig22.getTransactionIsolation();
        hikariConfig22.setRegisterMbeans(false);
        hikariConfig22.isInitializationFailFast = true;
        int int28 = hikariConfig22.acquireRetries;
        hikariConfig22.setMaxLifetime((long) (-1));
        int int31 = hikariConfig22.getTransactionIsolation();
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        int int34 = hikariConfig33.getTransactionIsolation();
        hikariConfig33.setRegisterMbeans(false);
        java.lang.String str37 = hikariConfig33.transactionIsolationName;
        int int38 = hikariConfig33.getMaximumPoolSize();
        int int39 = hikariConfig33.transactionIsolation;
        java.util.Properties properties40 = hikariConfig33.dataSourceProperties;
        hikariConfig22.setDataSourceProperties(properties40);
        hikariConfig13.dataSourceProperties = properties40;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig1.dataSourceProperties = properties40;
        long long45 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean46 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.poolName = "HikariPool-1367";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-4961";
        javax.sql.DataSource dataSource51 = null;
        hikariConfig1.dataSource = dataSource51;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60 + "'", int38 == 60);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.setConnectionInitSql("hi!");
        long long12 = hikariConfig9.getLeakDetectionThreshold();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig14.transactionIsolationName;
        int int19 = hikariConfig14.getMaximumPoolSize();
        int int20 = hikariConfig14.transactionIsolation;
        java.util.Properties properties21 = hikariConfig14.dataSourceProperties;
        hikariConfig9.dataSourceProperties = properties21;
        java.util.Properties properties23 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties23;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig26.setTransactionIsolation("HikariPool-130");
        javax.sql.DataSource dataSource29 = null;
        hikariConfig26.dataSource = dataSource29;
        java.lang.String str31 = hikariConfig26.dataSourceClassName;
        java.lang.String str32 = hikariConfig26.getConnectionCustomizerClassName();
        boolean boolean33 = hikariConfig26.isJdbc4ConnectionTest();
        int int34 = hikariConfig26.getAcquireRetries();
        int int35 = hikariConfig26.minPoolSize;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setAutoCommit(false);
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        hikariConfig1.transactionIsolation = ' ';
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("hi!");
        java.lang.String str9 = hikariConfig1.getCatalog();
        int int10 = hikariConfig1.acquireRetries;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        int int13 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setPoolName("HikariPool-489");
        long long16 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str17 = hikariConfig1.poolName;
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        java.lang.String str19 = hikariConfig1.catalog;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.connectionInitSql = "HikariPool-2458";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-489" + "'", str17, "HikariPool-489");
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.isInitializationFailFast = false;
        long long13 = hikariConfig1.connectionTimeout;
        long long14 = hikariConfig1.getMaxLifetime();
        long long15 = hikariConfig1.connectionTimeout;
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.addDataSourceProperty("HikariPool-413", (java.lang.Object) 32L);
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        hikariConfig1.acquireRetries = (short) -1;
        hikariConfig1.leakDetectionThreshold = (byte) 100;
        hikariConfig1.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isInitializationFailFast = false;
        boolean boolean10 = hikariConfig1.isAutoCommit;
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.connectionTestQuery;
        hikariConfig1.isJdbc4connectionTest = true;
        boolean boolean8 = hikariConfig1.isAutoCommit;
        hikariConfig1.setLeakDetectionThreshold((long) 97);
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.connectionInitSql = "HikariPool-12368";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.minPoolSize;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        int int7 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.leakDetectionThreshold = (byte) 10;
        java.lang.String str16 = hikariConfig1.connectionInitSql;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.dataSourceClassName = "";
        hikariConfig18.setTransactionIsolation("");
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        int int28 = hikariConfig27.getTransactionIsolation();
        hikariConfig27.setRegisterMbeans(false);
        hikariConfig27.isInitializationFailFast = true;
        int int33 = hikariConfig27.acquireRetries;
        hikariConfig27.setMaxLifetime((long) (-1));
        int int36 = hikariConfig27.getTransactionIsolation();
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        int int39 = hikariConfig38.getTransactionIsolation();
        hikariConfig38.setRegisterMbeans(false);
        java.lang.String str42 = hikariConfig38.transactionIsolationName;
        int int43 = hikariConfig38.getMaximumPoolSize();
        int int44 = hikariConfig38.transactionIsolation;
        java.util.Properties properties45 = hikariConfig38.dataSourceProperties;
        hikariConfig27.setDataSourceProperties(properties45);
        hikariConfig18.dataSourceProperties = properties45;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig1.setDataSourceProperties(properties45);
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 60 + "'", int43 == 60);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(properties45);
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-3822");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-3822 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.dataSourceClassName = "HikariPool-204";
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.transactionIsolationName = "HikariPool-410";
        long long21 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str22 = hikariConfig1.poolName;
        java.lang.String str23 = hikariConfig1.getConnectionInitSql();
        long long24 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.connectionInitSql = "HikariPool-20302";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        hikariConfig1.setPoolName("HikariPool-517");
        java.lang.String str6 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-780");
        boolean boolean9 = hikariConfig1.isInitializationFailFast();
        int int10 = hikariConfig1.acquireRetries;
        long long11 = hikariConfig1.maxLifetime;
        boolean boolean12 = hikariConfig1.isAutoCommit();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.transactionIsolation = 1;
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        boolean boolean14 = hikariConfig1.isAutoCommit();
        int int15 = hikariConfig1.getAcquireIncrement();
        java.lang.String str16 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        hikariConfig1.poolName = "HikariPool-104";
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.leakDetectionThreshold = 100;
        boolean boolean30 = hikariConfig27.isJdbc4ConnectionTest();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int33 = hikariConfig32.getTransactionIsolation();
        hikariConfig32.setRegisterMbeans(false);
        java.lang.String str36 = hikariConfig32.transactionIsolationName;
        long long37 = hikariConfig32.getIdleTimeout();
        java.lang.String str38 = hikariConfig32.getCatalog();
        java.lang.String str39 = hikariConfig32.getConnectionTestQuery();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig41.dataSourceClassName = "";
        java.util.Properties properties44 = hikariConfig41.dataSourceProperties;
        hikariConfig32.setDataSourceProperties(properties44);
        hikariConfig27.dataSourceProperties = properties44;
        java.util.Properties properties47 = hikariConfig27.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties47;
        java.lang.String str49 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean52 = hikariConfig1.isInitializationFailFast();
        java.lang.String str53 = hikariConfig1.getConnectionTestQuery();
        long long54 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60L + "'", long37 == 60L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str53);
// flaky:         org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.poolName = "HikariPool-55";
        hikariConfig1.connectionCustomizerClassName = "HikariPool-126";
        hikariConfig1.setCatalog("HikariPool-274");
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource6 = hikariConfig1.dataSource;
        int int7 = hikariConfig1.minPoolSize;
        hikariConfig1.maxLifetime = 1;
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        long long7 = hikariConfig1.idleTimeout;
        hikariConfig1.maxLifetime = 100;
        int int10 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setLeakDetectionThreshold((long) ' ');
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.catalog = "HikariPool-1093";
        hikariConfig1.setConnectionTimeout(100L);
        hikariConfig1.acquireRetries = (-1);
        int int16 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.connectionInitSql = "HikariPool-104";
        hikariConfig1.setPoolName("HikariPool-204");
        boolean boolean12 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-383";
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        hikariConfig1.idleTimeout = 3L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.isRegisterMbeans = true;
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig6.setDataSourceClassName("");
        hikariConfig6.setConnectionTestQuery("hi!");
        hikariConfig6.transactionIsolationName = "HikariPool-707";
        hikariConfig6.transactionIsolationName = "HikariPool-153";
        hikariConfig6.setDataSourceClassName("HikariPool-1485");
        java.lang.String str17 = hikariConfig6.dataSourceClassName;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.setRegisterMbeans(false);
        hikariConfig19.isInitializationFailFast = true;
        int int25 = hikariConfig19.acquireRetries;
        hikariConfig19.setMaxLifetime((long) (-1));
        int int28 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.maxLifetime = 32L;
        java.util.Properties properties31 = hikariConfig19.dataSourceProperties;
        hikariConfig6.setDataSourceProperties(properties31);
        hikariConfig0.setDataSourceProperties(properties31);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer34 = hikariConfig0.connectionCustomizer;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-1485" + "'", str17, "HikariPool-1485");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(properties31);
        org.junit.Assert.assertNull(iConnectionCustomizer34);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "";
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setConnectionTestQuery("HikariPool-1040");
        int int13 = hikariConfig1.acquireRetries;
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        int int8 = hikariConfig1.maxPoolSize;
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        int int10 = hikariConfig1.acquireRetries;
        hikariConfig1.idleTimeout = (short) 100;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        javax.sql.DataSource dataSource4 = hikariConfig0.dataSource;
        java.lang.String str5 = hikariConfig0.connectionInitSql;
        int int6 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer7;
        boolean boolean9 = hikariConfig0.isInitializationFailFast();
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.isInitializationFailFast = true;
        java.lang.String str13 = hikariConfig0.dataSourceClassName;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-27338" + "'", str1, "HikariPool-27338");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.leakDetectionThreshold = 0L;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig6.transactionIsolationName;
        long long11 = hikariConfig6.getIdleTimeout();
        java.lang.String str12 = hikariConfig6.getCatalog();
        java.lang.String str13 = hikariConfig6.getConnectionTestQuery();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        java.util.Properties properties18 = hikariConfig15.dataSourceProperties;
        hikariConfig6.setDataSourceProperties(properties18);
        hikariConfig1.dataSourceProperties = properties18;
        java.lang.String str21 = hikariConfig1.poolName;
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str24 = hikariConfig1.getConnectionTestQuery();
        int int25 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-27341" + "'", str21, "HikariPool-27341");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.isInitializationFailFast = true;
        int int16 = hikariConfig10.acquireRetries;
        hikariConfig10.setMaxLifetime((long) (-1));
        int int19 = hikariConfig10.getTransactionIsolation();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        int int22 = hikariConfig21.getTransactionIsolation();
        hikariConfig21.setRegisterMbeans(false);
        java.lang.String str25 = hikariConfig21.transactionIsolationName;
        int int26 = hikariConfig21.getMaximumPoolSize();
        int int27 = hikariConfig21.transactionIsolation;
        java.util.Properties properties28 = hikariConfig21.dataSourceProperties;
        hikariConfig10.setDataSourceProperties(properties28);
        hikariConfig1.dataSourceProperties = properties28;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
        java.lang.String str32 = hikariConfig31.connectionInitSql;
        hikariConfig31.setIdleTimeout((long) (byte) -1);
        hikariConfig31.catalog = "HikariPool-59";
        hikariConfig31.setCatalog("HikariPool-222");
        hikariConfig31.setMinimumPoolSize(87);
        long long41 = hikariConfig31.getIdleTimeout();
        hikariConfig31.setDataSourceClassName("HikariPool-975");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.maxPoolSize = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        long long8 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        boolean boolean10 = hikariConfig1.isAutoCommit;
        hikariConfig1.setInitializationFailFast(true);
        int int13 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        javax.sql.DataSource dataSource3 = hikariConfig1.dataSource;
        boolean boolean4 = hikariConfig1.isAutoCommit();
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.maxPoolSize;
        int int2 = hikariConfig0.transactionIsolation;
        hikariConfig0.connectionInitSql = "HikariPool-893";
        java.lang.String str5 = hikariConfig0.dataSourceClassName;
        hikariConfig0.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60 + "'", int1 == 60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.minPoolSize = (byte) -1;
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        hikariConfig1.connectionInitSql = "HikariPool-413";
        hikariConfig1.maxPoolSize = 35;
        hikariConfig1.maxLifetime = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionTestQuery = "HikariPool-173";
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setDataSourceClassName("HikariPool-2845");
        hikariConfig1.connectionTestQuery = "HikariPool-8267";
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        hikariConfig16.setTransactionIsolation("hi!");
        long long22 = hikariConfig16.connectionTimeout;
        java.lang.String str23 = hikariConfig16.getPoolName();
        boolean boolean24 = hikariConfig16.isRegisterMbeans;
        boolean boolean25 = hikariConfig16.isRegisterMbeans;
        java.lang.String str26 = hikariConfig16.dataSourceClassName;
        hikariConfig1.addDataSourceProperty("HikariPool-410", (java.lang.Object) hikariConfig16);
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        hikariConfig1.setMinimumPoolSize((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionTestQuery("HikariPool-68");
        hikariConfig1.transactionIsolation = 35;
        hikariConfig1.setDataSourceClassName("HikariPool-4996");
        java.lang.String str15 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setTransactionIsolation("hi!");
        int int16 = hikariConfig11.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig11);
        int int18 = hikariConfig1.minPoolSize;
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource22 = hikariConfig1.dataSource;
        hikariConfig1.setCatalog("HikariPool-3868");
        long long25 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNull(dataSource22);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig6.transactionIsolationName;
        long long11 = hikariConfig6.getIdleTimeout();
        java.lang.String str12 = hikariConfig6.getCatalog();
        java.lang.String str13 = hikariConfig6.getConnectionTestQuery();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        java.util.Properties properties18 = hikariConfig15.dataSourceProperties;
        hikariConfig6.setDataSourceProperties(properties18);
        hikariConfig1.dataSourceProperties = properties18;
        hikariConfig1.setMaxLifetime(87L);
        hikariConfig1.setMaxLifetime(1800000L);
        hikariConfig1.maxPoolSize = '4';
        hikariConfig1.transactionIsolationName = "HikariPool-690";
        java.lang.String str29 = hikariConfig1.catalog;
        hikariConfig1.catalog = "HikariPool-249";
        hikariConfig1.transactionIsolation = 100;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-5005");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        int int13 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-292";
        int int16 = hikariConfig1.acquireRetries;
        java.lang.String str17 = hikariConfig1.getCatalog();
        hikariConfig1.connectionTestQuery = "HikariPool-167";
        hikariConfig1.setCatalog("HikariPool-126");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer22;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaxLifetime((long) '#');
        hikariConfig1.minPoolSize = '4';
        boolean boolean16 = hikariConfig1.isRegisterMbeans();
        int int17 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        int int22 = hikariConfig21.getTransactionIsolation();
        hikariConfig21.setRegisterMbeans(false);
        java.lang.String str25 = hikariConfig21.connectionTestQuery;
        hikariConfig21.isJdbc4connectionTest = true;
        hikariConfig1.addDataSourceProperty("HikariPool-9126", (java.lang.Object) hikariConfig21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNull(dataSource18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setIdleTimeout(1L);
        java.lang.String str14 = hikariConfig1.catalog;
        int int15 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionCustomizerClassName("");
        int int7 = hikariConfig1.getMinimumPoolSize();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        int int7 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionTestQuery("HikariPool-789");
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.leakDetectionThreshold = 100;
        hikariConfig12.setRegisterMbeans(false);
        hikariConfig12.isRegisterMbeans = false;
        hikariConfig12.setConnectionInitSql("HikariPool-780");
        java.lang.String str21 = hikariConfig12.getPoolName();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.leakDetectionThreshold = 100;
        boolean boolean26 = hikariConfig23.isJdbc4connectionTest;
        long long27 = hikariConfig23.getIdleTimeout();
        hikariConfig23.setUseInstrumentation(false);
        hikariConfig23.setJdbc4ConnectionTest(false);
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig12.setDataSourceProperties(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        int int36 = hikariConfig1.transactionIsolation;
        boolean boolean37 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setTransactionIsolation("HikariPool-17625");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-27393" + "'", str21, "HikariPool-27393");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 60L + "'", long27 == 60L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) 3);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setRegisterMbeans(false);
        long long16 = hikariConfig1.idleTimeout;
        int int17 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionTestQuery("HikariPool-10805");
        hikariConfig1.connectionTimeout = 87;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        java.lang.String str7 = hikariConfig1.getPoolName();
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        int int11 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-27404" + "'", str7, "HikariPool-27404");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        long long12 = hikariConfig1.connectionTimeout;
        int int13 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-320");
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        hikariConfig1.isInitializationFailFast = false;
        long long16 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.setRegisterMbeans(false);
        java.lang.String str23 = hikariConfig19.transactionIsolationName;
        int int24 = hikariConfig19.getMaximumPoolSize();
        int int25 = hikariConfig19.transactionIsolation;
        java.util.Properties properties26 = hikariConfig19.dataSourceProperties;
        boolean boolean27 = hikariConfig19.isAutoCommit();
        long long28 = hikariConfig19.leakDetectionThreshold;
        java.lang.String str29 = hikariConfig19.connectionTestQuery;
        hikariConfig19.isRegisterMbeans = true;
        hikariConfig1.addDataSourceProperty("HikariPool-645", (java.lang.Object) true);
        long long33 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNull(str29);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-292";
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setDataSourceClassName("HikariPool-2458");
        hikariConfig1.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.setDataSourceClassName("HikariPool-1060");
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        int int15 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-27409" + "'", str11, "HikariPool-27409");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.maxLifetime;
        hikariConfig1.setMinimumPoolSize((int) ' ');
        int int13 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        int int9 = hikariConfig1.minPoolSize;
        hikariConfig1.setConnectionTestQuery("HikariPool-826");
        hikariConfig1.dataSourceClassName = "HikariPool-238";
        int int14 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        java.lang.String str6 = hikariConfig1.getPoolName();
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        hikariConfig1.setConnectionInitSql("HikariPool-1485");
        hikariConfig1.setInitializationFailFast(false);
        long long13 = hikariConfig1.maxLifetime;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-27413" + "'", str6, "HikariPool-27413");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) "HikariPool-6");
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.setMinimumPoolSize((int) (byte) 1);
        java.lang.String str18 = hikariConfig11.poolName;
        int int19 = hikariConfig11.acquireRetries;
        hikariConfig11.isAutoCommit = true;
        java.util.Properties properties22 = hikariConfig11.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties22);
        boolean boolean24 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str25 = hikariConfig1.connectionTestQuery;
        java.lang.String str26 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-27415" + "'", str18, "HikariPool-27415");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        hikariConfig1.maxPoolSize = 1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.catalog;
        java.lang.String str14 = hikariConfig1.poolName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-27417" + "'", str14, "HikariPool-27417");
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        long long11 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.connectionCustomizerClassName = "";
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        hikariConfig1.poolName = "HikariPool-104";
        hikariConfig1.setUseInstrumentation(false);
        javax.sql.DataSource dataSource28 = null;
        hikariConfig1.dataSource = dataSource28;
        int int30 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-3887");
        hikariConfig1.setRegisterMbeans(true);
        long long35 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str36 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        hikariConfig1.maxLifetime = (-1);
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.isAutoCommit = false;
        long long13 = hikariConfig1.maxLifetime;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaximumPoolSize((int) '4');
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        int int20 = hikariConfig1.minPoolSize;
        long long21 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.poolName = "HikariPool-410";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        long long11 = hikariConfig1.getConnectionTimeout();
        java.lang.String str12 = hikariConfig1.connectionCustomizerClassName;
        long long13 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setConnectionInitSql("HikariPool-1280");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) (-1));
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        boolean boolean8 = hikariConfig1.isInitializationFailFast;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.dataSourceClassName = "";
        long long15 = hikariConfig12.getAcquireRetryDelay();
        hikariConfig1.addDataSourceProperty("HikariPool-531", (java.lang.Object) long15);
        hikariConfig1.isInitializationFailFast = true;
        long long19 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        int int22 = hikariConfig21.getTransactionIsolation();
        hikariConfig21.setRegisterMbeans(false);
        hikariConfig21.setUseInstrumentation(true);
        hikariConfig21.setConnectionInitSql("");
        hikariConfig21.setConnectionCustomizerClassName("hi!");
        boolean boolean31 = hikariConfig21.isInitializationFailFast;
        hikariConfig21.maxPoolSize = ' ';
        int int34 = hikariConfig21.maxPoolSize;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig35.setDataSourceClassName("");
        hikariConfig35.validate();
        long long39 = hikariConfig35.getLeakDetectionThreshold();
        hikariConfig35.setIdleTimeout((long) '4');
        java.lang.String str42 = hikariConfig35.connectionCustomizerClassName;
        java.util.Properties properties43 = hikariConfig35.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig21.setDataSourceProperties(properties43);
        hikariConfig1.dataSourceProperties = properties43;
        hikariConfig1.setMaxLifetime(0L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.maxLifetime;
        java.lang.String str10 = hikariConfig1.dataSourceClassName;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setIdleTimeout((long) (short) 0);
        hikariConfig1.connectionTimeout = (byte) 100;
        hikariConfig1.setMinimumPoolSize((int) (byte) 10);
        long long19 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.leakDetectionThreshold = (byte) 1;
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        hikariConfig1.setTransactionIsolation("HikariPool-893");
        hikariConfig1.minPoolSize = (byte) 10;
        hikariConfig1.transactionIsolation = (short) 10;
        long long18 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setRegisterMbeans(false);
        int int21 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        java.lang.String str9 = hikariConfig1.connectionTestQuery;
        boolean boolean10 = hikariConfig1.isAutoCommit();
        int int11 = hikariConfig1.acquireRetries;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        hikariConfig1.connectionTestQuery = "HikariPool-330";
        hikariConfig1.setPoolName("HikariPool-3106");
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        hikariConfig1.setConnectionInitSql("HikariPool-273");
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        java.lang.String str28 = hikariConfig24.transactionIsolationName;
        long long29 = hikariConfig24.getIdleTimeout();
        java.lang.String str30 = hikariConfig24.getCatalog();
        java.lang.String str31 = hikariConfig24.getConnectionTestQuery();
        hikariConfig24.maxPoolSize = (byte) 0;
        java.lang.String str34 = hikariConfig24.dataSourceClassName;
        java.lang.String str35 = hikariConfig24.catalog;
        java.lang.String str36 = hikariConfig24.connectionCustomizerClassName;
        boolean boolean37 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.isRegisterMbeans = true;
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 60L + "'", long29 == 60L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str12 = hikariConfig1.getCatalog();
        long long13 = hikariConfig1.getMaxLifetime();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isAutoCommit;
        hikariConfig17.poolName = "hi!";
        java.lang.String str21 = hikariConfig17.dataSourceClassName;
        java.lang.String str22 = hikariConfig17.dataSourceClassName;
        hikariConfig17.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig17.connectionCustomizer;
        hikariConfig17.setMaxLifetime((long) (short) 0);
        hikariConfig17.setAcquireRetries(100);
        long long30 = hikariConfig17.getIdleTimeout();
        java.lang.String str31 = hikariConfig17.dataSourceClassName;
        long long32 = hikariConfig17.getMaxLifetime();
        long long33 = hikariConfig17.getLeakDetectionThreshold();
        long long34 = hikariConfig17.idleTimeout;
        long long35 = hikariConfig17.connectionTimeout;
        java.util.Properties properties36 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig1.dataSourceProperties = properties36;
        java.lang.Class<?> wildcardClass39 = properties36.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(iConnectionCustomizer25);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60L + "'", long30 == 60L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 60L + "'", long34 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        long long12 = hikariConfig1.getConnectionTimeout();
        int int13 = hikariConfig1.minPoolSize;
        java.lang.String str14 = hikariConfig1.poolName;
        boolean boolean15 = hikariConfig1.isAutoCommit();
        java.lang.String str16 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-27455" + "'", str14, "HikariPool-27455");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-320");
        long long13 = hikariConfig1.getMaxLifetime();
        int int14 = hikariConfig1.maxPoolSize;
        hikariConfig1.minPoolSize = (-1);
        long long17 = hikariConfig1.getMaxLifetime();
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setCatalog("HikariPool-87");
        hikariConfig1.acquireRetries = (short) 1;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        int int30 = hikariConfig29.getTransactionIsolation();
        hikariConfig29.setRegisterMbeans(false);
        java.lang.String str33 = hikariConfig29.transactionIsolationName;
        java.lang.String str34 = hikariConfig29.connectionCustomizerClassName;
        hikariConfig29.setConnectionTestQuery("hi!");
        java.lang.String str37 = hikariConfig29.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer38 = hikariConfig29.connectionCustomizer;
        hikariConfig25.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig29);
        java.lang.String str40 = hikariConfig25.getConnectionTestQuery();
        javax.sql.DataSource dataSource41 = null;
        hikariConfig25.dataSource = dataSource41;
        hikariConfig1.addDataSourceProperty("HikariPool-1839", (java.lang.Object) hikariConfig25);
        hikariConfig25.isRegisterMbeans = false;
        long long46 = hikariConfig25.getLeakDetectionThreshold();
        int int47 = hikariConfig25.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(iConnectionCustomizer38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setRegisterMbeans(false);
        hikariConfig5.dataSourceClassName = "";
        hikariConfig5.setTransactionIsolation("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig14.isInitializationFailFast = true;
        int int20 = hikariConfig14.acquireRetries;
        hikariConfig14.setMaxLifetime((long) (-1));
        int int23 = hikariConfig14.getTransactionIsolation();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        int int30 = hikariConfig25.getMaximumPoolSize();
        int int31 = hikariConfig25.transactionIsolation;
        java.util.Properties properties32 = hikariConfig25.dataSourceProperties;
        hikariConfig14.setDataSourceProperties(properties32);
        hikariConfig5.dataSourceProperties = properties32;
        hikariConfig1.dataSourceProperties = properties32;
        hikariConfig1.minPoolSize = ' ';
        java.lang.String str38 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.connectionInitSql = "HikariPool-817";
        java.lang.String str41 = hikariConfig1.connectionInitSql;
        int int42 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "HikariPool-817" + "'", str41, "HikariPool-817");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.maxLifetime = 1800000L;
        hikariConfig1.dataSourceClassName = "HikariPool-489";
        int int13 = hikariConfig1.transactionIsolation;
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isAutoCommit = true;
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setConnectionInitSql("HikariPool-43");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        java.lang.String str14 = hikariConfig10.transactionIsolationName;
        long long15 = hikariConfig10.getIdleTimeout();
        boolean boolean16 = hikariConfig10.isInitializationFailFast;
        java.util.Properties properties17 = hikariConfig10.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties17);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig1.connectionCustomizer;
        java.lang.String str20 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str21 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-43" + "'", str21, "HikariPool-43");
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        int int8 = hikariConfig0.acquireRetries;
        hikariConfig0.setTransactionIsolation("HikariPool-21");
        long long11 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.setDataSourceClassName("HikariPool-133");
        hikariConfig1.dataSourceClassName = "HikariPool-336";
        java.lang.String str9 = hikariConfig1.catalog;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-3470";
        hikariConfig1.minPoolSize = '4';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.isRegisterMbeans = true;
        java.lang.String str5 = hikariConfig0.getPoolName();
        int int6 = hikariConfig0.getAcquireRetries();
        boolean boolean7 = hikariConfig0.isJdbc4connectionTest;
        java.lang.String str8 = hikariConfig0.catalog;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HikariPool-27489" + "'", str5, "HikariPool-27489");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        hikariConfig1.setInitializationFailFast(true);
        long long11 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setCatalog("HikariPool-472");
        int int12 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        hikariConfig1.minPoolSize = 97;
        java.lang.String str16 = hikariConfig1.dataSourceClassName;
        int int17 = hikariConfig1.getMinimumPoolSize();
        int int18 = hikariConfig1.getMaximumPoolSize();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        hikariConfig20.setUseInstrumentation(true);
        hikariConfig20.setConnectionInitSql("");
        hikariConfig20.setConnectionCustomizerClassName("hi!");
        hikariConfig20.acquireRetries = (short) -1;
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        int int34 = hikariConfig33.getTransactionIsolation();
        hikariConfig33.setRegisterMbeans(false);
        java.lang.String str37 = hikariConfig33.transactionIsolationName;
        int int38 = hikariConfig33.transactionIsolation;
        java.lang.String str39 = hikariConfig33.getConnectionInitSql();
        int int40 = hikariConfig33.getMaximumPoolSize();
        hikariConfig33.setJdbc4ConnectionTest(false);
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        long long50 = hikariConfig45.getIdleTimeout();
        java.lang.String str51 = hikariConfig45.getCatalog();
        java.util.Properties properties52 = hikariConfig45.getDataSourceProperties();
        hikariConfig45.setUseInstrumentation(false);
        hikariConfig33.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig45);
        hikariConfig33.poolName = "HikariPool-104";
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.leakDetectionThreshold = 100;
        boolean boolean62 = hikariConfig59.isJdbc4ConnectionTest();
        java.util.Properties properties63 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties63);
        int int65 = hikariConfig64.getTransactionIsolation();
        hikariConfig64.setRegisterMbeans(false);
        java.lang.String str68 = hikariConfig64.transactionIsolationName;
        long long69 = hikariConfig64.getIdleTimeout();
        java.lang.String str70 = hikariConfig64.getCatalog();
        java.lang.String str71 = hikariConfig64.getConnectionTestQuery();
        java.util.Properties properties72 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig73 = new com.zaxxer.hikari.HikariConfig(properties72);
        hikariConfig73.dataSourceClassName = "";
        java.util.Properties properties76 = hikariConfig73.dataSourceProperties;
        hikariConfig64.setDataSourceProperties(properties76);
        hikariConfig59.dataSourceProperties = properties76;
        java.util.Properties properties79 = hikariConfig59.dataSourceProperties;
        hikariConfig33.dataSourceProperties = properties79;
        hikariConfig20.dataSourceProperties = properties79;
        hikariConfig1.setDataSourceProperties(properties79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 60L + "'", long50 == 60L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties52);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(str68);
// flaky:         org.junit.Assert.assertTrue("'" + long69 + "' != '" + 60L + "'", long69 == 60L);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNotNull(properties79);
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setJdbc4ConnectionTest(true);
        int int7 = hikariConfig1.getAcquireRetries();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        int int9 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetries(1);
        java.lang.String str13 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        hikariConfig1.catalog = "HikariPool-1372";
        hikariConfig1.setCatalog("HikariPool-249");
        java.util.Properties properties20 = hikariConfig1.dataSourceProperties;
        long long21 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionInitSql = "HikariPool-900";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60L + "'", long21 == 60L);
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setCatalog("HikariPool-204");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolationName = "HikariPool-306";
        hikariConfig1.connectionTimeout = 97;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig14.transactionIsolationName;
        int int19 = hikariConfig14.transactionIsolation;
        java.lang.String str20 = hikariConfig14.getConnectionInitSql();
        hikariConfig14.setMaxLifetime((long) (short) 1);
        java.lang.String str23 = hikariConfig14.getConnectionCustomizerClassName();
        hikariConfig14.setAcquireRetries(1);
        boolean boolean26 = hikariConfig14.isAutoCommit;
        int int27 = hikariConfig14.acquireRetries;
        boolean boolean28 = hikariConfig14.isRegisterMbeans;
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig30.setConnectionInitSql("hi!");
        boolean boolean33 = hikariConfig30.isInitializationFailFast;
        hikariConfig30.addDataSourceProperty("HikariPool-222", (java.lang.Object) "HikariPool-6");
        hikariConfig30.setMaxLifetime(10L);
        long long39 = hikariConfig30.connectionTimeout;
        long long40 = hikariConfig30.getAcquireRetryDelay();
        java.util.Properties properties41 = hikariConfig30.dataSourceProperties;
        java.util.Properties properties42 = hikariConfig30.getDataSourceProperties();
        hikariConfig14.dataSourceProperties = properties42;
        hikariConfig1.setDataSourceProperties(properties42);
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties42);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.beans.IntrospectionException: Method not found: setHikariPool-222");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("hi!");
        long long14 = hikariConfig11.getLeakDetectionThreshold();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.getMaximumPoolSize();
        int int22 = hikariConfig16.transactionIsolation;
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties23;
        java.util.Properties properties25 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-489", (java.lang.Object) hikariConfig11);
        hikariConfig11.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = hikariConfig11.connectionCustomizer;
        long long30 = hikariConfig11.getMaxLifetime();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int33 = hikariConfig32.getTransactionIsolation();
        hikariConfig32.setRegisterMbeans(false);
        java.lang.String str36 = hikariConfig32.connectionTestQuery;
        long long37 = hikariConfig32.getIdleTimeout();
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        int int40 = hikariConfig39.getTransactionIsolation();
        hikariConfig39.setRegisterMbeans(false);
        java.lang.String str43 = hikariConfig39.transactionIsolationName;
        java.lang.String str44 = hikariConfig39.connectionCustomizerClassName;
        hikariConfig39.setConnectionTestQuery("hi!");
        java.lang.String str47 = hikariConfig39.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer48 = hikariConfig39.connectionCustomizer;
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig50.setConnectionInitSql("hi!");
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        int int55 = hikariConfig54.getTransactionIsolation();
        hikariConfig54.setRegisterMbeans(false);
        hikariConfig54.dataSourceClassName = "";
        hikariConfig54.setTransactionIsolation("");
        java.util.Properties properties62 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        int int64 = hikariConfig63.getTransactionIsolation();
        hikariConfig63.setRegisterMbeans(false);
        hikariConfig63.isInitializationFailFast = true;
        int int69 = hikariConfig63.acquireRetries;
        hikariConfig63.setMaxLifetime((long) (-1));
        int int72 = hikariConfig63.getTransactionIsolation();
        java.util.Properties properties73 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties73);
        int int75 = hikariConfig74.getTransactionIsolation();
        hikariConfig74.setRegisterMbeans(false);
        java.lang.String str78 = hikariConfig74.transactionIsolationName;
        int int79 = hikariConfig74.getMaximumPoolSize();
        int int80 = hikariConfig74.transactionIsolation;
        java.util.Properties properties81 = hikariConfig74.dataSourceProperties;
        hikariConfig63.setDataSourceProperties(properties81);
        hikariConfig54.dataSourceProperties = properties81;
        hikariConfig50.dataSourceProperties = properties81;
        hikariConfig39.setDataSourceProperties(properties81);
        hikariConfig32.dataSourceProperties = properties81;
        hikariConfig11.setDataSourceProperties(properties81);
        hikariConfig11.acquireRetries = 'a';
        int int90 = hikariConfig11.transactionIsolation;
        java.lang.Class<?> wildcardClass91 = hikariConfig11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(iConnectionCustomizer29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60L + "'", long37 == 60L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(iConnectionCustomizer48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 3 + "'", int69 == 3);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 60 + "'", int79 == 60);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + (-1) + "'", int80 == (-1));
        org.junit.Assert.assertNotNull(properties81);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) 3);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        int int14 = hikariConfig1.acquireRetries;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        java.lang.String str20 = hikariConfig16.dataSourceClassName;
        java.lang.String str21 = hikariConfig16.dataSourceClassName;
        hikariConfig16.setJdbc4ConnectionTest(false);
        int int24 = hikariConfig16.maxPoolSize;
        hikariConfig16.idleTimeout = (byte) -1;
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        int int29 = hikariConfig28.getTransactionIsolation();
        hikariConfig28.setRegisterMbeans(false);
        hikariConfig28.dataSourceClassName = "";
        hikariConfig28.setTransactionIsolation("");
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        hikariConfig37.isInitializationFailFast = true;
        int int43 = hikariConfig37.acquireRetries;
        hikariConfig37.setMaxLifetime((long) (-1));
        int int46 = hikariConfig37.getTransactionIsolation();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        int int49 = hikariConfig48.getTransactionIsolation();
        hikariConfig48.setRegisterMbeans(false);
        java.lang.String str52 = hikariConfig48.transactionIsolationName;
        int int53 = hikariConfig48.getMaximumPoolSize();
        int int54 = hikariConfig48.transactionIsolation;
        java.util.Properties properties55 = hikariConfig48.dataSourceProperties;
        hikariConfig37.setDataSourceProperties(properties55);
        hikariConfig28.dataSourceProperties = properties55;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig16.dataSourceProperties = properties55;
        hikariConfig1.setDataSourceProperties(properties55);
        boolean boolean61 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.poolName = "HikariPool-410";
        hikariConfig1.dataSourceClassName = "HikariPool-26";
        hikariConfig1.setAutoCommit(false);
        boolean boolean68 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.validate();
        java.lang.String str70 = hikariConfig1.getDataSourceClassName();
        java.lang.String str71 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60 + "'", int53 == 60);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "HikariPool-26" + "'", str70, "HikariPool-26");
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        hikariConfig1.isRegisterMbeans = false;
        int int17 = hikariConfig1.acquireRetries;
        hikariConfig1.transactionIsolationName = "HikariPool-24686";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.maxLifetime;
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        int int13 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setConnectionTestQuery("hi!");
        hikariConfig1.transactionIsolation = (byte) 1;
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        long long12 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAutoCommit(true);
        java.lang.String str15 = hikariConfig1.poolName;
        hikariConfig1.idleTimeout = 97L;
        long long18 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-27526" + "'", str15, "HikariPool-27526");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.maxLifetime = (-1);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig14.transactionIsolationName;
        int int19 = hikariConfig14.transactionIsolation;
        java.lang.String str20 = hikariConfig14.getConnectionInitSql();
        int int21 = hikariConfig14.getMaximumPoolSize();
        hikariConfig14.setJdbc4ConnectionTest(false);
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        java.lang.String str30 = hikariConfig26.transactionIsolationName;
        long long31 = hikariConfig26.getIdleTimeout();
        java.lang.String str32 = hikariConfig26.getCatalog();
        java.util.Properties properties33 = hikariConfig26.getDataSourceProperties();
        hikariConfig26.setUseInstrumentation(false);
        hikariConfig14.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig26);
        hikariConfig14.poolName = "HikariPool-104";
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig40.leakDetectionThreshold = 100;
        boolean boolean43 = hikariConfig40.isJdbc4ConnectionTest();
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        long long50 = hikariConfig45.getIdleTimeout();
        java.lang.String str51 = hikariConfig45.getCatalog();
        java.lang.String str52 = hikariConfig45.getConnectionTestQuery();
        java.util.Properties properties53 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties53);
        hikariConfig54.dataSourceClassName = "";
        java.util.Properties properties57 = hikariConfig54.dataSourceProperties;
        hikariConfig45.setDataSourceProperties(properties57);
        hikariConfig40.dataSourceProperties = properties57;
        java.util.Properties properties60 = hikariConfig40.dataSourceProperties;
        hikariConfig14.dataSourceProperties = properties60;
        hikariConfig1.dataSourceProperties = properties60;
        long long63 = hikariConfig1.getIdleTimeout();
        long long64 = hikariConfig1.idleTimeout;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str30);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 60L + "'", long31 == 60L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 60L + "'", long50 == 60L);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNotNull(properties60);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 10L + "'", long63 == 10L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 10L + "'", long64 == 10L);
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        java.lang.String str9 = hikariConfig1.connectionTestQuery;
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.poolName = "HikariPool-59";
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties14 = null;
        hikariConfig1.dataSourceProperties = properties14;
        java.lang.String str16 = hikariConfig1.getCatalog();
        hikariConfig1.connectionTimeout = 3L;
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.leakDetectionThreshold = 100;
        hikariConfig8.minPoolSize = (byte) 1;
        hikariConfig8.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig8.connectionCustomizer;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.dataSourceClassName = "";
        hikariConfig17.setTransactionIsolation("");
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        hikariConfig26.isInitializationFailFast = true;
        int int32 = hikariConfig26.acquireRetries;
        hikariConfig26.setMaxLifetime((long) (-1));
        int int35 = hikariConfig26.getTransactionIsolation();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        java.lang.String str41 = hikariConfig37.transactionIsolationName;
        int int42 = hikariConfig37.getMaximumPoolSize();
        int int43 = hikariConfig37.transactionIsolation;
        java.util.Properties properties44 = hikariConfig37.dataSourceProperties;
        hikariConfig26.setDataSourceProperties(properties44);
        hikariConfig17.dataSourceProperties = properties44;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig8.dataSourceProperties = properties44;
        boolean boolean49 = hikariConfig8.isInitializationFailFast();
        boolean boolean50 = hikariConfig8.isInitializationFailFast;
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig52.setConnectionInitSql("hi!");
        long long55 = hikariConfig52.getLeakDetectionThreshold();
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        int int58 = hikariConfig57.getTransactionIsolation();
        hikariConfig57.setRegisterMbeans(false);
        java.lang.String str61 = hikariConfig57.transactionIsolationName;
        int int62 = hikariConfig57.getMaximumPoolSize();
        int int63 = hikariConfig57.transactionIsolation;
        java.util.Properties properties64 = hikariConfig57.dataSourceProperties;
        hikariConfig52.dataSourceProperties = properties64;
        java.util.Properties properties66 = hikariConfig52.getDataSourceProperties();
        hikariConfig8.dataSourceProperties = properties66;
        hikariConfig1.dataSourceProperties = properties66;
        int int69 = hikariConfig1.getTransactionIsolation();
        java.lang.String str70 = hikariConfig1.getPoolName();
        hikariConfig1.setTransactionIsolation("HikariPool-756");
        hikariConfig1.maxLifetime = 1;
        java.lang.String str75 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 60 + "'", int62 == 60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str70 + "' != '" + "HikariPool-27546" + "'", str70, "HikariPool-27546");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "HikariPool-756" + "'", str75, "HikariPool-756");
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-204");
        hikariConfig1.isAutoCommit = true;
        java.lang.String str13 = hikariConfig1.catalog;
        boolean boolean14 = hikariConfig1.isAutoCommit;
        hikariConfig1.setPoolName("HikariPool-238");
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str18 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-204" + "'", str17, "HikariPool-204");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.minPoolSize = (short) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.connectionTimeout = (short) 10;
        hikariConfig1.setAutoCommit(true);
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.leakDetectionThreshold = (short) 0;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.transactionIsolation;
        java.lang.String str22 = hikariConfig16.getConnectionInitSql();
        hikariConfig16.setMaxLifetime((long) (short) 1);
        int int25 = hikariConfig16.getMinimumPoolSize();
        hikariConfig16.idleTimeout = (-1);
        hikariConfig16.setRegisterMbeans(false);
        int int30 = hikariConfig16.getAcquireIncrement();
        hikariConfig16.isAutoCommit = true;
        hikariConfig1.addDataSourceProperty("HikariPool-218", (java.lang.Object) true);
        int int34 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries(87);
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.catalog = "HikariPool-403";
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        long long13 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.validate();
        hikariConfig1.maxLifetime = '4';
        hikariConfig1.setAcquireRetries((int) (short) 1);
        long long12 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setCatalog("HikariPool-6");
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1100";
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.dataSource = dataSource9;
        hikariConfig1.catalog = "HikariPool-306";
        hikariConfig1.idleTimeout = (byte) 10;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        boolean boolean17 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setCatalog("HikariPool-385");
        hikariConfig1.acquireRetries = (byte) 1;
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setPoolName("HikariPool-6");
        long long13 = hikariConfig1.idleTimeout;
        java.lang.String str14 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.minPoolSize = (byte) -1;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        long long21 = hikariConfig16.getIdleTimeout();
        java.lang.String str22 = hikariConfig16.getCatalog();
        java.lang.String str23 = hikariConfig16.getConnectionTestQuery();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.dataSourceClassName = "";
        java.util.Properties properties28 = hikariConfig25.dataSourceProperties;
        hikariConfig16.setDataSourceProperties(properties28);
        hikariConfig1.setDataSourceProperties(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig31.setMaxLifetime((long) ' ');
        int int34 = hikariConfig31.getMaximumPoolSize();
        hikariConfig31.minPoolSize = (byte) 0;
        hikariConfig31.setConnectionInitSql("HikariPool-1102");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer39 = hikariConfig31.connectionCustomizer;
        int int40 = hikariConfig31.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60L + "'", long21 == 60L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.maxPoolSize = (short) 100;
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setPoolName("HikariPool-531");
        int int7 = hikariConfig0.acquireRetries;
        hikariConfig0.catalog = "HikariPool-8479";
        int int10 = hikariConfig0.maxPoolSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-27266");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-27266 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.catalog = "HikariPool-21";
        hikariConfig1.setTransactionIsolation("HikariPool-770");
        long long14 = hikariConfig1.maxLifetime;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        long long17 = hikariConfig1.leakDetectionThreshold;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(97);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        hikariConfig0.setMaximumPoolSize(87);
        hikariConfig0.isAutoCommit = true;
        int int10 = hikariConfig0.transactionIsolation;
        boolean boolean11 = hikariConfig0.isInitializationFailFast;
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-27574" + "'", str1, "HikariPool-27574");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setPoolName("HikariPool-249");
        long long9 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-21");
        long long12 = hikariConfig1.idleTimeout;
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str14 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 60L + "'", long12 == 60L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        java.util.Properties properties3 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.transactionIsolationName = "HikariPool-248";
        hikariConfig0.setConnectionInitSql("HikariPool-362");
        java.lang.String str8 = hikariConfig0.catalog;
        int int9 = hikariConfig0.getMaximumPoolSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(properties3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setIdleTimeout(100L);
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("hi!");
        long long14 = hikariConfig11.getLeakDetectionThreshold();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.getMaximumPoolSize();
        int int22 = hikariConfig16.transactionIsolation;
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties23;
        java.util.Properties properties25 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-489", (java.lang.Object) hikariConfig11);
        hikariConfig11.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = hikariConfig11.connectionCustomizer;
        long long30 = hikariConfig11.getMaxLifetime();
        hikariConfig11.setDataSourceClassName("HikariPool-105");
        int int33 = hikariConfig11.maxPoolSize;
        long long34 = hikariConfig11.connectionTimeout;
        boolean boolean35 = hikariConfig11.isAutoCommit();
        int int36 = hikariConfig11.getTransactionIsolation();
        java.util.Properties properties37 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties37);
        boolean boolean39 = hikariConfig38.isAutoCommit;
        hikariConfig38.poolName = "hi!";
        java.lang.String str42 = hikariConfig38.dataSourceClassName;
        hikariConfig38.acquireRetries = (short) 10;
        int int45 = hikariConfig38.getAcquireIncrement();
        java.lang.String str46 = hikariConfig38.getPoolName();
        java.util.Properties properties47 = hikariConfig38.dataSourceProperties;
        java.lang.String str48 = hikariConfig38.getConnectionTestQuery();
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig50.leakDetectionThreshold = 100;
        hikariConfig50.connectionInitSql = "hi!";
        hikariConfig50.maxPoolSize = (short) -1;
        java.lang.String str57 = hikariConfig50.connectionCustomizerClassName;
        long long58 = hikariConfig50.getAcquireRetryDelay();
        int int59 = hikariConfig50.transactionIsolation;
        hikariConfig50.setLeakDetectionThreshold((long) 100);
        java.lang.String str62 = hikariConfig50.connectionCustomizerClassName;
        hikariConfig50.transactionIsolation = 60;
        java.util.Properties properties65 = hikariConfig50.getDataSourceProperties();
        hikariConfig38.setDataSourceProperties(properties65);
        hikariConfig11.setDataSourceProperties(properties65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(iConnectionCustomizer29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(properties65);
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.poolName = "HikariPool-59";
        hikariConfig1.setAutoCommit(false);
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.poolName = "HikariPool-275";
        long long18 = hikariConfig1.maxLifetime;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.minPoolSize = 100;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-752");
        hikariConfig1.connectionInitSql = "HikariPool-184";
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.isInitializationFailFast = true;
        int int24 = hikariConfig18.acquireRetries;
        hikariConfig18.setMaxLifetime((long) (-1));
        int int27 = hikariConfig18.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = null;
        hikariConfig18.connectionCustomizer = iConnectionCustomizer28;
        java.lang.String str30 = hikariConfig18.catalog;
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        hikariConfig32.dataSourceClassName = "";
        hikariConfig32.connectionTimeout = 10L;
        hikariConfig32.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        int int41 = hikariConfig40.getTransactionIsolation();
        hikariConfig40.setRegisterMbeans(false);
        hikariConfig40.isInitializationFailFast = true;
        int int46 = hikariConfig40.acquireRetries;
        hikariConfig40.setMaxLifetime((long) (-1));
        int int49 = hikariConfig40.getTransactionIsolation();
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        int int52 = hikariConfig51.getTransactionIsolation();
        hikariConfig51.setRegisterMbeans(false);
        java.lang.String str55 = hikariConfig51.transactionIsolationName;
        int int56 = hikariConfig51.getMaximumPoolSize();
        int int57 = hikariConfig51.transactionIsolation;
        java.util.Properties properties58 = hikariConfig51.dataSourceProperties;
        hikariConfig40.setDataSourceProperties(properties58);
        hikariConfig32.setDataSourceProperties(properties58);
        hikariConfig18.setDataSourceProperties(properties58);
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig1.setDataSourceProperties(properties58);
        hikariConfig1.setMinimumPoolSize(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 60 + "'", int56 == 60);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(properties58);
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setPoolName("HikariPool-249");
        long long9 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        hikariConfig1.maxPoolSize = (short) 10;
        hikariConfig1.setPoolName("HikariPool-3473");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-24077");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-24077 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        int int8 = hikariConfig1.maxPoolSize;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.connectionTestQuery = "HikariPool-220";
        hikariConfig1.dataSourceClassName = "HikariPool-308";
        hikariConfig1.connectionInitSql = "HikariPool-761";
        long long19 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-1107");
        java.lang.String str24 = hikariConfig1.getCatalog();
        long long25 = hikariConfig1.getAcquireRetryDelay();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid transaction isolation value: HikariPool-1107");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.connectionTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = false;
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        long long12 = hikariConfig1.maxLifetime;
        java.lang.String str13 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig6.transactionIsolationName;
        long long11 = hikariConfig6.getIdleTimeout();
        java.lang.String str12 = hikariConfig6.getCatalog();
        java.lang.String str13 = hikariConfig6.getConnectionTestQuery();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        java.util.Properties properties18 = hikariConfig15.dataSourceProperties;
        hikariConfig6.setDataSourceProperties(properties18);
        hikariConfig1.dataSourceProperties = properties18;
        hikariConfig1.setTransactionIsolation("HikariPool-166");
        java.lang.String str23 = hikariConfig1.getPoolName();
        long long24 = hikariConfig1.getMaxLifetime();
        int int25 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-27602" + "'", str23, "HikariPool-27602");
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 35L + "'", long24 == 35L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        int int11 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str12 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setTransactionIsolation("HikariPool-87");
        hikariConfig1.catalog = "HikariPool-370";
        long long17 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.connectionTestQuery = "HikariPool-1258";
        hikariConfig1.acquireRetries = (byte) 0;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.maxPoolSize = 87;
        hikariConfig1.maxLifetime = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        hikariConfig1.leakDetectionThreshold = 100;
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.maxLifetime = 35;
        int int14 = hikariConfig1.transactionIsolation;
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-27607" + "'", str8, "HikariPool-27607");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.idleTimeout = (byte) -1;
        javax.sql.DataSource dataSource12 = hikariConfig1.dataSource;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        int int15 = hikariConfig1.getAcquireRetries();
        java.lang.String str16 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.isAutoCommit = false;
        long long13 = hikariConfig1.maxLifetime;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setMaximumPoolSize((int) '4');
        int int17 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        hikariConfig1.maxLifetime = (short) 10;
        java.lang.String str14 = hikariConfig1.poolName;
        hikariConfig1.connectionInitSql = "HikariPool-241";
        hikariConfig1.acquireRetries = (byte) -1;
        java.lang.String str19 = hikariConfig1.dataSourceClassName;
        boolean boolean20 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.maxPoolSize = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-27615" + "'", str14, "HikariPool-27615");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.maxPoolSize = (byte) 0;
        hikariConfig1.isAutoCommit = true;
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-770";
        hikariConfig1.maxLifetime = (byte) 100;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-24846");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str12 = hikariConfig1.poolName;
        hikariConfig1.transactionIsolationName = "HikariPool-195";
        hikariConfig1.setMaxLifetime((long) (-1));
        java.lang.String str17 = hikariConfig1.catalog;
        hikariConfig1.setCatalog("HikariPool-7184");
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-27618" + "'", str12, "HikariPool-27618");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.transactionIsolationName = "HikariPool-241";
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        java.lang.String str7 = hikariConfig1.catalog;
        int int8 = hikariConfig1.acquireRetries;
        long long9 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.isAutoCommit = false;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        boolean boolean15 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        hikariConfig1.setConnectionInitSql("HikariPool-465");
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.acquireRetries = 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        int int9 = hikariConfig1.maxPoolSize;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        int int16 = hikariConfig11.transactionIsolation;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig11.dataSource = dataSource17;
        long long19 = hikariConfig11.maxLifetime;
        hikariConfig11.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties22 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties22;
        hikariConfig1.setPoolName("HikariPool-451");
        hikariConfig1.dataSourceClassName = "HikariPool-26200";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        int int7 = hikariConfig1.getAcquireRetries();
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.leakDetectionThreshold = (short) 10;
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        hikariConfig1.maxLifetime = (short) 10;
        java.lang.String str14 = hikariConfig1.poolName;
        java.lang.String str15 = hikariConfig1.catalog;
        hikariConfig1.acquireRetries = '4';
        hikariConfig1.setMaxLifetime(52L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-27634" + "'", str14, "HikariPool-27634");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.dataSourceClassName = "HikariPool-578";
        hikariConfig1.setDataSourceClassName("HikariPool-65");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.maxLifetime = 1800000L;
        hikariConfig1.dataSourceClassName = "HikariPool-489";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-320");
        int int15 = hikariConfig1.getAcquireRetries();
        long long16 = hikariConfig1.getIdleTimeout();
        int int17 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.leakDetectionThreshold = 5000L;
        hikariConfig1.setMaximumPoolSize(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        hikariConfig1.poolName = "HikariPool-104";
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        boolean boolean29 = hikariConfig28.isAutoCommit;
        hikariConfig28.poolName = "hi!";
        java.lang.String str32 = hikariConfig28.dataSourceClassName;
        java.lang.String str33 = hikariConfig28.dataSourceClassName;
        hikariConfig28.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer36 = hikariConfig28.connectionCustomizer;
        hikariConfig28.setMaxLifetime((long) (short) 0);
        hikariConfig28.setAcquireRetries(100);
        long long41 = hikariConfig28.getIdleTimeout();
        boolean boolean42 = hikariConfig28.isJdbc4connectionTest;
        hikariConfig28.setPoolName("HikariPool-222");
        hikariConfig1.addDataSourceProperty("HikariPool-410", (java.lang.Object) "HikariPool-222");
        hikariConfig1.acquireRetries = (short) 10;
        long long48 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2413");
        long long51 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(iConnectionCustomizer36);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 60L + "'", long41 == 60L);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 60L + "'", long48 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 10L + "'", long51 == 10L);
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        hikariConfig1.acquireRetries = '#';
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        hikariConfig1.setConnectionTestQuery("HikariPool-17602");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "";
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        long long15 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.acquireRetries = (-1);
        hikariConfig1.idleTimeout = 2147483647L;
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        long long16 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        long long9 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setTransactionIsolation("HikariPool-167");
        long long12 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str14 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        hikariConfig1.poolName = "HikariPool-11814";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-27653" + "'", str14, "HikariPool-27653");
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries((int) 'a');
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setJdbc4ConnectionTest(true);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isAutoCommit;
        hikariConfig14.poolName = "hi!";
        java.lang.String str18 = hikariConfig14.dataSourceClassName;
        hikariConfig14.acquireRetries = (short) 10;
        java.util.Properties properties21 = hikariConfig14.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig23.leakDetectionThreshold = 32L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setAutoCommit(false);
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-403");
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        int int12 = hikariConfig1.transactionIsolation;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-6420");
        long long15 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.poolName = "HikariPool-410";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setRegisterMbeans(false);
        int int13 = hikariConfig1.acquireRetries;
        hikariConfig1.isInitializationFailFast = true;
        int int16 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setCatalog("HikariPool-204");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolation = (byte) 100;
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setCatalog("HikariPool-6");
        java.lang.String str14 = hikariConfig1.dataSourceClassName;
        java.util.Properties properties15 = hikariConfig1.dataSourceProperties;
        int int16 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        long long6 = hikariConfig1.connectionTimeout;
        hikariConfig1.setTransactionIsolation("HikariPool-517");
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig1.catalog;
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolationName = "HikariPool-2377";
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.dataSource = dataSource14;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.leakDetectionThreshold = 0L;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        int int18 = hikariConfig16.getAcquireIncrement();
        java.util.Properties properties19 = hikariConfig16.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties19;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties19);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig22.connectionTestQuery = "HikariPool-6001";
        long long25 = hikariConfig22.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(properties19);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        hikariConfig1.poolName = "HikariPool-104";
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.leakDetectionThreshold = 100;
        boolean boolean30 = hikariConfig27.isJdbc4ConnectionTest();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int33 = hikariConfig32.getTransactionIsolation();
        hikariConfig32.setRegisterMbeans(false);
        java.lang.String str36 = hikariConfig32.transactionIsolationName;
        long long37 = hikariConfig32.getIdleTimeout();
        java.lang.String str38 = hikariConfig32.getCatalog();
        java.lang.String str39 = hikariConfig32.getConnectionTestQuery();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig41.dataSourceClassName = "";
        java.util.Properties properties44 = hikariConfig41.dataSourceProperties;
        hikariConfig32.setDataSourceProperties(properties44);
        hikariConfig27.dataSourceProperties = properties44;
        java.util.Properties properties47 = hikariConfig27.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties47;
        java.lang.String str49 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str50 = hikariConfig1.connectionTestQuery;
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig52.leakDetectionThreshold = 100;
        hikariConfig52.setTransactionIsolation("hi!");
        int int57 = hikariConfig52.getMaximumPoolSize();
        hikariConfig52.setRegisterMbeans(false);
        boolean boolean60 = hikariConfig52.isRegisterMbeans;
        java.util.Properties properties62 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        int int64 = hikariConfig63.getTransactionIsolation();
        hikariConfig63.setRegisterMbeans(false);
        java.lang.String str67 = hikariConfig63.transactionIsolationName;
        int int68 = hikariConfig63.transactionIsolation;
        javax.sql.DataSource dataSource69 = null;
        hikariConfig63.dataSource = dataSource69;
        java.lang.String str71 = hikariConfig63.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer72 = hikariConfig63.connectionCustomizer;
        java.lang.String str73 = hikariConfig63.connectionCustomizerClassName;
        hikariConfig52.addDataSourceProperty("HikariPool-1802", (java.lang.Object) hikariConfig63);
        hikariConfig63.maxPoolSize = (byte) 1;
        java.util.Properties properties77 = hikariConfig63.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties77;
        hikariConfig1.transactionIsolation = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60L + "'", long37 == 60L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 60 + "'", int57 == 60);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(iConnectionCustomizer72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(properties77);
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionInitSql("HikariPool-359");
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setTransactionIsolation("HikariPool-1049");
        hikariConfig1.maxPoolSize = (short) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-320");
        hikariConfig1.transactionIsolationName = "HikariPool-197";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        int int16 = hikariConfig1.transactionIsolation;
        hikariConfig1.setUseInstrumentation(false);
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        hikariConfig21.setConnectionInitSql("hi!");
        boolean boolean24 = hikariConfig21.isInitializationFailFast;
        hikariConfig21.addDataSourceProperty("HikariPool-222", (java.lang.Object) "HikariPool-6");
        java.lang.String str28 = hikariConfig21.transactionIsolationName;
        java.lang.String str29 = hikariConfig21.getDataSourceClassName();
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig31.leakDetectionThreshold = 100;
        hikariConfig31.setRegisterMbeans(false);
        hikariConfig31.setMinimumPoolSize((int) (byte) 1);
        java.lang.String str38 = hikariConfig31.poolName;
        int int39 = hikariConfig31.acquireRetries;
        hikariConfig31.isAutoCommit = true;
        java.util.Properties properties42 = hikariConfig31.dataSourceProperties;
        hikariConfig21.setDataSourceProperties(properties42);
        hikariConfig1.addDataSourceProperty("HikariPool-1815", (java.lang.Object) hikariConfig21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HikariPool-27690" + "'", str38, "HikariPool-27690");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(properties42);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.util.Properties properties5 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.leakDetectionThreshold = 100;
        hikariConfig7.setRegisterMbeans(false);
        hikariConfig7.isRegisterMbeans = false;
        hikariConfig7.setConnectionInitSql("HikariPool-780");
        java.lang.String str16 = hikariConfig7.getPoolName();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.leakDetectionThreshold = 100;
        boolean boolean21 = hikariConfig18.isJdbc4connectionTest;
        long long22 = hikariConfig18.getIdleTimeout();
        hikariConfig18.setUseInstrumentation(false);
        hikariConfig18.setJdbc4ConnectionTest(false);
        java.util.Properties properties27 = hikariConfig18.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig7.setDataSourceProperties(properties27);
        hikariConfig1.setDataSourceProperties(properties27);
        int int31 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-27692" + "'", str16, "HikariPool-27692");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60L + "'", long22 == 60L);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 60 + "'", int31 == 60);
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setUseInstrumentation(true);
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        long long10 = hikariConfig0.getConnectionTimeout();
        java.lang.String str11 = hikariConfig0.getConnectionInitSql();
        java.lang.String str12 = hikariConfig0.dataSourceClassName;
        hikariConfig0.acquireRetries = 1;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        long long10 = hikariConfig1.idleTimeout;
        hikariConfig1.leakDetectionThreshold = 87L;
        java.util.Properties properties13 = null;
        hikariConfig1.dataSourceProperties = properties13;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.maxPoolSize = (byte) 0;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.transactionIsolationName = "HikariPool-252";
        int int14 = hikariConfig1.maxPoolSize;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1503");
        hikariConfig1.connectionCustomizerClassName = "HikariPool-4264";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.dataSourceClassName = "HikariPool-249";
        hikariConfig1.connectionTestQuery = "HikariPool-6";
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setPoolName("HikariPool-1293");
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        java.lang.String str20 = hikariConfig16.dataSourceClassName;
        hikariConfig16.acquireRetries = (short) 10;
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        java.util.Properties properties25 = hikariConfig24.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setJdbc4ConnectionTest(false);
        hikariConfig1.addDataSourceProperty("HikariPool-112", (java.lang.Object) hikariConfig26);
        long long30 = hikariConfig26.getMaxLifetime();
        boolean boolean31 = hikariConfig26.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties25);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        long long9 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.connectionTestQuery = "HikariPool-179";
        int int12 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setPoolName("HikariPool-5033");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.minPoolSize = (byte) -1;
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        hikariConfig1.connectionInitSql = "HikariPool-413";
        long long17 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        boolean boolean11 = hikariConfig1.isAutoCommit;
        hikariConfig1.setDataSourceClassName("HikariPool-844");
        hikariConfig1.dataSourceClassName = "HikariPool-385";
        hikariConfig1.setConnectionInitSql("HikariPool-278");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        int int3 = hikariConfig0.getMaximumPoolSize();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.minPoolSize = 0;
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        boolean boolean8 = hikariConfig0.isRegisterMbeans;
        hikariConfig0.acquireRetries = 32;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setTransactionIsolation("HikariPool-11579");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        hikariConfig1.setConnectionInitSql("HikariPool-114");
        hikariConfig1.idleTimeout = 32L;
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-114" + "'", str10, "HikariPool-114");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.dataSourceClassName = "HikariPool-249";
        hikariConfig1.connectionTestQuery = "HikariPool-6";
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries((int) (short) 10);
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        hikariConfig1.setConnectionTestQuery("HikariPool-1242");
        hikariConfig1.isAutoCommit = false;
        java.lang.String str20 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.connectionTimeout;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.transactionIsolation = (short) 100;
        hikariConfig1.isRegisterMbeans = false;
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.catalog = "HikariPool-410";
        long long8 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setAutoCommit(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.dataSourceClassName = "HikariPool-249";
        hikariConfig1.connectionTestQuery = "HikariPool-6";
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.setConnectionInitSql("HikariPool-292");
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-126");
        boolean boolean14 = hikariConfig1.isAutoCommit();
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.isRegisterMbeans = false;
        java.lang.String str7 = hikariConfig0.poolName;
        hikariConfig0.acquireRetries = ' ';
        hikariConfig0.catalog = "HikariPool-523";
        java.lang.String str12 = hikariConfig0.poolName;
        java.lang.String str13 = hikariConfig0.getPoolName();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-27765" + "'", str7, "HikariPool-27765");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-27765" + "'", str12, "HikariPool-27765");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-27765" + "'", str13, "HikariPool-27765");
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        hikariConfig1.setIdleTimeout(0L);
        int int9 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        hikariConfig1.isJdbc4connectionTest = false;
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.catalog;
        int int15 = hikariConfig13.getMinimumPoolSize();
        java.util.Properties properties16 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties16;
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-27768" + "'", str8, "HikariPool-27768");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-11490");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-11490 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        java.lang.String str7 = hikariConfig1.catalog;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.dataSource = dataSource9;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setJdbc4ConnectionTest(true);
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionTestQuery("HikariPool-559");
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        int int12 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.idleTimeout = (byte) -1;
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        hikariConfig13.dataSourceClassName = "";
        hikariConfig13.setTransactionIsolation("");
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        int int23 = hikariConfig22.getTransactionIsolation();
        hikariConfig22.setRegisterMbeans(false);
        hikariConfig22.isInitializationFailFast = true;
        int int28 = hikariConfig22.acquireRetries;
        hikariConfig22.setMaxLifetime((long) (-1));
        int int31 = hikariConfig22.getTransactionIsolation();
        java.util.Properties properties32 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        int int34 = hikariConfig33.getTransactionIsolation();
        hikariConfig33.setRegisterMbeans(false);
        java.lang.String str37 = hikariConfig33.transactionIsolationName;
        int int38 = hikariConfig33.getMaximumPoolSize();
        int int39 = hikariConfig33.transactionIsolation;
        java.util.Properties properties40 = hikariConfig33.dataSourceProperties;
        hikariConfig22.setDataSourceProperties(properties40);
        hikariConfig13.dataSourceProperties = properties40;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig1.dataSourceProperties = properties40;
        long long45 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.maxPoolSize = (-1);
        long long48 = hikariConfig1.getMaxLifetime();
        long long49 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.connectionInitSql = "HikariPool-138";
        hikariConfig1.connectionTimeout = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60 + "'", int38 == 60);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 35L + "'", long48 == 35L);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("hi!");
        java.lang.String str9 = hikariConfig1.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.acquireRetries = (short) 1;
        int int17 = hikariConfig1.minPoolSize;
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        hikariConfig1.connectionInitSql = "HikariPool-535";
        hikariConfig1.setLeakDetectionThreshold((long) 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.dataSourceClassName = "HikariPool-204";
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries(10);
        boolean boolean19 = hikariConfig1.isJdbc4connectionTest;
        long long20 = hikariConfig1.leakDetectionThreshold;
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.dataSource = dataSource21;
        hikariConfig1.connectionTestQuery = "HikariPool-1444";
        boolean boolean25 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.isInitializationFailFast = false;
        java.lang.String str28 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setConnectionTimeout(5000L);
        java.lang.Class<?> wildcardClass11 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        int int16 = hikariConfig1.maxPoolSize;
        hikariConfig1.setTransactionIsolation("HikariPool-485");
        java.lang.String str19 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("hi!");
        java.lang.String str9 = hikariConfig1.getCatalog();
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setDataSourceClassName("HikariPool-702");
        hikariConfig1.setPoolName("HikariPool-22659");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        int int6 = hikariConfig1.getAcquireIncrement();
        java.lang.String str7 = hikariConfig1.getPoolName();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.transactionIsolation = 1;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties17 = hikariConfig1.getDataSourceProperties();
        int int18 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-27795" + "'", str7, "HikariPool-27795");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        int int9 = hikariConfig1.acquireRetries;
        java.lang.String str10 = hikariConfig1.connectionCustomizerClassName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolation = (byte) 1;
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        int int8 = hikariConfig1.transactionIsolation;
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "HikariPool-2247";
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setMaximumPoolSize(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-27801" + "'", str8, "HikariPool-27801");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        int int8 = hikariConfig0.acquireRetries;
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig0.poolName;
        java.lang.String str11 = hikariConfig0.connectionTestQuery;
        boolean boolean12 = hikariConfig0.isAutoCommit;
        java.lang.String str13 = hikariConfig0.connectionTestQuery;
        boolean boolean14 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-27802" + "'", str10, "HikariPool-27802");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        hikariConfig1.poolName = "HikariPool-104";
        int int26 = hikariConfig1.transactionIsolation;
        hikariConfig1.setConnectionTestQuery("HikariPool-517");
        javax.sql.DataSource dataSource29 = hikariConfig1.dataSource;
        java.util.Properties properties30 = hikariConfig1.getDataSourceProperties();
        int int31 = hikariConfig1.minPoolSize;
        hikariConfig1.setMaximumPoolSize(60);
        hikariConfig1.setTransactionIsolation("HikariPool-230");
        javax.sql.DataSource dataSource36 = null;
        hikariConfig1.dataSource = dataSource36;
        int int38 = hikariConfig1.getTransactionIsolation();
        boolean boolean39 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.leakDetectionThreshold = 100;
        hikariConfig8.minPoolSize = (byte) 1;
        hikariConfig8.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig8.connectionCustomizer;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.dataSourceClassName = "";
        hikariConfig17.setTransactionIsolation("");
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        hikariConfig26.isInitializationFailFast = true;
        int int32 = hikariConfig26.acquireRetries;
        hikariConfig26.setMaxLifetime((long) (-1));
        int int35 = hikariConfig26.getTransactionIsolation();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        java.lang.String str41 = hikariConfig37.transactionIsolationName;
        int int42 = hikariConfig37.getMaximumPoolSize();
        int int43 = hikariConfig37.transactionIsolation;
        java.util.Properties properties44 = hikariConfig37.dataSourceProperties;
        hikariConfig26.setDataSourceProperties(properties44);
        hikariConfig17.dataSourceProperties = properties44;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig8.dataSourceProperties = properties44;
        boolean boolean49 = hikariConfig8.isInitializationFailFast();
        boolean boolean50 = hikariConfig8.isInitializationFailFast;
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig52.setConnectionInitSql("hi!");
        long long55 = hikariConfig52.getLeakDetectionThreshold();
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        int int58 = hikariConfig57.getTransactionIsolation();
        hikariConfig57.setRegisterMbeans(false);
        java.lang.String str61 = hikariConfig57.transactionIsolationName;
        int int62 = hikariConfig57.getMaximumPoolSize();
        int int63 = hikariConfig57.transactionIsolation;
        java.util.Properties properties64 = hikariConfig57.dataSourceProperties;
        hikariConfig52.dataSourceProperties = properties64;
        java.util.Properties properties66 = hikariConfig52.getDataSourceProperties();
        hikariConfig8.dataSourceProperties = properties66;
        hikariConfig1.dataSourceProperties = properties66;
        int int69 = hikariConfig1.getAcquireIncrement();
        int int70 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionTestQuery("HikariPool-900");
        hikariConfig1.setConnectionTestQuery("HikariPool-357");
        hikariConfig1.setMaxLifetime(100L);
        boolean boolean77 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setPoolName("HikariPool-2242");
        java.lang.String str80 = hikariConfig1.getPoolName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 60 + "'", int62 == 60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 87 + "'", int70 == 87);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "HikariPool-2242" + "'", str80, "HikariPool-2242");
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.catalog = "HikariPool-117";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig1.connectionCustomizer;
        int int13 = hikariConfig1.getTransactionIsolation();
        int int14 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig17.transactionIsolationName;
        int int22 = hikariConfig17.getMaximumPoolSize();
        int int23 = hikariConfig17.transactionIsolation;
        java.util.Properties properties24 = hikariConfig17.dataSourceProperties;
        hikariConfig17.transactionIsolation = (byte) 1;
        hikariConfig17.isAutoCommit = false;
        boolean boolean29 = hikariConfig17.isRegisterMbeans;
        boolean boolean30 = hikariConfig17.isRegisterMbeans();
        hikariConfig17.leakDetectionThreshold = 97;
        hikariConfig17.setTransactionIsolation("HikariPool-530");
        long long35 = hikariConfig17.maxLifetime;
        hikariConfig1.addDataSourceProperty("HikariPool-2231", (java.lang.Object) long35);
        long long37 = hikariConfig1.getIdleTimeout();
        long long38 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60L + "'", long37 == 60L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        long long10 = hikariConfig1.idleTimeout;
        boolean boolean11 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        int int13 = hikariConfig1.getTransactionIsolation();
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.isInitializationFailFast = true;
        int int16 = hikariConfig10.acquireRetries;
        hikariConfig10.setMaxLifetime((long) (-1));
        int int19 = hikariConfig10.getTransactionIsolation();
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        int int22 = hikariConfig21.getTransactionIsolation();
        hikariConfig21.setRegisterMbeans(false);
        java.lang.String str25 = hikariConfig21.transactionIsolationName;
        int int26 = hikariConfig21.getMaximumPoolSize();
        int int27 = hikariConfig21.transactionIsolation;
        java.util.Properties properties28 = hikariConfig21.dataSourceProperties;
        hikariConfig10.setDataSourceProperties(properties28);
        hikariConfig1.dataSourceProperties = properties28;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig31.setAcquireRetries((int) ' ');
        int int34 = hikariConfig31.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.idleTimeout = '4';
        int int11 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setTransactionIsolation("HikariPool-173");
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        hikariConfig1.acquireRetries = '#';
        long long11 = hikariConfig1.getIdleTimeout();
        boolean boolean12 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setMaxLifetime((long) (byte) 1);
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        int int17 = hikariConfig1.getAcquireRetries();
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        hikariConfig1.setConnectionInitSql("HikariPool-114");
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setDataSourceClassName("HikariPool-373");
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.isAutoCommit = false;
        java.lang.String str6 = hikariConfig1.connectionInitSql;
        hikariConfig1.catalog = "HikariPool-1547";
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.setUseInstrumentation(true);
        hikariConfig11.connectionTestQuery = "HikariPool-104";
        hikariConfig11.maxPoolSize = (short) 100;
        java.lang.String str21 = hikariConfig11.transactionIsolationName;
        hikariConfig11.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-2359", (java.lang.Object) hikariConfig11);
        long long25 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.isInitializationFailFast = true;
        int int17 = hikariConfig11.acquireRetries;
        hikariConfig11.setMaxLifetime((long) (-1));
        boolean boolean20 = hikariConfig11.isInitializationFailFast();
        long long21 = hikariConfig11.maxLifetime;
        hikariConfig11.minPoolSize = (byte) -1;
        boolean boolean24 = hikariConfig11.isJdbc4connectionTest;
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        java.lang.String str30 = hikariConfig26.transactionIsolationName;
        long long31 = hikariConfig26.getIdleTimeout();
        java.lang.String str32 = hikariConfig26.getCatalog();
        java.lang.String str33 = hikariConfig26.getConnectionTestQuery();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig35.dataSourceClassName = "";
        java.util.Properties properties38 = hikariConfig35.dataSourceProperties;
        hikariConfig26.setDataSourceProperties(properties38);
        hikariConfig11.setDataSourceProperties(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig1.addDataSourceProperty("HikariPool-235", (java.lang.Object) properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig43.isInitializationFailFast = false;
        boolean boolean46 = hikariConfig43.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str30);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 60L + "'", long31 == 60L);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 32L;
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "hi!";
        boolean boolean16 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.dataSourceClassName = "HikariPool-204";
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setAcquireRetries(10);
        boolean boolean19 = hikariConfig1.isJdbc4ConnectionTest();
        int int20 = hikariConfig1.getMaximumPoolSize();
        int int21 = hikariConfig1.maxPoolSize;
        long long22 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTimeout((long) (short) 100);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.setDataSource(dataSource12);
        long long14 = hikariConfig1.getMaxLifetime();
        int int15 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionTestQuery();
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.connectionTimeout = 100L;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isJdbc4connectionTest = false;
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTestQuery = "HikariPool-9921";
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        hikariConfig1.poolName = "HikariPool-104";
        int int26 = hikariConfig1.transactionIsolation;
        java.util.Properties properties27 = hikariConfig1.getDataSourceProperties();
        int int28 = hikariConfig1.transactionIsolation;
        java.lang.String str29 = hikariConfig1.transactionIsolationName;
        hikariConfig1.transactionIsolation = 32;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.isInitializationFailFast = true;
        java.lang.String str16 = hikariConfig10.getConnectionCustomizerClassName();
        hikariConfig10.transactionIsolationName = "";
        long long19 = hikariConfig10.getLeakDetectionThreshold();
        java.lang.String str20 = hikariConfig10.getPoolName();
        java.util.Properties properties21 = hikariConfig10.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties21;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties21);
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties21);
        javax.sql.DataSource dataSource25 = null;
        hikariConfig24.setDataSource(dataSource25);
        long long27 = hikariConfig24.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-27857" + "'", str20, "HikariPool-27857");
        org.junit.Assert.assertNotNull(properties21);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 35L + "'", long27 == 35L);
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        hikariConfig1.poolName = "HikariPool-69";
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.connectionTimeout = 97;
        hikariConfig1.setTransactionIsolation("HikariPool-447");
        java.lang.String str20 = hikariConfig1.dataSourceClassName;
        java.lang.String str21 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        hikariConfig1.setCatalog("HikariPool-550");
        int int13 = hikariConfig1.getTransactionIsolation();
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        int int15 = hikariConfig1.getTransactionIsolation();
        long long16 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        hikariConfig1.dataSourceClassName = "HikariPool-204";
        javax.sql.DataSource dataSource14 = hikariConfig1.getDataSource();
        hikariConfig1.catalog = "HikariPool-205";
        hikariConfig1.maxPoolSize = '#';
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.catalog = "HikariPool-252";
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        java.lang.String str14 = hikariConfig10.transactionIsolationName;
        long long15 = hikariConfig10.connectionTimeout;
        hikariConfig10.setIdleTimeout(0L);
        java.util.Properties properties18 = hikariConfig10.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties18;
        boolean boolean20 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.minPoolSize = 10;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        boolean boolean11 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.minPoolSize = (short) 1;
        boolean boolean11 = hikariConfig1.isAutoCommit;
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("HikariPool-465");
        hikariConfig1.minPoolSize = (short) -1;
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer18;
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.dataSource = dataSource20;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        long long7 = hikariConfig1.idleTimeout;
        hikariConfig1.setMaxLifetime((long) (byte) 0);
        int int10 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        hikariConfig1.setAcquireRetries((int) 'a');
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.maxLifetime = 0L;
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        long long15 = hikariConfig1.maxLifetime;
        hikariConfig1.connectionTestQuery = "HikariPool-280";
        java.lang.String str18 = hikariConfig1.transactionIsolationName;
        boolean boolean19 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-27876" + "'", str11, "HikariPool-27876");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) "HikariPool-6");
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.setMinimumPoolSize((int) (byte) 1);
        java.lang.String str18 = hikariConfig11.poolName;
        int int19 = hikariConfig11.acquireRetries;
        hikariConfig11.isAutoCommit = true;
        java.util.Properties properties22 = hikariConfig11.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties22);
        java.lang.String str24 = hikariConfig1.getDataSourceClassName();
        long long25 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setLeakDetectionThreshold((long) 87);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-27879" + "'", str18, "HikariPool-27879");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60L + "'", long25 == 60L);
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.maxPoolSize = 87;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMaximumPoolSize((int) '#');
        hikariConfig1.connectionInitSql = "HikariPool-260";
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-730";
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        int int18 = hikariConfig1.getMaximumPoolSize();
        int int19 = hikariConfig1.minPoolSize;
        hikariConfig1.isAutoCommit = true;
        int int22 = hikariConfig1.getAcquireRetries();
        java.lang.String str23 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-260" + "'", str23, "HikariPool-260");
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setTransactionIsolation("hi!");
        int int16 = hikariConfig11.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig11);
        int int18 = hikariConfig1.minPoolSize;
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.setConnectionInitSql("hi!");
        long long23 = hikariConfig20.getLeakDetectionThreshold();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        int int30 = hikariConfig25.getMaximumPoolSize();
        int int31 = hikariConfig25.transactionIsolation;
        java.util.Properties properties32 = hikariConfig25.dataSourceProperties;
        hikariConfig20.dataSourceProperties = properties32;
        java.util.Properties properties34 = hikariConfig20.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties34);
        java.lang.String str36 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean37 = hikariConfig1.isAutoCommit;
        java.util.Properties properties38 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig39.leakDetectionThreshold = 100;
        boolean boolean42 = hikariConfig39.isJdbc4ConnectionTest();
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        int int45 = hikariConfig44.getTransactionIsolation();
        hikariConfig44.setRegisterMbeans(false);
        java.lang.String str48 = hikariConfig44.transactionIsolationName;
        long long49 = hikariConfig44.getIdleTimeout();
        java.lang.String str50 = hikariConfig44.getCatalog();
        java.lang.String str51 = hikariConfig44.getConnectionTestQuery();
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        hikariConfig53.dataSourceClassName = "";
        java.util.Properties properties56 = hikariConfig53.dataSourceProperties;
        hikariConfig44.setDataSourceProperties(properties56);
        hikariConfig39.dataSourceProperties = properties56;
        java.lang.String str59 = hikariConfig39.poolName;
        hikariConfig39.setLeakDetectionThreshold(5000L);
        java.util.Properties properties62 = hikariConfig39.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties62;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNull(str48);
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 60L + "'", long49 == 60L);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(properties56);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "HikariPool-27893" + "'", str59, "HikariPool-27893");
        org.junit.Assert.assertNotNull(properties62);
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setConnectionTestQuery("HikariPool-472");
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str12 = hikariConfig1.getDataSourceClassName();
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        boolean boolean8 = hikariConfig1.isAutoCommit();
        long long9 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.isJdbc4connectionTest = true;
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.maxLifetime = '4';
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 32L;
        hikariConfig1.isAutoCommit = true;
        boolean boolean7 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean8 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.minPoolSize;
        hikariConfig1.maxLifetime = 0L;
        java.lang.String str8 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setDataSourceClassName("HikariPool-320");
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        int int13 = hikariConfig1.transactionIsolation;
        hikariConfig1.validate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.connectionTestQuery;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.maxLifetime = 32L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        long long9 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.maxPoolSize = ' ';
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig6.transactionIsolationName;
        int int11 = hikariConfig6.getMaximumPoolSize();
        int int12 = hikariConfig6.transactionIsolation;
        java.util.Properties properties13 = hikariConfig6.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties13;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties13);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int17 = hikariConfig16.transactionIsolation;
        hikariConfig16.setCatalog("HikariPool-461");
        hikariConfig16.isAutoCommit = false;
        java.lang.String str22 = hikariConfig16.transactionIsolationName;
        java.lang.String str23 = hikariConfig16.connectionCustomizerClassName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig16.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        long long11 = hikariConfig1.getMaxLifetime();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer12;
        hikariConfig1.setMaximumPoolSize(87);
        int int16 = hikariConfig1.transactionIsolation;
        hikariConfig1.setCatalog("HikariPool-232");
        java.lang.String str19 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-8351");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.transactionIsolation = (short) 1;
        hikariConfig1.setIdleTimeout((long) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.catalog;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        hikariConfig15.connectionTimeout = 10L;
        hikariConfig15.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        hikariConfig23.isInitializationFailFast = true;
        int int29 = hikariConfig23.acquireRetries;
        hikariConfig23.setMaxLifetime((long) (-1));
        int int32 = hikariConfig23.getTransactionIsolation();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        int int39 = hikariConfig34.getMaximumPoolSize();
        int int40 = hikariConfig34.transactionIsolation;
        java.util.Properties properties41 = hikariConfig34.dataSourceProperties;
        hikariConfig23.setDataSourceProperties(properties41);
        hikariConfig15.setDataSourceProperties(properties41);
        hikariConfig1.setDataSourceProperties(properties41);
        java.lang.String str45 = hikariConfig1.getPoolName();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        java.lang.String str48 = hikariConfig1.getPoolName();
        long long49 = hikariConfig1.idleTimeout;
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        boolean boolean52 = hikariConfig51.isAutoCommit;
        hikariConfig51.poolName = "hi!";
        hikariConfig51.setMinimumPoolSize(1);
        int int57 = hikariConfig51.maxPoolSize;
        hikariConfig51.isRegisterMbeans = true;
        hikariConfig51.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str64 = hikariConfig63.poolName;
        hikariConfig63.setMinimumPoolSize((int) '4');
        javax.sql.DataSource dataSource67 = hikariConfig63.dataSource;
        hikariConfig51.addDataSourceProperty("HikariPool-168", (java.lang.Object) hikariConfig63);
        hikariConfig63.isInitializationFailFast = false;
        boolean boolean71 = hikariConfig63.isInitializationFailFast;
        java.util.Properties properties72 = hikariConfig63.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(properties41);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HikariPool-27930" + "'", str45, "HikariPool-27930");
// flaky:         org.junit.Assert.assertEquals("'" + str48 + "' != '" + "HikariPool-27930" + "'", str48, "HikariPool-27930");
// flaky:         org.junit.Assert.assertTrue("'" + long49 + "' != '" + 60L + "'", long49 == 60L);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 60 + "'", int57 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str64 + "' != '" + "HikariPool-27935" + "'", str64, "HikariPool-27935");
        org.junit.Assert.assertNull(dataSource67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(properties72);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setDataSourceClassName("HikariPool-292");
        java.lang.String str10 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setPoolName("HikariPool-424");
        long long13 = hikariConfig1.maxLifetime;
        hikariConfig1.leakDetectionThreshold = 1L;
        java.lang.String str16 = hikariConfig1.getConnectionInitSql();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setAcquireRetries(100);
        long long14 = hikariConfig1.getIdleTimeout();
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        java.lang.String str16 = hikariConfig1.dataSourceClassName;
        int int17 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionInitSql("HikariPool-3724");
        hikariConfig1.setIdleTimeout(2147483647L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.dataSourceClassName = "HikariPool-249";
        long long9 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("hi!");
        long long14 = hikariConfig11.getLeakDetectionThreshold();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.getMaximumPoolSize();
        int int22 = hikariConfig16.transactionIsolation;
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties23;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig1.dataSourceProperties = properties23;
        hikariConfig1.isJdbc4connectionTest = false;
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        int int32 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.setRegisterMbeans(false);
        java.lang.String str35 = hikariConfig31.transactionIsolationName;
        int int36 = hikariConfig31.getMaximumPoolSize();
        int int37 = hikariConfig31.transactionIsolation;
        java.util.Properties properties38 = hikariConfig31.dataSourceProperties;
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        int int42 = hikariConfig41.getTransactionIsolation();
        hikariConfig41.setRegisterMbeans(false);
        hikariConfig41.isInitializationFailFast = true;
        int int47 = hikariConfig41.acquireRetries;
        hikariConfig41.setMaxLifetime((long) (-1));
        boolean boolean50 = hikariConfig41.isInitializationFailFast();
        long long51 = hikariConfig41.maxLifetime;
        hikariConfig41.minPoolSize = (byte) -1;
        boolean boolean54 = hikariConfig41.isJdbc4connectionTest;
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        int int57 = hikariConfig56.getTransactionIsolation();
        hikariConfig56.setRegisterMbeans(false);
        java.lang.String str60 = hikariConfig56.transactionIsolationName;
        long long61 = hikariConfig56.getIdleTimeout();
        java.lang.String str62 = hikariConfig56.getCatalog();
        java.lang.String str63 = hikariConfig56.getConnectionTestQuery();
        java.util.Properties properties64 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig65 = new com.zaxxer.hikari.HikariConfig(properties64);
        hikariConfig65.dataSourceClassName = "";
        java.util.Properties properties68 = hikariConfig65.dataSourceProperties;
        hikariConfig56.setDataSourceProperties(properties68);
        hikariConfig41.setDataSourceProperties(properties68);
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties68);
        hikariConfig31.addDataSourceProperty("HikariPool-235", (java.lang.Object) properties68);
        hikariConfig1.dataSourceProperties = properties68;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties68);
        hikariConfig74.leakDetectionThreshold = 97;
        hikariConfig74.transactionIsolationName = "HikariPool-2092";
        java.lang.String str79 = hikariConfig74.getDataSourceClassName();
        long long80 = hikariConfig74.maxLifetime;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig74.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNull(str60);
// flaky:         org.junit.Assert.assertTrue("'" + long61 + "' != '" + 60L + "'", long61 == 60L);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(properties68);
        org.junit.Assert.assertNull(str79);
// flaky:         org.junit.Assert.assertTrue("'" + long80 + "' != '" + 35L + "'", long80 == 35L);
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("hi!");
        java.lang.String str9 = hikariConfig1.getCatalog();
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.acquireRetries = (byte) 0;
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        java.lang.String str16 = hikariConfig1.getPoolName();
        hikariConfig1.setTransactionIsolation("HikariPool-5547");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-27952" + "'", str16, "HikariPool-27952");
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.setCatalog("HikariPool-320");
        long long8 = hikariConfig1.getIdleTimeout();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.setDataSource(dataSource9);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.connectionInitSql = "";
        hikariConfig1.setAutoCommit(true);
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setLeakDetectionThreshold((long) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setConnectionInitSql("HikariPool-43");
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        java.lang.String str14 = hikariConfig10.transactionIsolationName;
        long long15 = hikariConfig10.getIdleTimeout();
        boolean boolean16 = hikariConfig10.isInitializationFailFast;
        java.util.Properties properties17 = hikariConfig10.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig19.setRegisterMbeans(false);
        hikariConfig19.setDataSourceClassName("HikariPool-2151");
        int int24 = hikariConfig19.maxPoolSize;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 60 + "'", int24 == 60);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-320");
        long long13 = hikariConfig1.getMaxLifetime();
        int int14 = hikariConfig1.maxPoolSize;
        hikariConfig1.minPoolSize = (-1);
        long long17 = hikariConfig1.getMaxLifetime();
        boolean boolean18 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setCatalog("HikariPool-87");
        hikariConfig1.acquireRetries = (short) 1;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        int int30 = hikariConfig29.getTransactionIsolation();
        hikariConfig29.setRegisterMbeans(false);
        java.lang.String str33 = hikariConfig29.transactionIsolationName;
        java.lang.String str34 = hikariConfig29.connectionCustomizerClassName;
        hikariConfig29.setConnectionTestQuery("hi!");
        java.lang.String str37 = hikariConfig29.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer38 = hikariConfig29.connectionCustomizer;
        hikariConfig25.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig29);
        java.lang.String str40 = hikariConfig25.getConnectionTestQuery();
        javax.sql.DataSource dataSource41 = null;
        hikariConfig25.dataSource = dataSource41;
        hikariConfig1.addDataSourceProperty("HikariPool-1839", (java.lang.Object) hikariConfig25);
        hikariConfig25.isRegisterMbeans = false;
        long long46 = hikariConfig25.getLeakDetectionThreshold();
        hikariConfig25.setTransactionIsolation("HikariPool-2231");
        hikariConfig25.setPoolName("HikariPool-11945");
        javax.sql.DataSource dataSource51 = hikariConfig25.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(iConnectionCustomizer38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNull(dataSource51);
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        int int7 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionTestQuery("HikariPool-789");
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.leakDetectionThreshold = 100;
        hikariConfig12.setRegisterMbeans(false);
        hikariConfig12.isRegisterMbeans = false;
        hikariConfig12.setConnectionInitSql("HikariPool-780");
        java.lang.String str21 = hikariConfig12.getPoolName();
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.leakDetectionThreshold = 100;
        boolean boolean26 = hikariConfig23.isJdbc4connectionTest;
        long long27 = hikariConfig23.getIdleTimeout();
        hikariConfig23.setUseInstrumentation(false);
        hikariConfig23.setJdbc4ConnectionTest(false);
        java.util.Properties properties32 = hikariConfig23.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig12.setDataSourceProperties(properties32);
        hikariConfig1.setDataSourceProperties(properties32);
        int int36 = hikariConfig1.transactionIsolation;
        hikariConfig1.acquireRetries = 0;
        java.lang.String str39 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setDataSourceClassName("HikariPool-439");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-27974" + "'", str21, "HikariPool-27974");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 60L + "'", long27 == 60L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HikariPool-789" + "'", str39, "HikariPool-789");
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setTransactionIsolation("HikariPool-5227");
        hikariConfig0.setMinimumPoolSize((int) 'a');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setLeakDetectionThreshold((long) 60);
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        long long15 = hikariConfig1.maxLifetime;
        hikariConfig1.setConnectionTestQuery("HikariPool-68");
        javax.sql.DataSource dataSource18 = hikariConfig1.dataSource;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionTestQuery("HikariPool-16175");
        long long23 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertNull(dataSource18);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60L + "'", long23 == 60L);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        hikariConfig1.poolName = "HikariPool-104";
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.leakDetectionThreshold = 100;
        boolean boolean30 = hikariConfig27.isJdbc4ConnectionTest();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int33 = hikariConfig32.getTransactionIsolation();
        hikariConfig32.setRegisterMbeans(false);
        java.lang.String str36 = hikariConfig32.transactionIsolationName;
        long long37 = hikariConfig32.getIdleTimeout();
        java.lang.String str38 = hikariConfig32.getCatalog();
        java.lang.String str39 = hikariConfig32.getConnectionTestQuery();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig41.dataSourceClassName = "";
        java.util.Properties properties44 = hikariConfig41.dataSourceProperties;
        hikariConfig32.setDataSourceProperties(properties44);
        hikariConfig27.dataSourceProperties = properties44;
        java.util.Properties properties47 = hikariConfig27.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties47;
        java.lang.String str49 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean50 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setCatalog("HikariPool-756");
        java.util.Properties properties53 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.maxPoolSize = (byte) -1;
        hikariConfig1.leakDetectionThreshold = ' ';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60L + "'", long37 == 60L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(properties53);
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        int int13 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-292";
        hikariConfig1.setDataSourceClassName("HikariPool-87");
        boolean boolean18 = hikariConfig1.isJdbc4ConnectionTest();
        int int19 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        int int7 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        boolean boolean10 = hikariConfig9.isAutoCommit;
        hikariConfig9.poolName = "hi!";
        java.lang.String str13 = hikariConfig9.dataSourceClassName;
        hikariConfig9.acquireRetries = (short) 10;
        int int16 = hikariConfig9.getAcquireIncrement();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.isInitializationFailFast = true;
        int int24 = hikariConfig18.acquireRetries;
        hikariConfig18.setMaxLifetime((long) (-1));
        int int27 = hikariConfig18.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = null;
        hikariConfig18.connectionCustomizer = iConnectionCustomizer28;
        java.lang.String str30 = hikariConfig18.catalog;
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        hikariConfig32.dataSourceClassName = "";
        hikariConfig32.connectionTimeout = 10L;
        hikariConfig32.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        int int41 = hikariConfig40.getTransactionIsolation();
        hikariConfig40.setRegisterMbeans(false);
        hikariConfig40.isInitializationFailFast = true;
        int int46 = hikariConfig40.acquireRetries;
        hikariConfig40.setMaxLifetime((long) (-1));
        int int49 = hikariConfig40.getTransactionIsolation();
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        int int52 = hikariConfig51.getTransactionIsolation();
        hikariConfig51.setRegisterMbeans(false);
        java.lang.String str55 = hikariConfig51.transactionIsolationName;
        int int56 = hikariConfig51.getMaximumPoolSize();
        int int57 = hikariConfig51.transactionIsolation;
        java.util.Properties properties58 = hikariConfig51.dataSourceProperties;
        hikariConfig40.setDataSourceProperties(properties58);
        hikariConfig32.setDataSourceProperties(properties58);
        hikariConfig18.setDataSourceProperties(properties58);
        java.util.Properties properties62 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        boolean boolean64 = hikariConfig63.isAutoCommit;
        hikariConfig63.poolName = "hi!";
        java.lang.String str67 = hikariConfig63.dataSourceClassName;
        java.lang.String str68 = hikariConfig63.dataSourceClassName;
        hikariConfig63.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer71 = hikariConfig63.connectionCustomizer;
        hikariConfig63.setInitializationFailFast(true);
        int int74 = hikariConfig63.transactionIsolation;
        java.util.Properties properties75 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig76 = new com.zaxxer.hikari.HikariConfig(properties75);
        hikariConfig76.dataSourceClassName = "";
        java.util.Properties properties79 = hikariConfig76.dataSourceProperties;
        hikariConfig63.setDataSourceProperties(properties79);
        hikariConfig18.setDataSourceProperties(properties79);
        hikariConfig9.dataSourceProperties = properties79;
        hikariConfig1.setDataSourceProperties(properties79);
        java.lang.Class<?> wildcardClass84 = properties79.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 60 + "'", int56 == 60);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(properties58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(iConnectionCustomizer71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(properties79);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        long long4 = hikariConfig1.getLeakDetectionThreshold();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig6.transactionIsolationName;
        int int11 = hikariConfig6.getMaximumPoolSize();
        int int12 = hikariConfig6.transactionIsolation;
        java.util.Properties properties13 = hikariConfig6.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties13;
        int int15 = hikariConfig1.minPoolSize;
        hikariConfig1.poolName = "HikariPool-657";
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        hikariConfig1.setJdbc4ConnectionTest(false);
        boolean boolean21 = hikariConfig1.isInitializationFailFast;
        boolean boolean22 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isAutoCommit;
        hikariConfig24.poolName = "hi!";
        java.lang.String str28 = hikariConfig24.dataSourceClassName;
        java.lang.String str29 = hikariConfig24.dataSourceClassName;
        hikariConfig24.setJdbc4ConnectionTest(false);
        int int32 = hikariConfig24.maxPoolSize;
        hikariConfig24.isRegisterMbeans = false;
        boolean boolean35 = hikariConfig24.isInitializationFailFast();
        hikariConfig24.setDataSourceClassName("HikariPool-68");
        hikariConfig24.transactionIsolationName = "HikariPool-105";
        hikariConfig24.maxLifetime = 32;
        java.util.Properties properties42 = hikariConfig24.getDataSourceProperties();
        java.util.Properties properties43 = hikariConfig24.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties43;
        java.util.Properties properties45 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties46 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties46);
        int int48 = hikariConfig47.getTransactionIsolation();
        hikariConfig47.setRegisterMbeans(false);
        java.lang.String str51 = hikariConfig47.transactionIsolationName;
        long long52 = hikariConfig47.getIdleTimeout();
        java.lang.String str53 = hikariConfig47.getCatalog();
        java.util.Properties properties54 = hikariConfig47.getDataSourceProperties();
        hikariConfig47.setRegisterMbeans(true);
        boolean boolean57 = hikariConfig47.isInitializationFailFast();
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.leakDetectionThreshold = 100;
        boolean boolean62 = hikariConfig59.isJdbc4connectionTest;
        long long63 = hikariConfig59.getIdleTimeout();
        java.util.Properties properties64 = hikariConfig59.dataSourceProperties;
        hikariConfig47.setDataSourceProperties(properties64);
        hikariConfig1.setDataSourceProperties(properties64);
        javax.sql.DataSource dataSource67 = null;
        hikariConfig1.setDataSource(dataSource67);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNotNull(properties43);
        org.junit.Assert.assertNotNull(properties45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(str51);
// flaky:         org.junit.Assert.assertTrue("'" + long52 + "' != '" + 60L + "'", long52 == 60L);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(properties54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 60L + "'", long63 == 60L);
        org.junit.Assert.assertNotNull(properties64);
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        long long10 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean14 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-489");
        boolean boolean17 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.dataSourceClassName = "";
        java.util.Properties properties13 = hikariConfig10.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties13);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) 3);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean16 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("HikariPool-531");
        long long19 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setLeakDetectionThreshold(5000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setPoolName("HikariPool-104");
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-500");
        hikariConfig1.setCatalog("HikariPool-19374");
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        long long9 = hikariConfig1.maxLifetime;
        hikariConfig1.connectionTimeout = 52;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setAcquireRetries(1);
        hikariConfig1.maxLifetime = 1L;
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.connectionInitSql = "HikariPool-43";
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        boolean boolean22 = hikariConfig21.isAutoCommit;
        int int23 = hikariConfig21.getAcquireIncrement();
        int int24 = hikariConfig21.getAcquireIncrement();
        java.lang.String str25 = hikariConfig21.connectionCustomizerClassName;
        hikariConfig21.setCatalog("HikariPool-204");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = hikariConfig21.connectionCustomizer;
        long long29 = hikariConfig21.getConnectionTimeout();
        hikariConfig21.acquireRetries = (short) 0;
        java.util.Properties properties32 = hikariConfig21.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties32;
        long long34 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.catalog = "HikariPool-9132";
        long long37 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(iConnectionCustomizer28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-204");
        int int11 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setPoolName("HikariPool-166");
        long long16 = hikariConfig1.idleTimeout;
        boolean boolean17 = hikariConfig1.isRegisterMbeans;
        long long18 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str19 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4connectionTest;
        java.util.Properties properties6 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setMinimumPoolSize((int) ' ');
        java.lang.String str9 = hikariConfig1.catalog;
        java.lang.String str10 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(properties6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-105";
        int int11 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str12 = hikariConfig1.transactionIsolationName;
        hikariConfig1.connectionInitSql = "HikariPool-1049";
        int int15 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.transactionIsolation = 100;
        hikariConfig1.setPoolName("HikariPool-246");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.dataSourceClassName = "HikariPool-249";
        hikariConfig1.connectionTestQuery = "HikariPool-6";
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries((int) (short) 10);
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        hikariConfig1.setConnectionTestQuery("HikariPool-1242");
        long long18 = hikariConfig1.leakDetectionThreshold;
        int int19 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        hikariConfig1.maxLifetime = (short) 10;
        java.lang.String str14 = hikariConfig1.poolName;
        java.lang.String str15 = hikariConfig1.catalog;
        hikariConfig1.connectionInitSql = "HikariPool-119";
        java.lang.String str18 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-28025" + "'", str14, "HikariPool-28025");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.maxLifetime = '#';
        java.lang.String str11 = hikariConfig1.catalog;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        int int13 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.setAutoCommit(false);
        hikariConfig15.connectionInitSql = "HikariPool-834";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = null;
        hikariConfig15.connectionCustomizer = iConnectionCustomizer20;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isJdbc4connectionTest = true;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.leakDetectionThreshold = 100;
        hikariConfig14.setTransactionIsolation("hi!");
        int int19 = hikariConfig14.getMaximumPoolSize();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig1.addDataSourceProperty("HikariPool-112", (java.lang.Object) hikariConfig14);
        hikariConfig1.poolName = "HikariPool-121";
        hikariConfig1.setCatalog("HikariPool-1283");
        boolean boolean27 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean28 = hikariConfig1.isAutoCommit();
        boolean boolean29 = hikariConfig1.isAutoCommit;
        java.lang.String str30 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-121" + "'", str30, "HikariPool-121");
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        java.lang.String str8 = hikariConfig1.poolName;
        int int9 = hikariConfig1.acquireRetries;
        hikariConfig1.isAutoCommit = true;
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        long long13 = hikariConfig1.getIdleTimeout();
        long long14 = hikariConfig1.idleTimeout;
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-28032" + "'", str8, "HikariPool-28032");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setInitializationFailFast(true);
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(87);
        hikariConfig1.transactionIsolationName = "HikariPool-222";
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = 10;
        hikariConfig1.setAcquireRetries((int) '4');
        hikariConfig1.setUseInstrumentation(true);
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-199");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setPoolName("HikariPool-1187");
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        hikariConfig1.setDataSourceClassName("HikariPool-1596");
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.dataSourceClassName = "";
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.connectionTestQuery = "HikariPool-470";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str22 = hikariConfig1.connectionCustomizerClassName;
        java.util.Properties properties23 = hikariConfig1.getDataSourceProperties();
        javax.sql.DataSource dataSource24 = hikariConfig1.getDataSource();
        int int25 = hikariConfig1.transactionIsolation;
        long long26 = hikariConfig1.connectionTimeout;
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNull(dataSource24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        int int16 = hikariConfig11.getMaximumPoolSize();
        int int17 = hikariConfig11.transactionIsolation;
        java.util.Properties properties18 = hikariConfig11.dataSourceProperties;
        hikariConfig11.transactionIsolation = (byte) 1;
        hikariConfig11.dataSourceClassName = "";
        boolean boolean23 = hikariConfig11.isJdbc4connectionTest;
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-59", (java.lang.Object) hikariConfig11);
        hikariConfig1.acquireRetries = 0;
        hikariConfig1.setIdleTimeout((long) (short) 1);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setPoolName("");
        boolean boolean37 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.dataSourceClassName = "HikariPool-197";
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        int int18 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.connectionTestQuery = "HikariPool-8487";
        hikariConfig1.connectionTestQuery = "";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        java.lang.String str16 = hikariConfig12.transactionIsolationName;
        int int17 = hikariConfig12.getMaximumPoolSize();
        int int18 = hikariConfig12.transactionIsolation;
        java.util.Properties properties19 = hikariConfig12.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties19);
        int int21 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 87L;
        java.lang.String str24 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 0);
        java.lang.String str27 = hikariConfig1.catalog;
        java.lang.String str28 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        long long18 = hikariConfig13.getIdleTimeout();
        java.lang.String str19 = hikariConfig13.getCatalog();
        java.util.Properties properties20 = hikariConfig13.getDataSourceProperties();
        hikariConfig13.setUseInstrumentation(false);
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig13);
        hikariConfig1.poolName = "HikariPool-104";
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig27.leakDetectionThreshold = 100;
        boolean boolean30 = hikariConfig27.isJdbc4ConnectionTest();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int33 = hikariConfig32.getTransactionIsolation();
        hikariConfig32.setRegisterMbeans(false);
        java.lang.String str36 = hikariConfig32.transactionIsolationName;
        long long37 = hikariConfig32.getIdleTimeout();
        java.lang.String str38 = hikariConfig32.getCatalog();
        java.lang.String str39 = hikariConfig32.getConnectionTestQuery();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig41.dataSourceClassName = "";
        java.util.Properties properties44 = hikariConfig41.dataSourceProperties;
        hikariConfig32.setDataSourceProperties(properties44);
        hikariConfig27.dataSourceProperties = properties44;
        java.util.Properties properties47 = hikariConfig27.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties47;
        java.lang.String str49 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean52 = hikariConfig1.isInitializationFailFast();
        int int53 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        boolean boolean57 = hikariConfig56.isAutoCommit;
        hikariConfig56.connectionTestQuery = "";
        hikariConfig56.setLeakDetectionThreshold((long) (-1));
        hikariConfig1.addDataSourceProperty("HikariPool-4264", (java.lang.Object) hikariConfig56);
        java.lang.String str63 = hikariConfig56.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60L + "'", long37 == 60L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        boolean boolean8 = hikariConfig7.isAutoCommit;
        hikariConfig7.poolName = "hi!";
        hikariConfig7.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig7.dataSource = dataSource13;
        int int15 = hikariConfig7.minPoolSize;
        int int16 = hikariConfig7.minPoolSize;
        hikariConfig7.setCatalog("HikariPool-550");
        hikariConfig1.addDataSourceProperty("HikariPool-481", (java.lang.Object) hikariConfig7);
        hikariConfig7.setAcquireRetries(3);
        hikariConfig7.setTransactionIsolation("HikariPool-1527");
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionTestQuery = "HikariPool-470";
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        java.lang.String str15 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setAcquireRetries(0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer18;
        long long20 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-470" + "'", str14, "HikariPool-470");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-470" + "'", str15, "HikariPool-470");
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-306");
        hikariConfig1.connectionTestQuery = "HikariPool-306";
        hikariConfig1.setCatalog("HikariPool-142");
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        long long18 = hikariConfig1.getAcquireRetryDelay();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-306" + "'", str17, "HikariPool-306");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setInitializationFailFast(true);
        int int12 = hikariConfig1.transactionIsolation;
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        hikariConfig14.dataSourceClassName = "";
        java.util.Properties properties17 = hikariConfig14.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties17);
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.poolName = "HikariPool-521";
        int int23 = hikariConfig1.maxPoolSize;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        java.lang.String str30 = hikariConfig25.connectionCustomizerClassName;
        hikariConfig25.setConnectionTestQuery("hi!");
        java.lang.String str33 = hikariConfig25.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer34 = hikariConfig25.connectionCustomizer;
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig36.setConnectionInitSql("hi!");
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        int int41 = hikariConfig40.getTransactionIsolation();
        hikariConfig40.setRegisterMbeans(false);
        hikariConfig40.dataSourceClassName = "";
        hikariConfig40.setTransactionIsolation("");
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        int int50 = hikariConfig49.getTransactionIsolation();
        hikariConfig49.setRegisterMbeans(false);
        hikariConfig49.isInitializationFailFast = true;
        int int55 = hikariConfig49.acquireRetries;
        hikariConfig49.setMaxLifetime((long) (-1));
        int int58 = hikariConfig49.getTransactionIsolation();
        java.util.Properties properties59 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig60 = new com.zaxxer.hikari.HikariConfig(properties59);
        int int61 = hikariConfig60.getTransactionIsolation();
        hikariConfig60.setRegisterMbeans(false);
        java.lang.String str64 = hikariConfig60.transactionIsolationName;
        int int65 = hikariConfig60.getMaximumPoolSize();
        int int66 = hikariConfig60.transactionIsolation;
        java.util.Properties properties67 = hikariConfig60.dataSourceProperties;
        hikariConfig49.setDataSourceProperties(properties67);
        hikariConfig40.dataSourceProperties = properties67;
        hikariConfig36.dataSourceProperties = properties67;
        hikariConfig25.setDataSourceProperties(properties67);
        java.util.Properties properties72 = hikariConfig25.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties72;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties72);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer75 = hikariConfig74.connectionCustomizer;
        long long76 = hikariConfig74.leakDetectionThreshold;
        int int77 = hikariConfig74.acquireRetries;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(iConnectionCustomizer34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 60 + "'", int65 == 60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertNotNull(properties72);
        org.junit.Assert.assertNull(iConnectionCustomizer75);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 3 + "'", int77 == 3);
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.catalog;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        hikariConfig15.connectionTimeout = 10L;
        hikariConfig15.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        hikariConfig23.isInitializationFailFast = true;
        int int29 = hikariConfig23.acquireRetries;
        hikariConfig23.setMaxLifetime((long) (-1));
        int int32 = hikariConfig23.getTransactionIsolation();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        int int39 = hikariConfig34.getMaximumPoolSize();
        int int40 = hikariConfig34.transactionIsolation;
        java.util.Properties properties41 = hikariConfig34.dataSourceProperties;
        hikariConfig23.setDataSourceProperties(properties41);
        hikariConfig15.setDataSourceProperties(properties41);
        hikariConfig1.setDataSourceProperties(properties41);
        java.lang.String str45 = hikariConfig1.getPoolName();
        boolean boolean46 = hikariConfig1.isRegisterMbeans;
        java.lang.String str47 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean48 = hikariConfig1.isInitializationFailFast();
        java.util.Properties properties50 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties50);
        hikariConfig51.leakDetectionThreshold = 100;
        hikariConfig51.connectionInitSql = "hi!";
        hikariConfig51.maxPoolSize = (short) -1;
        java.lang.String str58 = hikariConfig51.getCatalog();
        hikariConfig51.setDataSourceClassName("HikariPool-431");
        int int61 = hikariConfig51.maxPoolSize;
        boolean boolean62 = hikariConfig51.isJdbc4ConnectionTest();
        hikariConfig1.addDataSourceProperty("HikariPool-1445", (java.lang.Object) boolean62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(properties41);
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HikariPool-28090" + "'", str45, "HikariPool-28090");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.minPoolSize = 0;
        hikariConfig1.maxLifetime = (short) 10;
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        hikariConfig1.catalog = "";
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.leakDetectionThreshold = 87;
        long long14 = hikariConfig1.maxLifetime;
        long long15 = hikariConfig1.getMaxLifetime();
        boolean boolean16 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.dataSourceClassName = "";
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.connectionTestQuery = "HikariPool-470";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str20 = hikariConfig1.getPoolName();
        int int21 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.transactionIsolationName = "HikariPool-3295";
        long long24 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-28109" + "'", str20, "HikariPool-28109");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize((int) '4');
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setUseInstrumentation(true);
        int int11 = hikariConfig1.maxPoolSize;
        long long12 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setCatalog("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionInitSql("HikariPool-84");
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.poolName = "HikariPool-647";
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        int int10 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.idleTimeout = (-1);
        java.lang.String str13 = hikariConfig1.catalog;
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource20 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-320");
        long long12 = hikariConfig1.connectionTimeout;
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        int int11 = hikariConfig1.getTransactionIsolation();
        int int12 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 3;
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolation = (short) 1;
        java.lang.String str20 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(iConnectionCustomizer17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-204" + "'", str20, "HikariPool-204");
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getAcquireRetryDelay();
        int int8 = hikariConfig1.getAcquireRetries();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.isInitializationFailFast = true;
        int int16 = hikariConfig10.acquireRetries;
        hikariConfig10.setMaxLifetime((long) (-1));
        boolean boolean19 = hikariConfig10.isInitializationFailFast();
        hikariConfig10.poolName = "HikariPool-59";
        java.util.Properties properties22 = hikariConfig10.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties22);
        boolean boolean24 = hikariConfig1.isAutoCommit();
        boolean boolean25 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.poolName = "HikariPool-1547";
        hikariConfig1.transactionIsolation = 87;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.poolName = "HikariPool-410";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setRegisterMbeans(false);
        int int13 = hikariConfig1.acquireRetries;
        java.lang.String str14 = hikariConfig1.getPoolName();
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-410" + "'", str14, "HikariPool-410");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.isAutoCommit = false;
        boolean boolean13 = hikariConfig1.isRegisterMbeans;
        boolean boolean14 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.maxPoolSize = (short) 10;
        hikariConfig1.acquireRetries = 10;
        java.lang.String str19 = hikariConfig1.transactionIsolationName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay(87L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        int int16 = hikariConfig11.getMaximumPoolSize();
        int int17 = hikariConfig11.transactionIsolation;
        java.util.Properties properties18 = hikariConfig11.dataSourceProperties;
        hikariConfig11.transactionIsolation = (byte) 1;
        hikariConfig11.dataSourceClassName = "";
        boolean boolean23 = hikariConfig11.isJdbc4connectionTest;
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-59", (java.lang.Object) hikariConfig11);
        java.lang.String str27 = hikariConfig11.getCatalog();
        long long28 = hikariConfig11.idleTimeout;
        hikariConfig11.setTransactionIsolation("HikariPool-1252");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig11.setAcquireIncrement(60);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 60L + "'", long28 == 60L);
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        hikariConfig1.idleTimeout = 0L;
        int int10 = hikariConfig1.acquireRetries;
        java.lang.String str11 = hikariConfig1.catalog;
        boolean boolean12 = hikariConfig1.isAutoCommit();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1427";
        hikariConfig1.acquireRetries = 0;
        long long17 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str18 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-1427" + "'", str18, "HikariPool-1427");
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str13 = hikariConfig1.poolName;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-28129" + "'", str13, "HikariPool-28129");
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        hikariConfig13.isInitializationFailFast = true;
        int int19 = hikariConfig13.acquireRetries;
        hikariConfig13.setMaxLifetime((long) (-1));
        int int22 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.maxLifetime = 32L;
        hikariConfig1.addDataSourceProperty("HikariPool-1165", (java.lang.Object) 32L);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-2129";
        hikariConfig1.setMaximumPoolSize(60);
        java.lang.Class<?> wildcardClass30 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        int int8 = hikariConfig1.maxPoolSize;
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        long long10 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        hikariConfig1.transactionIsolationName = "HikariPool-1275";
        long long14 = hikariConfig1.getMaxLifetime();
        long long15 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setCatalog("HikariPool-16329");
        long long18 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(87);
        hikariConfig1.transactionIsolationName = "HikariPool-222";
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        hikariConfig1.idleTimeout = 10;
        hikariConfig1.acquireRetries = (short) -1;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-59");
        hikariConfig1.setDataSourceClassName("HikariPool-834");
        int int20 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties21 = hikariConfig1.getDataSourceProperties();
        int int22 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.minPoolSize = (byte) -1;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        long long21 = hikariConfig16.getIdleTimeout();
        java.lang.String str22 = hikariConfig16.getCatalog();
        java.lang.String str23 = hikariConfig16.getConnectionTestQuery();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig25.dataSourceClassName = "";
        java.util.Properties properties28 = hikariConfig25.dataSourceProperties;
        hikariConfig16.setDataSourceProperties(properties28);
        hikariConfig1.setDataSourceProperties(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig31.maxLifetime = 3;
        hikariConfig31.setPoolName("HikariPool-165");
        hikariConfig31.setMaximumPoolSize(35);
        hikariConfig31.idleTimeout = 52L;
        long long40 = hikariConfig31.maxLifetime;
        hikariConfig31.setConnectionCustomizerClassName("HikariPool-2400");
        boolean boolean43 = hikariConfig31.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60L + "'", long21 == 60L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 3L + "'", long40 == 3L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        long long15 = hikariConfig1.getMaxLifetime();
        int int16 = hikariConfig1.maxPoolSize;
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionInitSql("HikariPool-780");
        java.lang.String str10 = hikariConfig1.getPoolName();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.leakDetectionThreshold = 100;
        boolean boolean15 = hikariConfig12.isJdbc4connectionTest;
        long long16 = hikariConfig12.getIdleTimeout();
        hikariConfig12.setUseInstrumentation(false);
        hikariConfig12.setJdbc4ConnectionTest(false);
        java.util.Properties properties21 = hikariConfig12.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig1.setDataSourceProperties(properties21);
        hikariConfig1.catalog = "HikariPool-1157";
        boolean boolean26 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.connectionTestQuery = "HikariPool-6615";
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-28154" + "'", str10, "HikariPool-28154");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.transactionIsolationName = "HikariPool-707";
        hikariConfig0.transactionIsolationName = "HikariPool-153";
        java.lang.String str9 = hikariConfig0.connectionInitSql;
        int int10 = hikariConfig0.minPoolSize;
        hikariConfig0.maxPoolSize = 1;
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        long long8 = hikariConfig1.getConnectionTimeout();
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        int int10 = hikariConfig1.getMaximumPoolSize();
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionInitSql("HikariPool-2713");
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-2713" + "'", str14, "HikariPool-2713");
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        long long14 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-204");
        hikariConfig1.catalog = "HikariPool-204";
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        hikariConfig1.setInitializationFailFast(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMinimumPoolSize((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "";
        hikariConfig1.setAcquireRetries(0);
        hikariConfig1.setConnectionTestQuery("HikariPool-1040");
        int int13 = hikariConfig1.acquireRetries;
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setDataSourceClassName("HikariPool-21467");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        boolean boolean17 = hikariConfig16.isAutoCommit;
        hikariConfig16.poolName = "hi!";
        hikariConfig16.setTransactionIsolation("hi!");
        long long22 = hikariConfig16.connectionTimeout;
        java.lang.String str23 = hikariConfig16.getPoolName();
        boolean boolean24 = hikariConfig16.isRegisterMbeans;
        boolean boolean25 = hikariConfig16.isRegisterMbeans;
        java.lang.String str26 = hikariConfig16.dataSourceClassName;
        hikariConfig1.addDataSourceProperty("HikariPool-410", (java.lang.Object) hikariConfig16);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer28 = hikariConfig16.connectionCustomizer;
        int int29 = hikariConfig16.getAcquireRetries();
        hikariConfig16.isAutoCommit = true;
        int int32 = hikariConfig16.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(iConnectionCustomizer28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setCatalog("HikariPool-204");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolation = (byte) 100;
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionTimeout(1800000L);
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.dataSourceClassName = "";
        hikariConfig16.connectionTimeout = 10L;
        hikariConfig16.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        hikariConfig24.isInitializationFailFast = true;
        int int30 = hikariConfig24.acquireRetries;
        hikariConfig24.setMaxLifetime((long) (-1));
        int int33 = hikariConfig24.getTransactionIsolation();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        int int36 = hikariConfig35.getTransactionIsolation();
        hikariConfig35.setRegisterMbeans(false);
        java.lang.String str39 = hikariConfig35.transactionIsolationName;
        int int40 = hikariConfig35.getMaximumPoolSize();
        int int41 = hikariConfig35.transactionIsolation;
        java.util.Properties properties42 = hikariConfig35.dataSourceProperties;
        hikariConfig24.setDataSourceProperties(properties42);
        hikariConfig16.setDataSourceProperties(properties42);
        int int45 = hikariConfig16.maxPoolSize;
        hikariConfig1.addDataSourceProperty("HikariPool-6573", (java.lang.Object) hikariConfig16);
        long long47 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 60 + "'", int45 == 60);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1800000L + "'", long47 == 1800000L);
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        long long3 = hikariConfig1.maxLifetime;
        long long4 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setPoolName("");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig0.connectionCustomizer;
        long long8 = hikariConfig0.idleTimeout;
        org.junit.Assert.assertNull(iConnectionCustomizer7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        long long12 = hikariConfig1.connectionTimeout;
        long long13 = hikariConfig1.getConnectionTimeout();
        int int14 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str7 = hikariConfig1.catalog;
        hikariConfig1.isJdbc4connectionTest = false;
        long long10 = hikariConfig1.getMaxLifetime();
        int int11 = hikariConfig1.getMaximumPoolSize();
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        boolean boolean15 = hikariConfig1.isAutoCommit();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        long long6 = hikariConfig1.connectionTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        hikariConfig1.setAcquireRetries((int) (short) 10);
        long long11 = hikariConfig1.getMaxLifetime();
        long long12 = hikariConfig1.maxLifetime;
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str14 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-104");
        long long8 = hikariConfig1.leakDetectionThreshold;
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setIdleTimeout((-1L));
        java.lang.String str12 = hikariConfig1.connectionTestQuery;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource14 = hikariConfig13.dataSource;
        int int15 = hikariConfig13.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig13.connectionCustomizer;
        boolean boolean17 = hikariConfig13.isAutoCommit();
        hikariConfig13.connectionTimeout = 3;
        int int20 = hikariConfig13.acquireRetries;
        javax.sql.DataSource dataSource21 = hikariConfig13.dataSource;
        hikariConfig13.connectionTestQuery = "HikariPool-2487";
        hikariConfig13.setMaxLifetime((long) (byte) 1);
        hikariConfig13.setJdbc4ConnectionTest(true);
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig29.leakDetectionThreshold = 100;
        hikariConfig29.minPoolSize = (byte) 1;
        long long34 = hikariConfig29.getConnectionTimeout();
        int int35 = hikariConfig29.transactionIsolation;
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig37.leakDetectionThreshold = 100;
        hikariConfig37.minPoolSize = (byte) 1;
        hikariConfig37.catalog = "";
        java.util.Properties properties44 = hikariConfig37.getDataSourceProperties();
        hikariConfig29.setDataSourceProperties(properties44);
        hikariConfig13.setDataSourceProperties(properties44);
        hikariConfig1.dataSourceProperties = properties44;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNull(dataSource21);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        java.lang.String str11 = hikariConfig1.getDataSourceClassName();
        long long12 = hikariConfig1.connectionTimeout;
        hikariConfig1.setConnectionTimeout((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.transactionIsolation = (short) 0;
        long long14 = hikariConfig1.idleTimeout;
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.String str17 = hikariConfig1.poolName;
        java.lang.String str18 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-28186" + "'", str17, "HikariPool-28186");
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28186" + "'", str18, "HikariPool-28186");
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.catalog;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        hikariConfig15.connectionTimeout = 10L;
        hikariConfig15.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        hikariConfig23.isInitializationFailFast = true;
        int int29 = hikariConfig23.acquireRetries;
        hikariConfig23.setMaxLifetime((long) (-1));
        int int32 = hikariConfig23.getTransactionIsolation();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        int int39 = hikariConfig34.getMaximumPoolSize();
        int int40 = hikariConfig34.transactionIsolation;
        java.util.Properties properties41 = hikariConfig34.dataSourceProperties;
        hikariConfig23.setDataSourceProperties(properties41);
        hikariConfig15.setDataSourceProperties(properties41);
        hikariConfig1.setDataSourceProperties(properties41);
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        boolean boolean47 = hikariConfig46.isAutoCommit;
        hikariConfig46.poolName = "hi!";
        java.lang.String str50 = hikariConfig46.dataSourceClassName;
        java.lang.String str51 = hikariConfig46.dataSourceClassName;
        hikariConfig46.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer54 = hikariConfig46.connectionCustomizer;
        hikariConfig46.setInitializationFailFast(true);
        int int57 = hikariConfig46.transactionIsolation;
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        hikariConfig59.dataSourceClassName = "";
        java.util.Properties properties62 = hikariConfig59.dataSourceProperties;
        hikariConfig46.setDataSourceProperties(properties62);
        hikariConfig1.setDataSourceProperties(properties62);
        boolean boolean65 = hikariConfig1.isAutoCommit();
        boolean boolean66 = hikariConfig1.isInitializationFailFast();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer67 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer67;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 60 + "'", int39 == 60);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(properties41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(iConnectionCustomizer54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(properties62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-320");
        java.lang.String str13 = hikariConfig1.transactionIsolationName;
        java.lang.String str14 = hikariConfig1.catalog;
        java.lang.String str15 = hikariConfig1.catalog;
        hikariConfig1.setConnectionTimeout(2147483647L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionCustomizerClassName("");
        int int7 = hikariConfig1.getMinimumPoolSize();
        long long8 = hikariConfig1.leakDetectionThreshold;
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        java.lang.String str16 = hikariConfig12.transactionIsolationName;
        int int17 = hikariConfig12.getMaximumPoolSize();
        int int18 = hikariConfig12.transactionIsolation;
        java.util.Properties properties19 = hikariConfig12.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties19);
        int int21 = hikariConfig1.getTransactionIsolation();
        int int22 = hikariConfig1.acquireRetries;
        hikariConfig1.setIdleTimeout((long) '4');
        long long25 = hikariConfig1.maxLifetime;
        hikariConfig1.setCatalog("HikariPool-43");
        int int28 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.connectionInitSql = "HikariPool-9973";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        long long10 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean14 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-489");
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.transactionIsolation = 'a';
        long long21 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 60L + "'", long21 == 60L);
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        long long10 = hikariConfig1.connectionTimeout;
        hikariConfig1.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        hikariConfig1.setMaximumPoolSize(3);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setTransactionIsolation("HikariPool-2097");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.dataSourceClassName = "";
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.connectionTestQuery = "HikariPool-470";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.minPoolSize = 60;
        hikariConfig1.setAutoCommit(false);
        java.lang.String str24 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-10081");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        boolean boolean8 = hikariConfig1.isInitializationFailFast;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setMaximumPoolSize((int) (byte) 1);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-255";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-306");
        hikariConfig1.connectionTestQuery = "HikariPool-306";
        hikariConfig1.setCatalog("HikariPool-142");
        hikariConfig1.setLeakDetectionThreshold((long) (short) 10);
        java.lang.String str19 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-306" + "'", str19, "HikariPool-306");
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setTransactionIsolation("hi!");
        int int16 = hikariConfig11.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig11);
        java.lang.String str18 = hikariConfig1.poolName;
        hikariConfig1.setInitializationFailFast(false);
        long long21 = hikariConfig1.connectionTimeout;
        hikariConfig1.setPoolName("HikariPool-1952");
        hikariConfig1.validate();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28224" + "'", str18, "HikariPool-28224");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setCatalog("HikariPool-204");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.Class<?> wildcardClass10 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        long long1 = hikariConfig0.connectionTimeout;
        int int2 = hikariConfig0.getTransactionIsolation();
        boolean boolean3 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.dataSourceClassName = "HikariPool-1766";
        hikariConfig0.isJdbc4connectionTest = true;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1512");
        java.util.Properties properties10 = hikariConfig0.dataSourceProperties;
        hikariConfig0.setIdleTimeout(100L);
        hikariConfig0.setTransactionIsolation("HikariPool-28007");
// flaky:         org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.connectionInitSql;
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        java.lang.String str12 = hikariConfig1.catalog;
        hikariConfig1.setConnectionTestQuery("HikariPool-2369");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.idleTimeout = '4';
        hikariConfig1.setTransactionIsolation("HikariPool-177");
        int int13 = hikariConfig1.acquireRetries;
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        int int15 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        java.lang.String str9 = hikariConfig1.getPoolName();
        long long10 = hikariConfig1.maxLifetime;
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.minPoolSize = 97;
        hikariConfig1.maxPoolSize = 87;
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setRegisterMbeans(false);
        hikariConfig5.dataSourceClassName = "";
        hikariConfig5.setTransactionIsolation("");
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        hikariConfig14.isInitializationFailFast = true;
        int int20 = hikariConfig14.acquireRetries;
        hikariConfig14.setMaxLifetime((long) (-1));
        int int23 = hikariConfig14.getTransactionIsolation();
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        int int30 = hikariConfig25.getMaximumPoolSize();
        int int31 = hikariConfig25.transactionIsolation;
        java.util.Properties properties32 = hikariConfig25.dataSourceProperties;
        hikariConfig14.setDataSourceProperties(properties32);
        hikariConfig5.dataSourceProperties = properties32;
        hikariConfig1.dataSourceProperties = properties32;
        java.util.Properties properties36 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setIdleTimeout(2147483647L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        int int6 = hikariConfig1.getAcquireIncrement();
        java.lang.String str7 = hikariConfig1.getPoolName();
        hikariConfig1.setLeakDetectionThreshold((-1L));
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.connectionCustomizerClassName = "";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-28241" + "'", str7, "HikariPool-28241");
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.isInitializationFailFast = false;
        long long13 = hikariConfig1.connectionTimeout;
        long long14 = hikariConfig1.getMaxLifetime();
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        java.lang.String str22 = hikariConfig18.transactionIsolationName;
        int int23 = hikariConfig18.getMaximumPoolSize();
        int int24 = hikariConfig18.transactionIsolation;
        java.util.Properties properties25 = hikariConfig18.dataSourceProperties;
        boolean boolean26 = hikariConfig18.isRegisterMbeans;
        javax.sql.DataSource dataSource27 = hikariConfig18.getDataSource();
        hikariConfig18.setMaxLifetime((long) 3);
        hikariConfig1.addDataSourceProperty("HikariPool-531", (java.lang.Object) hikariConfig18);
        hikariConfig18.setAcquireRetries((int) (short) 1);
        long long33 = hikariConfig18.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(dataSource27);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMaxLifetime((long) (short) 1);
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        long long12 = hikariConfig1.getAcquireRetryDelay();
        long long13 = hikariConfig1.getIdleTimeout();
        int int14 = hikariConfig1.getAcquireIncrement();
        int int15 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str12 = hikariConfig1.getCatalog();
        long long13 = hikariConfig1.getMaxLifetime();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isAutoCommit;
        hikariConfig17.poolName = "hi!";
        java.lang.String str21 = hikariConfig17.dataSourceClassName;
        java.lang.String str22 = hikariConfig17.dataSourceClassName;
        hikariConfig17.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer25 = hikariConfig17.connectionCustomizer;
        hikariConfig17.setMaxLifetime((long) (short) 0);
        hikariConfig17.setAcquireRetries(100);
        long long30 = hikariConfig17.getIdleTimeout();
        java.lang.String str31 = hikariConfig17.dataSourceClassName;
        long long32 = hikariConfig17.getMaxLifetime();
        long long33 = hikariConfig17.getLeakDetectionThreshold();
        long long34 = hikariConfig17.idleTimeout;
        long long35 = hikariConfig17.connectionTimeout;
        java.util.Properties properties36 = hikariConfig17.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        hikariConfig1.dataSourceProperties = properties36;
        long long39 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(iConnectionCustomizer25);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60L + "'", long30 == 60L);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 60L + "'", long34 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 10L + "'", long35 == 10L);
        org.junit.Assert.assertNotNull(properties36);
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 60L + "'", long39 == 60L);
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.String str15 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setAutoCommit(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer18;
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.dataSource = dataSource20;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setDataSourceClassName("HikariPool-517");
        hikariConfig1.setCatalog("HikariPool-260");
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.idleTimeout = 0L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-204");
        hikariConfig1.catalog = "HikariPool-204";
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        int int15 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        long long11 = hikariConfig1.getIdleTimeout();
        java.lang.String str12 = hikariConfig1.poolName;
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-28259" + "'", str12, "HikariPool-28259");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-204" + "'", str13, "HikariPool-204");
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        int int13 = hikariConfig1.transactionIsolation;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setConnectionTestQuery("HikariPool-306");
        hikariConfig1.connectionInitSql = "HikariPool-11579";
        hikariConfig1.transactionIsolation = (-1);
        boolean boolean21 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 32L;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-104";
        boolean boolean7 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.maxLifetime = 'a';
        long long10 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.connectionCustomizer;
        java.lang.String str14 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-28275" + "'", str14, "HikariPool-28275");
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        java.lang.String str10 = hikariConfig9.connectionCustomizerClassName;
        long long11 = hikariConfig9.getAcquireRetryDelay();
        hikariConfig9.setLeakDetectionThreshold((long) (short) -1);
        hikariConfig9.dataSourceClassName = "";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setLeakDetectionThreshold((-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str11 = hikariConfig1.getPoolName();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.setRegisterMbeans(false);
        hikariConfig15.dataSourceClassName = "";
        hikariConfig15.isAutoCommit = true;
        hikariConfig15.setLeakDetectionThreshold(1L);
        long long25 = hikariConfig15.connectionTimeout;
        hikariConfig1.addDataSourceProperty("HikariPool-119", (java.lang.Object) long25);
        hikariConfig1.setMaxLifetime(2147483647L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-28286" + "'", str11, "HikariPool-28286");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.setConnectionTestQuery("HikariPool-3244");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setConnectionInitSql("HikariPool-22991");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer11);
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setConnectionInitSql("HikariPool-521");
        hikariConfig1.setLeakDetectionThreshold((long) (-1));
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig1.poolName;
        hikariConfig1.connectionTestQuery = "HikariPool-400";
        hikariConfig1.setMaxLifetime((long) 1);
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.leakDetectionThreshold = 100;
        hikariConfig22.connectionInitSql = "hi!";
        hikariConfig22.maxPoolSize = (short) -1;
        java.lang.String str29 = hikariConfig22.getPoolName();
        hikariConfig22.leakDetectionThreshold = 100;
        boolean boolean32 = hikariConfig22.isRegisterMbeans();
        boolean boolean33 = hikariConfig22.isJdbc4connectionTest;
        long long34 = hikariConfig22.getConnectionTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-5140", (java.lang.Object) hikariConfig22);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-28295" + "'", str15, "HikariPool-28295");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-28296" + "'", str29, "HikariPool-28296");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        java.lang.String str12 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.dataSourceClassName = "HikariPool-1172";
        hikariConfig1.leakDetectionThreshold = 0L;
        long long17 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        int int7 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.idleTimeout = 97;
        java.lang.String str11 = hikariConfig1.catalog;
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-3437";
        long long15 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig6.setDataSourceClassName("");
        hikariConfig6.validate();
        long long10 = hikariConfig6.getLeakDetectionThreshold();
        hikariConfig6.setIdleTimeout((long) '4');
        java.lang.String str13 = hikariConfig6.connectionCustomizerClassName;
        java.util.Properties properties14 = hikariConfig6.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig1.dataSourceProperties = properties14;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        int int9 = hikariConfig1.getMaximumPoolSize();
        long long10 = hikariConfig1.getMaxLifetime();
        int int11 = hikariConfig1.getTransactionIsolation();
        int int12 = hikariConfig1.getMaximumPoolSize();
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        java.lang.String str8 = hikariConfig1.getPoolName();
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        boolean boolean10 = hikariConfig1.isRegisterMbeans;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        boolean boolean12 = hikariConfig1.isAutoCommit;
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.dataSourceClassName = "";
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.connectionTestQuery = "HikariPool-470";
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str22 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setDataSourceClassName("HikariPool-1372");
        javax.sql.DataSource dataSource25 = null;
        hikariConfig1.dataSource = dataSource25;
        boolean boolean27 = hikariConfig1.isAutoCommit;
        java.lang.String str28 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-1372" + "'", str28, "HikariPool-1372");
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isAutoCommit();
        long long10 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setConnectionInitSql("hi!");
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        hikariConfig16.dataSourceClassName = "";
        hikariConfig16.setTransactionIsolation("");
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        hikariConfig25.isInitializationFailFast = true;
        int int31 = hikariConfig25.acquireRetries;
        hikariConfig25.setMaxLifetime((long) (-1));
        int int34 = hikariConfig25.getTransactionIsolation();
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        int int37 = hikariConfig36.getTransactionIsolation();
        hikariConfig36.setRegisterMbeans(false);
        java.lang.String str40 = hikariConfig36.transactionIsolationName;
        int int41 = hikariConfig36.getMaximumPoolSize();
        int int42 = hikariConfig36.transactionIsolation;
        java.util.Properties properties43 = hikariConfig36.dataSourceProperties;
        hikariConfig25.setDataSourceProperties(properties43);
        hikariConfig16.dataSourceProperties = properties43;
        hikariConfig12.dataSourceProperties = properties43;
        hikariConfig1.dataSourceProperties = properties43;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties43);
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 60 + "'", int41 == 60);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.poolName = "HikariPool-472";
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.dataSourceClassName = "HikariPool-320";
        hikariConfig1.setDataSourceClassName("HikariPool-25378");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.maxPoolSize = 0;
        hikariConfig1.transactionIsolation = (byte) 0;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.acquireRetries = 32;
        hikariConfig0.transactionIsolation = 'a';
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer14;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig6.transactionIsolationName;
        long long11 = hikariConfig6.getIdleTimeout();
        java.lang.String str12 = hikariConfig6.getCatalog();
        java.lang.String str13 = hikariConfig6.getConnectionTestQuery();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        java.util.Properties properties18 = hikariConfig15.dataSourceProperties;
        hikariConfig6.setDataSourceProperties(properties18);
        hikariConfig1.dataSourceProperties = properties18;
        java.lang.String str21 = hikariConfig1.poolName;
        hikariConfig1.setLeakDetectionThreshold(5000L);
        hikariConfig1.setConnectionTestQuery("HikariPool-164");
        java.lang.String str26 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-28344" + "'", str21, "HikariPool-28344");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setCatalog("HikariPool-292");
        int int11 = hikariConfig1.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer12 = hikariConfig1.connectionCustomizer;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.dataSourceClassName = "hi!";
        hikariConfig1.transactionIsolationName = "HikariPool-3038";
        boolean boolean15 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.minPoolSize = (short) 1;
        hikariConfig1.isJdbc4connectionTest = false;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        int int15 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig17.transactionIsolationName;
        int int22 = hikariConfig17.getMaximumPoolSize();
        int int23 = hikariConfig17.transactionIsolation;
        java.util.Properties properties24 = hikariConfig17.dataSourceProperties;
        boolean boolean25 = hikariConfig17.isRegisterMbeans;
        javax.sql.DataSource dataSource26 = hikariConfig17.getDataSource();
        hikariConfig17.setMaxLifetime((long) 3);
        boolean boolean29 = hikariConfig17.isInitializationFailFast();
        int int30 = hikariConfig17.acquireRetries;
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        boolean boolean33 = hikariConfig32.isAutoCommit;
        hikariConfig32.poolName = "hi!";
        java.lang.String str36 = hikariConfig32.dataSourceClassName;
        java.lang.String str37 = hikariConfig32.dataSourceClassName;
        hikariConfig32.setJdbc4ConnectionTest(false);
        int int40 = hikariConfig32.maxPoolSize;
        hikariConfig32.idleTimeout = (byte) -1;
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        int int45 = hikariConfig44.getTransactionIsolation();
        hikariConfig44.setRegisterMbeans(false);
        hikariConfig44.dataSourceClassName = "";
        hikariConfig44.setTransactionIsolation("");
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        int int54 = hikariConfig53.getTransactionIsolation();
        hikariConfig53.setRegisterMbeans(false);
        hikariConfig53.isInitializationFailFast = true;
        int int59 = hikariConfig53.acquireRetries;
        hikariConfig53.setMaxLifetime((long) (-1));
        int int62 = hikariConfig53.getTransactionIsolation();
        java.util.Properties properties63 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties63);
        int int65 = hikariConfig64.getTransactionIsolation();
        hikariConfig64.setRegisterMbeans(false);
        java.lang.String str68 = hikariConfig64.transactionIsolationName;
        int int69 = hikariConfig64.getMaximumPoolSize();
        int int70 = hikariConfig64.transactionIsolation;
        java.util.Properties properties71 = hikariConfig64.dataSourceProperties;
        hikariConfig53.setDataSourceProperties(properties71);
        hikariConfig44.dataSourceProperties = properties71;
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties71);
        hikariConfig32.dataSourceProperties = properties71;
        hikariConfig17.setDataSourceProperties(properties71);
        boolean boolean77 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.poolName = "HikariPool-410";
        hikariConfig17.dataSourceClassName = "HikariPool-26";
        hikariConfig17.setMaxLifetime((long) (short) 1);
        hikariConfig17.setConnectionCustomizerClassName("HikariPool-21");
        int int86 = hikariConfig17.getMaximumPoolSize();
        java.util.Properties properties87 = hikariConfig17.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(dataSource26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 60 + "'", int69 == 60);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(properties71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 60 + "'", int86 == 60);
        org.junit.Assert.assertNotNull(properties87);
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.catalog;
        hikariConfig1.connectionTestQuery = "HikariPool-68";
        hikariConfig1.catalog = "HikariPool-489";
        long long18 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        java.lang.String str8 = hikariConfig1.transactionIsolationName;
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.transactionIsolationName = "HikariPool-355";
        hikariConfig1.setMaximumPoolSize((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.leakDetectionThreshold = 100;
        hikariConfig8.minPoolSize = (byte) 1;
        hikariConfig8.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig8.connectionCustomizer;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.dataSourceClassName = "";
        hikariConfig17.setTransactionIsolation("");
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        hikariConfig26.isInitializationFailFast = true;
        int int32 = hikariConfig26.acquireRetries;
        hikariConfig26.setMaxLifetime((long) (-1));
        int int35 = hikariConfig26.getTransactionIsolation();
        java.util.Properties properties36 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        int int38 = hikariConfig37.getTransactionIsolation();
        hikariConfig37.setRegisterMbeans(false);
        java.lang.String str41 = hikariConfig37.transactionIsolationName;
        int int42 = hikariConfig37.getMaximumPoolSize();
        int int43 = hikariConfig37.transactionIsolation;
        java.util.Properties properties44 = hikariConfig37.dataSourceProperties;
        hikariConfig26.setDataSourceProperties(properties44);
        hikariConfig17.dataSourceProperties = properties44;
        com.zaxxer.hikari.HikariConfig hikariConfig47 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig8.dataSourceProperties = properties44;
        boolean boolean49 = hikariConfig8.isInitializationFailFast();
        boolean boolean50 = hikariConfig8.isInitializationFailFast;
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig52.setConnectionInitSql("hi!");
        long long55 = hikariConfig52.getLeakDetectionThreshold();
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        int int58 = hikariConfig57.getTransactionIsolation();
        hikariConfig57.setRegisterMbeans(false);
        java.lang.String str61 = hikariConfig57.transactionIsolationName;
        int int62 = hikariConfig57.getMaximumPoolSize();
        int int63 = hikariConfig57.transactionIsolation;
        java.util.Properties properties64 = hikariConfig57.dataSourceProperties;
        hikariConfig52.dataSourceProperties = properties64;
        java.util.Properties properties66 = hikariConfig52.getDataSourceProperties();
        hikariConfig8.dataSourceProperties = properties66;
        hikariConfig1.dataSourceProperties = properties66;
        int int69 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-69";
        hikariConfig1.connectionTimeout = (short) 1;
        int int74 = hikariConfig1.getAcquireIncrement();
        int int75 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 60 + "'", int62 == 60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(properties64);
        org.junit.Assert.assertNotNull(properties66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setAcquireRetries(100);
        long long14 = hikariConfig1.getIdleTimeout();
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionInitSql = "HikariPool-461";
        long long18 = hikariConfig1.maxLifetime;
        int int19 = hikariConfig1.transactionIsolation;
        hikariConfig1.connectionInitSql = "HikariPool-1973";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.getCatalog();
        java.util.Properties properties6 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        long long8 = hikariConfig7.getIdleTimeout();
        int int9 = hikariConfig7.acquireRetries;
        long long10 = hikariConfig7.getConnectionTimeout();
        hikariConfig7.minPoolSize = (byte) 10;
        java.lang.String str13 = hikariConfig7.connectionTestQuery;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.setRegisterMbeans(false);
        java.lang.String str19 = hikariConfig15.transactionIsolationName;
        int int20 = hikariConfig15.transactionIsolation;
        javax.sql.DataSource dataSource21 = null;
        hikariConfig15.dataSource = dataSource21;
        long long23 = hikariConfig15.maxLifetime;
        hikariConfig15.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties26 = hikariConfig15.getDataSourceProperties();
        hikariConfig7.dataSourceProperties = properties26;
        hikariConfig1.setDataSourceProperties(properties26);
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 35L + "'", long23 == 35L);
        org.junit.Assert.assertNotNull(properties26);
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        long long10 = hikariConfig1.maxLifetime;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        hikariConfig1.catalog = "HikariPool-2358";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.transactionIsolation = 100;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setCatalog("HikariPool-373");
        hikariConfig1.connectionCustomizerClassName = "HikariPool-320";
        hikariConfig1.idleTimeout = 1;
        java.lang.String str24 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        int int16 = hikariConfig11.getMaximumPoolSize();
        int int17 = hikariConfig11.transactionIsolation;
        java.util.Properties properties18 = hikariConfig11.dataSourceProperties;
        hikariConfig11.transactionIsolation = (byte) 1;
        hikariConfig11.dataSourceClassName = "";
        boolean boolean23 = hikariConfig11.isJdbc4connectionTest;
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-59", (java.lang.Object) hikariConfig11);
        hikariConfig1.acquireRetries = 0;
        hikariConfig1.setIdleTimeout((long) (short) 1);
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setPoolName("");
        java.lang.String str37 = hikariConfig1.connectionCustomizerClassName;
        int int38 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxPoolSize = 35;
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        hikariConfig1.maxPoolSize = (-1);
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-4161";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        java.lang.String str13 = hikariConfig1.getCatalog();
        hikariConfig1.isInitializationFailFast = false;
        java.lang.String str16 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        hikariConfig1.setIdleTimeout((long) (-1));
        hikariConfig1.setDataSourceClassName("HikariPool-249");
        hikariConfig1.isJdbc4connectionTest = false;
        long long16 = hikariConfig1.getIdleTimeout();
        hikariConfig1.dataSourceClassName = "HikariPool-1301";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) 3);
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setDataSourceClassName("HikariPool-98");
        hikariConfig1.setConnectionTestQuery("HikariPool-522");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setUseInstrumentation(false);
        int int11 = hikariConfig1.transactionIsolation;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        boolean boolean16 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.connectionTestQuery = "HikariPool-613";
        int int19 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        java.lang.String str4 = hikariConfig0.getPoolName();
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HikariPool-28406" + "'", str4, "HikariPool-28406");
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setJdbc4ConnectionTest(false);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        long long13 = hikariConfig1.maxLifetime;
        hikariConfig1.setTransactionIsolation("HikariPool-2377");
        java.lang.String str16 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.dataSourceClassName = "";
        java.util.Properties properties13 = hikariConfig10.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties13);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.dataSourceClassName = "HikariPool-25462";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.idleTimeout = (-1);
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.maxLifetime = 3L;
        boolean boolean18 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIdleTimeout((long) (short) 1);
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        java.lang.String str27 = hikariConfig23.transactionIsolationName;
        int int28 = hikariConfig23.transactionIsolation;
        java.lang.String str29 = hikariConfig23.getConnectionInitSql();
        int int30 = hikariConfig23.getMaximumPoolSize();
        hikariConfig23.setJdbc4ConnectionTest(false);
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        int int36 = hikariConfig35.getTransactionIsolation();
        hikariConfig35.setRegisterMbeans(false);
        java.lang.String str39 = hikariConfig35.transactionIsolationName;
        long long40 = hikariConfig35.getIdleTimeout();
        java.lang.String str41 = hikariConfig35.getCatalog();
        java.util.Properties properties42 = hikariConfig35.getDataSourceProperties();
        hikariConfig35.setUseInstrumentation(false);
        hikariConfig23.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig35);
        hikariConfig23.poolName = "HikariPool-104";
        int int48 = hikariConfig23.transactionIsolation;
        java.util.Properties properties49 = hikariConfig23.getDataSourceProperties();
        hikariConfig23.setConnectionInitSql("HikariPool-6626");
        hikariConfig1.addDataSourceProperty("HikariPool-2020", (java.lang.Object) hikariConfig23);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-28411" + "'", str11, "HikariPool-28411");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(str39);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 60L + "'", long40 == 60L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(properties49);
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("hi!");
        long long14 = hikariConfig11.getLeakDetectionThreshold();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.getMaximumPoolSize();
        int int22 = hikariConfig16.transactionIsolation;
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties23;
        java.util.Properties properties25 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-489", (java.lang.Object) hikariConfig11);
        hikariConfig11.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = hikariConfig11.connectionCustomizer;
        long long30 = hikariConfig11.getMaxLifetime();
        hikariConfig11.setDataSourceClassName("HikariPool-105");
        hikariConfig11.transactionIsolationName = "HikariPool-657";
        hikariConfig11.setMaxLifetime(5000L);
        java.lang.String str37 = hikariConfig11.getPoolName();
        hikariConfig11.leakDetectionThreshold = 'a';
        int int40 = hikariConfig11.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(iConnectionCustomizer29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 35L + "'", long30 == 35L);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HikariPool-28416" + "'", str37, "HikariPool-28416");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.leakDetectionThreshold = (byte) 10;
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str18 = hikariConfig1.getCatalog();
        hikariConfig1.transactionIsolationName = "HikariPool-2047";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        long long6 = hikariConfig1.connectionTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        hikariConfig1.setAcquireRetries((int) (short) 10);
        long long11 = hikariConfig1.getMaxLifetime();
        long long12 = hikariConfig1.maxLifetime;
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        int int17 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-204");
        hikariConfig1.isAutoCommit = true;
        boolean boolean13 = hikariConfig1.isInitializationFailFast;
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        boolean boolean5 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setConnectionTestQuery("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        hikariConfig1.idleTimeout = 60;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        java.lang.String str12 = hikariConfig1.catalog;
        hikariConfig1.minPoolSize = (short) 0;
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.poolName = "HikariPool-312";
        boolean boolean5 = hikariConfig0.isAutoCommit;
        hikariConfig0.validate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.isRegisterMbeans = true;
        java.lang.String str8 = hikariConfig1.catalog;
        java.lang.String str9 = hikariConfig1.getPoolName();
        hikariConfig1.setConnectionTimeout(0L);
        long long12 = hikariConfig1.connectionTimeout;
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setDataSourceClassName("HikariPool-465");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-28425" + "'", str9, "HikariPool-28425");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2147483647L + "'", long12 == 2147483647L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        long long7 = hikariConfig1.getConnectionTimeout();
        long long8 = hikariConfig1.getMaxLifetime();
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        hikariConfig1.catalog = "HikariPool-391";
        hikariConfig1.minPoolSize = (short) 10;
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        int int5 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.isAutoCommit = false;
        hikariConfig0.catalog = "HikariPool-823";
        hikariConfig0.isRegisterMbeans = true;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-354";
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.maxLifetime = '#';
        java.lang.String str11 = hikariConfig1.catalog;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionInitSql("HikariPool-981");
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(true);
        int int13 = hikariConfig1.transactionIsolation;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setConnectionTestQuery("HikariPool-306");
        hikariConfig1.connectionTimeout = 60L;
        hikariConfig1.setDataSourceClassName("HikariPool-461");
        hikariConfig1.connectionTestQuery = "HikariPool-1734";
        int int23 = hikariConfig1.getAcquireIncrement();
        java.lang.String str24 = hikariConfig1.dataSourceClassName;
        hikariConfig1.poolName = "HikariPool-333";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-461" + "'", str24, "HikariPool-461");
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        int int7 = hikariConfig6.getTransactionIsolation();
        hikariConfig6.setRegisterMbeans(false);
        java.lang.String str10 = hikariConfig6.transactionIsolationName;
        long long11 = hikariConfig6.getIdleTimeout();
        java.lang.String str12 = hikariConfig6.getCatalog();
        java.lang.String str13 = hikariConfig6.getConnectionTestQuery();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig15.dataSourceClassName = "";
        java.util.Properties properties18 = hikariConfig15.dataSourceProperties;
        hikariConfig6.setDataSourceProperties(properties18);
        hikariConfig1.dataSourceProperties = properties18;
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str23 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.transactionIsolationName = "HikariPool-90";
        hikariConfig1.isRegisterMbeans = true;
        int int28 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setInitializationFailFast(true);
        int int12 = hikariConfig1.transactionIsolation;
        long long13 = hikariConfig1.idleTimeout;
        long long14 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setCatalog("HikariPool-1049");
        hikariConfig1.maxPoolSize = 1;
        javax.sql.DataSource dataSource19 = null;
        hikariConfig1.setDataSource(dataSource19);
        boolean boolean21 = hikariConfig1.isAutoCommit;
        hikariConfig1.isRegisterMbeans = false;
        java.lang.String str24 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        hikariConfig10.dataSourceClassName = "";
        hikariConfig10.setTransactionIsolation("");
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.setRegisterMbeans(false);
        hikariConfig19.isInitializationFailFast = true;
        int int25 = hikariConfig19.acquireRetries;
        hikariConfig19.setMaxLifetime((long) (-1));
        int int28 = hikariConfig19.getTransactionIsolation();
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setRegisterMbeans(false);
        java.lang.String str34 = hikariConfig30.transactionIsolationName;
        int int35 = hikariConfig30.getMaximumPoolSize();
        int int36 = hikariConfig30.transactionIsolation;
        java.util.Properties properties37 = hikariConfig30.dataSourceProperties;
        hikariConfig19.setDataSourceProperties(properties37);
        hikariConfig10.dataSourceProperties = properties37;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties37);
        hikariConfig1.dataSourceProperties = properties37;
        boolean boolean42 = hikariConfig1.isInitializationFailFast();
        boolean boolean43 = hikariConfig1.isInitializationFailFast;
        long long44 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str45 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties47 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig48 = new com.zaxxer.hikari.HikariConfig(properties47);
        hikariConfig48.leakDetectionThreshold = 100;
        hikariConfig48.setTransactionIsolation("hi!");
        int int53 = hikariConfig48.getMaximumPoolSize();
        hikariConfig48.isInitializationFailFast = true;
        int int56 = hikariConfig48.maxPoolSize;
        java.lang.String str57 = hikariConfig48.connectionInitSql;
        hikariConfig48.idleTimeout = 100L;
        hikariConfig48.catalog = "HikariPool-320";
        hikariConfig1.addDataSourceProperty("HikariPool-220", (java.lang.Object) hikariConfig48);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer63 = null;
        hikariConfig48.connectionCustomizer = iConnectionCustomizer63;
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 60 + "'", int53 == 60);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 60 + "'", int56 == 60);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        boolean boolean7 = hikariConfig1.isRegisterMbeans;
        boolean boolean8 = hikariConfig1.isAutoCommit;
        hikariConfig1.setDataSourceClassName("HikariPool-3774");
        java.lang.String str11 = hikariConfig1.catalog;
        hikariConfig1.transactionIsolation = (byte) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        long long9 = hikariConfig1.getAcquireRetryDelay();
        long long10 = hikariConfig1.getMaxLifetime();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        long long12 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource13 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionTimeout = 60L;
        hikariConfig1.setDataSourceClassName("HikariPool-3334");
        hikariConfig1.setPoolName("HikariPool-62");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        int int8 = hikariConfig1.transactionIsolation;
        int int9 = hikariConfig1.maxPoolSize;
        long long10 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str11 = hikariConfig1.getPoolName();
        boolean boolean12 = hikariConfig1.isInitializationFailFast;
        java.lang.String str13 = hikariConfig1.poolName;
        boolean boolean14 = hikariConfig1.isAutoCommit();
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-28454" + "'", str11, "HikariPool-28454");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-28454" + "'", str13, "HikariPool-28454");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        hikariConfig1.setAcquireRetries(100);
        long long14 = hikariConfig1.getIdleTimeout();
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setPoolName("HikariPool-222");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer18;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.catalog = "HikariPool-200";
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        java.lang.String str17 = hikariConfig1.getCatalog();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-200" + "'", str17, "HikariPool-200");
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getAcquireRetries();
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.connectionTestQuery = "HikariPool-472";
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-7104");
        boolean boolean10 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(87);
        hikariConfig1.transactionIsolationName = "HikariPool-222";
        hikariConfig1.setAutoCommit(false);
        java.lang.String str13 = hikariConfig1.getPoolName();
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMinimumPoolSize((int) '#');
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getTransactionIsolation();
        java.lang.String str21 = hikariConfig19.getConnectionTestQuery();
        hikariConfig19.setIdleTimeout((long) 87);
        hikariConfig19.setConnectionInitSql("HikariPool-114");
        hikariConfig19.poolName = "HikariPool-93";
        long long28 = hikariConfig19.connectionTimeout;
        hikariConfig19.isAutoCommit = true;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = hikariConfig19.connectionCustomizer;
        int int32 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.isInitializationFailFast = false;
        java.lang.String str35 = hikariConfig19.getConnectionTestQuery();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.addDataSourceProperty("HikariPool-27100", (java.lang.Object) str35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-28458" + "'", str13, "HikariPool-28458");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNull(iConnectionCustomizer31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.connectionInitSql = "";
        hikariConfig1.setAutoCommit(true);
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.catalog = "HikariPool-69";
        long long20 = hikariConfig1.idleTimeout;
        int int21 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60L + "'", long20 == 60L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        hikariConfig0.transactionIsolation = (short) 100;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.dataSourceClassName = "";
        hikariConfig10.connectionTimeout = 10L;
        hikariConfig10.connectionTestQuery = "HikariPool-104";
        int int17 = hikariConfig10.transactionIsolation;
        hikariConfig10.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig10.poolName;
        hikariConfig0.addDataSourceProperty("HikariPool-81", (java.lang.Object) hikariConfig10);
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        int int24 = hikariConfig23.getTransactionIsolation();
        hikariConfig23.setRegisterMbeans(false);
        java.lang.String str27 = hikariConfig23.transactionIsolationName;
        int int28 = hikariConfig23.transactionIsolation;
        java.lang.String str29 = hikariConfig23.getConnectionInitSql();
        hikariConfig23.isAutoCommit = true;
        java.util.Properties properties32 = hikariConfig23.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties32);
        hikariConfig10.setDataSourceProperties(properties32);
        hikariConfig10.isAutoCommit = true;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer37 = null;
        hikariConfig10.connectionCustomizer = iConnectionCustomizer37;
        hikariConfig10.setTransactionIsolation("HikariPool-10723");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-28463" + "'", str1, "HikariPool-28463");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-28464" + "'", str20, "HikariPool-28464");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setTransactionIsolation("hi!");
        int int16 = hikariConfig11.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig11);
        hikariConfig11.connectionInitSql = "HikariPool-222";
        int int20 = hikariConfig11.getAcquireIncrement();
        hikariConfig11.setMinimumPoolSize(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        hikariConfig1.setCatalog("HikariPool-6");
        hikariConfig1.connectionInitSql = "HikariPool-470";
        hikariConfig1.connectionTimeout = (short) 100;
        hikariConfig1.maxLifetime = 97L;
        int int19 = hikariConfig1.getAcquireRetries();
        hikariConfig1.transactionIsolationName = "HikariPool-2644";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        boolean boolean7 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTimeout = 10L;
        int int10 = hikariConfig1.acquireRetries;
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionTestQuery = "HikariPool-173";
        hikariConfig1.setMaximumPoolSize(0);
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setRegisterMbeans(true);
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAcquireRetries((int) (byte) 0);
        java.lang.String str21 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setIdleTimeout((long) 87);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1192");
        hikariConfig1.setMinimumPoolSize(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        boolean boolean9 = hikariConfig1.isRegisterMbeans;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        hikariConfig1.setMaxLifetime((long) 3);
        hikariConfig1.transactionIsolationName = "HikariPool-2024";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        int int6 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.minPoolSize = (short) 10;
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.acquireRetries = (short) 100;
        long long12 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean13 = hikariConfig1.isInitializationFailFast();
        int int14 = hikariConfig1.getAcquireRetries();
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        java.lang.String str16 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.leakDetectionThreshold = 100;
        hikariConfig11.setTransactionIsolation("hi!");
        int int16 = hikariConfig11.getMaximumPoolSize();
        hikariConfig1.addDataSourceProperty("HikariPool-249", (java.lang.Object) hikariConfig11);
        java.lang.String str18 = hikariConfig1.poolName;
        hikariConfig1.setInitializationFailFast(false);
        long long21 = hikariConfig1.connectionTimeout;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        boolean boolean25 = hikariConfig24.isAutoCommit;
        hikariConfig24.poolName = "hi!";
        java.lang.String str28 = hikariConfig24.dataSourceClassName;
        java.lang.String str29 = hikariConfig24.dataSourceClassName;
        hikariConfig24.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer32 = hikariConfig24.connectionCustomizer;
        hikariConfig24.setMaxLifetime((long) (short) 0);
        hikariConfig24.setAcquireRetries(100);
        long long37 = hikariConfig24.getIdleTimeout();
        java.lang.String str38 = hikariConfig24.dataSourceClassName;
        long long39 = hikariConfig24.getMaxLifetime();
        hikariConfig24.setInitializationFailFast(false);
        hikariConfig1.addDataSourceProperty("HikariPool-144", (java.lang.Object) hikariConfig24);
        hikariConfig1.setPoolName("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-28484" + "'", str18, "HikariPool-28484");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(iConnectionCustomizer32);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60L + "'", long37 == 60L);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str10 = hikariConfig1.getCatalog();
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.setDataSourceClassName("HikariPool-15133");
        java.lang.String str14 = hikariConfig1.poolName;
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-28490" + "'", str11, "HikariPool-28490");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-28490" + "'", str14, "HikariPool-28490");
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setLeakDetectionThreshold(0L);
        long long12 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        boolean boolean14 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        long long10 = hikariConfig1.getMaxLifetime();
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        hikariConfig1.transactionIsolationName = "HikariPool-2914";
        int int14 = hikariConfig1.acquireRetries;
        int int15 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setAcquireRetries(1);
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-248");
        boolean boolean15 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.acquireRetries = 0;
        java.util.Properties properties18 = hikariConfig1.dataSourceProperties;
        java.lang.String str19 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-248" + "'", str19, "HikariPool-248");
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.maxLifetime = '#';
        int int11 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.isAutoCommit = false;
        java.lang.String str16 = hikariConfig1.dataSourceClassName;
        hikariConfig1.catalog = "HikariPool-4124";
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(dataSource12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        int int16 = hikariConfig11.getMaximumPoolSize();
        int int17 = hikariConfig11.transactionIsolation;
        java.util.Properties properties18 = hikariConfig11.dataSourceProperties;
        hikariConfig11.transactionIsolation = (byte) 1;
        hikariConfig11.dataSourceClassName = "";
        boolean boolean23 = hikariConfig11.isJdbc4connectionTest;
        hikariConfig11.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-59", (java.lang.Object) hikariConfig11);
        java.lang.String str27 = hikariConfig11.getCatalog();
        boolean boolean28 = hikariConfig11.isJdbc4connectionTest;
        java.lang.String str29 = hikariConfig11.dataSourceClassName;
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        int int12 = hikariConfig1.maxPoolSize;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-852";
        java.lang.String str15 = hikariConfig1.getPoolName();
        hikariConfig1.setInitializationFailFast(false);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.lang.String str8 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.dataSourceClassName = "";
        java.util.Properties properties13 = hikariConfig10.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties13);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        hikariConfig1.idleTimeout = 'a';
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        java.lang.String str19 = hikariConfig1.poolName;
        int int20 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMinimumPoolSize(87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-28522" + "'", str19, "HikariPool-28522");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.poolName = "HikariPool-215";
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setRegisterMbeans(false);
        hikariConfig9.isInitializationFailFast = true;
        int int15 = hikariConfig9.acquireRetries;
        hikariConfig9.setMaxLifetime((long) (-1));
        int int18 = hikariConfig9.getTransactionIsolation();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        int int25 = hikariConfig20.getMaximumPoolSize();
        int int26 = hikariConfig20.transactionIsolation;
        java.util.Properties properties27 = hikariConfig20.dataSourceProperties;
        hikariConfig9.setDataSourceProperties(properties27);
        hikariConfig1.setDataSourceProperties(properties27);
        int int30 = hikariConfig1.maxPoolSize;
        hikariConfig1.setAcquireRetries(97);
        hikariConfig1.dataSourceClassName = "HikariPool-502";
        int int35 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.minPoolSize;
        int int10 = hikariConfig1.minPoolSize;
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.dataSourceClassName = "HikariPool-197";
        hikariConfig1.connectionInitSql = "HikariPool-854";
        hikariConfig1.setConnectionInitSql("HikariPool-6340");
        int int21 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        int int9 = hikariConfig1.maxPoolSize;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        hikariConfig1.leakDetectionThreshold = 10;
        hikariConfig1.setPoolName("HikariPool-3987");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        long long11 = hikariConfig1.maxLifetime;
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        java.lang.String str18 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("hi!");
        long long14 = hikariConfig11.getLeakDetectionThreshold();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.getMaximumPoolSize();
        int int22 = hikariConfig16.transactionIsolation;
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties23;
        java.util.Properties properties25 = hikariConfig11.getDataSourceProperties();
        hikariConfig1.addDataSourceProperty("HikariPool-489", (java.lang.Object) hikariConfig11);
        hikariConfig11.setAcquireRetries(1);
        javax.sql.DataSource dataSource29 = hikariConfig11.getDataSource();
        java.lang.String str30 = hikariConfig11.connectionTestQuery;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer31 = null;
        hikariConfig11.connectionCustomizer = iConnectionCustomizer31;
        boolean boolean33 = hikariConfig11.isJdbc4ConnectionTest();
        boolean boolean34 = hikariConfig11.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(dataSource29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        int int6 = hikariConfig1.getAcquireRetries();
        int int7 = hikariConfig1.getAcquireIncrement();
        long long8 = hikariConfig1.maxLifetime;
        int int9 = hikariConfig1.transactionIsolation;
        int int10 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str11 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        java.lang.String str6 = hikariConfig1.getPoolName();
        boolean boolean7 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.dataSourceClassName = "HikariPool-127";
        hikariConfig1.transactionIsolation = (-1);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-5227");
        long long15 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-28537" + "'", str6, "HikariPool-28537");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setRegisterMbeans(false);
        hikariConfig9.isInitializationFailFast = true;
        int int15 = hikariConfig9.acquireRetries;
        hikariConfig9.setMaxLifetime((long) (-1));
        int int18 = hikariConfig9.getTransactionIsolation();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        int int25 = hikariConfig20.getMaximumPoolSize();
        int int26 = hikariConfig20.transactionIsolation;
        java.util.Properties properties27 = hikariConfig20.dataSourceProperties;
        hikariConfig9.setDataSourceProperties(properties27);
        hikariConfig1.setDataSourceProperties(properties27);
        int int30 = hikariConfig1.maxPoolSize;
        hikariConfig1.maxPoolSize = 10;
        boolean boolean33 = hikariConfig1.isJdbc4ConnectionTest();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer34 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer34;
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.idleTimeout = (byte) 0;
        java.lang.String str40 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionTestQuery("HikariPool-8351");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-320");
        hikariConfig1.transactionIsolationName = "HikariPool-173";
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        int int17 = hikariConfig1.maxPoolSize;
        hikariConfig1.catalog = "HikariPool-5251";
        hikariConfig1.transactionIsolation = (short) 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.setConnectionInitSql("HikariPool-756");
        boolean boolean9 = hikariConfig1.isAutoCommit;
        boolean boolean10 = hikariConfig1.isAutoCommit;
        hikariConfig1.transactionIsolation = (short) 1;
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getMinimumPoolSize();
        long long3 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.dataSourceClassName = "HikariPool-249";
        long long9 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setConnectionInitSql("hi!");
        long long14 = hikariConfig11.getLeakDetectionThreshold();
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        hikariConfig16.setRegisterMbeans(false);
        java.lang.String str20 = hikariConfig16.transactionIsolationName;
        int int21 = hikariConfig16.getMaximumPoolSize();
        int int22 = hikariConfig16.transactionIsolation;
        java.util.Properties properties23 = hikariConfig16.dataSourceProperties;
        hikariConfig11.dataSourceProperties = properties23;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties23);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig1.dataSourceProperties = properties23;
        boolean boolean28 = hikariConfig1.isAutoCommit();
        hikariConfig1.setConnectionTestQuery("HikariPool-208");
        boolean boolean31 = hikariConfig1.isRegisterMbeans();
        int int32 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str14 = hikariConfig1.transactionIsolationName;
        long long15 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-24947");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-24947 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        long long10 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setMaximumPoolSize((int) 'a');
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.catalog = "HikariPool-200";
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str18 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-200" + "'", str18, "HikariPool-200");
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setIdleTimeout((long) (short) 10);
        boolean boolean11 = hikariConfig1.isInitializationFailFast;
        java.lang.String str12 = hikariConfig1.catalog;
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        java.lang.String str15 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setPoolName("HikariPool-3322");
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        hikariConfig1.leakDetectionThreshold = 0L;
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        hikariConfig1.minPoolSize = 0;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.transactionIsolationName = "HikariPool-36";
        int int14 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isInitializationFailFast = false;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay(1800000L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setDataSourceClassName("HikariPool-517");
        hikariConfig1.setCatalog("HikariPool-260");
        hikariConfig1.setPoolName("HikariPool-2741");
        long long17 = hikariConfig1.idleTimeout;
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 60L + "'", long17 == 60L);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        int int6 = hikariConfig1.getAcquireRetries();
        int int7 = hikariConfig1.getAcquireIncrement();
        long long8 = hikariConfig1.maxLifetime;
        int int9 = hikariConfig1.transactionIsolation;
        java.lang.String str10 = hikariConfig1.getConnectionTestQuery();
        int int11 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getAcquireRetryDelay();
        long long8 = hikariConfig1.maxLifetime;
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setMaximumPoolSize((int) (short) 1);
        long long12 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setConnectionTestQuery("hi!");
        hikariConfig1.dataSourceClassName = "HikariPool-256";
        java.lang.String str17 = hikariConfig1.poolName;
        java.util.Properties properties18 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-28565" + "'", str17, "HikariPool-28565");
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        boolean boolean14 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str15 = hikariConfig1.poolName;
        hikariConfig1.connectionTestQuery = "HikariPool-400";
        hikariConfig1.setMaxLifetime((long) 1);
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        hikariConfig22.leakDetectionThreshold = 100;
        hikariConfig22.connectionInitSql = "hi!";
        hikariConfig22.maxPoolSize = (short) -1;
        java.lang.String str29 = hikariConfig22.getPoolName();
        hikariConfig22.leakDetectionThreshold = 100;
        boolean boolean32 = hikariConfig22.isRegisterMbeans();
        boolean boolean33 = hikariConfig22.isJdbc4connectionTest;
        long long34 = hikariConfig22.getConnectionTimeout();
        hikariConfig1.addDataSourceProperty("HikariPool-5140", (java.lang.Object) hikariConfig22);
        hikariConfig22.maxLifetime = ' ';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-28566" + "'", str15, "HikariPool-28566");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-28567" + "'", str29, "HikariPool-28567");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 10L + "'", long34 == 10L);
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.isAutoCommit = true;
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        java.lang.String str12 = hikariConfig11.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.dataSource = dataSource9;
        hikariConfig1.transactionIsolation = (short) 10;
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        long long14 = hikariConfig1.connectionTimeout;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig16.setDataSourceClassName("");
        int int19 = hikariConfig16.getMaximumPoolSize();
        boolean boolean20 = hikariConfig16.isInitializationFailFast();
        hikariConfig16.minPoolSize = 0;
        hikariConfig16.setTransactionIsolation("HikariPool-410");
        long long25 = hikariConfig16.connectionTimeout;
        hikariConfig1.addDataSourceProperty("HikariPool-16487", (java.lang.Object) hikariConfig16);
        long long27 = hikariConfig16.idleTimeout;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 60L + "'", long27 == 60L);
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        hikariConfig1.setConnectionTestQuery("hi!");
        hikariConfig1.isJdbc4connectionTest = true;
        boolean boolean17 = hikariConfig1.isInitializationFailFast;
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}
