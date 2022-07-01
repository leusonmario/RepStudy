import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setPoolName("HikariPool-320");
        hikariConfig1.dataSourceClassName = "HikariPool-166";
        hikariConfig1.setAutoCommit(true);
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        int int7 = hikariConfig0.maxPoolSize;
        hikariConfig0.isInitializationFailFast = false;
        int int10 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setAcquireRetries((int) (byte) 1);
        hikariConfig0.isJdbc4connectionTest = false;
        boolean boolean15 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
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
        hikariConfig1.setAcquireRetries(10);
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
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
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
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.catalog = "";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("HikariPool-403");
        hikariConfig0.isRegisterMbeans = false;
        hikariConfig0.setAcquireRetries(97);
        java.lang.String str10 = hikariConfig0.connectionInitSql;
        long long11 = hikariConfig0.maxLifetime;
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-403" + "'", str10, "HikariPool-403");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
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
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setIdleTimeout(1L);
        hikariConfig1.setPoolName("HikariPool-87");
        long long17 = hikariConfig1.maxLifetime;
        hikariConfig1.setTransactionIsolation("HikariPool-292");
        javax.sql.DataSource dataSource20 = hikariConfig1.getDataSource();
        hikariConfig1.connectionTimeout = 32;
        boolean boolean23 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertNull(dataSource20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-428");
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionInitSql("");
        hikariConfig1.setConnectionCustomizerClassName("hi!");
        long long11 = hikariConfig1.maxLifetime;
        hikariConfig1.setPoolName("HikariPool-2358");
        int int14 = hikariConfig1.minPoolSize;
        int int15 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        long long9 = hikariConfig1.getAcquireRetryDelay();
        int int10 = hikariConfig1.transactionIsolation;
        hikariConfig1.setLeakDetectionThreshold((long) 100);
        hikariConfig1.setConnectionTestQuery("HikariPool-1318");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-21263");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        int int4 = hikariConfig1.getMinimumPoolSize();
        java.util.Properties properties5 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig(properties5);
        hikariConfig6.leakDetectionThreshold = 100;
        hikariConfig6.minPoolSize = (byte) 1;
        hikariConfig6.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig6.connectionCustomizer;
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.setRegisterMbeans(false);
        hikariConfig15.dataSourceClassName = "";
        hikariConfig15.setTransactionIsolation("");
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
        hikariConfig15.dataSourceProperties = properties42;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties42);
        hikariConfig6.dataSourceProperties = properties42;
        hikariConfig1.setDataSourceProperties(properties42);
        java.lang.String str48 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setAcquireRetries(60);
        hikariConfig1.setConnectionCustomizerClassName("");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 60 + "'", int40 == 60);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(properties42);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
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
        java.lang.String str23 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
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
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.setDataSource(dataSource15);
        boolean boolean17 = hikariConfig1.isInitializationFailFast();
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        int int20 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        int int8 = hikariConfig1.transactionIsolation;
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "HikariPool-2247";
        hikariConfig1.maxPoolSize = (byte) -1;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        hikariConfig9.connectionCustomizerClassName = "HikariPool-824";
        int int12 = hikariConfig9.minPoolSize;
        int int13 = hikariConfig9.maxPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
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
        hikariConfig1.isRegisterMbeans = false;
        long long18 = hikariConfig1.getMaxLifetime();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setMaximumPoolSize(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        hikariConfig0.connectionTestQuery = "HikariPool-292";
        java.lang.String str4 = hikariConfig0.getConnectionInitSql();
        java.lang.String str5 = hikariConfig0.catalog;
        hikariConfig0.setIdleTimeout((long) ' ');
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
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
        long long13 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.transactionIsolation = 10;
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        hikariConfig1.setPoolName("HikariPool-517");
        java.lang.String str6 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("HikariPool-780");
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.transactionIsolation = 35;
        hikariConfig1.setTransactionIsolation("HikariPool-35501");
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
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
        long long12 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.poolName = "HikariPool-15679";
        hikariConfig1.acquireRetries = 0;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
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
        javax.sql.DataSource dataSource16 = hikariConfig1.getDataSource();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.isInitializationFailFast = true;
        java.lang.String str24 = hikariConfig18.getConnectionInitSql();
        java.lang.String str25 = hikariConfig18.transactionIsolationName;
        java.util.Properties properties26 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        int int28 = hikariConfig27.getTransactionIsolation();
        hikariConfig27.setRegisterMbeans(false);
        java.lang.String str31 = hikariConfig27.connectionTestQuery;
        long long32 = hikariConfig27.getIdleTimeout();
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        int int35 = hikariConfig34.getTransactionIsolation();
        hikariConfig34.setRegisterMbeans(false);
        java.lang.String str38 = hikariConfig34.transactionIsolationName;
        java.lang.String str39 = hikariConfig34.connectionCustomizerClassName;
        hikariConfig34.setConnectionTestQuery("hi!");
        java.lang.String str42 = hikariConfig34.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer43 = hikariConfig34.connectionCustomizer;
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        hikariConfig45.setConnectionInitSql("hi!");
        java.util.Properties properties48 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig(properties48);
        int int50 = hikariConfig49.getTransactionIsolation();
        hikariConfig49.setRegisterMbeans(false);
        hikariConfig49.dataSourceClassName = "";
        hikariConfig49.setTransactionIsolation("");
        java.util.Properties properties57 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig58 = new com.zaxxer.hikari.HikariConfig(properties57);
        int int59 = hikariConfig58.getTransactionIsolation();
        hikariConfig58.setRegisterMbeans(false);
        hikariConfig58.isInitializationFailFast = true;
        int int64 = hikariConfig58.acquireRetries;
        hikariConfig58.setMaxLifetime((long) (-1));
        int int67 = hikariConfig58.getTransactionIsolation();
        java.util.Properties properties68 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig69 = new com.zaxxer.hikari.HikariConfig(properties68);
        int int70 = hikariConfig69.getTransactionIsolation();
        hikariConfig69.setRegisterMbeans(false);
        java.lang.String str73 = hikariConfig69.transactionIsolationName;
        int int74 = hikariConfig69.getMaximumPoolSize();
        int int75 = hikariConfig69.transactionIsolation;
        java.util.Properties properties76 = hikariConfig69.dataSourceProperties;
        hikariConfig58.setDataSourceProperties(properties76);
        hikariConfig49.dataSourceProperties = properties76;
        hikariConfig45.dataSourceProperties = properties76;
        hikariConfig34.setDataSourceProperties(properties76);
        hikariConfig27.dataSourceProperties = properties76;
        hikariConfig18.setDataSourceProperties(properties76);
        hikariConfig1.setDataSourceProperties(properties76);
        long long84 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 60L + "'", long32 == 60L);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(iConnectionCustomizer43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 60 + "'", int74 == 60);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(properties76);
// flaky:         org.junit.Assert.assertTrue("'" + long84 + "' != '" + 60L + "'", long84 == 60L);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.connectionCustomizerClassName = "HikariPool-22058";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        int int10 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource11 = hikariConfig1.dataSource;
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaximumPoolSize(0);
        hikariConfig1.setDataSourceClassName("HikariPool-105");
        hikariConfig1.setIdleTimeout((long) 3);
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.leakDetectionThreshold = 100;
        hikariConfig12.minPoolSize = (byte) 1;
        hikariConfig12.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig12.connectionCustomizer;
        java.util.Properties properties20 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties20);
        int int22 = hikariConfig21.getTransactionIsolation();
        hikariConfig21.setRegisterMbeans(false);
        hikariConfig21.dataSourceClassName = "";
        hikariConfig21.setTransactionIsolation("");
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setRegisterMbeans(false);
        hikariConfig30.isInitializationFailFast = true;
        int int36 = hikariConfig30.acquireRetries;
        hikariConfig30.setMaxLifetime((long) (-1));
        int int39 = hikariConfig30.getTransactionIsolation();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        int int42 = hikariConfig41.getTransactionIsolation();
        hikariConfig41.setRegisterMbeans(false);
        java.lang.String str45 = hikariConfig41.transactionIsolationName;
        int int46 = hikariConfig41.getMaximumPoolSize();
        int int47 = hikariConfig41.transactionIsolation;
        java.util.Properties properties48 = hikariConfig41.dataSourceProperties;
        hikariConfig30.setDataSourceProperties(properties48);
        hikariConfig21.dataSourceProperties = properties48;
        com.zaxxer.hikari.HikariConfig hikariConfig51 = new com.zaxxer.hikari.HikariConfig(properties48);
        hikariConfig12.dataSourceProperties = properties48;
        boolean boolean53 = hikariConfig12.isInitializationFailFast();
        boolean boolean54 = hikariConfig12.isInitializationFailFast;
        int int55 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.leakDetectionThreshold = '4';
        hikariConfig12.acquireRetries = (short) 100;
        hikariConfig12.setConnectionInitSql("HikariPool-1159");
        hikariConfig1.addDataSourceProperty("HikariPool-8508", (java.lang.Object) "HikariPool-1159");
        java.util.Properties properties63 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 60 + "'", int46 == 60);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(properties63);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isJdbc4connectionTest = false;
        long long11 = hikariConfig1.getMaxLifetime();
        int int12 = hikariConfig1.maxPoolSize;
        java.lang.String str13 = hikariConfig1.catalog;
        hikariConfig1.connectionInitSql = "HikariPool-26930";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.minPoolSize = 1;
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        int int11 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isAutoCommit = false;
        long long14 = hikariConfig1.connectionTimeout;
        java.lang.String str15 = hikariConfig1.poolName;
        boolean boolean16 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionInitSql = "HikariPool-1372";
        java.lang.Class<?> wildcardClass19 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-45537" + "'", str15, "HikariPool-45537");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        boolean boolean6 = hikariConfig1.isAutoCommit;
        hikariConfig1.setDataSourceClassName("HikariPool-39047");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-310");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.setConnectionInitSql("HikariPool-292");
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setLeakDetectionThreshold((long) 87);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionTestQuery();
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setDataSourceClassName("HikariPool-36");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        javax.sql.DataSource dataSource12 = hikariConfig1.getDataSource();
        hikariConfig1.maxPoolSize = 87;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getAcquireRetries();
        hikariConfig1.dataSourceClassName = "HikariPool-140";
        hikariConfig1.idleTimeout = 32;
        hikariConfig1.transactionIsolation = (-1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        int int9 = hikariConfig1.getMaximumPoolSize();
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        java.lang.String str11 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig1.dataSource = dataSource12;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.connectionTimeout = (byte) 1;
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.transactionIsolation = 100;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolationName = "HikariPool-431";
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        long long18 = hikariConfig1.leakDetectionThreshold;
        int int19 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
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
        java.lang.String str23 = hikariConfig1.catalog;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-24357");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
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
        int int18 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        long long25 = hikariConfig20.getIdleTimeout();
        java.lang.String str26 = hikariConfig20.getCatalog();
        java.util.Properties properties27 = hikariConfig20.getDataSourceProperties();
        hikariConfig20.setIdleTimeout((long) (short) 10);
        hikariConfig20.maxLifetime = (-1);
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
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig1.setDataSourceProperties(properties79);
        hikariConfig1.setMaxLifetime((long) 10);
        hikariConfig1.isInitializationFailFast = true;
        long long88 = hikariConfig1.idleTimeout;
        java.lang.String str89 = hikariConfig1.connectionInitSql;
        java.lang.String str90 = hikariConfig1.poolName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer91 = hikariConfig1.connectionCustomizer;
        long long92 = hikariConfig1.idleTimeout;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60L + "'", long25 == 60L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
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
// flaky:         org.junit.Assert.assertTrue("'" + long88 + "' != '" + 60L + "'", long88 == 60L);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "HikariPool-222" + "'", str90, "HikariPool-222");
        org.junit.Assert.assertNull(iConnectionCustomizer91);
// flaky:         org.junit.Assert.assertTrue("'" + long92 + "' != '" + 60L + "'", long92 == 60L);
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        boolean boolean8 = hikariConfig0.isInitializationFailFast;
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        hikariConfig11.dataSourceClassName = "";
        hikariConfig11.setTransactionIsolation("");
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        hikariConfig20.isInitializationFailFast = true;
        int int26 = hikariConfig20.acquireRetries;
        hikariConfig20.setMaxLifetime((long) (-1));
        int int29 = hikariConfig20.getTransactionIsolation();
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        int int32 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.setRegisterMbeans(false);
        java.lang.String str35 = hikariConfig31.transactionIsolationName;
        int int36 = hikariConfig31.getMaximumPoolSize();
        int int37 = hikariConfig31.transactionIsolation;
        java.util.Properties properties38 = hikariConfig31.dataSourceProperties;
        hikariConfig20.setDataSourceProperties(properties38);
        hikariConfig11.dataSourceProperties = properties38;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties38);
        hikariConfig1.setDataSourceProperties(properties38);
        hikariConfig1.connectionTimeout = 32L;
        hikariConfig1.setTransactionIsolation("HikariPool-28");
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(properties38);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 32L;
        int int5 = hikariConfig1.getTransactionIsolation();
        java.lang.String str6 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setUseInstrumentation(true);
        java.lang.String str9 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.connectionTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = false;
        java.util.Properties properties11 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
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
        hikariConfig1.connectionInitSql = "HikariPool-41313";
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
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
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
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig12.setMaxLifetime(60L);
        hikariConfig12.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource17 = hikariConfig12.getDataSource();
        hikariConfig12.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.isAutoCommit = false;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.dataSourceClassName = "HikariPool-834";
        hikariConfig1.maxPoolSize = 0;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.connectionInitSql = "HikariPool-204";
        hikariConfig1.transactionIsolation = 60;
        hikariConfig1.setMinimumPoolSize(60);
        int int15 = hikariConfig1.getAcquireRetries();
        boolean boolean16 = hikariConfig1.isAutoCommit();
        javax.sql.DataSource dataSource17 = hikariConfig1.dataSource;
        hikariConfig1.dataSourceClassName = "HikariPool-1469";
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
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
        hikariConfig1.acquireRetries = (byte) 100;
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
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
        hikariConfig1.idleTimeout = 0L;
        int int14 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
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
        int int16 = hikariConfig1.acquireRetries;
        hikariConfig1.setConnectionInitSql("HikariPool-22152");
        long long19 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 2147483647L + "'", long19 == 2147483647L);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
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
        long long11 = hikariConfig1.getIdleTimeout();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(properties13);
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        java.lang.String str7 = hikariConfig1.getPoolName();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig9.setDataSourceClassName("");
        hikariConfig9.validate();
        long long13 = hikariConfig9.getLeakDetectionThreshold();
        hikariConfig9.setRegisterMbeans(false);
        long long16 = hikariConfig9.connectionTimeout;
        hikariConfig9.connectionTimeout = (short) -1;
        java.lang.String str19 = hikariConfig9.connectionInitSql;
        int int20 = hikariConfig9.transactionIsolation;
        hikariConfig9.isInitializationFailFast = true;
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        int int13 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.setRegisterMbeans(false);
        java.lang.String str19 = hikariConfig15.transactionIsolationName;
        int int20 = hikariConfig15.getMaximumPoolSize();
        int int21 = hikariConfig15.transactionIsolation;
        java.util.Properties properties22 = hikariConfig15.dataSourceProperties;
        boolean boolean23 = hikariConfig15.isRegisterMbeans;
        boolean boolean24 = hikariConfig15.isInitializationFailFast;
        hikariConfig15.minPoolSize = 100;
        hikariConfig15.setUseInstrumentation(true);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig30.leakDetectionThreshold = 100;
        boolean boolean33 = hikariConfig30.isJdbc4ConnectionTest();
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        int int36 = hikariConfig35.getTransactionIsolation();
        hikariConfig35.setRegisterMbeans(false);
        java.lang.String str39 = hikariConfig35.transactionIsolationName;
        long long40 = hikariConfig35.getIdleTimeout();
        java.lang.String str41 = hikariConfig35.getCatalog();
        java.lang.String str42 = hikariConfig35.getConnectionTestQuery();
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig44.dataSourceClassName = "";
        java.util.Properties properties47 = hikariConfig44.dataSourceProperties;
        hikariConfig35.setDataSourceProperties(properties47);
        hikariConfig30.dataSourceProperties = properties47;
        java.util.Properties properties50 = hikariConfig30.dataSourceProperties;
        hikariConfig15.setDataSourceProperties(properties50);
        hikariConfig1.dataSourceProperties = properties50;
        hikariConfig1.setInitializationFailFast(false);
        hikariConfig1.connectionInitSql = "HikariPool-9464";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(str39);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 60L + "'", long40 == 60L);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertNotNull(properties50);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
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
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        boolean boolean22 = hikariConfig1.isAutoCommit;
        int int23 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        java.lang.String str26 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60L + "'", long20 == 60L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
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
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        long long13 = hikariConfig1.getConnectionTimeout();
        int int14 = hikariConfig1.minPoolSize;
        long long15 = hikariConfig1.connectionTimeout;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.isInitializationFailFast = true;
        java.lang.String str23 = hikariConfig17.getConnectionCustomizerClassName();
        hikariConfig17.transactionIsolationName = "";
        boolean boolean26 = hikariConfig17.isJdbc4connectionTest;
        hikariConfig17.setAcquireRetries((int) 'a');
        java.util.Properties properties29 = hikariConfig17.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig1.dataSourceProperties = properties29;
        javax.sql.DataSource dataSource32 = null;
        hikariConfig1.dataSource = dataSource32;
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
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
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isInitializationFailFast = true;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
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
        hikariConfig1.connectionInitSql = "HikariPool-306";
        hikariConfig1.setCatalog("");
        int int25 = hikariConfig1.minPoolSize;
        hikariConfig1.acquireRetries = 'a';
        java.lang.String str28 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.idleTimeout = 35;
        boolean boolean31 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.isRegisterMbeans = false;
        javax.sql.DataSource dataSource34 = null;
        hikariConfig1.setDataSource(dataSource34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-1328";
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.validate();
        hikariConfig1.maxLifetime = '4';
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
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
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        hikariConfig1.setCatalog("hi!");
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        java.lang.String str18 = hikariConfig1.poolName;
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        java.lang.String str20 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-45601" + "'", str18, "HikariPool-45601");
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
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
        java.lang.String str16 = hikariConfig1.poolName;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-45604" + "'", str16, "HikariPool-45604");
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
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
        hikariConfig1.transactionIsolationName = "HikariPool-249";
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        int int50 = hikariConfig1.maxPoolSize;
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
// flaky:         org.junit.Assert.assertEquals("'" + str45 + "' != '" + "HikariPool-45605" + "'", str45, "HikariPool-45605");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setMaximumPoolSize(87);
        hikariConfig1.transactionIsolationName = "HikariPool-222";
        hikariConfig1.setCatalog("HikariPool-292");
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setDataSourceClassName("HikariPool-366");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
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
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        int int16 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.maxPoolSize = (short) 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
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
        hikariConfig1.connectionTimeout = 'a';
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        hikariConfig14.setRegisterMbeans(false);
        java.lang.String str18 = hikariConfig14.transactionIsolationName;
        int int19 = hikariConfig14.transactionIsolation;
        java.lang.String str20 = hikariConfig14.getConnectionInitSql();
        int int21 = hikariConfig14.transactionIsolation;
        java.lang.String str22 = hikariConfig14.getConnectionInitSql();
        hikariConfig14.catalog = "HikariPool-117";
        hikariConfig14.transactionIsolationName = "HikariPool-36";
        java.util.Properties properties27 = hikariConfig14.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties27;
        boolean boolean29 = hikariConfig1.isAutoCommit();
        hikariConfig1.acquireRetries = 1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.connectionInitSql = "HikariPool-205";
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str13 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
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
        int int11 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.isRegisterMbeans = true;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.connectionCustomizer;
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        boolean boolean15 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = 1L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str7 = hikariConfig1.catalog;
        int int8 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-373");
        hikariConfig1.connectionTimeout = 100;
        hikariConfig1.isJdbc4connectionTest = false;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.poolName = "HikariPool-215";
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        java.lang.String str10 = hikariConfig1.getPoolName();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        int int12 = hikariConfig1.maxPoolSize;
        hikariConfig1.connectionInitSql = "HikariPool-348";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-215" + "'", str10, "HikariPool-215");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        long long8 = hikariConfig1.getConnectionTimeout();
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        java.lang.String str10 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
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
        long long18 = hikariConfig1.maxLifetime;
        hikariConfig1.acquireRetries = (short) 100;
        hikariConfig1.connectionTimeout = 2147483647L;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        java.lang.String str28 = hikariConfig24.connectionTestQuery;
        int int29 = hikariConfig24.getAcquireIncrement();
        java.util.Properties properties30 = hikariConfig24.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties30;
        javax.sql.DataSource dataSource32 = hikariConfig1.getDataSource();
        boolean boolean33 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertNull(dataSource32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setInitializationFailFast(false);
        int int9 = hikariConfig1.maxPoolSize;
        boolean boolean10 = hikariConfig1.isInitializationFailFast;
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        hikariConfig13.maxLifetime = '4';
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getConnectionTestQuery();
        long long3 = hikariConfig1.idleTimeout;
        hikariConfig1.setInitializationFailFast(true);
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.transactionIsolation = '#';
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        long long10 = hikariConfig1.maxLifetime;
        long long11 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertNull(str2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(properties9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
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
        java.lang.String str29 = hikariConfig1.connectionCustomizerClassName;
        long long30 = hikariConfig1.idleTimeout;
        int int31 = hikariConfig1.transactionIsolation;
        boolean boolean32 = hikariConfig1.isJdbc4connectionTest;
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
        org.junit.Assert.assertNull(str29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 60L + "'", long30 == 60L);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
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
        hikariConfig1.transactionIsolation = '#';
        hikariConfig1.setPoolName("HikariPool-1258");
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.setConnectionInitSql("hi!");
        boolean boolean29 = hikariConfig26.isRegisterMbeans();
        hikariConfig26.setIdleTimeout((long) (short) 100);
        hikariConfig26.maxPoolSize = (-1);
        hikariConfig26.isJdbc4connectionTest = false;
        java.util.Properties properties36 = hikariConfig26.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties36);
        long long38 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.transactionIsolationName = "HikariPool-253";
        int int9 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.leakDetectionThreshold = (short) 10;
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(true);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = hikariConfig1.connectionCustomizer;
        int int16 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
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
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setIdleTimeout(1L);
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        boolean boolean16 = hikariConfig1.isAutoCommit;
        java.lang.String str17 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.isInitializationFailFast = true;
        int int20 = hikariConfig1.maxPoolSize;
        int int21 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        int int6 = hikariConfig1.getAcquireRetries();
        java.lang.String str7 = hikariConfig1.poolName;
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.connectionTestQuery = "HikariPool-25213";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-45636" + "'", str7, "HikariPool-45636");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
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
        long long15 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-218");
        hikariConfig1.setTransactionIsolation("HikariPool-17064");
        java.lang.String str20 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-218" + "'", str20, "HikariPool-218");
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        javax.sql.DataSource dataSource5 = hikariConfig0.dataSource;
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setPoolName("HikariPool-6390");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNull(dataSource5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        hikariConfig0.catalog = "HikariPool-173";
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setConnectionTestQuery("");
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
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
        boolean boolean13 = hikariConfig1.isAutoCommit;
        int int14 = hikariConfig1.acquireRetries;
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setConnectionInitSql("hi!");
        boolean boolean20 = hikariConfig17.isInitializationFailFast;
        hikariConfig17.addDataSourceProperty("HikariPool-222", (java.lang.Object) "HikariPool-6");
        hikariConfig17.setMaxLifetime(10L);
        long long26 = hikariConfig17.connectionTimeout;
        long long27 = hikariConfig17.getAcquireRetryDelay();
        java.util.Properties properties28 = hikariConfig17.dataSourceProperties;
        java.util.Properties properties29 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties29;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-28");
        hikariConfig1.setJdbc4ConnectionTest(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-204");
        hikariConfig1.catalog = "HikariPool-204";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = hikariConfig1.connectionCustomizer;
        long long14 = hikariConfig1.leakDetectionThreshold;
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        hikariConfig1.dataSourceClassName = "HikariPool-42670";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertNull(iConnectionCustomizer13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        int int10 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.poolName;
        hikariConfig12.setMinimumPoolSize((int) '4');
        hikariConfig12.minPoolSize = (byte) 0;
        hikariConfig1.addDataSourceProperty("HikariPool-256", (java.lang.Object) hikariConfig12);
        javax.sql.DataSource dataSource19 = hikariConfig1.dataSource;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer20 = hikariConfig1.connectionCustomizer;
        hikariConfig1.idleTimeout = 10;
        hikariConfig1.maxPoolSize = 32;
        int int25 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-45649" + "'", str13, "HikariPool-45649");
        org.junit.Assert.assertNull(dataSource19);
        org.junit.Assert.assertNull(iConnectionCustomizer20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        int int4 = hikariConfig0.getAcquireIncrement();
        int int5 = hikariConfig0.minPoolSize;
        boolean boolean6 = hikariConfig0.isInitializationFailFast;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.maxLifetime = ' ';
        long long12 = hikariConfig1.getConnectionTimeout();
        java.lang.String str13 = hikariConfig1.catalog;
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        int int15 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        long long9 = hikariConfig1.getAcquireRetryDelay();
        int int10 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
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
        hikariConfig16.isAutoCommit = true;
        long long31 = hikariConfig16.getMaxLifetime();
        hikariConfig16.setCatalog("HikariPool-320");
        hikariConfig16.dataSourceClassName = "HikariPool-10996";
        hikariConfig16.setPoolName("HikariPool-35911");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(iConnectionCustomizer28);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 35L + "'", long31 == 35L);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
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
        hikariConfig1.setInitializationFailFast(true);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        hikariConfig17.isInitializationFailFast = true;
        int int23 = hikariConfig17.acquireRetries;
        hikariConfig17.setMaxLifetime((long) (-1));
        boolean boolean26 = hikariConfig17.isInitializationFailFast();
        hikariConfig17.poolName = "HikariPool-59";
        java.util.Properties properties29 = hikariConfig17.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties29;
        javax.sql.DataSource dataSource31 = null;
        hikariConfig1.dataSource = dataSource31;
        hikariConfig1.setMinimumPoolSize(32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(properties29);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
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
        hikariConfig1.setAcquireRetries((int) (short) 1);
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMinimumPoolSize(35);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        hikariConfig1.setTransactionIsolation("HikariPool-130");
        boolean boolean22 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
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
        long long16 = hikariConfig15.getConnectionTimeout();
        long long17 = hikariConfig15.getLeakDetectionThreshold();
        int int18 = hikariConfig15.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-37025";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
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
        boolean boolean45 = hikariConfig1.isRegisterMbeans();
        boolean boolean46 = hikariConfig1.isAutoCommit();
        int int47 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.leakDetectionThreshold = (byte) 10;
        hikariConfig1.setMaxLifetime(32L);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60 + "'", int47 == 60);
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
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
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setIdleTimeout(1L);
        hikariConfig1.setPoolName("HikariPool-87");
        int int17 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        javax.sql.DataSource dataSource5 = hikariConfig1.getDataSource();
        hikariConfig1.setIdleTimeout((long) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(dataSource5);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.connectionTimeout = (short) -1;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
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
        java.lang.String str20 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setIdleTimeout(52L);
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        hikariConfig1.isAutoCommit = false;
        long long15 = hikariConfig1.getIdleTimeout();
        java.lang.String str16 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.maxLifetime = 1L;
        boolean boolean19 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
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
        int int32 = hikariConfig31.maxPoolSize;
        hikariConfig31.connectionCustomizerClassName = "HikariPool-461";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = hikariConfig31.connectionCustomizer;
        java.util.Properties properties36 = hikariConfig31.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties36);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer35);
        org.junit.Assert.assertNotNull(properties36);
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str7 = hikariConfig0.poolName;
        int int8 = hikariConfig0.transactionIsolation;
        hikariConfig0.connectionCustomizerClassName = "HikariPool-308";
        java.lang.String str11 = hikariConfig0.catalog;
        java.util.Properties properties12 = hikariConfig0.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig13.isRegisterMbeans = false;
        hikariConfig13.setLeakDetectionThreshold((long) 0);
        java.util.Properties properties18 = hikariConfig13.dataSourceProperties;
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-45677" + "'", str7, "HikariPool-45677");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
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
        int int17 = hikariConfig1.transactionIsolation;
        boolean boolean18 = hikariConfig1.isInitializationFailFast;
        int int19 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
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
        int int23 = hikariConfig14.getMinimumPoolSize();
        hikariConfig14.connectionTimeout = (short) -1;
        hikariConfig14.leakDetectionThreshold = (short) -1;
        java.lang.String str28 = hikariConfig14.getPoolName();
        hikariConfig14.setMinimumPoolSize((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HikariPool-45681" + "'", str28, "HikariPool-45681");
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties8);
        long long11 = hikariConfig10.idleTimeout;
        int int12 = hikariConfig10.maxPoolSize;
        long long13 = hikariConfig10.getIdleTimeout();
        boolean boolean14 = hikariConfig10.isJdbc4ConnectionTest();
        boolean boolean15 = hikariConfig10.isJdbc4ConnectionTest();
        hikariConfig10.connectionTimeout = 97;
        hikariConfig10.isRegisterMbeans = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        long long10 = hikariConfig1.getAcquireRetryDelay();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        hikariConfig1.minPoolSize = 3;
        hikariConfig1.transactionIsolationName = "HikariPool-41493";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.idleTimeout;
        java.lang.String str11 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setDataSourceClassName("HikariPool-17217");
        int int14 = hikariConfig1.transactionIsolation;
        int int15 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
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
        hikariConfig1.setMinimumPoolSize(0);
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        long long9 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setTransactionIsolation("HikariPool-167");
        boolean boolean12 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetries((int) (short) 0);
        hikariConfig1.setTransactionIsolation("HikariPool-25677");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.maxLifetime = 32L;
        hikariConfig1.setDataSourceClassName("HikariPool-35396");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
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
        long long25 = hikariConfig1.maxLifetime;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer26;
        hikariConfig1.connectionTimeout = (short) 1;
        javax.sql.DataSource dataSource30 = hikariConfig1.getDataSource();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties23);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
        org.junit.Assert.assertNull(dataSource30);
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        java.lang.String str8 = hikariConfig1.connectionInitSql;
        hikariConfig1.setRegisterMbeans(false);
        long long11 = hikariConfig1.maxLifetime;
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.maxLifetime = 52;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
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
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isAutoCommit;
        hikariConfig13.poolName = "hi!";
        java.lang.String str17 = hikariConfig13.dataSourceClassName;
        java.lang.String str18 = hikariConfig13.dataSourceClassName;
        hikariConfig13.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig13.connectionCustomizer;
        hikariConfig13.setInitializationFailFast(true);
        int int24 = hikariConfig13.transactionIsolation;
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.dataSourceClassName = "";
        java.util.Properties properties29 = hikariConfig26.dataSourceProperties;
        hikariConfig13.setDataSourceProperties(properties29);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig1.dataSourceProperties = properties29;
        int int33 = hikariConfig1.transactionIsolation;
        hikariConfig1.poolName = "HikariPool-9921";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
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
        java.util.Properties properties14 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.minPoolSize = ' ';
        int int17 = hikariConfig1.transactionIsolation;
        java.lang.String str18 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        long long3 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionTestQuery("HikariPool-87");
        javax.sql.DataSource dataSource6 = hikariConfig1.dataSource;
        java.lang.Class<?> wildcardClass7 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
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
        hikariConfig1.setIdleTimeout((long) (byte) 1);
        int int16 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.transactionIsolationName = "HikariPool-10415";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setLeakDetectionThreshold(52L);
        java.lang.String str13 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.acquireRetries = 97;
        boolean boolean16 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
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
        java.lang.String str37 = hikariConfig1.getDataSourceClassName();
        java.lang.String str38 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str39 = hikariConfig1.dataSourceClassName;
        long long40 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean41 = hikariConfig1.isJdbc4connectionTest;
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
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
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
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setConnectionInitSql("HikariPool-14225");
        javax.sql.DataSource dataSource20 = hikariConfig1.dataSource;
        hikariConfig1.transactionIsolationName = "HikariPool-203";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(dataSource20);
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
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
        long long51 = hikariConfig1.maxLifetime;
        java.lang.String str52 = hikariConfig1.catalog;
        hikariConfig1.setConnectionTestQuery("HikariPool-26135");
        java.lang.String str55 = hikariConfig1.getConnectionTestQuery();
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
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 35L + "'", long51 == 35L);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "HikariPool-26135" + "'", str55, "HikariPool-26135");
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        int int7 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        java.lang.String str9 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str10 = hikariConfig1.getPoolName();
        hikariConfig1.connectionTimeout = '#';
        int int13 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-45716" + "'", str10, "HikariPool-45716");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setUseInstrumentation(true);
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        long long10 = hikariConfig0.getConnectionTimeout();
        boolean boolean11 = hikariConfig0.isAutoCommit;
        long long12 = hikariConfig0.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
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
        hikariConfig1.maxLifetime = 1800000L;
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
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
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.idleTimeout = 0L;
        hikariConfig1.setMaximumPoolSize(60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setCatalog("HikariPool-204");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        long long9 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMaxLifetime((long) 87);
        hikariConfig1.dataSourceClassName = "HikariPool-29540";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        boolean boolean8 = hikariConfig1.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.dataSource = dataSource9;
        long long11 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionTestQuery = "HikariPool-27433";
        int int14 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 60 + "'", int14 == 60);
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.acquireRetries = 87;
        long long13 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
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
        long long25 = hikariConfig1.maxLifetime;
        java.lang.String str26 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.connectionTestQuery = "HikariPool-21167";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer29 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNotNull(properties23);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(iConnectionCustomizer29);
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        int int10 = hikariConfig1.getMinimumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        long long6 = hikariConfig1.connectionTimeout;
        boolean boolean7 = hikariConfig1.isAutoCommit;
        long long8 = hikariConfig1.getIdleTimeout();
        hikariConfig1.poolName = "HikariPool-395";
        hikariConfig1.setPoolName("HikariPool-17");
        hikariConfig1.idleTimeout = (byte) 0;
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str16 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries(87);
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.isInitializationFailFast = true;
        int int12 = hikariConfig1.acquireRetries;
        hikariConfig1.catalog = "HikariPool-27725";
        hikariConfig1.setLeakDetectionThreshold(10L);
        hikariConfig1.minPoolSize = (byte) 1;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 87 + "'", int12 == 87);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setLeakDetectionThreshold(52L);
        hikariConfig1.catalog = "HikariPool-208";
        hikariConfig1.setMaxLifetime((long) 'a');
        hikariConfig1.idleTimeout = (byte) 100;
        long long18 = hikariConfig1.getMaxLifetime();
        long long19 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 97L + "'", long18 == 97L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.setDataSource(dataSource14);
        long long16 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        hikariConfig1.setInitializationFailFast(false);
        boolean boolean21 = hikariConfig1.isAutoCommit();
        hikariConfig1.setAcquireRetries(87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-173";
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.minPoolSize = '#';
        long long13 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionTestQuery = "HikariPool-18481";
        boolean boolean16 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertNotNull(properties10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.minPoolSize = (byte) 0;
        long long6 = hikariConfig0.connectionTimeout;
        int int7 = hikariConfig0.minPoolSize;
        long long8 = hikariConfig0.getLeakDetectionThreshold();
        long long9 = hikariConfig0.getMaxLifetime();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-45735" + "'", str1, "HikariPool-45735");
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
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
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties28);
        java.util.Properties properties34 = hikariConfig33.dataSourceProperties;
        int int35 = hikariConfig33.getMinimumPoolSize();
        long long36 = hikariConfig33.getMaxLifetime();
        java.lang.String str37 = hikariConfig33.getConnectionTestQuery();
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
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 35L + "'", long36 == 35L);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isRegisterMbeans = true;
        long long11 = hikariConfig1.connectionTimeout;
        hikariConfig1.dataSourceClassName = "HikariPool-204";
        long long14 = hikariConfig1.connectionTimeout;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        int int18 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        int int7 = hikariConfig1.maxPoolSize;
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        int int11 = hikariConfig1.getTransactionIsolation();
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        java.lang.String str13 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionTestQuery = "hi!";
        int int10 = hikariConfig1.getMinimumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
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
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        long long16 = hikariConfig1.idleTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer17 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer17;
        java.lang.String str19 = hikariConfig1.catalog;
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setIdleTimeout(0L);
        hikariConfig1.setInitializationFailFast(false);
        int int28 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.maxPoolSize = 0;
        hikariConfig1.setConnectionTestQuery("HikariPool-105");
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isAutoCommit;
        int int15 = hikariConfig13.getAcquireIncrement();
        java.util.Properties properties16 = hikariConfig13.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties16);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isAutoCommit;
        hikariConfig19.poolName = "hi!";
        java.lang.String str23 = hikariConfig19.dataSourceClassName;
        hikariConfig19.acquireRetries = (short) 10;
        java.util.Properties properties26 = hikariConfig19.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        int int29 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        hikariConfig1.isRegisterMbeans = false;
        int int34 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.transactionIsolation = (short) 0;
        hikariConfig1.setLeakDetectionThreshold(10L);
        hikariConfig1.isJdbc4connectionTest = true;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
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
        java.lang.String str18 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-23091");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-23091 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.connectionTimeout = (byte) 1;
        hikariConfig1.setAcquireRetries((int) (byte) 10);
        long long11 = hikariConfig1.getIdleTimeout();
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.setMaxLifetime((long) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
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
        java.lang.String str37 = hikariConfig1.connectionTestQuery;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer38 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 1);
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
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(iConnectionCustomizer38);
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        java.lang.String str8 = hikariConfig0.getCatalog();
        long long9 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.connectionCustomizerClassName = "HikariPool-719";
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setAutoCommit(true);
        java.lang.String str16 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.connectionInitSql = "";
        java.lang.String str19 = hikariConfig0.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-719" + "'", str19, "HikariPool-719");
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setLeakDetectionThreshold(1L);
        long long14 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource7);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
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
        hikariConfig1.maxPoolSize = 100;
        long long67 = hikariConfig1.idleTimeout;
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
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 10L + "'", long67 == 10L);
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.minPoolSize;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer6;
        hikariConfig1.maxLifetime = 3L;
        hikariConfig1.dataSourceClassName = "HikariPool-2323";
        hikariConfig1.setMinimumPoolSize(0);
        java.lang.String str14 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-2323" + "'", str14, "HikariPool-2323");
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setAutoCommit(false);
        long long10 = hikariConfig1.connectionTimeout;
        int int11 = hikariConfig1.minPoolSize;
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        int int4 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-90");
        hikariConfig1.leakDetectionThreshold = ' ';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
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
        long long14 = hikariConfig1.getIdleTimeout();
        int int15 = hikariConfig1.transactionIsolation;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-670");
        hikariConfig1.maxPoolSize = (short) 1;
        boolean boolean22 = hikariConfig1.isInitializationFailFast;
        long long23 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-12130");
        javax.sql.DataSource dataSource26 = null;
        hikariConfig1.dataSource = dataSource26;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(dataSource13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.catalog = "HikariPool-690";
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        java.lang.String str13 = hikariConfig1.connectionCustomizerClassName;
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(dataSource14);
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.poolName = "HikariPool-472";
        java.lang.String str7 = hikariConfig1.connectionCustomizerClassName;
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        long long9 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
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
        int int32 = hikariConfig31.maxPoolSize;
        boolean boolean33 = hikariConfig31.isJdbc4connectionTest;
        java.lang.String str34 = hikariConfig31.connectionTestQuery;
        int int35 = hikariConfig31.getMaximumPoolSize();
        hikariConfig31.setRegisterMbeans(true);
        java.lang.String str38 = hikariConfig31.connectionInitSql;
        java.lang.String str39 = hikariConfig31.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
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
        hikariConfig1.connectionTimeout = 87L;
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNotNull(properties19);
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str8 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.transactionIsolation = (short) 1;
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.dataSourceClassName = "HikariPool-344";
        hikariConfig1.setMinimumPoolSize(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-185");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        hikariConfig1.connectionInitSql = "HikariPool-26328";
        hikariConfig1.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16655");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        javax.sql.DataSource dataSource7 = hikariConfig1.dataSource;
        java.lang.String str8 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test16656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16656");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        javax.sql.DataSource dataSource4 = hikariConfig0.dataSource;
        java.lang.String str5 = hikariConfig0.connectionInitSql;
        int int6 = hikariConfig0.getAcquireRetries();
        boolean boolean7 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(5000L);
        hikariConfig0.setAcquireRetries((int) ' ');
        hikariConfig0.connectionTimeout = 1L;
        java.lang.String str14 = hikariConfig0.getCatalog();
        hikariConfig0.setUseInstrumentation(true);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        hikariConfig18.isInitializationFailFast = true;
        java.lang.String str24 = hikariConfig18.getConnectionInitSql();
        int int25 = hikariConfig18.getAcquireIncrement();
        hikariConfig18.setMaxLifetime((long) 60);
        java.lang.String str28 = hikariConfig18.getConnectionTestQuery();
        boolean boolean29 = hikariConfig18.isJdbc4connectionTest;
        javax.sql.DataSource dataSource30 = null;
        hikariConfig18.dataSource = dataSource30;
        hikariConfig18.isAutoCommit = true;
        java.util.Properties properties34 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig35.setConnectionInitSql("hi!");
        boolean boolean38 = hikariConfig35.isRegisterMbeans();
        hikariConfig35.setIdleTimeout((long) (short) 100);
        hikariConfig35.maxPoolSize = (-1);
        long long43 = hikariConfig35.getAcquireRetryDelay();
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.poolName = "hi!";
        hikariConfig45.acquireRetries = ' ';
        hikariConfig45.connectionTimeout = (byte) 1;
        hikariConfig45.setUseInstrumentation(true);
        hikariConfig45.transactionIsolation = 100;
        java.util.Properties properties57 = hikariConfig45.dataSourceProperties;
        hikariConfig35.setDataSourceProperties(properties57);
        hikariConfig18.dataSourceProperties = properties57;
        java.util.Properties properties60 = hikariConfig18.getDataSourceProperties();
        hikariConfig0.dataSourceProperties = properties60;
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties60);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-45786" + "'", str1, "HikariPool-45786");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(properties57);
        org.junit.Assert.assertNotNull(properties60);
    }

    @Test
    public void test16657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16657");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        boolean boolean13 = hikariConfig1.isAutoCommit();
        long long14 = hikariConfig1.leakDetectionThreshold;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig17.transactionIsolationName;
        int int22 = hikariConfig17.getMaximumPoolSize();
        int int23 = hikariConfig17.transactionIsolation;
        java.util.Properties properties24 = hikariConfig17.dataSourceProperties;
        hikariConfig17.transactionIsolation = (byte) 1;
        hikariConfig17.dataSourceClassName = "";
        javax.sql.DataSource dataSource29 = null;
        hikariConfig17.setDataSource(dataSource29);
        long long31 = hikariConfig17.getLeakDetectionThreshold();
        hikariConfig1.addDataSourceProperty("HikariPool-393", (java.lang.Object) hikariConfig17);
        long long33 = hikariConfig17.getIdleTimeout();
        java.lang.String str34 = hikariConfig17.transactionIsolationName;
        javax.sql.DataSource dataSource35 = hikariConfig17.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 60L + "'", long33 == 60L);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(dataSource35);
    }

    @Test
    public void test16658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16658");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str11 = hikariConfig1.connectionInitSql;
        long long12 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.connectionInitSql = "HikariPool-27404";
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test16659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16659");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        javax.sql.DataSource dataSource5 = null;
        hikariConfig1.dataSource = dataSource5;
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.leakDetectionThreshold = 0L;
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean11 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16660");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.connectionInitSql = "HikariPool-55";
        long long9 = hikariConfig1.connectionTimeout;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test16661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16661");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.transactionIsolation = (short) -1;
        int int11 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties12 = hikariConfig1.getDataSourceProperties();
        long long13 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
    }

    @Test
    public void test16662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16662");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetries((int) 'a');
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        java.util.Properties properties15 = hikariConfig14.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig16.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test16663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16663");
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
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.transactionIsolationName = "HikariPool-1099";
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig18.leakDetectionThreshold = 100;
        hikariConfig18.acquireRetries = (byte) -1;
        long long23 = hikariConfig18.getIdleTimeout();
        java.lang.String str24 = hikariConfig18.getConnectionInitSql();
        hikariConfig18.connectionInitSql = "HikariPool-112";
        int int27 = hikariConfig18.minPoolSize;
        hikariConfig18.acquireRetries = (byte) 10;
        hikariConfig1.addDataSourceProperty("HikariPool-3725", (java.lang.Object) hikariConfig18);
        hikariConfig18.setTransactionIsolation("HikariPool-7189");
        hikariConfig18.setMaximumPoolSize((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60L + "'", long23 == 60L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test16664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16664");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.transactionIsolationName = "HikariPool-241";
        hikariConfig1.setConnectionInitSql("HikariPool-34490");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
    }

    @Test
    public void test16665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16665");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        hikariConfig1.isJdbc4connectionTest = false;
        javax.sql.DataSource dataSource12 = hikariConfig1.dataSource;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test16666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16666");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str4 = hikariConfig1.connectionInitSql;
        hikariConfig1.connectionTestQuery = "HikariPool-10412";
        hikariConfig1.setConnectionInitSql("HikariPool-5863");
        javax.sql.DataSource dataSource9 = null;
        hikariConfig1.dataSource = dataSource9;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test16667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16667");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.setMaxLifetime(1800000L);
        hikariConfig1.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test16668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16668");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        int int11 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.isRegisterMbeans = true;
        int int18 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test16669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16669");
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
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16670");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setTransactionIsolation("HikariPool-105");
        hikariConfig0.setLeakDetectionThreshold((long) 'a');
        java.lang.String str8 = hikariConfig0.poolName;
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        boolean boolean10 = hikariConfig0.isJdbc4connectionTest;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-45808" + "'", str8, "HikariPool-45808");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test16671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16671");
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
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        hikariConfig1.maxLifetime = 3;
        long long19 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test16672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16672");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        int int5 = hikariConfig1.minPoolSize;
        boolean boolean6 = hikariConfig1.isJdbc4ConnectionTest();
        boolean boolean7 = hikariConfig1.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer8;
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.maxPoolSize = 52;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test16673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16673");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        hikariConfig1.transactionIsolationName = "HikariPool-317";
        hikariConfig1.connectionTestQuery = "HikariPool-1037";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test16674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16674");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.lang.String str10 = hikariConfig1.dataSourceClassName;
        hikariConfig1.leakDetectionThreshold = 87;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-37591");
        hikariConfig1.maxLifetime = 35L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16675");
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
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        int int12 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setRegisterMbeans(true);
        boolean boolean15 = hikariConfig1.isAutoCommit();
        hikariConfig1.catalog = "HikariPool-851";
        javax.sql.DataSource dataSource18 = hikariConfig1.dataSource;
        hikariConfig1.catalog = "HikariPool-2371";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test16676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16676");
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
        int int17 = hikariConfig1.acquireRetries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer18;
        hikariConfig1.setConnectionTestQuery("HikariPool-20575");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test16677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16677");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        long long9 = hikariConfig1.maxLifetime;
        hikariConfig1.setLeakDetectionThreshold((long) 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test16678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16678");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.transactionIsolation = (short) 0;
        hikariConfig1.setMaxLifetime(3L);
        hikariConfig1.leakDetectionThreshold = 10;
        long long19 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test16679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16679");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str11 = hikariConfig1.poolName;
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        long long13 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-45817" + "'", str11, "HikariPool-45817");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
    }

    @Test
    public void test16680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16680");
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
        hikariConfig1.setTransactionIsolation("HikariPool-688");
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        long long19 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNull(dataSource18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
    }

    @Test
    public void test16681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16681");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.poolName = "HikariPool-472";
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test16682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16682");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource9 = hikariConfig1.getDataSource();
        hikariConfig1.setTransactionIsolation("HikariPool-1050");
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16683");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        hikariConfig1.minPoolSize = (byte) 0;
        hikariConfig1.isInitializationFailFast = true;
        int int11 = hikariConfig1.getMaximumPoolSize();
        long long12 = hikariConfig1.getLeakDetectionThreshold();
        java.lang.String str13 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.maxLifetime = 'a';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16684");
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
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setUseInstrumentation(true);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        int int20 = hikariConfig19.getTransactionIsolation();
        hikariConfig19.setRegisterMbeans(false);
        java.lang.String str23 = hikariConfig19.transactionIsolationName;
        long long24 = hikariConfig19.getIdleTimeout();
        java.lang.String str25 = hikariConfig19.getCatalog();
        java.util.Properties properties26 = hikariConfig19.getDataSourceProperties();
        hikariConfig19.setIdleTimeout((long) (short) 10);
        java.lang.String str29 = hikariConfig19.dataSourceClassName;
        hikariConfig19.setAutoCommit(false);
        hikariConfig19.leakDetectionThreshold = (byte) 10;
        java.lang.String str34 = hikariConfig19.connectionInitSql;
        java.util.Properties properties35 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        int int37 = hikariConfig36.getTransactionIsolation();
        hikariConfig36.setRegisterMbeans(false);
        hikariConfig36.dataSourceClassName = "";
        hikariConfig36.setTransactionIsolation("");
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        hikariConfig45.isInitializationFailFast = true;
        int int51 = hikariConfig45.acquireRetries;
        hikariConfig45.setMaxLifetime((long) (-1));
        int int54 = hikariConfig45.getTransactionIsolation();
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        int int57 = hikariConfig56.getTransactionIsolation();
        hikariConfig56.setRegisterMbeans(false);
        java.lang.String str60 = hikariConfig56.transactionIsolationName;
        int int61 = hikariConfig56.getMaximumPoolSize();
        int int62 = hikariConfig56.transactionIsolation;
        java.util.Properties properties63 = hikariConfig56.dataSourceProperties;
        hikariConfig45.setDataSourceProperties(properties63);
        hikariConfig36.dataSourceProperties = properties63;
        com.zaxxer.hikari.HikariConfig hikariConfig66 = new com.zaxxer.hikari.HikariConfig(properties63);
        hikariConfig19.setDataSourceProperties(properties63);
        java.util.Properties properties68 = hikariConfig19.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties68;
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 60L + "'", long24 == 60L);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 60 + "'", int61 == 60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(properties63);
        org.junit.Assert.assertNotNull(properties68);
    }

    @Test
    public void test16685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16685");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-308");
        hikariConfig0.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test16686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16686");
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
        javax.sql.DataSource dataSource22 = hikariConfig1.dataSource;
        boolean boolean23 = hikariConfig1.isAutoCommit();
        java.lang.String str24 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HikariPool-45834" + "'", str24, "HikariPool-45834");
    }

    @Test
    public void test16687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16687");
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
        boolean boolean23 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setDataSourceClassName("HikariPool-451");
        java.lang.String str26 = hikariConfig1.catalog;
        long long27 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionTestQuery = "HikariPool-30033";
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 60L + "'", long27 == 60L);
    }

    @Test
    public void test16688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16688");
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
        hikariConfig1.idleTimeout = 32;
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16689");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        long long9 = hikariConfig1.getMaxLifetime();
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.connectionTestQuery = "HikariPool-5618";
        hikariConfig1.connectionInitSql = "HikariPool-15185";
        int int15 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60 + "'", int15 == 60);
    }

    @Test
    public void test16690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16690");
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
        int int22 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test16691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16691");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-26965");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-26965 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16692");
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
        java.lang.String str24 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setConnectionInitSql("HikariPool-838");
        java.lang.String str27 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test16693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16693");
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
        boolean boolean23 = hikariConfig1.isAutoCommit();
        hikariConfig1.setIdleTimeout(2147483647L);
        javax.sql.DataSource dataSource26 = hikariConfig1.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (byte) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(dataSource26);
    }

    @Test
    public void test16694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16694");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-173";
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.maxLifetime = (byte) -1;
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        hikariConfig1.isAutoCommit = true;
        long long16 = hikariConfig1.getConnectionTimeout();
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test16695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16695");
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
        hikariConfig1.transactionIsolation = (short) -1;
        hikariConfig1.acquireRetries = 3;
        hikariConfig1.setIdleTimeout((long) 32);
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.String str26 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test16696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16696");
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
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isAutoCommit;
        int int19 = hikariConfig17.getAcquireIncrement();
        int int20 = hikariConfig17.getAcquireIncrement();
        java.lang.String str21 = hikariConfig17.connectionCustomizerClassName;
        hikariConfig17.setCatalog("HikariPool-204");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer24 = hikariConfig17.connectionCustomizer;
        long long25 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.acquireRetries = (short) 0;
        java.util.Properties properties28 = hikariConfig17.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties28);
        java.lang.String str30 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(iConnectionCustomizer24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test16697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16697");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetries((int) 'a');
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        long long14 = hikariConfig1.getIdleTimeout();
        hikariConfig1.leakDetectionThreshold = (-1L);
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        java.lang.String str22 = hikariConfig18.transactionIsolationName;
        long long23 = hikariConfig18.getIdleTimeout();
        java.lang.String str24 = hikariConfig18.getCatalog();
        java.util.Properties properties25 = hikariConfig18.getDataSourceProperties();
        hikariConfig18.setIdleTimeout((long) (short) 10);
        hikariConfig18.maxLifetime = (-1);
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        int int32 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.setRegisterMbeans(false);
        java.lang.String str35 = hikariConfig31.transactionIsolationName;
        int int36 = hikariConfig31.transactionIsolation;
        java.lang.String str37 = hikariConfig31.getConnectionInitSql();
        int int38 = hikariConfig31.getMaximumPoolSize();
        hikariConfig31.setJdbc4ConnectionTest(false);
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        int int44 = hikariConfig43.getTransactionIsolation();
        hikariConfig43.setRegisterMbeans(false);
        java.lang.String str47 = hikariConfig43.transactionIsolationName;
        long long48 = hikariConfig43.getIdleTimeout();
        java.lang.String str49 = hikariConfig43.getCatalog();
        java.util.Properties properties50 = hikariConfig43.getDataSourceProperties();
        hikariConfig43.setUseInstrumentation(false);
        hikariConfig31.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig43);
        hikariConfig31.poolName = "HikariPool-104";
        java.util.Properties properties56 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties56);
        hikariConfig57.leakDetectionThreshold = 100;
        boolean boolean60 = hikariConfig57.isJdbc4ConnectionTest();
        java.util.Properties properties61 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties61);
        int int63 = hikariConfig62.getTransactionIsolation();
        hikariConfig62.setRegisterMbeans(false);
        java.lang.String str66 = hikariConfig62.transactionIsolationName;
        long long67 = hikariConfig62.getIdleTimeout();
        java.lang.String str68 = hikariConfig62.getCatalog();
        java.lang.String str69 = hikariConfig62.getConnectionTestQuery();
        java.util.Properties properties70 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig71 = new com.zaxxer.hikari.HikariConfig(properties70);
        hikariConfig71.dataSourceClassName = "";
        java.util.Properties properties74 = hikariConfig71.dataSourceProperties;
        hikariConfig62.setDataSourceProperties(properties74);
        hikariConfig57.dataSourceProperties = properties74;
        java.util.Properties properties77 = hikariConfig57.dataSourceProperties;
        hikariConfig31.dataSourceProperties = properties77;
        hikariConfig18.dataSourceProperties = properties77;
        java.util.Properties properties80 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig81 = new com.zaxxer.hikari.HikariConfig(properties80);
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties80);
        hikariConfig1.setDataSourceProperties(properties80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 60L + "'", long23 == 60L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 60 + "'", int38 == 60);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str47);
// flaky:         org.junit.Assert.assertTrue("'" + long48 + "' != '" + 60L + "'", long48 == 60L);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(properties50);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNull(str66);
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 60L + "'", long67 == 60L);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(properties74);
        org.junit.Assert.assertNotNull(properties77);
        org.junit.Assert.assertNotNull(properties80);
    }

    @Test
    public void test16698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16698");
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
        java.lang.String str13 = hikariConfig1.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setLeakDetectionThreshold((long) 100);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-31703");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
    }

    @Test
    public void test16699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16699");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        int int8 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.maxLifetime = 1800000L;
        boolean boolean11 = hikariConfig1.isAutoCommit();
        hikariConfig1.setMinimumPoolSize((int) 'a');
        hikariConfig1.leakDetectionThreshold = 32L;
        hikariConfig1.setPoolName("HikariPool-823");
        hikariConfig1.setIdleTimeout((-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test16700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16700");
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
        hikariConfig1.catalog = "HikariPool-1527";
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2221");
        javax.sql.DataSource dataSource25 = null;
        hikariConfig1.dataSource = dataSource25;
        long long27 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test16701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16701");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.maxPoolSize = (-1);
        int int11 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.connectionTestQuery = "HikariPool-12949";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test16702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16702");
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
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.setRegisterMbeans(false);
        java.lang.String str19 = hikariConfig15.transactionIsolationName;
        int int20 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.setMaximumPoolSize(87);
        hikariConfig15.transactionIsolationName = "HikariPool-222";
        hikariConfig15.setCatalog("HikariPool-292");
        javax.sql.DataSource dataSource27 = null;
        hikariConfig15.setDataSource(dataSource27);
        int int29 = hikariConfig15.acquireRetries;
        hikariConfig1.addDataSourceProperty("HikariPool-1658", (java.lang.Object) hikariConfig15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test16703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16703");
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
        hikariConfig1.dataSourceProperties = properties45;
        hikariConfig1.acquireRetries = 3;
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean54 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test16704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16704");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getAcquireRetryDelay();
        int int8 = hikariConfig1.getAcquireRetries();
        java.lang.String str9 = hikariConfig1.connectionTestQuery;
        long long10 = hikariConfig1.maxLifetime;
        long long11 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setIdleTimeout(100L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test16705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16705");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        int int4 = hikariConfig1.maxPoolSize;
        int int5 = hikariConfig1.acquireRetries;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(iConnectionCustomizer6);
    }

    @Test
    public void test16706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16706");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.maxPoolSize = (-1);
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        long long10 = hikariConfig1.getIdleTimeout();
        int int11 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test16707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16707");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-17311");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-17311 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16708");
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
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
    }

    @Test
    public void test16709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16709");
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
        boolean boolean31 = hikariConfig18.isInitializationFailFast;
        hikariConfig18.maxPoolSize = (-1);
        java.lang.String str34 = hikariConfig18.poolName;
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HikariPool-45890" + "'", str34, "HikariPool-45890");
    }

    @Test
    public void test16710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16710");
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
        long long15 = hikariConfig1.getConnectionTimeout();
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig17.transactionIsolationName;
        long long22 = hikariConfig17.connectionTimeout;
        hikariConfig17.setIdleTimeout(0L);
        java.util.Properties properties25 = hikariConfig17.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties25;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.isJdbc4connectionTest = false;
        int int31 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test16711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16711");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1802";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test16712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16712");
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
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setAutoCommit(true);
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        java.lang.String str15 = hikariConfig1.connectionInitSql;
        hikariConfig1.setMinimumPoolSize((int) (byte) 0);
        javax.sql.DataSource dataSource18 = null;
        hikariConfig1.setDataSource(dataSource18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16713");
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
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        boolean boolean17 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertNull(iConnectionCustomizer15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16714");
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
        hikariConfig1.setTransactionIsolation("HikariPool-510");
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        int int27 = hikariConfig26.getTransactionIsolation();
        hikariConfig26.setRegisterMbeans(false);
        java.lang.String str30 = hikariConfig26.transactionIsolationName;
        int int31 = hikariConfig26.transactionIsolation;
        java.lang.String str32 = hikariConfig26.getConnectionInitSql();
        int int33 = hikariConfig26.transactionIsolation;
        int int34 = hikariConfig26.maxPoolSize;
        hikariConfig26.setDataSourceClassName("HikariPool-320");
        hikariConfig26.idleTimeout = 0L;
        hikariConfig26.setTransactionIsolation("HikariPool-316");
        hikariConfig26.transactionIsolationName = "HikariPool-413";
        int int43 = hikariConfig26.getAcquireRetries();
        java.util.Properties properties44 = hikariConfig26.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties44;
        hikariConfig1.setMinimumPoolSize((int) '4');
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertNotNull(properties44);
    }

    @Test
    public void test16715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16715");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.minPoolSize = 87;
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-6776";
        java.lang.Class<?> wildcardClass18 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test16716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16716");
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
        boolean boolean11 = hikariConfig1.isAutoCommit;
        hikariConfig1.setCatalog("HikariPool-1049");
        int int14 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setTransactionIsolation("HikariPool-900");
        hikariConfig1.setMaximumPoolSize((int) ' ');
        java.lang.String str19 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionInitSql("HikariPool-1195");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16717");
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
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        hikariConfig1.minPoolSize = 1;
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isAutoCommit;
        hikariConfig19.poolName = "hi!";
        hikariConfig19.setTransactionIsolation("hi!");
        long long25 = hikariConfig19.connectionTimeout;
        java.lang.String str26 = hikariConfig19.getPoolName();
        hikariConfig19.isAutoCommit = true;
        hikariConfig19.idleTimeout = 0L;
        hikariConfig1.addDataSourceProperty("HikariPool-537", (java.lang.Object) 0L);
        long long32 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 60L + "'", long32 == 60L);
    }

    @Test
    public void test16718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16718");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.poolName = "hi!";
        hikariConfig1.acquireRetries = ' ';
        long long7 = hikariConfig1.getConnectionTimeout();
        long long8 = hikariConfig1.getMaxLifetime();
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        hikariConfig1.catalog = "HikariPool-391";
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setPoolName("HikariPool-2681");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer15 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer15;
        boolean boolean17 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16719");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties14 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test16720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16720");
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
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        int int18 = hikariConfig13.getMaximumPoolSize();
        int int19 = hikariConfig13.transactionIsolation;
        java.util.Properties properties20 = hikariConfig13.dataSourceProperties;
        boolean boolean21 = hikariConfig13.isRegisterMbeans;
        javax.sql.DataSource dataSource22 = hikariConfig13.getDataSource();
        hikariConfig13.setMaxLifetime((long) 3);
        boolean boolean25 = hikariConfig13.isInitializationFailFast();
        java.lang.String str26 = hikariConfig13.getConnectionCustomizerClassName();
        hikariConfig1.addDataSourceProperty("HikariPool-104", (java.lang.Object) hikariConfig13);
        int int28 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-1168";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 60 + "'", int18 == 60);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(dataSource22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test16721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16721");
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
        javax.sql.DataSource dataSource22 = null;
        hikariConfig10.dataSource = dataSource22;
        java.lang.String str24 = hikariConfig10.getDataSourceClassName();
        java.lang.String str25 = hikariConfig10.connectionTestQuery;
        javax.sql.DataSource dataSource26 = hikariConfig10.getDataSource();
        long long27 = hikariConfig10.getMaxLifetime();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-45918" + "'", str1, "HikariPool-45918");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-45919" + "'", str20, "HikariPool-45919");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-104" + "'", str25, "HikariPool-104");
        org.junit.Assert.assertNull(dataSource26);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 35L + "'", long27 == 35L);
    }

    @Test
    public void test16722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16722");
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
        long long12 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        hikariConfig0.transactionIsolationName = "HikariPool-296";
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-45920" + "'", str10, "HikariPool-45920");
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test16723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16723");
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
        hikariConfig1.minPoolSize = (short) 100;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HikariPool-45922" + "'", str21, "HikariPool-45922");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 60L + "'", long27 == 60L);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HikariPool-789" + "'", str39, "HikariPool-789");
    }

    @Test
    public void test16724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16724");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        java.lang.String str5 = hikariConfig0.catalog;
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        java.lang.String str8 = hikariConfig0.transactionIsolationName;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test16725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16725");
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
        hikariConfig1.leakDetectionThreshold = 32L;
        boolean boolean15 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setJdbc4ConnectionTest(true);
        java.lang.String str18 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16726");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setMaximumPoolSize((int) '#');
        java.lang.String str11 = hikariConfig0.dataSourceClassName;
        javax.sql.DataSource dataSource12 = hikariConfig0.dataSource;
        hikariConfig0.isInitializationFailFast = false;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test16727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16727");
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
        hikariConfig11.leakDetectionThreshold = 87L;
        boolean boolean29 = hikariConfig11.isInitializationFailFast();
        hikariConfig11.setIdleTimeout(10L);
        hikariConfig11.acquireRetries = 10;
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test16728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16728");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.minPoolSize = (short) 0;
        int int12 = hikariConfig1.getMaximumPoolSize();
        long long13 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setDataSourceClassName("HikariPool-256");
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isAutoCommit;
        hikariConfig17.poolName = "hi!";
        hikariConfig17.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource23 = null;
        hikariConfig17.dataSource = dataSource23;
        int int25 = hikariConfig17.minPoolSize;
        int int26 = hikariConfig17.minPoolSize;
        hikariConfig17.isInitializationFailFast = false;
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setRegisterMbeans(false);
        hikariConfig30.isInitializationFailFast = true;
        int int36 = hikariConfig30.acquireRetries;
        hikariConfig30.setMaxLifetime((long) (-1));
        int int39 = hikariConfig30.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer40 = null;
        hikariConfig30.connectionCustomizer = iConnectionCustomizer40;
        java.lang.String str42 = hikariConfig30.catalog;
        java.util.Properties properties43 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig44 = new com.zaxxer.hikari.HikariConfig(properties43);
        hikariConfig44.dataSourceClassName = "";
        hikariConfig44.connectionTimeout = 10L;
        hikariConfig44.connectionTestQuery = "HikariPool-104";
        java.util.Properties properties51 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        int int53 = hikariConfig52.getTransactionIsolation();
        hikariConfig52.setRegisterMbeans(false);
        hikariConfig52.isInitializationFailFast = true;
        int int58 = hikariConfig52.acquireRetries;
        hikariConfig52.setMaxLifetime((long) (-1));
        int int61 = hikariConfig52.getTransactionIsolation();
        java.util.Properties properties62 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig63 = new com.zaxxer.hikari.HikariConfig(properties62);
        int int64 = hikariConfig63.getTransactionIsolation();
        hikariConfig63.setRegisterMbeans(false);
        java.lang.String str67 = hikariConfig63.transactionIsolationName;
        int int68 = hikariConfig63.getMaximumPoolSize();
        int int69 = hikariConfig63.transactionIsolation;
        java.util.Properties properties70 = hikariConfig63.dataSourceProperties;
        hikariConfig52.setDataSourceProperties(properties70);
        hikariConfig44.setDataSourceProperties(properties70);
        hikariConfig30.setDataSourceProperties(properties70);
        com.zaxxer.hikari.HikariConfig hikariConfig74 = new com.zaxxer.hikari.HikariConfig(properties70);
        hikariConfig17.setDataSourceProperties(properties70);
        hikariConfig1.dataSourceProperties = properties70;
        hikariConfig1.poolName = "HikariPool-110";
        java.lang.String str79 = hikariConfig1.dataSourceClassName;
        hikariConfig1.catalog = "HikariPool-30450";
        java.lang.String str82 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 3 + "'", int58 == 3);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 60 + "'", int68 == 60);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(properties70);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "HikariPool-256" + "'", str79, "HikariPool-256");
        org.junit.Assert.assertNull(str82);
    }

    @Test
    public void test16729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16729");
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
        int int50 = hikariConfig49.acquireRetries;
        hikariConfig49.connectionInitSql = "HikariPool-2671";
        long long53 = hikariConfig49.idleTimeout;
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
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long53 + "' != '" + 60L + "'", long53 == 60L);
    }

    @Test
    public void test16730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16730");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        long long7 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.setLeakDetectionThreshold(0L);
        long long12 = hikariConfig1.getMaxLifetime();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test16731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16731");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        hikariConfig0.leakDetectionThreshold = (-1L);
        hikariConfig0.maxLifetime = 35L;
        hikariConfig0.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test16732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16732");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.transactionIsolation = (byte) 1;
        hikariConfig1.setTransactionIsolation("HikariPool-29434");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test16733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16733");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.minPoolSize = (byte) 10;
        java.lang.String str7 = hikariConfig1.connectionTestQuery;
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setRegisterMbeans(false);
        java.lang.String str13 = hikariConfig9.transactionIsolationName;
        int int14 = hikariConfig9.transactionIsolation;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig9.dataSource = dataSource15;
        long long17 = hikariConfig9.maxLifetime;
        hikariConfig9.setMaximumPoolSize((int) (short) 10);
        java.util.Properties properties20 = hikariConfig9.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties20;
        hikariConfig1.dataSourceClassName = "HikariPool-263";
        java.util.Properties properties24 = hikariConfig1.getDataSourceProperties();
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test16734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16734");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setMaxLifetime((long) (short) 0);
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        hikariConfig13.dataSourceClassName = "";
        hikariConfig13.setIdleTimeout((long) (short) 100);
        java.util.Properties properties21 = hikariConfig13.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties21);
        hikariConfig1.addDataSourceProperty("HikariPool-104", (java.lang.Object) 1800000L);
        java.lang.String str26 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean27 = hikariConfig1.isAutoCommit;
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        int int30 = hikariConfig29.getTransactionIsolation();
        hikariConfig29.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties33 = hikariConfig29.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties33);
        java.lang.String str35 = hikariConfig1.connectionCustomizerClassName;
        boolean boolean36 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.transactionIsolationName = "HikariPool-580";
        hikariConfig1.setTransactionIsolation("HikariPool-826");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(properties33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test16735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16735");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setInitializationFailFast(true);
        long long7 = hikariConfig1.getAcquireRetryDelay();
        long long8 = hikariConfig1.maxLifetime;
        long long9 = hikariConfig1.idleTimeout;
        long long10 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionTestQuery("HikariPool-12714");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 60L + "'", long9 == 60L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test16736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16736");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        hikariConfig1.idleTimeout = 1800000L;
        hikariConfig1.poolName = "HikariPool-581";
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        java.lang.String str13 = hikariConfig1.poolName;
        boolean boolean14 = hikariConfig1.isRegisterMbeans;
        long long15 = hikariConfig1.getLeakDetectionThreshold();
        long long16 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-581" + "'", str13, "HikariPool-581");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test16737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16737");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setConnectionTestQuery("");
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.dataSourceClassName = "HikariPool-1107";
        hikariConfig1.setDataSourceClassName("HikariPool-14576");
        hikariConfig1.setMaxLifetime(87L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16738");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        int int3 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.connectionCustomizerClassName = "HikariPool-252";
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.transactionIsolationName = "HikariPool-23956";
        hikariConfig0.catalog = "HikariPool-24318";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test16739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16739");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.poolName = "HikariPool-597";
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        boolean boolean17 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-975";
        boolean boolean20 = hikariConfig1.isJdbc4connectionTest;
        java.util.Properties properties22 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig23 = new com.zaxxer.hikari.HikariConfig(properties22);
        hikariConfig23.dataSourceClassName = "";
        hikariConfig23.connectionTimeout = 10L;
        hikariConfig23.connectionTestQuery = "HikariPool-104";
        boolean boolean30 = hikariConfig23.isJdbc4connectionTest;
        long long31 = hikariConfig23.getConnectionTimeout();
        hikariConfig23.setMaxLifetime((long) 'a');
        hikariConfig23.setPoolName("HikariPool-823");
        long long36 = hikariConfig23.getAcquireRetryDelay();
        hikariConfig23.setMinimumPoolSize((int) (byte) 100);
        hikariConfig1.addDataSourceProperty("HikariPool-41314", (java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 10L + "'", long31 == 10L);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test16740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16740");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        java.lang.String str8 = hikariConfig1.connectionCustomizerClassName;
        long long9 = hikariConfig1.getAcquireRetryDelay();
        int int10 = hikariConfig1.transactionIsolation;
        hikariConfig1.setLeakDetectionThreshold((long) 100);
        hikariConfig1.minPoolSize = (byte) 0;
        int int15 = hikariConfig1.minPoolSize;
        hikariConfig1.setAcquireRetries((int) (byte) 10);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test16741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16741");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        long long9 = hikariConfig1.getMaxLifetime();
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.connectionTestQuery = "HikariPool-412";
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        java.lang.String str14 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-412" + "'", str14, "HikariPool-412");
    }

    @Test
    public void test16742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16742");
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
        hikariConfig1.isInitializationFailFast = true;
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test16743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16743");
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
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isAutoCommit;
        hikariConfig20.poolName = "hi!";
        java.lang.String str24 = hikariConfig20.dataSourceClassName;
        java.lang.String str25 = hikariConfig20.dataSourceClassName;
        hikariConfig20.setJdbc4ConnectionTest(false);
        int int28 = hikariConfig20.maxPoolSize;
        hikariConfig20.setIdleTimeout(52L);
        java.lang.String str31 = hikariConfig20.connectionInitSql;
        java.util.Properties properties32 = hikariConfig20.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties32);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.connectionTimeout = 100L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-45968" + "'", str14, "HikariPool-45968");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 60 + "'", int28 == 60);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(properties32);
    }

    @Test
    public void test16744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16744");
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
        hikariConfig1.connectionInitSql = "HikariPool-109";
        long long19 = hikariConfig1.getIdleTimeout();
        java.lang.String str20 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-109" + "'", str20, "HikariPool-109");
    }

    @Test
    public void test16745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16745");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.setMinimumPoolSize((int) (short) 10);
        hikariConfig1.maxLifetime = 100L;
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16746");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        hikariConfig1.idleTimeout = '4';
        hikariConfig1.setTransactionIsolation("HikariPool-177");
        int int13 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-405");
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test16747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16747");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setConnectionCustomizerClassName("");
        hikariConfig1.isInitializationFailFast = true;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int12 = hikariConfig11.getTransactionIsolation();
        hikariConfig11.setRegisterMbeans(false);
        java.lang.String str15 = hikariConfig11.transactionIsolationName;
        long long16 = hikariConfig11.getIdleTimeout();
        java.lang.String str17 = hikariConfig11.getCatalog();
        java.lang.String str18 = hikariConfig11.getConnectionTestQuery();
        hikariConfig11.maxPoolSize = (byte) 0;
        hikariConfig11.isAutoCommit = true;
        boolean boolean23 = hikariConfig11.isJdbc4ConnectionTest();
        boolean boolean24 = hikariConfig11.isJdbc4connectionTest;
        hikariConfig11.isAutoCommit = false;
        hikariConfig1.addDataSourceProperty("HikariPool-633", (java.lang.Object) hikariConfig11);
        java.lang.String str28 = hikariConfig11.getCatalog();
        hikariConfig11.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test16748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16748");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.connectionTimeout = (short) 10;
        java.lang.String str9 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str10 = hikariConfig1.poolName;
        hikariConfig1.setConnectionInitSql("HikariPool-2615");
        hikariConfig1.setMinimumPoolSize((int) '#');
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-45976" + "'", str10, "HikariPool-45976");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16749");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        java.lang.String str4 = hikariConfig1.dataSourceClassName;
        java.lang.String str5 = hikariConfig1.getConnectionCustomizerClassName();
        int int6 = hikariConfig1.minPoolSize;
        hikariConfig1.setConnectionTimeout((long) (byte) 100);
        hikariConfig1.catalog = "HikariPool-57";
        hikariConfig1.setConnectionInitSql("HikariPool-55");
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test16750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16750");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.poolName = "HikariPool-215";
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        java.lang.String str11 = hikariConfig1.catalog;
        hikariConfig1.setIdleTimeout(2147483647L);
        hikariConfig1.setIdleTimeout((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16751");
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
        java.lang.String str14 = hikariConfig1.catalog;
        long long15 = hikariConfig1.getIdleTimeout();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
        org.junit.Assert.assertNull(iConnectionCustomizer16);
    }

    @Test
    public void test16752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16752");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isInitializationFailFast = false;
        boolean boolean10 = hikariConfig1.isRegisterMbeans;
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test16753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16753");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setMaximumPoolSize((int) ' ');
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-624");
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.poolName = "hi!";
        hikariConfig13.acquireRetries = ' ';
        hikariConfig13.setMaxLifetime(0L);
        long long21 = hikariConfig13.maxLifetime;
        long long22 = hikariConfig13.connectionTimeout;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        hikariConfig24.isInitializationFailFast = true;
        int int30 = hikariConfig24.acquireRetries;
        hikariConfig24.setMaxLifetime((long) (-1));
        int int33 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.maxLifetime = 32L;
        java.util.Properties properties36 = hikariConfig24.dataSourceProperties;
        hikariConfig13.dataSourceProperties = properties36;
        hikariConfig1.dataSourceProperties = properties36;
        com.zaxxer.hikari.HikariConfig hikariConfig39 = new com.zaxxer.hikari.HikariConfig(properties36);
        boolean boolean40 = hikariConfig39.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(properties36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test16754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16754");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.connectionTestQuery;
        int int6 = hikariConfig1.getAcquireIncrement();
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMinimumPoolSize(97);
        hikariConfig1.setPoolName("HikariPool-245");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test16755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16755");
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
        java.lang.String str18 = hikariConfig1.getCatalog();
        java.lang.String str19 = hikariConfig1.poolName;
        hikariConfig1.setCatalog("HikariPool-4049");
        long long22 = hikariConfig1.getLeakDetectionThreshold();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-222" + "'", str19, "HikariPool-222");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test16756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16756");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        int int2 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer3 = hikariConfig0.connectionCustomizer;
        boolean boolean4 = hikariConfig0.isAutoCommit();
        hikariConfig0.connectionTimeout = 3;
        int int7 = hikariConfig0.acquireRetries;
        javax.sql.DataSource dataSource8 = hikariConfig0.dataSource;
        hikariConfig0.connectionTestQuery = "HikariPool-2487";
        hikariConfig0.setMaxLifetime((long) (byte) 1);
        hikariConfig0.maxLifetime = (-1L);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(dataSource8);
    }

    @Test
    public void test16757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16757");
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
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetries(60);
        long long17 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setTransactionIsolation("HikariPool-8479");
        hikariConfig1.maxLifetime = 52L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test16758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16758");
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
        java.lang.String str33 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setLeakDetectionThreshold((long) 35);
        hikariConfig1.setMaxLifetime((long) (byte) 0);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test16759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16759");
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
        boolean boolean22 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.idleTimeout = 10L;
        int int25 = hikariConfig1.acquireRetries;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig26.setDataSourceClassName("");
        hikariConfig26.validate();
        long long30 = hikariConfig26.getLeakDetectionThreshold();
        hikariConfig26.setIdleTimeout((long) '4');
        java.lang.String str33 = hikariConfig26.connectionCustomizerClassName;
        java.util.Properties properties34 = hikariConfig26.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig35 = new com.zaxxer.hikari.HikariConfig(properties34);
        hikariConfig1.setDataSourceProperties(properties34);
        java.lang.String str37 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(properties34);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test16760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16760");
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
        boolean boolean14 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.connectionTestQuery = "HikariPool-1099";
        java.lang.String str17 = hikariConfig1.poolName;
        hikariConfig1.setCatalog("HikariPool-42481");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-45994" + "'", str17, "HikariPool-45994");
    }

    @Test
    public void test16761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16761");
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
        hikariConfig1.connectionTimeout = 87L;
        hikariConfig1.setPoolName("HikariPool-1085");
        long long19 = hikariConfig1.idleTimeout;
        java.lang.String str20 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-1085" + "'", str20, "HikariPool-1085");
    }

    @Test
    public void test16762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16762");
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
        boolean boolean26 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test16763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16763");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setIdleTimeout(52L);
        int int12 = hikariConfig1.transactionIsolation;
        long long13 = hikariConfig1.connectionTimeout;
        hikariConfig1.dataSourceClassName = "HikariPool-2585";
        hikariConfig1.connectionTimeout = 10L;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test16764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16764");
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
        hikariConfig1.setTransactionIsolation("HikariPool-10301");
        int int20 = hikariConfig1.acquireRetries;
        int int21 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test16765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16765");
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
        long long13 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.setUseInstrumentation(false);
        java.util.Properties properties16 = hikariConfig1.dataSourceProperties;
        hikariConfig1.maxPoolSize = (short) 1;
        java.lang.String str19 = hikariConfig1.connectionInitSql;
        boolean boolean20 = hikariConfig1.isInitializationFailFast();
        java.lang.String str21 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16766");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        long long8 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.maxLifetime = 97;
        hikariConfig1.maxPoolSize = 52;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test16767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16767");
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
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        int int17 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.isRegisterMbeans = false;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test16768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16768");
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
        int int75 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties76 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig77 = new com.zaxxer.hikari.HikariConfig(properties76);
        com.zaxxer.hikari.HikariConfig hikariConfig78 = new com.zaxxer.hikari.HikariConfig(properties76);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer79 = hikariConfig78.connectionCustomizer;
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
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(properties76);
        org.junit.Assert.assertNull(iConnectionCustomizer79);
    }

    @Test
    public void test16769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16769");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        int int7 = hikariConfig1.getAcquireRetries();
        long long8 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setCatalog("HikariPool-180");
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setMaxLifetime((long) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16770");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        hikariConfig1.idleTimeout = 1800000L;
        hikariConfig1.poolName = "HikariPool-581";
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-624";
        int int15 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test16771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16771");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.lang.String str10 = hikariConfig1.catalog;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-29";
        hikariConfig1.setConnectionInitSql("HikariPool-17455");
        long long15 = hikariConfig1.idleTimeout;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
    }

    @Test
    public void test16772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16772");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '4');
        java.lang.String str7 = hikariConfig0.connectionCustomizerClassName;
        int int8 = hikariConfig0.acquireRetries;
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean13 = hikariConfig0.isJdbc4connectionTest;
        hikariConfig0.setAcquireRetries((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16773");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        long long10 = hikariConfig1.getMaxLifetime();
        java.lang.String str11 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setInitializationFailFast(true);
        long long14 = hikariConfig1.connectionTimeout;
        hikariConfig1.isRegisterMbeans = true;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str19 = hikariConfig18.poolName;
        hikariConfig18.setMinimumPoolSize((int) '4');
        hikariConfig18.minPoolSize = (byte) 0;
        java.lang.String str24 = hikariConfig18.dataSourceClassName;
        long long25 = hikariConfig18.getIdleTimeout();
        java.lang.String str26 = hikariConfig18.transactionIsolationName;
        boolean boolean27 = hikariConfig18.isJdbc4connectionTest;
        hikariConfig18.connectionTimeout = 52;
        hikariConfig1.addDataSourceProperty("HikariPool-334", (java.lang.Object) hikariConfig18);
        hikariConfig1.transactionIsolation = 10;
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-46021" + "'", str19, "HikariPool-46021");
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60L + "'", long25 == 60L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test16774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16774");
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
        java.lang.String str25 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test16775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16775");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.maxPoolSize = (short) -1;
        long long8 = hikariConfig1.maxLifetime;
        long long9 = hikariConfig1.maxLifetime;
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        boolean boolean13 = hikariConfig12.isAutoCommit;
        int int14 = hikariConfig12.getAcquireIncrement();
        int int15 = hikariConfig12.getAcquireIncrement();
        java.lang.String str16 = hikariConfig12.connectionCustomizerClassName;
        hikariConfig12.setCatalog("HikariPool-204");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig12.connectionCustomizer;
        hikariConfig12.transactionIsolation = (byte) 100;
        long long22 = hikariConfig12.getIdleTimeout();
        hikariConfig12.setCatalog("HikariPool-6");
        hikariConfig1.addDataSourceProperty("HikariPool-2452", (java.lang.Object) hikariConfig12);
        int int26 = hikariConfig12.getTransactionIsolation();
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60L + "'", long22 == 60L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test16776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16776");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str5 = hikariConfig1.getDataSourceClassName();
        boolean boolean6 = hikariConfig1.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        hikariConfig10.leakDetectionThreshold = 100;
        boolean boolean13 = hikariConfig10.isJdbc4ConnectionTest();
        java.util.Properties properties14 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        int int16 = hikariConfig15.getTransactionIsolation();
        hikariConfig15.setRegisterMbeans(false);
        java.lang.String str19 = hikariConfig15.transactionIsolationName;
        long long20 = hikariConfig15.getIdleTimeout();
        java.lang.String str21 = hikariConfig15.getCatalog();
        java.lang.String str22 = hikariConfig15.getConnectionTestQuery();
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig24.dataSourceClassName = "";
        java.util.Properties properties27 = hikariConfig24.dataSourceProperties;
        hikariConfig15.setDataSourceProperties(properties27);
        hikariConfig10.dataSourceProperties = properties27;
        java.lang.String str30 = hikariConfig10.poolName;
        hikariConfig10.isRegisterMbeans = true;
        boolean boolean33 = hikariConfig10.isJdbc4ConnectionTest();
        hikariConfig10.leakDetectionThreshold = 0L;
        hikariConfig1.addDataSourceProperty("HikariPool-547", (java.lang.Object) hikariConfig10);
        javax.sql.DataSource dataSource37 = null;
        hikariConfig10.setDataSource(dataSource37);
        hikariConfig10.setConnectionTestQuery("HikariPool-537");
        hikariConfig10.transactionIsolationName = "HikariPool-11972";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60L + "'", long20 == 60L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(properties27);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HikariPool-46032" + "'", str30, "HikariPool-46032");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test16777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16777");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-173";
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.maxLifetime = (byte) -1;
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        java.util.Properties properties16 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test16778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16778");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.catalog;
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.connectionCustomizerClassName = "hi!";
        hikariConfig0.setPoolName("HikariPool-531");
        hikariConfig0.connectionTimeout = 60;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = null;
        hikariConfig0.connectionCustomizer = iConnectionCustomizer9;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test16779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16779");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.poolName;
        hikariConfig0.setMinimumPoolSize((int) '4');
        javax.sql.DataSource dataSource4 = hikariConfig0.dataSource;
        hikariConfig0.connectionInitSql = "hi!";
        int int7 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int10 = hikariConfig0.getAcquireRetries();
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HikariPool-46037" + "'", str1, "HikariPool-46037");
        org.junit.Assert.assertNull(dataSource4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test16780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16780");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        int int10 = hikariConfig1.getAcquireIncrement();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str13 = hikariConfig12.poolName;
        hikariConfig12.setMinimumPoolSize((int) '4');
        hikariConfig12.minPoolSize = (byte) 0;
        hikariConfig1.addDataSourceProperty("HikariPool-256", (java.lang.Object) hikariConfig12);
        hikariConfig12.setJdbc4ConnectionTest(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-46039" + "'", str13, "HikariPool-46039");
    }

    @Test
    public void test16781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16781");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetries((int) 'a');
        java.lang.String str13 = hikariConfig1.catalog;
        java.lang.String str14 = hikariConfig1.getPoolName();
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-46040" + "'", str14, "HikariPool-46040");
    }

    @Test
    public void test16782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16782");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("hi!");
        java.lang.String str9 = hikariConfig1.getCatalog();
        int int10 = hikariConfig1.acquireRetries;
        hikariConfig1.setAutoCommit(true);
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.dataSourceClassName = "HikariPool-208";
        hikariConfig1.transactionIsolation = 60;
        hikariConfig1.setRegisterMbeans(true);
        long long20 = hikariConfig1.idleTimeout;
        long long21 = hikariConfig1.getConnectionTimeout();
        java.lang.String str22 = hikariConfig1.catalog;
        java.util.Properties properties24 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        int int26 = hikariConfig25.getTransactionIsolation();
        hikariConfig25.setRegisterMbeans(false);
        java.lang.String str29 = hikariConfig25.transactionIsolationName;
        int int30 = hikariConfig25.getMaximumPoolSize();
        int int31 = hikariConfig25.transactionIsolation;
        java.util.Properties properties32 = hikariConfig25.dataSourceProperties;
        boolean boolean33 = hikariConfig25.isRegisterMbeans;
        boolean boolean34 = hikariConfig25.isInitializationFailFast;
        hikariConfig25.connectionTimeout = 'a';
        java.lang.String str37 = hikariConfig25.getConnectionInitSql();
        java.lang.String str38 = hikariConfig25.getConnectionInitSql();
        java.lang.String str39 = hikariConfig25.getConnectionInitSql();
        hikariConfig1.addDataSourceProperty("HikariPool-11127", (java.lang.Object) hikariConfig25);
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 60L + "'", long20 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test16783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16783");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        java.lang.String str10 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16784");
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
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.dataSource = dataSource14;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setPoolName("HikariPool-313");
        int int20 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-46044" + "'", str11, "HikariPool-46044");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test16785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16785");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.connectionInitSql = "hi!";
        java.lang.String str6 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.poolName = "HikariPool-36";
        long long9 = hikariConfig1.getAcquireRetryDelay();
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.isAutoCommit = false;
        hikariConfig1.transactionIsolation = 32;
        hikariConfig1.poolName = "HikariPool-34651";
        hikariConfig1.dataSourceClassName = "HikariPool-29067";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test16786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16786");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        hikariConfig1.setIdleTimeout(0L);
        java.util.Properties properties9 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig10.connectionCustomizer = iConnectionCustomizer11;
        java.lang.String str13 = hikariConfig10.getConnectionTestQuery();
        long long14 = hikariConfig10.getLeakDetectionThreshold();
        int int15 = hikariConfig10.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test16787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16787");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        hikariConfig0.connectionTestQuery = "HikariPool-292";
        int int4 = hikariConfig0.acquireRetries;
        hikariConfig0.transactionIsolation = 32;
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str9 = hikariConfig0.getCatalog();
        hikariConfig0.setLeakDetectionThreshold(5000L);
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16788");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        hikariConfig1.transactionIsolation = 10;
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.String str16 = hikariConfig1.getCatalog();
        java.lang.String str17 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test16789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16789");
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
        boolean boolean11 = hikariConfig1.isRegisterMbeans;
        int int12 = hikariConfig1.acquireRetries;
        java.lang.String str13 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str14 = hikariConfig1.catalog;
        long long15 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 60L + "'", long15 == 60L);
    }

    @Test
    public void test16790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16790");
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
        java.lang.String str29 = hikariConfig1.connectionTestQuery;
        java.lang.String str30 = hikariConfig1.getCatalog();
        hikariConfig1.acquireRetries = 100;
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "HikariPool-517" + "'", str29, "HikariPool-517");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test16791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16791");
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
        int int15 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setTransactionIsolation("");
        javax.sql.DataSource dataSource18 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(dataSource18);
    }

    @Test
    public void test16792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16792");
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
        int int17 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMinimumPoolSize(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test16793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16793");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        javax.sql.DataSource dataSource8 = hikariConfig1.dataSource;
        hikariConfig1.leakDetectionThreshold = 0;
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        boolean boolean15 = hikariConfig14.isAutoCommit;
        hikariConfig14.poolName = "hi!";
        hikariConfig14.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig14.dataSource = dataSource20;
        int int22 = hikariConfig14.minPoolSize;
        int int23 = hikariConfig14.minPoolSize;
        java.lang.String str24 = hikariConfig14.dataSourceClassName;
        java.util.Properties properties25 = hikariConfig14.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties25);
        java.lang.String str27 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setLeakDetectionThreshold((long) 1);
        java.lang.String str30 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(dataSource8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test16794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16794");
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
        int int18 = hikariConfig1.transactionIsolation;
        java.util.Properties properties19 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
    }

    @Test
    public void test16795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16795");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.dataSourceClassName = "HikariPool-113";
        hikariConfig1.dataSourceClassName = "HikariPool-838";
        hikariConfig1.maxPoolSize = 35;
        hikariConfig1.setCatalog("HikariPool-753");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HikariPool-104" + "'", str9, "HikariPool-104");
    }

    @Test
    public void test16796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16796");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        int int7 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.dataSource = dataSource11;
        hikariConfig1.minPoolSize = 3;
        hikariConfig1.maxLifetime = 3L;
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        boolean boolean19 = hikariConfig18.isAutoCommit;
        hikariConfig18.poolName = "hi!";
        java.lang.String str22 = hikariConfig18.dataSourceClassName;
        java.lang.String str23 = hikariConfig18.dataSourceClassName;
        hikariConfig18.setJdbc4ConnectionTest(false);
        java.lang.String str26 = hikariConfig18.transactionIsolationName;
        hikariConfig18.setMaximumPoolSize((int) (short) 0);
        hikariConfig18.isInitializationFailFast = false;
        java.util.Properties properties31 = hikariConfig18.dataSourceProperties;
        hikariConfig1.dataSourceProperties = properties31;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties31);
    }

    @Test
    public void test16797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16797");
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
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-373";
        java.lang.String str18 = hikariConfig1.getPoolName();
        hikariConfig1.connectionTimeout = 10;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-46062" + "'", str18, "HikariPool-46062");
    }

    @Test
    public void test16798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16798");
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
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        int int18 = hikariConfig17.getTransactionIsolation();
        hikariConfig17.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig17.transactionIsolationName;
        int int22 = hikariConfig17.transactionIsolation;
        java.lang.String str23 = hikariConfig17.getConnectionInitSql();
        hikariConfig17.isAutoCommit = true;
        long long26 = hikariConfig17.getIdleTimeout();
        hikariConfig17.setAutoCommit(true);
        long long29 = hikariConfig17.maxLifetime;
        hikariConfig17.transactionIsolationName = "HikariPool-205";
        java.util.Properties properties33 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig34 = new com.zaxxer.hikari.HikariConfig(properties33);
        hikariConfig34.setConnectionInitSql("hi!");
        int int37 = hikariConfig34.getMinimumPoolSize();
        hikariConfig17.addDataSourceProperty("HikariPool-780", (java.lang.Object) int37);
        java.util.Properties properties39 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        int int41 = hikariConfig40.getTransactionIsolation();
        hikariConfig40.setRegisterMbeans(false);
        hikariConfig40.isInitializationFailFast = true;
        int int46 = hikariConfig40.acquireRetries;
        hikariConfig40.setMaxLifetime((long) (-1));
        boolean boolean49 = hikariConfig40.isInitializationFailFast();
        long long50 = hikariConfig40.maxLifetime;
        hikariConfig40.minPoolSize = (byte) -1;
        boolean boolean53 = hikariConfig40.isJdbc4connectionTest;
        java.util.Properties properties54 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties54);
        int int56 = hikariConfig55.getTransactionIsolation();
        hikariConfig55.setRegisterMbeans(false);
        java.lang.String str59 = hikariConfig55.transactionIsolationName;
        long long60 = hikariConfig55.getIdleTimeout();
        java.lang.String str61 = hikariConfig55.getCatalog();
        java.lang.String str62 = hikariConfig55.getConnectionTestQuery();
        java.util.Properties properties63 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig64 = new com.zaxxer.hikari.HikariConfig(properties63);
        hikariConfig64.dataSourceClassName = "";
        java.util.Properties properties67 = hikariConfig64.dataSourceProperties;
        hikariConfig55.setDataSourceProperties(properties67);
        hikariConfig40.setDataSourceProperties(properties67);
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties67);
        hikariConfig17.setDataSourceProperties(properties67);
        hikariConfig1.setDataSourceProperties(properties67);
        hikariConfig1.setIdleTimeout((long) 0);
        hikariConfig1.minPoolSize = 35;
        boolean boolean77 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str23);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 60L + "'", long26 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-1L) + "'", long50 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNull(str59);
// flaky:         org.junit.Assert.assertTrue("'" + long60 + "' != '" + 60L + "'", long60 == 60L);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(properties67);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test16799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16799");
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
        hikariConfig1.isJdbc4connectionTest = false;
        java.lang.String str39 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        int int42 = hikariConfig41.getTransactionIsolation();
        hikariConfig41.setRegisterMbeans(false);
        java.lang.String str45 = hikariConfig41.transactionIsolationName;
        long long46 = hikariConfig41.getIdleTimeout();
        java.lang.String str47 = hikariConfig41.getCatalog();
        java.util.Properties properties48 = hikariConfig41.getDataSourceProperties();
        hikariConfig41.setIdleTimeout((long) (short) 10);
        boolean boolean51 = hikariConfig41.isInitializationFailFast;
        java.util.Properties properties52 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties52);
        int int54 = hikariConfig53.getTransactionIsolation();
        hikariConfig53.setRegisterMbeans(false);
        java.lang.String str57 = hikariConfig53.transactionIsolationName;
        int int58 = hikariConfig53.transactionIsolation;
        java.lang.String str59 = hikariConfig53.getConnectionInitSql();
        hikariConfig53.setMaxLifetime((long) (short) 1);
        int int62 = hikariConfig53.getMinimumPoolSize();
        hikariConfig53.idleTimeout = (-1);
        java.lang.String str65 = hikariConfig53.catalog;
        java.util.Properties properties66 = hikariConfig53.dataSourceProperties;
        hikariConfig41.setDataSourceProperties(properties66);
        com.zaxxer.hikari.HikariConfig hikariConfig68 = new com.zaxxer.hikari.HikariConfig(properties66);
        hikariConfig1.setDataSourceProperties(properties66);
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
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNull(str45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 60L + "'", long46 == 60L);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(properties48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(properties66);
    }

    @Test
    public void test16800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16800");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        java.lang.String str11 = hikariConfig1.poolName;
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        hikariConfig13.dataSourceClassName = "";
        java.lang.String str19 = hikariConfig13.getCatalog();
        hikariConfig13.maxPoolSize = (short) 0;
        java.lang.String str22 = hikariConfig13.dataSourceClassName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = null;
        hikariConfig13.connectionCustomizer = iConnectionCustomizer23;
        boolean boolean25 = hikariConfig13.isJdbc4connectionTest;
        boolean boolean26 = hikariConfig13.isRegisterMbeans;
        java.util.Properties properties27 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        int int29 = hikariConfig28.getTransactionIsolation();
        hikariConfig28.setRegisterMbeans(false);
        hikariConfig28.isInitializationFailFast = true;
        java.lang.String str34 = hikariConfig28.getConnectionCustomizerClassName();
        hikariConfig28.transactionIsolationName = "";
        boolean boolean37 = hikariConfig28.isJdbc4connectionTest;
        hikariConfig28.setAcquireRetries((int) 'a');
        java.util.Properties properties40 = hikariConfig28.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        java.util.Properties properties42 = hikariConfig41.getDataSourceProperties();
        java.lang.String str43 = hikariConfig41.poolName;
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        hikariConfig45.dataSourceClassName = "";
        hikariConfig45.isRegisterMbeans = true;
        hikariConfig45.minPoolSize = (short) 1;
        hikariConfig45.isJdbc4connectionTest = false;
        long long57 = hikariConfig45.connectionTimeout;
        boolean boolean58 = hikariConfig45.isJdbc4ConnectionTest();
        int int59 = hikariConfig45.getAcquireIncrement();
        boolean boolean60 = hikariConfig45.isAutoCommit;
        java.util.Properties properties61 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties61);
        hikariConfig62.leakDetectionThreshold = 100;
        hikariConfig62.setTransactionIsolation("hi!");
        int int67 = hikariConfig62.getMaximumPoolSize();
        hikariConfig62.isInitializationFailFast = true;
        int int70 = hikariConfig62.maxPoolSize;
        java.lang.String str71 = hikariConfig62.connectionInitSql;
        int int72 = hikariConfig62.getMinimumPoolSize();
        hikariConfig62.minPoolSize = ' ';
        java.util.Properties properties75 = hikariConfig62.getDataSourceProperties();
        hikariConfig45.setDataSourceProperties(properties75);
        hikariConfig41.dataSourceProperties = properties75;
        hikariConfig13.setDataSourceProperties(properties75);
        hikariConfig1.dataSourceProperties = properties75;
        hikariConfig1.catalog = "HikariPool-25965";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-46077" + "'", str11, "HikariPool-46077");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(properties40);
        org.junit.Assert.assertNotNull(properties42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "HikariPool-46080" + "'", str43, "HikariPool-46080");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long57 + "' != '" + 10L + "'", long57 == 10L);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 60 + "'", int67 == 60);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 60 + "'", int70 == 60);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertNotNull(properties75);
    }

    @Test
    public void test16801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16801");
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
        java.lang.String str27 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        hikariConfig1.setConnectionInitSql("HikariPool-27136");
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test16802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16802");
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
        java.lang.String str21 = hikariConfig1.getConnectionTestQuery();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer22;
        boolean boolean24 = hikariConfig1.isRegisterMbeans();
        java.lang.String str25 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test16803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16803");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        int int3 = hikariConfig0.getAcquireRetries();
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        int int8 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.connectionTimeout = 32;
        java.lang.Class<?> wildcardClass11 = hikariConfig0.getClass();
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test16804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16804");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        int int7 = hikariConfig1.maxPoolSize;
        long long8 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setRegisterMbeans(false);
        int int11 = hikariConfig1.getTransactionIsolation();
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setCatalog("HikariPool-3790");
        hikariConfig1.connectionInitSql = "HikariPool-20444";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16805");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setRegisterMbeans(false);
        java.lang.String str9 = hikariConfig5.transactionIsolationName;
        java.lang.String str10 = hikariConfig5.connectionCustomizerClassName;
        hikariConfig5.setConnectionTestQuery("hi!");
        java.lang.String str13 = hikariConfig5.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig5.connectionCustomizer;
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig5);
        javax.sql.DataSource dataSource16 = hikariConfig5.getDataSource();
        int int17 = hikariConfig5.getMaximumPoolSize();
        hikariConfig5.connectionTimeout = 97L;
        java.util.Properties properties20 = hikariConfig5.getDataSourceProperties();
        hikariConfig5.catalog = "HikariPool-804";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertNotNull(properties20);
    }

    @Test
    public void test16806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16806");
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
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str16 = hikariConfig1.poolName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test16807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16807");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setRegisterMbeans(true);
        hikariConfig1.maxLifetime = (short) -1;
        hikariConfig1.setMaximumPoolSize((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16808");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        long long9 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMaxLifetime((long) 'a');
        hikariConfig1.setPoolName("HikariPool-823");
        java.lang.String str14 = hikariConfig1.getCatalog();
        hikariConfig1.isInitializationFailFast = false;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.dataSource = dataSource17;
        boolean boolean19 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16809");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        hikariConfig1.isAutoCommit = true;
        hikariConfig1.setDataSourceClassName("HikariPool-1107");
        long long16 = hikariConfig1.getConnectionTimeout();
        boolean boolean17 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.transactionIsolationName = "HikariPool-4659";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16810");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries((int) 'a');
        hikariConfig1.setConnectionTestQuery("hi!");
        java.util.Properties properties11 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        int int13 = hikariConfig12.getTransactionIsolation();
        hikariConfig12.setRegisterMbeans(false);
        hikariConfig12.isInitializationFailFast = true;
        java.lang.String str18 = hikariConfig12.getConnectionCustomizerClassName();
        hikariConfig12.transactionIsolationName = "";
        java.util.Properties properties21 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties21);
        int int23 = hikariConfig22.getTransactionIsolation();
        hikariConfig22.setRegisterMbeans(false);
        hikariConfig22.dataSourceClassName = "";
        hikariConfig22.setTransactionIsolation("");
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        int int32 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.setRegisterMbeans(false);
        hikariConfig31.isInitializationFailFast = true;
        int int37 = hikariConfig31.acquireRetries;
        hikariConfig31.setMaxLifetime((long) (-1));
        int int40 = hikariConfig31.getTransactionIsolation();
        java.util.Properties properties41 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties41);
        int int43 = hikariConfig42.getTransactionIsolation();
        hikariConfig42.setRegisterMbeans(false);
        java.lang.String str46 = hikariConfig42.transactionIsolationName;
        int int47 = hikariConfig42.getMaximumPoolSize();
        int int48 = hikariConfig42.transactionIsolation;
        java.util.Properties properties49 = hikariConfig42.dataSourceProperties;
        hikariConfig31.setDataSourceProperties(properties49);
        hikariConfig22.dataSourceProperties = properties49;
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties49);
        hikariConfig12.setDataSourceProperties(properties49);
        hikariConfig1.setDataSourceProperties(properties49);
        boolean boolean55 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str58 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60 + "'", int47 == 60);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(properties49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test16811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16811");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer26 = hikariConfig11.connectionCustomizer;
        hikariConfig11.setLeakDetectionThreshold((long) (short) 100);
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setRegisterMbeans(false);
        java.lang.String str34 = hikariConfig30.transactionIsolationName;
        long long35 = hikariConfig30.getIdleTimeout();
        java.lang.String str36 = hikariConfig30.getCatalog();
        java.util.Properties properties37 = hikariConfig30.getDataSourceProperties();
        hikariConfig30.setIdleTimeout((long) (short) 10);
        hikariConfig30.setMaximumPoolSize((int) '4');
        hikariConfig30.setMaxLifetime((long) 0);
        hikariConfig30.connectionCustomizerClassName = "HikariPool-481";
        boolean boolean46 = hikariConfig30.isInitializationFailFast();
        java.util.Properties properties47 = hikariConfig30.dataSourceProperties;
        boolean boolean48 = hikariConfig30.isAutoCommit;
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        int int51 = hikariConfig50.getTransactionIsolation();
        hikariConfig50.setRegisterMbeans(false);
        java.lang.String str54 = hikariConfig50.transactionIsolationName;
        int int55 = hikariConfig50.transactionIsolation;
        java.lang.String str56 = hikariConfig50.getConnectionInitSql();
        hikariConfig50.isAutoCommit = true;
        java.util.Properties properties59 = hikariConfig50.getDataSourceProperties();
        hikariConfig30.dataSourceProperties = properties59;
        hikariConfig11.setDataSourceProperties(properties59);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(iConnectionCustomizer26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 60L + "'", long35 == 60L);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(properties47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(properties59);
    }

    @Test
    public void test16812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16812");
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
        boolean boolean13 = hikariConfig1.isAutoCommit;
        int int14 = hikariConfig1.acquireRetries;
        boolean boolean15 = hikariConfig1.isRegisterMbeans;
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.setConnectionInitSql("hi!");
        boolean boolean20 = hikariConfig17.isInitializationFailFast;
        hikariConfig17.addDataSourceProperty("HikariPool-222", (java.lang.Object) "HikariPool-6");
        hikariConfig17.setMaxLifetime(10L);
        long long26 = hikariConfig17.connectionTimeout;
        long long27 = hikariConfig17.getAcquireRetryDelay();
        java.util.Properties properties28 = hikariConfig17.dataSourceProperties;
        java.util.Properties properties29 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties29;
        boolean boolean31 = hikariConfig1.isAutoCommit;
        java.util.Properties properties32 = hikariConfig1.getDataSourceProperties();
        java.lang.String str33 = hikariConfig1.getConnectionCustomizerClassName();
        int int34 = hikariConfig1.transactionIsolation;
        boolean boolean35 = hikariConfig1.isRegisterMbeans;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(properties32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test16813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16813");
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
        hikariConfig1.idleTimeout = '4';
        java.lang.String str16 = hikariConfig1.getDataSourceClassName();
        int int17 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(dataSource13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test16814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16814");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setAcquireRetries((int) 'a');
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        long long14 = hikariConfig1.getIdleTimeout();
        java.lang.String str15 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-46107" + "'", str15, "HikariPool-46107");
    }

    @Test
    public void test16815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16815");
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
        boolean boolean23 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setDataSourceClassName("HikariPool-451");
        java.lang.String str26 = hikariConfig1.catalog;
        hikariConfig1.isAutoCommit = true;
        java.lang.String str29 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource32 = hikariConfig1.getDataSource();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(dataSource32);
    }

    @Test
    public void test16816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16816");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        java.lang.String str7 = hikariConfig1.catalog;
        java.util.Properties properties8 = hikariConfig1.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test16817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16817");
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
        hikariConfig1.catalog = "HikariPool-870";
        boolean boolean14 = hikariConfig1.isAutoCommit;
        int int15 = hikariConfig1.transactionIsolation;
        java.lang.String str16 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolation = (short) 100;
        int int19 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str20 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16818");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.idleTimeout = (byte) -1;
        long long12 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-354");
        boolean boolean15 = hikariConfig1.isAutoCommit();
        hikariConfig1.setTransactionIsolation("HikariPool-1034");
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        boolean boolean19 = hikariConfig1.isAutoCommit;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16819");
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
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isAutoCommit;
        hikariConfig17.poolName = "hi!";
        java.lang.String str21 = hikariConfig17.dataSourceClassName;
        hikariConfig17.acquireRetries = (short) 10;
        java.util.Properties properties24 = hikariConfig17.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig1.dataSourceProperties = properties24;
        java.util.Properties properties28 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionTestQuery("HikariPool-8471");
        hikariConfig1.leakDetectionThreshold = (short) 0;
        hikariConfig1.setIdleTimeout(0L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test16820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16820");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean9 = hikariConfig1.isRegisterMbeans();
        java.lang.String str10 = hikariConfig1.getCatalog();
        hikariConfig1.setRegisterMbeans(true);
        long long13 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean15 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16821");
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
        java.util.Properties properties11 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties11);
        hikariConfig12.setMaxLifetime(87L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test16822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16822");
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
        hikariConfig1.connectionInitSql = "HikariPool-222";
        hikariConfig1.transactionIsolationName = "HikariPool-5827";
        int int70 = hikariConfig1.getTransactionIsolation();
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
    }

    @Test
    public void test16823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16823");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        java.lang.String str6 = hikariConfig1.transactionIsolationName;
        java.lang.String str7 = hikariConfig1.getConnectionTestQuery();
        long long8 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test16824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16824");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-403");
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        java.lang.String str10 = hikariConfig1.getPoolName();
        int int11 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test16825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16825");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties4 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig(properties4);
        int int6 = hikariConfig5.getTransactionIsolation();
        hikariConfig5.setRegisterMbeans(false);
        java.lang.String str9 = hikariConfig5.transactionIsolationName;
        java.lang.String str10 = hikariConfig5.connectionCustomizerClassName;
        hikariConfig5.setConnectionTestQuery("hi!");
        java.lang.String str13 = hikariConfig5.getCatalog();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = hikariConfig5.connectionCustomizer;
        hikariConfig1.addDataSourceProperty("HikariPool-222", (java.lang.Object) hikariConfig5);
        javax.sql.DataSource dataSource16 = hikariConfig5.getDataSource();
        boolean boolean17 = hikariConfig5.isJdbc4connectionTest;
        hikariConfig5.setCatalog("HikariPool-29254");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(iConnectionCustomizer14);
        org.junit.Assert.assertNull(dataSource16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16826");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        java.lang.String str9 = hikariConfig1.connectionTestQuery;
        hikariConfig1.maxPoolSize = 1;
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test16827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16827");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.setConnectionTestQuery("HikariPool-173");
        hikariConfig1.connectionTimeout = (short) 1;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test16828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16828");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        java.lang.String str8 = hikariConfig1.getPoolName();
        hikariConfig1.isAutoCommit = true;
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.isInitializationFailFast = false;
        hikariConfig1.setAcquireRetries((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test16829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16829");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str12 = hikariConfig1.getCatalog();
        hikariConfig1.leakDetectionThreshold = 60L;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16830");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 32L;
        hikariConfig1.isAutoCommit = true;
        int int7 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test16831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16831");
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
        hikariConfig1.setCatalog("HikariPool-2655");
        hikariConfig1.transactionIsolationName = "HikariPool-583";
        java.lang.String str15 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16832");
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
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.catalog = "HikariPool-9912";
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        int int32 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.setRegisterMbeans(false);
        java.lang.String str35 = hikariConfig31.transactionIsolationName;
        int int36 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.isRegisterMbeans = false;
        hikariConfig31.isRegisterMbeans = true;
        hikariConfig31.setPoolName("HikariPool-320");
        hikariConfig31.dataSourceClassName = "HikariPool-166";
        hikariConfig31.setJdbc4ConnectionTest(true);
        hikariConfig1.addDataSourceProperty("HikariPool-9669", (java.lang.Object) hikariConfig31);
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        boolean boolean51 = hikariConfig50.isAutoCommit;
        hikariConfig50.poolName = "hi!";
        java.lang.String str54 = hikariConfig50.dataSourceClassName;
        java.lang.String str55 = hikariConfig50.dataSourceClassName;
        hikariConfig50.setJdbc4ConnectionTest(false);
        int int58 = hikariConfig50.maxPoolSize;
        hikariConfig50.isRegisterMbeans = false;
        hikariConfig50.setLeakDetectionThreshold((long) 60);
        boolean boolean63 = hikariConfig50.isRegisterMbeans();
        javax.sql.DataSource dataSource64 = hikariConfig50.dataSource;
        int int65 = hikariConfig50.maxPoolSize;
        hikariConfig1.addDataSourceProperty("HikariPool-3822", (java.lang.Object) hikariConfig50);
        hikariConfig50.setConnectionCustomizerClassName("HikariPool-30685");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 60 + "'", int58 == 60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(dataSource64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 60 + "'", int65 == 60);
    }

    @Test
    public void test16833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16833");
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
        int int18 = hikariConfig1.getTransactionIsolation();
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        long long20 = hikariConfig1.connectionTimeout;
        boolean boolean21 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setMinimumPoolSize(100);
        boolean boolean24 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.setRegisterMbeans(true);
        javax.sql.DataSource dataSource27 = null;
        hikariConfig1.dataSource = dataSource27;
        hikariConfig1.catalog = "HikariPool-1273";
        java.lang.Class<?> wildcardClass31 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test16834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16834");
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
        int int18 = hikariConfig1.getTransactionIsolation();
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        int int21 = hikariConfig20.getTransactionIsolation();
        hikariConfig20.setRegisterMbeans(false);
        java.lang.String str24 = hikariConfig20.transactionIsolationName;
        long long25 = hikariConfig20.getIdleTimeout();
        java.lang.String str26 = hikariConfig20.getCatalog();
        java.util.Properties properties27 = hikariConfig20.getDataSourceProperties();
        hikariConfig20.setIdleTimeout((long) (short) 10);
        hikariConfig20.maxLifetime = (-1);
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
        com.zaxxer.hikari.HikariConfig hikariConfig82 = new com.zaxxer.hikari.HikariConfig(properties79);
        hikariConfig1.setDataSourceProperties(properties79);
        hikariConfig1.setMaxLifetime((long) 10);
        hikariConfig1.isInitializationFailFast = true;
        long long88 = hikariConfig1.idleTimeout;
        java.lang.String str89 = hikariConfig1.connectionInitSql;
        hikariConfig1.setMaximumPoolSize(1);
        int int92 = hikariConfig1.minPoolSize;
        java.lang.String str93 = hikariConfig1.getDataSourceClassName();
        boolean boolean94 = hikariConfig1.isInitializationFailFast();
        java.lang.String str95 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 60L + "'", long25 == 60L);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(properties27);
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
// flaky:         org.junit.Assert.assertTrue("'" + long88 + "' != '" + 60L + "'", long88 == 60L);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 10 + "'", int92 == 10);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test16835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16835");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.setMinimumPoolSize(87);
        hikariConfig1.dataSourceClassName = "HikariPool-752";
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        hikariConfig13.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig13.transactionIsolationName;
        int int18 = hikariConfig13.transactionIsolation;
        java.lang.String str19 = hikariConfig13.getConnectionInitSql();
        hikariConfig13.isAutoCommit = true;
        long long22 = hikariConfig13.getIdleTimeout();
        hikariConfig13.setAutoCommit(true);
        int int25 = hikariConfig13.transactionIsolation;
        boolean boolean26 = hikariConfig13.isJdbc4connectionTest;
        hikariConfig13.setConnectionTestQuery("HikariPool-306");
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        int int31 = hikariConfig30.getTransactionIsolation();
        hikariConfig30.setRegisterMbeans(false);
        java.lang.String str34 = hikariConfig30.transactionIsolationName;
        hikariConfig30.setRegisterMbeans(false);
        java.lang.String str37 = hikariConfig30.getDataSourceClassName();
        hikariConfig30.connectionCustomizerClassName = "HikariPool-105";
        int int40 = hikariConfig30.getAcquireRetries();
        long long41 = hikariConfig30.connectionTimeout;
        int int42 = hikariConfig30.maxPoolSize;
        javax.sql.DataSource dataSource43 = hikariConfig30.getDataSource();
        java.util.Properties properties44 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig(properties44);
        int int46 = hikariConfig45.getTransactionIsolation();
        hikariConfig45.setRegisterMbeans(false);
        java.lang.String str49 = hikariConfig45.transactionIsolationName;
        int int50 = hikariConfig45.transactionIsolation;
        javax.sql.DataSource dataSource51 = null;
        hikariConfig45.dataSource = dataSource51;
        boolean boolean53 = hikariConfig45.isAutoCommit();
        hikariConfig45.setMaximumPoolSize((int) '#');
        hikariConfig45.connectionInitSql = "HikariPool-260";
        boolean boolean58 = hikariConfig45.isInitializationFailFast();
        hikariConfig45.connectionCustomizerClassName = "HikariPool-730";
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str62 = hikariConfig61.poolName;
        hikariConfig61.setMinimumPoolSize((int) '4');
        hikariConfig61.minPoolSize = (byte) 0;
        long long67 = hikariConfig61.connectionTimeout;
        int int68 = hikariConfig61.minPoolSize;
        int int69 = hikariConfig61.getMaximumPoolSize();
        hikariConfig61.setDataSourceClassName("HikariPool-3106");
        java.util.Properties properties72 = hikariConfig61.getDataSourceProperties();
        hikariConfig45.dataSourceProperties = properties72;
        hikariConfig30.setDataSourceProperties(properties72);
        hikariConfig13.dataSourceProperties = properties72;
        hikariConfig1.dataSourceProperties = properties72;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(str19);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 60L + "'", long22 == 60L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 10L + "'", long41 == 10L);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 60 + "'", int42 == 60);
        org.junit.Assert.assertNull(dataSource43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str62 + "' != '" + "HikariPool-46155" + "'", str62, "HikariPool-46155");
// flaky:         org.junit.Assert.assertTrue("'" + long67 + "' != '" + 10L + "'", long67 == 10L);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 60 + "'", int69 == 60);
        org.junit.Assert.assertNotNull(properties72);
    }

    @Test
    public void test16836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16836");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16837");
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
        hikariConfig1.poolName = "HikariPool-780";
        hikariConfig1.setPoolName("HikariPool-383");
        java.lang.Class<?> wildcardClass17 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test16838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16838");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        boolean boolean8 = hikariConfig1.isInitializationFailFast();
        long long9 = hikariConfig1.getMaxLifetime();
        long long10 = hikariConfig1.connectionTimeout;
        boolean boolean11 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test16839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16839");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        int int7 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.poolName;
        hikariConfig13.setMinimumPoolSize((int) '4');
        javax.sql.DataSource dataSource17 = hikariConfig13.dataSource;
        hikariConfig1.addDataSourceProperty("HikariPool-168", (java.lang.Object) hikariConfig13);
        hikariConfig13.isInitializationFailFast = false;
        boolean boolean21 = hikariConfig13.isInitializationFailFast;
        java.util.Properties properties22 = hikariConfig13.dataSourceProperties;
        hikariConfig13.connectionInitSql = "HikariPool-1921";
        hikariConfig13.connectionTestQuery = "HikariPool-25642";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-46171" + "'", str14, "HikariPool-46171");
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test16840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16840");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.getMaximumPoolSize();
        int int9 = hikariConfig1.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig1.poolName;
        java.lang.String str11 = hikariConfig1.catalog;
        java.lang.String str12 = hikariConfig1.poolName;
        long long13 = hikariConfig1.idleTimeout;
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-46172" + "'", str10, "HikariPool-46172");
        org.junit.Assert.assertNull(str11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HikariPool-46172" + "'", str12, "HikariPool-46172");
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16841");
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
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.setDataSource(dataSource13);
        hikariConfig1.setCatalog("hi!");
        int int17 = hikariConfig1.getAcquireIncrement();
        int int18 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setIdleTimeout((long) (-1));
        long long21 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test16842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16842");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        long long7 = hikariConfig1.connectionTimeout;
        long long8 = hikariConfig1.idleTimeout;
        hikariConfig1.setConnectionTestQuery("HikariPool-204");
        hikariConfig1.isAutoCommit = true;
        boolean boolean13 = hikariConfig1.isJdbc4connectionTest;
        java.lang.String str14 = hikariConfig1.getPoolName();
        hikariConfig1.isAutoCommit = true;
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        java.lang.String str19 = hikariConfig1.getCatalog();
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.dataSource = dataSource20;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 60L + "'", long8 == 60L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16843");
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
        int int32 = hikariConfig31.maxPoolSize;
        hikariConfig31.connectionCustomizerClassName = "HikariPool-461";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer35 = hikariConfig31.connectionCustomizer;
        hikariConfig31.isAutoCommit = false;
        hikariConfig31.setMaxLifetime((long) '#');
        hikariConfig31.setConnectionCustomizerClassName("HikariPool-1549");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 60 + "'", int32 == 60);
        org.junit.Assert.assertNull(iConnectionCustomizer35);
    }

    @Test
    public void test16844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16844");
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
        hikariConfig1.poolName = "HikariPool-84";
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        java.lang.String str15 = hikariConfig1.catalog;
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test16845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16845");
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
        long long19 = hikariConfig1.getConnectionTimeout();
        int int20 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setConnectionInitSql("HikariPool-430");
        int int23 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test16846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16846");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        int int10 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.maxLifetime = 32L;
        java.util.Properties properties13 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setJdbc4ConnectionTest(true);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig17.setDataSourceClassName("");
        hikariConfig17.validate();
        long long21 = hikariConfig17.getLeakDetectionThreshold();
        hikariConfig17.setIdleTimeout((long) '4');
        java.lang.String str24 = hikariConfig17.connectionCustomizerClassName;
        java.util.Properties properties25 = hikariConfig17.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.isAutoCommit = true;
        hikariConfig1.addDataSourceProperty("HikariPool-84", (java.lang.Object) hikariConfig26);
        javax.sql.DataSource dataSource30 = null;
        hikariConfig26.setDataSource(dataSource30);
        java.lang.String str32 = hikariConfig26.getCatalog();
        hikariConfig26.setAutoCommit(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test16847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16847");
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
        hikariConfig31.setRegisterMbeans(true);
        hikariConfig31.connectionInitSql = "HikariPool-696";
        hikariConfig31.setRegisterMbeans(true);
        int int41 = hikariConfig31.getMinimumPoolSize();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test16848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16848");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str8 = hikariConfig1.poolName;
        int int9 = hikariConfig1.minPoolSize;
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.connectionTimeout = 100;
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HikariPool-46188" + "'", str8, "HikariPool-46188");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test16849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16849");
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
        long long32 = hikariConfig31.connectionTimeout;
        hikariConfig31.setUseInstrumentation(false);
        hikariConfig31.maxPoolSize = (short) 10;
        javax.sql.DataSource dataSource37 = hikariConfig31.dataSource;
        long long38 = hikariConfig31.connectionTimeout;
        boolean boolean39 = hikariConfig31.isRegisterMbeans;
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
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNull(dataSource37);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + 10L + "'", long38 == 10L);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test16850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16850");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        java.util.Properties properties9 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getAcquireRetries();
        hikariConfig10.setCatalog("HikariPool-1099");
        hikariConfig10.transactionIsolationName = "HikariPool-10142";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test16851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16851");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionInitSql("HikariPool-780");
        hikariConfig1.maxLifetime = 10;
        int int12 = hikariConfig1.acquireRetries;
        boolean boolean13 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setPoolName("HikariPool-1283");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test16852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16852");
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
        int int16 = hikariConfig1.acquireRetries;
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setUseInstrumentation(false);
        java.lang.String str21 = hikariConfig1.catalog;
        java.util.Properties properties22 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setAutoCommit(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties22);
    }

    @Test
    public void test16853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16853");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        boolean boolean10 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.setDataSourceClassName("HikariPool-168");
        hikariConfig1.isAutoCommit = true;
        long long15 = hikariConfig1.connectionTimeout;
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        hikariConfig1.maxPoolSize = 10;
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        hikariConfig1.maxPoolSize = 32;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16854");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        java.lang.String str6 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setConnectionTestQuery("hi!");
        java.lang.String str9 = hikariConfig1.getCatalog();
        int int10 = hikariConfig1.acquireRetries;
        hikariConfig1.setAutoCommit(true);
        int int13 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.connectionTestQuery = "HikariPool-1125";
        hikariConfig1.setAutoCommit(true);
        long long18 = hikariConfig1.connectionTimeout;
        hikariConfig1.setMinimumPoolSize((int) ' ');
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.setDataSource(dataSource21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test16855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16855");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1777");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1777 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16856");
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
        java.lang.String str13 = hikariConfig1.connectionInitSql;
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        long long15 = hikariConfig1.leakDetectionThreshold;
        long long16 = hikariConfig1.maxLifetime;
        java.lang.String str17 = hikariConfig1.getConnectionCustomizerClassName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16857");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.setConnectionInitSql("HikariPool-292");
        boolean boolean10 = hikariConfig1.isRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer11 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer11;
        hikariConfig1.dataSourceClassName = "HikariPool-5732";
        int int15 = hikariConfig1.getAcquireIncrement();
        java.util.Properties properties17 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int19 = hikariConfig18.getTransactionIsolation();
        hikariConfig18.setRegisterMbeans(false);
        java.lang.String str22 = hikariConfig18.transactionIsolationName;
        int int23 = hikariConfig18.getMaximumPoolSize();
        int int24 = hikariConfig18.transactionIsolation;
        java.util.Properties properties25 = hikariConfig18.dataSourceProperties;
        boolean boolean26 = hikariConfig18.isRegisterMbeans;
        boolean boolean27 = hikariConfig18.isInitializationFailFast;
        hikariConfig18.isRegisterMbeans = false;
        hikariConfig18.setIdleTimeout(1L);
        java.lang.String str32 = hikariConfig18.getConnectionCustomizerClassName();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer33 = null;
        hikariConfig18.connectionCustomizer = iConnectionCustomizer33;
        hikariConfig18.setPoolName("HikariPool-964");
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) hikariConfig18);
        java.lang.String str38 = hikariConfig1.getDataSourceClassName();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 60 + "'", int23 == 60);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(properties25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HikariPool-5732" + "'", str38, "HikariPool-5732");
    }

    @Test
    public void test16858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16858");
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
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.connectionCustomizerClassName = "";
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        hikariConfig1.setIdleTimeout((long) 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16859");
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
        hikariConfig1.dataSourceClassName = "";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer58 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer58;
        java.util.Properties properties61 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig62 = new com.zaxxer.hikari.HikariConfig(properties61);
        long long63 = hikariConfig62.getIdleTimeout();
        long long64 = hikariConfig62.maxLifetime;
        long long65 = hikariConfig62.getConnectionTimeout();
        long long66 = hikariConfig62.maxLifetime;
        javax.sql.DataSource dataSource67 = null;
        hikariConfig62.setDataSource(dataSource67);
        long long69 = hikariConfig62.idleTimeout;
        java.util.Properties properties70 = hikariConfig62.dataSourceProperties;
        hikariConfig1.addDataSourceProperty("HikariPool-29597", (java.lang.Object) properties70);
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
// flaky:         org.junit.Assert.assertTrue("'" + long63 + "' != '" + 60L + "'", long63 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long64 + "' != '" + 35L + "'", long64 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long65 + "' != '" + 10L + "'", long65 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long66 + "' != '" + 35L + "'", long66 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long69 + "' != '" + 60L + "'", long69 == 60L);
        org.junit.Assert.assertNotNull(properties70);
    }

    @Test
    public void test16860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16860");
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
        hikariConfig1.connectionInitSql = "hi!";
        hikariConfig1.setCatalog("HikariPool-521");
        hikariConfig1.poolName = "HikariPool-454";
        int int19 = hikariConfig1.transactionIsolation;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test16861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16861");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setTransactionIsolation("HikariPool-370");
        hikariConfig1.dataSourceClassName = "HikariPool-1162";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test16862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16862");
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
        hikariConfig1.idleTimeout = 52L;
        long long20 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionTimeout = 0L;
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-43947");
        java.util.Properties properties25 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-306" + "'", str17, "HikariPool-306");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertNotNull(properties25);
    }

    @Test
    public void test16863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16863");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        hikariConfig1.setConnectionInitSql("HikariPool-114");
        hikariConfig1.idleTimeout = 32L;
        boolean boolean10 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.poolName = "HikariPool-407";
        long long13 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setCatalog("HikariPool-730");
        hikariConfig1.setTransactionIsolation("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test16864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16864");
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
        long long18 = hikariConfig1.maxLifetime;
        hikariConfig1.acquireRetries = (short) 100;
        hikariConfig1.isRegisterMbeans = false;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer23 = hikariConfig1.connectionCustomizer;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setConnectionTimeout((long) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertNull(iConnectionCustomizer23);
    }

    @Test
    public void test16865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16865");
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
        java.lang.String str31 = hikariConfig1.catalog;
        long long32 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean33 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-28259";
        int int36 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test16866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16866");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        hikariConfig1.transactionIsolation = (byte) 1;
        int int11 = hikariConfig1.getAcquireIncrement();
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setInitializationFailFast(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16867");
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
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig1.connectionCustomizer;
        java.lang.String str20 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setDataSourceClassName("");
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setRegisterMbeans(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16868");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer6 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer6;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test16869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16869");
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
        java.lang.String str17 = hikariConfig1.catalog;
        hikariConfig1.transactionIsolationName = "HikariPool-208";
        long long20 = hikariConfig1.connectionTimeout;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-21039";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test16870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16870");
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
        long long17 = hikariConfig1.getAcquireRetryDelay();
        long long18 = hikariConfig1.connectionTimeout;
        int int19 = hikariConfig1.transactionIsolation;
        int int20 = hikariConfig1.transactionIsolation;
        int int21 = hikariConfig1.maxPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test16871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16871");
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
        java.lang.String str17 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16872");
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
        int int16 = hikariConfig1.acquireRetries;
        hikariConfig1.setAutoCommit(true);
        long long19 = hikariConfig1.getAcquireRetryDelay();
        boolean boolean20 = hikariConfig1.isRegisterMbeans();
        boolean boolean21 = hikariConfig1.isInitializationFailFast();
        boolean boolean22 = hikariConfig1.isAutoCommit;
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test16873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16873");
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
        javax.sql.DataSource dataSource14 = null;
        hikariConfig1.dataSource = dataSource14;
        hikariConfig1.setUseInstrumentation(false);
        long long18 = hikariConfig1.connectionTimeout;
        int int19 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-46228" + "'", str11, "HikariPool-46228");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test16874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16874");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        long long2 = hikariConfig1.getIdleTimeout();
        int int3 = hikariConfig1.acquireRetries;
        long long4 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.minPoolSize = (byte) 10;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
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
        int int30 = hikariConfig10.getTransactionIsolation();
        java.util.Properties properties31 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties31);
        int int33 = hikariConfig32.getTransactionIsolation();
        hikariConfig32.setRegisterMbeans(false);
        java.lang.String str36 = hikariConfig32.transactionIsolationName;
        int int37 = hikariConfig32.getTransactionIsolation();
        hikariConfig32.isRegisterMbeans = false;
        boolean boolean40 = hikariConfig32.isRegisterMbeans();
        java.lang.String str41 = hikariConfig32.getCatalog();
        hikariConfig32.transactionIsolation = 100;
        java.util.Properties properties44 = hikariConfig32.dataSourceProperties;
        hikariConfig10.setDataSourceProperties(properties44);
        hikariConfig1.dataSourceProperties = properties44;
        long long47 = hikariConfig1.leakDetectionThreshold;
        javax.sql.DataSource dataSource48 = hikariConfig1.dataSource;
        com.zaxxer.hikari.HikariConfig hikariConfig49 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig49.setDataSourceClassName("");
        int int52 = hikariConfig49.getMaximumPoolSize();
        hikariConfig49.setRegisterMbeans(false);
        hikariConfig49.connectionCustomizerClassName = "HikariPool-252";
        int int57 = hikariConfig49.getMinimumPoolSize();
        long long58 = hikariConfig49.connectionTimeout;
        java.util.Properties properties59 = hikariConfig49.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties59);
// flaky:         org.junit.Assert.assertTrue("'" + long2 + "' != '" + 60L + "'", long2 == 60L);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 60 + "'", int26 == 60);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(properties28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(properties44);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNull(dataSource48);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 60 + "'", int52 == 60);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long58 + "' != '" + 10L + "'", long58 == 10L);
        org.junit.Assert.assertNotNull(properties59);
    }

    @Test
    public void test16875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16875");
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
        hikariConfig31.dataSourceClassName = "HikariPool-308";
        boolean boolean37 = hikariConfig31.isAutoCommit();
        int int38 = hikariConfig31.transactionIsolation;
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test16876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16876");
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
        hikariConfig1.setDataSourceClassName("HikariPool-472");
        hikariConfig1.setMaximumPoolSize(0);
        java.lang.String str20 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.connectionTestQuery = "HikariPool-32741";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-46239" + "'", str11, "HikariPool-46239");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HikariPool-472" + "'", str20, "HikariPool-472");
    }

    @Test
    public void test16877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16877");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-46247" + "'", str15, "HikariPool-46247");
        org.junit.Assert.assertNull(iConnectionCustomizer18);
    }

    @Test
    public void test16878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16878");
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
        hikariConfig1.dataSourceClassName = "HikariPool-113";
        java.lang.String str19 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16879");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        boolean boolean4 = hikariConfig1.isRegisterMbeans();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer5 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer5;
        hikariConfig1.isRegisterMbeans = true;
        long long9 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test16880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16880");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        java.lang.String str4 = hikariConfig1.getConnectionInitSql();
        int int5 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test16881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16881");
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
        hikariConfig1.transactionIsolation = 'a';
        java.lang.String str15 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-320" + "'", str15, "HikariPool-320");
    }

    @Test
    public void test16882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16882");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        int int9 = hikariConfig1.getAcquireIncrement();
        long long10 = hikariConfig1.getConnectionTimeout();
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.setDataSourceClassName("HikariPool-35914");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement((int) (short) -1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16883");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setTransactionIsolation("hi!");
        hikariConfig1.setAcquireRetries(87);
        long long9 = hikariConfig1.getMaxLifetime();
        hikariConfig1.catalog = "HikariPool-403";
        hikariConfig1.transactionIsolation = (short) 0;
        hikariConfig1.minPoolSize = 97;
        hikariConfig1.setCatalog("HikariPool-5335");
        hikariConfig1.setPoolName("HikariPool-33885");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test16884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16884");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test16885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16885");
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
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties28);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties28);
        hikariConfig33.setMaxLifetime((long) 35);
        hikariConfig33.setPoolName("HikariPool-220");
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
    }

    @Test
    public void test16886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16886");
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
        int int14 = hikariConfig1.getTransactionIsolation();
        int int15 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-46261" + "'", str13, "HikariPool-46261");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test16887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16887");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        java.util.Properties properties4 = hikariConfig1.dataSourceProperties;
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.dataSourceClassName;
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.dataSource = dataSource8;
        org.junit.Assert.assertNotNull(properties4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test16888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16888");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.validate();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setRegisterMbeans(false);
        long long7 = hikariConfig0.connectionTimeout;
        hikariConfig0.connectionTimeout = (short) -1;
        java.lang.String str10 = hikariConfig0.connectionInitSql;
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-27615");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16889");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.transactionIsolationName;
        hikariConfig1.acquireRetries = 3;
        hikariConfig1.isInitializationFailFast = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test16890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16890");
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
        boolean boolean14 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setAcquireRetries(60);
        long long17 = hikariConfig1.getLeakDetectionThreshold();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay(1800000L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test16891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16891");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        long long9 = hikariConfig1.maxLifetime;
        hikariConfig1.setTransactionIsolation("HikariPool-1005");
        hikariConfig1.isAutoCommit = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test16892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16892");
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
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.setTransactionIsolation("HikariPool-9973");
        java.lang.String str16 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16893");
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
        java.util.Properties properties19 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.idleTimeout = 60L;
        hikariConfig20.addDataSourceProperty("HikariPool-2991", (java.lang.Object) "HikariPool-756");
        java.lang.String str26 = hikariConfig20.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties17);
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test16894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16894");
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
        javax.sql.DataSource dataSource13 = null;
        hikariConfig1.dataSource = dataSource13;
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        long long16 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionInitSql("HikariPool-7237");
        hikariConfig1.setDataSourceClassName("HikariPool-95");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test16895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16895");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.poolName = "HikariPool-215";
        java.lang.String str9 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource10 = hikariConfig1.getDataSource();
        java.lang.String str11 = hikariConfig1.catalog;
        java.util.Properties properties12 = hikariConfig1.dataSourceProperties;
        long long13 = hikariConfig1.getMaxLifetime();
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        hikariConfig1.acquireRetries = (short) 10;
        hikariConfig1.setAcquireRetries((int) (byte) 1);
        long long19 = hikariConfig1.getIdleTimeout();
        java.lang.String str20 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(properties12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNull(str14);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test16896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16896");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        long long4 = hikariConfig1.getIdleTimeout();
        java.lang.String str5 = hikariConfig1.connectionInitSql;
        int int6 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setTransactionIsolation("HikariPool-843");
        long long9 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 60L + "'", long4 == 60L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test16897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16897");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        java.lang.String str6 = hikariConfig1.getPoolName();
        hikariConfig1.setMaximumPoolSize((int) (byte) 10);
        hikariConfig1.setConnectionInitSql("HikariPool-1485");
        hikariConfig1.isJdbc4connectionTest = false;
        java.util.Properties properties13 = hikariConfig1.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-46276" + "'", str6, "HikariPool-46276");
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test16898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16898");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        java.lang.String str6 = hikariConfig1.getPoolName();
        java.lang.String str7 = hikariConfig1.poolName;
        int int8 = hikariConfig1.getTransactionIsolation();
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        java.lang.String str10 = hikariConfig1.getConnectionCustomizerClassName();
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HikariPool-46279" + "'", str6, "HikariPool-46279");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-46279" + "'", str7, "HikariPool-46279");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16899");
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
        java.lang.String str19 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.maxLifetime = (byte) 100;
        int int22 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setDataSourceClassName("HikariPool-302");
        long long25 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 60 + "'", int22 == 60);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 100L + "'", long25 == 100L);
    }

    @Test
    public void test16900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16900");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        hikariConfig1.isJdbc4connectionTest = true;
        java.lang.String str12 = hikariConfig1.getCatalog();
        int int13 = hikariConfig1.minPoolSize;
        java.lang.String str14 = hikariConfig1.connectionCustomizerClassName;
        java.lang.Class<?> wildcardClass15 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test16901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16901");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-173";
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test16902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16902");
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
        long long16 = hikariConfig1.getMaxLifetime();
        hikariConfig1.setAcquireRetries(0);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer19 = hikariConfig1.connectionCustomizer;
        hikariConfig1.catalog = "HikariPool-893";
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.poolName = "HikariPool-495";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNull(iConnectionCustomizer19);
    }

    @Test
    public void test16903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16903");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setIdleTimeout((long) (short) 100);
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        int int11 = hikariConfig1.getMinimumPoolSize();
        long long12 = hikariConfig1.idleTimeout;
        hikariConfig1.setAutoCommit(false);
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.minPoolSize = (-1);
        hikariConfig1.leakDetectionThreshold = 5000L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test16904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16904");
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
        hikariConfig1.maxPoolSize = 87;
        hikariConfig1.setConnectionTimeout(1800000L);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16905");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        boolean boolean6 = hikariConfig1.isAutoCommit;
        long long7 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setCatalog("HikariPool-29993");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test16906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16906");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = hikariConfig0.dataSource;
        long long2 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.transactionIsolation = (byte) 0;
        hikariConfig0.transactionIsolation = (byte) 10;
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setTransactionIsolation("HikariPool-649");
        java.lang.String str10 = hikariConfig0.getPoolName();
        java.lang.String str11 = hikariConfig0.getDataSourceClassName();
        long long12 = hikariConfig0.leakDetectionThreshold;
        org.junit.Assert.assertNull(dataSource1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HikariPool-46302" + "'", str10, "HikariPool-46302");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test16907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16907");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setConnectionCustomizerClassName("");
        javax.sql.DataSource dataSource11 = hikariConfig1.getDataSource();
        boolean boolean12 = hikariConfig1.isAutoCommit();
        java.lang.String str13 = hikariConfig1.catalog;
        long long14 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.dataSourceClassName = "HikariPool-199";
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(dataSource11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test16908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16908");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        java.lang.String str8 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str11 = hikariConfig1.connectionTestQuery;
        hikariConfig1.maxPoolSize = (short) 100;
        hikariConfig1.setMaxLifetime((long) 1);
        java.lang.String str16 = hikariConfig1.connectionTestQuery;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test16909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16909");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setIdleTimeout(52L);
        boolean boolean12 = hikariConfig1.isAutoCommit;
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setInitializationFailFast(true);
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-25890");
        java.lang.String str22 = hikariConfig1.transactionIsolationName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test16910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16910");
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
        int int28 = hikariConfig1.minPoolSize;
        int int29 = hikariConfig1.minPoolSize;
        long long30 = hikariConfig1.connectionTimeout;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
    }

    @Test
    public void test16911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16911");
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
        java.lang.String str11 = hikariConfig1.connectionCustomizerClassName;
        int int12 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str15 = hikariConfig1.poolName;
        hikariConfig1.minPoolSize = 52;
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.connectionTimeout = (short) 10;
        hikariConfig1.connectionCustomizerClassName = "HikariPool-17003";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(iConnectionCustomizer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-46308" + "'", str15, "HikariPool-46308");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test16912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16912");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.minPoolSize = (short) 1;
        hikariConfig1.isJdbc4connectionTest = false;
        long long13 = hikariConfig1.connectionTimeout;
        long long14 = hikariConfig1.getMaxLifetime();
        boolean boolean15 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setTransactionIsolation("HikariPool-2479");
        hikariConfig1.connectionTimeout = 3L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test16913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16913");
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
        javax.sql.DataSource dataSource33 = null;
        hikariConfig1.dataSource = dataSource33;
        java.lang.String str35 = hikariConfig1.connectionTestQuery;
        boolean boolean36 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 60 + "'", int25 == 60);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 60 + "'", int30 == 60);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HikariPool-104" + "'", str35, "HikariPool-104");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test16914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16914");
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
        long long19 = hikariConfig1.idleTimeout;
        hikariConfig1.dataSourceClassName = "";
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-306" + "'", str17, "HikariPool-306");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
    }

    @Test
    public void test16915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16915");
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
        hikariConfig1.setAcquireRetries((int) (short) 1);
        int int15 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setMinimumPoolSize(35);
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        hikariConfig20.leakDetectionThreshold = 100;
        hikariConfig20.minPoolSize = (byte) 1;
        hikariConfig20.catalog = "";
        java.util.Properties properties27 = hikariConfig20.getDataSourceProperties();
        hikariConfig20.setConnectionInitSql("HikariPool-265");
        hikariConfig20.setAutoCommit(true);
        hikariConfig1.addDataSourceProperty("HikariPool-3155", (java.lang.Object) hikariConfig20);
        int int33 = hikariConfig20.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(properties27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 60 + "'", int33 == 60);
    }

    @Test
    public void test16916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16916");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        int int7 = hikariConfig1.transactionIsolation;
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setMaximumPoolSize((int) (byte) 0);
        int int12 = hikariConfig1.getMinimumPoolSize();
        long long13 = hikariConfig1.idleTimeout;
        hikariConfig1.connectionInitSql = "HikariPool-596";
        hikariConfig1.setUseInstrumentation(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
    }

    @Test
    public void test16917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16917");
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
        hikariConfig1.isAutoCommit = true;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) (short) 1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test16918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16918");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setConnectionInitSql("hi!");
        hikariConfig1.minPoolSize = (short) 0;
        javax.sql.DataSource dataSource6 = hikariConfig1.getDataSource();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = hikariConfig1.connectionCustomizer;
        hikariConfig1.isAutoCommit = false;
        long long10 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setMaximumPoolSize((int) (short) 0);
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        hikariConfig1.poolName = "HikariPool-36118";
        org.junit.Assert.assertNull(dataSource6);
        org.junit.Assert.assertNull(iConnectionCustomizer7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16919");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer13 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer13;
        hikariConfig1.connectionInitSql = "HikariPool-732";
        java.lang.String str17 = hikariConfig1.connectionCustomizerClassName;
        int int18 = hikariConfig1.getAcquireIncrement();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test16920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16920");
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
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer18 = null;
        hikariConfig16.connectionCustomizer = iConnectionCustomizer18;
        hikariConfig16.idleTimeout = (short) 100;
        java.util.Properties properties22 = hikariConfig16.dataSourceProperties;
        hikariConfig16.setUseInstrumentation(false);
        long long25 = hikariConfig16.maxLifetime;
        hikariConfig16.dataSourceClassName = "HikariPool-1157";
        hikariConfig16.setLeakDetectionThreshold(2147483647L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties22);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 35L + "'", long25 == 35L);
    }

    @Test
    public void test16921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16921");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setRegisterMbeans(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        boolean boolean12 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.catalog = "HikariPool-29";
        int int15 = hikariConfig1.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer16 = hikariConfig1.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer16);
    }

    @Test
    public void test16922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16922");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.isRegisterMbeans = true;
        boolean boolean9 = hikariConfig1.isJdbc4ConnectionTest();
        int int10 = hikariConfig1.maxPoolSize;
        hikariConfig1.isAutoCommit = false;
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer14 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer14;
        hikariConfig1.setConnectionInitSql("HikariPool-20968");
        boolean boolean18 = hikariConfig1.isAutoCommit;
        boolean boolean19 = hikariConfig1.isRegisterMbeans();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60 + "'", int10 == 60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test16923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16923");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.transactionIsolationName = "";
        hikariConfig1.setConnectionInitSql("HikariPool-756");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1610");
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int14 = hikariConfig13.getTransactionIsolation();
        java.lang.String str15 = hikariConfig13.getDataSourceClassName();
        hikariConfig1.addDataSourceProperty("HikariPool-1020", (java.lang.Object) hikariConfig13);
        java.lang.String str17 = hikariConfig13.getCatalog();
        hikariConfig13.isJdbc4connectionTest = false;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16924");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setMinimumPoolSize(1);
        int int7 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.poolName;
        hikariConfig13.setMinimumPoolSize((int) '4');
        javax.sql.DataSource dataSource17 = hikariConfig13.dataSource;
        hikariConfig1.addDataSourceProperty("HikariPool-168", (java.lang.Object) hikariConfig13);
        hikariConfig13.isInitializationFailFast = false;
        boolean boolean21 = hikariConfig13.isInitializationFailFast;
        java.util.Properties properties22 = hikariConfig13.dataSourceProperties;
        long long23 = hikariConfig13.getConnectionTimeout();
        boolean boolean24 = hikariConfig13.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-46336" + "'", str14, "HikariPool-46336");
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(properties22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test16925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16925");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setLeakDetectionThreshold(1800000L);
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        long long11 = hikariConfig1.getMaxLifetime();
        int int12 = hikariConfig1.getTransactionIsolation();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test16926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16926");
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
        hikariConfig1.setIdleTimeout((long) (byte) -1);
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        hikariConfig1.setCatalog("HikariPool-28862");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16927");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-105");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-105 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16928");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        boolean boolean3 = hikariConfig1.isJdbc4ConnectionTest();
        hikariConfig1.idleTimeout = (byte) 1;
        hikariConfig1.isJdbc4connectionTest = true;
        hikariConfig1.setDataSourceClassName("HikariPool-173");
        hikariConfig1.setIdleTimeout((long) (-1));
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isAutoCommit;
        hikariConfig13.poolName = "hi!";
        java.lang.String str17 = hikariConfig13.dataSourceClassName;
        java.lang.String str18 = hikariConfig13.dataSourceClassName;
        hikariConfig13.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer21 = hikariConfig13.connectionCustomizer;
        hikariConfig13.setInitializationFailFast(true);
        int int24 = hikariConfig13.transactionIsolation;
        java.util.Properties properties25 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties25);
        hikariConfig26.dataSourceClassName = "";
        java.util.Properties properties29 = hikariConfig26.dataSourceProperties;
        hikariConfig13.setDataSourceProperties(properties29);
        hikariConfig1.setDataSourceProperties(properties29);
        int int32 = hikariConfig1.acquireRetries;
        hikariConfig1.transactionIsolationName = "HikariPool-10119";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(iConnectionCustomizer21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test16929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16929");
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
        hikariConfig1.setConnectionTestQuery("HikariPool-477");
        java.lang.String str17 = hikariConfig1.getConnectionTestQuery();
        java.lang.String str18 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isAutoCommit = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertNull(dataSource12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HikariPool-477" + "'", str17, "HikariPool-477");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HikariPool-477" + "'", str18, "HikariPool-477");
    }

    @Test
    public void test16930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16930");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setConnectionTimeout((long) (short) 0);
        java.util.Properties properties5 = hikariConfig1.getDataSourceProperties();
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.setAutoCommit(true);
        hikariConfig1.setMaxLifetime(35L);
        hikariConfig1.isJdbc4connectionTest = false;
        long long14 = hikariConfig1.idleTimeout;
        hikariConfig1.catalog = "HikariPool-1526";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(properties5);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
    }

    @Test
    public void test16931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16931");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.connectionTestQuery = "";
        java.lang.String str5 = hikariConfig1.connectionCustomizerClassName;
        int int6 = hikariConfig1.getAcquireIncrement();
        java.lang.String str7 = hikariConfig1.getPoolName();
        hikariConfig1.dataSourceClassName = "HikariPool-247";
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        hikariConfig1.connectionTimeout = 60L;
        boolean boolean14 = hikariConfig1.isAutoCommit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HikariPool-46346" + "'", str7, "HikariPool-46346");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test16932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16932");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        javax.sql.DataSource dataSource7 = null;
        hikariConfig1.dataSource = dataSource7;
        java.lang.String str9 = hikariConfig1.getConnectionTestQuery();
        java.util.Properties properties10 = hikariConfig1.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay(0L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test16933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16933");
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
        java.lang.String str17 = hikariConfig1.catalog;
        hikariConfig1.transactionIsolationName = "HikariPool-208";
        long long20 = hikariConfig1.maxLifetime;
        hikariConfig1.leakDetectionThreshold = 10;
        hikariConfig1.minPoolSize = ' ';
        int int25 = hikariConfig1.minPoolSize;
        java.lang.String str26 = hikariConfig1.connectionInitSql;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test16934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16934");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        java.lang.String str3 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setIdleTimeout((long) 87);
        hikariConfig1.setConnectionInitSql("HikariPool-114");
        int int8 = hikariConfig1.getAcquireIncrement();
        long long9 = hikariConfig1.getIdleTimeout();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 87L + "'", long9 == 87L);
    }

    @Test
    public void test16935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16935");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        java.util.Properties properties8 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        int int10 = hikariConfig9.getTransactionIsolation();
        hikariConfig9.setRegisterMbeans(false);
        java.lang.String str13 = hikariConfig9.transactionIsolationName;
        long long14 = hikariConfig9.getIdleTimeout();
        java.lang.String str15 = hikariConfig9.getCatalog();
        java.util.Properties properties16 = hikariConfig9.getDataSourceProperties();
        hikariConfig9.setIdleTimeout((long) (short) 10);
        hikariConfig9.maxLifetime = (-1);
        hikariConfig9.setInitializationFailFast(false);
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        java.lang.String str28 = hikariConfig24.transactionIsolationName;
        int int29 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.isRegisterMbeans = false;
        boolean boolean32 = hikariConfig24.isRegisterMbeans();
        long long33 = hikariConfig24.connectionTimeout;
        hikariConfig24.setJdbc4ConnectionTest(true);
        javax.sql.DataSource dataSource36 = hikariConfig24.getDataSource();
        long long37 = hikariConfig24.getIdleTimeout();
        int int38 = hikariConfig24.transactionIsolation;
        hikariConfig24.isAutoCommit = true;
        hikariConfig24.setConnectionCustomizerClassName("HikariPool-670");
        hikariConfig24.maxPoolSize = (short) 1;
        java.util.Properties properties45 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig46 = new com.zaxxer.hikari.HikariConfig(properties45);
        hikariConfig46.leakDetectionThreshold = 100;
        boolean boolean49 = hikariConfig46.isJdbc4connectionTest;
        long long50 = hikariConfig46.getIdleTimeout();
        hikariConfig46.setUseInstrumentation(false);
        hikariConfig46.setJdbc4ConnectionTest(false);
        java.util.Properties properties55 = hikariConfig46.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig24.setDataSourceProperties(properties55);
        hikariConfig9.dataSourceProperties = properties55;
        hikariConfig1.dataSourceProperties = properties55;
        boolean boolean60 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 10L + "'", long33 == 10L);
        org.junit.Assert.assertNull(dataSource36);
// flaky:         org.junit.Assert.assertTrue("'" + long37 + "' != '" + 60L + "'", long37 == 60L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 60L + "'", long50 == 60L);
        org.junit.Assert.assertNotNull(properties55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test16936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16936");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        hikariConfig1.setJdbc4ConnectionTest(true);
        hikariConfig1.isAutoCommit = false;
        javax.sql.DataSource dataSource9 = hikariConfig1.dataSource;
        hikariConfig1.dataSourceClassName = "HikariPool-834";
        java.util.Properties properties13 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties13);
        int int15 = hikariConfig14.getTransactionIsolation();
        long long16 = hikariConfig14.getMaxLifetime();
        long long17 = hikariConfig14.leakDetectionThreshold;
        hikariConfig14.maxPoolSize = '4';
        hikariConfig14.connectionInitSql = "HikariPool-33";
        int int22 = hikariConfig14.acquireRetries;
        java.lang.String str23 = hikariConfig14.getPoolName();
        hikariConfig1.addDataSourceProperty("HikariPool-1465", (java.lang.Object) hikariConfig14);
        hikariConfig1.setConnectionInitSql("HikariPool-69");
        hikariConfig1.setConnectionInitSql("HikariPool-19501");
        hikariConfig1.setRegisterMbeans(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(dataSource9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HikariPool-46356" + "'", str23, "HikariPool-46356");
    }

    @Test
    public void test16937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16937");
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
        hikariConfig1.setAutoCommit(true);
        javax.sql.DataSource dataSource21 = null;
        hikariConfig1.setDataSource(dataSource21);
        int int23 = hikariConfig1.transactionIsolation;
        java.util.Properties properties24 = hikariConfig1.dataSourceProperties;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test16938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16938");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.getMaximumPoolSize();
        long long7 = hikariConfig1.getIdleTimeout();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-173";
        java.util.Properties properties10 = hikariConfig1.dataSourceProperties;
        hikariConfig1.maxLifetime = (byte) -1;
        int int13 = hikariConfig1.getMaximumPoolSize();
        int int14 = hikariConfig1.minPoolSize;
        hikariConfig1.catalog = "HikariPool-21780";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 60L + "'", long7 == 60L);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test16939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16939");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.acquireRetries = (byte) -1;
        hikariConfig1.setLeakDetectionThreshold((long) (short) 1);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        int int9 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.setJdbc4ConnectionTest(false);
        java.lang.String str12 = hikariConfig1.dataSourceClassName;
        hikariConfig1.isRegisterMbeans = true;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int17 = hikariConfig1.getMaximumPoolSize();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
    }

    @Test
    public void test16940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16940");
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
        int int64 = hikariConfig1.minPoolSize;
        java.lang.String str65 = hikariConfig1.dataSourceClassName;
        boolean boolean66 = hikariConfig1.isJdbc4ConnectionTest();
        int int67 = hikariConfig1.getAcquireIncrement();
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
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    public void test16941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16941");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.connectionTestQuery;
        long long6 = hikariConfig1.getIdleTimeout();
        boolean boolean7 = hikariConfig1.isInitializationFailFast;
        boolean boolean8 = hikariConfig1.isAutoCommit;
        hikariConfig1.catalog = "HikariPool-1815";
        java.lang.String str11 = hikariConfig1.catalog;
        hikariConfig1.setRegisterMbeans(true);
        long long14 = hikariConfig1.getAcquireRetryDelay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-1815" + "'", str11, "HikariPool-1815");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test16942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16942");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        java.lang.String str9 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) 10);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test16943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16943");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        javax.sql.DataSource dataSource11 = null;
        hikariConfig1.setDataSource(dataSource11);
        java.lang.String str13 = hikariConfig1.connectionTestQuery;
        hikariConfig1.isInitializationFailFast = true;
        java.lang.Class<?> wildcardClass16 = hikariConfig1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HikariPool-104" + "'", str13, "HikariPool-104");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test16944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16944");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.isRegisterMbeans = true;
        long long14 = hikariConfig1.getMaxLifetime();
        long long15 = hikariConfig1.maxLifetime;
        java.lang.String str16 = hikariConfig1.getPoolName();
        hikariConfig1.setCatalog("HikariPool-376");
        long long19 = hikariConfig1.connectionTimeout;
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str22 = hikariConfig1.connectionCustomizerClassName;
        int int23 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-46371" + "'", str11, "HikariPool-46371");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HikariPool-46371" + "'", str16, "HikariPool-46371");
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test16945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16945");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        java.lang.String str7 = hikariConfig1.getCatalog();
        long long8 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setCatalog("");
        hikariConfig1.idleTimeout = 60;
        long long13 = hikariConfig1.idleTimeout;
        int int14 = hikariConfig1.transactionIsolation;
        hikariConfig1.connectionTimeout = 32;
        long long17 = hikariConfig1.getMaxLifetime();
        java.lang.String str18 = hikariConfig1.getDataSourceClassName();
        java.lang.String str19 = hikariConfig1.connectionCustomizerClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16946");
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
        hikariConfig31.setConnectionTestQuery("");
        hikariConfig31.transactionIsolationName = "HikariPool-37433";
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
    }

    @Test
    public void test16947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16947");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.connectionTimeout;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        int int10 = hikariConfig1.getAcquireRetries();
        hikariConfig1.connectionCustomizerClassName = "HikariPool-8886";
        java.lang.String str13 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setMinimumPoolSize(60);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16948");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str9 = hikariConfig1.getConnectionInitSql();
        long long10 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str11 = hikariConfig1.poolName;
        hikariConfig1.maxPoolSize = (byte) 1;
        java.util.Properties properties15 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        int int17 = hikariConfig16.getTransactionIsolation();
        java.lang.String str18 = hikariConfig16.getConnectionTestQuery();
        hikariConfig16.setIdleTimeout((long) 87);
        hikariConfig1.addDataSourceProperty("HikariPool-29378", (java.lang.Object) hikariConfig16);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer22 = hikariConfig16.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-46380" + "'", str11, "HikariPool-46380");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(iConnectionCustomizer22);
    }

    @Test
    public void test16949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16949");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.setTransactionIsolation("");
        long long9 = hikariConfig1.getLeakDetectionThreshold();
        boolean boolean10 = hikariConfig1.isRegisterMbeans;
        hikariConfig1.acquireRetries = (short) 0;
        hikariConfig1.maxLifetime = 60;
        javax.sql.DataSource dataSource15 = hikariConfig1.dataSource;
        java.lang.String str16 = hikariConfig1.getCatalog();
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        long long18 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test16950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16950");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        int int5 = hikariConfig1.acquireRetries;
        java.lang.String str6 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionTestQuery("HikariPool-38936");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test16951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16951");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        int int6 = hikariConfig1.transactionIsolation;
        java.lang.String str7 = hikariConfig1.getConnectionInitSql();
        int int8 = hikariConfig1.transactionIsolation;
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.setMinimumPoolSize(0);
        long long12 = hikariConfig1.getAcquireRetryDelay();
        int int13 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test16952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16952");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setTransactionIsolation("hi!");
        int int6 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.maxLifetime = (short) 1;
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        boolean boolean12 = hikariConfig11.isAutoCommit;
        hikariConfig11.poolName = "hi!";
        java.lang.String str15 = hikariConfig11.dataSourceClassName;
        java.lang.String str16 = hikariConfig11.dataSourceClassName;
        hikariConfig11.setJdbc4ConnectionTest(false);
        int int19 = hikariConfig11.maxPoolSize;
        hikariConfig11.setIdleTimeout(52L);
        int int22 = hikariConfig11.transactionIsolation;
        hikariConfig1.addDataSourceProperty("HikariPool-1159", (java.lang.Object) int22);
        long long24 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setCatalog("HikariPool-37010");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 60 + "'", int19 == 60);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 10L + "'", long24 == 10L);
    }

    @Test
    public void test16953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16953");
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
        java.lang.String str14 = hikariConfig1.getConnectionCustomizerClassName();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig1.dataSource = dataSource15;
        java.lang.String str17 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setLeakDetectionThreshold(0L);
        hikariConfig1.isAutoCommit = false;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay(10L);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(dataSource10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16954");
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
        java.util.Properties properties19 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties19);
        boolean boolean21 = hikariConfig20.isAutoCommit;
        hikariConfig20.poolName = "hi!";
        hikariConfig20.setMinimumPoolSize(1);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig20.dataSource = dataSource26;
        int int28 = hikariConfig20.minPoolSize;
        int int29 = hikariConfig20.minPoolSize;
        java.lang.String str30 = hikariConfig20.dataSourceClassName;
        java.util.Properties properties31 = hikariConfig20.getDataSourceProperties();
        long long32 = hikariConfig20.getConnectionTimeout();
        int int33 = hikariConfig20.minPoolSize;
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) int33);
        int int35 = hikariConfig1.maxPoolSize;
        javax.sql.DataSource dataSource36 = null;
        hikariConfig1.dataSource = dataSource36;
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.leakDetectionThreshold = '#';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-470" + "'", str14, "HikariPool-470");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-470" + "'", str15, "HikariPool-470");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(properties31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
    }

    @Test
    public void test16955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16955");
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
        hikariConfig1.connectionInitSql = "HikariPool-306";
        hikariConfig1.setCatalog("");
        int int25 = hikariConfig1.minPoolSize;
        java.lang.String str26 = hikariConfig1.connectionTestQuery;
        javax.sql.DataSource dataSource27 = hikariConfig1.getDataSource();
        long long28 = hikariConfig1.getIdleTimeout();
        java.util.Properties properties30 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties30);
        int int32 = hikariConfig31.getTransactionIsolation();
        hikariConfig31.setRegisterMbeans(false);
        java.lang.String str35 = hikariConfig31.transactionIsolationName;
        int int36 = hikariConfig31.getMaximumPoolSize();
        int int37 = hikariConfig31.transactionIsolation;
        java.util.Properties properties38 = hikariConfig31.dataSourceProperties;
        hikariConfig31.isJdbc4connectionTest = false;
        boolean boolean41 = hikariConfig31.isInitializationFailFast;
        java.util.Properties properties42 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig43 = new com.zaxxer.hikari.HikariConfig(properties42);
        boolean boolean44 = hikariConfig43.isAutoCommit;
        hikariConfig43.poolName = "hi!";
        java.lang.String str47 = hikariConfig43.dataSourceClassName;
        java.lang.String str48 = hikariConfig43.dataSourceClassName;
        hikariConfig43.setJdbc4ConnectionTest(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer51 = hikariConfig43.connectionCustomizer;
        hikariConfig43.setInitializationFailFast(true);
        int int54 = hikariConfig43.transactionIsolation;
        java.util.Properties properties55 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig56 = new com.zaxxer.hikari.HikariConfig(properties55);
        hikariConfig56.dataSourceClassName = "";
        java.util.Properties properties59 = hikariConfig56.dataSourceProperties;
        hikariConfig43.setDataSourceProperties(properties59);
        com.zaxxer.hikari.HikariConfig hikariConfig61 = new com.zaxxer.hikari.HikariConfig(properties59);
        hikariConfig31.dataSourceProperties = properties59;
        int int63 = hikariConfig31.transactionIsolation;
        hikariConfig1.addDataSourceProperty("HikariPool-15367", (java.lang.Object) int63);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(dataSource27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 60L + "'", long28 == 60L);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 60 + "'", int36 == 60);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(iConnectionCustomizer51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(properties59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
    }

    @Test
    public void test16956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16956");
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
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
        javax.sql.DataSource dataSource22 = null;
        hikariConfig1.dataSource = dataSource22;
        hikariConfig1.setUseInstrumentation(true);
        long long26 = hikariConfig1.getMaxLifetime();
        hikariConfig1.isJdbc4connectionTest = false;
        hikariConfig1.setMinimumPoolSize((int) '#');
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
    }

    @Test
    public void test16957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16957");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-29");
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer8 = hikariConfig1.connectionCustomizer;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer9 = hikariConfig1.connectionCustomizer;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        hikariConfig1.setMinimumPoolSize((int) (short) 0);
        hikariConfig1.setMaxLifetime((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireIncrement(1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
    }

    @Test
    public void test16958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16958");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-2269");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-2269 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16959");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.minPoolSize = (byte) 1;
        hikariConfig1.catalog = "";
        boolean boolean8 = hikariConfig1.isRegisterMbeans;
        java.lang.String str9 = hikariConfig1.transactionIsolationName;
        boolean boolean10 = hikariConfig1.isRegisterMbeans;
        boolean boolean11 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setConnectionInitSql("HikariPool-763");
        hikariConfig1.setInitializationFailFast(false);
        java.lang.String str16 = hikariConfig1.catalog;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test16960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16960");
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
        hikariConfig1.isRegisterMbeans = false;
        hikariConfig1.setIdleTimeout(1L);
        java.lang.String str15 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMaxLifetime((long) (byte) 10);
        boolean boolean18 = hikariConfig1.isAutoCommit();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str21 = hikariConfig1.getCatalog();
        hikariConfig1.connectionTimeout = (-1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test16961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16961");
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
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2303");
        long long18 = hikariConfig1.idleTimeout;
        hikariConfig1.setInitializationFailFast(false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
    }

    @Test
    public void test16962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16962");
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
        long long18 = hikariConfig1.idleTimeout;
        boolean boolean19 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.connectionInitSql = "HikariPool-20436";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 60L + "'", long18 == 60L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16963");
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
        hikariConfig1.acquireRetries = 0;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test16964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16964");
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
        hikariConfig1.transactionIsolation = 'a';
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        java.lang.String str18 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test16965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16965");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        hikariConfig1.acquireRetries = (short) 10;
        java.util.Properties properties8 = hikariConfig1.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties8);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties8);
        long long11 = hikariConfig10.idleTimeout;
        int int12 = hikariConfig10.maxPoolSize;
        long long13 = hikariConfig10.getIdleTimeout();
        hikariConfig10.setAcquireRetries(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(properties8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 60L + "'", long13 == 60L);
    }

    @Test
    public void test16966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16966");
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
        hikariConfig1.connectionInitSql = "HikariPool-28";
        hikariConfig1.leakDetectionThreshold = (short) 0;
        boolean boolean17 = hikariConfig1.isRegisterMbeans();
        long long18 = hikariConfig1.maxLifetime;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test16967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16967");
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
        hikariConfig1.minPoolSize = (short) 100;
        hikariConfig1.connectionTimeout = (short) 0;
        hikariConfig1.transactionIsolationName = "HikariPool-101";
        hikariConfig1.setConnectionTimeout(5000L);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-2782");
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
    public void test16968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16968");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        boolean boolean7 = hikariConfig1.isRegisterMbeans();
        javax.sql.DataSource dataSource8 = null;
        hikariConfig1.setDataSource(dataSource8);
        java.lang.String str10 = hikariConfig1.dataSourceClassName;
        hikariConfig1.leakDetectionThreshold = 87;
        hikariConfig1.maxLifetime = '#';
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test16969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16969");
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
        hikariConfig1.setLeakDetectionThreshold(3L);
        java.lang.String str15 = hikariConfig1.getConnectionTestQuery();
        boolean boolean16 = hikariConfig1.isAutoCommit();
        hikariConfig1.setPoolName("HikariPool-19303");
        java.lang.String str19 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HikariPool-19303" + "'", str19, "HikariPool-19303");
    }

    @Test
    public void test16970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16970");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig1.transactionIsolationName;
        long long6 = hikariConfig1.getIdleTimeout();
        hikariConfig1.poolName = "HikariPool-215";
        java.util.Properties properties9 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig(properties9);
        int int11 = hikariConfig10.getTransactionIsolation();
        hikariConfig10.setRegisterMbeans(false);
        java.lang.String str14 = hikariConfig10.transactionIsolationName;
        hikariConfig10.setRegisterMbeans(false);
        java.lang.String str17 = hikariConfig10.getDataSourceClassName();
        hikariConfig10.transactionIsolation = (short) 1;
        long long20 = hikariConfig10.getConnectionTimeout();
        hikariConfig10.setInitializationFailFast(true);
        hikariConfig10.transactionIsolationName = "HikariPool-205";
        javax.sql.DataSource dataSource25 = hikariConfig10.dataSource;
        hikariConfig10.setDataSourceClassName("HikariPool-1050");
        java.util.Properties properties28 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties28);
        int int30 = hikariConfig29.getTransactionIsolation();
        hikariConfig29.setRegisterMbeans(false);
        java.lang.String str33 = hikariConfig29.transactionIsolationName;
        int int34 = hikariConfig29.transactionIsolation;
        javax.sql.DataSource dataSource35 = null;
        hikariConfig29.dataSource = dataSource35;
        java.lang.String str37 = hikariConfig29.getConnectionTestQuery();
        java.util.Properties properties38 = hikariConfig29.getDataSourceProperties();
        hikariConfig10.dataSourceProperties = properties38;
        hikariConfig1.dataSourceProperties = properties38;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties38);
        com.zaxxer.hikari.HikariConfig hikariConfig42 = new com.zaxxer.hikari.HikariConfig(properties38);
        java.util.Properties properties43 = hikariConfig42.getDataSourceProperties();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 60L + "'", long6 == 60L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNull(dataSource25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(properties38);
        org.junit.Assert.assertNotNull(properties43);
    }

    @Test
    public void test16971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16971");
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
        boolean boolean22 = hikariConfig1.isInitializationFailFast;
        boolean boolean23 = hikariConfig1.isJdbc4connectionTest;
        int int24 = hikariConfig1.minPoolSize;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(properties19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test16972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16972");
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
        javax.sql.DataSource dataSource16 = hikariConfig1.dataSource;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setAcquireRetryDelay((long) 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(properties8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HikariPool-46435" + "'", str14, "HikariPool-46435");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(dataSource16);
    }

    @Test
    public void test16973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16973");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        hikariConfig1.maxPoolSize = (short) 100;
        java.lang.String str11 = hikariConfig1.getPoolName();
        hikariConfig1.isRegisterMbeans = true;
        long long14 = hikariConfig1.getMaxLifetime();
        java.lang.String str15 = hikariConfig1.poolName;
        javax.sql.DataSource dataSource16 = null;
        hikariConfig1.setDataSource(dataSource16);
        boolean boolean18 = hikariConfig1.isInitializationFailFast;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HikariPool-46436" + "'", str11, "HikariPool-46436");
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HikariPool-46436" + "'", str15, "HikariPool-46436");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16974");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        int int3 = hikariConfig1.getAcquireIncrement();
        int int4 = hikariConfig1.getAcquireIncrement();
        hikariConfig1.leakDetectionThreshold = '#';
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer7 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer7;
        int int9 = hikariConfig1.getAcquireRetries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test16975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16975");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        java.lang.String str7 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.transactionIsolationName = "";
        boolean boolean10 = hikariConfig1.isJdbc4connectionTest;
        long long11 = hikariConfig1.connectionTimeout;
        java.lang.String str12 = hikariConfig1.connectionInitSql;
        hikariConfig1.maxLifetime = 35L;
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        long long16 = hikariConfig1.getIdleTimeout();
        int int17 = hikariConfig1.acquireRetries;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test16976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16976");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        boolean boolean4 = hikariConfig1.isJdbc4connectionTest;
        long long5 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setUseInstrumentation(false);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-334");
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setJdbc4ConnectionTest(false);
        hikariConfig1.setPoolName("HikariPool-1435");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 60L + "'", long5 == 60L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test16977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16977");
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
        long long17 = hikariConfig1.getAcquireRetryDelay();
        int int18 = hikariConfig1.minPoolSize;
        java.lang.String str19 = hikariConfig1.getConnectionInitSql();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16978");
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
        int int18 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setInitializationFailFast(true);
        int int21 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str22 = hikariConfig1.connectionTestQuery;
        java.util.Properties properties23 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        int int25 = hikariConfig24.getTransactionIsolation();
        hikariConfig24.setRegisterMbeans(false);
        java.lang.String str28 = hikariConfig24.transactionIsolationName;
        int int29 = hikariConfig24.transactionIsolation;
        javax.sql.DataSource dataSource30 = null;
        hikariConfig24.dataSource = dataSource30;
        java.lang.String str32 = hikariConfig24.transactionIsolationName;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer33 = hikariConfig24.connectionCustomizer;
        boolean boolean34 = hikariConfig24.isAutoCommit;
        hikariConfig24.setCatalog("HikariPool-1049");
        java.util.Properties properties37 = hikariConfig24.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties37);
        java.util.Properties properties40 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig41 = new com.zaxxer.hikari.HikariConfig(properties40);
        hikariConfig41.leakDetectionThreshold = 100;
        hikariConfig41.minPoolSize = (byte) 1;
        hikariConfig41.setRegisterMbeans(false);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer48 = hikariConfig41.connectionCustomizer;
        java.util.Properties properties49 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig50 = new com.zaxxer.hikari.HikariConfig(properties49);
        int int51 = hikariConfig50.getTransactionIsolation();
        hikariConfig50.setRegisterMbeans(false);
        hikariConfig50.dataSourceClassName = "";
        hikariConfig50.setTransactionIsolation("");
        java.util.Properties properties58 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig59 = new com.zaxxer.hikari.HikariConfig(properties58);
        int int60 = hikariConfig59.getTransactionIsolation();
        hikariConfig59.setRegisterMbeans(false);
        hikariConfig59.isInitializationFailFast = true;
        int int65 = hikariConfig59.acquireRetries;
        hikariConfig59.setMaxLifetime((long) (-1));
        int int68 = hikariConfig59.getTransactionIsolation();
        java.util.Properties properties69 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig70 = new com.zaxxer.hikari.HikariConfig(properties69);
        int int71 = hikariConfig70.getTransactionIsolation();
        hikariConfig70.setRegisterMbeans(false);
        java.lang.String str74 = hikariConfig70.transactionIsolationName;
        int int75 = hikariConfig70.getMaximumPoolSize();
        int int76 = hikariConfig70.transactionIsolation;
        java.util.Properties properties77 = hikariConfig70.dataSourceProperties;
        hikariConfig59.setDataSourceProperties(properties77);
        hikariConfig50.dataSourceProperties = properties77;
        com.zaxxer.hikari.HikariConfig hikariConfig80 = new com.zaxxer.hikari.HikariConfig(properties77);
        hikariConfig41.dataSourceProperties = properties77;
        boolean boolean82 = hikariConfig41.isInitializationFailFast();
        boolean boolean83 = hikariConfig41.isInitializationFailFast;
        long long84 = hikariConfig41.leakDetectionThreshold;
        java.lang.String str85 = hikariConfig41.getConnectionInitSql();
        javax.sql.DataSource dataSource86 = null;
        hikariConfig41.dataSource = dataSource86;
        hikariConfig41.acquireRetries = 0;
        hikariConfig1.addDataSourceProperty("HikariPool-232", (java.lang.Object) hikariConfig41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 60L + "'", long14 == 60L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 60 + "'", int21 == 60);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(iConnectionCustomizer33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(properties37);
        org.junit.Assert.assertNull(iConnectionCustomizer48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 3 + "'", int65 == 3);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 60 + "'", int75 == 60);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertNotNull(properties77);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + long84 + "' != '" + 100L + "'", long84 == 100L);
        org.junit.Assert.assertNull(str85);
    }

    @Test
    public void test16979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16979");
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
        javax.sql.DataSource dataSource14 = hikariConfig1.dataSource;
        int int15 = hikariConfig1.getMinimumPoolSize();
        long long16 = hikariConfig1.leakDetectionThreshold;
        int int17 = hikariConfig1.getTransactionIsolation();
        java.lang.String str18 = hikariConfig1.connectionInitSql;
        java.lang.String str19 = hikariConfig1.getDataSourceClassName();
        hikariConfig1.setLeakDetectionThreshold((long) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNull(str12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertNull(dataSource14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test16980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16980");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        java.lang.String str4 = hikariConfig1.connectionTestQuery;
        hikariConfig1.setMaximumPoolSize(87);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-670");
        hikariConfig1.isJdbc4connectionTest = false;
        long long11 = hikariConfig1.getLeakDetectionThreshold();
        hikariConfig1.setConnectionInitSql("HikariPool-12887");
        boolean boolean14 = hikariConfig1.isJdbc4connectionTest;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test16981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16981");
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
        java.lang.String str14 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.idleTimeout = 0L;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test16982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16982");
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
        hikariConfig1.setCatalog("HikariPool-252");
        boolean boolean16 = hikariConfig1.isInitializationFailFast;
        java.lang.String str17 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(str7);
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 60L + "'", long10 == 60L);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16983");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.maxPoolSize = 0;
        javax.sql.DataSource dataSource10 = null;
        hikariConfig1.dataSource = dataSource10;
        hikariConfig1.setMaxLifetime((long) ' ');
        java.lang.String str14 = hikariConfig1.connectionInitSql;
        javax.sql.DataSource dataSource15 = hikariConfig1.getDataSource();
        int int16 = hikariConfig1.transactionIsolation;
        int int17 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig1.setDataSource(dataSource20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test16984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16984");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.leakDetectionThreshold = 100;
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setConnectionTestQuery("");
        hikariConfig1.maxPoolSize = 0;
        hikariConfig1.setConnectionTestQuery("HikariPool-105");
        java.util.Properties properties12 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        boolean boolean14 = hikariConfig13.isAutoCommit;
        int int15 = hikariConfig13.getAcquireIncrement();
        java.util.Properties properties16 = hikariConfig13.dataSourceProperties;
        hikariConfig1.setDataSourceProperties(properties16);
        java.util.Properties properties18 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        boolean boolean20 = hikariConfig19.isAutoCommit;
        hikariConfig19.poolName = "hi!";
        java.lang.String str23 = hikariConfig19.dataSourceClassName;
        hikariConfig19.acquireRetries = (short) 10;
        java.util.Properties properties26 = hikariConfig19.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig27 = new com.zaxxer.hikari.HikariConfig(properties26);
        hikariConfig1.setDataSourceProperties(properties26);
        int int29 = hikariConfig1.getMinimumPoolSize();
        hikariConfig1.setMinimumPoolSize((int) (byte) 1);
        hikariConfig1.isJdbc4connectionTest = false;
        int int34 = hikariConfig1.getTransactionIsolation();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(properties16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(properties26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
    }

    @Test
    public void test16985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16985");
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
        int int44 = hikariConfig1.getTransactionIsolation();
        long long45 = hikariConfig1.getIdleTimeout();
        hikariConfig1.setConnectionInitSql("HikariPool-726");
        int int48 = hikariConfig1.getTransactionIsolation();
        long long49 = hikariConfig1.getLeakDetectionThreshold();
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 60L + "'", long45 == 60L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 100L + "'", long49 == 100L);
    }

    @Test
    public void test16986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16986");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        boolean boolean8 = hikariConfig1.isJdbc4connectionTest;
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.minPoolSize = (short) 0;
        int int12 = hikariConfig1.getMaximumPoolSize();
        java.lang.String str13 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setMaxLifetime((long) 100);
        int int16 = hikariConfig1.maxPoolSize;
        boolean boolean17 = hikariConfig1.isJdbc4connectionTest;
        hikariConfig1.isInitializationFailFast = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test16987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16987");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.dataSourceClassName = "";
        hikariConfig1.connectionTimeout = 10L;
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        int int8 = hikariConfig1.transactionIsolation;
        hikariConfig1.setAutoCommit(false);
        int int11 = hikariConfig1.getMaximumPoolSize();
        hikariConfig1.setConnectionInitSql("HikariPool-6");
        hikariConfig1.setAcquireRetries(10);
        int int16 = hikariConfig1.getAcquireRetries();
        javax.sql.DataSource dataSource17 = hikariConfig1.getDataSource();
        boolean boolean18 = hikariConfig1.isRegisterMbeans();
        hikariConfig1.connectionTestQuery = "HikariPool-16101";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNull(dataSource17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16988");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setUseInstrumentation(true);
        hikariConfig1.connectionTestQuery = "HikariPool-104";
        boolean boolean9 = hikariConfig1.isJdbc4connectionTest;
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer10 = null;
        hikariConfig1.connectionCustomizer = iConnectionCustomizer10;
        boolean boolean12 = hikariConfig1.isJdbc4ConnectionTest();
        long long13 = hikariConfig1.getConnectionTimeout();
        hikariConfig1.setAcquireRetries((int) (byte) 100);
        hikariConfig1.maxLifetime = 35;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test16989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16989");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        boolean boolean2 = hikariConfig1.isAutoCommit;
        hikariConfig1.poolName = "hi!";
        java.lang.String str5 = hikariConfig1.dataSourceClassName;
        java.lang.String str6 = hikariConfig1.dataSourceClassName;
        hikariConfig1.setJdbc4ConnectionTest(false);
        int int9 = hikariConfig1.maxPoolSize;
        hikariConfig1.isRegisterMbeans = false;
        boolean boolean12 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.setDataSourceClassName("HikariPool-68");
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        hikariConfig17.leakDetectionThreshold = 100;
        hikariConfig17.minPoolSize = (byte) 1;
        hikariConfig17.catalog = "";
        boolean boolean24 = hikariConfig17.isRegisterMbeans;
        java.lang.String str25 = hikariConfig17.transactionIsolationName;
        hikariConfig17.isJdbc4connectionTest = true;
        java.util.Properties properties29 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties29);
        hikariConfig30.leakDetectionThreshold = 100;
        hikariConfig30.setTransactionIsolation("hi!");
        int int35 = hikariConfig30.getMaximumPoolSize();
        hikariConfig30.setRegisterMbeans(false);
        hikariConfig17.addDataSourceProperty("HikariPool-112", (java.lang.Object) hikariConfig30);
        hikariConfig1.addDataSourceProperty("HikariPool-2359", (java.lang.Object) "HikariPool-112");
        hikariConfig1.setMaxLifetime((long) (byte) -1);
        hikariConfig1.connectionTimeout = '#';
        long long44 = hikariConfig1.idleTimeout;
        javax.sql.DataSource dataSource45 = hikariConfig1.getDataSource();
        long long46 = hikariConfig1.getConnectionTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 60 + "'", int35 == 60);
// flaky:         org.junit.Assert.assertTrue("'" + long44 + "' != '" + 60L + "'", long44 == 60L);
        org.junit.Assert.assertNull(dataSource45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 35L + "'", long46 == 35L);
    }

    @Test
    public void test16990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16990");
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
        java.lang.String str14 = hikariConfig1.catalog;
        boolean boolean15 = hikariConfig1.isAutoCommit;
        java.lang.String str16 = hikariConfig1.getPoolName();
        long long17 = hikariConfig1.leakDetectionThreshold;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test16991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16991");
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
        hikariConfig31.dataSourceClassName = "HikariPool-43";
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig31.setAcquireIncrement((int) (byte) 10);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test16992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16992");
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
        java.lang.String str24 = hikariConfig1.transactionIsolationName;
        java.lang.String str25 = hikariConfig1.getPoolName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 60L + "'", long11 == 60L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HikariPool-46481" + "'", str25, "HikariPool-46481");
    }

    @Test
    public void test16993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16993");
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
        int int41 = hikariConfig31.acquireRetries;
        java.lang.String str42 = hikariConfig31.connectionInitSql;
        hikariConfig31.setConnectionCustomizerClassName("HikariPool-29815");
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test16994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16994");
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
        java.lang.String str12 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setInitializationFailFast(true);
        boolean boolean15 = hikariConfig1.isAutoCommit;
        long long16 = hikariConfig1.connectionTimeout;
        hikariConfig1.dataSourceClassName = "HikariPool-12365";
        long long19 = hikariConfig1.getIdleTimeout();
        hikariConfig1.maxPoolSize = '4';
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 60L + "'", long19 == 60L);
    }

    @Test
    public void test16995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16995");
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
        hikariConfig1.setInitializationFailFast(false);
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isAutoCommit;
        hikariConfig17.poolName = "hi!";
        hikariConfig17.setTransactionIsolation("hi!");
        long long23 = hikariConfig17.connectionTimeout;
        long long24 = hikariConfig17.idleTimeout;
        hikariConfig17.setConnectionTestQuery("HikariPool-204");
        int int27 = hikariConfig17.getAcquireIncrement();
        hikariConfig17.setJdbc4ConnectionTest(true);
        java.util.Properties properties30 = hikariConfig17.getDataSourceProperties();
        hikariConfig1.dataSourceProperties = properties30;
        com.zaxxer.hikari.HikariConfig hikariConfig32 = new com.zaxxer.hikari.HikariConfig(properties30);
        hikariConfig32.idleTimeout = 1;
        int int35 = hikariConfig32.transactionIsolation;
        long long36 = hikariConfig32.getAcquireRetryDelay();
        int int37 = hikariConfig32.getTransactionIsolation();
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer38 = hikariConfig32.connectionCustomizer;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(iConnectionCustomizer9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 60L + "'", long24 == 60L);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(properties30);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(iConnectionCustomizer38);
    }

    @Test
    public void test16996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16996");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.dataSourceClassName = "";
        java.lang.String str7 = hikariConfig1.getCatalog();
        hikariConfig1.maxPoolSize = (short) 0;
        java.lang.String str10 = hikariConfig1.getConnectionInitSql();
        hikariConfig1.setUseInstrumentation(true);
        boolean boolean13 = hikariConfig1.isJdbc4ConnectionTest();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test16997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16997");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        int int2 = hikariConfig1.getTransactionIsolation();
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.isInitializationFailFast = true;
        int int7 = hikariConfig1.acquireRetries;
        hikariConfig1.setMaxLifetime((long) (-1));
        boolean boolean10 = hikariConfig1.isInitializationFailFast();
        hikariConfig1.isInitializationFailFast = true;
        hikariConfig1.setConnectionTestQuery("HikariPool-838");
        hikariConfig1.setConnectionTestQuery("HikariPool-12545");
        java.lang.String str17 = hikariConfig1.getCatalog();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test16998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16998");
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
        java.util.Properties properties16 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties16);
        boolean boolean18 = hikariConfig17.isAutoCommit;
        hikariConfig17.poolName = "hi!";
        java.lang.String str21 = hikariConfig17.dataSourceClassName;
        hikariConfig17.acquireRetries = (short) 10;
        java.util.Properties properties24 = hikariConfig17.dataSourceProperties;
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        com.zaxxer.hikari.HikariConfig hikariConfig26 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig1.dataSourceProperties = properties24;
        java.util.Properties properties28 = hikariConfig1.dataSourceProperties;
        hikariConfig1.setConnectionTestQuery("HikariPool-8471");
        hikariConfig1.leakDetectionThreshold = (short) 0;
        hikariConfig1.setMinimumPoolSize(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60 + "'", int9 == 60);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(dataSource15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test16999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16999");
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
        java.lang.String str27 = hikariConfig1.getConnectionCustomizerClassName();
        hikariConfig1.setMinimumPoolSize((int) (short) 100);
        com.zaxxer.hikari.IConnectionCustomizer iConnectionCustomizer30 = hikariConfig1.connectionCustomizer;
        hikariConfig1.transactionIsolation = 32;
        hikariConfig1.setMaxLifetime((long) 1);
        org.junit.Assert.assertNull(iConnectionCustomizer8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 60 + "'", int16 == 60);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(iConnectionCustomizer30);
    }

    @Test
    public void test17000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test17000");
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
        boolean boolean15 = hikariConfig1.isRegisterMbeans();
        long long16 = hikariConfig1.idleTimeout;
        hikariConfig1.catalog = "HikariPool-59";
        hikariConfig1.setConnectionInitSql("HikariPool-696");
        long long21 = hikariConfig1.leakDetectionThreshold;
        hikariConfig1.maxPoolSize = 3;
        java.lang.String str24 = hikariConfig1.dataSourceClassName;
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(properties13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 60L + "'", long16 == 60L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNull(str24);
    }
}
